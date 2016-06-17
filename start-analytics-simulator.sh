#!/bin/bash

# URLs used for Analytics. Change these to suit your environment
MACHINE_AGENT_ANALYTICS_URL="http://localhost:9091/ping"
EVENTS_SERVICE_URL="http://localhost:9080/_ping"

# Change these agent options to suit your environment
AGENT_OPTIONS=""
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.controller.hostName=localhost"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.controller.port=8090"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.accountName=customer1"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.accountAccessKey=0d486055-bed8-423b-b958-54ac88324226"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.applicationName=ReservationSystemPROD"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.tierName=WebFrontEnd"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.nodeName=AnalyticsNode"
AGENT_OPTIONS="$AGENT_OPTIONS -javaagent:/home/ubuntu/AppDynamics/javaagent/javaagent.jar"



##############################################################################
#
# No need to edit below this line
#
##############################################################################

check_process_running()
{
    local process=$1

    TEST=`ps -ef | grep $process | grep -v grep`
    if [ "$TEST" ]
    then
       echo "$process is running"
    else
       echo "$process NOT running"
       exit 1
    fi
}

check_events_service()
{
    local url=$1
    local expectedContent="HTTP/1.1 200 OK"

    curl -s --head $url | head -n 1 | grep "$expectedContent" > /dev/null
    if [ $? -gt 0 ] ; then
        echo "Error contacting $url"
        exit 1
    else
        # if the keyword is in the conent
        echo "Events Service at $url is accessible"
    fi
}

compile() {
    # Clean up the previous compile
    rm -rf out/
    mkdir out/
    javac -d out/ src/com/appdynamics/se/analytics/AnalyticsSimulator.java
    echo "Java compile complete"
}

start() {
    # echo out the start time... just because
    echo "Started the Analytics Simulator at "`date +%Y-%m-%d:%H:%M:%S`

    java -classpath out:conf $AGENT_OPTIONS com.appdynamics.se.analytics.AnalyticsSimulator
}

# Check for running Machine agnet
check_process_running "machineagent.jar"

# Check for running Analytics agent embedded into Machine Agent at localhost:9091/ping --> pong
check_events_service $MACHINE_AGENT_ANALYTICS_URL

# Check for running and accessible events service
check_events_service $EVENTS_SERVICE_URL

# Compile the Java
compile

start

#!/bin/bash
set -e

# URLs used for Analytics. Change these to suit your environment
MACHINE_AGENT_ANALYTICS_URL="http://localhost:9091/ping"
EVENTS_SERVICE_URL="http://localhost:9080/_ping"

# Change these agent options to suit your environment
AGENT_OPTIONS=""
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.controller.hostName=localhost"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.controller.port=8090"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.accountName=customer1"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.accountAccessKey=019e8b3f-8159-47d2-b2b4-2ba6a93fb071"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.applicationName=AnalyticsSimulator"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.tierName=WebFrontEnd"
AGENT_OPTIONS="$AGENT_OPTIONS -Dappdynamics.agent.nodeName=AnalyticsNode"
AGENT_OPTIONS="$AGENT_OPTIONS -javaagent:/Applications/AppDynamics/appserveragent/javaagent.jar"

##############################################################################
#
# No need to edit below this line
#
##############################################################################
PWD="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

JAVA_SOURCE="src/com/appdynamics/se/analytics/AnalyticsSimulator.java"
JAVA_MAIN_CLASS="com.appdynamics.se.analytics.AnalyticsSimulator"
JAVA_OUT_DIR="$PWD/out"
CONF_DIR="$PWD/conf"

DEBUG_LOGS=true

main() {
    # Clean up any previous run
    clean

    # Prepare the new run
    prepare


    # Check for running Machine agent on the local machine. Required to have a local Machine Agent.
    check_process_running "machineagent.jar"

    # Check for running Analytics agent embedded into Machine Agent at localhost:9091/ping --> pong
    check_events_service "$MACHINE_AGENT_ANALYTICS_URL"

    # Check for running and accessible events service
    check_events_service "$EVENTS_SERVICE_URL"

    # Compile Java
    compile

    # Start the app
    start
}

log-debug() {
    if [[ $DEBUG_LOGS = true ]]; then
        echo -e "DEBUG: $1"
    fi
}

log-info() {
    echo -e "INFO:  $1"
}

log-warn() {
    echo -e "WARN:  $1"
}

log-error() {
    echo -e "ERROR: \n       $1"
}

clean() {
    log-info "Clean"

    # Clean up the previous compile
    rm -rf "$JAVA_OUT_DIR"
}

prepare() {
    log-info "Prepare"

    mkdir "$JAVA_OUT_DIR"
}

check_process_running() {
    local process="$1"

    TEST=$(ps -ef | grep $process | grep -v grep)
    if [ "$TEST" ]; then
       log-info "$process is running"
    else
       log-error "$process NOT running"
       exit 1
    fi
}

check_events_service() {
    local url="$1"
    local expectedContent="HTTP/1.1 200 OK"

    curl -s --head "$url" | head -n 1 | grep "$expectedContent" > /dev/null
    if [ $? -gt 0 ]; then
        log-error "Error contacting $url"
        exit 1
    else
        # if the keyword is in the conent
        log-info "URL at $url is accessible"
    fi
}

compile() {
    log-info "Compiling $JAVA_MAIN_CLASS into $JAVA_OUT_DIR"

    javac -d "$JAVA_OUT_DIR" "$JAVA_SOURCE"
    if [[ $? -gt 0 ]]; then
        log-error "Compile FAILED"
        exit 1
    else
        log-info "Java compile complete"
    fi
}

start() {
    # echo out the start time... just because
    log-info "Started the Analytics Simulator at $(date +%Y-%m-%d:%H:%M:%S)"

    log-debug "AGENT_OPTIONS $AGENT_OPTIONS"

    # Don't wrap AGENT_OPTIONS in quotes or it'll blow up.
    java -classpath "$JAVA_OUT_DIR":"$CONF_DIR" $AGENT_OPTIONS "$JAVA_MAIN_CLASS"
}

main "$@"

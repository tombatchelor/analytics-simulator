#!/bin/bash
set -e


##############################################################################
#
# No need to edit below this line
#
##############################################################################
PWD="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

JAVA_SOURCE="src/main/java/com/appdynamics/se/analytics/AnalyticsSimulator.java"
JAVA_MAIN_CLASS="com.appdynamics.se.analytics.AnalyticsSimulator"
JAVA_OUT_DIR="$PWD/out"
CONF_DIR="$PWD/conf"
CONF_FILE="load.csv"

DEBUG_LOGS=true

main() {
    # Clean up any previous run
    clean

    # Prepare the new run
    prepare

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

start() {
    # echo out the start time... just because
    log-info "Started the Analytics Simulator at $(date +%Y-%m-%d:%H:%M:%S)"

    log-debug "CONF_DIR $CONF_DIR"
    log-debug "CONF_FILE $CONF_DIR/$CONF_FILE"

    # Don't wrap AGENT_OPTIONS in quotes or it'll blow up.
    java -classpath "$CONF_DIR" -jar target/Analytics_Simulator-1.0-SNAPSHOT.jar $CONF_DIR/$CONF_FILE
}

main "$@"

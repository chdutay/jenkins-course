#!/usr/bin/env groovy

def getBuildUser() {
    return currentBuild.rawBuild.getCause(Cause.UserIdCause).getUserId()
}

// valid if string as date format dd-mm-yyyy
def isValidStringDate(String date) {
    return date ==~ /((0[1-9]|[12]\d|3[01])-(0[1-9]|1[0-2])-[12]\d{3})/
}

// Return string with current date with format dd-mm-yyyy
def getStringDate() {
    return sh(script: "date +%d-%m-%Y", returnStdout: true).trim()
}

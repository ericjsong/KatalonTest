#!/bin/bash
set -xe

docker run -t --rm -e KATALON_USER_ID=`id -u $USER` -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/KatalonFirstTest" -apikey="46dde9c9-3c02-47d5-b425-6a95b07b5201"

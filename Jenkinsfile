pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args "-u root"
            }
    }
    stages {
        stage('Test') {
            steps {
                sh 'export DISPLAY=0'
                sh 'katalonc -noSplash -runMode=console -projectPath="${WORKSPACE}/kDocker2.prj" -retry=0 -testSuitePath="Test Suites/KatalonFirstTest" -executionProfile="default" -browserType="Firefox" -apiKey="46dde9c9-3c02-47d5-b425-6a95b07b5201" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true'
            }
        }
    }
}

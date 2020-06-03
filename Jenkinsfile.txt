pipeline {
    agent any
    tools {
        maven 'mvn3.6.3'
        jdk 'java8'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    echo "cleanong workspace"
                    rm -rf ./*
                '''
            }
        }
        stage ('Checkout') {
			steps {
				checkout([
					$class: 'GitSCM', 
					branches: [[name: '*/master']], 
					doGenerateSubmoduleConfigurations: false, 
					extensions: [], 
					submoduleCfg: [], 
					userRemoteConfigs: [[credentialsId: 'GitLab', url: 'https://code.marfa-dev.space/marfa/auto-tests.git']]
				])
			}
 	        	
		}
        stage ('Build') {
            steps {
                sh 'mvn clean test' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}

pipeline {
    agent any
	tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }

    stages {

        stage('GitHub Checkout') {
            steps {
                	git branch: 'main',
    			credentialsId: 'GitHubCred',
    			url: 'https://github.com/princevarghesev/pipelinetest.git'

		//  Location of Code chekcout => C:\ProgramData\Jenkins\.jenkins\workspace

            	}
        }

	stage('Maven Build') {
            steps {
                 sh 'mvn clean install'
            }
        }

	stage('Image Build') {
            steps {
                echo 'Image Build'
            }
        }

	stage('K8 Deploy') {
            steps {
                echo 'K8 Deploy'
            }
        }
    }
}
		
		
		
		

pipeline {
    agent any

    stages {

        stage('GitHub Checkout') {
            steps {
                	git branch: 'main',
    			credentialsId: 'GitHubCred',
    			url: 'https://github.com/princevarghesev/pipelinetest.git'
            	}
        }

	stage('Maven Build') {
            steps {
                echo 'Maven Build'
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
		
		
		
		
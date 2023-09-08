
pipeline {
    agent any
	

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
               
 		bat 'mvn install'
            }
        }

	stage('Image Build') {
            steps {
                bat 'docker build -t pipelinetest .'
                bat 'docker tag -t pipelinetest prince162222/pipelinetest:latest'
 		bat 'docker login --username=prince162222 --password=Ecnirp@409@Dtrn' 
 		bat 'docker push prince162222/pipelinetest:latest'
            }
        }

	stage('K8 Deploy') {
            steps {
                echo 'K8 Deploy'
            }
        }
    }
}
		
		
		
		
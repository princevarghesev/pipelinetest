
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
                sh 'docker build -t prince162222/pipelinetest:latest'
 		sh 'docker login --username=prince162222 --password=Ecnirp@409@Dtrn' 
 		sh 'docker push prince162222/pipelinetest:latest'
            }
        }

	stage('K8 Deploy') {
            steps {
                echo 'K8 Deploy'
            }
        }
    }
}
		
		
		
		
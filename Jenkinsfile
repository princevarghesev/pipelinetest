
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
              bat 'docker tag pipelinetest prince162222/pipelinetest:latest'
 	      bat 'docker login --username=prince162222 --password=Ecnirp@409@Dtrn' 
 	      bat 'docker push prince162222/pipelinetest:latest'
            }
        }
        
	stage('EKS Cluster Deploy') {
            steps {
   
              withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'awscredup', usernameVariable: 'AWS_ACCESS_KEY_ID', passwordVariable: 'AWS_SECRET_ACCESS_KEY']])  {       
             
	      bat 'aws eks update-kubeconfig --name mycluster --region ap-south-1'
              bat 'kubectl apply -f deployment/deployment.yaml'
 	      bat 'kubectl apply -f deployment/service.yaml'

            }

	  }
        }
	
    }

}
		
		
		
		

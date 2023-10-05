
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

              // Do not use :latest tag while tagging and pushing to docker repository
              // Only use :latest tag while refering docker hub image at k8 deployment YAML file for pulling
              // Do not use image pull policy always - Only use ifNotPresent while defining image pull policy
               
              bat 'docker build -t pipelinetest .'
              bat 'docker tag pipelinetest prince162222/pipelinetest'
 	      bat 'docker login --username=prince162222 --password=Ecnirp@409@Dtrn' 
 	      bat 'docker push prince162222/pipelinetest'
            }
        }
        
	stage('EKS Cluster Deploy') {
            
	steps {
                // Uses AWS Credential Building
 		withCredentials(
			[[$class: 'AmazonWebServicesCredentialsBinding',
			credentialsId: 'awscredac',
			accessKeyVariable: 'AWS_ACCESS_KEY_ID',
			secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
			]])  
			{                      

	      		bat 'aws eks update-kubeconfig --name mycluster --region ap-south-1'
              		bat 'kubectl apply -f deployment/deployment.yaml'
 	      		bat 'kubectl apply -f deployment/service.yaml'
			//bat 'kubectl apply -f deployment/ingress.yaml'

            		}
               }
	
          }

    }

}
		
		
		
		

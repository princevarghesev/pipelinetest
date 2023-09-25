
pipeline {
    agent any
	

    stages {

        
	stage('EKS Cluster Deploy') {
            steps {
   
              withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', credentialsId: 'awscred', accessKeyVariable: 'AWS_ACCESS_KEY_ID', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {       
             
	      bat 'aws eks update-kubeconfig --name mycluster --region ap-south-1'
              bat 'kubectl apply -f deployment/deployment.yaml'
 	      bat 'kubectl apply -f deployment/service.yaml'

            }

	  }
        }
	
    }

}
		
		
		
		

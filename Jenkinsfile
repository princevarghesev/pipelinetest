
pipeline {
    agent any
	

    stages {

        
	stage('EKS Cluster Deploy') {
            steps {
   
              withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'awscred', usernameVariable: 'AWS_ACCESS_KEY_ID', passwordVariable: 'AWS_SECRET_ACCESS_KEY']])  {       
             
	      bat 'aws eks update-kubeconfig --name mycluster --region ap-south-1'
              bat 'kubectl apply -f deployment/deployment.yaml'
 	      bat 'kubectl apply -f deployment/service.yaml'

            }

	  }
        }
	
    }

}
		
		
		
		

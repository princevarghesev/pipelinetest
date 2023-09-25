
pipeline {
    agent any
	

    stages {

        
	stage('EKS Cluster Deploy') {
            steps {
   
              withAWS(credentials: 'awscred') {       
             
	      bat 'aws eks update-kubeconfig --name mycluster --region ap-south-1'
              bat 'kubectl apply -f deployment/deployment.yaml'
 	      bat 'kubectl apply -f deployment/service.yaml'

            }

	  }
        }
	
    }

}
		
		
		
		


pipeline {
    agent any
	

    stages {

        
	stage('EKS Cluster Deploy') {
            steps {
   
              bat 'kubectl apply -f deployment/deployment.yaml'
 	      bat 'kubectl apply -f deployment/service.yaml'

            }

	  }
        }
}
		
		
		
		

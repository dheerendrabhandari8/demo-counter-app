pipeline{
    
    agent any 
    
    stages {
        
        stage('Git Checkout'){
            
            steps{
                   
    git branch: 'main', credentialsId: 'bhandari', url: 'https://github.com/dheerendrabhandari8/demo-counter-app.git'
            }
             }



        stage('Unit testing'){
            
            steps{
    sh "mvn test"
        }    
}
    }
    }
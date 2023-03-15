pipeline{
    
    agent any 
    
    stages {
        
        stage('Git Checkout'){
            
            steps{
                   
    git branch: 'main', credentialsId: 'git-hub', url: 'https://github.com/dheerendrabhandari8/demo-counter-app.git'
            }
             }


 stage('test'){

            steps{

sh 'mvn verify'
       
           }
             }


}
}

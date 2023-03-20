def call (stageName){
if ("${stageName}" == 'build'){
sh 'mvn clean'
sh 'mvn install'
}
else if ("${stageName}" == 'test'){
sh 'mvn test'
}
}


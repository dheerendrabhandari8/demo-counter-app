def call (stageName){
if ("${stageName}" == 'build'){
sh 'mvn clean'
sh 'mvn install'
}
}


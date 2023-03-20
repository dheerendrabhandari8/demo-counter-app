
def checkOutFrom(repo) {
  git url: "https://github.com/dheerendrabhandari8/demo-counter-app.git"
}



def call(){
sh """
mvn clean package
"""

}

def buildMyCode(def url, def branch)
{
//git url: 'https://github.com/nookarajub/demo-test', credentialsId: 'nookaraju-jenkins-new', branch : 'master'
  git credentialsId: 'nookaraju-jenkins-new', url: "${url}", branch: "${branch}"
  
def maven = tool 'maven_software'  

  bat "${maven}/bin/mvn clean install"

bat " move target/*.*  c:/tomcat"


}

return this;

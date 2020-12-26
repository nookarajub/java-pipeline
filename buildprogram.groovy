node()
{
//git url: 'https://github.com/nookarajub/demo-test', credentialsId: 'nookaraju-jenkins-new', branch : 'master'
git credentialsId: 'nookaraju-jenkins-new', url: 'https://github.com/nookarajub/demo-test/'

bat "maven clean install"

bat " mv build/addressBook.war  c:/tomcat/web-inf/"


}
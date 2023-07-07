def newDow(repos)
{
  git "https://github.com/intelliqittrainings/${repos}.git"
}

def newBuild(pack)
{
  sh "mvn ${pack}"
}

def newDeploy(foldername,qaip,context)
{
  sh "scp /var/lib/jenkins/workspace/${foldername}/webapp/target/webapp.war ubuntu@${qaip}:/var/lib/tomcat9/webapps/${context}.war"
}

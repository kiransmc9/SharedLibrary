def newDow(repos)
{
  git "https://github.com/intelliqittrainings/${repos}.git"
}

def newBuild(pack)
{
  sh "mvn ${pack}"
}

def newDep(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def newDow(repos)
{
  git "https://github.com/intelliqittrainings/${repos}.git"
}

def newBuild(pack)
{
  git "mvn ${pack}"
}

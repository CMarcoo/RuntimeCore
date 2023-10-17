@echo off
set VERSION=1.0.0
mvn -Dsoftware_version=%VERSION% clean package && mvn org.apache.maven.plugins:maven-install-plugin:3.1.1:install-file -Dfile=C:/Users/marco/IdeaProjects/RuntimeCore/target/RuntimeCore-%VERSION%.jar -DgroupId="top.cmarco" -DartifactId="RuntimeCore" -Dversion=%VERSION% -Dpackaging=jar -DlocalRepositoryPath=C:/Users/marco/.m2/repository

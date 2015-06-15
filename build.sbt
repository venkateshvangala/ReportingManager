name := "ReportingManager"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.35"
)     

play.Project.playScalaSettings

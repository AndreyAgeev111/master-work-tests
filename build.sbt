import Dependencies.gatlingDependencies

lazy val root = (project in file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    name := "master-work-tests",
    version := "0.1.0",
    scalaVersion := "2.13.10",
    libraryDependencies ++= gatlingDependencies
  )

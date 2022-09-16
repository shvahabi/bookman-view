val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Bookman View",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version
  )

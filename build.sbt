enablePlugins(ScalaJSPlugin)

val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Bookman View",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.3.0"
  )

scalaJSUseMainModuleInitializer := true
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

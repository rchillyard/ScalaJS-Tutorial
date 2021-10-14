name := "ScalaJS Tutorial"

version := "0.1"

scalaVersion := "2.13.6"

mainClass := Some("tutorial.webapp.TutorialApp")

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

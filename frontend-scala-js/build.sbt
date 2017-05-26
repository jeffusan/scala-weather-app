enablePlugins(ScalaJSPlugin)

name := "weather app"
scalaVersion := "2.12.2"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.0.0-RC3"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "test" % "1.0.0-RC3"
libraryDependencies += "com.github.japgolly.microlibs" %%% "test-util" %  "1.5"
libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"
libraryDependencies += "io.circe" %%% "circe-core" % "0.7.0"
libraryDependencies += "io.circe" %%% "circe-parser" % "0.7.0"
libraryDependencies += "io.circe" %%% "circe-generic" % "0.7.0"
libraryDependencies += "io.circe" %% "circe-optics" % "0.7.0"

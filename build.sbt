// automatically reload the build when source changes are detected
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file(".")).settings(
    name := "hello-slinky",
    scalaVersion := "2.13.4",
    scalacOptions += "-Ymacro-annotations",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "1.1.0",
        "me.shadaj" %%% "slinky-core" % "0.6.7",
        "me.shadaj" %%% "slinky-web" % "0.6.7"
    )
).enablePlugins(ScalaJSPlugin)

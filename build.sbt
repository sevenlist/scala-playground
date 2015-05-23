lazy val root = (project in file(".")).
  settings(
    name := "scala-playground",
    organization := "com.sevenlist",
    version := "0.1",

    scalaVersion := "2.11.6",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.5" % "test",
      "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test"
    )
  )

name := "akka-quickstart-java"

version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "junit" % "junit" % "4.12")

herokuAppName in Compile := "enigmatic-stream-51528"

herokuProcessTypes in Compile := Map(
  "worker" -> "target/universal/stage/bin/akka-quickstart-java"
)

enablePlugins(JavaAppPackaging)

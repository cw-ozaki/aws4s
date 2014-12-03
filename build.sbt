name := "aws-dynamodb-scala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.9.8",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

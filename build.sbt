name := "aws-dynamodb-scala"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.9.8",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.antlr" % "antlr4-runtime" % "4.1" % "test",
  "commons-cli" % "commons-cli" % "1.2" % "test",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.1" % "test",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.1.1" % "test",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.1" % "test",
  "joda-time" % "joda-time" % "2.2" % "test",
  "log4j" % "log4j" % "1.2.17" % "test",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "test",
  "org.eclipse.jetty.spdy" % "spdy-core" % "8.1.12.v20130726" % "test",
  "org.eclipse.jetty.spdy" % "spdy-jetty" % "8.1.12.v20130726" % "test",
  "org.eclipse.jetty.spdy" % "spdy-jetty-http" % "8.1.12.v20130726" % "test",
  "org.eclipse.jetty" % "jetty-server" % "8.1.12.v20130726" % "test"
)

classpathTypes ++= Set("jnilib", "dll")

javaOptions in test += "-Djava.library.path=./lib"

initialCommands := """
    |System.setProperty("java.library.path", "./lib");
  """.stripMargin

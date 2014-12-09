import SonatypeKeys._

name := "aws-scala"

lazy val commonSettings = Seq(
version := "1.0.0",
scalaVersion := "2.11.4",
libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-core" % "1.9.8"
),
pomExtra := {
  <url>https://github.com/j5ik2o/aws-dynamodb-scala</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:j5ik2o/aws-scala.git</url>
      <connection>scm:git:github.com/j5ik2o/aws-scala</connection>
      <developerConnection>scm:git:git@github.com:j5ik2o/aws-scala.git</developerConnection>
    </scm>
    <developers>
      <developer>
        <id>j5ik2o</id>
        <name>Junichi Kato</name>
        <url>http://j5ik2o.me/</url>
      </developer>
    </developers>
}
)


lazy val root = Project(id = "aws-scala",
                         base = file(".")).aggregate(awsCore, awsDynamoDB)

lazy val awsCore = Project(id = "aws-core-scala", base = file("aws-core-scala")).
  settings(commonSettings: _*)

lazy val awsS3 = Project(id = "aws-s3-scala", base = file("aws-s3-scala")).
  settings(commonSettings: _*).dependsOn(awsCore).settings(
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-s3" % "1.9.8"
    )
  )

lazy val awsDynamoDB = Project(id = "aws-dynamodb-scala",
                               base = file("aws-dynamodb-scala")).
settings(commonSettings: _*).settings(
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
).dependsOn(awsCore)

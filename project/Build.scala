import xerial.sbt.Sonatype.SonatypeKeys
import SonatypeKeys._
import sbt.Keys._
import sbt._

object ApplicationBuild extends Build {

  lazy val commonSettings = Seq(
    organization := "org.sisioh",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-language:implicitConversions"),
    shellPrompt := {
      "sbt (%s)> " format projectId(_)
    },
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-core" % "1.9.8"
    ),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := {
      _ => false
    },
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (version.value.trim.endsWith("SNAPSHOT"))
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    pomExtra := {
      <url>https://github.com/sisioh/aws4s</url>
        <licenses>
          <license>
            <name>Apache 2</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:sisioho/aws4s.git</url>
          <connection>scm:git:github.com/sisioh/aws4s</connection>
          <developerConnection>scm:git:git@github.com:sisioh/aws4s.git</developerConnection>
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

  lazy val root = Project(id = "aws4s",
    base = file(".")).settings(commonSettings: _*).aggregate(awsCore, awsDynamoDB, awsS3)

  lazy val awsCore = Project(id = "aws4s-core", base = file("aws4s-core")).
    settings(commonSettings: _*)

  lazy val awsS3 = Project(id = "aws4s-s3", base = file("aws4s-s3")).
    settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-s3" % "1.9.8"
      )
    )

  lazy val awsDynamoDB = Project(id = "aws4s-dynamodb",
    base = file("aws4s-dynamodb")).
    settings(commonSettings: _*).dependsOn(awsCore).settings(
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
    )


  def projectId(state: State) = extracted(state).currentProject.id

  def extracted(state: State) = Project extract state
}

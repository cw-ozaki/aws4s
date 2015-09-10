import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import sbt.Keys._
import sbt._
import xerial.sbt.Sonatype.SonatypeKeys._

import scalariform.formatter.preferences._

object ApplicationBuild extends Build {

  val awsSdkVersion = "1.9.40"

  lazy val scalariformSettings = SbtScalariform.scalariformSettings ++ Seq(
    ScalariformKeys.preferences :=
      ScalariformKeys.preferences.value
        .setPreference(AlignParameters, true)
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(DoubleIndentClassDeclaration, true)
        .setPreference(PreserveDanglingCloseParenthesis, true)
        .setPreference(MultilineScaladocCommentsStartOnFirstLine, false)
  )

  lazy val commonSettings = scalariformSettings ++ Seq(
    sonatypeProfileName := "org.sisioh",
    organization := "org.sisioh",
    scalaVersion := "2.10.5",
    crossScalaVersions := Seq("2.10.5", "2.11.6"),
    scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-language:implicitConversions"),
    shellPrompt := {
      "sbt (%s)> " format projectId(_)
    },
    libraryDependencies ++= Seq(
      "com.amazonaws" % "aws-java-sdk-core" % awsSdkVersion
    ),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := {
      _ => false
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
          <developer>
            <id>ada-u</id>
            <name>Yuta Adachi</name>
            <url>http://ada-u.com/</url>
          </developer>
        </developers>
    },
    credentials := {
      val ivyCredentials = (baseDirectory in LocalRootProject).value / ".credentials"
      Credentials(ivyCredentials) :: Nil
    }
  )

  lazy val root = Project(id = "aws4s", base = file(".")).settings(commonSettings: _*)
    .aggregate(awsCore, awsDynamoDB, awsDynamoDBExt, awsS3, awsSQS, awsElasticBeanstalk, awsCloudFormation, awsSecurityTokenService, awsSimpleNotificationService)

  lazy val awsCore = Project(id = "aws4s-core", base = file("aws4s-core"))
    .settings(commonSettings: _*)

  lazy val awsSQS = Project(id = "aws4s-sqs", base = file("aws4s-sqs"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-sqs" % awsSdkVersion
      )
    )

  lazy val awsS3 = Project(id = "aws4s-s3", base = file("aws4s-s3"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-s3" % awsSdkVersion
      )
    )

  lazy val awsDynamoDBExt = Project(id = "aws4s-dynamodb-ext", base = file("aws4s-dynamodb-ext"))
    .settings(commonSettings: _*).dependsOn(awsDynamoDB)

  lazy val jettyDependencies = Seq(
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

  lazy val awsDynamoDB = Project(id = "aws4s-dynamodb", base = file("aws4s-dynamodb"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-dynamodb" % awsSdkVersion
      ) ++ jettyDependencies
    )

  lazy val awsElasticBeanstalk = Project(id = "aws4s-eb", base = file("aws4s-eb"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-elasticbeanstalk" % awsSdkVersion
      )
    )

  lazy val awsCloudFormation = Project(id = "aws4s-cfn", base = file("aws4s-cfn"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-cloudformation" % awsSdkVersion
      )
    )

  lazy val awsSecurityTokenService = Project(id = "aws4s-sts", base = file("aws4s-sts"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-sts" % awsSdkVersion
      )
    )

  lazy val awsSimpleNotificationService = Project(id = "aws4s-sns", base = file("aws4s-sns"))
    .settings(commonSettings: _*).dependsOn(awsCore).settings(
      libraryDependencies ++= Seq(
        "com.amazonaws" % "aws-java-sdk-sns" % awsSdkVersion
      )
    )

  def projectId(state: State) = extracted(state).currentProject.id

  def extracted(state: State) = Project extract state
}

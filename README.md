aws4s
=====

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/sisioh/aws4s?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![Build Status](https://travis-ci.org/sisioh/aws4s.svg)](https://travis-ci.org/sisioh/aws4s)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.sisioh/aws4s_2.11/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.sisioh/aws4s_2.11)
[![Scaladoc](http://javadoc-badge.appspot.com/org.sisioh/aws4s.svg?label=scaladoc)](http://javadoc-badge.appspot.com/org.sisioh/aws4s_2.11)
[![Reference Status](https://www.versioneye.com/java/org.sisioh:aws4s_2.11/reference_badge.svg?style=flat)](https://www.versioneye.com/java/org.sisioh:aws4s_2.11/references)

AWS4S is the AWS SDK wrapper for Scala.

- aws4s-core
- aws4s-dynamodb
- aws4s-sqs
- aws4s-s3
- aws4s-cfn
- aws4s-sts

## Installation

Add the following to your sbt build (Scala 2.10.x, and Scala 2.11.x):

### Release Version

```scala
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "org.sisioh" %% "aws4s" % "1.0.13"
```

### Snapshot Version

```scala
resolvers += "Sonatype OSS Snapshot Repository" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies += "org.sisioh" %% "aws4s-xxx" % "1.0.13-SNAPSHOT"
```

## Usage

```scala
val client = AmazonS3ClientFactory.create()

val request = GetObjectRequestFactory.create("bucket", "key")

client.getObjectAsTry(getObjectRequest).map{ result =>
  result.objectMetadata.rawMetadata // as scala.collection.Map[String, AnyRef]
}.foreach(println)

```

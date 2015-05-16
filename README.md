aws4s
=====

[![Build Status](https://travis-ci.org/sisioh/aws4s.svg)](https://travis-ci.org/sisioh/aws4s)
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/sisioh/aws4s?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

AWS4S is the AWS SDK wrapper for Scala.

- aws4s-core
- aws4s-dynamodb
- aws4s-sqs
- aws4s-s3
- aws4s-cfn

## Installation

Add the following to your sbt build (Scala 2.10.x, and Scala 2.11.x):

```scala
libraryDependencies += "org.sisioh" %% "aws4s" % "1.0.5-SNAPSHOT"
```

## Usage

```scala
val client = AmazonS3ClientFactory.create()

val request = GetObjectRequestFactory.create("bucket", "key")

client.getObjectAsTry(getObjectRequest).map{ result =>
  result.objectMetadata.rawMetadata // as scala.collection.Map[String, AnyRef]
}.foreach(println)

```

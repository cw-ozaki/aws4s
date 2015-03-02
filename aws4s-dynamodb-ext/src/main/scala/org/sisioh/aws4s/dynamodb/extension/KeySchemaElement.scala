package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}

import org.sisioh.aws4s.dynamodb.Implicits._


case class KeySchemaElement(underlying: aws.model.KeySchemaElement) {

  val attributeName: Option[String] = underlying.attributeNameOpt

  val keyType: Option[String] = underlying.keyTypeOpt

}

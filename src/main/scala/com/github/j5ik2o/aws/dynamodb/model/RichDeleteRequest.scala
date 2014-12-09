package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, DeleteRequest}
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object DeleteRequestFactory {

  def apply(): DeleteRequest = new DeleteRequest()

  def apply(key: Map[String, AttributeValue]) = new DeleteRequest(key.asJava)

}

class RichDeleteRequest(val underlying: DeleteRequest) extends AnyVal with PimpedType[DeleteRequest] {

  def key_=(value: Map[String, AttributeValue]): Unit = underlying.setKey(value.asJava)

  def key: Map[String, AttributeValue] = underlying.getKey.asScala.toMap

}

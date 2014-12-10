package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, DeleteRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteRequestFactory {

  def apply(): DeleteRequest = new DeleteRequest()

  def apply(key: Map[String, AttributeValue]) = new DeleteRequest(key.asJava)

}

class RichDeleteRequest(val underlying: DeleteRequest) extends AnyVal with PimpedType[DeleteRequest] {

  def key_=(value: Map[String, AttributeValue]): Unit = underlying.setKey(value.asJava)

  def key: Map[String, AttributeValue] = underlying.getKey.asScala.toMap

}

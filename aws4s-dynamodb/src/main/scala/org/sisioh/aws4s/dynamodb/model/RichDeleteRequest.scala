package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ AttributeValue, DeleteRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteRequestFactory {

  def create(): DeleteRequest = new DeleteRequest()

  def create(key: Map[String, AttributeValue]) = new DeleteRequest(key.asJava)

}

class RichDeleteRequest(val underlying: DeleteRequest) extends AnyVal with PimpedType[DeleteRequest] {

  // ---

  def keyOpt: Option[Map[String, AttributeValue]] = Option(underlying.getKey).map(_.asScala.toMap)

  def keyOpt_=(value: Option[Map[String, AttributeValue]]): Unit = underlying.setKey(value.map(_.asJava).orNull)

  def withKeyOpt(value: Option[Map[String, AttributeValue]]): DeleteRequest = underlying.withKey(value.map(_.asJava).orNull)

  // ---

}

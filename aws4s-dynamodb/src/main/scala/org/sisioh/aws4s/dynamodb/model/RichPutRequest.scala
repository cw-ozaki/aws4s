package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, PutRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutRequestFactory {

  def create(): PutRequest = new PutRequest()

  def create(item: Map[String, AttributeValue]) = new PutRequest(item.asJava)

}

class RichPutRequest(val underlying: PutRequest) extends AnyVal with PimpedType[PutRequest] {

  // ---

  def itemOpt: Option[Map[String, AttributeValue]] = Option(underlying.getItem).map(_.asScala.toMap)

  def itemOpt_=(value: Option[Map[String, AttributeValue]]): Unit  = underlying.setItem(value.map(_.asJava).orNull)

  def withItemOpt(value: Option[Map[String, AttributeValue]]): PutRequest  = underlying.withItem(value.map(_.asJava).orNull)

  // ---

}

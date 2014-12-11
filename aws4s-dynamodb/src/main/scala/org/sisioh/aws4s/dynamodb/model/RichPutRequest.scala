package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, PutRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutRequestFactory {

  def apply(): PutRequest = new PutRequest()

  def apply(item: Map[String, AttributeValue]) = new PutRequest(item.asJava)

}

class RichPutRequest(val underlying: PutRequest) extends AnyVal with PimpedType[PutRequest] {

  def item: Map[String, AttributeValue] = underlying.getItem.asScala.toMap

  def item_=(value: Map[String, AttributeValue]): Unit  = underlying.setItem(value.asJava)

}

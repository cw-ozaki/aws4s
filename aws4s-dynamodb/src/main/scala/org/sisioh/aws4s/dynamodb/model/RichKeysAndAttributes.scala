package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, KeysAndAttributes}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object KeysAndAttributesFactory {

  def apply(): KeysAndAttributes = new KeysAndAttributes()

}

class RichKeysAndAttributes(val underlying: KeysAndAttributes) extends AnyVal with PimpedType[KeysAndAttributes] {

  def keys: Seq[Map[String, AttributeValue]] = underlying.getKeys.asScala.map(_.asScala.toMap)

  def keys_=(value: Seq[Map[String, AttributeValue]]): Unit = underlying.setKeys(value.map(_.asJava).asJava)

  def withKeys(value: Seq[Map[String, AttributeValue]]): KeysAndAttributes = underlying.withKeys(value.map(_.asJava).asJava)

  def attributesToGet: Seq[String] = underlying.getAttributesToGet.asScala

  def attributesToGet(value: Iterable[String]): Unit = underlying.setAttributesToGet(value.toSeq.asJava)

  def withAttributesToGet(value: Iterable[String]): KeysAndAttributes = underlying.withAttributesToGet(value.toSeq.asJava)

  def consistentRead: Boolean = underlying.getConsistentRead

  def consistentRead_=(value: Boolean): Unit = underlying.setConsistentRead(value)

  def projectionExpression: String = underlying.getProjectionExpression

  def projectionExpression_=(value: String): Unit = underlying.setProjectionExpression(value)

  def expressionAttributeNames: Map[String, String] = underlying.getExpressionAttributeNames.asScala.toMap

  def expressionAttributeNames(value: Map[String, String]): Unit = underlying.setExpressionAttributeNames(value.asJava)

  def withExpressionAttributeNames(value: Map[String, String]): KeysAndAttributes = underlying.withExpressionAttributeNames(value.asJava)

}

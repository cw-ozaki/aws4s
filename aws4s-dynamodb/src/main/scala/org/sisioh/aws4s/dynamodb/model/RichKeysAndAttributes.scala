package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, KeysAndAttributes}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object KeysAndAttributesFactory {

  def create(): KeysAndAttributes = new KeysAndAttributes()

}

class RichKeysAndAttributes(val underlying: KeysAndAttributes) extends AnyVal with PimpedType[KeysAndAttributes] {

  def keysOpt: Option[Seq[Map[String, AttributeValue]]] = Option(underlying.getKeys).map(_.asScala.map(_.asScala.toMap))

  def keysOpt_=(value: Option[Seq[Map[String, AttributeValue]]]): Unit = underlying.setKeys(value.map(_.map(_.asJava).asJava).orNull)

  def withKeysOpt(value: Option[Seq[Map[String, AttributeValue]]]): KeysAndAttributes = underlying.withKeys(value.map(_.map(_.asJava).asJava).orNull)

  def attributesToGetOpt: Option[Seq[String]] = Option(underlying.getAttributesToGet).map(_.asScala)

  def attributesToGetOpt_=(value: Option[Iterable[String]]): Unit = underlying.setAttributesToGet(value.map(_.toSeq.asJava).orNull)

  def withAttributesToGetOpt(value: Option[Iterable[String]]): KeysAndAttributes = underlying.withAttributesToGet(value.map(_.toSeq.asJava).orNull)

  def consistentReadOpt: Option[Boolean] = Option(underlying.getConsistentRead)

  def consistentReadOpt_=(value: Option[Boolean]): Unit = underlying.setConsistentRead(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def projectionExpressionOpt: Option[String] = Option(underlying.getProjectionExpression)

  def projectionExpressionOpt_=(value: Option[String]): Unit = underlying.setProjectionExpression(value.orNull)

  def expressionAttributeNamesOpt: Option[Map[String, String]] = Option(underlying.getExpressionAttributeNames).map(_.asScala.toMap)

  def expressionAttributeNamesOpt_=(value: Option[Map[String, String]]): Unit = underlying.setExpressionAttributeNames(value.map(_.asJava).orNull)

  def withExpressionAttributeNamesOpt(value: Option[Map[String, String]]): KeysAndAttributes = underlying.withExpressionAttributeNames(value.map(_.asJava).orNull)

}

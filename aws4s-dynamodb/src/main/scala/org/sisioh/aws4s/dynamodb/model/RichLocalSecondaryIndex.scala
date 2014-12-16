package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{KeySchemaElement, LocalSecondaryIndex, Projection}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object LocalSecondaryIndexFactory {

  def create(): LocalSecondaryIndex = new LocalSecondaryIndex()
}

class RichLocalSecondaryIndex(val underlying: LocalSecondaryIndex) extends AnyVal with PimpedType[LocalSecondaryIndex] {

  // ---

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): LocalSecondaryIndex = underlying.withIndexName(value.orNull)

  // ---

  def keySchemaOpt: Option[Seq[KeySchemaElement]] = Option(underlying.getKeySchema).map(_.asScala)

  def keySchemaOpt_=(value: Option[Seq[KeySchemaElement]]): Unit = underlying.setKeySchema(value.map(_.asJava).orNull)

  def withKeySchemaOpt(value: Option[Seq[KeySchemaElement]]): LocalSecondaryIndex = underlying.withKeySchema(value.map(_.asJava).orNull)

  // ---

  def projectionOpt: Option[Projection] = Option(underlying.getProjection)

  def projectionOpt_=(value: Option[Projection]): Unit = underlying.setProjection(value.orNull)

  def withProjectionOpt(value: Option[Projection]): LocalSecondaryIndex = underlying.withProjection(value.orNull)

  // ---

}

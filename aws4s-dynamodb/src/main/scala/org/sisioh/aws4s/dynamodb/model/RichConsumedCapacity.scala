package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{Capacity, ConsumedCapacity}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ConsumedCapacityFactory {

  def create(): ConsumedCapacity = new ConsumedCapacity()

}

class RichConsumedCapacity(val underlying: ConsumedCapacity) extends AnyVal with PimpedType[ConsumedCapacity] {

  def tableNameOpt_=(value: Option[Capacity]): Unit = underlying.setTable(value.orNull)

  def tableNameOpt: Option[Capacity] = Option(underlying.getTable)

  def localSecondaryIndexesOpt_=(value: Option[Map[String, Capacity]]): Unit =
    underlying.setLocalSecondaryIndexes(value.map(_.asJava).orNull)

  def localSecondaryIndexesOpt: Option[Map[String, Capacity]] =
    Option(underlying.getLocalSecondaryIndexes).map(_.asScala.toMap)

  def withLocalSecondaryIndexesOpt(value: Option[Map[String, Capacity]]): ConsumedCapacity =
    underlying.withLocalSecondaryIndexes(value.map(_.asJava).orNull)

  def globalSecondaryIndexesOpt_=(value: Option[Map[String, Capacity]]): Unit =
    underlying.setGlobalSecondaryIndexes(value.map(_.asJava).orNull)

  def globalSecondaryIndexesOpt: Option[Map[String, Capacity]] =
    Option(underlying.getGlobalSecondaryIndexes).map(_.asScala.toMap)

  def withGlobalSecondaryIndexesOpt(value: Option[Map[String, Capacity]]): ConsumedCapacity =
    underlying.withGlobalSecondaryIndexes(value.map(_.asJava).orNull)

}

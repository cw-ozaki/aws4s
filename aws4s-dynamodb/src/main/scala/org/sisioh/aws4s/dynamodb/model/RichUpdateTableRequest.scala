package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{GlobalSecondaryIndexUpdate, ProvisionedThroughput, UpdateTableRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateTableRequestFactory {

  def create(): UpdateTableRequest = new UpdateTableRequest()

  def create(tableName: String, provisionedThroughput: ProvisionedThroughput): UpdateTableRequest =
    new UpdateTableRequest(tableName, provisionedThroughput)

}

class RichUpdateTableRequest(val underlying: UpdateTableRequest) extends AnyVal with PimpedType[UpdateTableRequest] {

  def tableNameOpt = Option(underlying.getTableName)

  def tableNameOpt_=(value: Option[String]): Unit =
    underlying.setTableName(value.orNull)

  def withTableNameOpt(value: Option[String]): UpdateTableRequest =
    underlying.withTableName(value.orNull)

  def provisionedThroughputOpt = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughput]): Unit = underlying.setProvisionedThroughput(value.orNull)

  def withProvisionedThroughputOpt(value: Option[ProvisionedThroughput]): UpdateTableRequest = underlying.withProvisionedThroughput(value.orNull)

  def globalSecondaryIndexUpdatesOpt = Option(underlying.getGlobalSecondaryIndexUpdates).map(_.asScala.toVector)

  def globalSecondaryIndexUpdatesOpt_=(value: Option[Seq[GlobalSecondaryIndexUpdate]]): Unit = underlying.setGlobalSecondaryIndexUpdates(value.map(_.asJava).orNull)

  def withGlobalSecondaryIndexUpdatesOpt(value: Option[Seq[GlobalSecondaryIndexUpdate]]): UpdateTableRequest = underlying.withGlobalSecondaryIndexUpdates(value.map(_.asJava).orNull)

}

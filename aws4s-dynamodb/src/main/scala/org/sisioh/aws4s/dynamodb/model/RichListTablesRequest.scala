package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ListTablesRequest
import org.sisioh.aws4s.PimpedType

object ListTablesRequestFactory {

  def create(): ListTablesRequest = new ListTablesRequest()

  def create(exclusiveStartTableName: String): ListTablesRequest = new ListTablesRequest(exclusiveStartTableName)

  def create(exclusiveStartTableName: String, limit: Int): ListTablesRequest = new ListTablesRequest(exclusiveStartTableName, limit)

}

class RichListTablesRequest(val underlying: ListTablesRequest)
  extends AnyVal with PimpedType[ListTablesRequest] {

  def exclusiveStartTableNameOpt: Option[String] = Option(underlying.getExclusiveStartTableName)

  def exclusiveStartTableNameOpt_=(value: Option[String]): Unit =
    underlying.setExclusiveStartTableName(value.orNull)

  def withExclusiveStartTableNameOpt(value: Option[String]): ListTablesRequest =
    underlying.withExclusiveStartTableName(value.orNull)

  // ---

  def limitOpt: Option[Int] = Option(underlying.getLimit)

  def limitOpt_=(value: Option[Int]): Unit =
    underlying.setLimit(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withLimitOpt(value: Option[Int]): ListTablesRequest =
    underlying.withLimit(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

}

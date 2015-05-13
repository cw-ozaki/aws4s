package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{CreateTableResult, TableDescription}
import org.sisioh.aws4s.PimpedType

object CreateTableResultFactory {

  def create(): CreateTableResult = new CreateTableResult()

}

class RichCreateTableResult(val underlying: CreateTableResult) extends AnyVal with PimpedType[CreateTableResult] {

  // ---

  def tableDescriptionOpt_=(value: Option[TableDescription]): Unit =
    underlying.setTableDescription(value.orNull)

  def tableDescriptionOpt: Option[TableDescription] = Option(underlying.getTableDescription)

  def withTableDescriptionOpt(value: Option[TableDescription]): CreateTableResult =
    underlying.withTableDescription(value.orNull)

  // ---

}

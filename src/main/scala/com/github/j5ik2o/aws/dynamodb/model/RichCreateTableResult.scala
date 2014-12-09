package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{CreateTableResult, TableDescription}
import com.github.j5ik2o.aws.PimpedType

object CreateTableResultFactory {

  def apply(): CreateTableResult = new CreateTableResult()

}

class RichCreateTableResult(val underlying: CreateTableResult) extends AnyVal with PimpedType[CreateTableResult] {

  def tableDescription_=(value: TableDescription): Unit =
    underlying.setTableDescription(value)

  def tableDescription: TableDescription = underlying.getTableDescription

}

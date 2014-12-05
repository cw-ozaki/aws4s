package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{TableDescription, CreateTableResult}
import com.github.j5ik2o.aws.dynamodb.PimpedType

object CreateTableResultFactory {

  def apply(): CreateTableResult = new CreateTableResult()

}

class RichCreateTableResult(val underlying: CreateTableResult) extends AnyVal with PimpedType[CreateTableResult] {

  def tableDescription: TableDescription = underlying.getTableDescription

}

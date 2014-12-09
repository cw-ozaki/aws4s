package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DeleteTableResult, TableDescription}
import com.github.j5ik2o.aws.PimpedType

object DeleteTableResultFactory {

  def apply(): DeleteTableResult = new DeleteTableResult()

}

class RichDeleteTableResult(val underlying: DeleteTableResult) extends AnyVal with PimpedType[DeleteTableResult] {

  def tableDescription_=(value: TableDescription): Unit = underlying.setTableDescription(value)

  def tableDescription: TableDescription = underlying.getTableDescription

}

package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DeleteTableResult, TableDescription}
import org.sisioh.aws4s.PimpedType

object DeleteTableResultFactory {

  def apply(): DeleteTableResult = new DeleteTableResult()

}

class RichDeleteTableResult(val underlying: DeleteTableResult) extends AnyVal with PimpedType[DeleteTableResult] {

  def tableDescription_=(value: TableDescription): Unit = underlying.setTableDescription(value)

  def tableDescription: TableDescription = underlying.getTableDescription

}

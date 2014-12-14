package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DeleteTableResult, TableDescription}
import org.sisioh.aws4s.PimpedType

object DeleteTableResultFactory {

  def create(): DeleteTableResult = new DeleteTableResult()

}

class RichDeleteTableResult(val underlying: DeleteTableResult) extends AnyVal with PimpedType[DeleteTableResult] {

  def tableDescriptionOpt_=(value: Option[TableDescription]): Unit = underlying.setTableDescription(value.orNull)

  def tableDescriptionOpt: Option[TableDescription] = Option(underlying.getTableDescription)

}

package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{TableDescription, UpdateTableResult}
import org.sisioh.aws4s.PimpedType

object RichUpdateTableResultFactroy {

  def create() = new UpdateTableResult()

}

class RichUpdateTableResult(val underlying: UpdateTableResult) extends AnyVal with PimpedType[UpdateTableResult] {

  def tableDescriptionOpt: Option[TableDescription] = Option(underlying.getTableDescription)

  def tableDescriptionOpt_=(value: Option[TableDescription]): Unit = underlying.setTableDescription(value.orNull)

  def withTableDescriptionOpt(value: Option[TableDescription]): UpdateTableResult = underlying.withTableDescription(value.orNull)

}

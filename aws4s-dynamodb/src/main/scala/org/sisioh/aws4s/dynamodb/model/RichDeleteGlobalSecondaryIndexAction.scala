package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{CreateGlobalSecondaryIndexAction, DeleteGlobalSecondaryIndexAction}
import org.sisioh.aws4s.PimpedType

object DeleteGlobalSecondaryIndexActionFactory {

  def create(): DeleteGlobalSecondaryIndexAction = new DeleteGlobalSecondaryIndexAction()

}

class RichDeleteGlobalSecondaryIndexAction(val underlying: DeleteGlobalSecondaryIndexAction)
  extends AnyVal with PimpedType[DeleteGlobalSecondaryIndexAction] {

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit =
    underlying.setIndexName(value.orNull)

  def withIndexNameOpt(value: Option[String]): DeleteGlobalSecondaryIndexAction =
    underlying.withIndexName(value.orNull)

}

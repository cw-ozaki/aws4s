package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{UpdateGlobalSecondaryIndexAction, GlobalSecondaryIndexUpdate}
import org.sisioh.aws4s.PimpedType

object GlobalSecondaryIndexUpdateFactory {

  def create(): GlobalSecondaryIndexUpdate = new GlobalSecondaryIndexUpdate()

}

class RichGlobalSecondaryIndexUpdate(val underlying: GlobalSecondaryIndexUpdate) extends AnyVal with PimpedType[GlobalSecondaryIndexUpdate]{

  // ---

  def updateOpt: Option[UpdateGlobalSecondaryIndexAction] = Option(underlying.getUpdate)

  def updateOpt_=(value: Option[UpdateGlobalSecondaryIndexAction]): Unit = underlying.setUpdate(value.orNull)

  def withUpdateOpt(value: Option[UpdateGlobalSecondaryIndexAction]): GlobalSecondaryIndexUpdate = underlying.withUpdate(value.orNull)

  // ---
}

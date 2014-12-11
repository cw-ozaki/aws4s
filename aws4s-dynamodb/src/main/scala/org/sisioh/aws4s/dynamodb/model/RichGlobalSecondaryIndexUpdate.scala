package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{UpdateGlobalSecondaryIndexAction, GlobalSecondaryIndexUpdate}
import org.sisioh.aws4s.PimpedType

object GlobalSecondaryIndexUpdateFactory {

  def apply(): GlobalSecondaryIndexUpdate = new GlobalSecondaryIndexUpdate()

}

class RichGlobalSecondaryIndexUpdate(val underlying: GlobalSecondaryIndexUpdate) extends AnyVal with PimpedType[GlobalSecondaryIndexUpdate]{

  def update: UpdateGlobalSecondaryIndexAction = underlying.getUpdate

  def update_=(value: UpdateGlobalSecondaryIndexAction): Unit = underlying.setUpdate(value)
}

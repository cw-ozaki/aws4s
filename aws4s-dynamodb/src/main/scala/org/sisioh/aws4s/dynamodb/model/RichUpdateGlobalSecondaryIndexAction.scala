package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ProvisionedThroughput, UpdateGlobalSecondaryIndexAction}
import org.sisioh.aws4s.PimpedType

object UpdateGlobalSecondaryIndexActionFactory {

  def create(): UpdateGlobalSecondaryIndexAction = new UpdateGlobalSecondaryIndexAction()
}

class RichUpdateGlobalSecondaryIndexAction(val underlying: UpdateGlobalSecondaryIndexAction) extends AnyVal with PimpedType[UpdateGlobalSecondaryIndexAction] {

  def indexNameOpt: Option[String] = Option(underlying.getIndexName)

  def indexNameOpt_=(value: Option[String]): Unit = underlying.setIndexName(value.orNull)

  def provisionedThroughputOpt: Option[ProvisionedThroughput] = Option(underlying.getProvisionedThroughput)

  def provisionedThroughputOpt_=(value: Option[ProvisionedThroughput]): Unit = underlying.setProvisionedThroughput(value.orNull)

}

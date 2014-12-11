package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{ProvisionedThroughput, UpdateGlobalSecondaryIndexAction}
import org.sisioh.aws4s.PimpedType

object UpdateGlobalSecondaryIndexActionFactory {

  def apply(): UpdateGlobalSecondaryIndexAction = new UpdateGlobalSecondaryIndexAction()
}

class RichUpdateGlobalSecondaryIndexAction(val underlying: UpdateGlobalSecondaryIndexAction) extends AnyVal with PimpedType[UpdateGlobalSecondaryIndexAction] {

  def indexName: String = underlying.getIndexName

  def indexName_=(value: String): Unit = underlying.setIndexName(value)

  def provisionedThroughput: ProvisionedThroughput = underlying.getProvisionedThroughput

  def provisionedThroughput_=(value: ProvisionedThroughput): Unit = underlying.setProvisionedThroughput(value)

}

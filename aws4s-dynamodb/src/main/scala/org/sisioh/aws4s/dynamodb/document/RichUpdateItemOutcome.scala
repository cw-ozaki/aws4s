package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ Item, UpdateItemOutcome }
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult
import org.sisioh.aws4s.PimpedType

object UpdateItemOutcomeFactory {

  def apply(result: UpdateItemResult): UpdateItemOutcome = new UpdateItemOutcome(result)

}

class RichUpdateItemOutcome(val underlying: UpdateItemOutcome) extends AnyVal with PimpedType[UpdateItemOutcome] {

  def item: Item = underlying.getItem

  def updateItemResult(): UpdateItemResult = underlying.getUpdateItemResult

}

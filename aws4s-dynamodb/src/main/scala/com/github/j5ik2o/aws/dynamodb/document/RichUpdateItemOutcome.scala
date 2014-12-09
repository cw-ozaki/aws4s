package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, UpdateItemOutcome}
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult
import com.github.j5ik2o.aws.PimpedType

object UpdateItemOutcomeFactory {

  def apply(result: UpdateItemResult): UpdateItemOutcome = new UpdateItemOutcome(result)

}

class RichUpdateItemOutcome(val underlying: UpdateItemOutcome) extends AnyVal with PimpedType[UpdateItemOutcome] {

  def item: Item = underlying.getItem

  def updateItemResult: UpdateItemResult = underlying.getUpdateItemResult


}

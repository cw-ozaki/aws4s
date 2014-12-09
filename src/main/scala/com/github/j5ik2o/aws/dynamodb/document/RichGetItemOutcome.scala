package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{GetItemOutcome, Item}
import com.amazonaws.services.dynamodbv2.model.GetItemResult
import com.github.j5ik2o.aws.PimpedType

object GetItemOutcomeFactory {

  def apply(result: GetItemResult): GetItemOutcome =
    new GetItemOutcome(result)

}

class RichGetItemOutcome(val underlying: GetItemOutcome) extends AnyVal with PimpedType[GetItemOutcome] {

  def item: Item = underlying.getItem

  def getItemResult: GetItemResult = underlying.getGetItemResult

}

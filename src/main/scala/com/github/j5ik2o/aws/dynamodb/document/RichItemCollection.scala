package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.ItemCollection
import com.amazonaws.services.dynamodbv2.model.ConsumedCapacity
import com.github.j5ik2o.aws.PimpedType

class RichItemCollection[R](val underlying: ItemCollection[R]) extends AnyVal with PimpedType[ItemCollection[R]] {

  def totalCount: Int =
    underlying.getTotalCount

  def totalScannedCount: Int =
  underlying.getTotalScannedCount

  def totalConsumedCapacity: ConsumedCapacity =
    underlying.getTotalConsumedCapacity

}

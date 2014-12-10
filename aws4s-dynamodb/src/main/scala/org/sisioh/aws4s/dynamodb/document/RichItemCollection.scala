package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.ItemCollection
import com.amazonaws.services.dynamodbv2.model.ConsumedCapacity
import org.sisioh.aws4s.PimpedType

class RichItemCollection[R](val underlying: ItemCollection[R]) extends AnyVal with PimpedType[ItemCollection[R]] {

  def totalCount: Int =
    underlying.getTotalCount

  def totalScannedCount: Int =
  underlying.getTotalScannedCount

  def totalConsumedCapacity: ConsumedCapacity =
    underlying.getTotalConsumedCapacity

}

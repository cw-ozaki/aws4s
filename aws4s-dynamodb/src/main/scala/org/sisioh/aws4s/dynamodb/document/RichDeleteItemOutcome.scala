package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ DeleteItemOutcome, Item }
import com.amazonaws.services.dynamodbv2.model.DeleteItemResult
import org.sisioh.aws4s.PimpedType

class RichDeleteItemOutcome(val underlying: DeleteItemOutcome) extends AnyVal with PimpedType[DeleteItemOutcome] {

  def item: Item = underlying.getItem

  def deleteResult: DeleteItemResult = underlying.getDeleteItemResult

}

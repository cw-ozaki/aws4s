package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, PutItemOutcome}
import com.amazonaws.services.dynamodbv2.model.PutItemResult
import org.sisioh.aws4s.PimpedType

class RichPutItemOutcome(val underlying: PutItemOutcome) extends AnyVal with PimpedType[PutItemOutcome] {

  def item: Item = underlying.getItem

  def putItemResult: PutItemResult = underlying.getPutItemResult

}

package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.internal.PageBasedCollection
import org.sisioh.aws4s.PimpedType

class RichPageBasedCollection[T, R](val underlying: PageBasedCollection[T, R]) extends AnyVal with PimpedType[PageBasedCollection[T, R]] {

  def maxResultSize: Int = underlying.getMaxResultSize

  def lastLowLevelResult: R = underlying.getLastLowLevelResult

}

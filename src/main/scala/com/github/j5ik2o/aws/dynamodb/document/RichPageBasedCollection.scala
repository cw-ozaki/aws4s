package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.internal.PageBasedCollection
import com.github.j5ik2o.aws.PimpedType

class RichPageBasedCollection[T, R](val underlying: PageBasedCollection[T, R]) extends AnyVal with PimpedType[PageBasedCollection[T, R]] {

  def maxResultSize: Int = underlying.getMaxResultSize

  def lastLowLevelResult: R = underlying.getLastLowLevelResult

}

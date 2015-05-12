package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.internal.Filter
import org.sisioh.aws4s.PimpedType

class RichFilter[T <: Filter[T]](val underlying: Filter[T]) extends AnyVal with PimpedType[Filter[T]] {

  def values: Option[Array[AnyRef]] =
    Option(underlying.getValues)

}

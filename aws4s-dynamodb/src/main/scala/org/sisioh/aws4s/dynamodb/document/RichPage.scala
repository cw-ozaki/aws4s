package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.Page
import org.sisioh.aws4s.PimpedType

class RichPage[A, B](val underlying: Page[A, B]) extends AnyVal with PimpedType[Page[A, B]] {

  def lowLevelResult = underlying.getLowLevelResult

}

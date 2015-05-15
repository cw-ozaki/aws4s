package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ KeyConditions, RangeKeyCondition }
import org.sisioh.aws4s.PimpedType

object RangeKeyConditionFactory {

  def apply(attrName: String): RangeKeyCondition = new RangeKeyCondition(attrName)

}

class RichRangeKeyCondition(val underlying: RangeKeyCondition) extends AnyVal with PimpedType[RangeKeyCondition] {

  def attrName: String = underlying.getAttrName

  def keyCondition: KeyConditions = underlying.getKeyCondition

  def values: Array[AnyRef] = underlying.getValues
}

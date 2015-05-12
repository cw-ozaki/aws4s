package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RoutingRuleCondition
import org.sisioh.aws4s.PimpedType

object RichRoutingRuleConditionFactory {

  def create(): RoutingRuleCondition = new RoutingRuleCondition()

}

class RichRoutingRuleCondition(val underlying: RoutingRuleCondition)
    extends AnyVal with PimpedType[RoutingRuleCondition] {

  def keyPrefixEqualsOpt: Option[String] = Option(underlying.getKeyPrefixEquals)

  def httpErrorCodeReturnedEqualsOpt: Option[String] = Option(underlying.getHttpErrorCodeReturnedEquals)

}

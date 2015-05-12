package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RoutingRule
import org.sisioh.aws4s.PimpedType

object RoutingRuleFactory {

  def create(): RoutingRule = new RoutingRule()

}

class RichRoutingRule(val underlying: RoutingRule)
    extends AnyVal with PimpedType[RoutingRule] {

  def conditionOpt = Option(underlying.getCondition)

  def redirectOpt = Option(underlying.getRedirect)

}

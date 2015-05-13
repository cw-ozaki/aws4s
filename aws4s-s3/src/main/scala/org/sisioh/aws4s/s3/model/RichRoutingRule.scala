package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{RedirectRule, RoutingRule, RoutingRuleCondition}
import org.sisioh.aws4s.PimpedType

object RoutingRuleFactory {

  def create(): RoutingRule = new RoutingRule()

}

class RichRoutingRule(val underlying: RoutingRule)
  extends AnyVal with PimpedType[RoutingRule] {

  def conditionOpt: Option[RoutingRuleCondition] = Option(underlying.getCondition)

  def conditionOpt_=(value: Option[RoutingRuleCondition]): Unit =
    underlying.setCondition(value.orNull)

  def withConditionOpt(value: Option[RoutingRuleCondition]): RoutingRule =
    underlying.withCondition(value.orNull)

  // ---

  def redirectOpt: Option[RedirectRule] = Option(underlying.getRedirect)

  def redirectOpt_=(value: Option[RedirectRule]): Unit =
    underlying.setRedirect(value.orNull)

  def withRedirectOpt_=(value: Option[RedirectRule]): RoutingRule =
    underlying.withRedirect(value.orNull)
}

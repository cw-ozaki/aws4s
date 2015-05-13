package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RoutingRuleCondition
import org.sisioh.aws4s.PimpedType

object RichRoutingRuleConditionFactory {

  def create(): RoutingRuleCondition = new RoutingRuleCondition()

}

class RichRoutingRuleCondition(val underlying: RoutingRuleCondition)
    extends AnyVal with PimpedType[RoutingRuleCondition] {

  def keyPrefixEqualsOpt: Option[String] = Option(underlying.getKeyPrefixEquals)

  def keyPrefixEqualsOpt_=(value: Option[String]): Unit =
    underlying.setKeyPrefixEquals(value.orNull)

  def withKeyPrefixEqualsOpt(value: Option[String]): RoutingRuleCondition =
    underlying.withKeyPrefixEquals(value.orNull)

  // ---

  def httpErrorCodeReturnedEqualsOpt: Option[String] = Option(underlying.getHttpErrorCodeReturnedEquals)

  def httpErrorCodeReturnedEqualsOpt_=(value: Option[String]): Unit =
    underlying.setHttpErrorCodeReturnedEquals(value.orNull)

  def withHttpErrorCodeReturnedEqualsOpt(value: Option[String]): RoutingRuleCondition =
    underlying.withHttpErrorCodeReturnedEquals(value.orNull)

}

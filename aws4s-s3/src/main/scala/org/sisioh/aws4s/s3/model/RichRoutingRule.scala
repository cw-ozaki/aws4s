package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RoutingRule
import org.sisioh.aws4s.PimpedType

class RichRoutingRule(val underlying: RoutingRule)
  extends AnyVal with PimpedType[RoutingRule] {

  def conditionOpt = Option(underlying.getCondition)

  def redirectOpt = Option(underlying.getRedirect)

}

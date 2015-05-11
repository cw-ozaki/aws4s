package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityResult
import org.sisioh.aws4s.PimpedType

object CheckDNSAvailabilityResultFactory {

  def create(): CheckDNSAvailabilityResult = new CheckDNSAvailabilityResult()

}

class RichCheckDNSAvailabilityResult(val underlying: CheckDNSAvailabilityResult)
  extends AnyVal with PimpedType[CheckDNSAvailabilityResult] {

  def availableOpt: Option[Boolean] = Option(underlying.getAvailable)

  def availableOpt_=(value: Option[Boolean]): Unit =
    underlying.setAvailable(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withAvailableOpt(value: Option[Boolean]): CheckDNSAvailabilityResult =
    underlying.withAvailable(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def fullyQualifiedCNAMEOpt: Option[String] = Option(underlying.getFullyQualifiedCNAME)

  def fullyQualifiedCNAMEOpt_=(value: Option[String]): Unit =
    underlying.setFullyQualifiedCNAME(value.orNull)

  def withFullyQualifiedCNAMEOpt(value: Option[String]): CheckDNSAvailabilityResult =
    underlying.withFullyQualifiedCNAME(value.orNull)

}

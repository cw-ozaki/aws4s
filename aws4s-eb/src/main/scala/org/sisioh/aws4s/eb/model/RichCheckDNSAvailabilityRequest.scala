package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.CheckDNSAvailabilityRequest
import org.sisioh.aws4s.PimpedType

object CheckDNSAvailabilityRequestFactory {

  def create() = new CheckDNSAvailabilityRequest()

}

class RichCheckDNSAvailabilityRequest(val underlying: CheckDNSAvailabilityRequest)
    extends AnyVal with PimpedType[CheckDNSAvailabilityRequest] {

  def cNAMEPrefixOpt: Option[String] = Option(underlying.getCNAMEPrefix)

  def cNAMEPrefixOpt_=(value: Option[String]): Unit =
    underlying.setCNAMEPrefix(value.orNull)

  def withCNAMEPrefixOpt(value: Option[String]): CheckDNSAvailabilityRequest =
    underlying.withCNAMEPrefix(value.orNull)

}

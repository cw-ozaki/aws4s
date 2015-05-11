package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.SwapEnvironmentCNAMEsRequest
import org.sisioh.aws4s.PimpedType

class RichSwapEnvironmentCNAMEsRequest(val underlying: SwapEnvironmentCNAMEsRequest)
  extends AnyVal with PimpedType[SwapEnvironmentCNAMEsRequest] {

  def sourceEnvironmentIdOpt: Option[String] = Option(underlying.getSourceEnvironmentId)

  def sourceEnvironmentIdOpt_=(value: Option[String]): Unit =
    underlying.setSourceEnvironmentId(value.orNull)

  def withSourceEnvironmentIdOpt(value: Option[String]): SwapEnvironmentCNAMEsRequest =
    underlying.withSourceEnvironmentId(value.orNull)

  // ---

  def sourceEnvironmentNameOpt: Option[String] = Option(underlying.getSourceEnvironmentName)

  def sourceEnvironmentNameOpt_=(value: Option[String]): Unit =
    underlying.setSourceEnvironmentName(value.orNull)

  def withSourceEnvironmentNameOpt(value: Option[String]): SwapEnvironmentCNAMEsRequest =
    underlying.withSourceEnvironmentName(value.orNull)

  // ---

  def destinationEnvironmentIdOpt: Option[String] = Option(underlying.getDestinationEnvironmentId)

  def destinationEnvironmentIdOpt_=(value: Option[String]): Unit =
    underlying.setDestinationEnvironmentId(value.orNull)

  def withDestinationEnvironmentIdOpt(value: Option[String]): SwapEnvironmentCNAMEsRequest =
    underlying.withDestinationEnvironmentId(value.orNull)

  // ---

  def destinationEnvironmentNameOpt: Option[String] = Option(underlying.getDestinationEnvironmentName)

  def destinationEnvironmentNameOpt_=(value: Option[String]): Unit =
    underlying.setDestinationEnvironmentName(value.orNull)

  def withDestinationEnvironmentNameOpt(value: Option[String]): SwapEnvironmentCNAMEsRequest =
    underlying.withDestinationEnvironmentName(value.orNull)

}

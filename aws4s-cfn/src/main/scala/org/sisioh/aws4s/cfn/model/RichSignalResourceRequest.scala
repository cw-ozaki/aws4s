package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.SignalResourceRequest
import org.sisioh.aws4s.PimpedType

class RichSignalResourceRequest(val underlying: SignalResourceRequest)
  extends AnyVal with PimpedType[SignalResourceRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): SignalResourceRequest =
    underlying.withStackName(value.orNull)

  // ---

  def logicalResourceIdOpt = Option(underlying.getLogicalResourceId)

  def logicalResourceIdOpt_=(value: Option[String]): Unit =
    underlying.setLogicalResourceId(value.orNull)

  def withLogicalResourceIdOpt(value: Option[String]): SignalResourceRequest =
    underlying.withLogicalResourceId(value.orNull)

  // ---

  def uniqueIdOpt: Option[String] = Option(underlying.getUniqueId)

  def uniqueIdOpt_=(value: Option[String]): Unit =
    underlying.setUniqueId(value.orNull)

  def withUniqueIdOpt(value: Option[String]): SignalResourceRequest =
    underlying.withUniqueId(value.orNull)

  // ---

  def statusOpt: Option[String] = Option(underlying.getStatus)

  def statusOpt_=(value: Option[String]): Unit =
    underlying.setStatus(value.orNull)

  def withStatusOpt(value: Option[String]): SignalResourceRequest =
    underlying.withStatus(value.orNull)
}

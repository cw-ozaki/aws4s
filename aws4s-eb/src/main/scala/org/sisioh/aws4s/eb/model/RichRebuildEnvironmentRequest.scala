package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.RebuildEnvironmentRequest
import org.sisioh.aws4s.PimpedType

object RebuildEnvironmentRequestFactory {

  def create(): RebuildEnvironmentRequest = new RebuildEnvironmentRequest()

}

class RichRebuildEnvironmentRequest(val underlying: RebuildEnvironmentRequest)
    extends AnyVal with PimpedType[RebuildEnvironmentRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): RebuildEnvironmentRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): RebuildEnvironmentRequest =
    underlying.withEnvironmentName(value.orNull)

}

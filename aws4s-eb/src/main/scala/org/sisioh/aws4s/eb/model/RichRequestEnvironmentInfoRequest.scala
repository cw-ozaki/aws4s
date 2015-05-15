package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ EnvironmentInfoType, RequestEnvironmentInfoRequest }
import org.sisioh.aws4s.PimpedType

object RequestEnvironmentInfoRequestFactory {

  def create(): RequestEnvironmentInfoRequest = new RequestEnvironmentInfoRequest()

  def create(infoType: String): RequestEnvironmentInfoRequest = new RequestEnvironmentInfoRequest(infoType)

  def create(infoType: EnvironmentInfoType): RequestEnvironmentInfoRequest = new RequestEnvironmentInfoRequest(infoType)

}

class RichRequestEnvironmentInfoRequest(val underlying: RequestEnvironmentInfoRequest)
    extends AnyVal with PimpedType[RequestEnvironmentInfoRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): RequestEnvironmentInfoRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): RequestEnvironmentInfoRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def infoTypeOpt = Option(underlying.getInfoType)

  def infoTypeOpt_=(value: Option[String]): Unit =
    underlying.setInfoType(value.orNull)

  def withInfoTypeOpt(value: Option[String]): RequestEnvironmentInfoRequest =
    underlying.withInfoType(value.orNull)

}

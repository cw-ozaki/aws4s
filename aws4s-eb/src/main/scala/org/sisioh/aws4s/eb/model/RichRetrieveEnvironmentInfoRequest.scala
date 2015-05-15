package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ EnvironmentInfoType, RetrieveEnvironmentInfoRequest }
import org.sisioh.aws4s.PimpedType

object RetrieveEnvironmentInfoRequestFactory {

  def create(): RetrieveEnvironmentInfoRequest = new RetrieveEnvironmentInfoRequest()

  def create(infoType: String): RetrieveEnvironmentInfoRequest = new RetrieveEnvironmentInfoRequest(infoType)

  def create(infoType: EnvironmentInfoType): RetrieveEnvironmentInfoRequest = new RetrieveEnvironmentInfoRequest(infoType)

}

class RichRetrieveEnvironmentInfoRequest(val underlying: RetrieveEnvironmentInfoRequest)
    extends AnyVal with PimpedType[RetrieveEnvironmentInfoRequest] {

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): RetrieveEnvironmentInfoRequest =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): RetrieveEnvironmentInfoRequest =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def infoTypeOpt = Option(underlying.getInfoType)

  def infoTypeOpt_=(value: Option[String]): Unit =
    underlying.setInfoType(value.orNull)

  def withInfoTypeOpt(value: Option[String]): RetrieveEnvironmentInfoRequest =
    underlying.withInfoType(value.orNull)

}

package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreatePlatformEndpointRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreatePlatformEndpointRequestFactory {

  def create(): CreatePlatformEndpointRequest =
    new CreatePlatformEndpointRequest()

}

class RichCreatePlatformEndpointRequest(val underlying: CreatePlatformEndpointRequest)
    extends AnyVal with PimpedType[CreatePlatformEndpointRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.withPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(value: Option[String]): CreatePlatformEndpointRequest =
    underlying.withPlatformApplicationArn(value.orNull)

  def tokenOpt: Option[String] =
    Option(underlying.getToken)

  def tokenOpt_=(value: Option[String]): Unit =
    underlying.setToken(value.orNull)

  def withTokenOpt(token: Option[String]): CreatePlatformEndpointRequest =
    underlying.withToken(token.orNull)

  def customUserDataOpt: Option[String] =
    Option(underlying.getCustomUserData)

  def customUserDataOpt_=(value: Option[String]): Unit =
    underlying.setCustomUserData(value.orNull)

  def withCustomUserDataOpt(value: Option[String]): CreatePlatformEndpointRequest =
    underlying.withCustomUserData(value.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): CreatePlatformEndpointRequest =
    underlying.withAttributes(attributes.asJava)

}

package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.CreatePlatformEndpointRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConversions._

object CreatePlatformEndpointRequestFactory {

  def create(attributes: Map[String, String]): CreatePlatformEndpointRequest =
    new CreatePlatformEndpointRequest().withAttributes(attributes)

}

class RichCreatePlatformEndpointRequest(val underlying: CreatePlatformEndpointRequest)
  extends AnyVal with PimpedType[CreatePlatformEndpointRequest] {

  def platformApplicationArnOpt: Option[String] =
    Option(underlying.getPlatformApplicationArn)

  def withPlatformApplicationArn(platformApplicationArn: Option[String]): CreatePlatformEndpointRequest =
    underlying.withPlatformApplicationArn(platformApplicationArn.orNull)

  def tokenOpt: Option[String] =
    Option(underlying.getToken)

  def withToken(token: Option[String]): CreatePlatformEndpointRequest =
    underlying.withToken(token.orNull)

  def customUserData: Option[String] =
    Option(underlying.getCustomUserData)

  def withCustomUserData(customUserData: Option[String]): CreatePlatformEndpointRequest =
    underlying.withCustomUserData(customUserData.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.toMap

  def withAttributes(attributes: Map[String, String]): CreatePlatformEndpointRequest =
    underlying.withAttributes(attributes)

}

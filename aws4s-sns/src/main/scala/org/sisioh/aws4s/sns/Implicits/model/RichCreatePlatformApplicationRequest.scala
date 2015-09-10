package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.CreatePlatformApplicationRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConversions._

object CreatePlatformApplicationRequestFactory {

  def create(attributes: Map[String, String]): CreatePlatformApplicationRequest =
    new CreatePlatformApplicationRequest().withAttributes(attributes)

}

class RichCreatePlatformApplicationRequest(val underlying: CreatePlatformApplicationRequest)
  extends AnyVal with PimpedType[CreatePlatformApplicationRequest] {

  def nameOpt: Option[String] =
    Option(underlying.getName)

  def withName(name: Option[String]): CreatePlatformApplicationRequest =
    underlying.withName(name.orNull)

  def platformOpt: Option[String] =
    Option(underlying.getPlatform)

  def withPlatform(platform: Option[String]): CreatePlatformApplicationRequest =
    underlying.withPlatform(platform.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.toMap

  def withAttributes(attributes: Map[String, String]): CreatePlatformApplicationRequest =
    underlying.withAttributes(attributes)

}

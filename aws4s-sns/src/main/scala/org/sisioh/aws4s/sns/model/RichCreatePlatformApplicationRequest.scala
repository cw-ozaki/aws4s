package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreatePlatformApplicationRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CreatePlatformApplicationRequestFactory {

  def create(): CreatePlatformApplicationRequest =
    new CreatePlatformApplicationRequest()

}

class RichCreatePlatformApplicationRequest(val underlying: CreatePlatformApplicationRequest)
    extends AnyVal with PimpedType[CreatePlatformApplicationRequest] {

  def nameOpt: Option[String] =
    Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(name: Option[String]): CreatePlatformApplicationRequest =
    underlying.withName(name.orNull)

  def platformOpt: Option[String] =
    Option(underlying.getPlatform)

  def platformOpt_=(value: Option[String]): Unit =
    underlying.setPlatform(value.orNull)

  def withPlatformOpt(platform: Option[String]): CreatePlatformApplicationRequest =
    underlying.withPlatform(platform.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): CreatePlatformApplicationRequest =
    underlying.withAttributes(attributes.asJava)

}

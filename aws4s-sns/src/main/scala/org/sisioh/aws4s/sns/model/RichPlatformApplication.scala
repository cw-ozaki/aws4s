package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.PlatformApplication
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PlatformApplicationFactory {

  def create(): PlatformApplication =
    new PlatformApplication()

}

class RichPlatformApplication(val underlying: PlatformApplication)
    extends AnyVal with PimpedType[PlatformApplication] {

  def platformApplicationArnOpt: Option[String] = Option(underlying.getPlatformApplicationArn)

  def platformApplicationArnOpt_=(value: Option[String]): Unit =
    underlying.setPlatformApplicationArn(value.orNull)

  def withPlatformApplicationArnOpt(value: Option[String]): PlatformApplication =
    underlying.withPlatformApplicationArn(value.orNull)

  def attributes: Map[String, String] =
    underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(attributes: Map[String, String]): PlatformApplication =
    underlying.withAttributes(attributes.asJava)

  def attribute_+=(value: (String, String)): Unit =
    underlying.addAttributesEntry(value._1, value._2)

}

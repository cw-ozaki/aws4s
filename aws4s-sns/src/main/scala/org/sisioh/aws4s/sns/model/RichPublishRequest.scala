package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.{ MessageAttributeValue, PublishRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PublishRequestFactory {

  def create(): PublishRequest =
    new PublishRequest()

  def create(topicArn: String, message: String): PublishRequest =
    new PublishRequest(topicArn, message)

  def create(topicArn: String, message: String, subject: String): PublishRequest =
    new PublishRequest(topicArn, message, subject)

}

class RichPublishRequest(val underlying: PublishRequest)
    extends AnyVal with PimpedType[PublishRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): PublishRequest =
    underlying.withTopicArn(value.orNull)

  def targetArnOpt: Option[String] =
    Option(underlying.getTargetArn)

  def targetArnOpt_=(value: Option[String]): Unit =
    underlying.setTargetArn(value.orNull)

  def withTargetArnOpt(value: Option[String]): PublishRequest =
    underlying.withTargetArn(value.orNull)

  def messageOpt: Option[String] =
    Option(underlying.getMessage)

  def messageOpt_=(value: Option[String]): Unit =
    underlying.setMessage(value.orNull)

  def withMessageOpt(value: Option[String]): PublishRequest =
    underlying.withMessage(value.orNull)

  def subjectOpt: Option[String] =
    Option(underlying.getSubject)

  def subjectOpt_=(value: Option[String]): Unit =
    underlying.setSubject(value.orNull)

  def withSubjectOpt(value: Option[String]): PublishRequest =
    underlying.withSubject(value.orNull)

  def messageStructureOpt: Option[String] =
    Option(underlying.getMessageStructure)

  def messageStructureOpt_=(value: Option[String]): Unit =
    underlying.setMessageStructure(value.orNull)

  def withMessageStructureOpt(value: Option[String]): PublishRequest =
    underlying.withMessageStructure(value.orNull)

  def attributes: Map[String, MessageAttributeValue] =
    underlying.getMessageAttributes.asScala.toMap

  def attributes_=(value: Map[String, MessageAttributeValue]): Unit =
    underlying.setMessageAttributes(value.asJava)

  def withAttributes(attributes: Map[String, MessageAttributeValue]): PublishRequest =
    underlying.withMessageAttributes(attributes.asJava)

  def attribute_+=(value: (String, MessageAttributeValue)): Unit =
    underlying.addMessageAttributesEntry(value._1, value._2)

}

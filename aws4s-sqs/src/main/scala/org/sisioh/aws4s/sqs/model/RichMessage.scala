package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ Message, MessageAttributeValue }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object MessageFactory {

  def create(): Message = new Message()

}

class RichMessage(val underlying: Message)
    extends AnyVal with PimpedType[Message] {

  def messageIdOpt: Option[String] = Option(underlying.getMessageId)

  def messageIdOpt_=(value: Option[String]): Unit =
    underlying.setMessageId(value.orNull)

  def withMessageIdOpt(value: Option[String]): Message =
    underlying.withMessageId(value.orNull)

  // ---

  def receiptHandleOpt: Option[String] = Option(underlying.getReceiptHandle)

  def receiptHandleOpt_=(value: Option[String]): Unit =
    underlying.setReceiptHandle(value.orNull)

  def withReceiptHandleOpt(value: Option[String]): Message =
    underlying.withReceiptHandle(value.orNull)

  // ---

  def md5OfBodyOpt: Option[String] = Option(underlying.getMD5OfBody)

  def md5OfBodyOpt_=(value: Option[String]): Unit =
    underlying.setMD5OfBody(value.orNull)

  // ---

  def bodyOpt: Option[String] = Option(underlying.getBody)

  def bodyOpt_=(value: Option[String]): Unit =
    underlying.setBody(value.orNull)

  def withBodyOpt(value: Option[String]): Message =
    underlying.withBody(value.orNull)

  // ---

  def attributes: Map[String, String] = underlying.getAttributes.asScala.toMap

  def attributes_=(value: Map[String, String]): Unit =
    underlying.setAttributes(value.asJava)

  def withAttributes(value: Map[String, String]): Message =
    underlying.withAttributes(value.asJava)

  // ---

  def md5OfMessageAttributesOpt: Option[String] = Option(underlying.getMD5OfMessageAttributes)

  def md5OfMessageAttributesOpt_=(value: Option[String]): Unit =
    underlying.setMD5OfMessageAttributes(value.orNull)

  def withMd5OfMessageAttributesOpt(value: Option[String]): Message =
    underlying.withMD5OfMessageAttributes(value.orNull)

  // ---

  def messageAttribute: Map[String, MessageAttributeValue] = underlying.getMessageAttributes.asScala.toMap

  def messageAttribute_=(value: Map[String, MessageAttributeValue]): Unit =
    underlying.setMessageAttributes(value.asJava)

  def withMessageAttribute(value: Map[String, MessageAttributeValue]): Message =
    underlying.withMessageAttributes(value.asJava)
}

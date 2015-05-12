package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{MessageAttributeValue, SendMessageBatchRequestEntry}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSendMessageBatchRequestEntry(val underlying: SendMessageBatchRequestEntry)
  extends AnyVal with PimpedType[SendMessageBatchRequestEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): SendMessageBatchRequestEntry =
    underlying.withId(value.orNull)

  // ---

  def messageBodyOpt: Option[String] = Option(underlying.getMessageBody)

  def messageBodyOpt_=(value: Option[String]): Unit =
    underlying.setMessageBody(value.orNull)

  def withMessageBodyOpt(value: Option[String]): SendMessageBatchRequestEntry =
    underlying.withMessageBody(value.orNull)

  // ---

  def delaySecondsOpt: Option[Int] = Option(underlying.getDelaySeconds)

  def delaySecondsOpt_=(value: Option[Int]): Unit =
    underlying.setDelaySeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withDelaySecondsOpt(value: Option[Int]): SendMessageBatchRequestEntry =
    underlying.withDelaySeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def messageAttributes: Map[String, MessageAttributeValue] = underlying.getMessageAttributes.asScala.toMap

  def messageAttributes_=(value: Map[String, MessageAttributeValue]): Unit =
    underlying.setMessageAttributes(value.asJava)

  def withMessageAttributes(value: Map[String, MessageAttributeValue]): SendMessageBatchRequestEntry =
    underlying.withMessageAttributes(value.asJava)
}

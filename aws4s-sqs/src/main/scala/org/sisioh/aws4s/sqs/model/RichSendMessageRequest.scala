package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{MessageAttributeValue, SendMessageRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichSendMessageRequest(val underlying: SendMessageRequest)
  extends AnyVal with PimpedType[SendMessageRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): SendMessageRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def messageBodyOpt: Option[String] = Option(underlying.getMessageBody)

  def messageBodyOpt_=(value: Option[String]): Unit =
    underlying.setMessageBody(value.orNull)

  def withMessageBodyOpt(value: Option[String]): SendMessageRequest =
    underlying.withMessageBody(value.orNull)

  // ---

  def delaySecondsOpt: Option[Int] = Option(underlying.getDelaySeconds)

  def delaySecondsOpt_=(value: Option[Int]): Unit =
    underlying.setDelaySeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withDelaySecondsOpt(value: Option[Int]): SendMessageRequest =
    underlying.withDelaySeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def messageAttributes: Map[String, MessageAttributeValue] = underlying.getMessageAttributes.asScala.toMap

  def messageAttributes_=(value: Map[String, MessageAttributeValue]): Unit =
    underlying.setMessageAttributes(value.asJava)

  def withMessageAttributes(value: Map[String, MessageAttributeValue]): SendMessageRequest =
    underlying.withMessageAttributes(value.asJava)

}

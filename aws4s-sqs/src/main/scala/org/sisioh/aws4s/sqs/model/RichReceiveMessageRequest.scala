package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.ReceiveMessageRequest
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichReceiveMessageRequest(val underlying: ReceiveMessageRequest)
  extends AnyVal with PimpedType[ReceiveMessageRequest] {

  def queueUrlOpt: Option[String] = Option(underlying.getQueueUrl)

  def queueUrlOpt_=(value: Option[String]): Unit =
    underlying.setQueueUrl(value.orNull)

  def withQueueUrlOpt(value: Option[String]): ReceiveMessageRequest =
    underlying.withQueueUrl(value.orNull)

  // ---

  def attributeNames: Seq[String] = underlying.getAttributeNames.asScala

  def attributeNames_=(value: Seq[String]): Unit =
    underlying.setAttributeNames(value.asJava)

  def withAttributeNames(value: Seq[String]): ReceiveMessageRequest =
    underlying.withAttributeNames(value.asJava)

  // ---

  def messageAttributeNames: Seq[String] = underlying.getMessageAttributeNames.asScala

  def messageAttributeNames_=(value: Seq[String]): Unit =
    underlying.setMessageAttributeNames(value.asJava)

  def withMessageAttributeNames(value: Seq[String]): ReceiveMessageRequest =
    underlying.withMessageAttributeNames(value.asJava)

  // ---

  def maxNumberOfMessagesOpt: Option[Int] = Option(underlying.getMaxNumberOfMessages)

  def maxNumberOfMessagesOpt_=(value: Option[Int]): Unit =
    underlying.setMaxNumberOfMessages(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxNumberOfMessagesOpt(value: Option[Int]): ReceiveMessageRequest =
    underlying.withMaxNumberOfMessages(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def waitTimeSecondsOpt: Option[Int] = Option(underlying.getWaitTimeSeconds)

  def waitTimeSecondsOpt_=(value: Option[Int]): Unit =
    underlying.setWaitTimeSeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withWaitTimeSecondsOpt_=(value: Option[Int]): ReceiveMessageRequest =
    underlying.withWaitTimeSeconds(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

}

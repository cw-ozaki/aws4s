package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.SendMessageBatchResultEntry
import org.sisioh.aws4s.PimpedType

class RichSendMessageBatchResultEntry(val underlying: SendMessageBatchResultEntry)
  extends AnyVal with PimpedType[SendMessageBatchResultEntry] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): SendMessageBatchResultEntry =
    underlying.withId(value.orNull)

  // ---

  def messageIdOpt: Option[String] = Option(underlying.getMessageId)

  def messageIdOpt_=(value: Option[String]): Unit =
    underlying.setMessageId(value.orNull)

  def withMessageIdOpt(value: Option[String]): SendMessageBatchResultEntry =
    underlying.withMessageId(value.orNull)

  // ---

  def md5OfMessageBodyOpt: Option[String] = Option(underlying.getMD5OfMessageBody)

  def md5OfMessageBodyOpt_=(value: Option[String]): Unit =
    underlying.setMD5OfMessageBody(value.orNull)

  def withMD5OfMessageBodyOpt(value: Option[String]): SendMessageBatchResultEntry =
    underlying.withMD5OfMessageBody(value.orNull)

  // ---

  def md5OfMessageAttributesOpt: Option[String] = Option(underlying.getMD5OfMessageAttributes)

  def md5OfMessageAttributesOpt_=(value: Option[String]): Unit =
    underlying.setMD5OfMessageAttributes(value.orNull)

  def withMD5OfMessageAttributesOpt(value: Option[String]): SendMessageBatchResultEntry =
    underlying.withMD5OfMessageAttributes(value.orNull)

}

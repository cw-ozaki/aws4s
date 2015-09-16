package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.PublishResult
import org.sisioh.aws4s.PimpedType

object PublishResultFactory {
  def create(): PublishResult =
    new PublishResult()

}

class RichPublishResult(val underlying: PublishResult)
    extends AnyVal with PimpedType[PublishResult] {

  def messageIdOpt: Option[String] =
    Option(underlying.getMessageId)

  def messageIdOpt_=(value: Option[String]): Unit =
    underlying.setMessageId(value.orNull)

  def withMessageIdOpt(value: Option[String]): PublishResult =
    underlying.withMessageId(value.orNull)

}

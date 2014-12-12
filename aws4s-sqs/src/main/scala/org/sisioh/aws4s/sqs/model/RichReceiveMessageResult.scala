package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{Message, ReceiveMessageResult}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichReceiveMessageResult(val underlying: ReceiveMessageResult) extends AnyVal with PimpedType[ReceiveMessageResult] {

  def messages_=(value: Seq[Message]): Unit = underlying.setMessages(value.asJava)

  def messages: Seq[Message] = underlying.getMessages.asScala

  def withMessages(messages: Iterable[Message]): ReceiveMessageResult =
    underlying.withMessages(messages.toSeq.asJava)

}

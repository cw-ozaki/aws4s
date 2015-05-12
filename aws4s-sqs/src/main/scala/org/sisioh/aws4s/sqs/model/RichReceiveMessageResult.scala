package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.{ Message, ReceiveMessageResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichReceiveMessageResult(val underlying: ReceiveMessageResult)
    extends AnyVal with PimpedType[ReceiveMessageResult] {

  def messagesOpt_=(value: Seq[Message]): Unit = underlying.setMessages(value.asJava)

  def messagesOpt: Seq[Message] = underlying.getMessages.asScala

  def withMessagesOpt(messages: Iterable[Message]): ReceiveMessageResult =
    underlying.withMessages(messages.toSeq.asJava)

}

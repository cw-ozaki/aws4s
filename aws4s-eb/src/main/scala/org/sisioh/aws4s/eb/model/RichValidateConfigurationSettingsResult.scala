package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ ValidateConfigurationSettingsResult, ValidationMessage }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ValidateConfigurationSettingsResultFactory {

  def create(): ValidateConfigurationSettingsResult = new ValidateConfigurationSettingsResult()

}

class RichValidateConfigurationSettingsResult(val underlying: ValidateConfigurationSettingsResult)
    extends AnyVal with PimpedType[ValidateConfigurationSettingsResult] {

  def messagesOpt: Seq[ValidationMessage] = underlying.getMessages.asScala

  def messagesOpt_=(value: Seq[ValidationMessage]): Unit = underlying.setMessages(value.asJava)

  def withMessagesOpt(messages: Iterable[ValidationMessage]): ValidateConfigurationSettingsResult =
    underlying.withMessages(messages.toSeq.asJava)

}

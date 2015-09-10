package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreateTopicRequest
import org.sisioh.aws4s.PimpedType

object CreateTopicRequestFactory {

  def create(): CreateTopicRequest =
    new CreateTopicRequest()

  def create(name: String): CreateTopicRequest =
    new CreateTopicRequest(name)
}

class RichCreateTopicRequest(val underlying: CreateTopicRequest)
    extends AnyVal with PimpedType[CreateTopicRequest] {

  def nameOpt: Option[String] =
    Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

  def withNameOpt(value: Option[String]): CreateTopicRequest =
    underlying.withName(value.orNull)

}

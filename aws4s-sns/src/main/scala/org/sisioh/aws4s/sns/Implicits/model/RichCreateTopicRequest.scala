package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.{CreateTopicRequest, CreatePlatformEndpointResult}
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

  def withName(name: Option[String]): CreateTopicRequest =
    underlying.withName(name.orNull)

}

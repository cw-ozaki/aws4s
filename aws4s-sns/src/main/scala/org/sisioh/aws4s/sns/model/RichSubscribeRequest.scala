package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.SubscribeRequest
import org.sisioh.aws4s.PimpedType

object SubscribeRequestFactory {
  def create(): SubscribeRequest =
    new SubscribeRequest()

  def create(topicArn: String, protocol: String, endpoint: String): SubscribeRequest =
    new SubscribeRequest(topicArn, protocol, endpoint)
}

class RichSubscribeRequest(val underlying: SubscribeRequest)
    extends AnyVal with PimpedType[SubscribeRequest] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(value: Option[String]): SubscribeRequest =
    underlying.withTopicArn(value.orNull)

  def protocolOpt: Option[String] = Option(underlying.getProtocol())

  def protocolOpt_=(value: Option[String]): Unit =
    underlying.setProtocol(value.orNull)

  def withProtocolOpt(value: Option[String]): SubscribeRequest =
    underlying.withProtocol(value.orNull)

  def endpointOpt: Option[String] = Option(underlying.getEndpoint)

  def endpointOpt_=(value: Option[String]): Unit =
    underlying.setEndpoint(value.orNull)

  def withEndpointOpt(value: Option[String]): SubscribeRequest =
    underlying.withEndpoint(value.orNull)
}

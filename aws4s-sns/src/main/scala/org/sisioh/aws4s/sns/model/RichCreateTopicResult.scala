package org.sisioh.aws4s.sns.model

import com.amazonaws.services.sns.model.CreateTopicResult
import org.sisioh.aws4s.PimpedType

object CreateTopicResultFactory {

  def create(): CreateTopicResult =
    new CreateTopicResult()

}

class RichCreateTopicResult(val underlying: CreateTopicResult)
    extends AnyVal with PimpedType[CreateTopicResult] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def topicArnOpt_=(value: Option[String]): Unit =
    underlying.setTopicArn(value.orNull)

  def withTopicArnOpt(topicArn: Option[String]): CreateTopicResult =
    underlying.withTopicArn(topicArn.orNull)

}

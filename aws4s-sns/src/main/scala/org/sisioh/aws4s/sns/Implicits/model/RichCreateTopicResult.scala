package org.sisioh.aws4s.sns.Implicits.model

import com.amazonaws.services.sns.model.CreateTopicResult
import org.sisioh.aws4s.PimpedType

class RichCreateTopicResult(val underlying: CreateTopicResult)
  extends AnyVal with PimpedType[CreateTopicResult] {

  def topicArnOpt: Option[String] =
    Option(underlying.getTopicArn)

  def withTopicArn(topicArn: Option[String]): CreateTopicResult =
    underlying.withTopicArn(topicArn.orNull)

}

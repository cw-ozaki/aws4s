package org.sisioh.aws4s.sqs

import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model.{ReceiveMessageRequest, ReceiveMessageResult}
import org.sisioh.aws4s.sqs.model.{RichReceiveMessageRequest, RichReceiveMessageResult}

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAmazonSQSClient(underlying: AmazonSQSClient): RichAmazonSQSClient = new RichAmazonSQSClient(underlying)

}

trait ModelImplicits {

  implicit def RichReceiveMessageRequest(underlying: ReceiveMessageRequest): RichReceiveMessageRequest =
    new RichReceiveMessageRequest(underlying)

  implicit def richReceiveMessageResult(underlying: ReceiveMessageResult): RichReceiveMessageResult =
    new RichReceiveMessageResult(underlying)

}



package org.sisioh.aws4s.sqs

import com.amazonaws.services.sqs.AmazonSQSClient
import com.amazonaws.services.sqs.model.ReceiveMessageResult
import org.sisioh.aws4s.sqs.model.RichReceiveMessageResult

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAmazonSQSClient(underlying: AmazonSQSClient): RichAmazonSQSClient = new RichAmazonSQSClient(underlying)

}

trait ModelImplicits {

  implicit def richReceiveMessageResult(underlying: ReceiveMessageResult): RichReceiveMessageResult = new RichReceiveMessageResult(underlying)

}



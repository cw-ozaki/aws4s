package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult
import org.sisioh.aws4s.PimpedType

object BatchWriteItemResultFactory{

  def apply(): BatchWriteItemResult = new BatchWriteItemResult()



}

class RichBatchWriteItemResult(val underlying: BatchWriteItemResult) extends AnyVal with PimpedType[BatchWriteItemResult] {

}

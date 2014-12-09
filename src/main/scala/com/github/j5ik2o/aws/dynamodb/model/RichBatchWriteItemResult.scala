package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult
import com.github.j5ik2o.aws.PimpedType

object BatchWriteItemResultFactory{

  def apply(): BatchWriteItemResult = new BatchWriteItemResult()



}

class RichBatchWriteItemResult(val underlying: BatchWriteItemResult) extends AnyVal with PimpedType[BatchWriteItemResult] {

}

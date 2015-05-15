package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{ BatchGetItemOutcome, Item }
import com.amazonaws.services.dynamodbv2.model.{ BatchGetItemResult, KeysAndAttributes }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemOutcomeFactory {

  def apply(result: BatchGetItemResult): BatchGetItemOutcome = new BatchGetItemOutcome(result)

}

class RichBatchGetItemOutcome(val underlying: BatchGetItemOutcome) extends AnyVal with PimpedType[BatchGetItemOutcome] {

  def tableItems: Map[String, Seq[Item]] =
    underlying.getTableItems.asScala.map(e => (e._1, e._2.asScala)).toMap

  def unprocessedKeys: Map[String, KeysAndAttributes] =
    underlying.getUnprocessedKeys.asScala.toMap

  def batchGetItemResult: BatchGetItemResult = underlying.getBatchGetItemResult

}

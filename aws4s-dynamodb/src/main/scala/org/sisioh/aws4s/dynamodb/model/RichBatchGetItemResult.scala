package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, BatchGetItemResult, ConsumedCapacity, KeysAndAttributes}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemResultFactory {

  def apply(): BatchGetItemResult = new BatchGetItemResult()

}

class RichBatchGetItemResult(val underlying: BatchGetItemResult) extends AnyVal with PimpedType[BatchGetItemResult] {

  def responses_=(values: Map[String, Seq[Map[String, AttributeValue]]]): Unit =
    underlying.setResponses(values.map { case (k, v) => (k, v.map(_.asJava).asJava)}.asJava)

  def responses: Map[String, Seq[Map[String, AttributeValue]]] = underlying.getResponses.asScala.map { case (k, v) =>
    (k, v.asScala.toSeq.map(_.asScala.toMap))
  }.toMap

  def withResponses(responses: Map[String, Seq[Map[String, AttributeValue]]]): BatchGetItemResult = {
    underlying.withResponses(responses.map { case (k, v) =>
      (k, v.map(_.asJava).asJava)
    }.asJava)
  }

  def addResponsesEntry(key: String, value: Seq[Map[String, AttributeValue]]): BatchGetItemResult =
    underlying.addResponsesEntry(key, value.map(_.asJava).asJava)

  def unprocessedKeys_=(values: Map[String, KeysAndAttributes]): Unit =
    underlying.setUnprocessedKeys(values.asJava)

  def unprocessedKeys: Map[String, KeysAndAttributes] =
    underlying.getUnprocessedKeys.asScala.toMap

  def withUnprocessedKeys(unprocessedKeys: Map[String, KeysAndAttributes]): BatchGetItemResult =
    underlying.withUnprocessedKeys(unprocessedKeys.asJava)

  def consumedCapacity_=(values: Seq[ConsumedCapacity]): Unit =
    underlying.setConsumedCapacity(values.asJava)

  def consumedCapacity: Seq[ConsumedCapacity] =
    underlying.getConsumedCapacity.asScala

  def withConsumedCapacity(consumedCapacity: Iterable[ConsumedCapacity]): BatchGetItemResult =
    underlying.withConsumedCapacity(consumedCapacity.toSeq.asJava)

}

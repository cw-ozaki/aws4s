package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{AttributeValue, BatchGetItemResult, ConsumedCapacity, KeysAndAttributes}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemResultFactory {

  def create(): BatchGetItemResult = new BatchGetItemResult()

}

class RichBatchGetItemResult(val underlying: BatchGetItemResult) extends AnyVal with PimpedType[BatchGetItemResult] {

  // ---

  def responsesOpt_=(values: Option[Map[String, Seq[Map[String, AttributeValue]]]]): Unit =
    underlying.setResponses(values.map(_.map { case (k, v) => (k, v.map(_.asJava).asJava)}.asJava).orNull)

  def responsesOpt: Option[Map[String, Seq[Map[String, AttributeValue]]]] = Option(underlying.getResponses).map(_.asScala.map { case (k, v) =>
    (k, v.asScala.toSeq.map(_.asScala.toMap))
  }.toMap)

  def withResponsesOpt(responses: Option[Map[String, Seq[Map[String, AttributeValue]]]]): BatchGetItemResult = {
    underlying.withResponses(responses.map(_.map { case (k, v) =>
      (k, v.map(_.asJava).asJava)
    }.asJava).orNull)
  }

  // ---

  def addResponsesEntry(key: String, value: Seq[Map[String, AttributeValue]]): BatchGetItemResult =
    underlying.addResponsesEntry(key, value.map(_.asJava).asJava)

  // ---

  def unprocessedKeysOpt_=(values: Option[Map[String, KeysAndAttributes]]): Unit =
    underlying.setUnprocessedKeys(values.map(_.asJava).orNull)

  def unprocessedKeysOpt: Option[Map[String, KeysAndAttributes]] =
    Option(underlying.getUnprocessedKeys).map(_.asScala.toMap)

  def withUnprocessedKeysOpt(unprocessedKeys: Option[Map[String, KeysAndAttributes]]): BatchGetItemResult =
    underlying.withUnprocessedKeys(unprocessedKeys.map(_.asJava).orNull)

  // ---

  def consumedCapacityOpt_=(values: Option[Seq[ConsumedCapacity]]): Unit =
    underlying.setConsumedCapacity(values.map(_.asJava).orNull)

  def consumedCapacityOpt: Option[Seq[ConsumedCapacity]] =
    Option(underlying.getConsumedCapacity).map(_.asScala)

  def withConsumedCapacityOpt(consumedCapacity: Option[Iterable[ConsumedCapacity]]): BatchGetItemResult =
    underlying.withConsumedCapacity(consumedCapacity.map(_.toSeq.asJava).orNull)

  // ---

}

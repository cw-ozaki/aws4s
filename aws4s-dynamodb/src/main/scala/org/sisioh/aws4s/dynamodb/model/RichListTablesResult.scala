package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ListTablesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListTablesResultFactory {

  def create(): ListTablesResult = new ListTablesResult()

}


class RichListTablesResult(val underlying: ListTablesResult) extends AnyVal with PimpedType[ListTablesResult] {

  // ---

  def tableNamesOpt: Option[Seq[String]] = Option(underlying.getTableNames).map(_.asScala.toVector)

  def tableNamesOpt_=(value: Option[Seq[String]]): Unit = underlying.setTableNames(value.map(_.asJava).orNull)

  def withTableNamesOpt(tableNames: Option[Iterable[String]]): ListTablesResult =
    underlying.withTableNames(tableNames.map(_.toSeq.asJava).orNull)

  // ---

  def lastEvaluatedTableNameOpt: Option[String] = Option(underlying.getLastEvaluatedTableName)

  def lastEvaluatedTableNameOpt_=(value: Option[String]): Unit = underlying.setLastEvaluatedTableName(value.orNull)

  def withLastEvaluatedTableNameOpt(value: Option[String]): ListTablesResult = underlying.withLastEvaluatedTableName(value.orNull)

  // ---

}

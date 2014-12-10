package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ListTablesResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ListTablesResultFactory {

  def apply(): ListTablesResult = new ListTablesResult()

}


class RichListTablesResult(val underlying: ListTablesResult) extends AnyVal with PimpedType[ListTablesResult] {

  def tableNames_=(value: Seq[String]): Unit = underlying.setTableNames(value.asJava)

  def tableNames: Seq[String] = underlying.getTableNames.asScala

  def withTableNames(tableNames: Iterable[String]): ListTablesResult =
    underlying.withTableNames(tableNames.toSeq.asJava)

  def lastEvaluatedTableName_=(value: String): Unit = underlying.setLastEvaluatedTableName(value)

  def lastEvaluatedTableName: String = underlying.getLastEvaluatedTableName

}

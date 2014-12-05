package com.github.j5ik2o.aws.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ListTablesResult
import com.github.j5ik2o.aws.dynamodb.PimpedType

import scala.collection.JavaConverters._

object ListTablesResultFactory {

 def apply(): ListTablesResult = new ListTablesResult()

}


class RichListTablesResult(val underlying: ListTablesResult) extends AnyVal with PimpedType[ListTablesResult] {

 def tableNames: Seq[String] =
  underlying.getTableNames.asScala

 def  withTableNames (tableNames: Iterable[String]): ListTablesResult =
  underlying.withTableNames(tableNames.toSeq.asJava)

 def lastEvaluatedTableName: String = underlying.getLastEvaluatedTableName

}

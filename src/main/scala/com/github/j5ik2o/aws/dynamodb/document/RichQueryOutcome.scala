package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, QueryOutcome}
import com.amazonaws.services.dynamodbv2.model.QueryResult
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object QueryOutcomeFactory {

  def apply(result: QueryResult): QueryOutcome = new QueryOutcome(result)

}

class RichQueryOutcome(val underlying: QueryOutcome) extends AnyVal with PimpedType[QueryOutcome] {

  def items: Seq[Item] = underlying.getItems.asScala

  def queryResult: QueryResult = underlying.getQueryResult

}

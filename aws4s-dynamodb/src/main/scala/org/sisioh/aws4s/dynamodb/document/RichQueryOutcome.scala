package org.sisioh.aws4s.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, QueryOutcome}
import com.amazonaws.services.dynamodbv2.model.QueryResult
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object QueryOutcomeFactory {

  def apply(result: QueryResult): QueryOutcome = new QueryOutcome(result)

}

class RichQueryOutcome(val underlying: QueryOutcome) extends AnyVal with PimpedType[QueryOutcome] {

  def items: Seq[Item] = underlying.getItems.asScala.toVector

  def queryResult: QueryResult = underlying.getQueryResult

}

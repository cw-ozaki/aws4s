package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.Projection
import org.sisioh.aws4s.dynamodb.Implicits._

case class ProjectionEx(underlying: Projection) {

  val projectionType: Option[String] = underlying.projectionTypeOpt

  val nonKeyAttributes: Option[Seq[String]] = underlying.nonKeyAttributesOpt

}

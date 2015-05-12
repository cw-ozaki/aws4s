package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._

case class Projection(underlying: aws.model.Projection) {

  val projectionType: Option[String] = underlying.projectionTypeOpt

  val nonKeyAttributes: Option[Seq[String]] = underlying.nonKeyAttributesOpt

}

package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.Projection
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ProjectionFactory {

  def create(): Projection = new Projection()

}

class RichProjection(val underlying: Projection) extends AnyVal with PimpedType[Projection] {

  // ---

  def projectionTypeOpt: Option[String] = Option(underlying.getProjectionType)

  def projectionTypeOpt_=(value: Option[String]): Unit = underlying.setProjectionType(value.orNull)

  def withProjectionTypeOpt(value: Option[String]): Projection = underlying.withProjectionType(value.orNull)

  // ---

  def nonKeyAttributesOpt: Option[Seq[String]] = Option(underlying.getNonKeyAttributes).map(_.asScala)

  def nonKeyAttributesOpt_=(value: Option[Seq[String]]): Unit = underlying.setNonKeyAttributes(value.map(_.asJava).orNull)

  def withNonKeyAttributesOpt(value: Option[Iterable[String]]): Projection = underlying.withNonKeyAttributes(value.map(_.toSeq.asJava).orNull)

  // ---

}

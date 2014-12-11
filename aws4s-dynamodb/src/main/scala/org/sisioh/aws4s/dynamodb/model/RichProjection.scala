package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.Projection
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ProjectionFactory {

  def apply(): Projection = new Projection()

}

class RichProjection(val underlying: Projection) extends AnyVal with PimpedType[Projection] {

  def projectionType: String = underlying.getProjectionType

  def projectionType_=(value: String): Unit = underlying.setProjectionType(value)

  def nonKeyAttributes: Seq[String] = underlying.getNonKeyAttributes.asScala

  def nonKeyAttributes_=(value: Seq[String]): Unit = underlying.setNonKeyAttributes(value.asJava)

  def withNonKeyAttributes(nonKeyAttributes: Iterable[String]) = underlying.withNonKeyAttributes(nonKeyAttributes.toSeq.asJava)

}

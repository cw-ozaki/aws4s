package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.Capacity
import org.sisioh.aws4s.PimpedType

object CapacityFactory {

  def create(): Capacity = new Capacity()

}

class RichCapacity(val underlying: Capacity) extends AnyVal with PimpedType[Capacity] {

  // ---

  def capacityUnitsOpt: Option[Double] = Option(underlying.getCapacityUnits)

  def capacityUnitsOpt_=(value: Option[Double]): Unit = underlying.setCapacityUnits(value.map(_.asInstanceOf[java.lang.Double]).orNull)

  def withCapacityUnitsOpt(value: Option[Double]): Capacity = underlying.withCapacityUnits(value.map(_.asInstanceOf[java.lang.Double]).orNull)

  // ---

}

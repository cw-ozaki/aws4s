package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.Capacity
import org.sisioh.aws4s.PimpedType

object CapacityFactory {

  def apply(): Capacity = new Capacity()

}

class RichCapacity(val underlying: Capacity) extends AnyVal with PimpedType[Capacity] {

  def capacityUnits: Double = underlying.getCapacityUnits

  def capacityUnits_=(value: Double): Unit = underlying.setCapacityUnits(value)

}

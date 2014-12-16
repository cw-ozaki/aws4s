package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput
import org.sisioh.aws4s.PimpedType

object ProvisionedThroughputFactory {

  def create(): ProvisionedThroughput = new ProvisionedThroughput()

  def create(readCapacityUnits: Long, writeCapacityUnits: Long): ProvisionedThroughput = new ProvisionedThroughput(readCapacityUnits, writeCapacityUnits)

}

class RichProvisionedThroughput(val underlying: ProvisionedThroughput) extends AnyVal with PimpedType[ProvisionedThroughput] {

  // ---

  def readCapacityUnitsOpt: Option[Long] = Option(underlying.getReadCapacityUnits)

  def readCapacityUnitsOpt_=(value: Option[Long]): Unit = underlying.setReadCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withReadCapacityUnitsOpt(value: Option[Long]): ProvisionedThroughput = underlying.withReadCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def writeCapacityUnitsOpt: Option[Long] = Option(underlying.getWriteCapacityUnits)

  def writeCapacityUnitsOpt_=(value: Option[Long]): Unit = underlying.setWriteCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withWriteCapacityUnitsOpt_=(value: Option[Long]): ProvisionedThroughput = underlying.withWriteCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---
}

package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput
import org.sisioh.aws4s.PimpedType

object ProvisionedThroughputFactory {

  def apply(): ProvisionedThroughput = new ProvisionedThroughput()

  def apply(readCapacityUnits: Long, writeCapacityUnits: Long): ProvisionedThroughput = new ProvisionedThroughput(readCapacityUnits, writeCapacityUnits)

}

class RichProvisionedThroughput(val underlying: ProvisionedThroughput) extends AnyVal with PimpedType[ProvisionedThroughput] {

  def readCapacityUnits: Long = underlying.getReadCapacityUnits

  def readCapacityUnits_=(value: Long): Unit = underlying.getReadCapacityUnits

  def writeCapacityUnits: Long = underlying.getWriteCapacityUnits

  def writeCapacityUnits_=(value: Long): Unit = underlying.setWriteCapacityUnits(value)


}

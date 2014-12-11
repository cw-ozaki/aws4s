package org.sisioh.aws4s.dynamodb.model

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription
import org.sisioh.aws4s.PimpedType

object ProvisionedThroughputDescriptionFactory {

  def apply(): ProvisionedThroughputDescription = new ProvisionedThroughputDescription()

}

class RichProvisionedThroughputDescription(val underlying: ProvisionedThroughputDescription) extends AnyVal with PimpedType[ProvisionedThroughputDescription] {

  def lastIncreaseDateTime: Date = underlying.getLastIncreaseDateTime

  def lastIncreaseDateTime_=(value: Date): Unit = underlying.setLastIncreaseDateTime(value)

  def lastDecreaseDateTime: Date = underlying.getLastDecreaseDateTime

  def lastDecreaseDateTime_=(value: Date): Unit = underlying.setLastDecreaseDateTime(value)

  def numberOfDecreasesToday: Long = underlying.getNumberOfDecreasesToday

  def numberOfDecreasesToday_=(value: Long) = underlying.setNumberOfDecreasesToday(value)

  def readCapacityUnits: Long = underlying.getReadCapacityUnits

  def readCapacityUnits_=(value: Long): Unit = underlying.setReadCapacityUnits(value)

  def writeCapacityUnits: Long = underlying.getWriteCapacityUnits

  def writeCapacityUnits_=(value: Long): Unit = underlying.setWriteCapacityUnits(value)

}

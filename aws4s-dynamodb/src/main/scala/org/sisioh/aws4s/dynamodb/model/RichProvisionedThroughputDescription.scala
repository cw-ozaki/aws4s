package org.sisioh.aws4s.dynamodb.model

import java.util.Date

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputDescription
import org.sisioh.aws4s.PimpedType

object ProvisionedThroughputDescriptionFactory {

  def create(): ProvisionedThroughputDescription = new ProvisionedThroughputDescription()

}

class RichProvisionedThroughputDescription(val underlying: ProvisionedThroughputDescription) extends AnyVal with PimpedType[ProvisionedThroughputDescription] {

  def lastIncreaseDateTimeOpt: Option[Date] = Option(underlying.getLastIncreaseDateTime)

  def lastIncreaseDateTimeOpt_=(value: Option[Date]): Unit = underlying.setLastIncreaseDateTime(value.orNull)

  def lastDecreaseDateTimeOpt: Option[Date] = Option(underlying.getLastDecreaseDateTime)

  def lastDecreaseDateTimeOpt_=(value: Option[Date]): Unit = underlying.setLastDecreaseDateTime(value.orNull)

  def numberOfDecreasesTodayOpt: Option[Long] = Option(underlying.getNumberOfDecreasesToday)

  def numberOfDecreasesTodayOpt_=(value: Option[Long]) = underlying.setNumberOfDecreasesToday(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def readCapacityUnitsOpt: Option[Long] = Option(underlying.getReadCapacityUnits)

  def readCapacityUnitsOpt_=(value: Option[Long]): Unit = underlying.setReadCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def writeCapacityUnitsOpt: Option[Long] = Option(underlying.getWriteCapacityUnits)

  def writeCapacityUnitsOpt_=(value: Option[Long]): Unit = underlying.setWriteCapacityUnits(value.map(_.asInstanceOf[java.lang.Long]).orNull)

}

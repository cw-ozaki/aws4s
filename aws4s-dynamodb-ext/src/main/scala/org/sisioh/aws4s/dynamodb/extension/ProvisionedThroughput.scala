package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.{dynamodbv2 => aws}
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.ProvisionedThroughputFactory

case class ProvisionedThroughput(underlying: aws.model.ProvisionedThroughputDescription) {

  val lastDecreaseDateTimeOpt = underlying.lastDecreaseDateTimeOpt

  val lastIncreaseDateTimeOpt = underlying.lastIncreaseDateTimeOpt

  val numberOfDecreasesTodayOpt = underlying.numberOfDecreasesTodayOpt

  val readCapacityUnitsOpt: Option[Long] = underlying.readCapacityUnitsOpt

  val writeCapacityUnitsOpt: Option[Long] = underlying.writeCapacityUnitsOpt

  def toProvisionedThroughput: aws.model.ProvisionedThroughput = {
    ProvisionedThroughputFactory.create().
      withReadCapacityUnits(underlying.getReadCapacityUnits).
      withWriteCapacityUnits(underlying.getWriteCapacityUnits)
  }

}

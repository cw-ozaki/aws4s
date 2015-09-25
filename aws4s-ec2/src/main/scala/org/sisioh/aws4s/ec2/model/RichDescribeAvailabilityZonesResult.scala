package org.sisioh.aws4s.ec2.model

import com.amazonaws.services.ec2.model.{ AvailabilityZone, DescribeAvailabilityZonesResult }

import scala.collection.JavaConverters._

object DescribeAvailabilityZonesResultFactory {

  def create(): DescribeAvailabilityZonesResult = new DescribeAvailabilityZonesResult()

}

class RichDescribeAvailabilityZonesResult(val underlying: DescribeAvailabilityZonesResult) {

  def availabilityZones: Seq[AvailabilityZone] = underlying.getAvailabilityZones.asScala.toVector

  def availabilityZones_=(values: Seq[AvailabilityZone]): Unit = underlying.setAvailabilityZones(values.asJava)

  def withAvailabilityZones(values: Seq[AvailabilityZone]): DescribeAvailabilityZonesResult = underlying.withAvailabilityZones(values.asJava)

}

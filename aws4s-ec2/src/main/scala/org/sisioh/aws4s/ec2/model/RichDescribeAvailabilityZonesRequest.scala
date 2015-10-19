package org.sisioh.aws4s.ec2.model

import com.amazonaws.services.ec2.model.{ DescribeAvailabilityZonesRequest, Filter }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeAvailabilityZonesRequestFactory {

  def create(): DescribeAvailabilityZonesRequest = new DescribeAvailabilityZonesRequest()

}

class RichDescribeAvailabilityZonesRequest(val underlying: DescribeAvailabilityZonesRequest)
    extends AnyVal with PimpedType[DescribeAvailabilityZonesRequest] {

  def zoneNames: Seq[String] = underlying.getZoneNames.asScala.toVector

  def zoneNames_=(values: Seq[String]): Unit = underlying.setZoneNames(values.asJava)

  def withZoneNames(values: Seq[String]): DescribeAvailabilityZonesRequest = underlying.withZoneNames(values.asJava)

  def filters: Seq[Filter] = underlying.getFilters.asScala.toVector

  def filters_=(values: Seq[Filter]): Unit = underlying.setFilters(values.asJava)

  def withFilters(values: Seq[Filter]): DescribeAvailabilityZonesRequest = underlying.withFilters(values.asJava)

}

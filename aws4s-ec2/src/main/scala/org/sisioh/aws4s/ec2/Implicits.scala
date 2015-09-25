package org.sisioh.aws4s.ec2

import com.amazonaws.services.ec2.AmazonEC2Client
import com.amazonaws.services.ec2.model.{DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult}
import org.sisioh.aws4s.ec2.model.{RichDescribeAvailabilityZonesRequest, RichDescribeAvailabilityZonesResult}

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richRichAmazonEC2Client(underlying: AmazonEC2Client): RichAmazonEC2Client =
    new RichAmazonEC2Client(underlying)

}

trait ModelImplicits {

  implicit def richDescribeAvailabilityZonesRequest(underlying: DescribeAvailabilityZonesRequest): RichDescribeAvailabilityZonesRequest = new RichDescribeAvailabilityZonesRequest(underlying)

  implicit def richDescribeAvailabilityZonesResult(underlying: DescribeAvailabilityZonesResult): RichDescribeAvailabilityZonesResult = new RichDescribeAvailabilityZonesResult(underlying)

}

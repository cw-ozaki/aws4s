package org.sisioh.aws4s.s3

import com.amazonaws.regions.Region
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.{Bucket, ListBucketsRequest, Owner}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichAmazonS3Client(val underlying: AmazonS3Client) extends AnyVal with PimpedType[AmazonS3Client] {

  def region_=(value: Region): Unit = underlying.setRegion(value)

  def region: com.amazonaws.services.s3.model.Region = underlying.getRegion

  def s3AccountOwner: Owner = underlying.getS3AccountOwner

  def listBuckets(listBucketsRequest: ListBucketsRequest): Seq[Bucket] = underlying.listBuckets(listBucketsRequest).asScala

  def listBuckets: Seq[Bucket] = underlying.listBuckets().asScala

}

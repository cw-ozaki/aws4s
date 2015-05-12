package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{ SSECustomerKey, CopyObjectRequest, CopyPartRequest }
import org.sisioh.aws4s.PimpedType

object CopyPartRequestFactory {

  def create(): CopyPartRequest = new CopyPartRequest()

}

class RichCopyPartRequest(val underlying: CopyPartRequest)
    extends AnyVal with PimpedType[CopyPartRequest] {

  def uploadIdOpt = Option(underlying.getUploadId)

  def uploadIdOpt_=(value: Option[String]): Unit =
    underlying.setUploadId(value.orNull)

  def withUploadIdOpt(value: Option[String]): CopyPartRequest =
    underlying.withUploadId(value.orNull)

  // ---

  def partNumberOpt: Option[Int] = Option(underlying.getPartNumber)

  def partNumberOpt_=(value: Option[Int]): Unit =
    underlying.setPartNumber(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withPartNumberOpt_=(value: Option[Int]): CopyPartRequest =
    underlying.withPartNumber(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  // ---

  def sourceBucketNameOpt: Option[String] = Option(underlying.getSourceBucketName)

  def sourceBucketNameOpt_=(value: Option[String]): Unit =
    underlying.setSourceBucketName(value.orNull)

  def withSourceBucketNameOpt(value: Option[String]): CopyPartRequest =
    underlying.withSourceBucketName(value.orNull)

  // ---

  def sourceKeyOpt: Option[String] = Option(underlying.getSourceKey)

  def sourceKeyOpt_=(value: Option[String]): Unit =
    underlying.setSourceKey(value.orNull)

  def withSourceKeyOpt(value: Option[String]): CopyPartRequest =
    underlying.withSourceKey(value.orNull)

  // ---

  def sourceVersionIdOpt: Option[String] = Option(underlying.getSourceVersionId)

  def sourceVersionIdOpt(value: Option[String]): Unit =
    underlying.setSourceVersionId(value.orNull)

  def withSourceVersionIdOpt(value: Option[String]): CopyPartRequest =
    underlying.withSourceVersionId(value.orNull)

  // --

  def destinationBucketNameOpt: Option[String] = Option(underlying.getDestinationBucketName)

  def destinationBucketNameOpt_=(value: Option[String]): Unit =
    underlying.setDestinationBucketName(value.orNull)

  def withDestinationBucketNameOpt_=(value: Option[String]): CopyPartRequest =
    underlying.withDestinationBucketName(value.orNull)

  // ---

  def destinationKeyOpt: Option[String] = Option(underlying.getDestinationKey)

  def destinationKeyOpt_=(value: Option[String]): Unit =
    underlying.setDestinationKey(value.orNull)

  def withDestinationKeyOpt(value: Option[String]): CopyPartRequest =
    underlying.withDestinationKey(value.orNull)

  // ---

  def unmodifiedSinceConstraintOpt: Option[Date] = Option(underlying.getUnmodifiedSinceConstraint)

  def unmodifiedSinceConstraintOpt_=(value: Option[Date]): Unit =
    underlying.setUnmodifiedSinceConstraint(value.orNull)

  def withUnmodifiedSinceConstraintOpt(value: Option[Date]): CopyPartRequest =
    underlying.withUnmodifiedSinceConstraint(value.orNull)

  // ---

  def modifiedSinceConstraintOpt = Option(underlying.getModifiedSinceConstraint)

  def modifiedSinceConstraintOpt_=(value: Option[Date]): Unit =
    underlying.setModifiedSinceConstraint(value.orNull)

  def withModifiedSinceConstraintOpt(value: Option[Date]): CopyPartRequest =
    underlying.withModifiedSinceConstraint(value.orNull)

  // ---

  def firstByteOpt: Option[Long] = Option(underlying.getFirstByte)

  def firstByteOpt_=(value: Option[Long]): Unit =
    underlying.setFirstByte(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withFirstByteOpt(value: Option[Long]): CopyPartRequest =
    underlying.withFirstByte(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def lastByteOpt: Option[Long] = Option(underlying.getLastByte)

  def lastByteOpt_=(value: Option[Long]): Unit =
    underlying.setLastByte(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  def withLastByteOpt(value: Option[Long]): CopyPartRequest =
    underlying.withLastByte(value.map(_.asInstanceOf[java.lang.Long]).orNull)

  // ---

  def sourceSSECustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSourceSSECustomerKey)

  def sourceSSECustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSourceSSECustomerKey(value.orNull)

  def withSourceSSECustomerKeyOpt(value: Option[SSECustomerKey]): CopyPartRequest =
    underlying.withSourceSSECustomerKey(value.orNull)

  // ---

  def destinationSSECustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getDestinationSSECustomerKey)

  def destinationSSECustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setDestinationSSECustomerKey(value.orNull)

  def withDestinationSSECustomerKeyOpt(value: Option[SSECustomerKey]): CopyPartRequest =
    underlying.withDestinationSSECustomerKey(value.orNull)
}

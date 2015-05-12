package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CopyObjectRequestFactory {

  def creates(sourceBucketName: String, sourceKey: String, destinationBucketName: String, destinationKey: String): CopyObjectRequest =
    new CopyObjectRequest(sourceBucketName, sourceKey, destinationKey, destinationKey)

  def create(sourceBucketName: String, sourceKey: String, sourceVersionId: String, destinationBucketName: String, destinationKey: String): CopyObjectRequest =
    new CopyObjectRequest(sourceBucketName, sourceKey, sourceVersionId, destinationBucketName, destinationKey)

}

class RichCopyObjectRequest(val underlying: CopyObjectRequest)
  extends AnyVal with PimpedType[CopyObjectRequest] {

  def matchingETagConstraints: Seq[String] =
    underlying.getMatchingETagConstraints.asScala.toVector

  def matchingETagConstraints_=(value: Seq[String]): Unit =
    underlying.setMatchingETagConstraints(value.asJava)

  // ---

  def nonmatchingEtagConstraints: Seq[String] =
    underlying.getNonmatchingETagConstraints.asScala.toVector

  def nonmatchingEtagConstraints_=(value: Seq[String]): Unit =
    underlying.setNonmatchingETagConstraints(value.asJava)

  // ---

  def sourceBucketName: String = underlying.getSourceBucketName

  def sourceBucketName_=(value: String): Unit =
    underlying.setSourceBucketName(value)

  // ---

  def sourceKey: String = underlying.getSourceKey

  def sourceKey_=(value: String): Unit =
    underlying.setSourceKey(value)

  // ---

  def sourceVersionId: String = underlying.getSourceVersionId

  def sourceVersionId_=(value: String): Unit =
    underlying.setSourceVersionId(value)

  // ---

  def destinationBucketName: String = underlying.getDestinationBucketName

  def destinationBucketName_=(value: String): Unit =
    underlying.setDestinationBucketName(value)

  // ---

  def destinationKey: String = underlying.getDestinationKey

  def destinationKey_=(value: String): Unit =
    underlying.setDestinationKey(value)

  // ---

  def storageClassOpt = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  def withStorageClassOpt(value: Option[String]): CopyObjectRequest =
    underlying.withStorageClass(value.orNull)

  // ---

  def newObjectMetadataOpt: Option[ObjectMetadata] = Option(underlying.getNewObjectMetadata)

  def newObjectMetadataOpt_=(value: Option[ObjectMetadata]): Unit =
    underlying.setNewObjectMetadata(value.orNull)

  def withNewObjectMetadataOpt_=(value: Option[ObjectMetadata]): CopyObjectRequest =
    underlying.withNewObjectMetadata(value.orNull)

  // ---

  def cannedAccessControlListOpt: Option[CannedAccessControlList] = Option(underlying.getCannedAccessControlList)

  def cannedAccessControlListOpt_=(value: Option[CannedAccessControlList]): Unit =
    underlying.setCannedAccessControlList(value.orNull)

  def withCannedAccessControlListOpt_=(value: Option[CannedAccessControlList]): CopyObjectRequest =
    underlying.withCannedAccessControlList(value.orNull)

  // ---

  def accessControlListOpt = Option(underlying.getAccessControlList)

  def accessControlListOpt_=(value: Option[AccessControlList]): Unit =
    underlying.setAccessControlList(value.orNull)

  def withAccessControlListOpt(value: Option[AccessControlList]): CopyObjectRequest =
    underlying.withAccessControlList(value.orNull)

  // ---

  def unmodifiedSinceConstraintOpt: Option[Date] = Option(underlying.getUnmodifiedSinceConstraint)

  def unmodifiedSinceConstraintOpt_=(value: Option[Date]): Unit =
    underlying.setUnmodifiedSinceConstraint(value.orNull)

  def withUnmodifiedSinceConstraintOpt(value: Option[Date]): CopyObjectRequest =
    underlying.withUnmodifiedSinceConstraint(value.orNull)

  // ---

  def modifiedSinceConstraintOpt = Option(underlying.getModifiedSinceConstraint)

  def modifiedSinceConstraintOpt_=(value: Option[Date]): Unit =
    underlying.setModifiedSinceConstraint(value.orNull)

  def withModifiedSinceConstraintOpt(value: Option[Date]): CopyObjectRequest =
    underlying.withModifiedSinceConstraint(value.orNull)

  // ---

  def redirectLocationOpt = Option(underlying.getRedirectLocation)

  def redirectLocationOpt_=(value: Option[String]): Unit =
    underlying.setRedirectLocation(value.orNull)

  def withRedirectLocationOpt(value: Option[String]): CopyObjectRequest =
    underlying.withRedirectLocation(value.orNull)

  // ---

  def sourceSSECustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSourceSSECustomerKey)

  def sourceSSECustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSourceSSECustomerKey(value.orNull)

  def withSourceSSECustomerKeyOpt(value: Option[SSECustomerKey]): CopyObjectRequest =
    underlying.withSourceSSECustomerKey(value.orNull)

  // ---

  def destinationSSECustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getDestinationSSECustomerKey)

  def destinationSSECustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setDestinationSSECustomerKey(value.orNull)

  def withDestinationSSECustomerKeyOpt(value: Option[SSECustomerKey]): CopyObjectRequest =
    underlying.withDestinationSSECustomerKey(value.orNull)

  // ---

  def sseAwsKeyManagementParamsOpt: Option[SSEAwsKeyManagementParams] = Option(underlying.getSSEAwsKeyManagementParams)

  def sseAwsKeyManagementParamsOpt_=(value: Option[SSEAwsKeyManagementParams]): Unit =
    underlying.setSSEAwsKeyManagementParams(value.orNull)

  def withSSEAwsKeyManagementParamsOpt_=(value: Option[SSEAwsKeyManagementParams]): CopyObjectRequest =
    underlying.withSSEAwsKeyManagementParams(value.orNull)

}

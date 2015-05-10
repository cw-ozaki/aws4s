package org.sisioh.aws4s.s3

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.{NoncurrentVersionTransition, Rule, Transition}
import com.amazonaws.services.s3.model._
import com.amazonaws.services.s3.{AmazonS3Client, AmazonS3EncryptionClient, UploadObjectObserver}
import org.sisioh.aws4s.s3.model._

object Implicits extends Implicits

trait Implicits
  extends ModelImplicits {

  implicit def richAmazonS3Client(underlying: AmazonS3Client): RichAmazonS3Client = new RichAmazonS3Client(underlying)

  implicit def richAmazonS3EncryptionClient(underlying: AmazonS3EncryptionClient): RichAmazonS3EncryptionClient = new RichAmazonS3EncryptionClient(underlying)

  implicit def richUploadObjectObserver(underlying: UploadObjectObserver): RichUploadObjectObserver = new RichUploadObjectObserver(underlying)

}


trait ModelImplicits {

  implicit def richBucket(underlying: Bucket): RichBucket = new RichBucket(underlying)

  implicit def richBucketCrossOriginConfiguration(underlying: BucketCrossOriginConfiguration): RichBucketCrossOriginConfiguration =
    new RichBucketCrossOriginConfiguration(underlying)

  implicit def richAbortMultipartUploadRequest(underlying: AbortMultipartUploadRequest): RichAbortMultipartUploadRequest =
    new RichAbortMultipartUploadRequest(underlying)

  implicit def RichAbstractPutObjectRequest(underlying: AbstractPutObjectRequest): RichAbstractPutObjectRequest =
    new RichAbstractPutObjectRequest(underlying)

  implicit def richBucketLifecycleConfiguration(underlying: BucketLifecycleConfiguration): RichBucketLifecycleConfiguration =
    new RichBucketLifecycleConfiguration(underlying)

  implicit def richNonCurrentVersionTransition(underlying: NoncurrentVersionTransition): RichNonCurrentVersionTransition =
    new RichNonCurrentVersionTransition(underlying)

  implicit def richTransition(underlying: Transition): RichTransition =
    new RichTransition(underlying)

  implicit def richRule(underlying: Rule): RichRule =
    new RichRule(underlying)

  implicit def richBucketLoggingConfiguration(underlying: BucketLoggingConfiguration): RichBucketLoggingConfiguration =
    new RichBucketLoggingConfiguration(underlying)

  implicit def richBucketNotificationConfiguration(underlying: BucketNotificationConfiguration): RichBucketNotificationConfiguration =
    new RichBucketNotificationConfiguration(underlying)

  implicit def richBucketPolicy(underlying: BucketPolicy): RichBucketPolicy =
    new RichBucketPolicy(underlying)

  implicit def richBucketTaggingConfiguration(underlying: BucketTaggingConfiguration): RichBucketTaggingConfiguration =
    new RichBucketTaggingConfiguration(underlying)

  implicit def richBucketVersioningConfiguration(underlying: BucketVersioningConfiguration): RichBucketVersioningConfiguration =
    new RichBucketVersioningConfiguration(underlying)

  implicit def richTagSet(underlying: TagSet): RichTagSet = new RichTagSet(underlying)

}
package org.sisioh.aws4s.s3

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.{ NoncurrentVersionTransition, Rule, Transition }
import com.amazonaws.services.s3.model._
import com.amazonaws.services.s3.{ AmazonS3Client, AmazonS3EncryptionClient, UploadObjectObserver }
import org.sisioh.aws4s.s3.model._

object Implicits extends Implicits

trait Implicits
    extends ModelImplicits {

  implicit def richAmazonS3Client(underlying: AmazonS3Client): RichAmazonS3Client = new RichAmazonS3Client(underlying)

  implicit def richAmazonS3EncryptionClient(underlying: AmazonS3EncryptionClient): RichAmazonS3EncryptionClient = new RichAmazonS3EncryptionClient(underlying)

  implicit def richUploadObjectObserver(underlying: UploadObjectObserver): RichUploadObjectObserver = new RichUploadObjectObserver(underlying)

}

trait ModelImplicits {

  implicit def richAbortMultipartUploadRequest(underlying: AbortMultipartUploadRequest): RichAbortMultipartUploadRequest = new RichAbortMultipartUploadRequest(underlying)

  implicit def richAbstractPutObjectRequest(underlying: AbstractPutObjectRequest): RichAbstractPutObjectRequest = new RichAbstractPutObjectRequest(underlying)

  implicit def richBucket(underlying: Bucket): RichBucket = new RichBucket(underlying)

  implicit def richBucketCrossOriginConfiguration(underlying: BucketCrossOriginConfiguration): RichBucketCrossOriginConfiguration = new RichBucketCrossOriginConfiguration(underlying)

  implicit def richBucketLifecycleConfiguration(underlying: BucketLifecycleConfiguration): RichBucketLifecycleConfiguration = new RichBucketLifecycleConfiguration(underlying)

  implicit def richBucketLoggingConfiguration(underlying: BucketLoggingConfiguration): RichBucketLoggingConfiguration = new RichBucketLoggingConfiguration(underlying)

  implicit def richBucketNotificationConfiguration(underlying: BucketNotificationConfiguration): RichBucketNotificationConfiguration = new RichBucketNotificationConfiguration(underlying)

  implicit def richBucketPolicy(underlying: BucketPolicy): RichBucketPolicy = new RichBucketPolicy(underlying)

  implicit def richBucketTaggingConfiguration(underlying: BucketTaggingConfiguration): RichBucketTaggingConfiguration = new RichBucketTaggingConfiguration(underlying)

  implicit def richBucketVersioningConfiguration(underlying: BucketVersioningConfiguration): RichBucketVersioningConfiguration = new RichBucketVersioningConfiguration(underlying)

  implicit def richBucketWebsiteConfiguration(underlying: BucketWebsiteConfiguration): RichBucketWebsiteConfiguration = new RichBucketWebsiteConfiguration(underlying)

  implicit def richCORSRule(underlying: CORSRule): RichCORSRule = new RichCORSRule(underlying)

  implicit def richCanonicalGrantee(underlying: CanonicalGrantee): RichCanonicalGrantee = new RichCanonicalGrantee(underlying)

  implicit def richCloudFunctionConfiguration(underlying: CloudFunctionConfiguration): RichCloudFunctionConfiguration = new RichCloudFunctionConfiguration(underlying)

  implicit def richCompleteMultipartUploadRequest(underlying: CompleteMultipartUploadRequest): RichCompleteMultipartUploadRequest = new RichCompleteMultipartUploadRequest(underlying)

  implicit def richCompleteMultipartUploadResult(underlying: CompleteMultipartUploadResult): RichCompleteMultipartUploadResult = new RichCompleteMultipartUploadResult(underlying)

  implicit def richCopyObjectRequest(underlying: CopyObjectRequest): RichCopyObjectRequest = new RichCopyObjectRequest(underlying)

  implicit def richCopyObjectResult(underlying: CopyObjectResult): RichCopyObjectResult = new RichCopyObjectResult(underlying)

  implicit def richCopyPartRequest(underlying: CopyPartRequest): RichCopyPartRequest = new RichCopyPartRequest(underlying)

  implicit def richCopyPartResult(underlying: CopyPartResult): RichCopyPartResult = new RichCopyPartResult(underlying)

  implicit def richCreateBucketRequest(underlying: CreateBucketRequest): RichCreateBucketRequest = new RichCreateBucketRequest(underlying)

  implicit def richCryptoConfiguration(underlying: CryptoConfiguration): RichCryptoConfiguration = new RichCryptoConfiguration(underlying)

  implicit def richDeleteBucketPolicyRequest(underlying: DeleteBucketPolicyRequest): RichDeleteBucketPolicyRequest = new RichDeleteBucketPolicyRequest(underlying)

  implicit def richDeleteBucketRequest(underlying: DeleteBucketRequest): RichDeleteBucketRequest = new RichDeleteBucketRequest(underlying)

  implicit def richDeleteObjectRequest(underlying: DeleteObjectRequest): RichDeleteObjectRequest = new RichDeleteObjectRequest(underlying)

  implicit def richDeleteObjectsRequest(underlying: DeleteObjectsRequest): RichDeleteObjectsRequest = new RichDeleteObjectsRequest(underlying)

  implicit def richDeleteObjectsResult(underlying: DeleteObjectsResult): RichDeleteObjectsResult = new RichDeleteObjectsResult(underlying)

  implicit def richDeleteVersionRequest(underlying: DeleteVersionRequest): RichDeleteVersionRequest = new RichDeleteVersionRequest(underlying)

  implicit def richEmailAddressGrantee(underlying: EmailAddressGrantee): RichEmailAddressGrantee = new RichEmailAddressGrantee(underlying)

  implicit def richEncryptedGetObjectRequest(underlying: EncryptedGetObjectRequest): RichEncryptedGetObjectRequest = new RichEncryptedGetObjectRequest(underlying)

  implicit def richEncryptedInitiateMultipartUploadRequest(underlying: EncryptedInitiateMultipartUploadRequest): RichEncryptedInitiateMultipartUploadRequest = new RichEncryptedInitiateMultipartUploadRequest(underlying)

  implicit def richEncryptedPutObjectRequest(underlying: EncryptedPutObjectRequest): RichEncryptedPutObjectRequest = new RichEncryptedPutObjectRequest(underlying)

  implicit def richEncryptionMaterials(underlying: EncryptionMaterials): RichEncryptionMaterials = new RichEncryptionMaterials(underlying)

  implicit def richExtraMaterialsDescription(underlying: ExtraMaterialsDescription): RichExtraMaterialsDescription = new RichExtraMaterialsDescription(underlying)

  implicit def richGeneratePresignedUrlRequest(underlying: GeneratePresignedUrlRequest): RichGeneratePresignedUrlRequest = new RichGeneratePresignedUrlRequest(underlying)

  implicit def richGenericBucketRequest(underlying: GenericBucketRequest): RichGenericBucketRequest = new RichGenericBucketRequest(underlying)

  implicit def richGetBucketAclRequest(underlying: GetBucketAclRequest): RichGetBucketAclRequest = new RichGetBucketAclRequest(underlying)

  implicit def richGetBucketLocationRequest(underlying: GetBucketLocationRequest): RichGetBucketLocationRequest = new RichGetBucketLocationRequest(underlying)

  implicit def richGetBucketPolicyRequest(underlying: GetBucketPolicyRequest): RichGetBucketPolicyRequest = new RichGetBucketPolicyRequest(underlying)

  implicit def richGetBucketWebsiteConfigurationRequest(underlying: GetBucketWebsiteConfigurationRequest): RichGetBucketWebsiteConfigurationRequest = new RichGetBucketWebsiteConfigurationRequest(underlying)

  implicit def richGetObjectMetadataRequest(underlying: GetObjectMetadataRequest): RichGetObjectMetadataRequest = new RichGetObjectMetadataRequest(underlying)

  implicit def richGetObjectRequest(underlying: GetObjectRequest): RichGetObjectRequest = new RichGetObjectRequest(underlying)

  implicit def richGetRequestPaymentConfigurationRequest(underlying: GetRequestPaymentConfigurationRequest): RichGetRequestPaymentConfigurationRequest = new RichGetRequestPaymentConfigurationRequest(underlying)

  implicit def richGrant(underlying: Grant): RichGrant = new RichGrant(underlying)

  implicit def richHeadBucketRequest(underlying: HeadBucketRequest): RichHeadBucketRequest = new RichHeadBucketRequest(underlying)

  implicit def richInitiateMultipartUploadRequest(underlying: InitiateMultipartUploadRequest): RichInitiateMultipartUploadRequest = new RichInitiateMultipartUploadRequest(underlying)

  implicit def richInitiateMultipartUploadResult(underlying: InitiateMultipartUploadResult): RichInitiateMultipartUploadResult = new RichInitiateMultipartUploadResult(underlying)

  implicit def richListMultipartUploadsRequest(underlying: ListMultipartUploadsRequest): RichListMultipartUploadsRequest = new RichListMultipartUploadsRequest(underlying)

  implicit def richListObjectsRequest(underlying: ListObjectsRequest): RichListObjectsRequest = new RichListObjectsRequest(underlying)

  implicit def richListPartsRequest(underlying: ListPartsRequest): RichListPartsRequest = new RichListPartsRequest(underlying)

  implicit def richListVersionsRequest(underlying: ListVersionsRequest): RichListVersionsRequest = new RichListVersionsRequest(underlying)

  implicit def richMultiFactorAuthentication(underlying: MultiFactorAuthentication): RichMultiFactorAuthentication = new RichMultiFactorAuthentication(underlying)

  implicit def richMultipartUpload(underlying: MultipartUpload): RichMultipartUpload = new RichMultipartUpload(underlying)

  implicit def richMultipartUploadListing(underlying: MultipartUploadListing): RichMultipartUploadListing = new RichMultipartUploadListing(underlying)

  implicit def richNonCurrentVersionTransition(underlying: NoncurrentVersionTransition): RichNonCurrentVersionTransition = new RichNonCurrentVersionTransition(underlying)

  implicit def richNotificationConfiguration(underlying: NotificationConfiguration): RichNotificationConfiguration = new RichNotificationConfiguration(underlying)

  implicit def richObjectListing(underlying: ObjectListing): RichObjectListing = new RichObjectListing(underlying)

  implicit def richObjectMetadata(underlying: ObjectMetadata): RichObjectMetadata = new RichObjectMetadata(underlying)

  implicit def richOwner(underlying: Owner): RichOwner = new RichOwner(underlying)

  implicit def richPartETag(underlying: PartETag): RichPartETag = new RichPartETag(underlying)

  implicit def richPartListing(underlying: PartListing): RichPartListing = new RichPartListing(underlying)

  implicit def richPartSummary(underlying: PartSummary): RichPartSummary = new RichPartSummary(underlying)

  implicit def richPutInstructionFileRequest(underlying: PutInstructionFileRequest): RichPutInstructionFileRequest = new RichPutInstructionFileRequest(underlying)

  implicit def richPutObjectRequest(underlying: PutObjectRequest): RichPutObjectRequest = new RichPutObjectRequest(underlying)

  implicit def richPutObjectResult(underlying: PutObjectResult): RichPutObjectResult = new RichPutObjectResult(underlying)

  implicit def richQueueConfiguration(underlying: QueueConfiguration): RichQueueConfiguration = new RichQueueConfiguration(underlying)

  implicit def richRedirectRule(underlying: RedirectRule): RichRedirectRule = new RichRedirectRule(underlying)

  implicit def richRequestPaymentConfiguration(underlying: RequestPaymentConfiguration): RichRequestPaymentConfiguration = new RichRequestPaymentConfiguration(underlying)

  implicit def richResponseHeaderOverrides(underlying: ResponseHeaderOverrides): RichResponseHeaderOverrides = new RichResponseHeaderOverrides(underlying)

  implicit def richRestoreObjectRequest(underlying: RestoreObjectRequest): RichRestoreObjectRequest = new RichRestoreObjectRequest(underlying)

  implicit def richRoutingRule(underlying: RoutingRule): RichRoutingRule = new RichRoutingRule(underlying)

  implicit def richRoutingRuleCondition(underlying: RoutingRuleCondition): RichRoutingRuleCondition = new RichRoutingRuleCondition(underlying)

  implicit def richRule(underlying: Rule): RichRule = new RichRule(underlying)

  implicit def richS3Object(underlying: S3Object): RichS3Object = new RichS3Object(underlying)

  implicit def richS3ObjectId(underlying: S3ObjectId): RichS3ObjectId = new RichS3ObjectId(underlying)

  implicit def richS3ObjectIdBuilder(underlying: S3ObjectIdBuilder): RichS3ObjectIdBuilder = new RichS3ObjectIdBuilder(underlying)

  implicit def richS3ObjectInputStream(underlying: S3ObjectInputStream): RichS3ObjectInputStream = new RichS3ObjectInputStream(underlying)

  implicit def richS3ObjectSummary(underlying: S3ObjectSummary): RichS3ObjectSummary = new RichS3ObjectSummary(underlying)

  implicit def richS3VersionSummary(underlying: S3VersionSummary): RichS3VersionSummary = new RichS3VersionSummary(underlying)

  implicit def richSSEAwsKeyManagementParams(underlying: SSEAwsKeyManagementParams): RichSSEAwsKeyManagementParams = new RichSSEAwsKeyManagementParams(underlying)

  implicit def richSSECustomerKey(underlying: SSECustomerKey): RichSSECustomerKey = new RichSSECustomerKey(underlying)

  implicit def richSetBucketAclRequest(underlying: SetBucketAclRequest): RichSetBucketAclRequest = new RichSetBucketAclRequest(underlying)

  implicit def richSetBucketCrossOriginConfigurationRequest(underlying: SetBucketCrossOriginConfigurationRequest): RichSetBucketCrossOriginConfigurationRequest = new RichSetBucketCrossOriginConfigurationRequest(underlying)

  implicit def richSetBucketLifecycleConfigurationRequest(underlying: SetBucketLifecycleConfigurationRequest): RichSetBucketLifecycleConfigurationRequest = new RichSetBucketLifecycleConfigurationRequest(underlying)

  implicit def richSetBucketLoggingConfigurationRequest(underlying: SetBucketLoggingConfigurationRequest): RichSetBucketLoggingConfigurationRequest = new RichSetBucketLoggingConfigurationRequest(underlying)

  implicit def richSetBucketNotificationConfigurationRequest(underlying: SetBucketNotificationConfigurationRequest): RichSetBucketNotificationConfigurationRequest = new RichSetBucketNotificationConfigurationRequest(underlying)

  implicit def richSetBucketPolicyRequest(underlying: SetBucketPolicyRequest): RichSetBucketPolicyRequest = new RichSetBucketPolicyRequest(underlying)

  implicit def richSetBucketTaggingConfigurationRequest(underlying: SetBucketTaggingConfigurationRequest): RichSetBucketTaggingConfigurationRequest = new RichSetBucketTaggingConfigurationRequest(underlying)

  implicit def richSetBucketVersioningConfigurationRequest(underlying: SetBucketVersioningConfigurationRequest): RichSetBucketVersioningConfigurationRequest = new RichSetBucketVersioningConfigurationRequest(underlying)

  implicit def richSetBucketWebsiteConfigurationRequest(underlying: SetBucketWebsiteConfigurationRequest): RichSetBucketWebsiteConfigurationRequest = new RichSetBucketWebsiteConfigurationRequest(underlying)

  implicit def richSetObjectAclRequest(underlying: SetObjectAclRequest): RichSetObjectAclRequest = new RichSetObjectAclRequest(underlying)

  implicit def richSetRequestPaymentConfigurationRequest(underlying: SetRequestPaymentConfigurationRequest): RichSetRequestPaymentConfigurationRequest = new RichSetRequestPaymentConfigurationRequest(underlying)

  implicit def richSimpleMaterialProvider(underlying: SimpleMaterialProvider): RichSimpleMaterialProvider = new RichSimpleMaterialProvider(underlying)

  implicit def richStaticEncryptionMaterialsProvider(underlying: StaticEncryptionMaterialsProvider): RichStaticEncryptionMaterialsProvider = new RichStaticEncryptionMaterialsProvider(underlying)

  implicit def richTagSet(underlying: TagSet): RichTagSet = new RichTagSet(underlying)

  implicit def richTopicConfiguration(underlying: TopicConfiguration): RichTopicConfiguration = new RichTopicConfiguration(underlying)

  implicit def richTransition(underlying: Transition): RichTransition = new RichTransition(underlying)

  implicit def richUploadObjectRequest(underlying: UploadObjectRequest): RichUploadObjectRequest = new RichUploadObjectRequest(underlying)

  implicit def richUploadPartRequest(underlying: UploadPartRequest): RichUploadPartRequest = new RichUploadPartRequest(underlying)

  implicit def richUploadPartResult(underlying: UploadPartResult): RichUploadPartResult = new RichUploadPartResult(underlying)

  implicit def richVersionListing(underlying: VersionListing): RichVersionListing = new RichVersionListing(underlying)

  implicit def richWebsiteConfiguration(underlying: WebsiteConfiguration): RichWebsiteConfiguration = new RichWebsiteConfiguration(underlying)

}
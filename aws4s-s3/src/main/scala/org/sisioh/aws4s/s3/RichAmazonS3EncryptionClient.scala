package org.sisioh.aws4s.s3

import java.io.{InputStream, File}

import com.amazonaws.regions.Region
import com.amazonaws.services.s3.{AmazonS3EncryptionClient, AmazonS3Encryption}
import com.amazonaws.services.s3.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

class RichAmazonS3EncryptionClient(val underlying: AmazonS3EncryptionClient) extends AnyVal with PimpedType[AmazonS3EncryptionClient] {

  def region: com.amazonaws.services.s3.model.Region = underlying.getRegion

  def s3AccountOwner: Owner = underlying.getS3AccountOwner

  def listBucketsAsTry(listBucketsRequest: ListBucketsRequest): Try[Seq[Bucket]] = Try {
    underlying.listBuckets(listBucketsRequest).asScala
  }

  def listBucketsAsTry: Try[Seq[Bucket]] = Try {
    underlying.listBuckets().asScala
  }

  def getObjectAclAsTry(bucketName: String, key: String, versionId: Option[String]): Try[AccessControlList] = Try {
    underlying.getObjectAcl(bucketName, key, versionId.orNull)
  }

  def getObjectMetadataAsTry(bucketName: String, key: String): Try[ObjectMetadata] = Try {
    underlying.getObjectMetadata(bucketName, key)
  }

  def getObjectMetadataAsTry(getObjectMetadataRequest: GetObjectMetadataRequest): Try[ObjectMetadata] = Try {
    underlying.getObjectMetadata(getObjectMetadataRequest)
  }

  def getObjectAsTry(bucketName: String, key: String): Try[S3Object] = Try {
    underlying.getObject(bucketName, key)
  }

  def doesBucketExistAsTry(bucketName: String): Try[Boolean] = Try {
    underlying.doesBucketExist(bucketName)
  }

  def changeObjectStorageClassAsTry(bucketName: String, key: String, newStorageClass: StorageClass): Unit = Try {
    underlying.changeObjectStorageClass(bucketName, key, newStorageClass)
  }

  def setObjectRedirectLocationAsTry(bucketName: String, key: String, newRedirectLocation: String): Try[Unit] = Try {
    underlying.setObjectRedirectLocation(bucketName, key, newRedirectLocation)
  }

  def getObjectAsTry(getObjectRequest: GetObjectRequest): Try[S3Object] = Try {
    underlying.getObject(getObjectRequest)
  }

  def getObjectAsTry(getObjectRequest: GetObjectRequest, destinationFile: File): Try[ObjectMetadata] = Try {
    underlying.getObject(getObjectRequest, destinationFile)
  }

  def deleteBucketAsTry(bucketName: String): Try[Unit] = Try {
    underlying.deleteBucket(bucketName)
  }

  def deleteBucketAsTry(deleteBucketRequest: DeleteBucketRequest): Try[Unit] = Try {
    underlying.deleteBucket(deleteBucketRequest)
  }

  def putObjectAsTry(bucketName: String, key: String, file: File): Try[PutObjectResult] = Try {
    underlying.putObject(bucketName, key, file)
  }

  def putObjectAsTry(bucketName: String, key: String, input: InputStream, metadata: ObjectMetadata) = Try {
    underlying.putObject(bucketName, key, input, metadata)
  }

  def putObjectAsTry(putObjectRequest: PutObjectRequest): Try[PutObjectResult] = Try {
    underlying.putObject(putObjectRequest)
  }

  def copyObjectAsTry(sourceBucketName: String, sourceKey: String, destinationBucketName: String, destinationKey: String): Try[CopyObjectResult] = Try {
    underlying.copyObject(sourceBucketName, sourceKey, destinationBucketName, destinationKey)
  }

  def copyObjectAsTry(copyObjectRequest: CopyObjectRequest): Try[CopyObjectResult] = Try {
    underlying.copyObject(copyObjectRequest)
  }

  def copyPartAsTry(copyPartRequest: CopyPartRequest): Try[CopyPartResult] = Try {
    underlying.copyPart(copyPartRequest)
  }

  def deleteObjectAsTry(bucketName: String, key: String): Try[Unit] = Try {
    underlying.deleteObject(bucketName, key)
  }

  def deleteObjectAsTry(deleteObjectRequest: DeleteObjectRequest): Try[Unit] = Try {
    underlying.deleteObject(deleteObjectRequest)
  }

}

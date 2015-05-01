package org.sisioh.aws4s.s3

import java.io.{InputStream, File}

import com.amazonaws.regions.Region
import com.amazonaws.services.s3.{AmazonS3EncryptionClient, AmazonS3Encryption}
import com.amazonaws.services.s3.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._
import scala.util.Try

class RichAmazonS3EncryptionClient(val underlying: AmazonS3EncryptionClient) extends AnyVal with PimpedType[AmazonS3EncryptionClient] {

  def region_=(value: Region): Unit = underlying.setRegion(value)

  def region: com.amazonaws.services.s3.model.Region = underlying.getRegion

  def s3AccountOwner: Owner = underlying.getS3AccountOwner

  def listBuckets(listBucketsRequest: ListBucketsRequest): Try[Seq[Bucket]] = Try {
    underlying.listBuckets(listBucketsRequest).asScala
  }

  def listBuckets: Try[Seq[Bucket]] = Try {
    underlying.listBuckets().asScala
  }

  def getObjectAcl(bucketName: String, key: String, versionId: Option[String]): Try[AccessControlList] = Try {
    underlying.getObjectAcl(bucketName, key, versionId.orNull)
  }

  def getObjectMetadata(bucketName: String, key: String): Try[ObjectMetadata] = Try {
    underlying.getObjectMetadata(bucketName, key)
  }

  def getObjectMetadata(getObjectMetadataRequest: GetObjectMetadataRequest): Try[ObjectMetadata] = Try {
    underlying.getObjectMetadata(getObjectMetadataRequest)
  }

  def getObject(bucketName: String, key: String): Try[S3Object] = Try {
    underlying.getObject(bucketName, key)
  }

  def doesBucketExist(bucketName: String): Try[Boolean] = Try {
    underlying.doesBucketExist(bucketName)
  }

  def changeObjectStorageClass(bucketName: String, key: String, newStorageClass: StorageClass): Unit = Try {
    underlying.changeObjectStorageClass(bucketName, key, newStorageClass)
  }

  def setObjectRedirectLocation(bucketName: String, key: String, newRedirectLocation: String): Try[Unit] = Try {
    underlying.setObjectRedirectLocation(bucketName, key, newRedirectLocation)
  }

  def getObject(getObjectRequest: GetObjectRequest): Try[S3Object] = Try {
    underlying.getObject(getObjectRequest)
  }

  def getObject(getObjectRequest: GetObjectRequest, destinationFile: File): Try[ObjectMetadata] = Try {
    underlying.getObject(getObjectRequest, destinationFile)
  }

  def deleteBucket(bucketName: String): Try[Unit] = Try {
    underlying.deleteBucket(bucketName)
  }

  def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Try[Unit] = Try {
    underlying.deleteBucket(deleteBucketRequest)
  }

  def putObject(bucketName: String, key: String, file: File): Try[PutObjectResult] = Try {
    underlying.putObject(bucketName, key, file)
  }

  def putObject(bucketName: String, key: String, input: InputStream, metadata: ObjectMetadata) = Try {
    underlying.putObject(bucketName, key, input, metadata)
  }

  def putObject(putObjectRequest: PutObjectRequest): Try[PutObjectResult] = Try {
    underlying.putObject(putObjectRequest)
  }

  def copyObject(sourceBucketName: String, sourceKey: String, destinationBucketName: String, destinationKey: String): Try[CopyObjectResult] = Try {
    underlying.copyObject(sourceBucketName, sourceKey, destinationBucketName, destinationKey)
  }

  def copyObject(copyObjectRequest: CopyObjectRequest): Try[CopyObjectResult] = Try {
    underlying.copyObject(copyObjectRequest)
  }

  def copyPart(copyPartRequest: CopyPartRequest): Try[CopyPartResult] = Try {
    underlying.copyPart(copyPartRequest)
  }

  def deleteObject(bucketName: String, key: String): Try[Unit] = Try {
    underlying.deleteObject(bucketName, key)
  }

  def deleteObject(deleteObjectRequest: DeleteObjectRequest): Try[Unit] = Try {
    underlying.deleteObject(deleteObjectRequest)
  }

}

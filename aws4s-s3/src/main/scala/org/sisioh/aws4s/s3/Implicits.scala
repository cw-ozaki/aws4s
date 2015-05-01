package org.sisioh.aws4s.s3

import com.amazonaws.services.s3.{UploadObjectObserver, AmazonS3EncryptionClient, AmazonS3Client}

object Implicits extends Implicits

trait Implicits
  extends AmazonS3ClientImplicits
  with AmazonS3EncryptionClientImplicits
  with RichUploadObjectObserverImplicits

trait AmazonS3ClientImplicits {

  implicit def richAmazonS3Client(underlying: AmazonS3Client): RichAmazonS3Client = new RichAmazonS3Client(underlying)

}


trait AmazonS3EncryptionClientImplicits {

  implicit def richAmazonS3EncryptionClient(underlying: AmazonS3EncryptionClient): RichAmazonS3EncryptionClient = new RichAmazonS3EncryptionClient(underlying)

}

trait RichUploadObjectObserverImplicits {

  implicit def richUploadObjectObserver(underlying: UploadObjectObserver): RichUploadObjectObserver = new RichUploadObjectObserver(underlying)

}
package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ EncryptedInitiateMultipartUploadRequest, ObjectMetadata }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object RichEncryptedInitiateMultipartUploadRequestFactory {

  def create(bucketName: String, key: String): EncryptedInitiateMultipartUploadRequest =
    new EncryptedInitiateMultipartUploadRequest(bucketName, key)

  def create(bucketName: String, key: String, objectMetadata: ObjectMetadata): EncryptedInitiateMultipartUploadRequest =
    new EncryptedInitiateMultipartUploadRequest(bucketName, key, objectMetadata)

}

class RichEncryptedInitiateMultipartUploadRequest(val underlying: EncryptedInitiateMultipartUploadRequest)
    extends AnyVal with PimpedType[EncryptedInitiateMultipartUploadRequest] {

  def materialsDescriptionOpt: Option[Map[String, String]] = Option(underlying.getMaterialsDescription.asScala.toMap)

  def materialsDescriptionOpt_=(value: Option[Map[String, String]]): Unit =
    underlying.setMaterialsDescription(value.map(_.asJava).orNull)

  def withMaterialsDescriptionOpt(value: Option[Map[String, String]]): EncryptedInitiateMultipartUploadRequest =
    underlying.withMaterialsDescription(value.map(_.asJava).orNull)

  // ---

  def createEncryptionMaterial: Boolean = underlying.isCreateEncryptionMaterial

  def createEncryptionMaterial_=(value: Boolean): Unit =
    underlying.setCreateEncryptionMaterial(value)

  def withCreateEncryptionMaterial(value: Boolean): EncryptedInitiateMultipartUploadRequest =
    underlying.withCreateEncryptionMaterial(value)

}

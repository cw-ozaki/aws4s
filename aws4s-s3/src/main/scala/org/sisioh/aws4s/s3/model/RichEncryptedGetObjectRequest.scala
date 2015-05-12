package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{EncryptedGetObjectRequest, ExtraMaterialsDescription, S3ObjectId}
import org.sisioh.aws4s.PimpedType

object EncryptedGetObjectRequestFactory {

  def create(bucketName: String, key: String): EncryptedGetObjectRequest =
    new EncryptedGetObjectRequest(bucketName, key)

  def create(bucketName: String, key: String, versionId: String): EncryptedGetObjectRequest =
    new EncryptedGetObjectRequest(bucketName, key, versionId)

  def create(s3BucketId: S3ObjectId): EncryptedGetObjectRequest =
    new EncryptedGetObjectRequest(s3BucketId)

  def create(bucketName: String, key: String, isRequesterPays: Boolean): EncryptedGetObjectRequest =
    new EncryptedGetObjectRequest(bucketName, key, isRequesterPays)

}


class RichEncryptedGetObjectRequest(val underlying: EncryptedGetObjectRequest)
  extends AnyVal with PimpedType[EncryptedGetObjectRequest] {

  def extraMaterialDescription = underlying.getExtraMaterialDescription

  def extraMaterialDescription_=(value: ExtraMaterialsDescription): Unit =
    underlying.setExtraMaterialDescription(value)

  // ---

  def instructionFileSuffixOpt = Option(underlying.getInstructionFileSuffix)

  def instructionFileSuffixOpt_=(value: Option[String]): Unit =
    underlying.setInstructionFileSuffix(value.orNull)

  def withInstructionFileSuffixOpt_=(value: Option[String]): EncryptedGetObjectRequest =
    underlying.withInstructionFileSuffix(value.orNull)

  // ---

  def keyWrapExpectedOpt: Option[Boolean] = Option(underlying.isKeyWrapExpected)

  def keyWrapExpectedOpt_=(value: Option[Boolean]): Unit =
    underlying.setKeyWrapExpected(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withKeyWrapExpectedOpt(value: Option[Boolean]): EncryptedGetObjectRequest =
    underlying.withKeyWrapExpected(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}

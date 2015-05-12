package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{S3ObjectId, EncryptionMaterials, PutInstructionFileRequest}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object PutInstructionFileRequestFactory {

  def create(s3ObjectId: S3ObjectId, matDesc: Map[String, String], suffix: String): PutInstructionFileRequest =
    new PutInstructionFileRequest(s3ObjectId, matDesc.asJava, suffix)

  def create(s3ObjectId: S3ObjectId, encryptionMaterials: EncryptionMaterials, suffix: String): PutInstructionFileRequest =
    new PutInstructionFileRequest(s3ObjectId, encryptionMaterials, suffix)

}

class RichPutInstructionFileRequest(val underlying: PutInstructionFileRequest)
extends AnyVal with PimpedType[PutInstructionFileRequest] {

  def s3ObjectId: S3ObjectId = underlying.getS3ObjectId

  def encryptionMaterialsOpt: Option[EncryptionMaterials] = Option(underlying.getEncryptionMaterials)

  def materialsDescription: Map[String, String] = underlying.getMaterialsDescription.asScala.toMap

  def suffix: String = underlying.getSuffix

  def cannedAclOpt = Option(underlying.getCannedAcl)

  def accessControlListOpt = Option(underlying.getAccessControlList)

  def redirectLocationOpt = Option(underlying.getRedirectLocation)

  def storageClassOpt = Option(underlying.getStorageClass)

}

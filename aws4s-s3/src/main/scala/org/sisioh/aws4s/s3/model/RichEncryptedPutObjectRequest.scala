package org.sisioh.aws4s.s3.model

import java.io.{ File, InputStream }

import com.amazonaws.services.s3.model.{ EncryptedPutObjectRequest, ObjectMetadata }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EncryptedPutObjectRequestFactory {

  def create(bucketName: String, key: String, file: File): EncryptedPutObjectRequest =
    new EncryptedPutObjectRequest(bucketName, key, file)

  def create(bucketName: String, key: String, redirectLocation: String): EncryptedPutObjectRequest =
    new EncryptedPutObjectRequest(bucketName, key, redirectLocation)

  def create(bucketName: String, key: String, input: InputStream, metadata: ObjectMetadata): EncryptedPutObjectRequest =
    new EncryptedPutObjectRequest(bucketName, key, input, metadata)

}

class RichEncryptedPutObjectRequest(val underlying: EncryptedPutObjectRequest)
    extends AnyVal with PimpedType[EncryptedPutObjectRequest] {

  def materialsDescriptionOpt: Option[Map[String, String]] = Option(underlying.getMaterialsDescription.asScala.toMap)

  def materialsDescriptionOpt_=(value: Option[Map[String, String]]): Unit =
    underlying.setMaterialsDescription(value.map(_.asJava).orNull)

  def withMaterialsDescriptionOpt(value: Option[Map[String, String]]): EncryptedPutObjectRequest =
    underlying.withMaterialsDescription(value.map(_.asJava).orNull)

}

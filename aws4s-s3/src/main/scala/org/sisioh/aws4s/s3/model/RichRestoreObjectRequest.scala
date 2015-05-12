package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.RestoreObjectRequest
import org.sisioh.aws4s.PimpedType

object RestoreObjectRequestFactory {

  def create(bucketName: String, key: String): RestoreObjectRequest = new RestoreObjectRequest(bucketName, key)

  def create(bucketName: String, key: String, expirationInDays: Int): RestoreObjectRequest =
    new RestoreObjectRequest(bucketName, key, expirationInDays)

}

class RichRestoreObjectRequest(val underlying: RestoreObjectRequest)
  extends AnyVal with PimpedType[RestoreObjectRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key: String = underlying.getKey

  def key_=(value: String): Unit = underlying.setKey(value)

  // ---

  def expirationInDays: Int = underlying.getExpirationInDays

  def expirationInDays_=(value: Int): Unit =
    underlying.setExpirationInDays(value)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

}

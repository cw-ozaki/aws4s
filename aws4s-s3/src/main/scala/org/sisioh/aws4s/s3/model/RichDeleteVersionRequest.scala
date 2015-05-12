package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ DeleteVersionRequest, MultiFactorAuthentication }
import org.sisioh.aws4s.PimpedType

object DeleteVersionRequestFactory {

  def create(bucketName: String, key: String, versionId: String): DeleteVersionRequest =
    new DeleteVersionRequest(bucketName, key, versionId)

  def create(bucketName: String, key: String, versionId: String, mfa: MultiFactorAuthentication): DeleteVersionRequest =
    new DeleteVersionRequest(bucketName, key, versionId, mfa)

}

class RichDeleteVersionRequest(val underlying: DeleteVersionRequest)
    extends AnyVal with PimpedType[DeleteVersionRequest] {

  def bucketName = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def versionId = underlying.getVersionId

  def versionId_=(value: String): Unit =
    underlying.setVersionId(value)

  // ---

  def mfaOpt: Option[MultiFactorAuthentication] = Option(underlying.getMfa)

  def mfaOpt_=(value: Option[MultiFactorAuthentication]): Unit =
    underlying.setMfa(value.orNull)

  def withMfaOpt(value: Option[MultiFactorAuthentication]): DeleteVersionRequest =
    underlying.withMfa(value.orNull)

}

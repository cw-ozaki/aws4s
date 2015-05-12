package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ BucketVersioningConfiguration, MultiFactorAuthentication, SetBucketVersioningConfigurationRequest }
import org.sisioh.aws4s.PimpedType

object SetBucketVersioningConfigurationRequestFactory {

  def create(bucketName: String, configuration: BucketVersioningConfiguration): SetBucketVersioningConfigurationRequest =
    new SetBucketVersioningConfigurationRequest(bucketName, configuration)

  def create(bucketName: String, configuration: BucketVersioningConfiguration, mfa: MultiFactorAuthentication): SetBucketVersioningConfigurationRequest =
    new SetBucketVersioningConfigurationRequest(bucketName, configuration, mfa)

}

class RichSetBucketVersioningConfigurationRequest(val underlying: SetBucketVersioningConfigurationRequest)
    extends AnyVal with PimpedType[SetBucketVersioningConfigurationRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def versioningConfigurationOpt: Option[BucketVersioningConfiguration] =
    Option(underlying.getVersioningConfiguration)

  def versioningConfigurationOpt_=(value: Option[BucketVersioningConfiguration]): Unit =
    underlying.setVersioningConfiguration(value.orNull)

  // ---

  def mfaOpt: Option[MultiFactorAuthentication] = Option(underlying.getMfa)

  def mfaOpt_=(value: Option[MultiFactorAuthentication]): Unit =
    underlying.setMfa(value.orNull)

}

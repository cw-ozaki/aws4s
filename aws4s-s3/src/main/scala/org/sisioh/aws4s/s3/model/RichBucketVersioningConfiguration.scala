package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketVersioningConfiguration
import org.sisioh.aws4s.PimpedType

object BucketVersioningConfigurationFactory {

  def create(): BucketVersioningConfiguration = new BucketVersioningConfiguration()

  def creates(status: String): BucketVersioningConfiguration = new BucketVersioningConfiguration(status)

}

class RichBucketVersioningConfiguration(val underlying: BucketVersioningConfiguration)
    extends AnyVal with PimpedType[BucketVersioningConfiguration] {

  def status: String = underlying.getStatus

  def status_=(value: String): Unit = {
    underlying.setStatus(value)
  }

  def isMfaDeleteEnabled: Boolean = underlying.isMfaDeleteEnabled

  def mfaDeleteEnabled_=(value: Boolean): Unit = {
    underlying.setMfaDeleteEnabled(value)
  }

}

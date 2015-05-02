package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketVersioningConfiguration
import org.sisioh.aws4s.PimpedType

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

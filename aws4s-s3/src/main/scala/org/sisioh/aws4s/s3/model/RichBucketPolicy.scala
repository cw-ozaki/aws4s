package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketPolicy
import org.sisioh.aws4s.PimpedType

object BucketPolicyFactory {

  def create(): BucketPolicy = new BucketPolicy()

}

class RichBucketPolicy(val underlying: BucketPolicy)
  extends AnyVal with PimpedType[BucketPolicy] {

  def policyTextOpt: Option[String] = Option(underlying.getPolicyText)

  def policyTextOpt_=(value: Option[String]): Unit =
    underlying.setPolicyText(value.orNull)

}

package com.github.j5ik2o.aws

import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import com.github.j5ik2o.aws.core.auth.{RichAWSCredentials, RichAWSCredentialsProvider}

object Implicits extends Implicits

trait Implicits extends AuthImplicits

trait AuthImplicits {

  implicit def richAWSCredentials(underlying: AWSCredentials): RichAWSCredentials = new RichAWSCredentials(underlying)

  implicit def richAWSCredentialsProvider(underlying: AWSCredentialsProvider): RichAWSCredentialsProvider = new RichAWSCredentialsProvider(underlying)

}

package org.sisioh.aws4s

import com.amazonaws.auth.{AWSCredentials, AWSCredentialsProvider}
import org.sisioh.aws4s.core.auth.{RichAWSCredentials, RichAWSCredentialsProvider}

object Implicits extends Implicits

trait Implicits extends AuthImplicits

trait AuthImplicits {

  implicit def richAWSCredentials(underlying: AWSCredentials): RichAWSCredentials = new RichAWSCredentials(underlying)

  implicit def richAWSCredentialsProvider(underlying: AWSCredentialsProvider): RichAWSCredentialsProvider = new RichAWSCredentialsProvider(underlying)

}

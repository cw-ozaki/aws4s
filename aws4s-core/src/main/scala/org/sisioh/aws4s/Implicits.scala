package org.sisioh.aws4s

import com.amazonaws._
import com.amazonaws.auth.{ AWSCredentialsProviderChain, AWSCredentials, AWSCredentialsProvider }
import org.sisioh.aws4s.core._
import org.sisioh.aws4s.core.auth.{ RichAWSCredentialsProviderChain, RichAWSCredentials, RichAWSCredentialsProvider }

object Implicits extends Implicits

trait Implicits extends AuthImplicits with CoreImplicits

trait AuthImplicits {

  implicit def richAWSCredentials(underlying: AWSCredentials): RichAWSCredentials = new RichAWSCredentials(underlying)

  implicit def richAWSCredentialsProvider(underlying: AWSCredentialsProvider): RichAWSCredentialsProvider = new RichAWSCredentialsProvider(underlying)

  implicit def richAWSCredentialsProviderChain(underlying: AWSCredentialsProviderChain): RichAWSCredentialsProviderChain = new RichAWSCredentialsProviderChain(underlying)
}

trait CoreImplicits {

  implicit def richAmazonWebServiceClient(underlying: AmazonWebServiceClient): RichAmazonWebServiceClient =
    new RichAmazonWebServiceClient(underlying)

  implicit def richAmazonWebServiceRequest(underlying: AmazonWebServiceRequest): RichAmazonWebServiceRequest =
    new RichAmazonWebServiceRequest(underlying)

  implicit def richAmazonWebServiceResponse[A](underlying: AmazonWebServiceResponse[A]): RichAmazonWebServiceResponse[A] =
    new RichAmazonWebServiceResponse(underlying)

  implicit def richDefaultRequest[A](underlying: DefaultRequest[A]): RichDefaultRequest[A] =
    new RichDefaultRequest(underlying)

  implicit def richResponseMetadata(underlying: ResponseMetadata): RichResponseMetadata =
    new RichResponseMetadata(underlying)
}
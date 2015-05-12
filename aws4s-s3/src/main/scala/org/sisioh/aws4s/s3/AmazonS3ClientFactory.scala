package org.sisioh.aws4s.s3

import com.amazonaws.ClientConfiguration
import com.amazonaws.auth.{ AWSCredentialsProvider, AWSCredentials }
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.s3.AmazonS3Client

object AmazonS3ClientFactory {

  def create() = new AmazonS3Client()

  def create(awsCredentials: AWSCredentials) =
    new AmazonS3Client(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration) =
    new AmazonS3Client(awsCredentials, clientConfiguration)

  def create(credentialsProvider: AWSCredentialsProvider) = new AmazonS3Client(credentialsProvider)

  def create(credentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration) =
    new AmazonS3Client(credentialsProvider, clientConfiguration)

  def create(credentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector) =
    new AmazonS3Client(credentialsProvider, clientConfiguration, requestMetricCollector)

  def create(clientConfiguration: ClientConfiguration) =
    new AmazonS3Client(clientConfiguration)

}

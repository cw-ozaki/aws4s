package org.sisioh.aws4s.core.auth

import java.io.{File, InputStream}

import com.amazonaws.auth._
import org.sisioh.aws4s.PimpedType

object AWSCredentialsFactory {

  def createAnonymous(): AWSCredentials = new AnonymousAWSCredentials()

  def createProperties(file: File): AWSCredentials = new PropertiesCredentials(file)

  def createProperties(inputStream: InputStream): AWSCredentials = new PropertiesCredentials(inputStream)

  def createBasic(accessKey: String, secretKey: String): AWSCredentials = new BasicAWSCredentials(accessKey, secretKey)

  def createBasicSession(awsAccessKey: String, awsSecretKey: String, sessionToken: String): AWSSessionCredentials = new BasicSessionCredentials(awsAccessKey, awsSecretKey, sessionToken)

}

class RichAWSCredentials(val underlying: AWSCredentials) extends AnyVal with PimpedType[AWSCredentials] {

  def awsAccessKeyId: String = underlying.getAWSAccessKeyId

  def awsSecretKey: String = underlying.getAWSSecretKey

}

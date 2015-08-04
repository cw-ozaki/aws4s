package org.sisioh.aws4s.sts.model

import java.util.Date

import com.amazonaws.services.securitytoken.model.Credentials
import org.sisioh.aws4s.PimpedType

object CredentialsFactory {

  def create(accessKeyId: String,
             secretAccessKey: String,
             sessionToken: String,
             expiration: Date): Credentials =
    new Credentials(accessKeyId, secretAccessKey, sessionToken, expiration)

}

class RichCredentials(val underlying: Credentials)
    extends AnyVal with PimpedType[Credentials] {

  def accessKeyIdOpt: Option[String] =
    Option(underlying.getAccessKeyId)

  def withAccessKeyId(accessKeyId: Option[String]): Credentials =
    underlying.withAccessKeyId(accessKeyId.orNull)

  def secretAccessKeyOpt: Option[String] =
    Option(underlying.getSecretAccessKey)

  def withSecretAccessKey(secretAccessKey: Option[String]): Credentials =
    underlying.withSecretAccessKey(secretAccessKey.orNull)

  def sessionTokenOpt: Option[String] =
    Option(underlying.getSessionToken)

  def withSessionToken(sessionToken: Option[String]): Credentials =
    underlying.withSessionToken(sessionToken.orNull)

  def expirationOpt: Option[Date] =
    Option(underlying.getExpiration)

  def withExpiration(expiration: Option[Date]): Credentials =
    underlying.withExpiration(expiration.orNull)

}

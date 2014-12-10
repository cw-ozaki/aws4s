package org.sisioh.aws4s.core.auth

import com.amazonaws.auth._

object SignerFactory {

  def createAWS3Signer: AWS3Signer = new AWS3Signer()

  def createAWS4Signer: AWS4Signer = new AWS4Signer()

  def createAWS4Signer(doubleUrlEncoding: Boolean): AWS4Signer = new AWS4Signer(doubleUrlEncoding)

  def createNoOpSigner(): Signer = new NoOpSigner()

  def createQueryStringSigner(): QueryStringSigner = new QueryStringSigner()

}

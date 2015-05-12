package org.sisioh.aws4s.s3.model

import java.security.KeyPair
import javax.crypto.SecretKey

import com.amazonaws.services.s3.model.EncryptionMaterials
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EncryptionMaterialsFactory {

  def create(keyPair: KeyPair): EncryptionMaterials = new EncryptionMaterials(keyPair)

  def create(symmetricKey: SecretKey): EncryptionMaterials = new EncryptionMaterials(symmetricKey)

}

class RichEncryptionMaterials(val underlying: EncryptionMaterials)
  extends AnyVal with PimpedType[EncryptionMaterials] {

  def materialsDescription: Map[String, String] = underlying.getMaterialsDescription.asScala.toMap

  def addDescriptions(value: Map[String, String]): EncryptionMaterials =
    underlying.addDescriptions(value.asJava)

  // ---

  def keyPairOpt: Option[KeyPair] = Option(underlying.getKeyPair)

  // ---

  def symmetricKeyOpt: Option[SecretKey] = Option(underlying.getSymmetricKey)

  // ---

  def kmsEnabled = underlying.isKMSEnabled

}



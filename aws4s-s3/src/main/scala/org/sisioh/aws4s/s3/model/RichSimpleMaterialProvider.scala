package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ EncryptionMaterials, SimpleMaterialProvider }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object SimpleMaterialProviderFactory {

  def create(): SimpleMaterialProvider = new SimpleMaterialProvider()

}

class RichSimpleMaterialProvider(val underlying: SimpleMaterialProvider)
    extends AnyVal with PimpedType[SimpleMaterialProvider] {

  def getEncryptionMaterials(map: Map[String, String]): EncryptionMaterials =
    underlying.getEncryptionMaterials(map.asJava)

  def encryptionMaterials = underlying.getEncryptionMaterials

  def removeMaterial(map: Map[String, String]): SimpleMaterialProvider =
    underlying.removeMaterial(map.asJava)

}

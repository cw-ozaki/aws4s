package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{EncryptionMaterials, StaticEncryptionMaterialsProvider}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object StaticEncryptionMaterialsProviderFactory {

  def create(materials: EncryptionMaterials): StaticEncryptionMaterialsProvider =
    new StaticEncryptionMaterialsProvider(materials)

}

class RichStaticEncryptionMaterialsProvider(val underlying: StaticEncryptionMaterialsProvider)
  extends AnyVal with PimpedType[StaticEncryptionMaterialsProvider] {

  def encryptionMaterials = underlying.getEncryptionMaterials

  def getEncryptionMaterials(materialDescIn: Map[String, String]): EncryptionMaterials =
    underlying.getEncryptionMaterials(materialDescIn.asJava)

}

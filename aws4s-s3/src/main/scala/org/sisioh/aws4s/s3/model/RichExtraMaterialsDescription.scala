package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.ExtraMaterialsDescription
import com.amazonaws.services.s3.model.ExtraMaterialsDescription.ConflictResolution
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ExtraMaterialsDescriptionFactory {

  def create(matdesc: Map[String, String]): ExtraMaterialsDescription =
    new ExtraMaterialsDescription(matdesc.asJava)

  def create(matdesc: Map[String, String], resolve: ExtraMaterialsDescription.ConflictResolution): ExtraMaterialsDescription =
    new ExtraMaterialsDescription(matdesc.asJava, resolve)

}

class RichExtraMaterialsDescription(val underlying: ExtraMaterialsDescription)
    extends AnyVal with PimpedType[ExtraMaterialsDescription] {

  def materialDescription: Map[String, String] = underlying.getMaterialDescription.asScala.toMap

  def conflictResolution: ConflictResolution = underlying.getConflictResolution

  def mergeInto(core: Map[String, String]): Map[String, String] =
    underlying.mergeInto(core.asJava).asScala.toMap
}

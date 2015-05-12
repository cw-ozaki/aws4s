package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.DeleteObjectsResult
import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteObjectsResultFactory {

  def create(deletedObjects: Seq[DeletedObject]): DeleteObjectsResult =
    new DeleteObjectsResult(deletedObjects.asJava)

}

class RichDeleteObjectsResult(val underlying: DeleteObjectsResult)
    extends AnyVal with PimpedType[DeleteObjectsResult] {

  def deletedObjects: Seq[DeletedObject] = underlying.getDeletedObjects.asScala

}

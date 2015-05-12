package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.DeleteObjectsRequest.KeyVersion
import com.amazonaws.services.s3.model.{ MultiFactorAuthentication, DeleteObjectsRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DeleteObjectsRequestFactory {

  def create(bucketName: String): DeleteObjectsRequest = new DeleteObjectsRequest(bucketName)

}

class RichDeleteObjectsRequest(val underlying: DeleteObjectsRequest)
    extends AnyVal with PimpedType[DeleteObjectsRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def quietOpt: Option[Boolean] = Option(underlying.getQuiet)

  def quietOpt_=(value: Option[Boolean]): Unit =
    underlying.setQuiet(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withQuietOpt_=(value: Option[Boolean]): DeleteObjectsRequest =
    underlying.withQuiet(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def mfaOpt: Option[MultiFactorAuthentication] = Option(underlying.getMfa)

  def mfaOpt_=(value: Option[MultiFactorAuthentication]): Unit =
    underlying.setMfa(value.orNull)

  def withMfaOpt(value: Option[MultiFactorAuthentication]): DeleteObjectsRequest =
    underlying.withMfa(value.orNull)

  // ---

  def keys = underlying.getKeys.asScala

  def keys_=(value: Seq[KeyVersion]): Unit =
    underlying.setKeys(value.asJava)

  def withKeys(value: Seq[KeyVersion]): DeleteObjectsRequest =
    underlying.withKeys(value.asJava)

}

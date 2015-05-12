package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{ MultipartUpload, Owner }
import org.sisioh.aws4s.PimpedType

object RichMultipartUploadFactory {

  def create(): MultipartUpload = new MultipartUpload()

}

class RichMultipartUpload(val underlying: MultipartUpload)
    extends AnyVal with PimpedType[MultipartUpload] {

  def keyOpt: Option[String] = Option(underlying.getKey)

  def keyOpt_=(value: Option[String]): Unit =
    underlying.setKey(value.orNull)

  // ---

  def uploadIdOpt = Option(underlying.getUploadId)

  def uploadIdOpt_=(value: Option[String]): Unit =
    underlying.setUploadId(value.orNull)

  // ---

  def ownerOpt: Option[Owner] = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[Owner]): Unit =
    underlying.setOwner(value.orNull)

  // ---

  def initiatorOpt: Option[Owner] = Option(underlying.getInitiator)

  def initiatorOpt_=(value: Option[Owner]): Unit =
    underlying.setInitiator(value.orNull)

  // ---

  def storageClassOpt: Option[String] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[String]): Unit =
    underlying.setStorageClass(value.orNull)

  // ---

  def initiatedOpt: Option[Date] = Option(underlying.getInitiated)

  def initiatedOpt_=(value: Option[Date]): Unit =
    underlying.setInitiated(value.orNull)

}

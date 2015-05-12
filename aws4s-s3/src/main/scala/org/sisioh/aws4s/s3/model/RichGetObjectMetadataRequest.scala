package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{ GetObjectMetadataRequest, SSECustomerKey }
import org.sisioh.aws4s.PimpedType

class RichGetObjectMetadataRequest(val underlying: GetObjectMetadataRequest)
    extends AnyVal with PimpedType[GetObjectMetadataRequest] {

  def bucketName: String = underlying.getBucketName

  def bucketName_=(value: String): Unit =
    underlying.setBucketName(value)

  // ---

  def key = underlying.getKey

  def key_=(value: String): Unit =
    underlying.setKey(value)

  // ---

  def versionIdOpt: Option[String] = Option(underlying.getVersionId)

  def versionIdOpt_=(value: Option[String]): Unit =
    underlying.setVersionId(value.orNull)

  def withWithVersionId(value: Option[String]): GetObjectMetadataRequest =
    underlying.withVersionId(value.orNull)

  // ---

  def sseCustomerKeyOpt: Option[SSECustomerKey] = Option(underlying.getSSECustomerKey)

  def sseCustomerKeyOpt_=(value: Option[SSECustomerKey]): Unit =
    underlying.setSSECustomerKey(value.orNull)

  def withSseCustomerKeyOpt_=(value: Option[SSECustomerKey]): GetObjectMetadataRequest =
    underlying.withSSECustomerKey(value.orNull)

}

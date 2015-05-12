package org.sisioh.aws4s.s3.model

import java.io.{File, InputStream}

import com.amazonaws.services.s3.model._
import org.sisioh.aws4s.PimpedType

class RichPutObjectRequest(val underlying: PutObjectRequest)
  extends AnyVal with PimpedType[PutObjectRequest] {


  def withAccessControlListOpt(value: Option[AccessControlList]): PutObjectRequest =
    underlying.withAccessControlList(value.orNull)

  // ---

  def withCannedAclOpt(value: Option[CannedAccessControlList]): PutObjectRequest =
    underlying.withCannedAcl(value.orNull)

  // ---

  def withFileOpt(value: Option[File]): PutObjectRequest =
    underlying.withFile(value.orNull)

  // ---

  def withInputStreamOpt(value: Option[InputStream]): PutObjectRequest =
    underlying.withInputStream(value.orNull)

  // ---

  def withMetadataOpt(value: Option[ObjectMetadata]): PutObjectRequest =
    underlying.withMetadata(value.orNull)

  // ---


  def withRedirectLocationOpt(value: Option[String]): PutObjectRequest =
    underlying.withRedirectLocation(value.orNull)

  // ---

  def withSSEAwsKeyManagementParamsOpt(value: Option[SSEAwsKeyManagementParams]): PutObjectRequest =
    underlying.withSSEAwsKeyManagementParams(value.orNull)

  // ---

  def withSSECustomerKeyOpt(value: Option[SSECustomerKey]): PutObjectRequest =
    underlying.withSSECustomerKey(value.orNull)

  // ---


  def withStorageClassOpt(value: Option[String]): PutObjectRequest =
    underlying.withStorageClass(value.orNull)

}

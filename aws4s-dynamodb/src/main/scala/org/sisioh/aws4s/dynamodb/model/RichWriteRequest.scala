package org.sisioh.aws4s.dynamodb.model

import com.amazonaws.services.dynamodbv2.model.{DeleteRequest, PutRequest, WriteRequest}
import org.sisioh.aws4s.PimpedType

object WriteRequestFactory {

  def create(): WriteRequest = new WriteRequest()

  def create(putRequest: PutRequest): WriteRequest = new WriteRequest(putRequest)

  def create(deleteRequest: DeleteRequest): WriteRequest = new WriteRequest(deleteRequest)

}

class RichWriteRequest(val underlying: WriteRequest) extends AnyVal with PimpedType[WriteRequest] {

  def deleteRequestOpt: Option[DeleteRequest] = Option(underlying.getDeleteRequest)

  def deleteRequestOpt_=(value: Option[DeleteRequest]): Unit =
    underlying.setDeleteRequest(value.orNull)

  def withDeleteRequestOpt(value: Option[DeleteRequest]): WriteRequest =
    underlying.withDeleteRequest(value.orNull)

  def putRequestOpt: Option[PutRequest] = Option(underlying.getPutRequest)

  def putRequestOpt_=(value: Option[PutRequest]): Unit = underlying.setPutRequest(value.orNull)

  def withPutRequestOpt(value: Option[PutRequest]): Unit = underlying.withPutRequest(value.orNull)

}

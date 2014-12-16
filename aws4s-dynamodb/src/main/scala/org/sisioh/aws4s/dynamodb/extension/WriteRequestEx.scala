package org.sisioh.aws4s.dynamodb.extension

import com.amazonaws.services.dynamodbv2.model.WriteRequest

import org.sisioh.aws4s.dynamodb.Implicits._

case class WriteRequestEx(underlying: WriteRequest) {

  val putRequestOpt = underlying.putRequestOpt

  val deleteRequestOpt = underlying.deleteRequestOpt

}

package org.sisioh.aws4s.dynamodb.extension

import java.nio.ByteBuffer

import com.amazonaws.services.{ dynamodbv2 => aws }
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.AttributeValueFactory

object AttributeValue {

  def apply(booleanValue: Option[Boolean],
    numberValue: Option[String],
    numbersValue: Option[Iterable[String]],
    stringValue: Option[String],
    stringsValue: Option[Seq[String]],
    byteBufferValue: Option[ByteBuffer],
    byteBuffersValue: Option[Seq[ByteBuffer]],
    nullValue: Option[Boolean]): AttributeValue = {
    AttributeValue(
      AttributeValueFactory.create().
        withBooleanOpt(booleanValue).
        withNumberOpt(numberValue).
        withNumbersOpt(numbersValue).
        withStringOpt(stringValue).
        withStringsOpt(stringsValue).
        withByteBufferOpt(byteBufferValue).
        withByteBuffersOpt(byteBuffersValue).
        withNullOpt(nullValue)
    )
  }

}

case class AttributeValue(underlying: aws.model.AttributeValue) {

  val booleanValue: Option[Boolean] = underlying.booleanOpt

  val numberValue: Option[String] = underlying.numberOpt

  val numbersValue: Option[Iterable[String]] = underlying.numbersOpt

  val stringValue: Option[String] = underlying.stringOpt

  val stringsValue: Option[Seq[String]] = underlying.stringsOpt

  val byteBufferValue: Option[ByteBuffer] = underlying.byteBufferOpt

  val byteBuffersValue: Option[Seq[ByteBuffer]] = underlying.byteBuffersOpt

  val nullValue: Option[Boolean] = underlying.nullOpt

}

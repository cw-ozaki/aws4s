package org.sisioh.aws4s.dynamodb.extension

import java.nio.ByteBuffer

import com.amazonaws.services.dynamodbv2.model.AttributeValue
import org.sisioh.aws4s.dynamodb.Implicits._
import org.sisioh.aws4s.dynamodb.model.AttributeValueFactory

object AttributeValueEx {

  def apply(underlying: AttributeValue): AttributeValueEx = {
    AttributeValueEx(
      underlying.booleanOpt,
      underlying.numberOpt,
      underlying.numbersOpt,
      underlying.stringOpt,
      underlying.stringsOpt,
      underlying.byteBufferOpt,
      underlying.byteBuffersOpt,
      underlying.nullOpt
    )
  }

}

case class AttributeValueEx(booleanValue: Option[Boolean],
                            numberValue: Option[String],
                            numbersValue: Option[Iterable[String]],
                            stringValue: Option[String],
                            stringsValue: Option[Seq[String]],
                            byteBufferValue: Option[ByteBuffer],
                            byteBuffersValue: Option[Seq[ByteBuffer]],
                            nullValue: Option[Boolean]) {

  def toUnderlying: AttributeValue = {
    AttributeValueFactory.create().
      withBooleanOpt(booleanValue).
      withNumberOpt(numberValue).
      withNumbersOpt(numbersValue).
      withStringOpt(stringValue).
      withStringsOpt(stringsValue).
      withByteBufferOpt(byteBufferValue).
      withByteBuffersOpt(byteBuffersValue).
      withNullOpt(nullValue)
  }

}

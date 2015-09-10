package org.sisioh.aws4s.sns.model

import java.nio.ByteBuffer

import com.amazonaws.services.sns.model.MessageAttributeValue
import org.sisioh.aws4s.PimpedType

object MessageAttributeValueFactory {

  def create(): MessageAttributeValue =
    new MessageAttributeValue()

}

class RichMessageAttributeValue(val underlying: MessageAttributeValue)
    extends AnyVal with PimpedType[MessageAttributeValue] {

  def stringValueOpt: Option[String] = Option(underlying.getStringValue)

  def stringValueOpt_=(value: Option[String]): Unit =
    underlying.setStringValue(value.orNull)

  def withStringValueOpt(value: Option[String]): MessageAttributeValue =
    underlying.withStringValue(value.orNull)

  def binaryValueOpt: Option[ByteBuffer] = Option(underlying.getBinaryValue)

  def binaryValueOpt_=(value: Option[ByteBuffer]): Unit =
    underlying.setBinaryValue(value.orNull)

  def withBinaryValueOpt(value: Option[ByteBuffer]): MessageAttributeValue =
    underlying.withBinaryValue(value.orNull)

  def dataTypeOpt: Option[String] = Option(underlying.getDataType)

  def dataTypeOpt_=(value: Option[String]): Unit =
    underlying.setDataType(value.orNull)

  def withDataTypeOpt(value: Option[String]): MessageAttributeValue =
    underlying.withDataType(value.orNull)

}

package org.sisioh.aws4s.sqs.model

import java.nio.ByteBuffer

import com.amazonaws.services.sqs.model.MessageAttributeValue
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichMessageAttributeValue(val underlying: MessageAttributeValue)
    extends AnyVal with PimpedType[MessageAttributeValue] {

  def stringValueOpt: Option[String] = Option(underlying.getStringValue)

  def stringValueOpt_=(value: Option[String]): Unit =
    underlying.setStringValue(value.orNull)

  def withStringValueOpt(value: Option[String]): MessageAttributeValue =
    underlying.withStringValue(value.orNull)

  // ---

  def binaryValueOpt: Option[ByteBuffer] = Option(underlying.getBinaryValue)

  def binaryValueOpt_=(value: Option[ByteBuffer]): Unit =
    underlying.setBinaryValue(value.orNull)

  def withBinaryValueOpt(value: Option[ByteBuffer]): MessageAttributeValue =
    underlying.withBinaryValue(value.orNull)

  // ---

  def stringListValues: Seq[String] = underlying.getStringListValues.asScala.toVector

  def stringListValues_=(value: Seq[String]): Unit =
    underlying.setStringListValues(value.asJava)

  def withStringListValues(value: Seq[String]): MessageAttributeValue =
    underlying.withStringListValues(value.asJava)

  // ---

  def binaryListValues: Seq[ByteBuffer] = underlying.getBinaryListValues.asScala.toVector

  def binaryListValues_=(value: Seq[ByteBuffer]): Unit =
    underlying.setBinaryListValues(value.asJava)

  def withBinaryListValues(value: Seq[ByteBuffer]): MessageAttributeValue =
    underlying.withBinaryListValues(value.asJava)

  // ---

  def dataTypeOpt: Option[String] = Option(underlying.getDataType)

  def dataTypeOpt_=(value: Option[String]): Unit =
    underlying.setDataType(value.orNull)

  def withDataTypeOpt(value: Option[String]): MessageAttributeValue =
    underlying.withDataType(value.orNull)

}

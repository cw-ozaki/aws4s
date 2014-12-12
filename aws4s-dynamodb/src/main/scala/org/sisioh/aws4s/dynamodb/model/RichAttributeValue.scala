package org.sisioh.aws4s.dynamodb.model

import java.nio.ByteBuffer

import com.amazonaws.services.dynamodbv2.model.AttributeValue
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object AttributeValueFactory {

  import org.sisioh.aws4s.dynamodb.Implicits._

  def create(): AttributeValue = new AttributeValue()

  def fromByteBufferOpt(value: Option[ByteBuffer]): AttributeValue = create().withByteBufferOpt(value)

  def fromByteBuffersOpt(value: Option[Seq[ByteBuffer]]): AttributeValue = create().withByteBuffersOpt(value)

  def fromBoolean(value: Option[Boolean]): AttributeValue = create().withBooleanOpt(value)

  def fromNumberOpt(value: Option[String]): AttributeValue = create().withNumberOpt(value)

  def fromNumbersOpt(value: Option[Iterable[String]]): AttributeValue = create().withNumbersOpt(value)

  def fromStringOpt(value: Option[String]): AttributeValue = new AttributeValue(value.orNull)

  def fromStringsOpt(value: Option[Seq[String]]): AttributeValue = new AttributeValue(value.map(_.asJava).orNull)

  def fromMapOpt(value: Option[Map[String, AttributeValue]]): AttributeValue = create().withMapOpt(value)

  def fromListOpt(value: Option[Seq[AttributeValue]]): AttributeValue = create().withListOpt(value)

  def fromNullOpt(value: Option[Boolean]): AttributeValue = create().withNullOpt(value)

}

class RichAttributeValue(val underlying: AttributeValue) extends AnyVal with PimpedType[AttributeValue] {

  // -- for ByteBuffer

  def bOpt_=(value: Option[ByteBuffer]): Unit = underlying.setB(value.orNull)

  def bOpt: Option[ByteBuffer] = Option(underlying.getB)

  def withBOpt(value: Option[ByteBuffer]) = underlying.withB(value.orNull)

  def byteBufferOpt_=(value: Option[ByteBuffer]): Unit = bOpt = value

  def byteBufferOpt: Option[ByteBuffer] = bOpt

  def withByteBufferOpt(value: Option[ByteBuffer]) = withBOpt(value)

  // -- for boolean

  def boolOpt_=(value: Option[Boolean]): Unit = underlying.setBOOL(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def boolOpt: Option[Boolean] = Option(underlying.getBOOL)

  def withBoolOpt(value: Option[Boolean]): AttributeValue = underlying.withBOOL(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def booleanOpt_=(value: Option[Boolean]): Unit = boolOpt = value

  def booleanOpt: Option[Boolean] = boolOpt

  def withBooleanOpt(value: Option[Boolean]): AttributeValue = withBoolOpt(value)

  // -- for numbers

  def nsOpt_=(value: Option[Seq[String]]): Unit = underlying.setNS(value.map(_.asJava).orNull)

  def nsOpt: Option[Seq[String]] = Option(underlying.getNS).map(_.asScala)

  def numbersOpt_=(value: Option[Iterable[String]]): Unit = nsOpt = value.map(_.toSeq)

  def numbersOpt: Option[Iterable[String]] = nsOpt

  def withNSOpt(ns: Option[Iterable[String]]): AttributeValue = underlying.withNS(ns.map(_.toSeq.asJava).orNull)

  def withNumbersOpt(value: Option[Iterable[String]]): AttributeValue = withNSOpt(value)

  // -- for strings

  def ssOpt_=(value: Option[Seq[String]]): Unit = underlying.setSS(value.map(_.asJava).orNull)

  def ssOpt: Option[Seq[String]] = Option(underlying.getSS).map(_.asScala)

  def stringsOpt_=(value: Option[Seq[String]]): Unit = ssOpt = value

  def stringsOpt: Option[Seq[String]] = ssOpt

  def withSSOpt(ss: Option[Iterable[String]]): AttributeValue = underlying.withSS(ss.map(_.toSeq.asJava).orNull)

  def withStringsOpt(ss: Option[Iterable[String]]): AttributeValue = withSSOpt(ss)

  // -- for ByteBuffers

  def bsOpt_=(values: Option[Seq[ByteBuffer]]): Unit = underlying.setBS(values.map(_.asJava).orNull)

  def bsOpt: Option[Seq[ByteBuffer]] = Option(underlying.getBS).map(_.asScala)

  def byteBuffersOpt_=(value: Option[Seq[ByteBuffer]]): Unit = bsOpt = value

  def byteBuffersOpt: Option[Seq[ByteBuffer]] = bsOpt

  def withBSOpt(bs: Option[Iterable[ByteBuffer]]): AttributeValue = underlying.withBS(bs.map(_.toSeq.asJava).orNull)

  def withByteBuffersOpt(value: Option[Iterable[ByteBuffer]]): AttributeValue = withBSOpt(value)

  // -- for List

  def lOpt_=(values: Option[Seq[AttributeValue]]): Unit = underlying.setL(values.map(_.asJava).orNull)

  def lOpt: Option[Seq[AttributeValue]] = Option(underlying.getL).map(_.asScala)

  def listOpt_=(value: Option[Seq[AttributeValue]]): Unit = lOpt = value

  def listOpt: Option[Seq[AttributeValue]] = lOpt

  def withLOpt(l: Option[Iterable[AttributeValue]]): AttributeValue = underlying.withL(l.map(_.toSeq.asJava).orNull)

  def withListOpt(value: Option[Seq[AttributeValue]]): AttributeValue = withLOpt(value)

  // -- for Map

  def mOpt_=(values: Option[Map[String, AttributeValue]]): Unit = underlying.setM(values.map(_.asJava).orNull)

  def mOpt: Option[Map[String, AttributeValue]] = Option(underlying.getM).map(_.asScala.toMap)

  def mapOpt_=(value: Option[Map[String, AttributeValue]]): Unit = mOpt = value

  def mapOpt: Option[Map[String, AttributeValue]] = mOpt

  def withM(m: Option[Map[String, AttributeValue]]): AttributeValue = underlying.withM(m.map(_.asJava).orNull)

  def withMapOpt(value: Option[Map[String, AttributeValue]]): AttributeValue = withM(value)

  // -- for number

  def nOpt_=(value: Option[String]): Unit = underlying.setN(value.orNull)

  def nOpt: Option[String] = Option(underlying.getN)

  def numberOpt_=(value: Option[String]): Unit = nOpt = value

  def numberOpt: Option[String] = nOpt

  def withNOpt(value: Option[String]): AttributeValue = underlying.withN(value.orNull)

  def withNumberOpt(value: Option[String]): AttributeValue = withNOpt(value)

  // -- for string

  def sOpt_=(value: Option[String]): Unit = underlying.setS(value.orNull)

  def sOpt: Option[String] = Option(underlying.getS)

  def stringOpt_=(value: Option[String]): Unit = sOpt = value

  def stringOpt: Option[String] = sOpt

  def withSOpt(value: Option[String]): AttributeValue = underlying.withS(value.orNull)

  def withStringOpt(value: Option[String]): AttributeValue = withSOpt(value)

  // -- null

  def nullOpt_=(value: Option[Boolean]): Unit = underlying.setNULL(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def nullOpt: Option[Boolean] = Option(underlying.getNULL)

  def withNullOpt(value: Option[Boolean]): AttributeValue = underlying.withNULL(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}

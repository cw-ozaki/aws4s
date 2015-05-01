package org.sisioh.aws4s.dynamodb.document

import java.nio.ByteBuffer
import java.util

import com.amazonaws.services.dynamodbv2.document.Item
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ItemFactory {

  def fromMap(attributes: Map[String, AnyRef]): Item =
    Item.fromMap(attributes.asJava)

  def fromJSON(json: String): Item =
    Item.fromJSON(json)

}

class RichItem(val underlying: Item) extends AnyVal with PimpedType[Item] {

  def toStringSet(attrName: String): Set[String] =
    underlying.getStringSet(attrName).asScala.toSet

  def toNumberSet(attrName: String): Set[BigDecimal] =
    underlying.getNumberSet(attrName).asScala.map(BigDecimal.apply).toSet

  def toMap[T](attrName: String): Map[String, T] =
    underlying.
      getMap(attrName).
      asInstanceOf[java.util.Map[String, T]].
      asScala.toMap

  def toSeq[T](attrName: String): Seq[T] =
    underlying.
      getList(attrName).
      asInstanceOf[java.util.List[T]].
      asScala.toSeq

  def toByteBufferSet(attrName: String): Set[ByteBuffer] =
    underlying.getByteBufferSet(attrName).asScala.toSet

  def toBinarySet(attrName: String): Set[Array[Byte]] =
    underlying.getBinarySet(attrName).asScala.toSet

  def toMap: Map[String, AnyRef] =
    underlying.asMap().asScala.toMap

  def toAttributes: Iterable[(String, Any)] = {
    underlying.attributes().asScala.map { e =>
      (e.getKey, e.getValue match {
        case v: java.lang.Integer => v.toInt
        case v: java.lang.Long => v.toLong
        case v: java.lang.Short => v.toShort
        case v: java.lang.Float => v.toFloat
        case v: java.lang.Double => v.toDouble
        case v: java.lang.Boolean => v
        case v: java.math.BigDecimal => BigDecimal(v)
        case v: java.math.BigInteger => BigInt(v)
        case v: util.Collection[_] => v.asScala
        case v: util.Map[_, _] => v.asScala
        case v => v
      })
    }.toIterable
  }

  def withBigDecimalSet(attrName: String, values: Set[BigDecimal]): Item =
    underlying.withBigDecimalSet(attrName, values.map(e => e.bigDecimal).asJava)

  def withBinarySet(attrName: String, values: Set[Array[Byte]]): Item =
    underlying.withBinarySet(attrName, values.asJava)

  def withByteBufferSet(attrName: String, values: Set[ByteBuffer]): Item =
    underlying.withByteBufferSet(attrName, values.asJava)

  def withSeq(attrName: String, values: Seq[Any]): Item =
    underlying.withList(attrName, values.asJava)

  def withMap(attrName: String, values: Map[String, Any]): Item =
    underlying.withMap(attrName, values.asJava)

  def withNumberSet(attrName: String, values: Set[Number]): Item =
    underlying.withNumberSet(attrName, values.asJava)

  def withStringSet(attrName: String, values: Set[String]): Item =
    underlying.withStringSet(attrName, values.asJava)

}

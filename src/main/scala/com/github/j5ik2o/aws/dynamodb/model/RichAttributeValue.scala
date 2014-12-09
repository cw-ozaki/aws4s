package com.github.j5ik2o.aws.dynamodb.model

import java.nio.ByteBuffer

import com.amazonaws.services.dynamodbv2.model.AttributeValue
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object AttributeValueFactory {

  def apply(): AttributeValue = new AttributeValue()

  def apply(s: String): AttributeValue = new AttributeValue(s)

  def apply(ss: Seq[String]): AttributeValue = new AttributeValue(ss.asJava)

}

class RichAttributeValue(val underlying: AttributeValue) extends AnyVal with PimpedType[AttributeValue] {

  def b_=(value: ByteBuffer): Unit = underlying.setB(value)

  def b: ByteBuffer = underlying.getB

  def bool_=(value: Boolean): Unit = underlying.setBOOL(value)

  def bool: Boolean = underlying.getBOOL

  def ns_=(values: Seq[String]): Unit = underlying.setNS(values.asJava)

  def ns: Seq[String] = underlying.getNS.asScala

  def withNS(ns: Iterable[String]) = underlying.withNS(ns.toSeq.asJava)

  def ss_=(values: Seq[String]): Unit = underlying.setSS(values.asJava)

  def ss: Seq[String] = underlying.getSS.asScala

  def withSS(ss: Iterable[String]) = underlying.withSS(ss.toSeq.asJava)

  def bs_=(values: Seq[ByteBuffer]): Unit = underlying.setBS(values.asJava)

  def bs: Seq[ByteBuffer] = underlying.getBS.asScala

  def withBS(bs: Iterable[ByteBuffer]) = underlying.withBS(bs.toSeq.asJava)

  def l_=(values: Seq[AttributeValue]): Unit = underlying.setL(values.asJava)

  def l: Seq[AttributeValue] = underlying.getL.asScala

  def withL(l: Iterable[AttributeValue]) = underlying.withL(l.toSeq.asJava)

  def m_=(values: Map[String, AttributeValue]): Unit = underlying.setM(values.asJava)

  def m: Map[String, AttributeValue] = underlying.getM.asScala.toMap

  def withM(m: Map[String, AttributeValue]) = underlying.withM(m.asJava)

  def n_=(value: String): Unit = underlying.setN(value)

  def n: String = underlying.getN

  def s_=(value: String): Unit = underlying.setS(value)

  def s: String = underlying.getS

  def null_=(value: Boolean): Unit = underlying.setNULL(value)

  def `null`: Boolean = underlying.getNULL

}

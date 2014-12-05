package com.github.j5ik2o.aws.dynamodb.model

import java.nio.ByteBuffer

import com.amazonaws.services.dynamodbv2.model.AttributeValue
import com.github.j5ik2o.aws.dynamodb.PimpedType

import scala.collection.JavaConverters._

object AttributeValueFactory {

  def apply(): AttributeValue = new AttributeValue()

  def apply(s: String): AttributeValue = new AttributeValue(s)

  def apply(ss: Seq[String]): AttributeValue = new AttributeValue(ss.asJava)

}

class RichAttributeValue(val underlying: AttributeValue) extends AnyVal with PimpedType[AttributeValue] {

  def b: ByteBuffer = underlying.getB

  def bool: Boolean = underlying.getBOOL

  def ns: Seq[String] = underlying.getNS.asScala

  def ss: Seq[String] = underlying.getSS.asScala

  def bs: Seq[ByteBuffer] = underlying.getBS.asScala

  def l: Seq[AttributeValue] = underlying.getL.asScala

  def m: Map[String, AttributeValue] = underlying.getM.asScala.toMap

  def n: String = underlying.getN

  def s: String = underlying.getS

  def `null`: Boolean = underlying.getNULL

  def wihtBS(bs: Iterable[ByteBuffer]) = underlying.withBS(bs.toSeq.asJava)

  def withL(l: Iterable[AttributeValue]) = underlying.withL(l.toSeq.asJava)

  def withM(m: Map[String, AttributeValue]) = underlying.withM(m.asJava)

  def withNS(ns: Iterable[String]) = underlying.withNS(ns.toSeq.asJava)

  def withSS(ss: Iterable[String]) = underlying.withSS(ss.toSeq.asJava)

}

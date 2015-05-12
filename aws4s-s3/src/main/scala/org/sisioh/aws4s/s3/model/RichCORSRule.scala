package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.CORSRule
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object CORSRuleFactory {

  def create(): CORSRule = new CORSRule()

}

class RichCORSRule(val underlying: CORSRule)
  extends AnyVal with PimpedType[CORSRule] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): CORSRule =
    underlying.withId(value.orNull)

  // ---

  def allowedMethods: Option[Seq[AllowedMethods]] = Option(underlying.getAllowedMethods).map(_.asScala.toVector)

  def allowedMethods_=(value: Option[Seq[AllowedMethods]]): Unit =
    underlying.setAllowedMethods(value.map(_.asJava).orNull)

  def withAllowedMethods(value: Option[Seq[AllowedMethods]]): CORSRule =
    underlying.withAllowedMethods(value.map(_.asJava).orNull)

  // ---

  def allowedOrigins: Option[Seq[String]] = Option(underlying.getAllowedOrigins).map(_.asScala.toVector)

  def allowedOrigins_=(value: Option[Seq[String]]): Unit =
    underlying.setAllowedOrigins(value.map(_.asJava).orNull)

  def withAllowedOrigins(value: Option[Seq[String]]): CORSRule =
    underlying.withAllowedOrigins(value.map(_.asJava).orNull)

  // ---

  def maxAgeSeconds: Int = underlying.getMaxAgeSeconds

  def maxAgeSeconds_=(value: Int): Unit =
    underlying.setMaxAgeSeconds(value)

  // ---

  def exposedHeadersOpt: Option[Seq[String]] = Option(underlying.getExposedHeaders).map(_.asScala.toVector)

  def exposedHeadersOpt_=(value: Option[Seq[String]]): Unit =
    underlying.setExposedHeaders(value.map(_.asJava).orNull)

  def withExposedHeadersOpt(value: Option[Seq[String]]): CORSRule =
    underlying.withExposedHeaders(value.map(_.asJava).orNull)

  // ---

  def allowedHeadersOpt: Option[Seq[String]] = Option(underlying.getAllowedHeaders).map(_.asScala.toVector)

  def allowedHeadersOpt_=(value: Option[Seq[String]]): Unit =
    underlying.setAllowedHeaders(value.map(_.asJava).orNull)

  def withAllowedHeadersOpt(value: Option[Seq[String]]): CORSRule =
    underlying.withAllowedHeaders(value.map(_.asJava).orNull)

}

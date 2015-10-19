package org.sisioh.aws4s.elasticache.model

import com.amazonaws.services.elasticache.model.{CacheNodeTypeSpecificParameter, EngineDefaults, Parameter}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EngineDefaultsFactory {

  def create: EngineDefaults = new EngineDefaults()

}

class RichEngineDefaults(val underlying: EngineDefaults)
  extends AnyVal with PimpedType[EngineDefaults] {

  def cacheParameterGroupFamilyOpt: Option[String] = Option(underlying.getCacheParameterGroupFamily)

  def cacheParameterGroupFamilyOpt_=(value: Option[String]): Unit =
    underlying.setCacheParameterGroupFamily(value.orNull)

  def withCacheParameterGroupFamilyOpt(value: Option[String]): EngineDefaults =
    underlying.withCacheParameterGroupFamily(value.orNull)

  def markerOpt: Option[String] = Option(underlying.getMarker)

  def markerOpt_=(value: Option[String]): Unit =
    underlying.setMarker(value.orNull)

  def withMarkerOpt(value: Option[String]): EngineDefaults =
    underlying.withMarker(value.orNull)

  def parametersOpt: Option[Seq[Parameter]] = Option(underlying.getParameters).map(_.asScala.toVector)

  def parametersOpt_=(value: Option[Seq[Parameter]]): Unit =
    underlying.setParameters(value.map(_.asJava).orNull)

  def withParametersOpt(value: Option[Seq[Parameter]]): EngineDefaults =
    underlying.withParameters(value.map(_.asJava).orNull)

  def cacheNodeTypeSpecificParametersOpt: Option[Seq[CacheNodeTypeSpecificParameter]] =
    Option(underlying.getCacheNodeTypeSpecificParameters).map(_.asScala.toVector)

  def cacheNodeTypeSpecificParametersOpt_=(value: Option[Seq[CacheNodeTypeSpecificParameter]]): Unit =
    underlying.setCacheNodeTypeSpecificParameters(value.map(_.asJava).orNull)

  def withCacheNodeTypeSpecificParametersOpt(value: Option[Seq[CacheNodeTypeSpecificParameter]]): EngineDefaults =
    underlying.withCacheNodeTypeSpecificParameters(value.map(_.asJava).orNull)

}

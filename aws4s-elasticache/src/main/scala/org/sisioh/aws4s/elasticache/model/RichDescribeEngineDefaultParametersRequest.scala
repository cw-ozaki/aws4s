package org.sisioh.aws4s.elasticache.model

import com.amazonaws.services.elasticache.model.DescribeEngineDefaultParametersRequest
import org.sisioh.aws4s.PimpedType

object DescribeEngineDefaultParametersRequestFactory {

  def create(): DescribeEngineDefaultParametersRequest = new DescribeEngineDefaultParametersRequest()

  def create(cacheParameterGroupFamily: String) = new DescribeEngineDefaultParametersRequest(cacheParameterGroupFamily)

}


class RichDescribeEngineDefaultParametersRequest(val underlying: DescribeEngineDefaultParametersRequest)
  extends AnyVal with PimpedType[DescribeEngineDefaultParametersRequest] {

  def cacheParameterGroupFamilyOpt = Option(underlying.getCacheParameterGroupFamily)

  def cacheParameterGroupFamilyOpt_=(value: Option[String]): Unit =
    underlying.setCacheParameterGroupFamily(value.orNull)

  def withCacheParameterGroupFamily(value: Option[String]): DescribeEngineDefaultParametersRequest =
    underlying.withCacheParameterGroupFamily(value.orNull)

  def maxRecordsOpt: Option[Int] = Option(underlying.getMaxRecords).map(_.asInstanceOf[Int])

  def maxRecordsOpt(value: Option[Int]): Unit =
    underlying.setMaxRecords(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def withMaxRecordsOpt(value: Option[Int]): DescribeEngineDefaultParametersRequest =
    underlying.withMaxRecords(value.map(_.asInstanceOf[java.lang.Integer]).orNull)

  def markerOpt: Option[String] = Option(underlying.getMarker)

  def markerOpt_=(value: Option[String]): Unit =
    underlying.setMarker(value.orNull)

  def withMarkerOpt(value: Option[String]): DescribeEngineDefaultParametersRequest =
    underlying.withMarker(value.orNull)


}

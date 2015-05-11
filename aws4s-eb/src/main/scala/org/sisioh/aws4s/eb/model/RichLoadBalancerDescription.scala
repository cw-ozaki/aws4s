package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{Listener, LoadBalancerDescription}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichLoadBalancerDescription(val underlying: LoadBalancerDescription)
  extends AnyVal with PimpedType[LoadBalancerDescription] {

  def loadBalancerNameOpt: Option[String] = Option(underlying.getLoadBalancerName)

  def loadBalancerNameOpt_=(value: Option[String]): Unit =
    underlying.setLoadBalancerName(value.orNull)

  def withLoadBalancerNameOpt(value: Option[String]): LoadBalancerDescription =
    underlying.withLoadBalancerName(value.orNull)

  // ---

  def domainOpt: Option[String] = Option(underlying.getDomain)

  def domainOpt_=(value: Option[String]): Unit =
    underlying.setDomain(value.orNull)

  def withDomainOpt(value: Option[String]): LoadBalancerDescription =
    underlying.withDomain(value.orNull)

  // ---

  def listeners: Seq[Listener] = underlying.getListeners.asScala

  def listeners_=(value: Seq[Listener]): Unit =
    underlying.setListeners(value.asJava)

  def withListeners(value: Seq[Listener]): LoadBalancerDescription =
    underlying.withListeners(value.asJava)

}

package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentResourceDescription
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EnvironmentResourceDescriptionFactory {

  def create(): EnvironmentResourceDescription = new EnvironmentResourceDescription()

}

class RichEnvironmentResourceDescription(val underlying: EnvironmentResourceDescription)
  extends AnyVal with PimpedType[EnvironmentResourceDescription] {

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): EnvironmentResourceDescription =
    underlying.withEnvironmentName(value.orNull)

  def autoScalingGroups = underlying.getAutoScalingGroups.asScala

  def instances = underlying.getInstances.asScala

  def launchConfigurations = underlying.getLaunchConfigurations.asScala

  def loadBalancers = underlying.getLoadBalancers.asScala

  def triggers = underlying.getTriggers.asScala

  def queues = underlying.getQueues.asScala

}

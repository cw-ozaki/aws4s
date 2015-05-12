package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentInfoDescription
import org.sisioh.aws4s.PimpedType

object EnvironmentInfoDescriptionFactory {

  def create(): EnvironmentInfoDescription = new EnvironmentInfoDescription()

}

class RichEnvironmentInfoDescription(val underlying: EnvironmentInfoDescription)
    extends AnyVal with PimpedType[EnvironmentInfoDescription] {

  def infoTypeOpt = Option(underlying.getInfoType)

  def infoTypeOpt_=(value: Option[String]): Unit =
    underlying.setInfoType(value.orNull)

  def withInfoTypeOpt(value: Option[String]): EnvironmentInfoDescription =
    underlying.withInfoType(value.orNull)

  // ---

  def ec2InstanceIdOpt: Option[String] = Option(underlying.getEc2InstanceId)

  def ec2InstanceIdOpt_=(value: Option[String]): Unit =
    underlying.setEc2InstanceId(value.orNull)

  def withEc2InstanceIdOpt(value: Option[String]): EnvironmentInfoDescription =
    underlying.withEc2InstanceId(value.orNull)

  // ---

  def sampleTimestampOpt: Option[Date] = Option(underlying.getSampleTimestamp)

  def sampleTimestampOpt_=(value: Option[Date]): Unit =
    underlying.setSampleTimestamp(value.orNull)

  def withSampleTimestampOpt(value: Option[Date]): EnvironmentInfoDescription =
    underlying.withSampleTimestamp(value.orNull)

  // ---

  def messageOpt: Option[String] = Option(underlying.getMessage)

  def messageOpt_=(value: Option[String]): Unit =
    underlying.withMessage(value.orNull)

  def withMessageOpt(value: Option[String]): EnvironmentInfoDescription =
    underlying.withMessage(value.orNull)

}

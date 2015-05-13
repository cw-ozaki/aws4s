package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ ConfigurationSettingsDescription, DescribeConfigurationSettingsResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeConfigurationSettingsResultFactory {

  def create(): DescribeConfigurationSettingsResult = new DescribeConfigurationSettingsResult()

}

class RichDescribeConfigurationSettingsResult(val underlying: DescribeConfigurationSettingsResult)
    extends AnyVal with PimpedType[DescribeConfigurationSettingsResult] {

  def configurationSettings: Seq[ConfigurationSettingsDescription] = underlying.getConfigurationSettings.asScala.toVector

  def configurationSettings_=(value: Seq[ConfigurationSettingsDescription]): Unit =
    underlying.setConfigurationSettings(value.asJava)

  def withConfigurationSettings_=(value: Seq[ConfigurationSettingsDescription]): DescribeConfigurationSettingsResult =
    underlying.withConfigurationSettings(value.asJava)
}

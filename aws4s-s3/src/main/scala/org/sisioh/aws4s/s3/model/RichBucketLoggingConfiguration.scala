package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketLoggingConfiguration
import org.sisioh.aws4s.PimpedType

object BucketLoggingConfigurationFactory {

  def create(): BucketLoggingConfiguration = new BucketLoggingConfiguration()

  def create(destinationBucketName: String, logFilePrefix: String): BucketLoggingConfiguration =
    new BucketLoggingConfiguration(destinationBucketName, logFilePrefix)

}

class RichBucketLoggingConfiguration(val underlying: BucketLoggingConfiguration)
    extends AnyVal with PimpedType[BucketLoggingConfiguration] {

  def logFilePrefixOpt: Option[String] = Option(underlying.getLogFilePrefix)

  def logFilePrefixOpt_=(value: Option[String]): Unit = {
    underlying.setLogFilePrefix(value.orNull)
  }

  def destinationBucketNameOpt: Option[String] = Option(underlying.getDestinationBucketName)

  def destinationBucketNameOpt_=(value: Option[String]): Unit =
    underlying.setDestinationBucketName(value.orNull)

}

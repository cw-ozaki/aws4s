package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.{BucketNotificationConfiguration, NotificationConfiguration}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object BucketNotificationConfigurationFactory {

  def create(): BucketNotificationConfiguration = new BucketNotificationConfiguration()

  def create(name: String, notificationConfiguration: NotificationConfiguration): BucketNotificationConfiguration =
    new BucketNotificationConfiguration(name, notificationConfiguration)

}

class RichBucketNotificationConfiguration(val underlying: BucketNotificationConfiguration)
  extends AnyVal with PimpedType[BucketNotificationConfiguration] {

  def configurationsOpt: Option[Map[String, NotificationConfiguration]] =
    Option(underlying.getConfigurations).map(_.asScala.toMap)

  def configurationsOpt_=(value: Option[Map[String, NotificationConfiguration]]): Unit = {
    underlying.setConfigurations(value.map(_.asJava).orNull)
  }

  def withNotificationConfiguration(notificationConfiguration: Map[String, NotificationConfiguration]) =
    underlying.withNotificationConfiguration(notificationConfiguration.asJava)

  def getConfigurationByNameOpt(name: String): Option[NotificationConfiguration] =
    Option(underlying.getConfigurationByName(name))

  def removeConfiguration(name: String): Option[NotificationConfiguration] =
    Option(underlying.removeConfiguration(name))

}

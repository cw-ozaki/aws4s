package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.{NoncurrentVersionTransition, Rule, Transition}
import com.amazonaws.services.s3.model.{BucketLifecycleConfiguration, StorageClass}
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

class RichBucketLifecycleConfiguration(val underlying: BucketLifecycleConfiguration)
  extends AnyVal with PimpedType[BucketLifecycleConfiguration] {

  def rulesOpt: Option[Seq[Rule]] = Option(underlying.getRules).map(_.asScala)

  def rulesOpt_=(value: Option[Seq[Rule]]): Unit = {
    underlying.setRules(value.map(_.asJava).orNull)
  }

}

class RichNonCurrentVersionTransition(val underlying: NoncurrentVersionTransition)
  extends AnyVal with PimpedType[NoncurrentVersionTransition] {

  def days: Int = underlying.getDays

  def days_=(value: Int): Unit = {
    underlying.setDays(value)
  }

  def storageClassOpt: Option[StorageClass] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[StorageClass]): Unit = {
    underlying.setStorageClass(value.orNull)
  }

}

class RichTransition(val underlying: Transition) extends AnyVal with PimpedType[Transition] {

  def days: Int = underlying.getDays

  def days_=(value: Int): Unit = {
    underlying.setDays(value)
  }

  def storageClassOpt: Option[StorageClass] = Option(underlying.getStorageClass)

  def storageClassOpt_=(value: Option[StorageClass]): Unit = {
    underlying.setStorageClass(value.orNull)
  }

  def dateOpt: Option[Date] = Option(underlying.getDate)

  def dateOpt_=(value: Option[Date]): Unit = {
    underlying.setDate(value.orNull)
  }

}

class RichRule(val underlying: Rule) extends AnyVal with PimpedType[Rule] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit = {
    underlying.setId(value.orNull)
  }

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit = {
    underlying.setPrefix(value.orNull)
  }

  def expirationInDays = underlying.getExpirationInDays

  def expirationInDay_=(value: Int): Unit = {
    underlying.setExpirationInDays(value)
  }

  def nonCurrentVersionExpirationInDays: Int = underlying.getNoncurrentVersionExpirationInDays

  def nonCurrentVersionExpirationInDays_=(value: Int): Unit = {
    underlying.setNoncurrentVersionExpirationInDays(value)
  }

  def statusOpt: Option[String] = Option(underlying.getStatus)

  def statusOpt_=(value: Option[String]): Unit = {
    underlying.setStatus(value.orNull)
  }

  def expirationDateOpt: Option[Date] = Option(underlying.getExpirationDate)

  def expirationDateOpt_=(value: Option[Date]): Unit = {
    underlying.setExpirationDate(value.orNull)
  }

  def transitionOpt: Option[Transition] = Option(underlying.getTransition)

  def transitionOpt_=(value: Option[Transition]): Unit = {
    underlying.setTransition(value.orNull)
  }

  def nonCurrentVersionTransitionOpt: Option[NoncurrentVersionTransition] = Option(underlying.getNoncurrentVersionTransition)

  def nonCurrentVersionTransitionOpt_=(value: Option[NoncurrentVersionTransition]): Unit = {
    underlying.setNoncurrentVersionTransition(value.orNull)
  }

}


package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.{ NoncurrentVersionTransition, Transition, Rule }
import org.sisioh.aws4s.PimpedType

object RuleFactory {

  def create(): Rule = new Rule()

}

class RichRule(val underlying: Rule) extends AnyVal with PimpedType[Rule] {

  def idOpt: Option[String] = Option(underlying.getId)

  def idOpt_=(value: Option[String]): Unit =
    underlying.setId(value.orNull)

  def withIdOpt(value: Option[String]): Rule =
    underlying.withId(value.orNull)

  // ---

  def prefixOpt: Option[String] = Option(underlying.getPrefix)

  def prefixOpt_=(value: Option[String]): Unit =
    underlying.setPrefix(value.orNull)

  // ---

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

}

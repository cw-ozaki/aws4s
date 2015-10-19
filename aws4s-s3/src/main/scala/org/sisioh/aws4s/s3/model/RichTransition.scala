package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Transition
import com.amazonaws.services.s3.model.StorageClass
import org.sisioh.aws4s.PimpedType

object TransitionFactory {

  def create(): Transition = new Transition()

}

class RichTransition(val underlying: Transition)
    extends AnyVal with PimpedType[Transition] {

  def days: Int = underlying.getDays

  def days_=(value: Int): Unit = {
    underlying.setDays(value)
  }

  def storageClassAsStringOpt: Option[String] = Option(underlying.getStorageClassAsString)

  def storageClassOpt_=(value: Option[StorageClass]): Unit = {
    underlying.setStorageClass(value.orNull)
  }

  def dateOpt: Option[Date] = Option(underlying.getDate)

  def dateOpt_=(value: Option[Date]): Unit = {
    underlying.setDate(value.orNull)
  }

}

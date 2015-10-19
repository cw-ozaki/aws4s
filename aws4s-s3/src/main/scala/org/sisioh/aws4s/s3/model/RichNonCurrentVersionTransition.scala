package org.sisioh.aws4s.s3.model

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.NoncurrentVersionTransition
import com.amazonaws.services.s3.model.StorageClass
import org.sisioh.aws4s.PimpedType

object NoncurrentVersionTransitionFactory {

  def create(): NoncurrentVersionTransition = new NoncurrentVersionTransition()

}

class RichNonCurrentVersionTransition(val underlying: NoncurrentVersionTransition)
    extends AnyVal with PimpedType[NoncurrentVersionTransition] {

  def days: Int = underlying.getDays

  def days_=(value: Int): Unit =
    underlying.setDays(value)

  // ---

  def storageClassAsStringOpt: Option[String] = Option(underlying.getStorageClassAsString)

  def storageClassOpt_=(value: Option[StorageClass]): Unit =
    underlying.setStorageClass(value.orNull)

  def withStorageClassOpt(value: Option[StorageClass]): NoncurrentVersionTransition =
    underlying.withStorageClass(value.orNull)

}

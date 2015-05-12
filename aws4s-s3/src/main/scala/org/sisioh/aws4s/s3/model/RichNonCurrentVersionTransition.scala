package org.sisioh.aws4s.s3.model

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

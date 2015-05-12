package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.{ Bucket, Owner }
import org.sisioh.aws4s.PimpedType

object RichBucketFactory {

  def create(): Bucket = new Bucket()

  def create(name: String): Bucket = new Bucket(name)

}

class RichBucket(val underlying: Bucket) extends AnyVal with PimpedType[Bucket] {

  def ownerOpt: Option[Owner] = Option(underlying.getOwner)

  def ownerOpt_=(value: Option[Owner]): Unit =
    underlying.setOwner(value.orNull)

  // ---

  def creationDateOpt: Option[Date] = Option(underlying.getCreationDate)

  def creationDateOpt_=(value: Option[Date]): Unit =
    underlying.setCreationDate(value.orNull)

  // ---

  def nameOpt: Option[String] = Option(underlying.getName)

  def nameOpt_=(value: Option[String]): Unit =
    underlying.setName(value.orNull)

}

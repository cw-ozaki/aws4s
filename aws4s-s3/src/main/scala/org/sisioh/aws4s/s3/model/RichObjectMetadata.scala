package org.sisioh.aws4s.s3.model

import java.util.Date

import com.amazonaws.services.s3.model.ObjectMetadata
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object ObjectMetadataFactory {

  def create(): ObjectMetadata = new ObjectMetadata()


}

class RichObjectMetadata(val underlying: ObjectMetadata)
  extends AnyVal with PimpedType[ObjectMetadata] {

  def userMetadata: Map[String, String] = underlying.getUserMetadata.asScala.toMap

  def userMetadata_=(value: Map[String, String]): Unit =
    underlying.setUserMetadata(value.asJava)

  // ---

  def rawMetadata: Map[String, AnyRef] =  underlying.getRawMetadata.asScala.toMap

  // ---

  def httpExpiresDateOpt: Option[Date] = Option(underlying.getHttpExpiresDate)

  def httpExpiresDateOpt_=(value: Option[Date]): Unit =
    underlying.setHttpExpiresDate(value.orNull)

  // ---

  def expirationTimeOpt: Option[Date] = Option(underlying.getExpirationTime)

  def expirationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setExpirationTime(value.orNull)

  // ---

  def expirationTimeRuleIdOpt: Option[String] = Option(underlying.getExpirationTimeRuleId)

  def expirationTimeRuleIdOpt_=(value: Option[String]): Unit =
    underlying.setExpirationTimeRuleId(value.orNull)

  // ---

  def ongoingRestoreOpt: Option[Boolean] = Option(underlying.getOngoingRestore)

  def ongoingRestoreOpt_=(value: Option[Boolean]): Unit =
    underlying.setOngoingRestore(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def restoreExpirationTimeOpt: Option[Date] = Option(underlying.getRestoreExpirationTime)

  def restoreExpirationTimeOpt_=(value: Option[Date]): Unit =
    underlying.setRestoreExpirationTime(value.orNull)

}

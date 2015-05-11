package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.DeleteApplicationVersionRequest
import org.sisioh.aws4s.PimpedType

object DeleteApplicationVersionRequestFactory {

  def create(): DeleteApplicationVersionRequest = new DeleteApplicationVersionRequest()

}

class RichDeleteApplicationVersionRequest(val underlying: DeleteApplicationVersionRequest)
  extends AnyVal with PimpedType[DeleteApplicationVersionRequest] {

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): DeleteApplicationVersionRequest =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): DeleteApplicationVersionRequest =
    underlying.withVersionLabel(value.orNull)

  // ---

  def deleteSourceBundleOpt: Option[Boolean] = Option(underlying.getDeleteSourceBundle)

  def deleteSourceBundleOpt_=(value: Option[Boolean]): Unit =
    underlying.setDeleteSourceBundle(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withDeleteSourceBundleOpt(value: Option[Boolean]): DeleteApplicationVersionRequest =
    underlying.withDeleteSourceBundle(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

}

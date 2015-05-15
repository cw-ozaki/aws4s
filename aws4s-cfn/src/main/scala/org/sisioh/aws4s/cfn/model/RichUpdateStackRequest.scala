package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.{ Parameter, UpdateStackRequest }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object UpdateStackRequestFactory {

  def create(): UpdateStackRequest = new UpdateStackRequest()

}

class RichUpdateStackRequest(val underlying: UpdateStackRequest)
    extends AnyVal with PimpedType[UpdateStackRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): UpdateStackRequest =
    underlying.withStackName(value.orNull)

  // ---

  def templateBodyOpt: Option[String] = Option(underlying.getTemplateBody)

  def templateBodyOpt_=(value: Option[String]): Unit =
    underlying.setTemplateBody(value.orNull)

  def withTemplateBodyOpt(value: Option[String]): UpdateStackRequest =
    underlying.withTemplateBody(value.orNull)

  // ---

  def templateURLOpt: Option[String] = Option(underlying.getTemplateURL)

  def templateURLOpt_=(value: Option[String]): Unit =
    underlying.setTemplateURL(value.orNull)

  def withTemplateURLOpt(value: Option[String]): UpdateStackRequest =
    underlying.withTemplateURL(value.orNull)

  // ---

  def usePreviousTemplateOpt: Option[Boolean] = Option(underlying.getUsePreviousTemplate)

  def usePreviousTemplateOpt_=(value: Option[Boolean]): Unit =
    underlying.setUsePreviousTemplate(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  def withUsePreviousTemplateOpt_=(value: Option[Boolean]): UpdateStackRequest =
    underlying.withUsePreviousTemplate(value.map(_.asInstanceOf[java.lang.Boolean]).orNull)

  // ---

  def stackPolicyDuringUpdateBodyOpt: Option[String] = Option(underlying.getStackPolicyDuringUpdateBody)

  def stackPolicyDuringUpdateBodyOpt_=(value: Option[String]): Unit =
    underlying.setStackPolicyDuringUpdateBody(value.orNull)

  def withStackPolicyDuringUpdateBodyOpt(value: Option[String]): UpdateStackRequest =
    underlying.withStackPolicyDuringUpdateBody(value.orNull)

  // ---

  def stackPolicyDuringUpdateURLOpt: Option[String] = Option(underlying.getStackPolicyDuringUpdateURL)

  def stackPolicyDuringUpdateURLOpt_=(value: Option[String]): Unit =
    underlying.setStackPolicyDuringUpdateURL(value.orNull)

  def withStackPolicyDuringUpdateURLOpt_=(value: Option[String]): UpdateStackRequest =
    underlying.withStackPolicyDuringUpdateURL(value.orNull)

  // ---

  def parameters: Seq[Parameter] = underlying.getParameters.asScala.toVector

  def parameters_=(value: Seq[Parameter]): Unit =
    underlying.setParameters(value.asJava)

  def withParameters(value: Seq[Parameter]): UpdateStackRequest =
    underlying.withParameters(value.asJava)

  // ---

  def capabilities: Seq[String] = underlying.getCapabilities.asScala.toVector

  def capabilities_=(value: Seq[String]): Unit =
    underlying.setCapabilities(value.asJava)

  def withCapabilities(value: Seq[String]): UpdateStackRequest =
    underlying.withCapabilities(value.asJava)

  // ---

  def stackPolicyBodyOpt: Option[String] = Option(underlying.getStackPolicyBody)

  def stackPolicyBodyOpt_=(value: Option[String]): Unit =
    underlying.setStackPolicyBody(value.orNull)

  def withStackPolicyBodyOpt(value: Option[String]): UpdateStackRequest =
    underlying.withStackPolicyBody(value.orNull)

  // ---

  def stackPolicyURLOpt: Option[String] = Option(underlying.getStackPolicyURL)

  def stackPolicyURLOpt_=(value: Option[String]): Unit =
    underlying.setStackPolicyURL(value.orNull)

  def withStackPolicyURLOpt(value: Option[String]): UpdateStackRequest =
    underlying.withStackPolicyURL(value.orNull)

  // ---

  def notificationARNs: Seq[String] = underlying.getNotificationARNs.asScala.toVector

  def notificationARNs_=(value: Seq[String]): Unit =
    underlying.setNotificationARNs(value.asJava)

  def withNotificationARNs(value: Seq[String]): UpdateStackRequest =
    underlying.withNotificationARNs(value.asJava)

}

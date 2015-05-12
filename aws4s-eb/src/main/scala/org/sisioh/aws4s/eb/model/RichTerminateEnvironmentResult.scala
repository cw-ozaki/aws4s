package org.sisioh.aws4s.eb.model

import java.util.Date

import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.PimpedType

object TerminateEnvironmentResultFactory {

  def create(): TerminateEnvironmentResult = new TerminateEnvironmentResult()

}

class RichTerminateEnvironmentResult(val underlying: TerminateEnvironmentResult)
    extends AnyVal with PimpedType[TerminateEnvironmentResult] {

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def environmentIdOpt: Option[String] = Option(underlying.getEnvironmentId)

  def environmentIdOpt_=(value: Option[String]): Unit = underlying.setEnvironmentId(value.orNull)

  def withEnvironmentIdOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withEnvironmentId(value.orNull)

  // ---

  def applicationNameOpt: Option[String] = Option(underlying.getApplicationName)

  def applicationNameOpt_=(value: Option[String]): Unit =
    underlying.setApplicationName(value.orNull)

  def withApplicationNameOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withApplicationName(value.orNull)

  // ---

  def versionLabelOpt: Option[String] = Option(underlying.getVersionLabel)

  def versionLabelOpt_=(value: Option[String]): Unit =
    underlying.setVersionLabel(value.orNull)

  def withVersionLabelOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withVersionLabel(value.orNull)

  // ---

  def solutionStackNameOpt: Option[String] = Option(underlying.getSolutionStackName)

  def solutionStackNameOpt_=(value: Option[String]): Unit =
    underlying.setSolutionStackName(value.orNull)

  def withSolutionStackNameOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withSolutionStackName(value.orNull)

  // ---

  def templateNameOpt: Option[String] = Option(underlying.getTemplateName)

  def templateNameOpt_=(value: Option[String]): Unit =
    underlying.setTemplateName(value.orNull)

  def withTemplateNameOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withTemplateName(value.orNull)

  // ---

  def descriptionOpt: Option[String] = Option(underlying.getDescription)

  def descriptionOpt_=(value: Option[String]): Unit =
    underlying.setDescription(value.orNull)

  def withDescriptionOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withDescription(value.orNull)

  // ---

  def endpointURLOpt: Option[String] = Option(underlying.getEndpointURL)

  def endpointURLOpt_=(value: Option[String]): Unit =
    underlying.setEndpointURL(value.orNull)

  def withEndpointURLOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withEndpointURL(value.orNull)

  // ---

  def cNAMEOpt: Option[String] = Option(underlying.getCNAME)

  def cNAMEOpt_=(value: Option[String]): Unit =
    underlying.setCNAME(value.orNull)

  def withCNAMEOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withCNAME(value.orNull)

  // ---

  def dateCreatedOpt: Option[Date] = Option(underlying.getDateCreated)

  def dateCreatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateCreated(value.orNull)

  def withDateCreateOpt(value: Option[Date]): TerminateEnvironmentResult =
    underlying.withDateCreated(value.orNull)

  // ---

  def dateUpdatedOpt: Option[Date] = Option(underlying.getDateUpdated)

  def dateUpdatedOpt_=(value: Option[Date]): Unit =
    underlying.setDateUpdated(value.orNull)

  def withDateUpdatedOpt(value: Option[Date]): TerminateEnvironmentResult =
    underlying.withDateUpdated(value.orNull)

  // ---

  def statusOpt: Option[String] = Option(underlying.getStatus)

  def statusOpt_=(value: Option[String]): Unit =
    underlying.setStatus(value.orNull)

  def withStatusOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withStatus(value.orNull)

  // ---

  def healthOpt: Option[String] = Option(underlying.getHealth)

  def healthOpt_=(value: Option[String]): Unit =
    underlying.setHealth(value.orNull)

  def withHealthOpt(value: Option[String]): TerminateEnvironmentResult =
    underlying.withHealth(value.orNull)

  // ---

  def resourcesOpt: Option[EnvironmentResourcesDescription] = Option(underlying.getResources)

  def resourcesOpt_=(value: Option[EnvironmentResourcesDescription]): Unit =
    underlying.setResources(value.orNull)

  def withResourcesOpt(value: Option[EnvironmentResourcesDescription]): TerminateEnvironmentResult =
    underlying.withResources(value.orNull)

  // ---

  def tierOpt: Option[EnvironmentTier] = Option(underlying.getTier)

  def tierOpt_=(value: Option[EnvironmentTier]): Unit =
    underlying.setTier(value.orNull)

  def withTierOpt(value: Option[EnvironmentTier]): TerminateEnvironmentResult =
    underlying.withTier(value.orNull)

}

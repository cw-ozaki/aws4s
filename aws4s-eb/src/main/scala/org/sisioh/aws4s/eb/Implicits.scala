package org.sisioh.aws4s.eb

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClient
import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.eb.model._

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAWSElasticBeanstalkClient(underlying: AWSElasticBeanstalkClient): RichAWSElasticBeanstalkClient =
    new RichAWSElasticBeanstalkClient(underlying)

}

trait ModelImplicits {

  implicit def richApplicationDescription(underlying: ApplicationDescription): RichApplicationDescription =
    new RichApplicationDescription(underlying)

  implicit def richApplicationVersionDescription(underlying: ApplicationVersionDescription): RichApplicationVersionDescription =
    new RichApplicationVersionDescription(underlying)

  // ---

  implicit def richCheckDNSAvailabilityRequest(underlying: CheckDNSAvailabilityRequest): RichCheckDNSAvailabilityRequest =
    new RichCheckDNSAvailabilityRequest(underlying)

  implicit def richCheckDNSAvailabilityResult(underlying: CheckDNSAvailabilityResult): RichCheckDNSAvailabilityResult =
    new RichCheckDNSAvailabilityResult(underlying)

  // ---

  implicit def richConfigurationOptionDescription(underlying: ConfigurationOptionDescription): RichConfigurationOptionDescription =
    new RichConfigurationOptionDescription(underlying)

  // ---

  implicit def richConfigurationOptionSetting(underlying: ConfigurationOptionSetting): RichConfigurationOptionSetting =
    new RichConfigurationOptionSetting(underlying)

  // ---

  implicit def richConfigurationSettingsDescription(underlying: ConfigurationSettingsDescription): RichConfigurationSettingsDescription =
    new RichConfigurationSettingsDescription(underlying)

  // ---

  implicit def RichCreateApplicationRequest(underlying: CreateApplicationRequest): RichCreateApplicationRequest =
    new RichCreateApplicationRequest(underlying)

  implicit def RichCreateApplicationResult(underlying: CreateApplicationResult): RichCreateApplicationResult =
    new RichCreateApplicationResult(underlying)

  // ---

  implicit def richCreateApplicationVersionRequest(underlying: CreateApplicationVersionRequest): RichCreateApplicationVersionRequest =
    new RichCreateApplicationVersionRequest(underlying)

  implicit def richCreateApplicationVersionResult(underlying: CreateApplicationVersionResult): RichCreateApplicationVersionResult =
    new RichCreateApplicationVersionResult(underlying)

  // ---

  implicit def richCreateConfigurationTemplateRequest(underlying: CreateConfigurationTemplateRequest): RichCreateConfigurationTemplateRequest =
    new RichCreateConfigurationTemplateRequest(underlying)

  implicit def richCreateConfigurationTemplateResult(underlying: CreateConfigurationTemplateResult): RichCreateConfigurationTemplateResult =
    new RichCreateConfigurationTemplateResult(underlying)

  // ---

  implicit def richCreateEnvironmentRequest(underlying: CreateEnvironmentRequest): RichCreateEnvironmentRequest =
    new RichCreateEnvironmentRequest(underlying)

  implicit def richCreateEnvironmentResult(underlying: CreateEnvironmentResult): RichCreateEnvironmentResult =
    new RichCreateEnvironmentResult(underlying)

  // ---

  implicit def richDeleteApplicationRequest(underlying: DeleteApplicationRequest): RichDeleteApplicationRequest =
    new RichDeleteApplicationRequest(underlying)

  // ---

  implicit def richDeleteApplicationVersionRequest(underlying: DeleteApplicationVersionRequest): RichDeleteApplicationVersionRequest =
    new RichDeleteApplicationVersionRequest(underlying)

  // ---

  implicit def richDeleteConfigurationTemplateRequest(underlying: DeleteConfigurationTemplateRequest): RichDeleteConfigurationTemplateRequest =
    new RichDeleteConfigurationTemplateRequest(underlying)

  // ---

  implicit def richDeleteEnvironmentConfigurationRequest(underlying: DeleteEnvironmentConfigurationRequest): RichDeleteEnvironmentConfigurationRequest =
    new RichDeleteEnvironmentConfigurationRequest(underlying)

  // ---

  implicit def richDescribeApplicationsRequest(underlying: DescribeApplicationsRequest): RichDescribeApplicationsRequest =
    new RichDescribeApplicationsRequest(underlying)

  implicit def richDescribeApplicationsResult(underlying: DescribeApplicationsResult): RichDescribeApplicationsResult =
    new RichDescribeApplicationsResult(underlying)

  // ---

  implicit def richDescribeApplicationVersionsRequest(underlying: DescribeApplicationVersionsRequest): RichDescribeApplicationVersionsRequest =
    new RichDescribeApplicationVersionsRequest(underlying)

  implicit def richDescribeApplicationVersionsResult(underlying: DescribeApplicationVersionsResult): RichDescribeApplicationVersionsResult =
    new RichDescribeApplicationVersionsResult(underlying)

  // ---

  implicit def richDescribeEnvironmentResourcesRequest(underlying: DescribeEnvironmentResourcesRequest): RichDescribeEnvironmentResourcesRequest =
    new RichDescribeEnvironmentResourcesRequest(underlying)

  implicit def richDescribeEnvironmentResourcesResult(underlying: DescribeEnvironmentResourcesResult): RichDescribeEnvironmentResourcesResult =
    new RichDescribeEnvironmentResourcesResult(underlying)

  // ---

  implicit def richDescribeEnvironmentsRequest(underlying: DescribeEnvironmentsRequest): RichDescribeEnvironmentsRequest =
    new RichDescribeEnvironmentsRequest(underlying)

  implicit def richDescribeEnvironmentsResult(underlying: DescribeEnvironmentsResult): RichDescribeEnvironmentsResult =
    new RichDescribeEnvironmentsResult(underlying)

  // ---

  implicit def richDescribeEventsRequest(underlying: DescribeEventsRequest): RichDescribeEventsRequest =
    new RichDescribeEventsRequest(underlying)

  implicit def richDescribeEventsResult(underlying: DescribeEventsResult): RichDescribeEventsResult =
    new RichDescribeEventsResult(underlying)

  // ---

  implicit def richEnvironmentDescription(underlying: EnvironmentDescription): RichEnvironmentDescription =
    new RichEnvironmentDescription(underlying)

  // ---

  implicit def richEnvironmentInfoDescription(underlying: EnvironmentInfoDescription): RichEnvironmentInfoDescription =
    new RichEnvironmentInfoDescription(underlying)

  // ---

  implicit def richEnvironmentResourceDescription(underlying: EnvironmentResourceDescription): RichEnvironmentResourceDescription =
    new RichEnvironmentResourceDescription(underlying)

  // ---

  implicit def richEnvironmentResourcesDescription(underlying: EnvironmentResourcesDescription): RichEnvironmentResourcesDescription =
    new RichEnvironmentResourcesDescription(underlying)

  // ---

  implicit def RichEnvironmentTier(underlying: EnvironmentTier): RichEnvironmentTier =
    new RichEnvironmentTier(underlying)

  // ---

  implicit def richEventDescription(underlying: EventDescription): RichEventDescription =
    new RichEventDescription(underlying)

  // ---

  implicit def richInstance(underlying: Instance): RichInstance =
    new RichInstance(underlying)

  // ---

  implicit def richLaunchConfiguration(underlying: LaunchConfiguration): RichLaunchConfiguration =
    new RichLaunchConfiguration(underlying)

  // ---

  implicit def richLoadBalancer(underlying: LoadBalancer): RichLoadBalancer =
    new RichLoadBalancer(underlying)

  // ---

  implicit def richLoadBalancerDescription(underlying: LoadBalancerDescription): RichLoadBalancerDescription =
    new RichLoadBalancerDescription(underlying)

  // ---

  implicit def richOptionRestrictionRegex(underlying: OptionRestrictionRegex): RichOptionRestrictionRegex =
    new RichOptionRestrictionRegex(underlying)

  // ---

  implicit def richOptionSpecification(underlying: OptionSpecification): RichOptionSpecification =
    new RichOptionSpecification(underlying)

  // ---

  implicit def richQueue(underlying: Queue): RichQueue =
    new RichQueue(underlying)

  // ---

  implicit def richRebuildEnvironmentRequest(underlying: RebuildEnvironmentRequest): RichRebuildEnvironmentRequest =
    new RichRebuildEnvironmentRequest(underlying)

  // ---

  implicit def richRequestEnvironmentInfoRequest(underlying: RequestEnvironmentInfoRequest): RichRequestEnvironmentInfoRequest =
    new RichRequestEnvironmentInfoRequest(underlying)

  // ---

  implicit def richRestartAppServerRequest(underlying: RestartAppServerRequest): RichRestartAppServerRequest =
    new RichRestartAppServerRequest(underlying)

  // ---

  implicit def richRetrieveEnvironmentInfoRequest(underlying: RetrieveEnvironmentInfoRequest): RichRetrieveEnvironmentInfoRequest =
    new RichRetrieveEnvironmentInfoRequest(underlying)

  implicit def richRetrieveEnvironmentInfoResult(underlying: RetrieveEnvironmentInfoRequest): RichRetrieveEnvironmentInfoRequest =
    new RichRetrieveEnvironmentInfoRequest(underlying)

  // ---

  implicit def richS3Location(underlying: S3Location): RichS3Location =
    new RichS3Location(underlying)

  // ---

  implicit def richSolutionStackDescription(underlying: SolutionStackDescription): RichSolutionStackDescription =
    new RichSolutionStackDescription(underlying)

  // ---

  implicit def richSourceConfiguration(underlying: SourceConfiguration): RichSourceConfiguration =
    new RichSourceConfiguration(underlying)

  // ---

  implicit def richTerminateEnvironmentRequest(underlying: TerminateEnvironmentRequest): RichTerminateEnvironmentRequest =
    new RichTerminateEnvironmentRequest(underlying)

  implicit def richTerminateEnvironmentResult(underlying: TerminateEnvironmentResult): RichTerminateEnvironmentResult =
    new RichTerminateEnvironmentResult(underlying)

  // ---

  implicit def richTrigger(underlying: Trigger): RichTrigger =
    new RichTrigger(underlying)

  // ---

  implicit def richUpdateApplicationRequest(underlying: UpdateApplicationRequest): RichUpdateApplicationRequest =
    new RichUpdateApplicationRequest(underlying)

  implicit def richUpdateApplicationResult(underlying: UpdateApplicationResult): RichUpdateApplicationResult =
    new RichUpdateApplicationResult(underlying)

  // ---

  implicit def richUpdateApplicationVersionRequest(underlying: UpdateApplicationVersionRequest): RichUpdateApplicationVersionRequest =
    new RichUpdateApplicationVersionRequest(underlying)

  implicit def richUpdateApplicationVersionResult(underlying: UpdateApplicationVersionResult): RichUpdateApplicationVersionResult =
    new RichUpdateApplicationVersionResult(underlying)

  // ---

  implicit def richUpdateConfigurationTemplateRequest(underlying: UpdateConfigurationTemplateRequest): RichUpdateConfigurationTemplateRequest =
    new RichUpdateConfigurationTemplateRequest(underlying)

  implicit def richUpdateConfigurationTemplateResult(underlying: UpdateConfigurationTemplateResult): RichUpdateConfigurationTemplateResult =
    new RichUpdateConfigurationTemplateResult(underlying)

  // ---

  implicit def richUpdateEnvironmentRequest(underlying: UpdateEnvironmentRequest): RichUpdateEnvironmentRequest =
    new RichUpdateEnvironmentRequest(underlying)

  implicit def richUpdateEnvironmentResult(underlying: UpdateEnvironmentResult): RichUpdateEnvironmentResult =
    new RichUpdateEnvironmentResult(underlying)

  // ---

  implicit def richValidateConfigurationSettingsRequest(underlying: ValidateConfigurationSettingsRequest): RichValidateConfigurationSettingsRequest =
    new RichValidateConfigurationSettingsRequest(underlying)

  implicit def richValidateConfigurationSettingsResult(underlying: ValidateConfigurationSettingsResult): RichValidateConfigurationSettingsResult =
    new RichValidateConfigurationSettingsResult(underlying)

  // ---

  implicit def richValidationMessage(underlying: ValidationMessage): RichValidationMessage =
    new RichValidationMessage(underlying)
}


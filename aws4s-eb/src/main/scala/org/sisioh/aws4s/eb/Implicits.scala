package org.sisioh.aws4s.eb

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClient
import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.eb.model._

object Implicits extends Implicits

trait Implicits extends AWSElasticBeanstalkImplicits with ModelImplicits

trait AWSElasticBeanstalkImplicits {

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

}



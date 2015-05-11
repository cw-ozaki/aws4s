package org.sisioh.aws4s.eb

import com.amazonaws.auth.{AWSCredentialsProvider, AWSCredentials}
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClient
import com.amazonaws.services.elasticbeanstalk.model._
import com.amazonaws.{ClientConfiguration, AmazonWebServiceRequest, ResponseMetadata}
import org.sisioh.aws4s.PimpedType

import scala.util.Try

object AWSElasticBeanstalkClientFactory {

  def create(): AWSElasticBeanstalkClient = new AWSElasticBeanstalkClient()

  def create(clientConfiguration: ClientConfiguration): AWSElasticBeanstalkClient = new AWSElasticBeanstalkClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials) : AWSElasticBeanstalkClient = new AWSElasticBeanstalkClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AWSElasticBeanstalkClient = new AWSElasticBeanstalkClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AWSElasticBeanstalkClient = new AWSElasticBeanstalkClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AWSElasticBeanstalkClient =
    new AWSElasticBeanstalkClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AWSElasticBeanstalkClient =
    new AWSElasticBeanstalkClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAWSElasticBeanstalkClient(val underlying: AWSElasticBeanstalkClient)
  extends AnyVal with PimpedType[AWSElasticBeanstalkClient] {

  def checkDNSAvailabilityAsTry(request: CheckDNSAvailabilityRequest): Try[CheckDNSAvailabilityResult] = Try {
    underlying.checkDNSAvailability(request)
  }

  def describeConfigurationOptionsAsTry(request: DescribeConfigurationOptionsRequest): Try[DescribeConfigurationOptionsResult] = Try {
    underlying.describeConfigurationOptions(request)
  }

  def deleteConfigurationTemplateAsTry(request: DeleteConfigurationTemplateRequest): Try[Unit] = Try {
    underlying.deleteConfigurationTemplate(request)
  }

  def createEnvironmentAsTry(request: CreateEnvironmentRequest): Try[CreateEnvironmentResult] = Try {
    underlying.createEnvironment(request)
  }

  def createStorageLocationAsTry(request: CreateStorageLocationRequest): Try[CreateStorageLocationResult] = Try {
    underlying.createStorageLocation(request)
  }

  def requestEnvironmentInfoAsTry(request: RequestEnvironmentInfoRequest): Try[Unit] = Try {
    underlying.requestEnvironmentInfo(request)
  }

  def createApplicationVersionAsTry(request: CreateApplicationVersionRequest): Try[CreateApplicationVersionResult] = Try {
    underlying.createApplicationVersion(request)
  }

  def deleteApplicationVersionAsTry(request: DeleteApplicationVersionRequest): Try[Unit] = Try {
    underlying.deleteApplicationVersion(request)
  }

  def describeApplicationVersionsAsTry(request: DescribeApplicationVersionsRequest): Try[DescribeApplicationVersionsResult] = Try {
    underlying.describeApplicationVersions(request)
  }

  def deleteApplicationAsTry(request: DeleteApplicationRequest): Try[Unit] = Try {
    underlying.deleteApplication(request)
  }

  def updateApplicationVersionAsTry(request: UpdateApplicationVersionRequest): Try[UpdateApplicationVersionResult] = Try {
    underlying.updateApplicationVersion(request)
  }

  def createApplicationAsTry(request: CreateApplicationRequest): Try[CreateApplicationResult] = Try {
    underlying.createApplication(request)
  }

  def swapEnvironmentCNAMEsAsTry(request: SwapEnvironmentCNAMEsRequest): Try[Unit] = Try {
    underlying.swapEnvironmentCNAMEs(request)
  }

  def updateConfigurationTemplateAsTry(request: UpdateConfigurationTemplateRequest): Try[UpdateConfigurationTemplateResult] = Try {
    underlying.updateConfigurationTemplate(request)
  }

  def retrieveEnvironmentInfoAsTry(request: RetrieveEnvironmentInfoRequest): Try[RetrieveEnvironmentInfoResult] = Try {
    underlying.retrieveEnvironmentInfo(request)
  }

  def listAvailableSolutionStacksAsTry(request: ListAvailableSolutionStacksRequest): Try[ListAvailableSolutionStacksResult] = Try {
    underlying.listAvailableSolutionStacks(request)
  }

  def updateApplicationAsTry(request: UpdateApplicationRequest): Try[UpdateApplicationResult] = Try {
    underlying.updateApplication(request)
  }

  def describeEnvironmentsAsTry(request: DescribeEnvironmentsRequest): Try[DescribeEnvironmentsResult] = Try {
    underlying.describeEnvironments(request)
  }

  def describeEnvironmentResourcesAsTry(request: DescribeEnvironmentResourcesRequest): Try[DescribeEnvironmentResourcesResult] = Try {
    underlying.describeEnvironmentResources(request)
  }

  def terminateEnvironmentAsTry(request: TerminateEnvironmentRequest): Try[TerminateEnvironmentResult] = Try {
    underlying.terminateEnvironment(request)
  }

  def validateConfigurationSettingsAsTry(request: ValidateConfigurationSettingsRequest): Try[ValidateConfigurationSettingsResult] = Try {
    underlying.validateConfigurationSettings(request)
  }

  def restartAppServerAsTry(request: RestartAppServerRequest): Try[Unit] = Try {
    underlying.restartAppServer(request)
  }

  def deleteEnvironmentConfigurationAsTry(request: DeleteEnvironmentConfigurationRequest): Try[Unit] = Try {
    underlying.deleteEnvironmentConfiguration(request)
  }

  def updateEnvironmentAsTry(request: UpdateEnvironmentRequest): Try[UpdateEnvironmentResult] = Try {
    underlying.updateEnvironment(request)
  }

  def createConfigurationTemplateAsTry(request: CreateConfigurationTemplateRequest): Try[CreateConfigurationTemplateResult] = Try {
    underlying.createConfigurationTemplate(request)
  }

  def describeConfigurationSettingsAsTry(request: DescribeConfigurationSettingsRequest): Try[DescribeConfigurationSettingsResult] = Try {
    underlying.describeConfigurationSettings(request)
  }

  def describeApplicationsAsTry(request: DescribeApplicationsRequest): Try[DescribeApplicationsResult] = Try {
    underlying.describeApplications(request)
  }

  def rebuildEnvironmentAsTry(request: RebuildEnvironmentRequest): Try[Unit] = Try {
    underlying.rebuildEnvironment(request)
  }

  def describeEventsAsTry(request:DescribeEventsRequest): Try[DescribeEventsResult] = Try {
    underlying.describeEvents(request)
  }

  def createStorageLocationAsTry(): Try[CreateStorageLocationResult] = Try {
    underlying.createStorageLocation()
  }

  def describeApplicationVersionsAsTry(): Try[DescribeApplicationVersionsResult] = Try {
    underlying.describeApplicationVersions()
  }

  def swapEnvironmentCNAMEsAsTry(): Try[Unit] = Try {
    underlying.swapEnvironmentCNAMEs()
  }

  def listAvailableSolutionStacksAsTry(): Try[ListAvailableSolutionStacksResult] = Try {
    underlying.listAvailableSolutionStacks()
  }

  def describeEnvironmentsAsTry(): Try[DescribeEnvironmentsResult] = Try {
    underlying.describeEnvironments()
  }

  def describeApplicationsAsTry(): Try[DescribeApplicationsResult] = Try {
    underlying.describeApplications()
  }

  def describeEventsAsTry(): Try[DescribeEventsResult] = Try {
    underlying.describeEvents()
  }

  def getCachedResponseMetadataAsOption(request: AmazonWebServiceRequest): Option[ResponseMetadata] = Option(
    underlying.getCachedResponseMetadata(request)
  )

}

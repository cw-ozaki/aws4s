package org.sisioh.aws4s.cfn

import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider }
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.cloudformation.AmazonCloudFormationClient
import com.amazonaws.services.cloudformation.model._
import com.amazonaws.{ AmazonWebServiceRequest, ClientConfiguration, ResponseMetadata }
import org.sisioh.aws4s.PimpedType

import scala.util.Try

object AmazonCfnClientFactory {

  def create(): AmazonCloudFormationClient = new AmazonCloudFormationClient()

  def create(clientConfiguration: ClientConfiguration): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AmazonCloudFormationClient =
    new AmazonCloudFormationClient(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonCloudFormationClient(val underlying: AmazonCloudFormationClient)
    extends AnyVal with PimpedType[AmazonCloudFormationClient] {

  def templateSummaryAsTry(): Try[GetTemplateSummaryResult] = Try {
    underlying.getTemplateSummary
  }

  def templateSummaryAsTry(getTemplateSummaryRequest: GetTemplateSummaryRequest) = Try {
    underlying.getTemplateSummary(getTemplateSummaryRequest)
  }

  def describeStackResourcesAsTry(describeStackResourcesRequest: DescribeStackResourcesRequest): Try[DescribeStackResourcesResult] = Try {
    underlying.describeStackResources(describeStackResourcesRequest)
  }

  def describeStacksAsTry(describeStacksRequest: DescribeStacksRequest): Try[DescribeStacksResult] = Try {
    underlying.describeStacks(describeStacksRequest)
  }

  def describeStacksAsTry(): Try[DescribeStacksResult] = Try {
    underlying.describeStacks()
  }

  def describeStackEventsAsTry(describeStackEventsRequest: DescribeStackEventsRequest): Try[DescribeStackEventsResult] = Try {
    underlying.describeStackEvents(describeStackEventsRequest)
  }

  def estimateTemplateCostAsTry(estimateTemplateCostRequest: EstimateTemplateCostRequest): Try[EstimateTemplateCostResult] = Try {
    underlying.estimateTemplateCost(estimateTemplateCostRequest)
  }

  def estimateTemplateCostAsTry(): Try[EstimateTemplateCostResult] = Try {
    underlying.estimateTemplateCost()
  }

  def getStackPolicyAsTry(getStackPolicyRequest: GetStackPolicyRequest): Try[GetStackPolicyResult] = Try {
    underlying.getStackPolicy(getStackPolicyRequest)
  }

  def listStackResourcesAsTry(listStackResourcesRequest: ListStackResourcesRequest): Try[ListStackResourcesResult] = Try {
    underlying.listStackResources(listStackResourcesRequest)
  }

  def signalResourceAsTry(signalResourceRequest: SignalResourceRequest): Try[Unit] = Try {
    underlying.signalResource(signalResourceRequest)
  }

  def getTemplateAsTry(getTemplateRequest: GetTemplateRequest): Try[GetTemplateResult] = Try {
    underlying.getTemplate(getTemplateRequest)
  }

  def deleteStackAsTry(deleteStackRequest: DeleteStackRequest): Try[Unit] = Try {
    underlying.deleteStack(deleteStackRequest)
  }

  def getCachedResponseMetadataAsTry(amazonWebServiceRequest: AmazonWebServiceRequest): Try[ResponseMetadata] = Try {
    underlying.getCachedResponseMetadata(amazonWebServiceRequest)
  }

  def validateTemplateAsTry(validateTemplateRequest: ValidateTemplateRequest): Try[ValidateTemplateResult] = Try {
    underlying.validateTemplate(validateTemplateRequest)
  }

  def createStackAsTry(createStackRequest: CreateStackRequest): Try[CreateStackResult] = Try {
    underlying.createStack(createStackRequest)
  }

  def listStacksAsTry(listStacksRequest: ListStacksRequest): Try[ListStacksResult] = Try {
    underlying.listStacks(listStacksRequest)
  }

  def listStacksAsTry(): Try[ListStacksResult] = Try {
    underlying.listStacks()
  }

  def cancelUpdateStackAsTry(cancelUpdateStackRequest: CancelUpdateStackRequest): Try[Unit] = Try {
    underlying.cancelUpdateStack(cancelUpdateStackRequest)
  }

  def updateStackAsTry(updateStackRequest: UpdateStackRequest): Try[UpdateStackResult] = Try {
    underlying.updateStack(updateStackRequest)
  }

  def setStackPolicyAsTry(setStackPolicyRequest: SetStackPolicyRequest): Try[Unit] = Try {
    underlying.setStackPolicy(setStackPolicyRequest)
  }

  def describeStackResourceAsTry(describeStackResourceRequest: DescribeStackResourceRequest): Try[DescribeStackResourceResult] = Try {
    underlying.describeStackResource(describeStackResourceRequest)
  }

}
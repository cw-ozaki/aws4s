package org.sisioh.aws4s.cfn

import com.amazonaws.services.cloudformation.AmazonCloudFormationClient
import com.amazonaws.services.cloudformation.model._
import org.sisioh.aws4s.cfn.model._

object Implicits extends Implicits

trait Implicits extends ModelImplicits {

  implicit def richAmazonCloudFormationClient(underlying: AmazonCloudFormationClient): RichAmazonCloudFormationClient =
    new RichAmazonCloudFormationClient(underlying)

}

trait ModelImplicits {

  implicit def richCancelUpdateStackRequest(underlying: CancelUpdateStackRequest): RichCancelUpdateStackRequest = new RichCancelUpdateStackRequest(underlying)

  implicit def richCreateStackRequest(underlying: CreateStackRequest): RichCreateStackRequest = new RichCreateStackRequest(underlying)

  implicit def richCreateStackResult(underlying: CreateStackResult): RichCreateStackResult = new RichCreateStackResult(underlying)

  implicit def richDeleteStackRequest(underlying: DeleteStackRequest): RichDeleteStackRequest = new RichDeleteStackRequest(underlying)

  implicit def richDescribeStackEventsRequest(underlying: DescribeStackEventsRequest): RichDescribeStackEventsRequest = new RichDescribeStackEventsRequest(underlying)

  implicit def richDescribeStackEventsResult(underlying: DescribeStackEventsResult): RichDescribeStackEventsResult = new RichDescribeStackEventsResult(underlying)

  implicit def richDescribeStackResourceRequest(underlying: DescribeStackResourceRequest): RichDescribeStackResourceRequest = new RichDescribeStackResourceRequest(underlying)

  implicit def richDescribeStackResourceResult(underlying: DescribeStackResourceResult): RichDescribeStackResourceResult = new RichDescribeStackResourceResult(underlying)

  implicit def richDescribeStackResourcesRequest(underlying: DescribeStackResourcesRequest): RichDescribeStackResourcesRequest = new RichDescribeStackResourcesRequest(underlying)

  implicit def richDescribeStackResourcesResult(underlying: DescribeStackResourcesResult): RichDescribeStackResourcesResult = new RichDescribeStackResourcesResult(underlying)

  implicit def richDescribeStacksRequest(underlying: DescribeStacksRequest): RichDescribeStacksRequest = new RichDescribeStacksRequest(underlying)

  implicit def richDescribeStacksResult(underlying: DescribeStacksResult): RichDescribeStacksResult = new RichDescribeStacksResult(underlying)

  implicit def richEstimateTemplateCostRequest(underlying: EstimateTemplateCostRequest): RichEstimateTemplateCostRequest = new RichEstimateTemplateCostRequest(underlying)

  implicit def richEstimateTemplateCostResult(underlying: EstimateTemplateCostResult): RichEstimateTemplateCostResult = new RichEstimateTemplateCostResult(underlying)

  implicit def richGetStackPolicyRequest(underlying: GetStackPolicyRequest): RichGetStackPolicyRequest = new RichGetStackPolicyRequest(underlying)

  implicit def richGetStackPolicyResult(underlying: GetStackPolicyResult): RichGetStackPolicyResult = new RichGetStackPolicyResult(underlying)

  implicit def richGetTemplateRequest(underlying: GetTemplateRequest): RichGetTemplateRequest = new RichGetTemplateRequest(underlying)

  implicit def richGetTemplateResult(underlying: GetTemplateResult): RichGetTemplateResult = new RichGetTemplateResult(underlying)

  implicit def richGetTemplateSummaryRequest(underlying: GetTemplateSummaryRequest): RichGetTemplateSummaryRequest = new RichGetTemplateSummaryRequest(underlying)

  implicit def richGetTemplateSummaryResult(underlying: GetTemplateSummaryResult): RichGetTemplateSummaryResult = new RichGetTemplateSummaryResult(underlying)

  implicit def richListStackResourcesRequest(underlying: ListStackResourcesRequest): RichListStackResourcesRequest = new RichListStackResourcesRequest(underlying)

  implicit def richListStackResourcesResult(underlying: ListStackResourcesResult): RichListStackResourcesResult = new RichListStackResourcesResult(underlying)

  implicit def richListStacksRequest(underlying: ListStacksRequest): RichListStacksRequest = new RichListStacksRequest(underlying)

  implicit def richListStacksResult(underlying: ListStacksResult): RichListStacksResult = new RichListStacksResult(underlying)

  implicit def richOutput(underlying: Output): RichOutput = new RichOutput(underlying)

  implicit def richParameter(underlying: Parameter): RichParameter = new RichParameter(underlying)

  implicit def richParameterDeclaration(underlying: ParameterDeclaration): RichParameterDeclaration = new RichParameterDeclaration(underlying)

  implicit def richSetStackPolicyRequest(underlying: SetStackPolicyRequest): RichSetStackPolicyRequest = new RichSetStackPolicyRequest(underlying)

  implicit def richSignalResourceRequest(underlying: SignalResourceRequest): RichSignalResourceRequest = new RichSignalResourceRequest(underlying)

  implicit def richStack(underlying: Stack): RichStack = new RichStack(underlying)

  implicit def richStackEvent(underlying: StackEvent): RichStackEvent = new RichStackEvent(underlying)

  implicit def richStackResource(underlying: StackResource): RichStackResource = new RichStackResource(underlying)

  implicit def richStackResourceDetail(underlying: StackResourceDetail): RichStackResourceDetail = new RichStackResourceDetail(underlying)

  implicit def richStackResourceSummary(underlying: StackResourceSummary): RichStackResourceSummary = new RichStackResourceSummary(underlying)

  implicit def richStackSummary(underlying: StackSummary): RichStackSummary = new RichStackSummary(underlying)

  implicit def richTag(underlying: Tag): RichTag = new RichTag(underlying)

  implicit def richTemplateParameter(underlying: TemplateParameter): RichTemplateParameter = new RichTemplateParameter(underlying)

  implicit def richUpdateStackRequest(underlying: UpdateStackRequest): RichUpdateStackRequest = new RichUpdateStackRequest(underlying)

  implicit def richUpdateStackResult(underlying: UpdateStackResult): RichUpdateStackResult = new RichUpdateStackResult(underlying)

  implicit def richValidateTemplateRequest(underlying: ValidateTemplateRequest): RichValidateTemplateRequest = new RichValidateTemplateRequest(underlying)

  implicit def richValidateTemplateResult(underlying: ValidateTemplateResult): RichValidateTemplateResult = new RichValidateTemplateResult(underlying)

}


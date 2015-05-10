package org.sisioh.aws4s.cfn

import com.amazonaws.services.cloudformation.AmazonCloudFormationClient
import com.amazonaws.services.cloudformation.model._
import org.sisioh.aws4s.cfn.model._

object Implicits extends Implicits

trait Implicits extends org.sisioh.aws4s.Implicits with RichAmazonCloudFormationClientImplicits

trait ModelImplicits {

  implicit def richCancelUpdateStackRequest(underlying: CancelUpdateStackRequest): RichCancelUpdateStackRequest =
    new RichCancelUpdateStackRequest(underlying)

  implicit def richCreateStackRequest(underlying: CreateStackRequest): RichCreateStackRequest =
    new RichCreateStackRequest(underlying)

  implicit def richCreateStackResult(underlying: CreateStackResult): RichCreateStackResult =
    new RichCreateStackResult(underlying)

  implicit def richDescribeStackEventsRequest(underlying: DescribeStackEventsRequest): RichDescribeStackEventsRequest =
    new RichDescribeStackEventsRequest(underlying)

  implicit def richDescribeStackEventsResult(underlying: DescribeStackEventsResult): RichDescribeStackEventsResult =
    new RichDescribeStackEventsResult(underlying)

  implicit def richDescribeStackResourceRequest(underlying: DescribeStackResourceRequest): RichDescribeStackResourceRequest =
    new RichDescribeStackResourceRequest(underlying)

  implicit def richDescribeStackResourceResult(underlying: DescribeStackResourceResult): RichDescribeStackResourceResult =
    new RichDescribeStackResourceResult(underlying)

  implicit def richDescribeStackResourcesRequest(underlying: DescribeStackResourcesRequest): RichDescribeStackResourcesRequest =
    new RichDescribeStackResourcesRequest(underlying)

  implicit def richDescribeStackResourcesResult(underlying: DescribeStackResourcesResult): RichDescribeStackResourcesResult =
    new RichDescribeStackResourcesResult(underlying)

  implicit def richDescribeStacksRequest(underlying: DescribeStacksRequest): RichDescribeStacksRequest =
    new RichDescribeStacksRequest(underlying)

  implicit def richDescribeStacksResult(underlying: DescribeStacksResult): RichDescribeStacksResult =
    new RichDescribeStacksResult(underlying)

  implicit def richEstimateTemplateCostRequest(underlying: EstimateTemplateCostRequest): RichEstimateTemplateCostRequest =
    new RichEstimateTemplateCostRequest(underlying)

  implicit def richEstimateTemplateCostResult(underlying: EstimateTemplateCostResult): RichEstimateTemplateCostResult =
    new RichEstimateTemplateCostResult(underlying)

  implicit def richGetStackPolicyRequest(underlying: GetStackPolicyRequest): RichGetStackPolicyRequest =
    new RichGetStackPolicyRequest(underlying)

  implicit def richGetStackPolicyResult(underlying: GetStackPolicyResult): RichGetStackPolicyResult =
    new RichGetStackPolicyResult(underlying)
}


trait RichAmazonCloudFormationClientImplicits {

  implicit def richAmazonCloudFormationClient(underlying: AmazonCloudFormationClient): RichAmazonCloudFormationClient =
    new RichAmazonCloudFormationClient(underlying)

}


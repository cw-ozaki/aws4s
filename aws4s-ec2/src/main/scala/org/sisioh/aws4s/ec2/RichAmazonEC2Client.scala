package org.sisioh.aws4s.ec2

import com.amazonaws.auth.{ AWSCredentials, AWSCredentialsProvider }
import com.amazonaws.metrics.RequestMetricCollector
import com.amazonaws.services.ec2.AmazonEC2Client
import com.amazonaws.services.ec2.model._
import com.amazonaws.{ AmazonWebServiceRequest, ClientConfiguration }
import org.sisioh.aws4s.PimpedType

import scala.util.Try

object AmazonEC2ClientFactory {

  def create(): AmazonEC2Client = new AmazonEC2Client()

  def create(clientConfiguration: ClientConfiguration): AmazonEC2Client = new AmazonEC2Client(clientConfiguration)

  def create(awsCredentials: AWSCredentials): AmazonEC2Client = new AmazonEC2Client(awsCredentials)

  def create(awsCredentials: AWSCredentials, clientConfiguration: ClientConfiguration): AmazonEC2Client =
    new AmazonEC2Client(awsCredentials, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider): AmazonEC2Client =
    new AmazonEC2Client(awsCredentialsProvider)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration): AmazonEC2Client =
    new AmazonEC2Client(awsCredentialsProvider, clientConfiguration)

  def create(awsCredentialsProvider: AWSCredentialsProvider, clientConfiguration: ClientConfiguration, requestMetricCollector: RequestMetricCollector): AmazonEC2Client =
    new AmazonEC2Client(awsCredentialsProvider, clientConfiguration, requestMetricCollector)

}

class RichAmazonEC2Client(val underlying: AmazonEC2Client)
    extends AnyVal with PimpedType[AmazonEC2Client] {

  def rebootInstancesAsTry(rebootInstancesRequest: RebootInstancesRequest): Try[Unit] = Try {
    underlying.rebootInstances(rebootInstancesRequest)
  }

  def describeReservedInstancesAsTry(describeReservedInstancesRequest: DescribeReservedInstancesRequest): Try[DescribeReservedInstancesResult] = Try {
    underlying.describeReservedInstances(describeReservedInstancesRequest)
  }

  def describeAvailabilityZonesAsTry(describeAvailabilityZonesRequest: DescribeAvailabilityZonesRequest): Try[DescribeAvailabilityZonesResult] = Try {
    underlying.describeAvailabilityZones(describeAvailabilityZonesRequest)
  }

  def restoreAddressToClassicAsTry(restoreAddressToClassicRequest: RestoreAddressToClassicRequest): Try[RestoreAddressToClassicResult] = Try {
    underlying.restoreAddressToClassic(restoreAddressToClassicRequest)
  }

  def detachVolumeAsTry(detachVolumeRequest: DetachVolumeRequest): Try[DetachVolumeResult] = Try {
    underlying.detachVolume(detachVolumeRequest)
  }

  def deleteKeyPairAsTry(deleteKeyPairRequest: DeleteKeyPairRequest): Try[Unit] = Try {
    underlying.deleteKeyPair(deleteKeyPairRequest)
  }

  def unmonitorInstancesAsTry(unmonitorInstancesRequest: UnmonitorInstancesRequest): Try[UnmonitorInstancesResult] = Try {
    underlying.unmonitorInstances(unmonitorInstancesRequest)
  }

  def attachVpnGatewayAsTry(attachVpnGatewayRequest: AttachVpnGatewayRequest): Try[AttachVpnGatewayResult] = Try {
    underlying.attachVpnGateway(attachVpnGatewayRequest)
  }

  def createImageAsTry(createImageRequest: CreateImageRequest): Try[CreateImageResult] = Try {
    underlying.createImage(createImageRequest)
  }

  def deleteSecurityGroupAsTry(deleteSecurityGroupRequest: DeleteSecurityGroupRequest): Try[Unit] = Try {
    underlying.deleteSecurityGroup(deleteSecurityGroupRequest)
  }

  def createInstanceExportTaskAsTry(createInstanceExportTaskRequest: CreateInstanceExportTaskRequest): Try[CreateInstanceExportTaskResult] = Try {
    underlying.createInstanceExportTask(createInstanceExportTaskRequest)
  }

  def associateDhcpOptionsAsTry(associateDhcpOptionsRequest: AssociateDhcpOptionsRequest): Try[Unit] = Try {
    underlying.associateDhcpOptions(associateDhcpOptionsRequest)
  }

  def authorizeSecurityGroupEgressAsTry(authorizeSecurityGroupEgressRequest: AuthorizeSecurityGroupEgressRequest): Try[Unit] = Try {
    underlying.authorizeSecurityGroupEgress(authorizeSecurityGroupEgressRequest)
  }

  def getPasswordDataAsTry(getPasswordDataRequest: GetPasswordDataRequest): Try[GetPasswordDataResult] = Try {
    underlying.getPasswordData(getPasswordDataRequest)
  }

  def stopInstancesAsTry(stopInstancesRequest: StopInstancesRequest): Try[StopInstancesResult] = Try {
    underlying.stopInstances(stopInstancesRequest)
  }

  def importKeyPairAsTry(importKeyPairRequest: ImportKeyPairRequest): Try[ImportKeyPairResult] = Try {
    underlying.importKeyPair(importKeyPairRequest)
  }

  def deleteNetworkInterfaceAsTry(deleteNetworkInterfaceRequest: DeleteNetworkInterfaceRequest): Try[Unit] = Try {
    underlying.deleteNetworkInterface(deleteNetworkInterfaceRequest)
  }

  def modifyVpcAttributeAsTry(modifyVpcAttributeRequest: ModifyVpcAttributeRequest): Try[Unit] = Try {
    underlying.modifyVpcAttribute(modifyVpcAttributeRequest)
  }

  def describeSpotFleetInstancesAsTry(describeSpotFleetInstancesRequest: DescribeSpotFleetInstancesRequest): Try[DescribeSpotFleetInstancesResult] = Try {
    underlying.describeSpotFleetInstances(describeSpotFleetInstancesRequest)
  }

  def createSecurityGroupAsTry(createSecurityGroupRequest: CreateSecurityGroupRequest): Try[CreateSecurityGroupResult] = Try {
    underlying.createSecurityGroup(createSecurityGroupRequest)
  }

  def describeSpotPriceHistoryAsTry(describeSpotPriceHistoryRequest: DescribeSpotPriceHistoryRequest): Try[DescribeSpotPriceHistoryResult] = Try {
    underlying.describeSpotPriceHistory(describeSpotPriceHistoryRequest)
  }

  def describeNetworkInterfacesAsTry(describeNetworkInterfacesRequest: DescribeNetworkInterfacesRequest): Try[DescribeNetworkInterfacesResult] = Try {
    underlying.describeNetworkInterfaces(describeNetworkInterfacesRequest)
  }

  def describeRegionsAsTry(describeRegionsRequest: DescribeRegionsRequest): Try[DescribeRegionsResult] = Try {
    underlying.describeRegions(describeRegionsRequest)
  }

  def createDhcpOptionsAsTry(createDhcpOptionsRequest: CreateDhcpOptionsRequest): Try[CreateDhcpOptionsResult] = Try {
    underlying.createDhcpOptions(createDhcpOptionsRequest)
  }

  def deleteVpcEndpointsAsTry(deleteVpcEndpointsRequest: DeleteVpcEndpointsRequest): Try[DeleteVpcEndpointsResult] = Try {
    underlying.deleteVpcEndpoints(deleteVpcEndpointsRequest)
  }

  def createReservedInstancesListingAsTry(createReservedInstancesListingRequest: CreateReservedInstancesListingRequest): Try[CreateReservedInstancesListingResult] = Try {
    underlying.createReservedInstancesListing(createReservedInstancesListingRequest)
  }

  def resetSnapshotAttributeAsTry(resetSnapshotAttributeRequest: ResetSnapshotAttributeRequest): Try[Unit] = Try {
    underlying.resetSnapshotAttribute(resetSnapshotAttributeRequest)
  }

  def deleteRouteAsTry(deleteRouteRequest: DeleteRouteRequest): Try[Unit] = Try {
    underlying.deleteRoute(deleteRouteRequest)
  }

  def describeInternetGatewaysAsTry(describeInternetGatewaysRequest: DescribeInternetGatewaysRequest): Try[DescribeInternetGatewaysResult] = Try {
    underlying.describeInternetGateways(describeInternetGatewaysRequest)
  }

  def importVolumeAsTry(importVolumeRequest: ImportVolumeRequest): Try[ImportVolumeResult] = Try {
    underlying.importVolume(importVolumeRequest)
  }

  def describeSecurityGroupsAsTry(describeSecurityGroupsRequest: DescribeSecurityGroupsRequest): Try[DescribeSecurityGroupsResult] = Try {
    underlying.describeSecurityGroups(describeSecurityGroupsRequest)
  }

  def rejectVpcPeeringConnectionAsTry(rejectVpcPeeringConnectionRequest: RejectVpcPeeringConnectionRequest): Try[RejectVpcPeeringConnectionResult] = Try {
    underlying.rejectVpcPeeringConnection(rejectVpcPeeringConnectionRequest)
  }

  def detachVpnGatewayAsTry(detachVpnGatewayRequest: DetachVpnGatewayRequest): Try[Unit] = Try {
    underlying.detachVpnGateway(detachVpnGatewayRequest)
  }

  def deregisterImagAsTry(deregisterImageRequest: DeregisterImageRequest): Try[Unit] = Try {
    underlying.deregisterImage(deregisterImageRequest)
  }

  def describeSpotDatafeedSubscriptionAsTry(describeSpotDatafeedSubscriptionRequest: DescribeSpotDatafeedSubscriptionRequest): Try[DescribeSpotDatafeedSubscriptionResult] = Try {
    underlying.describeSpotDatafeedSubscription(describeSpotDatafeedSubscriptionRequest)
  }

  def deleteTagsAsTry(deleteTagsRequest: DeleteTagsRequest): Try[Unit] = Try {
    underlying.deleteTags(deleteTagsRequest)
  }

  def deleteSubnet(deleteSubnetRequest: DeleteSubnetRequest): Try[Unit] = Try {
    underlying.deleteSubnet(deleteSubnetRequest)
  }

  def describeAccountAttributes(describeAccountAttributesRequest: DescribeAccountAttributesRequest): Try[DescribeAccountAttributesResult] = Try {
    underlying.describeAccountAttributes(describeAccountAttributesRequest)
  }

  def attachClassicLinkVpcAsTry(attachClassicLinkVpcRequest: AttachClassicLinkVpcRequest): Try[AttachClassicLinkVpcResult] = Try {
    underlying.attachClassicLinkVpc(attachClassicLinkVpcRequest)
  }

  def createVpnGatewayAsTry(createVpnGatewayRequest: CreateVpnGatewayRequest): Try[CreateVpnGatewayResult] = Try {
    underlying.createVpnGateway(createVpnGatewayRequest)
  }

  def enableVolumeIOAsTry(enableVolumeIORequest: EnableVolumeIORequest): Try[Unit] = Try {
    underlying.enableVolumeIO(enableVolumeIORequest)
  }

  def moveAddressToVpcAsTry(moveAddressToVpcRequest: MoveAddressToVpcRequest): Try[MoveAddressToVpcResult] = Try {
    underlying.moveAddressToVpc(moveAddressToVpcRequest)
  }

  def deleteVpnGatewayAsTry(deleteVpnGatewayRequest: DeleteVpnGatewayRequest): Try[Unit] = Try {
    underlying.deleteVpnGateway(deleteVpnGatewayRequest)
  }

  def attachVolumeAsTry(attachVolumeRequest: AttachVolumeRequest): Try[AttachVolumeResult] = Try {
    underlying.attachVolume(attachVolumeRequest)
  }

  def createSnapshotAsTry(createSnapshotRequest: CreateSnapshotRequest): Try[CreateSnapshotResult] = Try {
    underlying.createSnapshot(createSnapshotRequest)
  }

  def deleteVolumeAsTry(deleteVolumeRequest: DeleteVolumeRequest): Try[Unit] = Try {
    underlying.deleteVolume(deleteVolumeRequest)
  }

  def createNetworkInterfaceAsTry(createNetworkInterfaceRequest: CreateNetworkInterfaceRequest): Try[CreateNetworkInterfaceResult] = Try {
    underlying.createNetworkInterface(createNetworkInterfaceRequest)
  }

  def modifyReservedInstancesAsTry(modifyReservedInstancesRequest: ModifyReservedInstancesRequest): Try[ModifyReservedInstancesResult] = Try {
    underlying.modifyReservedInstances(modifyReservedInstancesRequest)
  }

  def cancelSpotFleetRequestsAsTry(cancelSpotFleetRequestsRequest: CancelSpotFleetRequestsRequest): Try[CancelSpotFleetRequestsResult] = Try {
    underlying.cancelSpotFleetRequests(cancelSpotFleetRequestsRequest)
  }

  def unassignPrivateIpAddressesAsTry(unassignPrivateIpAddressesRequest: UnassignPrivateIpAddressesRequest): Try[Unit] = Try {
    underlying.unassignPrivateIpAddresses(unassignPrivateIpAddressesRequest)
  }

  def describeVpcsAsTry(describeVpcsRequest: DescribeVpcsRequest): Try[DescribeVpcsResult] = Try {
    underlying.describeVpcs(describeVpcsRequest)
  }

  def cancelConversionTaskAsTry(cancelConversionTaskRequest: CancelConversionTaskRequest): Try[Unit] = Try {
    underlying.cancelConversionTask(cancelConversionTaskRequest)
  }

  def associateAddressAsTry(associateAddressRequest: AssociateAddressRequest): Try[AssociateAddressResult] = Try {
    underlying.associateAddress(associateAddressRequest)
  }

  def deleteCustomerGatewayAsTry(deleteCustomerGatewayRequest: DeleteCustomerGatewayRequest): Try[Unit] = Try {
    underlying.deleteCustomerGateway(deleteCustomerGatewayRequest)
  }

  def describeVolumeStatusAsTry(describeVolumeStatusRequest: DescribeVolumeStatusRequest): Try[DescribeVolumeStatusResult] = Try {
    underlying.describeVolumeStatus(describeVolumeStatusRequest)
  }

  def describeImportSnapshotTasksAsTry(describeImportSnapshotTasksRequest: DescribeImportSnapshotTasksRequest): Try[DescribeImportSnapshotTasksResult] = Try {
    underlying.describeImportSnapshotTasks(describeImportSnapshotTasksRequest)
  }

  def resetImageAttributeAsTry(resetImageAttributeRequest: ResetImageAttributeRequest): Try[Unit] = Try {
    underlying.resetImageAttribute(resetImageAttributeRequest)
  }

  def describeVpnConnectionsAsTry(describeVpnConnectionsRequest: DescribeVpnConnectionsRequest): Try[DescribeVpnConnectionsResult] = Try {
    underlying.describeVpnConnections(describeVpnConnectionsRequest)
  }

  def enableVgwRoutePropagationAsTry(enableVgwRoutePropagationRequest: EnableVgwRoutePropagationRequest): Try[Unit] = Try {
    underlying.enableVgwRoutePropagation(enableVgwRoutePropagationRequest)
  }

  def createNetworkAclEntryAsTry(createNetworkAclEntryRequest: CreateNetworkAclEntryRequest): Try[Unit] = Try {
    underlying.createNetworkAclEntry(createNetworkAclEntryRequest)
  }

  def acceptVpcPeeringConnectionAsTry(acceptVpcPeeringConnectionRequest: AcceptVpcPeeringConnectionRequest): Try[AcceptVpcPeeringConnectionResult] = Try {
    underlying.acceptVpcPeeringConnection(acceptVpcPeeringConnectionRequest)
  }

  def describeExportTasksAsTry(describeExportTasksRequest: DescribeExportTasksRequest): Try[DescribeExportTasksResult] = Try {
    underlying.describeExportTasks(describeExportTasksRequest)
  }

  def detachInternetGatewayAsTry(detachInternetGatewayRequest: DetachInternetGatewayRequest): Try[Unit] = Try {
    underlying.detachInternetGateway(detachInternetGatewayRequest)
  }

  def createVpcPeeringConnectionAsTry(createVpcPeeringConnectionRequest: CreateVpcPeeringConnectionRequest): Try[CreateVpcPeeringConnectionResult] = Try {
    underlying.createVpcPeeringConnection(createVpcPeeringConnectionRequest)
  }

  def createRouteTableAsTry(createRouteTableRequest: CreateRouteTableRequest): Try[CreateRouteTableResult] = Try {
    underlying.createRouteTable(createRouteTableRequest)
  }

  def cancelImportTaskAsTry(cancelImportTaskRequest: CancelImportTaskRequest): Try[CancelImportTaskResult] = Try {
    underlying.cancelImportTask(cancelImportTaskRequest)
  }

  def describeVolumesAsTry(describeVolumesRequest: DescribeVolumesRequest): Try[DescribeVolumesResult] = Try {
    underlying.describeVolumes(describeVolumesRequest)
  }

  def describeReservedInstancesListingsAsTry(describeReservedInstancesListingsRequest: DescribeReservedInstancesListingsRequest): Try[DescribeReservedInstancesListingsResult] = Try {
    underlying.describeReservedInstancesListings(describeReservedInstancesListingsRequest)
  }

  def reportInstanceStatus(reportInstanceStatusRequest: ReportInstanceStatusRequest): Try[Unit] = Try {
    underlying.reportInstanceStatus(reportInstanceStatusRequest)
  }

  def describeRouteTablesAsTry(describeRouteTablesRequest: DescribeRouteTablesRequest): Try[DescribeRouteTablesResult] = Try {
    underlying.describeRouteTables(describeRouteTablesRequest)
  }

  def describeDhcpOptionsAsTry(describeDhcpOptionsRequest: DescribeDhcpOptionsRequest): Try[DescribeDhcpOptionsResult] = Try {
    underlying.describeDhcpOptions(describeDhcpOptionsRequest)
  }

  def monitorInstancesAsTry(monitorInstancesRequest: MonitorInstancesRequest): Try[MonitorInstancesResult] = Try {
    underlying.monitorInstances(monitorInstancesRequest)
  }

  def describePrefixListsAsTry(describePrefixListsRequest: DescribePrefixListsRequest): Try[DescribePrefixListsResult] = Try {
    underlying.describePrefixLists(describePrefixListsRequest)
  }

  def requestSpotFleetAsTry(requestSpotFleetRequest: RequestSpotFleetRequest): Try[RequestSpotFleetResult] = Try {
    underlying.requestSpotFleet(requestSpotFleetRequest)
  }

  def describeImportImageTasksAsTry(describeImportImageTasksRequest: DescribeImportImageTasksRequest): Try[DescribeImportImageTasksResult] = Try {
    underlying.describeImportImageTasks(describeImportImageTasksRequest)
  }

  def describeNetworkAclsAsTry(describeNetworkAclsRequest: DescribeNetworkAclsRequest): Try[DescribeNetworkAclsResult] = Try {
    underlying.describeNetworkAcls(describeNetworkAclsRequest)
  }

  def describeBundleTasksAsTry(describeBundleTasksRequest: DescribeBundleTasksRequest): Try[DescribeBundleTasksResult] = Try {
    underlying.describeBundleTasks(describeBundleTasksRequest)
  }

  def importInstanceAsTry(importInstanceRequest: ImportInstanceRequest): Try[ImportInstanceResult] = Try {
    underlying.importInstance(importInstanceRequest)
  }

  def revokeSecurityGroupIngressAsTry(revokeSecurityGroupIngressRequest: RevokeSecurityGroupIngressRequest): Try[Unit] = Try {
    underlying.revokeSecurityGroupIngress(revokeSecurityGroupIngressRequest)
  }

  def deleteVpcPeeringConnectionAsTry(deleteVpcPeeringConnectionRequest: DeleteVpcPeeringConnectionRequest): Try[DeleteVpcPeeringConnectionResult] = Try {
    underlying.deleteVpcPeeringConnection(deleteVpcPeeringConnectionRequest)
  }

  def getConsoleOutputAsTry(getConsoleOutputRequest: GetConsoleOutputRequest): Try[GetConsoleOutputResult] = Try {
    underlying.getConsoleOutput(getConsoleOutputRequest)
  }

  def createInternetGatewayAsTry(createInternetGatewayRequest: CreateInternetGatewayRequest): Try[CreateInternetGatewayResult] = Try {
    underlying.createInternetGateway(createInternetGatewayRequest)
  }

  def deleteVpnConnectionRouteAsTry(deleteVpnConnectionRouteRequest: DeleteVpnConnectionRouteRequest): Try[Unit] = Try {
    underlying.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest)
  }

  def detachNetworkInterfaceAsTry(detachNetworkInterfaceRequest: DetachNetworkInterfaceRequest): Try[Unit] = Try {
    underlying.detachNetworkInterface(detachNetworkInterfaceRequest)
  }

  def modifyImageAttributeAsTry(modifyImageAttributeRequest: ModifyImageAttributeRequest): Try[Unit] = Try {
    underlying.modifyImageAttribute(modifyImageAttributeRequest)
  }

  def createCustomerGatewayAsTry(createCustomerGatewayRequest: CreateCustomerGatewayRequest): Try[CreateCustomerGatewayResult] = Try {
    underlying.createCustomerGateway(createCustomerGatewayRequest)
  }

  def createSpotDatafeedSubscriptionAsTry(createSpotDatafeedSubscriptionRequest: CreateSpotDatafeedSubscriptionRequest): Try[CreateSpotDatafeedSubscriptionResult] = Try {
    underlying.createSpotDatafeedSubscription(createSpotDatafeedSubscriptionRequest)
  }

  def attachInternetGatewayAsTry(attachInternetGatewayRequest: AttachInternetGatewayRequest): Try[Unit] = Try {
    underlying.attachInternetGateway(attachInternetGatewayRequest)
  }

  def deleteVpnConnectionAsTry(deleteVpnConnectionRequest: DeleteVpnConnectionRequest): Try[Unit] = Try {
    underlying.deleteVpnConnection(deleteVpnConnectionRequest)
  }

  def describeMovingAddressesAsTry(describeMovingAddressesRequest: DescribeMovingAddressesRequest): Try[DescribeMovingAddressesResult] = Try {
    underlying.describeMovingAddresses(describeMovingAddressesRequest)
  }

  def describeConversionTasksAsTry(describeConversionTasksRequest: DescribeConversionTasksRequest): Try[DescribeConversionTasksResult] = Try {
    underlying.describeConversionTasks(describeConversionTasksRequest)
  }

  def createVpnConnectionAsTry(createVpnConnectionRequest: CreateVpnConnectionRequest): Try[CreateVpnConnectionResult] = Try {
    underlying.createVpnConnection(createVpnConnectionRequest)
  }

  def importImageAsTry(importImageRequest: ImportImageRequest): Try[ImportImageResult] = Try {
    underlying.importImage(importImageRequest)
  }

  def disableVpcClassicLinkAsTry(disableVpcClassicLinkRequest: DisableVpcClassicLinkRequest): Try[DisableVpcClassicLinkResult] = Try {
    underlying.disableVpcClassicLink(disableVpcClassicLinkRequest)
  }

  def describeInstanceAttributeAsTry(describeInstanceAttributeRequest: DescribeInstanceAttributeRequest): Try[DescribeInstanceAttributeResult] = Try {
    underlying.describeInstanceAttribute(describeInstanceAttributeRequest)
  }

  def describeVpcPeeringConnectionsAsTry(describeVpcPeeringConnectionsRequest: DescribeVpcPeeringConnectionsRequest): Try[DescribeVpcPeeringConnectionsResult] = Try {
    underlying.describeVpcPeeringConnections(describeVpcPeeringConnectionsRequest)
  }

  def describePlacementGroupsAsTry(describePlacementGroupsRequest: DescribePlacementGroupsRequest): Try[DescribePlacementGroupsResult] = Try {
    underlying.describePlacementGroups(describePlacementGroupsRequest)
  }

  def runInstancesAsTry(runInstancesRequest: RunInstancesRequest): Try[RunInstancesResult] = Try {
    underlying.runInstances(runInstancesRequest)
  }

  def describeSubnetsAsTry(describeSubnetsRequest: DescribeSubnetsRequest): Try[DescribeSubnetsResult] = Try {
    underlying.describeSubnets(describeSubnetsRequest)
  }

  def associateRouteTableAsTry(associateRouteTableRequest: AssociateRouteTableRequest): Try[AssociateRouteTableResult] = Try {
    underlying.associateRouteTable(associateRouteTableRequest)
  }

  def describeInstancesAsTry(describeInstancesRequest: DescribeInstancesRequest): Try[DescribeInstancesResult] = Try {
    underlying.describeInstances(describeInstancesRequest)
  }

  def modifyVolumeAttributeAsTry(modifyVolumeAttributeRequest: ModifyVolumeAttributeRequest): Try[Unit] = Try {
    underlying.modifyVolumeAttribute(modifyVolumeAttributeRequest)
  }

  def deleteNetworkAclAsTry(deleteNetworkAclRequest: DeleteNetworkAclRequest): Try[Unit] = Try {
    underlying.deleteNetworkAcl(deleteNetworkAclRequest)
  }

  def describeImagesAsTry(describeImagesRequest: DescribeImagesRequest): Try[DescribeImagesResult] = Try {
    underlying.describeImages(describeImagesRequest)
  }

  def startInstancesAsTry(startInstancesRequest: StartInstancesRequest): Try[StartInstancesResult] = Try {
    underlying.startInstances(startInstancesRequest)
  }

  def modifyInstanceAttributeAsTry(modifyInstanceAttributeRequest: ModifyInstanceAttributeRequest): Try[Unit] = Try {
    underlying.modifyInstanceAttribute(modifyInstanceAttributeRequest)
  }

  def cancelReservedInstancesListingAsTry(cancelReservedInstancesListingRequest: CancelReservedInstancesListingRequest): Try[CancelReservedInstancesListingResult] = Try {
    underlying.cancelReservedInstancesListing(cancelReservedInstancesListingRequest)
  }

  def deleteDhcpOptionsAsTry(deleteDhcpOptionsRequest: DeleteDhcpOptionsRequest): Try[Unit] = Try {
    underlying.deleteDhcpOptions(deleteDhcpOptionsRequest)
  }

  def authorizeSecurityGroupIngressAsTry(authorizeSecurityGroupIngressRequest: AuthorizeSecurityGroupIngressRequest): Try[Unit] = Try {
    underlying.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest)
  }

  def describeSpotInstanceRequestsAsTry(describeSpotInstanceRequestsRequest: DescribeSpotInstanceRequestsRequest): Try[DescribeSpotInstanceRequestsResult] = Try {
    underlying.describeSpotInstanceRequests(describeSpotInstanceRequestsRequest)
  }

  def createVpcAsTry(createVpcRequest: CreateVpcRequest): Try[CreateVpcResult] = Try {
    underlying.createVpc(createVpcRequest)
  }

  def describeCustomerGatewaysAsTry(describeCustomerGatewaysRequest: DescribeCustomerGatewaysRequest): Try[DescribeCustomerGatewaysResult] = Try {
    underlying.describeCustomerGateways(describeCustomerGatewaysRequest)
  }

  def cancelExportTaskAsTry(cancelExportTaskRequest: CancelExportTaskRequest): Try[Unit] = Try {
    underlying.cancelExportTask(cancelExportTaskRequest)
  }

  def createRouteAsTry(createRouteRequest: CreateRouteRequest): Try[CreateRouteResult] = Try {
    underlying.createRoute(createRouteRequest)
  }

  def createVpcEndpointAsTry(createVpcEndpointRequest: CreateVpcEndpointRequest): Try[CreateVpcEndpointResult] = Try {
    underlying.createVpcEndpoint(createVpcEndpointRequest)
  }

  def copyImageAsTry(copyImageRequest: CopyImageRequest): Try[CopyImageResult] = Try {
    underlying.copyImage(copyImageRequest)
  }

  def describeVpcClassicLinkAsTry(describeVpcClassicLinkRequest: DescribeVpcClassicLinkRequest): Try[DescribeVpcClassicLinkResult] = Try {
    underlying.describeVpcClassicLink(describeVpcClassicLinkRequest)
  }

  def modifyNetworkInterfaceAttributeAsTry(modifyNetworkInterfaceAttributeRequest: ModifyNetworkInterfaceAttributeRequest): Try[Unit] = Try {
    underlying.modifyNetworkInterfaceAttribute(modifyNetworkInterfaceAttributeRequest)
  }

  def deleteRouteTableAsTry(deleteRouteTableRequest: DeleteRouteTableRequest): Try[Unit] = Try {
    underlying.deleteRouteTable(deleteRouteTableRequest)
  }

  def describeNetworkInterfaceAttributeAsTry(describeNetworkInterfaceAttributeRequest: DescribeNetworkInterfaceAttributeRequest): Try[DescribeNetworkInterfaceAttributeResult] = Try {
    underlying.describeNetworkInterfaceAttribute(describeNetworkInterfaceAttributeRequest)
  }

  def describeClassicLinkInstancesAsTry(describeClassicLinkInstancesRequest: DescribeClassicLinkInstancesRequest): Try[DescribeClassicLinkInstancesResult] = Try {
    underlying.describeClassicLinkInstances(describeClassicLinkInstancesRequest)
  }

  def requestSpotInstancesAsTry(requestSpotInstancesRequest: RequestSpotInstancesRequest): Try[RequestSpotInstancesResult] = Try {
    underlying.requestSpotInstances(requestSpotInstancesRequest)
  }

  def createTagsAsTry(createTagsRequest: CreateTagsRequest): Try[Unit] = Try {
    underlying.createTags(createTagsRequest)
  }

  def describeVolumeAttributeAsTry(describeVolumeAttributeRequest: DescribeVolumeAttributeRequest): Try[DescribeVolumeAttributeResult] = Try {
    underlying.describeVolumeAttribute(describeVolumeAttributeRequest)
  }

  def attachNetworkInterfaceAsTry(attachNetworkInterfaceRequest: AttachNetworkInterfaceRequest): Try[AttachNetworkInterfaceResult] = Try {
    underlying.attachNetworkInterface(attachNetworkInterfaceRequest)
  }

  def replaceRouteAsTry(replaceRouteRequest: ReplaceRouteRequest): Try[Unit] = Try {
    underlying.replaceRoute(replaceRouteRequest)
  }

  def describeTagsAsTry(describeTagsRequest: DescribeTagsRequest): Try[DescribeTagsResult] = Try {
    underlying.describeTags(describeTagsRequest)
  }

  def cancelBundleTaskAsTry(cancelBundleTaskRequest: CancelBundleTaskRequest): Try[CancelBundleTaskResult] = Try {
    underlying.cancelBundleTask(cancelBundleTaskRequest)
  }

  def disableVgwRoutePropagationAsTry(disableVgwRoutePropagationRequest: DisableVgwRoutePropagationRequest): Try[Unit] = Try {
    underlying.disableVgwRoutePropagation(disableVgwRoutePropagationRequest)
  }

  def importSnapshotAsTry(importSnapshotRequest: ImportSnapshotRequest): Try[ImportSnapshotResult] = Try {
    underlying.importSnapshot(importSnapshotRequest)
  }

  def cancelSpotInstanceRequestsAsTry(cancelSpotInstanceRequestsRequest: CancelSpotInstanceRequestsRequest): Try[CancelSpotInstanceRequestsResult] = Try {
    underlying.cancelSpotInstanceRequests(cancelSpotInstanceRequestsRequest)
  }

  def describeSpotFleetRequestsAsTry(describeSpotFleetRequestsRequest: DescribeSpotFleetRequestsRequest): Try[DescribeSpotFleetRequestsResult] = Try {
    underlying.describeSpotFleetRequests(describeSpotFleetRequestsRequest)
  }

  def purchaseReservedInstancesOfferingAsTry(purchaseReservedInstancesOfferingRequest: PurchaseReservedInstancesOfferingRequest): Try[PurchaseReservedInstancesOfferingResult] = Try {
    underlying.purchaseReservedInstancesOffering(purchaseReservedInstancesOfferingRequest)
  }

  def modifySnapshotAttributeAsTry(modifySnapshotAttributeRequest: ModifySnapshotAttributeRequest): Try[Unit] = Try {
    underlying.modifySnapshotAttribute(modifySnapshotAttributeRequest)
  }

  def describeReservedInstancesModificationsAsTry(describeReservedInstancesModificationsRequest: DescribeReservedInstancesModificationsRequest): Try[DescribeReservedInstancesModificationsResult] = Try {
    underlying.describeReservedInstancesModifications(describeReservedInstancesModificationsRequest)
  }

  def terminateInstancesAsTry(terminateInstancesRequest: TerminateInstancesRequest): Try[TerminateInstancesResult] = Try {
    underlying.terminateInstances(terminateInstancesRequest)
  }

  def modifyVpcEndpointAsTry(modifyVpcEndpointRequest: ModifyVpcEndpointRequest): Try[ModifyVpcEndpointResult] = Try {
    underlying.modifyVpcEndpoint(modifyVpcEndpointRequest)
  }

  def deleteSpotDatafeedSubscriptionAsTry(deleteSpotDatafeedSubscriptionRequest: DeleteSpotDatafeedSubscriptionRequest): Try[Unit] = Try {
    underlying.deleteSpotDatafeedSubscription(deleteSpotDatafeedSubscriptionRequest)
  }

  def deleteInternetGatewayAsTry(deleteInternetGatewayRequest: DeleteInternetGatewayRequest): Try[Unit] = Try {
    underlying.deleteInternetGateway(deleteInternetGatewayRequest)
  }

  def describeSnapshotAttributeAsTry(describeSnapshotAttributeRequest: DescribeSnapshotAttributeRequest): Try[DescribeSnapshotAttributeResult] = Try {
    underlying.describeSnapshotAttribute(describeSnapshotAttributeRequest)
  }

  def replaceRouteTableAssociationAsTry(replaceRouteTableAssociationRequest: ReplaceRouteTableAssociationRequest): Try[ReplaceRouteTableAssociationResult] = Try {
    underlying.replaceRouteTableAssociation(replaceRouteTableAssociationRequest)
  }

  def describeAddressesAsTry(describeAddressesRequest: DescribeAddressesRequest): Try[DescribeAddressesResult] = Try {
    underlying.describeAddresses(describeAddressesRequest)
  }

  def describeImageAttributeAsTry(describeImageAttributeRequest: DescribeImageAttributeRequest): Try[DescribeImageAttributeResult] = Try {
    underlying.describeImageAttribute(describeImageAttributeRequest)
  }

  def describeKeyPairsAsTry(describeKeyPairsRequest: DescribeKeyPairsRequest): Try[DescribeKeyPairsResult] = Try {
    underlying.describeKeyPairs(describeKeyPairsRequest)
  }

  def confirmProductInstanceAsTry(confirmProductInstanceRequest: ConfirmProductInstanceRequest): Try[ConfirmProductInstanceResult] = Try {
    underlying.confirmProductInstance(confirmProductInstanceRequest)
  }

  def disassociateRouteTableAsTry(disassociateRouteTableRequest: DisassociateRouteTableRequest): Try[Unit] = Try {
    underlying.disassociateRouteTable(disassociateRouteTableRequest)
  }

  def describeVpcAttributeAsTry(describeVpcAttributeRequest: DescribeVpcAttributeRequest): Try[DescribeVpcAttributeResult] = Try {
    underlying.describeVpcAttribute(describeVpcAttributeRequest)
  }

  def revokeSecurityGroupEgressAsTry(revokeSecurityGroupEgressRequest: RevokeSecurityGroupEgressRequest): Try[Unit] = Try {
    underlying.revokeSecurityGroupEgress(revokeSecurityGroupEgressRequest)
  }

  def deleteNetworkAclEntryAsTry(deleteNetworkAclEntryRequest: DeleteNetworkAclEntryRequest): Try[Unit] = Try {
    underlying.deleteNetworkAclEntry(deleteNetworkAclEntryRequest)
  }

  def createVolumeAsTry(createVolumeRequest: CreateVolumeRequest): Try[CreateVolumeResult] = Try {
    underlying.createVolume(createVolumeRequest)
  }

  def describeInstanceStatusAsTry(describeInstanceStatusRequest: DescribeInstanceStatusRequest): Try[DescribeInstanceStatusResult] = Try {
    underlying.describeInstanceStatus(describeInstanceStatusRequest)
  }

  def describeVpnGatewaysAsTry(describeVpnGatewaysRequest: DescribeVpnGatewaysRequest): Try[DescribeVpnGatewaysResult] = Try {
    underlying.describeVpnGateways(describeVpnGatewaysRequest)
  }

  def createSubnetAsTry(createSubnetRequest: CreateSubnetRequest): Try[CreateSubnetResult] = Try {
    underlying.createSubnet(createSubnetRequest)
  }

  def describeReservedInstancesOfferingsAsTry(describeReservedInstancesOfferingsRequest: DescribeReservedInstancesOfferingsRequest): Try[DescribeReservedInstancesOfferingsResult] = Try {
    underlying.describeReservedInstancesOfferings(describeReservedInstancesOfferingsRequest)
  }

  def assignPrivateIpAddressesAsTry(assignPrivateIpAddressesRequest: AssignPrivateIpAddressesRequest): Try[Unit] = Try {
    underlying.assignPrivateIpAddresses(assignPrivateIpAddressesRequest)
  }

  def describeSpotFleetRequestHistoryAsTry(describeSpotFleetRequestHistoryRequest: DescribeSpotFleetRequestHistoryRequest): Try[DescribeSpotFleetRequestHistoryResult] = Try {
    underlying.describeSpotFleetRequestHistory(describeSpotFleetRequestHistoryRequest)
  }

  def deleteSnapshotAsTry(deleteSnapshotRequest: DeleteSnapshotRequest): Try[Unit] = Try {
    underlying.deleteSnapshot(deleteSnapshotRequest)
  }

  def replaceNetworkAclAssociationAsTry(replaceNetworkAclAssociationRequest: ReplaceNetworkAclAssociationRequest): Try[ReplaceNetworkAclAssociationResult] = Try {
    underlying.replaceNetworkAclAssociation(replaceNetworkAclAssociationRequest)
  }

  def disassociateAddressAsTry(disassociateAddressRequest: DisassociateAddressRequest): Try[Unit] = Try {
    underlying.disassociateAddress(disassociateAddressRequest)
  }

  def createPlacementGroupAsTry(createPlacementGroupRequest: CreatePlacementGroupRequest): Try[Unit] = Try {
    underlying.createPlacementGroup(createPlacementGroupRequest)
  }

  def bundleInstanceAsTry(bundleInstanceRequest: BundleInstanceRequest): Try[BundleInstanceResult] = Try {
    underlying.bundleInstance(bundleInstanceRequest)
  }

  def deletePlacementGroupAsTry(deletePlacementGroupRequest: DeletePlacementGroupRequest): Try[Unit] = Try {
    underlying.deletePlacementGroup(deletePlacementGroupRequest)
  }

  def modifySubnetAttributeAsTry(modifySubnetAttributeRequest: ModifySubnetAttributeRequest): Try[Unit] = Try {
    underlying.modifySubnetAttribute(modifySubnetAttributeRequest)
  }

  def deleteVpcAsTry(deleteVpcRequest: DeleteVpcRequest): Try[Unit] = Try {
    underlying.deleteVpc(deleteVpcRequest)
  }

  def copySnapshotAsTry(copySnapshotRequest: CopySnapshotRequest): Try[CopySnapshotResult] = Try {
    underlying.copySnapshot(copySnapshotRequest)
  }

  def describeVpcEndpointServicesAsTry(describeVpcEndpointServicesRequest: DescribeVpcEndpointServicesRequest): Try[DescribeVpcEndpointServicesResult] = Try {
    underlying.describeVpcEndpointServices(describeVpcEndpointServicesRequest)
  }

  def allocateAddressAsTry(allocateAddressRequest: AllocateAddressRequest): Try[AllocateAddressResult] = Try {
    underlying.allocateAddress(allocateAddressRequest)
  }

  def releaseAddressAsTry(releaseAddressRequest: ReleaseAddressRequest): Try[Unit] = Try {
    underlying.releaseAddress(releaseAddressRequest)
  }

  def resetInstanceAttributeAsTry(resetInstanceAttributeRequest: ResetInstanceAttributeRequest): Try[Unit] = Try {
    underlying.resetInstanceAttribute(resetInstanceAttributeRequest)
  }

  def createKeyPairAsTry(createKeyPairRequest: CreateKeyPairRequest): Try[CreateKeyPairResult] = Try {
    underlying.createKeyPair(createKeyPairRequest)
  }

  def replaceNetworkAclEntryAsTry(replaceNetworkAclEntryRequest: ReplaceNetworkAclEntryRequest): Try[Unit] = Try {
    underlying.replaceNetworkAclEntry(replaceNetworkAclEntryRequest)
  }

  def describeSnapshotsAsTry(describeSnapshotsRequest: DescribeSnapshotsRequest): Try[DescribeSnapshotsResult] = Try {
    underlying.describeSnapshots(describeSnapshotsRequest)
  }

  def createNetworkAclAsTry(createNetworkAclRequest: CreateNetworkAclRequest): Try[CreateNetworkAclResult] = Try {
    underlying.createNetworkAcl(createNetworkAclRequest)
  }

  def registerImageAsTry(registerImageRequest: RegisterImageRequest): Try[RegisterImageResult] = Try {
    underlying.registerImage(registerImageRequest)
  }

  def resetNetworkInterfaceAttributeAsTry(resetNetworkInterfaceAttributeRequest: ResetNetworkInterfaceAttributeRequest): Try[Unit] = Try {
    underlying.resetNetworkInterfaceAttribute(resetNetworkInterfaceAttributeRequest)
  }

  def enableVpcClassicLinkAsTry(enableVpcClassicLinkRequest: EnableVpcClassicLinkRequest): Try[EnableVpcClassicLinkResult] = Try {
    underlying.enableVpcClassicLink(enableVpcClassicLinkRequest)
  }

  def createVpnConnectionRouteAsTry(createVpnConnectionRouteRequest: CreateVpnConnectionRouteRequest): Try[Unit] = Try {
    underlying.createVpnConnectionRoute(createVpnConnectionRouteRequest)
  }

  def describeVpcEndpointsAsTry(describeVpcEndpointsRequest: DescribeVpcEndpointsRequest): Try[DescribeVpcEndpointsResult] = Try {
    underlying.describeVpcEndpoints(describeVpcEndpointsRequest)
  }

  def detachClassicLinkVpcAsTry(detachClassicLinkVpcRequest: DetachClassicLinkVpcRequest): Try[DetachClassicLinkVpcResult] = Try {
    underlying.detachClassicLinkVpc(detachClassicLinkVpcRequest)
  }

  def describeReservedInstancesAsTry(): Try[DescribeReservedInstancesResult] = Try {
    underlying.describeReservedInstances()
  }

  def describeAvailabilityZonesAsTry(): Try[DescribeAvailabilityZonesResult] = Try {
    underlying.describeAvailabilityZones()
  }

  def describeSpotPriceHistoryAsTry(): Try[DescribeSpotPriceHistoryResult] = Try {
    underlying.describeSpotPriceHistory()
  }

  def describeNetworkInterfacesAsTry(): Try[DescribeNetworkInterfacesResult] = Try {
    underlying.describeNetworkInterfaces()
  }

  def describeRegionsAsTry(): Try[DescribeRegionsResult] = Try {
    underlying.describeRegions()
  }

  def describeInternetGatewaysAsTry(): Try[DescribeInternetGatewaysResult] = Try {
    underlying.describeInternetGateways()
  }

  def describeSecurityGroupsAsTry(): Try[DescribeSecurityGroupsResult] = Try {
    underlying.describeSecurityGroups()
  }

  def describeSpotDatafeedSubscriptionAsTry(): Try[DescribeSpotDatafeedSubscriptionResult] = Try {
    underlying.describeSpotDatafeedSubscription()
  }

  def describeAccountAttributesAsTry(): Try[DescribeAccountAttributesResult] = Try {
    underlying.describeAccountAttributes()
  }

  def describeVolumeStatusAsTry(): Try[DescribeVolumeStatusResult] = Try {
    underlying.describeVolumeStatus()
  }

  def describeImportSnapshotTasksAsTry(): Try[DescribeImportSnapshotTasksResult] = Try {
    underlying.describeImportSnapshotTasks()
  }

  def describeVpnConnectionsAsTry(): Try[DescribeVpnConnectionsResult] = Try {
    underlying.describeVpnConnections()
  }

  def describeVpcsAsTry(): Try[DescribeVpcsResult] = Try {
    underlying.describeVpcs()
  }

  def acceptVpcPeeringConnectionAsTry(): Try[AcceptVpcPeeringConnectionResult] = Try {
    underlying.acceptVpcPeeringConnection()
  }

  def describeExportTasksAsTry(): Try[DescribeExportTasksResult] = Try {
    underlying.describeExportTasks()
  }

  def createVpcPeeringConnectionAsTry(): Try[CreateVpcPeeringConnectionResult] = Try {
    underlying.createVpcPeeringConnection()
  }

  def cancelImportTaskAsTry(): Try[CancelImportTaskResult] = Try {
    underlying.cancelImportTask()
  }

  def describeVolumesAsTry(): Try[DescribeVolumesResult] = Try {
    underlying.describeVolumes()
  }

  def describeReservedInstancesListingsAsTry(): Try[DescribeReservedInstancesListingsResult] = Try {
    underlying.describeReservedInstancesListings()
  }

  def describeRouteTablesAsTry(): Try[DescribeRouteTablesResult] = Try {
    underlying.describeRouteTables()
  }

  def describeDhcpOptionsAsTry(): Try[DescribeDhcpOptionsResult] = Try {
    underlying.describeDhcpOptions()
  }

  def describePrefixListsAsTry(): Try[DescribePrefixListsResult] = Try {
    underlying.describePrefixLists()
  }

  def describeImportImageTasksAsTry(): Try[DescribeImportImageTasksResult] = Try {
    underlying.describeImportImageTasks()
  }

  def describeNetworkAclsAsTry(): Try[DescribeNetworkAclsResult] = Try {
    underlying.describeNetworkAcls()
  }

  def describeBundleTasksAsTry(): Try[DescribeBundleTasksResult] = Try {
    underlying.describeBundleTasks()
  }

  def revokeSecurityGroupIngressAsTry(): Try[Unit] = Try {
    underlying.revokeSecurityGroupIngress()
  }

  def createInternetGatewayAsTry(): Try[CreateInternetGatewayResult] = Try {
    underlying.createInternetGateway()
  }

  def describeMovingAddressesAsTry(): Try[DescribeMovingAddressesResult] = Try {
    underlying.describeMovingAddresses()
  }

  def describeConversionTasksAsTry(): Try[DescribeConversionTasksResult] = Try {
    underlying.describeConversionTasks()
  }

  def importImageAsTry(): Try[ImportImageResult] = Try {
    underlying.importImage()
  }

  def describeVpcPeeringConnectionsAsTry(): Try[DescribeVpcPeeringConnectionsResult] = Try {
    underlying.describeVpcPeeringConnections()
  }

  def describePlacementGroupsAsTry(): Try[DescribePlacementGroupsResult] = Try {
    underlying.describePlacementGroups()
  }

  def describeSubnetsAsTry(): Try[DescribeSubnetsResult] = Try {
    underlying.describeSubnets()
  }

  def describeInstancesAsTry(): Try[DescribeInstancesResult] = Try {
    underlying.describeInstances()
  }

  def describeImagesAsTry(): Try[DescribeImagesResult] = Try {
    underlying.describeImages()
  }

  def describeSpotInstanceRequestsAsTry(): Try[DescribeSpotInstanceRequestsResult] = Try {
    underlying.describeSpotInstanceRequests()
  }

  def describeCustomerGatewaysAsTry(): Try[DescribeCustomerGatewaysResult] = Try {
    underlying.describeCustomerGateways()
  }

  def describeVpcClassicLinkAsTry(): Try[DescribeVpcClassicLinkResult] = Try {
    underlying.describeVpcClassicLink()
  }

  def describeClassicLinkInstancesAsTry(): Try[DescribeClassicLinkInstancesResult] = Try {
    underlying.describeClassicLinkInstances()
  }

  def describeTagsAsTry(): Try[DescribeTagsResult] = Try {
    underlying.describeTags()
  }

  def importSnapshotAsTry(): Try[ImportSnapshotResult] = Try {
    underlying.importSnapshot()
  }

  def describeSpotFleetRequestsAsTry(): Try[DescribeSpotFleetRequestsResult] = Try {
    underlying.describeSpotFleetRequests()
  }

  def describeReservedInstancesModificationsAsTry(): Try[DescribeReservedInstancesModificationsResult] = Try {
    underlying.describeReservedInstancesModifications()
  }

  def deleteSpotDatafeedSubscriptionAsTry(): Try[Unit] = Try {
    underlying.deleteSpotDatafeedSubscription()
  }

  def describeAddressesAsTry(): Try[DescribeAddressesResult] = Try {
    underlying.describeAddresses()
  }

  def describeKeyPairsAsTry(): Try[DescribeKeyPairsResult] = Try {
    underlying.describeKeyPairs()
  }

  def describeInstanceStatusAsTry(): Try[DescribeInstanceStatusResult] = Try {
    underlying.describeInstanceStatus()
  }

  def describeVpnGatewaysAsTry(): Try[DescribeVpnGatewaysResult] = Try {
    underlying.describeVpnGateways()
  }

  def describeReservedInstancesOfferingsAsTry(): Try[DescribeReservedInstancesOfferingsResult] = Try {
    underlying.describeReservedInstancesOfferings()
  }

  def describeVpcEndpointServicesAsTry(): Try[DescribeVpcEndpointServicesResult] = Try {
    underlying.describeVpcEndpointServices()
  }

  def allocateAddressAsTry(): Try[AllocateAddressResult] = Try {
    underlying.allocateAddress()
  }

  def describeSnapshotsAsTry(): Try[DescribeSnapshotsResult] = Try {
    underlying.describeSnapshots()
  }

  def describeVpcEndpointsAsTry(): Try[DescribeVpcEndpointsResult] = Try {
    underlying.describeVpcEndpoints()
  }

  def dryRun[A <: AmazonWebServiceRequest](dryRunSupportedRequest: DryRunSupportedRequest[A]): Try[DryRunResult[A]] = Try {
    underlying.dryRun(dryRunSupportedRequest)
  }

}

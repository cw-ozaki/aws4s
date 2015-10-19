package org.sisioh.aws4s.elasticache

import com.amazonaws.services.elasticache.AmazonElastiCacheClient
import com.amazonaws.services.elasticache.model._
import com.amazonaws.{AmazonWebServiceRequest, ResponseMetadata}
import org.sisioh.aws4s.PimpedType

import scala.util.Try

class RichAmazonElastiCacheClient(val underlying: AmazonElastiCacheClient)
  extends PimpedType[AmazonElastiCacheClient] {

  def describeEngineDefaultParametersAsTry(describeEngineDefaultParametersRequest: DescribeEngineDefaultParametersRequest): Try[EngineDefaults] = Try {
    underlying.describeEngineDefaultParameters(describeEngineDefaultParametersRequest)
  }

  def describeReservedCacheNodesAsTry(describeReservedCacheNodesRequest: DescribeReservedCacheNodesRequest): Try[DescribeReservedCacheNodesResult] = Try {
    underlying.describeReservedCacheNodes(describeReservedCacheNodesRequest)
  }

  def deleteReplicationGroupAsTry(deleteReplicationGroupRequest: DeleteReplicationGroupRequest): Try[ReplicationGroup] = Try {
    underlying.deleteReplicationGroup(deleteReplicationGroupRequest)
  }

  def deleteSnapshotAsTry(deleteSnapshotRequest: DeleteSnapshotRequest): Try[Snapshot] = Try {
    underlying.deleteSnapshot(deleteSnapshotRequest)
  }

  def createCacheSubnetGroupAsTry(createCacheSubnetGroupRequest: CreateCacheSubnetGroupRequest): Try[CacheSubnetGroup] = Try {
    underlying.createCacheSubnetGroup(createCacheSubnetGroupRequest)
  }

  def deleteCacheSubnetGroupAsTry(deleteCacheSubnetGroupRequest: DeleteCacheSubnetGroupRequest): Try[Unit] = Try {
    underlying.deleteCacheSubnetGroup(deleteCacheSubnetGroupRequest)
  }

  def describeCacheParametersAsTry(describeCacheParametersRequest: DescribeCacheParametersRequest): Try[DescribeCacheParametersResult] = Try {
    underlying.describeCacheParameters(describeCacheParametersRequest)
  }

  def listTagsForResourceAsTry(listTagsForResourceRequest: ListTagsForResourceRequest): Try[ListTagsForResourceResult] = Try {
    underlying.listTagsForResource(listTagsForResourceRequest)
  }

  def deleteCacheSecurityGroupAsTry(deleteCacheSecurityGroupRequest: DeleteCacheSecurityGroupRequest): Try[Unit] = Try {
    underlying.deleteCacheSecurityGroup(deleteCacheSecurityGroupRequest)
  }

  def addTagsToResourceAsTry(addTagsToResourceRequest: AddTagsToResourceRequest): Try[AddTagsToResourceResult] = Try{
    underlying.addTagsToResource(addTagsToResourceRequest)
  }

  def copySnapshotAsTry(copySnapshotRequest: CopySnapshotRequest): Try[Snapshot] = Try{
    underlying.copySnapshot(copySnapshotRequest)
  }

  def describeSnapshotsAsTry(describeSnapshotsRequest: DescribeSnapshotsRequest): Try[DescribeSnapshotsResult] = Try{
    underlying.describeSnapshots(describeSnapshotsRequest)
  }

  def describeCacheSecurityGroupsAsTry(describeCacheSecurityGroupsRequest: DescribeCacheSecurityGroupsRequest): Try[DescribeCacheSecurityGroupsResult] = Try{
    underlying.describeCacheSecurityGroups(describeCacheSecurityGroupsRequest)
  }

  def revokeCacheSecurityGroupIngressAsTry(revokeCacheSecurityGroupIngressRequest: RevokeCacheSecurityGroupIngressRequest): Try[CacheSecurityGroup] = Try{
    underlying.revokeCacheSecurityGroupIngress(revokeCacheSecurityGroupIngressRequest)
  }

  def createReplicationGroupAsTry(createReplicationGroupRequest: CreateReplicationGroupRequest): Try[ReplicationGroup] = Try {
    underlying.createReplicationGroup(createReplicationGroupRequest)
  }

  def removeTagsFromResourceAsTry(removeTagsFromResourceRequest: RemoveTagsFromResourceRequest): Try[RemoveTagsFromResourceResult] = Try{
    underlying.removeTagsFromResource(removeTagsFromResourceRequest)
  }

  def createCacheClusterAsTry(createCacheClusterRequest: CreateCacheClusterRequest): Try[CacheCluster] = Try {
    underlying.createCacheCluster(createCacheClusterRequest)
  }

  def describeCacheEngineVersionsAsTry(describeCacheEngineVersionsRequest: DescribeCacheEngineVersionsRequest): Try[DescribeCacheEngineVersionsResult] = Try{
    underlying.describeCacheEngineVersions(describeCacheEngineVersionsRequest)
  }

  def modifyCacheSubnetGroupAsTry(modifyCacheSubnetGroupRequest: ModifyCacheSubnetGroupRequest): Try[CacheSubnetGroup] = Try{
    underlying.modifyCacheSubnetGroup(modifyCacheSubnetGroupRequest)
  }

  def deleteCacheParameterGroupAsTry(deleteCacheParameterGroupRequest: DeleteCacheParameterGroupRequest): Try[Unit] = Try{
    underlying.deleteCacheParameterGroup(deleteCacheParameterGroupRequest)
  }

  def createSnapshotAsTry(createSnapshotRequest: CreateSnapshotRequest): Try[Snapshot] = Try{
    underlying.createSnapshot(createSnapshotRequest)
  }

  def describeEventsAsTry(describeEventsRequest: DescribeEventsRequest): Try[DescribeEventsResult] = Try{
    underlying.describeEvents(describeEventsRequest)
  }

  def authorizeCacheSecurityGroupIngressAsTry(authorizeCacheSecurityGroupIngressRequest: AuthorizeCacheSecurityGroupIngressRequest): Try[CacheSecurityGroup] = Try {
    underlying.authorizeCacheSecurityGroupIngress(authorizeCacheSecurityGroupIngressRequest)
  }

  def purchaseReservedCacheNodesOfferingAsTry(purchaseReservedCacheNodesOfferingRequest: PurchaseReservedCacheNodesOfferingRequest): Try[ReservedCacheNode] = Try {
    underlying.purchaseReservedCacheNodesOffering(purchaseReservedCacheNodesOfferingRequest)
  }

  def modifyReplicationGroupAsTry(modifyReplicationGroupRequest: ModifyReplicationGroupRequest): Try[ReplicationGroup] = Try {
    underlying.modifyReplicationGroup(modifyReplicationGroupRequest)
  }

  def describeReplicationGroupsAsTry(describeReplicationGroupsRequest: DescribeReplicationGroupsRequest): Try[DescribeReplicationGroupsResult] = Try{
    underlying.describeReplicationGroups(describeReplicationGroupsRequest)
  }

  def modifyCacheParameterGroupAsTry(modifyCacheParameterGroupRequest: ModifyCacheParameterGroupRequest): Try[ModifyCacheParameterGroupResult] = Try {
    underlying.modifyCacheParameterGroup(modifyCacheParameterGroupRequest)
  }

  def describeReservedCacheNodesOfferingsAsTry(describeReservedCacheNodesOfferingsRequest: DescribeReservedCacheNodesOfferingsRequest): Try[DescribeReservedCacheNodesOfferingsResult] = Try {
    underlying.describeReservedCacheNodesOfferings(describeReservedCacheNodesOfferingsRequest)
  }

  def modifyCacheClusterAsTry(modifyCacheClusterRequest: ModifyCacheClusterRequest): Try[CacheCluster] = Try {
    underlying.modifyCacheCluster(modifyCacheClusterRequest)
  }

  def resetCacheParameterGroupAsTry(resetCacheParameterGroupRequest: ResetCacheParameterGroupRequest): Try[ResetCacheParameterGroupResult] = Try {
    underlying.resetCacheParameterGroup(resetCacheParameterGroupRequest)
  }

  def describeCacheClustersAsTry(describeCacheClustersRequest: DescribeCacheClustersRequest): Try[DescribeCacheClustersResult] = Try {
    underlying.describeCacheClusters(describeCacheClustersRequest)
  }

  def createCacheSecurityGroupAsTry(createCacheSecurityGroupRequest: CreateCacheSecurityGroupRequest): Try[CacheSecurityGroup] = Try {
    underlying.createCacheSecurityGroup(createCacheSecurityGroupRequest)
  }

  def describeCacheSubnetGroupsAsTry(describeCacheSubnetGroupsRequest: DescribeCacheSubnetGroupsRequest): Try[DescribeCacheSubnetGroupsResult] = Try {
    underlying.describeCacheSubnetGroups(describeCacheSubnetGroupsRequest)
  }

  def describeCacheParameterGroupsAsTry(describeCacheParameterGroupsRequest: DescribeCacheParameterGroupsRequest): Try[DescribeCacheParameterGroupsResult] = Try {
    underlying.describeCacheParameterGroups(describeCacheParameterGroupsRequest)
  }

  def rebootCacheClusterAsTry(rebootCacheClusterRequest: RebootCacheClusterRequest): Try[CacheCluster] = Try {
    underlying.rebootCacheCluster(rebootCacheClusterRequest)
  }

  def createCacheParameterGroupAsTry(createCacheParameterGroupRequest: CreateCacheParameterGroupRequest): Try[CacheParameterGroup] = Try {
    underlying.createCacheParameterGroup(createCacheParameterGroupRequest)
  }

  def describeReservedCacheNodesAsTry: Try[DescribeReservedCacheNodesResult] = Try {
    underlying.describeReservedCacheNodes()
  }

  def describeSnapshotsAsTry: Try[DescribeSnapshotsResult] = Try {
    underlying.describeSnapshots()
  }

  def describeCacheSecurityGroupsAsTry: Try[DescribeCacheSecurityGroupsResult] = Try {
    underlying.describeCacheSecurityGroups()
  }

  def describeCacheEngineVersionsAsTry: Try[DescribeCacheEngineVersionsResult] = Try {
    underlying.describeCacheEngineVersions()
  }

  def describeEventsAsTry: Try[DescribeEventsResult] = Try {
    underlying.describeEvents()
  }

  def describeReplicationGroupsAsTry: Try[DescribeReplicationGroupsResult] = Try {
    underlying.describeReplicationGroups()
  }

  def describeReservedCacheNodesOfferingsAsTry: Try[DescribeReservedCacheNodesOfferingsResult] = Try {
    underlying.describeReservedCacheNodesOfferings()
  }

  def describeCacheClustersAsTry: Try[DescribeCacheClustersResult] = Try {
    underlying.describeCacheClusters()
  }

  def describeCacheSubnetGroupsAsTry: Try[DescribeCacheSubnetGroupsResult] = Try {
    underlying.describeCacheSubnetGroups()
  }

  def describeCacheParameterGroupsAsTry: Try[DescribeCacheParameterGroupsResult] = Try {
    underlying.describeCacheParameterGroups()
  }

  def getCachedResponseMetadataAsTry(amazonWebServiceRequest: AmazonWebServiceRequest): Try[ResponseMetadata] = Try {
    underlying.getCachedResponseMetadata(amazonWebServiceRequest)
  }
}

/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the node pool.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the node pool.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   *
   * @return The config.
   */
  com.google.container.v1.NodeConfig getConfig();
  /**
   *
   *
   * <pre>
   * The node configuration of the pool.
   * </pre>
   *
   * <code>.google.container.v1.NodeConfig config = 2;</code>
   */
  com.google.container.v1.NodeConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The initial node count for the pool. You must ensure that your
   * Compute Engine [resource quota](https://cloud.google.com/compute/quotas)
   * is sufficient for this number of instances. You must also have available
   * firewall and routes quota.
   * </pre>
   *
   * <code>int32 initial_node_count = 3;</code>
   *
   * @return The initialNodeCount.
   */
  int getInitialNodeCount();

  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * NodePool's nodes should be located.
   *
   * If this value is unspecified during node pool creation, the
   * [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations)
   * value will be used, instead.
   *
   * Warning: changing node pool locations will result in nodes being added
   * and/or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @return A list containing the locations.
   */
  java.util.List<java.lang.String> getLocationsList();
  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * NodePool's nodes should be located.
   *
   * If this value is unspecified during node pool creation, the
   * [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations)
   * value will be used, instead.
   *
   * Warning: changing node pool locations will result in nodes being added
   * and/or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @return The count of locations.
   */
  int getLocationsCount();
  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * NodePool's nodes should be located.
   *
   * If this value is unspecified during node pool creation, the
   * [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations)
   * value will be used, instead.
   *
   * Warning: changing node pool locations will result in nodes being added
   * and/or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @param index The index of the element to return.
   * @return The locations at the given index.
   */
  java.lang.String getLocations(int index);
  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available) in which the
   * NodePool's nodes should be located.
   *
   * If this value is unspecified during node pool creation, the
   * [Cluster.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters#Cluster.FIELDS.locations)
   * value will be used, instead.
   *
   * Warning: changing node pool locations will result in nodes being added
   * and/or removed.
   * </pre>
   *
   * <code>repeated string locations = 13;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the locations at the given index.
   */
  com.google.protobuf.ByteString getLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * Networking configuration for this NodePool. If specified, it overrides the
   * cluster-level defaults.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig network_config = 14;</code>
   *
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   *
   *
   * <pre>
   * Networking configuration for this NodePool. If specified, it overrides the
   * cluster-level defaults.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig network_config = 14;</code>
   *
   * @return The networkConfig.
   */
  com.google.container.v1.NodeNetworkConfig getNetworkConfig();
  /**
   *
   *
   * <pre>
   * Networking configuration for this NodePool. If specified, it overrides the
   * cluster-level defaults.
   * </pre>
   *
   * <code>.google.container.v1.NodeNetworkConfig network_config = 14;</code>
   */
  com.google.container.v1.NodeNetworkConfigOrBuilder getNetworkConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 100;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 100;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The version of Kubernetes running on this NodePool's nodes. If unspecified,
   * it defaults as described
   * [here](https://cloud.google.com/kubernetes-engine/versioning#specifying_node_version).
   * </pre>
   *
   * <code>string version = 101;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version of Kubernetes running on this NodePool's nodes. If unspecified,
   * it defaults as described
   * [here](https://cloud.google.com/kubernetes-engine/versioning#specifying_node_version).
   * </pre>
   *
   * <code>string version = 101;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * During the node pool blue-green upgrade operation, the URLs contain both
   * blue and green resources.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   *
   * @return A list containing the instanceGroupUrls.
   */
  java.util.List<java.lang.String> getInstanceGroupUrlsList();
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * During the node pool blue-green upgrade operation, the URLs contain both
   * blue and green resources.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   *
   * @return The count of instanceGroupUrls.
   */
  int getInstanceGroupUrlsCount();
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * During the node pool blue-green upgrade operation, the URLs contain both
   * blue and green resources.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   *
   * @param index The index of the element to return.
   * @return The instanceGroupUrls at the given index.
   */
  java.lang.String getInstanceGroupUrls(int index);
  /**
   *
   *
   * <pre>
   * [Output only] The resource URLs of the [managed instance
   * groups](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances)
   * associated with this node pool.
   * During the node pool blue-green upgrade operation, the URLs contain both
   * blue and green resources.
   * </pre>
   *
   * <code>repeated string instance_group_urls = 102;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instanceGroupUrls at the given index.
   */
  com.google.protobuf.ByteString getInstanceGroupUrlsBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output only] The status of the nodes in this pool instance.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.Status status = 103;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output only] The status of the nodes in this pool instance.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.Status status = 103;</code>
   *
   * @return The status.
   */
  com.google.container.v1.NodePool.Status getStatus();

  /**
   *
   *
   * <pre>
   * [Output only] Deprecated. Use conditions instead.
   * Additional information about the current status of this
   * node pool instance, if available.
   * </pre>
   *
   * <code>string status_message = 104 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.NodePool.status_message is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3410
   * @return The statusMessage.
   */
  @java.lang.Deprecated
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output only] Deprecated. Use conditions instead.
   * Additional information about the current status of this
   * node pool instance, if available.
   * </pre>
   *
   * <code>string status_message = 104 [deprecated = true];</code>
   *
   * @deprecated google.container.v1.NodePool.status_message is deprecated. See
   *     google/container/v1/cluster_service.proto;l=3410
   * @return The bytes for statusMessage.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   *
   * @return Whether the autoscaling field is set.
   */
  boolean hasAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   *
   * @return The autoscaling.
   */
  com.google.container.v1.NodePoolAutoscaling getAutoscaling();
  /**
   *
   *
   * <pre>
   * Autoscaler configuration for this NodePool. Autoscaler is enabled
   * only if a valid configuration is present.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 4;</code>
   */
  com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   *
   * @return Whether the management field is set.
   */
  boolean hasManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   *
   * @return The management.
   */
  com.google.container.v1.NodeManagement getManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1.NodeManagement management = 5;</code>
   */
  com.google.container.v1.NodeManagementOrBuilder getManagementOrBuilder();

  /**
   *
   *
   * <pre>
   * The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>.google.container.v1.MaxPodsConstraint max_pods_constraint = 6;</code>
   *
   * @return Whether the maxPodsConstraint field is set.
   */
  boolean hasMaxPodsConstraint();
  /**
   *
   *
   * <pre>
   * The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>.google.container.v1.MaxPodsConstraint max_pods_constraint = 6;</code>
   *
   * @return The maxPodsConstraint.
   */
  com.google.container.v1.MaxPodsConstraint getMaxPodsConstraint();
  /**
   *
   *
   * <pre>
   * The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>.google.container.v1.MaxPodsConstraint max_pods_constraint = 6;</code>
   */
  com.google.container.v1.MaxPodsConstraintOrBuilder getMaxPodsConstraintOrBuilder();

  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition conditions = 105;</code>
   */
  java.util.List<com.google.container.v1.StatusCondition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition conditions = 105;</code>
   */
  com.google.container.v1.StatusCondition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition conditions = 105;</code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition conditions = 105;</code>
   */
  java.util.List<? extends com.google.container.v1.StatusConditionOrBuilder>
      getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Which conditions caused the current node pool state.
   * </pre>
   *
   * <code>repeated .google.container.v1.StatusCondition conditions = 105;</code>
   */
  com.google.container.v1.StatusConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output only] The pod CIDR block size per node in this node pool.
   * </pre>
   *
   * <code>int32 pod_ipv4_cidr_size = 7;</code>
   *
   * @return The podIpv4CidrSize.
   */
  int getPodIpv4CidrSize();

  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 107;</code>
   *
   * @return Whether the upgradeSettings field is set.
   */
  boolean hasUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 107;</code>
   *
   * @return The upgradeSettings.
   */
  com.google.container.v1.NodePool.UpgradeSettings getUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.UpgradeSettings upgrade_settings = 107;</code>
   */
  com.google.container.v1.NodePool.UpgradeSettingsOrBuilder getUpgradeSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the node placement policy.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.PlacementPolicy placement_policy = 108;</code>
   *
   * @return Whether the placementPolicy field is set.
   */
  boolean hasPlacementPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the node placement policy.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.PlacementPolicy placement_policy = 108;</code>
   *
   * @return The placementPolicy.
   */
  com.google.container.v1.NodePool.PlacementPolicy getPlacementPolicy();
  /**
   *
   *
   * <pre>
   * Specifies the node placement policy.
   * </pre>
   *
   * <code>.google.container.v1.NodePool.PlacementPolicy placement_policy = 108;</code>
   */
  com.google.container.v1.NodePool.PlacementPolicyOrBuilder getPlacementPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update info contains relevant information during
   * a node pool update.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePool.UpdateInfo update_info = 109 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateInfo field is set.
   */
  boolean hasUpdateInfo();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update info contains relevant information during
   * a node pool update.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePool.UpdateInfo update_info = 109 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateInfo.
   */
  com.google.container.v1.NodePool.UpdateInfo getUpdateInfo();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Update info contains relevant information during
   * a node pool update.
   * </pre>
   *
   * <code>
   * .google.container.v1.NodePool.UpdateInfo update_info = 109 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.container.v1.NodePool.UpdateInfoOrBuilder getUpdateInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of node pool
   * fields, and may be sent on update requests to ensure the client has an
   * up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 110;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of node pool
   * fields, and may be sent on update requests to ensure the client has an
   * up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 110;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Enable best effort provisioning for nodes
   * </pre>
   *
   * <code>.google.container.v1.BestEffortProvisioning best_effort_provisioning = 113;</code>
   *
   * @return Whether the bestEffortProvisioning field is set.
   */
  boolean hasBestEffortProvisioning();
  /**
   *
   *
   * <pre>
   * Enable best effort provisioning for nodes
   * </pre>
   *
   * <code>.google.container.v1.BestEffortProvisioning best_effort_provisioning = 113;</code>
   *
   * @return The bestEffortProvisioning.
   */
  com.google.container.v1.BestEffortProvisioning getBestEffortProvisioning();
  /**
   *
   *
   * <pre>
   * Enable best effort provisioning for nodes
   * </pre>
   *
   * <code>.google.container.v1.BestEffortProvisioning best_effort_provisioning = 113;</code>
   */
  com.google.container.v1.BestEffortProvisioningOrBuilder getBestEffortProvisioningOrBuilder();
}

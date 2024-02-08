/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1;

public interface SearchAllResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.SearchAllResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder, or an organization. The
   * search is limited to the resources within the `scope`. The caller must be
   * granted the
   * [`cloudasset.assets.searchAllResources`](https://cloud.google.com/asset-inventory/docs/access-control#required_permissions)
   * permission on the desired scope.
   *
   * The allowed values are:
   *
   * * projects/{PROJECT_ID} (e.g., "projects/foo-bar")
   * * projects/{PROJECT_NUMBER} (e.g., "projects/12345678")
   * * folders/{FOLDER_NUMBER} (e.g., "folders/1234567")
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. A scope can be a project, a folder, or an organization. The
   * search is limited to the resources within the `scope`. The caller must be
   * granted the
   * [`cloudasset.assets.searchAllResources`](https://cloud.google.com/asset-inventory/docs/access-control#required_permissions)
   * permission on the desired scope.
   *
   * The allowed values are:
   *
   * * projects/{PROJECT_ID} (e.g., "projects/foo-bar")
   * * projects/{PROJECT_NUMBER} (e.g., "projects/12345678")
   * * folders/{FOLDER_NUMBER} (e.g., "folders/1234567")
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The query statement. See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query)
   * for more information. If not specified or empty, it will search all the
   * resources within the specified `scope`.
   *
   * Examples:
   *
   * * `name:Important` to find Google Cloud resources whose name contains
   *   `Important` as a word.
   * * `name=Important` to find the Google Cloud resource whose name is exactly
   *   `Important`.
   * * `displayName:Impor*` to find Google Cloud resources whose display name
   *   contains `Impor` as a prefix of any word in the field.
   * * `location:us-west*` to find Google Cloud resources whose location
   *   contains both `us` and `west` as prefixes.
   * * `labels:prod` to find Google Cloud resources whose labels contain `prod`
   *   as a key or value.
   * * `labels.env:prod` to find Google Cloud resources that have a label `env`
   *   and its value is `prod`.
   * * `labels.env:*` to find Google Cloud resources that have a label `env`.
   * * `tagKeys:env` to find Google Cloud resources that have directly
   *   attached tags where the
   *   [`TagKey.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagKeys#resource:-tagkey)
   *   contains `env`.
   * * `tagValues:prod*` to find Google Cloud resources that have directly
   *   attached tags where the
   *   [`TagValue.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   contains a word prefixed by `prod`.
   * * `tagValueIds=tagValues/123` to find Google Cloud resources that have
   *   directly attached tags where the
   *   [`TagValue.name`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   is exactly `tagValues/123`.
   * * `effectiveTagKeys:env` to find Google Cloud resources that have
   *   directly attached or inherited tags where the
   *   [`TagKey.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagKeys#resource:-tagkey)
   *   contains `env`.
   * * `effectiveTagValues:prod*` to find Google Cloud resources that have
   *   directly attached or inherited tags where the
   *   [`TagValue.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   contains a word prefixed by `prod`.
   * * `effectiveTagValueIds=tagValues/123` to find Google Cloud resources that
   *    have directly attached or inherited tags where the
   *   [`TagValue.name`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   is exactly `tagValues/123`.
   * * `kmsKey:key` to find Google Cloud resources encrypted with a
   *   customer-managed encryption key whose name contains `key` as a word. This
   *   field is deprecated. Use the `kmsKeys` field to retrieve Cloud KMS
   *   key information.
   * * `kmsKeys:key` to find Google Cloud resources encrypted with
   *   customer-managed encryption keys whose name contains the word `key`.
   * * `relationships:instance-group-1` to find Google Cloud resources that have
   *   relationships with `instance-group-1` in the related resource name.
   * * `relationships:INSTANCE_TO_INSTANCEGROUP` to find Compute Engine
   *   instances that have relationships of type `INSTANCE_TO_INSTANCEGROUP`.
   * * `relationships.INSTANCE_TO_INSTANCEGROUP:instance-group-1` to find
   *   Compute Engine instances that have relationships with `instance-group-1`
   *   in the Compute Engine instance group resource name, for relationship type
   *   `INSTANCE_TO_INSTANCEGROUP`.
   * * `sccSecurityMarks.key=value` to find Cloud resources that are attached
   *   with security marks whose key is `key` and value is `value`.
   * * `sccSecurityMarks.key:*` to find Cloud resources that are attached with
   *   security marks whose key is `key`.
   * * `state:ACTIVE` to find Google Cloud resources whose state contains
   *   `ACTIVE` as a word.
   * * `NOT state:ACTIVE` to find Google Cloud resources whose state doesn't
   *   contain `ACTIVE` as a word.
   * * `createTime&lt;1609459200` to find Google Cloud resources that were created
   *   before `2021-01-01 00:00:00 UTC`. `1609459200` is the epoch timestamp of
   *   `2021-01-01 00:00:00 UTC` in seconds.
   * * `updateTime&gt;1609459200` to find Google Cloud resources that were updated
   *   after `2021-01-01 00:00:00 UTC`. `1609459200` is the epoch timestamp of
   *   `2021-01-01 00:00:00 UTC` in seconds.
   * * `Important` to find Google Cloud resources that contain `Important` as a
   *   word in any of the searchable fields.
   * * `Impor*` to find Google Cloud resources that contain `Impor` as a prefix
   *   of any word in any of the searchable fields.
   * * `Important location:(us-west1 OR global)` to find Google Cloud
   *   resources that contain `Important` as a word in any of the searchable
   *   fields and are also located in the `us-west1` region or the `global`
   *   location.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query statement. See [how to construct a
   * query](https://cloud.google.com/asset-inventory/docs/searching-resources#how_to_construct_a_query)
   * for more information. If not specified or empty, it will search all the
   * resources within the specified `scope`.
   *
   * Examples:
   *
   * * `name:Important` to find Google Cloud resources whose name contains
   *   `Important` as a word.
   * * `name=Important` to find the Google Cloud resource whose name is exactly
   *   `Important`.
   * * `displayName:Impor*` to find Google Cloud resources whose display name
   *   contains `Impor` as a prefix of any word in the field.
   * * `location:us-west*` to find Google Cloud resources whose location
   *   contains both `us` and `west` as prefixes.
   * * `labels:prod` to find Google Cloud resources whose labels contain `prod`
   *   as a key or value.
   * * `labels.env:prod` to find Google Cloud resources that have a label `env`
   *   and its value is `prod`.
   * * `labels.env:*` to find Google Cloud resources that have a label `env`.
   * * `tagKeys:env` to find Google Cloud resources that have directly
   *   attached tags where the
   *   [`TagKey.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagKeys#resource:-tagkey)
   *   contains `env`.
   * * `tagValues:prod*` to find Google Cloud resources that have directly
   *   attached tags where the
   *   [`TagValue.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   contains a word prefixed by `prod`.
   * * `tagValueIds=tagValues/123` to find Google Cloud resources that have
   *   directly attached tags where the
   *   [`TagValue.name`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   is exactly `tagValues/123`.
   * * `effectiveTagKeys:env` to find Google Cloud resources that have
   *   directly attached or inherited tags where the
   *   [`TagKey.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagKeys#resource:-tagkey)
   *   contains `env`.
   * * `effectiveTagValues:prod*` to find Google Cloud resources that have
   *   directly attached or inherited tags where the
   *   [`TagValue.namespacedName`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   contains a word prefixed by `prod`.
   * * `effectiveTagValueIds=tagValues/123` to find Google Cloud resources that
   *    have directly attached or inherited tags where the
   *   [`TagValue.name`](https://cloud.google.com/resource-manager/reference/rest/v3/tagValues#resource:-tagvalue)
   *   is exactly `tagValues/123`.
   * * `kmsKey:key` to find Google Cloud resources encrypted with a
   *   customer-managed encryption key whose name contains `key` as a word. This
   *   field is deprecated. Use the `kmsKeys` field to retrieve Cloud KMS
   *   key information.
   * * `kmsKeys:key` to find Google Cloud resources encrypted with
   *   customer-managed encryption keys whose name contains the word `key`.
   * * `relationships:instance-group-1` to find Google Cloud resources that have
   *   relationships with `instance-group-1` in the related resource name.
   * * `relationships:INSTANCE_TO_INSTANCEGROUP` to find Compute Engine
   *   instances that have relationships of type `INSTANCE_TO_INSTANCEGROUP`.
   * * `relationships.INSTANCE_TO_INSTANCEGROUP:instance-group-1` to find
   *   Compute Engine instances that have relationships with `instance-group-1`
   *   in the Compute Engine instance group resource name, for relationship type
   *   `INSTANCE_TO_INSTANCEGROUP`.
   * * `sccSecurityMarks.key=value` to find Cloud resources that are attached
   *   with security marks whose key is `key` and value is `value`.
   * * `sccSecurityMarks.key:*` to find Cloud resources that are attached with
   *   security marks whose key is `key`.
   * * `state:ACTIVE` to find Google Cloud resources whose state contains
   *   `ACTIVE` as a word.
   * * `NOT state:ACTIVE` to find Google Cloud resources whose state doesn't
   *   contain `ACTIVE` as a word.
   * * `createTime&lt;1609459200` to find Google Cloud resources that were created
   *   before `2021-01-01 00:00:00 UTC`. `1609459200` is the epoch timestamp of
   *   `2021-01-01 00:00:00 UTC` in seconds.
   * * `updateTime&gt;1609459200` to find Google Cloud resources that were updated
   *   after `2021-01-01 00:00:00 UTC`. `1609459200` is the epoch timestamp of
   *   `2021-01-01 00:00:00 UTC` in seconds.
   * * `Important` to find Google Cloud resources that contain `Important` as a
   *   word in any of the searchable fields.
   * * `Impor*` to find Google Cloud resources that contain `Impor` as a prefix
   *   of any word in any of the searchable fields.
   * * `Important location:(us-west1 OR global)` to find Google Cloud
   *   resources that contain `Important` as a word in any of the searchable
   *   fields and are also located in the `us-west1` region or the `global`
   *   location.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the asset types [supported by search
   * APIs](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   *
   * Regular expressions are also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the assetTypes.
   */
  java.util.List<java.lang.String> getAssetTypesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the asset types [supported by search
   * APIs](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   *
   * Regular expressions are also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of assetTypes.
   */
  int getAssetTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the asset types [supported by search
   * APIs](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   *
   * Regular expressions are also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The assetTypes at the given index.
   */
  java.lang.String getAssetTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of asset types that this request searches for. If empty,
   * it will search all the asset types [supported by search
   * APIs](https://cloud.google.com/asset-inventory/docs/supported-asset-types).
   *
   * Regular expressions are also supported. For example:
   *
   * * "compute.googleapis.com.*" snapshots resources whose asset type starts
   * with "compute.googleapis.com".
   * * ".*Instance" snapshots resources whose asset type ends with "Instance".
   * * ".*Instance.*" snapshots resources whose asset type contains "Instance".
   *
   * See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported
   * regular expression syntax. If the regular expression does not match any
   * supported asset type, an INVALID_ARGUMENT error will be returned.
   * </pre>
   *
   * <code>repeated string asset_types = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetTypes at the given index.
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The page size for search result pagination. Page size is capped
   * at 500 even if a larger value is given. If set to zero or a negative value,
   * server will pick an appropriate default. Returned results may be fewer than
   * requested. When this happens, there could be more results as long as
   * `next_page_token` is returned.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `page_token` must be the value of
   * `next_page_token` from the previous response. The values of all other
   * method parameters, must be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add " DESC" after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * Example: "location DESC, name".
   * Only the following fields in the response are sortable:
   *
   *   * name
   *   * assetType
   *   * project
   *   * displayName
   *   * description
   *   * location
   *   * createTime
   *   * updateTime
   *   * state
   *   * parentFullResourceName
   *   * parentAssetType
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields specifying the sorting order of
   * the results. The default order is ascending. Add " DESC" after the field
   * name to indicate descending order. Redundant space characters are ignored.
   * Example: "location DESC, name".
   * Only the following fields in the response are sortable:
   *
   *   * name
   *   * assetType
   *   * project
   *   * displayName
   *   * description
   *   * location
   *   * createTime
   *   * updateTime
   *   * state
   *   * parentFullResourceName
   *   * parentAssetType
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields that you want returned in the
   * results. The following fields are returned by default if not specified:
   *
   *   * `name`
   *   * `assetType`
   *   * `project`
   *   * `folders`
   *   * `organization`
   *   * `displayName`
   *   * `description`
   *   * `location`
   *   * `labels`
   *   * `tags`
   *   * `effectiveTags`
   *   * `networkTags`
   *   * `kmsKeys`
   *   * `createTime`
   *   * `updateTime`
   *   * `state`
   *   * `additionalAttributes`
   *   * `parentFullResourceName`
   *   * `parentAssetType`
   *
   * Some fields of large size, such as `versionedResources`,
   * `attachedResources`, `effectiveTags` etc., are not returned by default, but
   * you can specify them in the `read_mask` parameter if you want to include
   * them. If `"*"` is specified, all [available
   * fields](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources#resourcesearchresult)
   * are returned.
   * Examples: `"name,location"`, `"name,versionedResources"`, `"*"`.
   * Any invalid field path will trigger INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields that you want returned in the
   * results. The following fields are returned by default if not specified:
   *
   *   * `name`
   *   * `assetType`
   *   * `project`
   *   * `folders`
   *   * `organization`
   *   * `displayName`
   *   * `description`
   *   * `location`
   *   * `labels`
   *   * `tags`
   *   * `effectiveTags`
   *   * `networkTags`
   *   * `kmsKeys`
   *   * `createTime`
   *   * `updateTime`
   *   * `state`
   *   * `additionalAttributes`
   *   * `parentFullResourceName`
   *   * `parentAssetType`
   *
   * Some fields of large size, such as `versionedResources`,
   * `attachedResources`, `effectiveTags` etc., are not returned by default, but
   * you can specify them in the `read_mask` parameter if you want to include
   * them. If `"*"` is specified, all [available
   * fields](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources#resourcesearchresult)
   * are returned.
   * Examples: `"name,location"`, `"name,versionedResources"`, `"*"`.
   * Any invalid field path will trigger INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields that you want returned in the
   * results. The following fields are returned by default if not specified:
   *
   *   * `name`
   *   * `assetType`
   *   * `project`
   *   * `folders`
   *   * `organization`
   *   * `displayName`
   *   * `description`
   *   * `location`
   *   * `labels`
   *   * `tags`
   *   * `effectiveTags`
   *   * `networkTags`
   *   * `kmsKeys`
   *   * `createTime`
   *   * `updateTime`
   *   * `state`
   *   * `additionalAttributes`
   *   * `parentFullResourceName`
   *   * `parentAssetType`
   *
   * Some fields of large size, such as `versionedResources`,
   * `attachedResources`, `effectiveTags` etc., are not returned by default, but
   * you can specify them in the `read_mask` parameter if you want to include
   * them. If `"*"` is specified, all [available
   * fields](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources#resourcesearchresult)
   * are returned.
   * Examples: `"name,location"`, `"name,versionedResources"`, `"*"`.
   * Any invalid field path will trigger INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}

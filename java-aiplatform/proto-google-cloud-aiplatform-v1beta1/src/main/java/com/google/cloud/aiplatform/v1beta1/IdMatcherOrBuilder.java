/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/feature_selector.proto

package com.google.cloud.aiplatform.v1beta1;

public interface IdMatcherOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.IdMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String> getIdsList();
  /**
   *
   *
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   *
   *
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   *
   *
   * <pre>
   * Required. The following are accepted as `ids`:
   *  * A single-element list containing only `*`, which selects all Features
   *  in the target EntityType, or
   *  * A list containing only Feature IDs, which selects only Features with
   *  those IDs in the target EntityType.
   * </pre>
   *
   * <code>repeated string ids = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString getIdsBytes(int index);
}
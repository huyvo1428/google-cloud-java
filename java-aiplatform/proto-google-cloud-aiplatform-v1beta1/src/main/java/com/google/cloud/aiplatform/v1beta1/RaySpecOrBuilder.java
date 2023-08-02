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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

package com.google.cloud.aiplatform.v1beta1;

public interface RaySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RaySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework(e.g.
   * tensorflow or Pytorch) by choosing from Vertex prebuild
   * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image, Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework(e.g.
   * tensorflow or Pytorch) by choosing from Vertex prebuild
   * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image, Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();
}

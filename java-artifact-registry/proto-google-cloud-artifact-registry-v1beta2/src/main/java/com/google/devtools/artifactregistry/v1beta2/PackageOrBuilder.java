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
// source: google/devtools/artifactregistry/v1beta2/package.proto

package com.google.devtools.artifactregistry.v1beta2;

public interface PackageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.Package)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the package, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1".
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
   * The name of the package, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1".
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
   * The display name of the package.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the package.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The time when the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time when the package was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the package was last updated. This includes publishing a new
   * version of the package.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the package was last updated. This includes publishing a new
   * version of the package.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the package was last updated. This includes publishing a new
   * version of the package.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}

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
// source: google/api/servicecontrol/v2/service_controller.proto

package com.google.api.servicecontrol.v2;

public interface CheckResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v2.CheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Operation is allowed when this field is not set. Any non-'OK' status
   * indicates a denial; [google.rpc.Status.details][google.rpc.Status.details]
   * would contain additional details about the denial.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Operation is allowed when this field is not set. Any non-'OK' status
   * indicates a denial; [google.rpc.Status.details][google.rpc.Status.details]
   * would contain additional details about the denial.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Operation is allowed when this field is not set. Any non-'OK' status
   * indicates a denial; [google.rpc.Status.details][google.rpc.Status.details]
   * would contain additional details about the denial.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Returns a set of request contexts generated from the `CheckRequest`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * Returns a set of request contexts generated from the `CheckRequest`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  boolean containsHeaders(java.lang.String key);
  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();
  /**
   *
   *
   * <pre>
   * Returns a set of request contexts generated from the `CheckRequest`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();
  /**
   *
   *
   * <pre>
   * Returns a set of request contexts generated from the `CheckRequest`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  /* nullable */
  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Returns a set of request contexts generated from the `CheckRequest`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2;</code>
   */
  java.lang.String getHeadersOrThrow(java.lang.String key);
}

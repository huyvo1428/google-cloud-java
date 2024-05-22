/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/sbom.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

public interface SbomReferenceIntotoPredicateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.SbomReferenceIntotoPredicate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The person or system referring this predicate to the consumer.
   * </pre>
   *
   * <code>string referrer_id = 1;</code>
   *
   * @return The referrerId.
   */
  java.lang.String getReferrerId();
  /**
   *
   *
   * <pre>
   * The person or system referring this predicate to the consumer.
   * </pre>
   *
   * <code>string referrer_id = 1;</code>
   *
   * @return The bytes for referrerId.
   */
  com.google.protobuf.ByteString getReferrerIdBytes();

  /**
   *
   *
   * <pre>
   * The location of the SBOM.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location of the SBOM.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * The mime type of the SBOM.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * The mime type of the SBOM.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * A map of algorithm to digest of the contents of the SBOM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 4;</code>
   */
  int getDigestCount();
  /**
   *
   *
   * <pre>
   * A map of algorithm to digest of the contents of the SBOM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 4;</code>
   */
  boolean containsDigest(java.lang.String key);
  /** Use {@link #getDigestMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDigest();
  /**
   *
   *
   * <pre>
   * A map of algorithm to digest of the contents of the SBOM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDigestMap();
  /**
   *
   *
   * <pre>
   * A map of algorithm to digest of the contents of the SBOM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 4;</code>
   */
  /* nullable */
  java.lang.String getDigestOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map of algorithm to digest of the contents of the SBOM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 4;</code>
   */
  java.lang.String getDigestOrThrow(java.lang.String key);
}

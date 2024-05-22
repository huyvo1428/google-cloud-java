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
// source: grafeas/v1/provenance.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

public interface SourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If provided, the input binary artifacts for the build came from this
   * location.
   * </pre>
   *
   * <code>string artifact_storage_source_uri = 1;</code>
   *
   * @return The artifactStorageSourceUri.
   */
  java.lang.String getArtifactStorageSourceUri();
  /**
   *
   *
   * <pre>
   * If provided, the input binary artifacts for the build came from this
   * location.
   * </pre>
   *
   * <code>string artifact_storage_source_uri = 1;</code>
   *
   * @return The bytes for artifactStorageSourceUri.
   */
  com.google.protobuf.ByteString getArtifactStorageSourceUriBytes();

  /**
   *
   *
   * <pre>
   * Hash(es) of the build source, which can be used to verify that the original
   * source integrity was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile
   * (.tar.gz), the FileHash will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.FileHashes&gt; file_hashes = 2;</code>
   */
  int getFileHashesCount();
  /**
   *
   *
   * <pre>
   * Hash(es) of the build source, which can be used to verify that the original
   * source integrity was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile
   * (.tar.gz), the FileHash will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.FileHashes&gt; file_hashes = 2;</code>
   */
  boolean containsFileHashes(java.lang.String key);
  /** Use {@link #getFileHashesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.grafeas.v1.FileHashes> getFileHashes();
  /**
   *
   *
   * <pre>
   * Hash(es) of the build source, which can be used to verify that the original
   * source integrity was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile
   * (.tar.gz), the FileHash will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.FileHashes&gt; file_hashes = 2;</code>
   */
  java.util.Map<java.lang.String, io.grafeas.v1.FileHashes> getFileHashesMap();
  /**
   *
   *
   * <pre>
   * Hash(es) of the build source, which can be used to verify that the original
   * source integrity was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile
   * (.tar.gz), the FileHash will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.FileHashes&gt; file_hashes = 2;</code>
   */
  /* nullable */
  io.grafeas.v1.FileHashes getFileHashesOrDefault(
      java.lang.String key,
      /* nullable */
      io.grafeas.v1.FileHashes defaultValue);
  /**
   *
   *
   * <pre>
   * Hash(es) of the build source, which can be used to verify that the original
   * source integrity was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values
   * contain the hash values for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile
   * (.tar.gz), the FileHash will be for the single path to that file.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1.FileHashes&gt; file_hashes = 2;</code>
   */
  io.grafeas.v1.FileHashes getFileHashesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * If provided, the source code used for the build came from this location.
   * </pre>
   *
   * <code>.grafeas.v1.SourceContext context = 3;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * If provided, the source code used for the build came from this location.
   * </pre>
   *
   * <code>.grafeas.v1.SourceContext context = 3;</code>
   *
   * @return The context.
   */
  io.grafeas.v1.SourceContext getContext();
  /**
   *
   *
   * <pre>
   * If provided, the source code used for the build came from this location.
   * </pre>
   *
   * <code>.grafeas.v1.SourceContext context = 3;</code>
   */
  io.grafeas.v1.SourceContextOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * If provided, some of the source code used for the build may be found in
   * these locations, in the case where the source repository had multiple
   * remotes or submodules. This list will not include the context specified in
   * the context field.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SourceContext additional_contexts = 4;</code>
   */
  java.util.List<io.grafeas.v1.SourceContext> getAdditionalContextsList();
  /**
   *
   *
   * <pre>
   * If provided, some of the source code used for the build may be found in
   * these locations, in the case where the source repository had multiple
   * remotes or submodules. This list will not include the context specified in
   * the context field.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SourceContext additional_contexts = 4;</code>
   */
  io.grafeas.v1.SourceContext getAdditionalContexts(int index);
  /**
   *
   *
   * <pre>
   * If provided, some of the source code used for the build may be found in
   * these locations, in the case where the source repository had multiple
   * remotes or submodules. This list will not include the context specified in
   * the context field.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SourceContext additional_contexts = 4;</code>
   */
  int getAdditionalContextsCount();
  /**
   *
   *
   * <pre>
   * If provided, some of the source code used for the build may be found in
   * these locations, in the case where the source repository had multiple
   * remotes or submodules. This list will not include the context specified in
   * the context field.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SourceContext additional_contexts = 4;</code>
   */
  java.util.List<? extends io.grafeas.v1.SourceContextOrBuilder>
      getAdditionalContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * If provided, some of the source code used for the build may be found in
   * these locations, in the case where the source repository had multiple
   * remotes or submodules. This list will not include the context specified in
   * the context field.
   * </pre>
   *
   * <code>repeated .grafeas.v1.SourceContext additional_contexts = 4;</code>
   */
  io.grafeas.v1.SourceContextOrBuilder getAdditionalContextsOrBuilder(int index);
}

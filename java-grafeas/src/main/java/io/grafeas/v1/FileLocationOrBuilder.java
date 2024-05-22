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
// source: grafeas/v1/common.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

public interface FileLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.FileLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For jars that are contained inside .war files, this filepath
   * can indicate the path to war file combined with the path to jar file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   *
   *
   * <pre>
   * For jars that are contained inside .war files, this filepath
   * can indicate the path to war file combined with the path to jar file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   *
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString getFilePathBytes();
}

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
// source: grafeas/v1/package.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

public interface PackageOccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.PackageOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the installed package.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the installed package.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  java.util.List<io.grafeas.v1.Location> getLocationList();
  /**
   *
   *
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  io.grafeas.v1.Location getLocation(int index);
  /**
   *
   *
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  int getLocationCount();
  /**
   *
   *
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  java.util.List<? extends io.grafeas.v1.LocationOrBuilder> getLocationOrBuilderList();
  /**
   *
   *
   * <pre>
   * All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  io.grafeas.v1.LocationOrBuilder getLocationOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The type of package; whether native or non native (e.g., ruby gems,
   * node.js packages, etc.).
   * </pre>
   *
   * <code>string package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The packageType.
   */
  java.lang.String getPackageType();
  /**
   *
   *
   * <pre>
   * The type of package; whether native or non native (e.g., ruby gems,
   * node.js packages, etc.).
   * </pre>
   *
   * <code>string package_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for packageType.
   */
  com.google.protobuf.ByteString getPackageTypeBytes();

  /**
   *
   *
   * <pre>
   * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * The cpe_uri will be blank for language packages.
   * </pre>
   *
   * <code>string cpe_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The cpeUri.
   */
  java.lang.String getCpeUri();
  /**
   *
   *
   * <pre>
   * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/)
   * denoting the package manager version distributing a package.
   * The cpe_uri will be blank for language packages.
   * </pre>
   *
   * <code>string cpe_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for cpeUri.
   */
  com.google.protobuf.ByteString getCpeUriBytes();

  /**
   *
   *
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built. Architecture will be blank for language packages.
   * </pre>
   *
   * <code>.grafeas.v1.Architecture architecture = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for architecture.
   */
  int getArchitectureValue();
  /**
   *
   *
   * <pre>
   * The CPU architecture for which packages in this distribution channel were
   * built. Architecture will be blank for language packages.
   * </pre>
   *
   * <code>.grafeas.v1.Architecture architecture = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The architecture.
   */
  io.grafeas.v1.Architecture getArchitecture();

  /**
   *
   *
   * <pre>
   * Licenses that have been declared by the authors of the package.
   * </pre>
   *
   * <code>.grafeas.v1.License license = 6;</code>
   *
   * @return Whether the license field is set.
   */
  boolean hasLicense();
  /**
   *
   *
   * <pre>
   * Licenses that have been declared by the authors of the package.
   * </pre>
   *
   * <code>.grafeas.v1.License license = 6;</code>
   *
   * @return The license.
   */
  io.grafeas.v1.License getLicense();
  /**
   *
   *
   * <pre>
   * Licenses that have been declared by the authors of the package.
   * </pre>
   *
   * <code>.grafeas.v1.License license = 6;</code>
   */
  io.grafeas.v1.LicenseOrBuilder getLicenseOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the package.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * The version of the package.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The version.
   */
  io.grafeas.v1.Version getVersion();
  /**
   *
   *
   * <pre>
   * The version of the package.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  io.grafeas.v1.VersionOrBuilder getVersionOrBuilder();
}

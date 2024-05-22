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

public final class Package {
  private Package() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_Distribution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_Distribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_PackageNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_PackageNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_PackageOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_PackageOccurrence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030grafeas/v1/package.proto\022\ngrafeas.v1\032\037"
          + "google/api/field_behavior.proto\032\027grafeas"
          + "/v1/common.proto\"\267\001\n\014Distribution\022\024\n\007cpe"
          + "_uri\030\001 \001(\tB\003\340A\002\022.\n\014architecture\030\002 \001(\0162\030."
          + "grafeas.v1.Architecture\022+\n\016latest_versio"
          + "n\030\003 \001(\0132\023.grafeas.v1.Version\022\022\n\nmaintain"
          + "er\030\004 \001(\t\022\013\n\003url\030\005 \001(\t\022\023\n\013description\030\006 \001"
          + "(\t\"O\n\010Location\022\017\n\007cpe_uri\030\001 \001(\t\022$\n\007versi"
          + "on\030\002 \001(\0132\023.grafeas.v1.Version\022\014\n\004path\030\003 "
          + "\001(\t\"\320\002\n\013PackageNote\022\024\n\004name\030\001 \001(\tB\006\340A\002\340A"
          + "\005\022.\n\014distribution\030\n \003(\0132\030.grafeas.v1.Dis"
          + "tribution\022\024\n\014package_type\030\013 \001(\t\022\017\n\007cpe_u"
          + "ri\030\014 \001(\t\022.\n\014architecture\030\r \001(\0162\030.grafeas"
          + ".v1.Architecture\022$\n\007version\030\016 \001(\0132\023.graf"
          + "eas.v1.Version\022\022\n\nmaintainer\030\017 \001(\t\022\013\n\003ur"
          + "l\030\020 \001(\t\022\023\n\013description\030\021 \001(\t\022$\n\007license\030"
          + "\022 \001(\0132\023.grafeas.v1.License\022\"\n\006digest\030\023 \003"
          + "(\0132\022.grafeas.v1.Digest\"\210\002\n\021PackageOccurr"
          + "ence\022\024\n\004name\030\001 \001(\tB\006\340A\002\340A\003\022&\n\010location\030\002"
          + " \003(\0132\024.grafeas.v1.Location\022\031\n\014package_ty"
          + "pe\030\003 \001(\tB\003\340A\003\022\024\n\007cpe_uri\030\004 \001(\tB\003\340A\003\0223\n\014a"
          + "rchitecture\030\005 \001(\0162\030.grafeas.v1.Architect"
          + "ureB\003\340A\003\022$\n\007license\030\006 \001(\0132\023.grafeas.v1.L"
          + "icense\022)\n\007version\030\007 \001(\0132\023.grafeas.v1.Ver"
          + "sionB\003\340A\003\"\340\001\n\007Version\022\r\n\005epoch\030\001 \001(\005\022\014\n\004"
          + "name\030\002 \001(\t\022\020\n\010revision\030\003 \001(\t\022\021\n\tinclusiv"
          + "e\030\006 \001(\010\022-\n\004kind\030\004 \001(\0162\037.grafeas.v1.Versi"
          + "on.VersionKind\022\021\n\tfull_name\030\005 \001(\t\"Q\n\013Ver"
          + "sionKind\022\034\n\030VERSION_KIND_UNSPECIFIED\020\000\022\n"
          + "\n\006NORMAL\020\001\022\013\n\007MINIMUM\020\002\022\013\n\007MAXIMUM\020\003*>\n\014"
          + "Architecture\022\034\n\030ARCHITECTURE_UNSPECIFIED"
          + "\020\000\022\007\n\003X86\020\001\022\007\n\003X64\020\002BQ\n\rio.grafeas.v1P\001Z"
          + "8google.golang.org/genproto/googleapis/g"
          + "rafeas/v1;grafeas\242\002\003GRAb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              io.grafeas.v1.Common.getDescriptor(),
            });
    internal_static_grafeas_v1_Distribution_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_Distribution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_Distribution_descriptor,
            new java.lang.String[] {
              "CpeUri", "Architecture", "LatestVersion", "Maintainer", "Url", "Description",
            });
    internal_static_grafeas_v1_Location_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_Location_descriptor,
            new java.lang.String[] {
              "CpeUri", "Version", "Path",
            });
    internal_static_grafeas_v1_PackageNote_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1_PackageNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_PackageNote_descriptor,
            new java.lang.String[] {
              "Name",
              "Distribution",
              "PackageType",
              "CpeUri",
              "Architecture",
              "Version",
              "Maintainer",
              "Url",
              "Description",
              "License",
              "Digest",
            });
    internal_static_grafeas_v1_PackageOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1_PackageOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_PackageOccurrence_descriptor,
            new java.lang.String[] {
              "Name", "Location", "PackageType", "CpeUri", "Architecture", "License", "Version",
            });
    internal_static_grafeas_v1_Version_descriptor = getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_Version_descriptor,
            new java.lang.String[] {
              "Epoch", "Name", "Revision", "Inclusive", "Kind", "FullName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    io.grafeas.v1.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

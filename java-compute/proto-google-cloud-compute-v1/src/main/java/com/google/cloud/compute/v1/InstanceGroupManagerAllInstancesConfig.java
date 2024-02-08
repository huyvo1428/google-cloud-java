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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig}
 */
public final class InstanceGroupManagerAllInstancesConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)
    InstanceGroupManagerAllInstancesConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerAllInstancesConfig.newBuilder() to construct.
  private InstanceGroupManagerAllInstancesConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerAllInstancesConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerAllInstancesConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerAllInstancesConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerAllInstancesConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig.class,
            com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig.Builder.class);
  }

  private int bitField0_;
  public static final int PROPERTIES_FIELD_NUMBER = 147688755;
  private com.google.cloud.compute.v1.InstancePropertiesPatch properties_;
  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   *
   * @return Whether the properties field is set.
   */
  @java.lang.Override
  public boolean hasProperties() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   *
   * @return The properties.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstancePropertiesPatch getProperties() {
    return properties_ == null
        ? com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance()
        : properties_;
  }
  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder getPropertiesOrBuilder() {
    return properties_ == null
        ? com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance()
        : properties_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(147688755, getProperties());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(147688755, getProperties());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig other =
        (com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig) obj;

    if (hasProperties() != other.hasProperties()) return false;
    if (hasProperties()) {
      if (!getProperties().equals(other.getProperties())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProperties()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getProperties().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)
      com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAllInstancesConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAllInstancesConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig.class,
              com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPropertiesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      properties_ = null;
      if (propertiesBuilder_ != null) {
        propertiesBuilder_.dispose();
        propertiesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAllInstancesConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig build() {
      com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig result =
          new com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.properties_ = propertiesBuilder_ == null ? properties_ : propertiesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
              .getDefaultInstance()) return this;
      if (other.hasProperties()) {
        mergeProperties(other.getProperties());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 1181510042:
              {
                input.readMessage(getPropertiesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 1181510042
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.compute.v1.InstancePropertiesPatch properties_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstancePropertiesPatch,
            com.google.cloud.compute.v1.InstancePropertiesPatch.Builder,
            com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder>
        propertiesBuilder_;
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     *
     * @return Whether the properties field is set.
     */
    public boolean hasProperties() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     *
     * @return The properties.
     */
    public com.google.cloud.compute.v1.InstancePropertiesPatch getProperties() {
      if (propertiesBuilder_ == null) {
        return properties_ == null
            ? com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance()
            : properties_;
      } else {
        return propertiesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public Builder setProperties(com.google.cloud.compute.v1.InstancePropertiesPatch value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        properties_ = value;
      } else {
        propertiesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public Builder setProperties(
        com.google.cloud.compute.v1.InstancePropertiesPatch.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        properties_ = builderForValue.build();
      } else {
        propertiesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public Builder mergeProperties(com.google.cloud.compute.v1.InstancePropertiesPatch value) {
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && properties_ != null
            && properties_
                != com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance()) {
          getPropertiesBuilder().mergeFrom(value);
        } else {
          properties_ = value;
        }
      } else {
        propertiesBuilder_.mergeFrom(value);
      }
      if (properties_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public Builder clearProperties() {
      bitField0_ = (bitField0_ & ~0x00000001);
      properties_ = null;
      if (propertiesBuilder_ != null) {
        propertiesBuilder_.dispose();
        propertiesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public com.google.cloud.compute.v1.InstancePropertiesPatch.Builder getPropertiesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPropertiesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    public com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder getPropertiesOrBuilder() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilder();
      } else {
        return properties_ == null
            ? com.google.cloud.compute.v1.InstancePropertiesPatch.getDefaultInstance()
            : properties_;
      }
    }
    /**
     *
     *
     * <pre>
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.InstancePropertiesPatch,
            com.google.cloud.compute.v1.InstancePropertiesPatch.Builder,
            com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder>
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.InstancePropertiesPatch,
                com.google.cloud.compute.v1.InstancePropertiesPatch.Builder,
                com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder>(
                getProperties(), getParentForChildren(), isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerAllInstancesConfig> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupManagerAllInstancesConfig>() {
        @java.lang.Override
        public InstanceGroupManagerAllInstancesConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<InstanceGroupManagerAllInstancesConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerAllInstancesConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

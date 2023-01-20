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
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

/**
 *
 *
 * <pre>
 * A network endpoint over which a TPU worker can be reached.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.NetworkEndpoint}
 */
public final class NetworkEndpoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.NetworkEndpoint)
    NetworkEndpointOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkEndpoint.newBuilder() to construct.
  private NetworkEndpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkEndpoint() {
    ipAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkEndpoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_NetworkEndpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto
        .internal_static_google_cloud_tpu_v2_NetworkEndpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.NetworkEndpoint.class,
            com.google.cloud.tpu.v2.NetworkEndpoint.Builder.class);
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAddress_ = "";
  /**
   *
   *
   * <pre>
   * The internal IP address of this network endpoint.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The internal IP address of this network endpoint.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_ = 0;
  /**
   *
   *
   * <pre>
   * The port of this network endpoint.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   *
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int ACCESS_CONFIG_FIELD_NUMBER = 5;
  private com.google.cloud.tpu.v2.AccessConfig accessConfig_;
  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
   *
   * @return Whether the accessConfig field is set.
   */
  @java.lang.Override
  public boolean hasAccessConfig() {
    return accessConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
   *
   * @return The accessConfig.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.AccessConfig getAccessConfig() {
    return accessConfig_ == null
        ? com.google.cloud.tpu.v2.AccessConfig.getDefaultInstance()
        : accessConfig_;
  }
  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2.AccessConfigOrBuilder getAccessConfigOrBuilder() {
    return accessConfig_ == null
        ? com.google.cloud.tpu.v2.AccessConfig.getDefaultInstance()
        : accessConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipAddress_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (accessConfig_ != null) {
      output.writeMessage(5, getAccessConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ipAddress_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, port_);
    }
    if (accessConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getAccessConfig());
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
    if (!(obj instanceof com.google.cloud.tpu.v2.NetworkEndpoint)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.NetworkEndpoint other = (com.google.cloud.tpu.v2.NetworkEndpoint) obj;

    if (!getIpAddress().equals(other.getIpAddress())) return false;
    if (getPort() != other.getPort()) return false;
    if (hasAccessConfig() != other.hasAccessConfig()) return false;
    if (hasAccessConfig()) {
      if (!getAccessConfig().equals(other.getAccessConfig())) return false;
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
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    if (hasAccessConfig()) {
      hash = (37 * hash) + ACCESS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAccessConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2.NetworkEndpoint prototype) {
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
   * A network endpoint over which a TPU worker can be reached.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.NetworkEndpoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.NetworkEndpoint)
      com.google.cloud.tpu.v2.NetworkEndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_NetworkEndpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_NetworkEndpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.NetworkEndpoint.class,
              com.google.cloud.tpu.v2.NetworkEndpoint.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.NetworkEndpoint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ipAddress_ = "";
      port_ = 0;
      accessConfig_ = null;
      if (accessConfigBuilder_ != null) {
        accessConfigBuilder_.dispose();
        accessConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto
          .internal_static_google_cloud_tpu_v2_NetworkEndpoint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.NetworkEndpoint getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.NetworkEndpoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.NetworkEndpoint build() {
      com.google.cloud.tpu.v2.NetworkEndpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.NetworkEndpoint buildPartial() {
      com.google.cloud.tpu.v2.NetworkEndpoint result =
          new com.google.cloud.tpu.v2.NetworkEndpoint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2.NetworkEndpoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ipAddress_ = ipAddress_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.port_ = port_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.accessConfig_ =
            accessConfigBuilder_ == null ? accessConfig_ : accessConfigBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.tpu.v2.NetworkEndpoint) {
        return mergeFrom((com.google.cloud.tpu.v2.NetworkEndpoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.NetworkEndpoint other) {
      if (other == com.google.cloud.tpu.v2.NetworkEndpoint.getDefaultInstance()) return this;
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.hasAccessConfig()) {
        mergeAccessConfig(other.getAccessConfig());
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
            case 10:
              {
                ipAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                port_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 42:
              {
                input.readMessage(getAccessConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 42
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

    private java.lang.Object ipAddress_ = "";
    /**
     *
     *
     * <pre>
     * The internal IP address of this network endpoint.
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     *
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The internal IP address of this network endpoint.
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     *
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The internal IP address of this network endpoint.
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     *
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The internal IP address of this network endpoint.
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      ipAddress_ = getDefaultInstance().getIpAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The internal IP address of this network endpoint.
     * </pre>
     *
     * <code>string ip_address = 1;</code>
     *
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ipAddress_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int port_;
    /**
     *
     *
     * <pre>
     * The port of this network endpoint.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     *
     *
     * <pre>
     * The port of this network endpoint.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The port of this network endpoint.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      port_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.tpu.v2.AccessConfig accessConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2.AccessConfig,
            com.google.cloud.tpu.v2.AccessConfig.Builder,
            com.google.cloud.tpu.v2.AccessConfigOrBuilder>
        accessConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     *
     * @return Whether the accessConfig field is set.
     */
    public boolean hasAccessConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     *
     * @return The accessConfig.
     */
    public com.google.cloud.tpu.v2.AccessConfig getAccessConfig() {
      if (accessConfigBuilder_ == null) {
        return accessConfig_ == null
            ? com.google.cloud.tpu.v2.AccessConfig.getDefaultInstance()
            : accessConfig_;
      } else {
        return accessConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public Builder setAccessConfig(com.google.cloud.tpu.v2.AccessConfig value) {
      if (accessConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessConfig_ = value;
      } else {
        accessConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public Builder setAccessConfig(com.google.cloud.tpu.v2.AccessConfig.Builder builderForValue) {
      if (accessConfigBuilder_ == null) {
        accessConfig_ = builderForValue.build();
      } else {
        accessConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public Builder mergeAccessConfig(com.google.cloud.tpu.v2.AccessConfig value) {
      if (accessConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && accessConfig_ != null
            && accessConfig_ != com.google.cloud.tpu.v2.AccessConfig.getDefaultInstance()) {
          getAccessConfigBuilder().mergeFrom(value);
        } else {
          accessConfig_ = value;
        }
      } else {
        accessConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public Builder clearAccessConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      accessConfig_ = null;
      if (accessConfigBuilder_ != null) {
        accessConfigBuilder_.dispose();
        accessConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public com.google.cloud.tpu.v2.AccessConfig.Builder getAccessConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAccessConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    public com.google.cloud.tpu.v2.AccessConfigOrBuilder getAccessConfigOrBuilder() {
      if (accessConfigBuilder_ != null) {
        return accessConfigBuilder_.getMessageOrBuilder();
      } else {
        return accessConfig_ == null
            ? com.google.cloud.tpu.v2.AccessConfig.getDefaultInstance()
            : accessConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The access config for the TPU worker.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.AccessConfig access_config = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2.AccessConfig,
            com.google.cloud.tpu.v2.AccessConfig.Builder,
            com.google.cloud.tpu.v2.AccessConfigOrBuilder>
        getAccessConfigFieldBuilder() {
      if (accessConfigBuilder_ == null) {
        accessConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.tpu.v2.AccessConfig,
                com.google.cloud.tpu.v2.AccessConfig.Builder,
                com.google.cloud.tpu.v2.AccessConfigOrBuilder>(
                getAccessConfig(), getParentForChildren(), isClean());
        accessConfig_ = null;
      }
      return accessConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.NetworkEndpoint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.NetworkEndpoint)
  private static final com.google.cloud.tpu.v2.NetworkEndpoint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.NetworkEndpoint();
  }

  public static com.google.cloud.tpu.v2.NetworkEndpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpoint> PARSER =
      new com.google.protobuf.AbstractParser<NetworkEndpoint>() {
        @java.lang.Override
        public NetworkEndpoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkEndpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.NetworkEndpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

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
 * For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). On failover or failback, this field indicates whether connection draining will be honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceFailoverPolicy}
 */
public final class BackendServiceFailoverPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceFailoverPolicy)
    BackendServiceFailoverPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BackendServiceFailoverPolicy.newBuilder() to construct.
  private BackendServiceFailoverPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackendServiceFailoverPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackendServiceFailoverPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceFailoverPolicy.class,
            com.google.cloud.compute.v1.BackendServiceFailoverPolicy.Builder.class);
  }

  private int bitField0_;
  public static final int DISABLE_CONNECTION_DRAIN_ON_FAILOVER_FIELD_NUMBER = 182150753;
  private boolean disableConnectionDrainOnFailover_ = false;
  /**
   *
   *
   * <pre>
   * This can be set to true only if the protocol is TCP. The default is false.
   * </pre>
   *
   * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
   *
   * @return Whether the disableConnectionDrainOnFailover field is set.
   */
  @java.lang.Override
  public boolean hasDisableConnectionDrainOnFailover() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * This can be set to true only if the protocol is TCP. The default is false.
   * </pre>
   *
   * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
   *
   * @return The disableConnectionDrainOnFailover.
   */
  @java.lang.Override
  public boolean getDisableConnectionDrainOnFailover() {
    return disableConnectionDrainOnFailover_;
  }

  public static final int DROP_TRAFFIC_IF_UNHEALTHY_FIELD_NUMBER = 112289428;
  private boolean dropTrafficIfUnhealthy_ = false;
  /**
   *
   *
   * <pre>
   * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
   * </pre>
   *
   * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
   *
   * @return Whether the dropTrafficIfUnhealthy field is set.
   */
  @java.lang.Override
  public boolean hasDropTrafficIfUnhealthy() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
   * </pre>
   *
   * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
   *
   * @return The dropTrafficIfUnhealthy.
   */
  @java.lang.Override
  public boolean getDropTrafficIfUnhealthy() {
    return dropTrafficIfUnhealthy_;
  }

  public static final int FAILOVER_RATIO_FIELD_NUMBER = 212667006;
  private float failoverRatio_ = 0F;
  /**
   *
   *
   * <pre>
   * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
   * </pre>
   *
   * <code>optional float failover_ratio = 212667006;</code>
   *
   * @return Whether the failoverRatio field is set.
   */
  @java.lang.Override
  public boolean hasFailoverRatio() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
   * </pre>
   *
   * <code>optional float failover_ratio = 212667006;</code>
   *
   * @return The failoverRatio.
   */
  @java.lang.Override
  public float getFailoverRatio() {
    return failoverRatio_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(112289428, dropTrafficIfUnhealthy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(182150753, disableConnectionDrainOnFailover_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeFloat(212667006, failoverRatio_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(112289428, dropTrafficIfUnhealthy_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              182150753, disableConnectionDrainOnFailover_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(212667006, failoverRatio_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceFailoverPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceFailoverPolicy other =
        (com.google.cloud.compute.v1.BackendServiceFailoverPolicy) obj;

    if (hasDisableConnectionDrainOnFailover() != other.hasDisableConnectionDrainOnFailover())
      return false;
    if (hasDisableConnectionDrainOnFailover()) {
      if (getDisableConnectionDrainOnFailover() != other.getDisableConnectionDrainOnFailover())
        return false;
    }
    if (hasDropTrafficIfUnhealthy() != other.hasDropTrafficIfUnhealthy()) return false;
    if (hasDropTrafficIfUnhealthy()) {
      if (getDropTrafficIfUnhealthy() != other.getDropTrafficIfUnhealthy()) return false;
    }
    if (hasFailoverRatio() != other.hasFailoverRatio()) return false;
    if (hasFailoverRatio()) {
      if (java.lang.Float.floatToIntBits(getFailoverRatio())
          != java.lang.Float.floatToIntBits(other.getFailoverRatio())) return false;
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
    if (hasDisableConnectionDrainOnFailover()) {
      hash = (37 * hash) + DISABLE_CONNECTION_DRAIN_ON_FAILOVER_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashBoolean(getDisableConnectionDrainOnFailover());
    }
    if (hasDropTrafficIfUnhealthy()) {
      hash = (37 * hash) + DROP_TRAFFIC_IF_UNHEALTHY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDropTrafficIfUnhealthy());
    }
    if (hasFailoverRatio()) {
      hash = (37 * hash) + FAILOVER_RATIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getFailoverRatio());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
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
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy prototype) {
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
   * For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). On failover or failback, this field indicates whether connection draining will be honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceFailoverPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceFailoverPolicy)
      com.google.cloud.compute.v1.BackendServiceFailoverPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceFailoverPolicy.class,
              com.google.cloud.compute.v1.BackendServiceFailoverPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceFailoverPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      disableConnectionDrainOnFailover_ = false;
      dropTrafficIfUnhealthy_ = false;
      failoverRatio_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceFailoverPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy build() {
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy buildPartial() {
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy result =
          new com.google.cloud.compute.v1.BackendServiceFailoverPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BackendServiceFailoverPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disableConnectionDrainOnFailover_ = disableConnectionDrainOnFailover_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dropTrafficIfUnhealthy_ = dropTrafficIfUnhealthy_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failoverRatio_ = failoverRatio_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceFailoverPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceFailoverPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceFailoverPolicy other) {
      if (other == com.google.cloud.compute.v1.BackendServiceFailoverPolicy.getDefaultInstance())
        return this;
      if (other.hasDisableConnectionDrainOnFailover()) {
        setDisableConnectionDrainOnFailover(other.getDisableConnectionDrainOnFailover());
      }
      if (other.hasDropTrafficIfUnhealthy()) {
        setDropTrafficIfUnhealthy(other.getDropTrafficIfUnhealthy());
      }
      if (other.hasFailoverRatio()) {
        setFailoverRatio(other.getFailoverRatio());
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
            case 898315424:
              {
                dropTrafficIfUnhealthy_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 898315424
            case 1457206024:
              {
                disableConnectionDrainOnFailover_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 1457206024
            case 1701336053:
              {
                failoverRatio_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 1701336053
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

    private boolean disableConnectionDrainOnFailover_;
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP. The default is false.
     * </pre>
     *
     * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @return Whether the disableConnectionDrainOnFailover field is set.
     */
    @java.lang.Override
    public boolean hasDisableConnectionDrainOnFailover() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP. The default is false.
     * </pre>
     *
     * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @return The disableConnectionDrainOnFailover.
     */
    @java.lang.Override
    public boolean getDisableConnectionDrainOnFailover() {
      return disableConnectionDrainOnFailover_;
    }
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP. The default is false.
     * </pre>
     *
     * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @param value The disableConnectionDrainOnFailover to set.
     * @return This builder for chaining.
     */
    public Builder setDisableConnectionDrainOnFailover(boolean value) {

      disableConnectionDrainOnFailover_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP. The default is false.
     * </pre>
     *
     * <code>optional bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisableConnectionDrainOnFailover() {
      bitField0_ = (bitField0_ & ~0x00000001);
      disableConnectionDrainOnFailover_ = false;
      onChanged();
      return this;
    }

    private boolean dropTrafficIfUnhealthy_;
    /**
     *
     *
     * <pre>
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * </pre>
     *
     * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @return Whether the dropTrafficIfUnhealthy field is set.
     */
    @java.lang.Override
    public boolean hasDropTrafficIfUnhealthy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * </pre>
     *
     * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @return The dropTrafficIfUnhealthy.
     */
    @java.lang.Override
    public boolean getDropTrafficIfUnhealthy() {
      return dropTrafficIfUnhealthy_;
    }
    /**
     *
     *
     * <pre>
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * </pre>
     *
     * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @param value The dropTrafficIfUnhealthy to set.
     * @return This builder for chaining.
     */
    public Builder setDropTrafficIfUnhealthy(boolean value) {

      dropTrafficIfUnhealthy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external passthrough Network Load Balancers](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * </pre>
     *
     * <code>optional bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDropTrafficIfUnhealthy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dropTrafficIfUnhealthy_ = false;
      onChanged();
      return this;
    }

    private float failoverRatio_;
    /**
     *
     *
     * <pre>
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * </pre>
     *
     * <code>optional float failover_ratio = 212667006;</code>
     *
     * @return Whether the failoverRatio field is set.
     */
    @java.lang.Override
    public boolean hasFailoverRatio() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * </pre>
     *
     * <code>optional float failover_ratio = 212667006;</code>
     *
     * @return The failoverRatio.
     */
    @java.lang.Override
    public float getFailoverRatio() {
      return failoverRatio_;
    }
    /**
     *
     *
     * <pre>
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * </pre>
     *
     * <code>optional float failover_ratio = 212667006;</code>
     *
     * @param value The failoverRatio to set.
     * @return This builder for chaining.
     */
    public Builder setFailoverRatio(float value) {

      failoverRatio_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * </pre>
     *
     * <code>optional float failover_ratio = 212667006;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailoverRatio() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failoverRatio_ = 0F;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceFailoverPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceFailoverPolicy)
  private static final com.google.cloud.compute.v1.BackendServiceFailoverPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceFailoverPolicy();
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceFailoverPolicy> PARSER =
      new com.google.protobuf.AbstractParser<BackendServiceFailoverPolicy>() {
        @java.lang.Override
        public BackendServiceFailoverPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackendServiceFailoverPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceFailoverPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

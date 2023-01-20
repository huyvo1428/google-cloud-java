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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

/**
 *
 *
 * <pre>
 * Request for [CreateNode][google.cloud.tpu.v2alpha1.Tpu.CreateNode].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.CreateNodeRequest}
 */
public final class CreateNodeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.CreateNodeRequest)
    CreateNodeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateNodeRequest.newBuilder() to construct.
  private CreateNodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateNodeRequest() {
    parent_ = "";
    nodeId_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateNodeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_CreateNodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto
        .internal_static_google_cloud_tpu_v2alpha1_CreateNodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.CreateNodeRequest.class,
            com.google.cloud.tpu.v2alpha1.CreateNodeRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nodeId_ = "";
  /**
   *
   *
   * <pre>
   * The unqualified resource name.
   * </pre>
   *
   * <code>string node_id = 2;</code>
   *
   * @return The nodeId.
   */
  @java.lang.Override
  public java.lang.String getNodeId() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodeId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unqualified resource name.
   * </pre>
   *
   * <code>string node_id = 2;</code>
   *
   * @return The bytes for nodeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNodeIdBytes() {
    java.lang.Object ref = nodeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nodeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_FIELD_NUMBER = 3;
  private com.google.cloud.tpu.v2alpha1.Node node_;
  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the node field is set.
   */
  @java.lang.Override
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The node.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.Node getNode() {
    return node_ == null ? com.google.cloud.tpu.v2alpha1.Node.getDefaultInstance() : node_;
  }
  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.NodeOrBuilder getNodeOrBuilder() {
    return node_ == null ? com.google.cloud.tpu.v2alpha1.Node.getDefaultInstance() : node_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 6;

  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 6;</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 6;</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nodeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodeId_);
    }
    if (node_ != null) {
      output.writeMessage(3, getNode());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, requestId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nodeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nodeId_);
    }
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getNode());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, requestId_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.CreateNodeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.CreateNodeRequest other =
        (com.google.cloud.tpu.v2alpha1.CreateNodeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getNodeId().equals(other.getNodeId())) return false;
    if (hasNode() != other.hasNode()) return false;
    if (hasNode()) {
      if (!getNode().equals(other.getNode())) return false;
    }
    if (!getRequestId().equals(other.getRequestId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId().hashCode();
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.CreateNodeRequest prototype) {
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
   * Request for [CreateNode][google.cloud.tpu.v2alpha1.Tpu.CreateNode].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.CreateNodeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.CreateNodeRequest)
      com.google.cloud.tpu.v2alpha1.CreateNodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CreateNodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CreateNodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.CreateNodeRequest.class,
              com.google.cloud.tpu.v2alpha1.CreateNodeRequest.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.CreateNodeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      nodeId_ = "";
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto
          .internal_static_google_cloud_tpu_v2alpha1_CreateNodeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateNodeRequest getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.CreateNodeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateNodeRequest build() {
      com.google.cloud.tpu.v2alpha1.CreateNodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateNodeRequest buildPartial() {
      com.google.cloud.tpu.v2alpha1.CreateNodeRequest result =
          new com.google.cloud.tpu.v2alpha1.CreateNodeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.CreateNodeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nodeId_ = nodeId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.node_ = nodeBuilder_ == null ? node_ : nodeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.CreateNodeRequest) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.CreateNodeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.CreateNodeRequest other) {
      if (other == com.google.cloud.tpu.v2alpha1.CreateNodeRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNodeId().isEmpty()) {
        nodeId_ = other.nodeId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000008;
        onChanged();
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                nodeId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getNodeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 50:
              {
                requestId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 50
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object nodeId_ = "";
    /**
     *
     *
     * <pre>
     * The unqualified resource name.
     * </pre>
     *
     * <code>string node_id = 2;</code>
     *
     * @return The nodeId.
     */
    public java.lang.String getNodeId() {
      java.lang.Object ref = nodeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unqualified resource name.
     * </pre>
     *
     * <code>string node_id = 2;</code>
     *
     * @return The bytes for nodeId.
     */
    public com.google.protobuf.ByteString getNodeIdBytes() {
      java.lang.Object ref = nodeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nodeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unqualified resource name.
     * </pre>
     *
     * <code>string node_id = 2;</code>
     *
     * @param value The nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nodeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unqualified resource name.
     * </pre>
     *
     * <code>string node_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodeId() {
      nodeId_ = getDefaultInstance().getNodeId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unqualified resource name.
     * </pre>
     *
     * <code>string node_id = 2;</code>
     *
     * @param value The bytes for nodeId to set.
     * @return This builder for chaining.
     */
    public Builder setNodeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nodeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.tpu.v2alpha1.Node node_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.Node,
            com.google.cloud.tpu.v2alpha1.Node.Builder,
            com.google.cloud.tpu.v2alpha1.NodeOrBuilder>
        nodeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the node field is set.
     */
    public boolean hasNode() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The node.
     */
    public com.google.cloud.tpu.v2alpha1.Node getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? com.google.cloud.tpu.v2alpha1.Node.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNode(com.google.cloud.tpu.v2alpha1.Node value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
      } else {
        nodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNode(com.google.cloud.tpu.v2alpha1.Node.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNode(com.google.cloud.tpu.v2alpha1.Node value) {
      if (nodeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && node_ != null
            && node_ != com.google.cloud.tpu.v2alpha1.Node.getDefaultInstance()) {
          getNodeBuilder().mergeFrom(value);
        } else {
          node_ = value;
        }
      } else {
        nodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.tpu.v2alpha1.Node.Builder getNodeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.tpu.v2alpha1.NodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ? com.google.cloud.tpu.v2alpha1.Node.getDefaultInstance() : node_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The node.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.Node node = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.Node,
            com.google.cloud.tpu.v2alpha1.Node.Builder,
            com.google.cloud.tpu.v2alpha1.NodeOrBuilder>
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.tpu.v2alpha1.Node,
                com.google.cloud.tpu.v2alpha1.Node.Builder,
                com.google.cloud.tpu.v2alpha1.NodeOrBuilder>(
                getNode(), getParentForChildren(), isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 6;</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 6;</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 6;</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      requestId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 6;</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.CreateNodeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.CreateNodeRequest)
  private static final com.google.cloud.tpu.v2alpha1.CreateNodeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.CreateNodeRequest();
  }

  public static com.google.cloud.tpu.v2alpha1.CreateNodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNodeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateNodeRequest>() {
        @java.lang.Override
        public CreateNodeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateNodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNodeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.CreateNodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

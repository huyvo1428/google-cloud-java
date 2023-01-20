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
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

package com.google.cloud.video.stitcher.v1;

/**
 *
 *
 * <pre>
 * Details of an ad request to an ad server.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.AdRequest}
 */
public final class AdRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.AdRequest)
    AdRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AdRequest.newBuilder() to construct.
  private AdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AdRequest() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
        .internal_static_google_cloud_video_stitcher_v1_AdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.AdRequest.class,
            com.google.cloud.video.stitcher.v1.AdRequest.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   *
   *
   * <pre>
   * The ad tag URI processed with integrated macros.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ad tag URI processed with integrated macros.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_METADATA_FIELD_NUMBER = 2;
  private com.google.cloud.video.stitcher.v1.RequestMetadata requestMetadata_;
  /**
   *
   *
   * <pre>
   * The request metadata used to make the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  @java.lang.Override
  public boolean hasRequestMetadata() {
    return requestMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * The request metadata used to make the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return The requestMetadata.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.RequestMetadata getRequestMetadata() {
    return requestMetadata_ == null
        ? com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()
        : requestMetadata_;
  }
  /**
   *
   *
   * <pre>
   * The request metadata used to make the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder() {
    return requestMetadata_ == null
        ? com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()
        : requestMetadata_;
  }

  public static final int RESPONSE_METADATA_FIELD_NUMBER = 3;
  private com.google.cloud.video.stitcher.v1.ResponseMetadata responseMetadata_;
  /**
   *
   *
   * <pre>
   * The response metadata received from the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
   *
   * @return Whether the responseMetadata field is set.
   */
  @java.lang.Override
  public boolean hasResponseMetadata() {
    return responseMetadata_ != null;
  }
  /**
   *
   *
   * <pre>
   * The response metadata received from the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
   *
   * @return The responseMetadata.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.ResponseMetadata getResponseMetadata() {
    return responseMetadata_ == null
        ? com.google.cloud.video.stitcher.v1.ResponseMetadata.getDefaultInstance()
        : responseMetadata_;
  }
  /**
   *
   *
   * <pre>
   * The response metadata received from the ad request.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.ResponseMetadataOrBuilder
      getResponseMetadataOrBuilder() {
    return responseMetadata_ == null
        ? com.google.cloud.video.stitcher.v1.ResponseMetadata.getDefaultInstance()
        : responseMetadata_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    if (requestMetadata_ != null) {
      output.writeMessage(2, getRequestMetadata());
    }
    if (responseMetadata_ != null) {
      output.writeMessage(3, getResponseMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
    }
    if (requestMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRequestMetadata());
    }
    if (responseMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getResponseMetadata());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.AdRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.AdRequest other =
        (com.google.cloud.video.stitcher.v1.AdRequest) obj;

    if (!getUri().equals(other.getUri())) return false;
    if (hasRequestMetadata() != other.hasRequestMetadata()) return false;
    if (hasRequestMetadata()) {
      if (!getRequestMetadata().equals(other.getRequestMetadata())) return false;
    }
    if (hasResponseMetadata() != other.hasResponseMetadata()) return false;
    if (hasResponseMetadata()) {
      if (!getResponseMetadata().equals(other.getResponseMetadata())) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasRequestMetadata()) {
      hash = (37 * hash) + REQUEST_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getRequestMetadata().hashCode();
    }
    if (hasResponseMetadata()) {
      hash = (37 * hash) + RESPONSE_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getResponseMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.AdRequest prototype) {
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
   * Details of an ad request to an ad server.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.AdRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.AdRequest)
      com.google.cloud.video.stitcher.v1.AdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_AdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.AdRequest.class,
              com.google.cloud.video.stitcher.v1.AdRequest.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.AdRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uri_ = "";
      requestMetadata_ = null;
      if (requestMetadataBuilder_ != null) {
        requestMetadataBuilder_.dispose();
        requestMetadataBuilder_ = null;
      }
      responseMetadata_ = null;
      if (responseMetadataBuilder_ != null) {
        responseMetadataBuilder_.dispose();
        responseMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.AdTagDetailsProto
          .internal_static_google_cloud_video_stitcher_v1_AdRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AdRequest getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.AdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AdRequest build() {
      com.google.cloud.video.stitcher.v1.AdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.AdRequest buildPartial() {
      com.google.cloud.video.stitcher.v1.AdRequest result =
          new com.google.cloud.video.stitcher.v1.AdRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.AdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestMetadata_ =
            requestMetadataBuilder_ == null ? requestMetadata_ : requestMetadataBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.responseMetadata_ =
            responseMetadataBuilder_ == null ? responseMetadata_ : responseMetadataBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.AdRequest) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.AdRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.AdRequest other) {
      if (other == com.google.cloud.video.stitcher.v1.AdRequest.getDefaultInstance()) return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRequestMetadata()) {
        mergeRequestMetadata(other.getRequestMetadata());
      }
      if (other.hasResponseMetadata()) {
        mergeResponseMetadata(other.getResponseMetadata());
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
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRequestMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getResponseMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * The ad tag URI processed with integrated macros.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ad tag URI processed with integrated macros.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ad tag URI processed with integrated macros.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ad tag URI processed with integrated macros.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ad tag URI processed with integrated macros.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.video.stitcher.v1.RequestMetadata requestMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.RequestMetadata,
            com.google.cloud.video.stitcher.v1.RequestMetadata.Builder,
            com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder>
        requestMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return Whether the requestMetadata field is set.
     */
    public boolean hasRequestMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     *
     * @return The requestMetadata.
     */
    public com.google.cloud.video.stitcher.v1.RequestMetadata getRequestMetadata() {
      if (requestMetadataBuilder_ == null) {
        return requestMetadata_ == null
            ? com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      } else {
        return requestMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(com.google.cloud.video.stitcher.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestMetadata_ = value;
      } else {
        requestMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder setRequestMetadata(
        com.google.cloud.video.stitcher.v1.RequestMetadata.Builder builderForValue) {
      if (requestMetadataBuilder_ == null) {
        requestMetadata_ = builderForValue.build();
      } else {
        requestMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder mergeRequestMetadata(com.google.cloud.video.stitcher.v1.RequestMetadata value) {
      if (requestMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && requestMetadata_ != null
            && requestMetadata_
                != com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()) {
          getRequestMetadataBuilder().mergeFrom(value);
        } else {
          requestMetadata_ = value;
        }
      } else {
        requestMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public Builder clearRequestMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requestMetadata_ = null;
      if (requestMetadataBuilder_ != null) {
        requestMetadataBuilder_.dispose();
        requestMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.RequestMetadata.Builder getRequestMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRequestMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    public com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder
        getRequestMetadataOrBuilder() {
      if (requestMetadataBuilder_ != null) {
        return requestMetadataBuilder_.getMessageOrBuilder();
      } else {
        return requestMetadata_ == null
            ? com.google.cloud.video.stitcher.v1.RequestMetadata.getDefaultInstance()
            : requestMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The request metadata used to make the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.RequestMetadata request_metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.RequestMetadata,
            com.google.cloud.video.stitcher.v1.RequestMetadata.Builder,
            com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder>
        getRequestMetadataFieldBuilder() {
      if (requestMetadataBuilder_ == null) {
        requestMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.stitcher.v1.RequestMetadata,
                com.google.cloud.video.stitcher.v1.RequestMetadata.Builder,
                com.google.cloud.video.stitcher.v1.RequestMetadataOrBuilder>(
                getRequestMetadata(), getParentForChildren(), isClean());
        requestMetadata_ = null;
      }
      return requestMetadataBuilder_;
    }

    private com.google.cloud.video.stitcher.v1.ResponseMetadata responseMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.ResponseMetadata,
            com.google.cloud.video.stitcher.v1.ResponseMetadata.Builder,
            com.google.cloud.video.stitcher.v1.ResponseMetadataOrBuilder>
        responseMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     *
     * @return Whether the responseMetadata field is set.
     */
    public boolean hasResponseMetadata() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     *
     * @return The responseMetadata.
     */
    public com.google.cloud.video.stitcher.v1.ResponseMetadata getResponseMetadata() {
      if (responseMetadataBuilder_ == null) {
        return responseMetadata_ == null
            ? com.google.cloud.video.stitcher.v1.ResponseMetadata.getDefaultInstance()
            : responseMetadata_;
      } else {
        return responseMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public Builder setResponseMetadata(com.google.cloud.video.stitcher.v1.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseMetadata_ = value;
      } else {
        responseMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public Builder setResponseMetadata(
        com.google.cloud.video.stitcher.v1.ResponseMetadata.Builder builderForValue) {
      if (responseMetadataBuilder_ == null) {
        responseMetadata_ = builderForValue.build();
      } else {
        responseMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public Builder mergeResponseMetadata(
        com.google.cloud.video.stitcher.v1.ResponseMetadata value) {
      if (responseMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && responseMetadata_ != null
            && responseMetadata_
                != com.google.cloud.video.stitcher.v1.ResponseMetadata.getDefaultInstance()) {
          getResponseMetadataBuilder().mergeFrom(value);
        } else {
          responseMetadata_ = value;
        }
      } else {
        responseMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public Builder clearResponseMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      responseMetadata_ = null;
      if (responseMetadataBuilder_ != null) {
        responseMetadataBuilder_.dispose();
        responseMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.ResponseMetadata.Builder
        getResponseMetadataBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResponseMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    public com.google.cloud.video.stitcher.v1.ResponseMetadataOrBuilder
        getResponseMetadataOrBuilder() {
      if (responseMetadataBuilder_ != null) {
        return responseMetadataBuilder_.getMessageOrBuilder();
      } else {
        return responseMetadata_ == null
            ? com.google.cloud.video.stitcher.v1.ResponseMetadata.getDefaultInstance()
            : responseMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The response metadata received from the ad request.
     * </pre>
     *
     * <code>.google.cloud.video.stitcher.v1.ResponseMetadata response_metadata = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.ResponseMetadata,
            com.google.cloud.video.stitcher.v1.ResponseMetadata.Builder,
            com.google.cloud.video.stitcher.v1.ResponseMetadataOrBuilder>
        getResponseMetadataFieldBuilder() {
      if (responseMetadataBuilder_ == null) {
        responseMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.stitcher.v1.ResponseMetadata,
                com.google.cloud.video.stitcher.v1.ResponseMetadata.Builder,
                com.google.cloud.video.stitcher.v1.ResponseMetadataOrBuilder>(
                getResponseMetadata(), getParentForChildren(), isClean());
        responseMetadata_ = null;
      }
      return responseMetadataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.AdRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.AdRequest)
  private static final com.google.cloud.video.stitcher.v1.AdRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.AdRequest();
  }

  public static com.google.cloud.video.stitcher.v1.AdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdRequest> PARSER =
      new com.google.protobuf.AbstractParser<AdRequest>() {
        @java.lang.Override
        public AdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.AdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

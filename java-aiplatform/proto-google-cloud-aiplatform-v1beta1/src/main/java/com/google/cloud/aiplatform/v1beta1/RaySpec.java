/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration information for the Ray cluster.
 * For experimental launch, Ray cluster creation and Persistent
 * cluster creation are 1:1 mapping: We will provision all the nodes within the
 * Persistent cluster as Ray nodes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RaySpec}
 */
public final class RaySpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RaySpec)
    RaySpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RaySpec.newBuilder() to construct.
  private RaySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RaySpec() {
    imageUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RaySpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RaySpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RaySpec.class,
            com.google.cloud.aiplatform.v1beta1.RaySpec.Builder.class);
  }

  public static final int IMAGE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object imageUri_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework(e.g.
   * tensorflow or Pytorch) by choosing from Vertex prebuild
   * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image, Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imageUri.
   */
  @java.lang.Override
  public java.lang.String getImageUri() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework(e.g.
   * tensorflow or Pytorch) by choosing from Vertex prebuild
   * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image, Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for imageUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageUriBytes() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      imageUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, imageUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, imageUri_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RaySpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RaySpec other =
        (com.google.cloud.aiplatform.v1beta1.RaySpec) obj;

    if (!getImageUri().equals(other.getImageUri())) return false;
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
    hash = (37 * hash) + IMAGE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getImageUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.RaySpec prototype) {
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
   * Configuration information for the Ray cluster.
   * For experimental launch, Ray cluster creation and Persistent
   * cluster creation are 1:1 mapping: We will provision all the nodes within the
   * Persistent cluster as Ray nodes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RaySpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RaySpec)
      com.google.cloud.aiplatform.v1beta1.RaySpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RaySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RaySpec.class,
              com.google.cloud.aiplatform.v1beta1.RaySpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RaySpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      imageUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RaySpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RaySpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RaySpec build() {
      com.google.cloud.aiplatform.v1beta1.RaySpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RaySpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RaySpec result =
          new com.google.cloud.aiplatform.v1beta1.RaySpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RaySpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.imageUri_ = imageUri_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RaySpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RaySpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RaySpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RaySpec.getDefaultInstance()) return this;
      if (!other.getImageUri().isEmpty()) {
        imageUri_ = other.imageUri_;
        bitField0_ |= 0x00000001;
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
                imageUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object imageUri_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Default image for user to choose a preferred ML framework(e.g.
     * tensorflow or Pytorch) by choosing from Vertex prebuild
     * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
     * Either this or the resource_pool_images is required. Use this field if
     * you need all the resource pools to have the same Ray image, Otherwise, use
     * the {&#64;code resource_pool_images} field.
     * </pre>
     *
     * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The imageUri.
     */
    public java.lang.String getImageUri() {
      java.lang.Object ref = imageUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Default image for user to choose a preferred ML framework(e.g.
     * tensorflow or Pytorch) by choosing from Vertex prebuild
     * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
     * Either this or the resource_pool_images is required. Use this field if
     * you need all the resource pools to have the same Ray image, Otherwise, use
     * the {&#64;code resource_pool_images} field.
     * </pre>
     *
     * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for imageUri.
     */
    public com.google.protobuf.ByteString getImageUriBytes() {
      java.lang.Object ref = imageUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        imageUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Default image for user to choose a preferred ML framework(e.g.
     * tensorflow or Pytorch) by choosing from Vertex prebuild
     * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
     * Either this or the resource_pool_images is required. Use this field if
     * you need all the resource pools to have the same Ray image, Otherwise, use
     * the {&#64;code resource_pool_images} field.
     * </pre>
     *
     * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      imageUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Default image for user to choose a preferred ML framework(e.g.
     * tensorflow or Pytorch) by choosing from Vertex prebuild
     * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
     * Either this or the resource_pool_images is required. Use this field if
     * you need all the resource pools to have the same Ray image, Otherwise, use
     * the {&#64;code resource_pool_images} field.
     * </pre>
     *
     * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageUri() {
      imageUri_ = getDefaultInstance().getImageUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Default image for user to choose a preferred ML framework(e.g.
     * tensorflow or Pytorch) by choosing from Vertex prebuild
     * images(https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
     * Either this or the resource_pool_images is required. Use this field if
     * you need all the resource pools to have the same Ray image, Otherwise, use
     * the {&#64;code resource_pool_images} field.
     * </pre>
     *
     * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      imageUri_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RaySpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RaySpec)
  private static final com.google.cloud.aiplatform.v1beta1.RaySpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RaySpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.RaySpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RaySpec> PARSER =
      new com.google.protobuf.AbstractParser<RaySpec>() {
        @java.lang.Override
        public RaySpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<RaySpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RaySpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RaySpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

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
// source: google/cloud/privilegedaccessmanager/v1/privilegedaccessmanager.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.privilegedaccessmanager.v1;

/**
 *
 *
 * <pre>
 * Justification represents a justification for requesting access.
 * </pre>
 *
 * Protobuf type {@code google.cloud.privilegedaccessmanager.v1.Justification}
 */
public final class Justification extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.privilegedaccessmanager.v1.Justification)
    JustificationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Justification.newBuilder() to construct.
  private Justification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Justification() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Justification();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerProto
        .internal_static_google_cloud_privilegedaccessmanager_v1_Justification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerProto
        .internal_static_google_cloud_privilegedaccessmanager_v1_Justification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.privilegedaccessmanager.v1.Justification.class,
            com.google.cloud.privilegedaccessmanager.v1.Justification.Builder.class);
  }

  private int justificationCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object justification_;

  public enum JustificationCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UNSTRUCTURED_JUSTIFICATION(1),
    JUSTIFICATION_NOT_SET(0);
    private final int value;

    private JustificationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static JustificationCase valueOf(int value) {
      return forNumber(value);
    }

    public static JustificationCase forNumber(int value) {
      switch (value) {
        case 1:
          return UNSTRUCTURED_JUSTIFICATION;
        case 0:
          return JUSTIFICATION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public JustificationCase getJustificationCase() {
    return JustificationCase.forNumber(justificationCase_);
  }

  public static final int UNSTRUCTURED_JUSTIFICATION_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A free form textual justification. The system only ensures that this
   * is not empty. No other kind of validation is performed on the string.
   * </pre>
   *
   * <code>string unstructured_justification = 1;</code>
   *
   * @return Whether the unstructuredJustification field is set.
   */
  public boolean hasUnstructuredJustification() {
    return justificationCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A free form textual justification. The system only ensures that this
   * is not empty. No other kind of validation is performed on the string.
   * </pre>
   *
   * <code>string unstructured_justification = 1;</code>
   *
   * @return The unstructuredJustification.
   */
  public java.lang.String getUnstructuredJustification() {
    java.lang.Object ref = "";
    if (justificationCase_ == 1) {
      ref = justification_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (justificationCase_ == 1) {
        justification_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A free form textual justification. The system only ensures that this
   * is not empty. No other kind of validation is performed on the string.
   * </pre>
   *
   * <code>string unstructured_justification = 1;</code>
   *
   * @return The bytes for unstructuredJustification.
   */
  public com.google.protobuf.ByteString getUnstructuredJustificationBytes() {
    java.lang.Object ref = "";
    if (justificationCase_ == 1) {
      ref = justification_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (justificationCase_ == 1) {
        justification_ = b;
      }
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
    if (justificationCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, justification_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (justificationCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, justification_);
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
    if (!(obj instanceof com.google.cloud.privilegedaccessmanager.v1.Justification)) {
      return super.equals(obj);
    }
    com.google.cloud.privilegedaccessmanager.v1.Justification other =
        (com.google.cloud.privilegedaccessmanager.v1.Justification) obj;

    if (!getJustificationCase().equals(other.getJustificationCase())) return false;
    switch (justificationCase_) {
      case 1:
        if (!getUnstructuredJustification().equals(other.getUnstructuredJustification()))
          return false;
        break;
      case 0:
      default:
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
    switch (justificationCase_) {
      case 1:
        hash = (37 * hash) + UNSTRUCTURED_JUSTIFICATION_FIELD_NUMBER;
        hash = (53 * hash) + getUnstructuredJustification().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification parseFrom(
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
      com.google.cloud.privilegedaccessmanager.v1.Justification prototype) {
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
   * Justification represents a justification for requesting access.
   * </pre>
   *
   * Protobuf type {@code google.cloud.privilegedaccessmanager.v1.Justification}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.privilegedaccessmanager.v1.Justification)
      com.google.cloud.privilegedaccessmanager.v1.JustificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerProto
          .internal_static_google_cloud_privilegedaccessmanager_v1_Justification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerProto
          .internal_static_google_cloud_privilegedaccessmanager_v1_Justification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.privilegedaccessmanager.v1.Justification.class,
              com.google.cloud.privilegedaccessmanager.v1.Justification.Builder.class);
    }

    // Construct using com.google.cloud.privilegedaccessmanager.v1.Justification.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      justificationCase_ = 0;
      justification_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerProto
          .internal_static_google_cloud_privilegedaccessmanager_v1_Justification_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.privilegedaccessmanager.v1.Justification getDefaultInstanceForType() {
      return com.google.cloud.privilegedaccessmanager.v1.Justification.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.privilegedaccessmanager.v1.Justification build() {
      com.google.cloud.privilegedaccessmanager.v1.Justification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.privilegedaccessmanager.v1.Justification buildPartial() {
      com.google.cloud.privilegedaccessmanager.v1.Justification result =
          new com.google.cloud.privilegedaccessmanager.v1.Justification(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.privilegedaccessmanager.v1.Justification result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.privilegedaccessmanager.v1.Justification result) {
      result.justificationCase_ = justificationCase_;
      result.justification_ = this.justification_;
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
      if (other instanceof com.google.cloud.privilegedaccessmanager.v1.Justification) {
        return mergeFrom((com.google.cloud.privilegedaccessmanager.v1.Justification) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.privilegedaccessmanager.v1.Justification other) {
      if (other == com.google.cloud.privilegedaccessmanager.v1.Justification.getDefaultInstance())
        return this;
      switch (other.getJustificationCase()) {
        case UNSTRUCTURED_JUSTIFICATION:
          {
            justificationCase_ = 1;
            justification_ = other.justification_;
            onChanged();
            break;
          }
        case JUSTIFICATION_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                justificationCase_ = 1;
                justification_ = s;
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

    private int justificationCase_ = 0;
    private java.lang.Object justification_;

    public JustificationCase getJustificationCase() {
      return JustificationCase.forNumber(justificationCase_);
    }

    public Builder clearJustification() {
      justificationCase_ = 0;
      justification_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @return Whether the unstructuredJustification field is set.
     */
    @java.lang.Override
    public boolean hasUnstructuredJustification() {
      return justificationCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @return The unstructuredJustification.
     */
    @java.lang.Override
    public java.lang.String getUnstructuredJustification() {
      java.lang.Object ref = "";
      if (justificationCase_ == 1) {
        ref = justification_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (justificationCase_ == 1) {
          justification_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @return The bytes for unstructuredJustification.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUnstructuredJustificationBytes() {
      java.lang.Object ref = "";
      if (justificationCase_ == 1) {
        ref = justification_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (justificationCase_ == 1) {
          justification_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @param value The unstructuredJustification to set.
     * @return This builder for chaining.
     */
    public Builder setUnstructuredJustification(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      justificationCase_ = 1;
      justification_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnstructuredJustification() {
      if (justificationCase_ == 1) {
        justificationCase_ = 0;
        justification_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A free form textual justification. The system only ensures that this
     * is not empty. No other kind of validation is performed on the string.
     * </pre>
     *
     * <code>string unstructured_justification = 1;</code>
     *
     * @param value The bytes for unstructuredJustification to set.
     * @return This builder for chaining.
     */
    public Builder setUnstructuredJustificationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      justificationCase_ = 1;
      justification_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.privilegedaccessmanager.v1.Justification)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.privilegedaccessmanager.v1.Justification)
  private static final com.google.cloud.privilegedaccessmanager.v1.Justification DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.privilegedaccessmanager.v1.Justification();
  }

  public static com.google.cloud.privilegedaccessmanager.v1.Justification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Justification> PARSER =
      new com.google.protobuf.AbstractParser<Justification>() {
        @java.lang.Override
        public Justification parsePartialFrom(
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

  public static com.google.protobuf.Parser<Justification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Justification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.privilegedaccessmanager.v1.Justification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

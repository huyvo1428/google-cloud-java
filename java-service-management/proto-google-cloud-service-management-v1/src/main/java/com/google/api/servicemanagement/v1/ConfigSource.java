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
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Represents a source file which is used to generate the service configuration
 * defined by `google.api.Service`.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.ConfigSource}
 */
public final class ConfigSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.ConfigSource)
    ConfigSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConfigSource.newBuilder() to construct.
  private ConfigSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConfigSource() {
    id_ = "";
    files_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConfigSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ConfigSource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                files_ = new java.util.ArrayList<com.google.api.servicemanagement.v1.ConfigFile>();
                mutable_bitField0_ |= 0x00000001;
              }
              files_.add(
                  input.readMessage(
                      com.google.api.servicemanagement.v1.ConfigFile.parser(), extensionRegistry));
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        files_ = java.util.Collections.unmodifiableList(files_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ResourcesProto
        .internal_static_google_api_servicemanagement_v1_ConfigSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.ConfigSource.class,
            com.google.api.servicemanagement.v1.ConfigSource.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object id_;
  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead.
   * </pre>
   *
   * <code>string id = 5;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILES_FIELD_NUMBER = 2;
  private java.util.List<com.google.api.servicemanagement.v1.ConfigFile> files_;
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.servicemanagement.v1.ConfigFile> getFilesList() {
    return files_;
  }
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.servicemanagement.v1.ConfigFileOrBuilder>
      getFilesOrBuilderList() {
    return files_;
  }
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  @java.lang.Override
  public int getFilesCount() {
    return files_.size();
  }
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigFile getFiles(int index) {
    return files_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Set of source configuration files that are used to generate a service
   * configuration (`google.api.Service`).
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigFileOrBuilder getFilesOrBuilder(int index) {
    return files_.get(index);
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
    for (int i = 0; i < files_.size(); i++) {
      output.writeMessage(2, files_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < files_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, files_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, id_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.servicemanagement.v1.ConfigSource)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.ConfigSource other =
        (com.google.api.servicemanagement.v1.ConfigSource) obj;

    if (!getId().equals(other.getId())) return false;
    if (!getFilesList().equals(other.getFilesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (getFilesCount() > 0) {
      hash = (37 * hash) + FILES_FIELD_NUMBER;
      hash = (53 * hash) + getFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.ConfigSource parseFrom(
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

  public static Builder newBuilder(com.google.api.servicemanagement.v1.ConfigSource prototype) {
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
   * Represents a source file which is used to generate the service configuration
   * defined by `google.api.Service`.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.ConfigSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.ConfigSource)
      com.google.api.servicemanagement.v1.ConfigSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.ConfigSource.class,
              com.google.api.servicemanagement.v1.ConfigSource.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.ConfigSource.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFilesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        filesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ResourcesProto
          .internal_static_google_api_servicemanagement_v1_ConfigSource_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigSource getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.ConfigSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigSource build() {
      com.google.api.servicemanagement.v1.ConfigSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.ConfigSource buildPartial() {
      com.google.api.servicemanagement.v1.ConfigSource result =
          new com.google.api.servicemanagement.v1.ConfigSource(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      if (filesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          files_ = java.util.Collections.unmodifiableList(files_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.files_ = files_;
      } else {
        result.files_ = filesBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.api.servicemanagement.v1.ConfigSource) {
        return mergeFrom((com.google.api.servicemanagement.v1.ConfigSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.ConfigSource other) {
      if (other == com.google.api.servicemanagement.v1.ConfigSource.getDefaultInstance())
        return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (filesBuilder_ == null) {
        if (!other.files_.isEmpty()) {
          if (files_.isEmpty()) {
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFilesIsMutable();
            files_.addAll(other.files_);
          }
          onChanged();
        }
      } else {
        if (!other.files_.isEmpty()) {
          if (filesBuilder_.isEmpty()) {
            filesBuilder_.dispose();
            filesBuilder_ = null;
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFilesFieldBuilder()
                    : null;
          } else {
            filesBuilder_.addAllMessages(other.files_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.api.servicemanagement.v1.ConfigSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.servicemanagement.v1.ConfigSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     *
     *
     * <pre>
     * A unique ID for a specific instance of this message, typically assigned
     * by the client for tracking purpose. If empty, the server may choose to
     * generate one instead.
     * </pre>
     *
     * <code>string id = 5;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique ID for a specific instance of this message, typically assigned
     * by the client for tracking purpose. If empty, the server may choose to
     * generate one instead.
     * </pre>
     *
     * <code>string id = 5;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique ID for a specific instance of this message, typically assigned
     * by the client for tracking purpose. If empty, the server may choose to
     * generate one instead.
     * </pre>
     *
     * <code>string id = 5;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      id_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique ID for a specific instance of this message, typically assigned
     * by the client for tracking purpose. If empty, the server may choose to
     * generate one instead.
     * </pre>
     *
     * <code>string id = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {

      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique ID for a specific instance of this message, typically assigned
     * by the client for tracking purpose. If empty, the server may choose to
     * generate one instead.
     * </pre>
     *
     * <code>string id = 5;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      id_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.api.servicemanagement.v1.ConfigFile> files_ =
        java.util.Collections.emptyList();

    private void ensureFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        files_ = new java.util.ArrayList<com.google.api.servicemanagement.v1.ConfigFile>(files_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.servicemanagement.v1.ConfigFile,
            com.google.api.servicemanagement.v1.ConfigFile.Builder,
            com.google.api.servicemanagement.v1.ConfigFileOrBuilder>
        filesBuilder_;

    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.ConfigFile> getFilesList() {
      if (filesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(files_);
      } else {
        return filesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public int getFilesCount() {
      if (filesBuilder_ == null) {
        return files_.size();
      } else {
        return filesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public com.google.api.servicemanagement.v1.ConfigFile getFiles(int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);
      } else {
        return filesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder setFiles(int index, com.google.api.servicemanagement.v1.ConfigFile value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.set(index, value);
        onChanged();
      } else {
        filesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder setFiles(
        int index, com.google.api.servicemanagement.v1.ConfigFile.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.set(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder addFiles(com.google.api.servicemanagement.v1.ConfigFile value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(value);
        onChanged();
      } else {
        filesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder addFiles(int index, com.google.api.servicemanagement.v1.ConfigFile value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(index, value);
        onChanged();
      } else {
        filesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder addFiles(
        com.google.api.servicemanagement.v1.ConfigFile.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder addFiles(
        int index, com.google.api.servicemanagement.v1.ConfigFile.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder addAllFiles(
        java.lang.Iterable<? extends com.google.api.servicemanagement.v1.ConfigFile> values) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, files_);
        onChanged();
      } else {
        filesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder clearFiles() {
      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public Builder removeFiles(int index) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.remove(index);
        onChanged();
      } else {
        filesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public com.google.api.servicemanagement.v1.ConfigFile.Builder getFilesBuilder(int index) {
      return getFilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public com.google.api.servicemanagement.v1.ConfigFileOrBuilder getFilesOrBuilder(int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);
      } else {
        return filesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public java.util.List<? extends com.google.api.servicemanagement.v1.ConfigFileOrBuilder>
        getFilesOrBuilderList() {
      if (filesBuilder_ != null) {
        return filesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(files_);
      }
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public com.google.api.servicemanagement.v1.ConfigFile.Builder addFilesBuilder() {
      return getFilesFieldBuilder()
          .addBuilder(com.google.api.servicemanagement.v1.ConfigFile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public com.google.api.servicemanagement.v1.ConfigFile.Builder addFilesBuilder(int index) {
      return getFilesFieldBuilder()
          .addBuilder(index, com.google.api.servicemanagement.v1.ConfigFile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Set of source configuration files that are used to generate a service
     * configuration (`google.api.Service`).
     * </pre>
     *
     * <code>repeated .google.api.servicemanagement.v1.ConfigFile files = 2;</code>
     */
    public java.util.List<com.google.api.servicemanagement.v1.ConfigFile.Builder>
        getFilesBuilderList() {
      return getFilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.servicemanagement.v1.ConfigFile,
            com.google.api.servicemanagement.v1.ConfigFile.Builder,
            com.google.api.servicemanagement.v1.ConfigFileOrBuilder>
        getFilesFieldBuilder() {
      if (filesBuilder_ == null) {
        filesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.servicemanagement.v1.ConfigFile,
                com.google.api.servicemanagement.v1.ConfigFile.Builder,
                com.google.api.servicemanagement.v1.ConfigFileOrBuilder>(
                files_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        files_ = null;
      }
      return filesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.ConfigSource)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.ConfigSource)
  private static final com.google.api.servicemanagement.v1.ConfigSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.ConfigSource();
  }

  public static com.google.api.servicemanagement.v1.ConfigSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfigSource> PARSER =
      new com.google.protobuf.AbstractParser<ConfigSource>() {
        @java.lang.Override
        public ConfigSource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConfigSource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ConfigSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfigSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.ConfigSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

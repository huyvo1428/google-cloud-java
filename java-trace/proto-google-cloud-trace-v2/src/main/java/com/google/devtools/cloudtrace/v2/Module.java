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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

/**
 *
 *
 * <pre>
 * Binary module.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v2.Module}
 */
public final class Module extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v2.Module)
    ModuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Module.newBuilder() to construct.
  private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Module() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Module();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.cloudtrace.v2.TraceProto
        .internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v2.TraceProto
        .internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v2.Module.class,
            com.google.devtools.cloudtrace.v2.Module.Builder.class);
  }

  public static final int MODULE_FIELD_NUMBER = 1;
  private com.google.devtools.cloudtrace.v2.TruncatableString module_;
  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   *
   * @return Whether the module field is set.
   */
  @java.lang.Override
  public boolean hasModule() {
    return module_ != null;
  }
  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   *
   * @return The module.
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.TruncatableString getModule() {
    return module_ == null
        ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
        : module_;
  }
  /**
   *
   *
   * <pre>
   * For example: main binary, kernel modules, and dynamic libraries
   * such as libc.so, sharedlib.so (up to 256 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getModuleOrBuilder() {
    return module_ == null
        ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
        : module_;
  }

  public static final int BUILD_ID_FIELD_NUMBER = 2;
  private com.google.devtools.cloudtrace.v2.TruncatableString buildId_;
  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   *
   * @return Whether the buildId field is set.
   */
  @java.lang.Override
  public boolean hasBuildId() {
    return buildId_ != null;
  }
  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   *
   * @return The buildId.
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.TruncatableString getBuildId() {
    return buildId_ == null
        ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
        : buildId_;
  }
  /**
   *
   *
   * <pre>
   * A unique identifier for the module, usually a hash of its
   * contents (up to 128 bytes).
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getBuildIdOrBuilder() {
    return buildId_ == null
        ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
        : buildId_;
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
    if (module_ != null) {
      output.writeMessage(1, getModule());
    }
    if (buildId_ != null) {
      output.writeMessage(2, getBuildId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (module_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getModule());
    }
    if (buildId_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBuildId());
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v2.Module)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v2.Module other = (com.google.devtools.cloudtrace.v2.Module) obj;

    if (hasModule() != other.hasModule()) return false;
    if (hasModule()) {
      if (!getModule().equals(other.getModule())) return false;
    }
    if (hasBuildId() != other.hasBuildId()) return false;
    if (hasBuildId()) {
      if (!getBuildId().equals(other.getBuildId())) return false;
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
    if (hasModule()) {
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule().hashCode();
    }
    if (hasBuildId()) {
      hash = (37 * hash) + BUILD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuildId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v2.Module parseFrom(
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

  public static Builder newBuilder(com.google.devtools.cloudtrace.v2.Module prototype) {
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
   * Binary module.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v2.Module}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v2.Module)
      com.google.devtools.cloudtrace.v2.ModuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v2.Module.class,
              com.google.devtools.cloudtrace.v2.Module.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v2.Module.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      module_ = null;
      if (moduleBuilder_ != null) {
        moduleBuilder_.dispose();
        moduleBuilder_ = null;
      }
      buildId_ = null;
      if (buildIdBuilder_ != null) {
        buildIdBuilder_.dispose();
        buildIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudtrace.v2.TraceProto
          .internal_static_google_devtools_cloudtrace_v2_Module_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v2.Module.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module build() {
      com.google.devtools.cloudtrace.v2.Module result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v2.Module buildPartial() {
      com.google.devtools.cloudtrace.v2.Module result =
          new com.google.devtools.cloudtrace.v2.Module(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.cloudtrace.v2.Module result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.module_ = moduleBuilder_ == null ? module_ : moduleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.buildId_ = buildIdBuilder_ == null ? buildId_ : buildIdBuilder_.build();
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
      if (other instanceof com.google.devtools.cloudtrace.v2.Module) {
        return mergeFrom((com.google.devtools.cloudtrace.v2.Module) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v2.Module other) {
      if (other == com.google.devtools.cloudtrace.v2.Module.getDefaultInstance()) return this;
      if (other.hasModule()) {
        mergeModule(other.getModule());
      }
      if (other.hasBuildId()) {
        mergeBuildId(other.getBuildId());
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
                input.readMessage(getModuleFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getBuildIdFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.devtools.cloudtrace.v2.TruncatableString module_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        moduleBuilder_;
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     *
     * @return Whether the module field is set.
     */
    public boolean hasModule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     *
     * @return The module.
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString getModule() {
      if (moduleBuilder_ == null) {
        return module_ == null
            ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
            : module_;
      } else {
        return moduleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder setModule(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (moduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        module_ = value;
      } else {
        moduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder setModule(
        com.google.devtools.cloudtrace.v2.TruncatableString.Builder builderForValue) {
      if (moduleBuilder_ == null) {
        module_ = builderForValue.build();
      } else {
        moduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder mergeModule(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (moduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && module_ != null
            && module_
                != com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()) {
          getModuleBuilder().mergeFrom(value);
        } else {
          module_ = value;
        }
      } else {
        moduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public Builder clearModule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      module_ = null;
      if (moduleBuilder_ != null) {
        moduleBuilder_.dispose();
        moduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString.Builder getModuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getModuleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getModuleOrBuilder() {
      if (moduleBuilder_ != null) {
        return moduleBuilder_.getMessageOrBuilder();
      } else {
        return module_ == null
            ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
            : module_;
      }
    }
    /**
     *
     *
     * <pre>
     * For example: main binary, kernel modules, and dynamic libraries
     * such as libc.so, sharedlib.so (up to 256 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString module = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        getModuleFieldBuilder() {
      if (moduleBuilder_ == null) {
        moduleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.cloudtrace.v2.TruncatableString,
                com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
                com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>(
                getModule(), getParentForChildren(), isClean());
        module_ = null;
      }
      return moduleBuilder_;
    }

    private com.google.devtools.cloudtrace.v2.TruncatableString buildId_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        buildIdBuilder_;
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     *
     * @return Whether the buildId field is set.
     */
    public boolean hasBuildId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     *
     * @return The buildId.
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString getBuildId() {
      if (buildIdBuilder_ == null) {
        return buildId_ == null
            ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
            : buildId_;
      } else {
        return buildIdBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder setBuildId(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (buildIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        buildId_ = value;
      } else {
        buildIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder setBuildId(
        com.google.devtools.cloudtrace.v2.TruncatableString.Builder builderForValue) {
      if (buildIdBuilder_ == null) {
        buildId_ = builderForValue.build();
      } else {
        buildIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder mergeBuildId(com.google.devtools.cloudtrace.v2.TruncatableString value) {
      if (buildIdBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && buildId_ != null
            && buildId_
                != com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()) {
          getBuildIdBuilder().mergeFrom(value);
        } else {
          buildId_ = value;
        }
      } else {
        buildIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public Builder clearBuildId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      buildId_ = null;
      if (buildIdBuilder_ != null) {
        buildIdBuilder_.dispose();
        buildIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableString.Builder getBuildIdBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBuildIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    public com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getBuildIdOrBuilder() {
      if (buildIdBuilder_ != null) {
        return buildIdBuilder_.getMessageOrBuilder();
      } else {
        return buildId_ == null
            ? com.google.devtools.cloudtrace.v2.TruncatableString.getDefaultInstance()
            : buildId_;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique identifier for the module, usually a hash of its
     * contents (up to 128 bytes).
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v2.TruncatableString build_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v2.TruncatableString,
            com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
            com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>
        getBuildIdFieldBuilder() {
      if (buildIdBuilder_ == null) {
        buildIdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.cloudtrace.v2.TruncatableString,
                com.google.devtools.cloudtrace.v2.TruncatableString.Builder,
                com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder>(
                getBuildId(), getParentForChildren(), isClean());
        buildId_ = null;
      }
      return buildIdBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v2.Module)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v2.Module)
  private static final com.google.devtools.cloudtrace.v2.Module DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v2.Module();
  }

  public static com.google.devtools.cloudtrace.v2.Module getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Module> PARSER =
      new com.google.protobuf.AbstractParser<Module>() {
        @java.lang.Override
        public Module parsePartialFrom(
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

  public static com.google.protobuf.Parser<Module> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Module> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v2.Module getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

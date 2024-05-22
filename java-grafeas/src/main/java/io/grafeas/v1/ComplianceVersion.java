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
// source: grafeas/v1/compliance.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Describes the CIS benchmark version that is applicable to a given OS and
 * os version.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.ComplianceVersion}
 */
public final class ComplianceVersion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.ComplianceVersion)
    ComplianceVersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComplianceVersion.newBuilder() to construct.
  private ComplianceVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComplianceVersion() {
    cpeUri_ = "";
    benchmarkDocument_ = "";
    version_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComplianceVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Compliance.internal_static_grafeas_v1_ComplianceVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Compliance.internal_static_grafeas_v1_ComplianceVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.ComplianceVersion.class, io.grafeas.v1.ComplianceVersion.Builder.class);
  }

  public static final int CPE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object cpeUri_ = "";
  /**
   *
   *
   * <pre>
   * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
   * applicable to.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The cpeUri.
   */
  @java.lang.Override
  public java.lang.String getCpeUri() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpeUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
   * applicable to.
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The bytes for cpeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCpeUriBytes() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cpeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BENCHMARK_DOCUMENT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object benchmarkDocument_ = "";
  /**
   *
   *
   * <pre>
   * The name of the document that defines this benchmark, e.g. "CIS
   * Container-Optimized OS".
   * </pre>
   *
   * <code>string benchmark_document = 3;</code>
   *
   * @return The benchmarkDocument.
   */
  @java.lang.Override
  public java.lang.String getBenchmarkDocument() {
    java.lang.Object ref = benchmarkDocument_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      benchmarkDocument_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the document that defines this benchmark, e.g. "CIS
   * Container-Optimized OS".
   * </pre>
   *
   * <code>string benchmark_document = 3;</code>
   *
   * @return The bytes for benchmarkDocument.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBenchmarkDocumentBytes() {
    java.lang.Object ref = benchmarkDocument_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      benchmarkDocument_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * The version of the benchmark. This is set to the version of the OS-specific
   * CIS document the benchmark is defined in.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version of the benchmark. This is set to the version of the OS-specific
   * CIS document the benchmark is defined in.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(benchmarkDocument_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, benchmarkDocument_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cpeUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(benchmarkDocument_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, benchmarkDocument_);
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
    if (!(obj instanceof io.grafeas.v1.ComplianceVersion)) {
      return super.equals(obj);
    }
    io.grafeas.v1.ComplianceVersion other = (io.grafeas.v1.ComplianceVersion) obj;

    if (!getCpeUri().equals(other.getCpeUri())) return false;
    if (!getBenchmarkDocument().equals(other.getBenchmarkDocument())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
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
    hash = (37 * hash) + CPE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getCpeUri().hashCode();
    hash = (37 * hash) + BENCHMARK_DOCUMENT_FIELD_NUMBER;
    hash = (53 * hash) + getBenchmarkDocument().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ComplianceVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ComplianceVersion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ComplianceVersion parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.ComplianceVersion prototype) {
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
   * Describes the CIS benchmark version that is applicable to a given OS and
   * os version.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.ComplianceVersion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.ComplianceVersion)
      io.grafeas.v1.ComplianceVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Compliance.internal_static_grafeas_v1_ComplianceVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Compliance
          .internal_static_grafeas_v1_ComplianceVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.ComplianceVersion.class, io.grafeas.v1.ComplianceVersion.Builder.class);
    }

    // Construct using io.grafeas.v1.ComplianceVersion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cpeUri_ = "";
      benchmarkDocument_ = "";
      version_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Compliance.internal_static_grafeas_v1_ComplianceVersion_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.ComplianceVersion getDefaultInstanceForType() {
      return io.grafeas.v1.ComplianceVersion.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.ComplianceVersion build() {
      io.grafeas.v1.ComplianceVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.ComplianceVersion buildPartial() {
      io.grafeas.v1.ComplianceVersion result = new io.grafeas.v1.ComplianceVersion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.ComplianceVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cpeUri_ = cpeUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.benchmarkDocument_ = benchmarkDocument_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.version_ = version_;
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
      if (other instanceof io.grafeas.v1.ComplianceVersion) {
        return mergeFrom((io.grafeas.v1.ComplianceVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.ComplianceVersion other) {
      if (other == io.grafeas.v1.ComplianceVersion.getDefaultInstance()) return this;
      if (!other.getCpeUri().isEmpty()) {
        cpeUri_ = other.cpeUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBenchmarkDocument().isEmpty()) {
        benchmarkDocument_ = other.benchmarkDocument_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000004;
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
                cpeUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 26:
              {
                benchmarkDocument_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object cpeUri_ = "";
    /**
     *
     *
     * <pre>
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
     * applicable to.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return The cpeUri.
     */
    public java.lang.String getCpeUri() {
      java.lang.Object ref = cpeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
     * applicable to.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return The bytes for cpeUri.
     */
    public com.google.protobuf.ByteString getCpeUriBytes() {
      java.lang.Object ref = cpeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cpeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
     * applicable to.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @param value The cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cpeUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
     * applicable to.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpeUri() {
      cpeUri_ = getDefaultInstance().getCpeUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is
     * applicable to.
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @param value The bytes for cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      cpeUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object benchmarkDocument_ = "";
    /**
     *
     *
     * <pre>
     * The name of the document that defines this benchmark, e.g. "CIS
     * Container-Optimized OS".
     * </pre>
     *
     * <code>string benchmark_document = 3;</code>
     *
     * @return The benchmarkDocument.
     */
    public java.lang.String getBenchmarkDocument() {
      java.lang.Object ref = benchmarkDocument_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        benchmarkDocument_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the document that defines this benchmark, e.g. "CIS
     * Container-Optimized OS".
     * </pre>
     *
     * <code>string benchmark_document = 3;</code>
     *
     * @return The bytes for benchmarkDocument.
     */
    public com.google.protobuf.ByteString getBenchmarkDocumentBytes() {
      java.lang.Object ref = benchmarkDocument_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        benchmarkDocument_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the document that defines this benchmark, e.g. "CIS
     * Container-Optimized OS".
     * </pre>
     *
     * <code>string benchmark_document = 3;</code>
     *
     * @param value The benchmarkDocument to set.
     * @return This builder for chaining.
     */
    public Builder setBenchmarkDocument(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      benchmarkDocument_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the document that defines this benchmark, e.g. "CIS
     * Container-Optimized OS".
     * </pre>
     *
     * <code>string benchmark_document = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBenchmarkDocument() {
      benchmarkDocument_ = getDefaultInstance().getBenchmarkDocument();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the document that defines this benchmark, e.g. "CIS
     * Container-Optimized OS".
     * </pre>
     *
     * <code>string benchmark_document = 3;</code>
     *
     * @param value The bytes for benchmarkDocument to set.
     * @return This builder for chaining.
     */
    public Builder setBenchmarkDocumentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      benchmarkDocument_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * The version of the benchmark. This is set to the version of the OS-specific
     * CIS document the benchmark is defined in.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the benchmark. This is set to the version of the OS-specific
     * CIS document the benchmark is defined in.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the benchmark. This is set to the version of the OS-specific
     * CIS document the benchmark is defined in.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the benchmark. This is set to the version of the OS-specific
     * CIS document the benchmark is defined in.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the benchmark. This is set to the version of the OS-specific
     * CIS document the benchmark is defined in.
     * </pre>
     *
     * <code>string version = 2;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.ComplianceVersion)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.ComplianceVersion)
  private static final io.grafeas.v1.ComplianceVersion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.ComplianceVersion();
  }

  public static io.grafeas.v1.ComplianceVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComplianceVersion> PARSER =
      new com.google.protobuf.AbstractParser<ComplianceVersion>() {
        @java.lang.Override
        public ComplianceVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComplianceVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComplianceVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.ComplianceVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

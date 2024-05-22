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
// source: grafeas/v1/common.proto

// Protobuf Java Version: 3.25.3
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Digest information.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.Digest}
 */
public final class Digest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Digest)
    DigestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Digest.newBuilder() to construct.
  private Digest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Digest() {
    algo_ = "";
    digestBytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Digest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_Digest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_Digest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Digest.class, io.grafeas.v1.Digest.Builder.class);
  }

  public static final int ALGO_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object algo_ = "";
  /**
   *
   *
   * <pre>
   * `SHA1`, `SHA512` etc.
   * </pre>
   *
   * <code>string algo = 1;</code>
   *
   * @return The algo.
   */
  @java.lang.Override
  public java.lang.String getAlgo() {
    java.lang.Object ref = algo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      algo_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * `SHA1`, `SHA512` etc.
   * </pre>
   *
   * <code>string algo = 1;</code>
   *
   * @return The bytes for algo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAlgoBytes() {
    java.lang.Object ref = algo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      algo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGEST_BYTES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString digestBytes_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * Value of the digest.
   * </pre>
   *
   * <code>bytes digest_bytes = 2;</code>
   *
   * @return The digestBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDigestBytes() {
    return digestBytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(algo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, algo_);
    }
    if (!digestBytes_.isEmpty()) {
      output.writeBytes(2, digestBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(algo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, algo_);
    }
    if (!digestBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, digestBytes_);
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
    if (!(obj instanceof io.grafeas.v1.Digest)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Digest other = (io.grafeas.v1.Digest) obj;

    if (!getAlgo().equals(other.getAlgo())) return false;
    if (!getDigestBytes().equals(other.getDigestBytes())) return false;
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
    hash = (37 * hash) + ALGO_FIELD_NUMBER;
    hash = (53 * hash) + getAlgo().hashCode();
    hash = (37 * hash) + DIGEST_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getDigestBytes().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Digest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Digest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Digest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Digest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Digest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Digest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Digest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Digest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Digest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Digest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Digest parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Digest parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.Digest prototype) {
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
   * Digest information.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.Digest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Digest)
      io.grafeas.v1.DigestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_Digest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_Digest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Digest.class, io.grafeas.v1.Digest.Builder.class);
    }

    // Construct using io.grafeas.v1.Digest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      algo_ = "";
      digestBytes_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_Digest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Digest getDefaultInstanceForType() {
      return io.grafeas.v1.Digest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Digest build() {
      io.grafeas.v1.Digest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Digest buildPartial() {
      io.grafeas.v1.Digest result = new io.grafeas.v1.Digest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.Digest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.algo_ = algo_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.digestBytes_ = digestBytes_;
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
      if (other instanceof io.grafeas.v1.Digest) {
        return mergeFrom((io.grafeas.v1.Digest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Digest other) {
      if (other == io.grafeas.v1.Digest.getDefaultInstance()) return this;
      if (!other.getAlgo().isEmpty()) {
        algo_ = other.algo_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDigestBytes() != com.google.protobuf.ByteString.EMPTY) {
        setDigestBytes(other.getDigestBytes());
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
                algo_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                digestBytes_ = input.readBytes();
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

    private java.lang.Object algo_ = "";
    /**
     *
     *
     * <pre>
     * `SHA1`, `SHA512` etc.
     * </pre>
     *
     * <code>string algo = 1;</code>
     *
     * @return The algo.
     */
    public java.lang.String getAlgo() {
      java.lang.Object ref = algo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        algo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `SHA1`, `SHA512` etc.
     * </pre>
     *
     * <code>string algo = 1;</code>
     *
     * @return The bytes for algo.
     */
    public com.google.protobuf.ByteString getAlgoBytes() {
      java.lang.Object ref = algo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        algo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `SHA1`, `SHA512` etc.
     * </pre>
     *
     * <code>string algo = 1;</code>
     *
     * @param value The algo to set.
     * @return This builder for chaining.
     */
    public Builder setAlgo(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      algo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `SHA1`, `SHA512` etc.
     * </pre>
     *
     * <code>string algo = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAlgo() {
      algo_ = getDefaultInstance().getAlgo();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `SHA1`, `SHA512` etc.
     * </pre>
     *
     * <code>string algo = 1;</code>
     *
     * @param value The bytes for algo to set.
     * @return This builder for chaining.
     */
    public Builder setAlgoBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      algo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString digestBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Value of the digest.
     * </pre>
     *
     * <code>bytes digest_bytes = 2;</code>
     *
     * @return The digestBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDigestBytes() {
      return digestBytes_;
    }
    /**
     *
     *
     * <pre>
     * Value of the digest.
     * </pre>
     *
     * <code>bytes digest_bytes = 2;</code>
     *
     * @param value The digestBytes to set.
     * @return This builder for chaining.
     */
    public Builder setDigestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digestBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value of the digest.
     * </pre>
     *
     * <code>bytes digest_bytes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDigestBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      digestBytes_ = getDefaultInstance().getDigestBytes();
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.Digest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Digest)
  private static final io.grafeas.v1.Digest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Digest();
  }

  public static io.grafeas.v1.Digest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Digest> PARSER =
      new com.google.protobuf.AbstractParser<Digest>() {
        @java.lang.Override
        public Digest parsePartialFrom(
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

  public static com.google.protobuf.Parser<Digest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Digest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Digest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

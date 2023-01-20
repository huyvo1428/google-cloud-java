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
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

/**
 *
 *
 * <pre>
 * Annotations related to one detected OCR text snippet. This will contain the
 * corresponding text, confidence value, and frame level information for each
 * detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.TextAnnotation}
 */
public final class TextAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p2beta1.TextAnnotation)
    TextAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextAnnotation.newBuilder() to construct.
  private TextAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextAnnotation() {
    text_ = "";
    segments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_TextAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_TextAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.class,
            com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEGMENTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment> segments_;
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment>
      getSegmentsList() {
    return segments_;
  }
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder>
      getSegmentsOrBuilderList() {
    return segments_;
  }
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
   */
  @java.lang.Override
  public int getSegmentsCount() {
    return segments_.size();
  }
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p2beta1.TextSegment getSegments(int index) {
    return segments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder getSegmentsOrBuilder(
      int index) {
    return segments_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    for (int i = 0; i < segments_.size(); i++) {
      output.writeMessage(2, segments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    for (int i = 0; i < segments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, segments_.get(i));
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p2beta1.TextAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p2beta1.TextAnnotation other =
        (com.google.cloud.videointelligence.v1p2beta1.TextAnnotation) obj;

    if (!getText().equals(other.getText())) return false;
    if (!getSegmentsList().equals(other.getSegmentsList())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    if (getSegmentsCount() > 0) {
      hash = (37 * hash) + SEGMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation parseFrom(
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
      com.google.cloud.videointelligence.v1p2beta1.TextAnnotation prototype) {
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
   * Annotations related to one detected OCR text snippet. This will contain the
   * corresponding text, confidence value, and frame level information for each
   * detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.TextAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p2beta1.TextAnnotation)
      com.google.cloud.videointelligence.v1p2beta1.TextAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_TextAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_TextAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.class,
              com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      text_ = "";
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
      } else {
        segments_ = null;
        segmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_TextAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.TextAnnotation getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.TextAnnotation build() {
      com.google.cloud.videointelligence.v1p2beta1.TextAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.TextAnnotation buildPartial() {
      com.google.cloud.videointelligence.v1p2beta1.TextAnnotation result =
          new com.google.cloud.videointelligence.v1p2beta1.TextAnnotation(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.videointelligence.v1p2beta1.TextAnnotation result) {
      if (segmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          segments_ = java.util.Collections.unmodifiableList(segments_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.segments_ = segments_;
      } else {
        result.segments_ = segmentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.videointelligence.v1p2beta1.TextAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p2beta1.TextAnnotation) {
        return mergeFrom((com.google.cloud.videointelligence.v1p2beta1.TextAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p2beta1.TextAnnotation other) {
      if (other == com.google.cloud.videointelligence.v1p2beta1.TextAnnotation.getDefaultInstance())
        return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (segmentsBuilder_ == null) {
        if (!other.segments_.isEmpty()) {
          if (segments_.isEmpty()) {
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSegmentsIsMutable();
            segments_.addAll(other.segments_);
          }
          onChanged();
        }
      } else {
        if (!other.segments_.isEmpty()) {
          if (segmentsBuilder_.isEmpty()) {
            segmentsBuilder_.dispose();
            segmentsBuilder_ = null;
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000002);
            segmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSegmentsFieldBuilder()
                    : null;
          } else {
            segmentsBuilder_.addAllMessages(other.segments_);
          }
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
                text_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.videointelligence.v1p2beta1.TextSegment m =
                    input.readMessage(
                        com.google.cloud.videointelligence.v1p2beta1.TextSegment.parser(),
                        extensionRegistry);
                if (segmentsBuilder_ == null) {
                  ensureSegmentsIsMutable();
                  segments_.add(m);
                } else {
                  segmentsBuilder_.addMessage(m);
                }
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

    private java.lang.Object text_ = "";
    /**
     *
     *
     * <pre>
     * The detected text.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The detected text.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The detected text.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detected text.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detected text.
     * </pre>
     *
     * <code>string text = 1;</code>
     *
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment> segments_ =
        java.util.Collections.emptyList();

    private void ensureSegmentsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        segments_ =
            new java.util.ArrayList<com.google.cloud.videointelligence.v1p2beta1.TextSegment>(
                segments_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p2beta1.TextSegment,
            com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder,
            com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder>
        segmentsBuilder_;

    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment>
        getSegmentsList() {
      if (segmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(segments_);
      } else {
        return segmentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public int getSegmentsCount() {
      if (segmentsBuilder_ == null) {
        return segments_.size();
      } else {
        return segmentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p2beta1.TextSegment getSegments(int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);
      } else {
        return segmentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder setSegments(
        int index, com.google.cloud.videointelligence.v1p2beta1.TextSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.set(index, value);
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder setSegments(
        int index,
        com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.set(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder addSegments(com.google.cloud.videointelligence.v1p2beta1.TextSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder addSegments(
        int index, com.google.cloud.videointelligence.v1p2beta1.TextSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(index, value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder addSegments(
        com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder addSegments(
        int index,
        com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder addAllSegments(
        java.lang.Iterable<? extends com.google.cloud.videointelligence.v1p2beta1.TextSegment>
            values) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, segments_);
        onChanged();
      } else {
        segmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder clearSegments() {
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public Builder removeSegments(int index) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.remove(index);
        onChanged();
      } else {
        segmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder getSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder getSegmentsOrBuilder(
        int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);
      } else {
        return segmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder>
        getSegmentsOrBuilderList() {
      if (segmentsBuilder_ != null) {
        return segmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(segments_);
      }
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder addSegmentsBuilder() {
      return getSegmentsFieldBuilder()
          .addBuilder(
              com.google.cloud.videointelligence.v1p2beta1.TextSegment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder addSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.videointelligence.v1p2beta1.TextSegment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All video segments where OCR detected text appears.
     * </pre>
     *
     * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 2;</code>
     */
    public java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder>
        getSegmentsBuilderList() {
      return getSegmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.videointelligence.v1p2beta1.TextSegment,
            com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder,
            com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder>
        getSegmentsFieldBuilder() {
      if (segmentsBuilder_ == null) {
        segmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.videointelligence.v1p2beta1.TextSegment,
                com.google.cloud.videointelligence.v1p2beta1.TextSegment.Builder,
                com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder>(
                segments_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        segments_ = null;
      }
      return segmentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p2beta1.TextAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p2beta1.TextAnnotation)
  private static final com.google.cloud.videointelligence.v1p2beta1.TextAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p2beta1.TextAnnotation();
  }

  public static com.google.cloud.videointelligence.v1p2beta1.TextAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<TextAnnotation>() {
        @java.lang.Override
        public TextAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p2beta1.TextAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

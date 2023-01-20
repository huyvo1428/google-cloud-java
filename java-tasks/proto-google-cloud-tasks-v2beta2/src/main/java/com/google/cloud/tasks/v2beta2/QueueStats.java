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
// source: google/cloud/tasks/v2beta2/queue.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * Statistics for a queue.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.QueueStats}
 */
public final class QueueStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.QueueStats)
    QueueStatsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueueStats.newBuilder() to construct.
  private QueueStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueueStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueueStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta2.QueueProto
        .internal_static_google_cloud_tasks_v2beta2_QueueStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.QueueProto
        .internal_static_google_cloud_tasks_v2beta2_QueueStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.QueueStats.class,
            com.google.cloud.tasks.v2beta2.QueueStats.Builder.class);
  }

  public static final int TASKS_COUNT_FIELD_NUMBER = 1;
  private long tasksCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the number of tasks in the queue, that is, the tasks in
   * the queue that haven't been executed, the tasks in the queue which the
   * queue has dispatched but has not yet received a reply for, and the failed
   * tasks that the queue is retrying.
   * </pre>
   *
   * <code>int64 tasks_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The tasksCount.
   */
  @java.lang.Override
  public long getTasksCount() {
    return tasksCount_;
  }

  public static final int OLDEST_ESTIMATED_ARRIVAL_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp oldestEstimatedArrivalTime_;
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the oldestEstimatedArrivalTime field is set.
   */
  @java.lang.Override
  public boolean hasOldestEstimatedArrivalTime() {
    return oldestEstimatedArrivalTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The oldestEstimatedArrivalTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getOldestEstimatedArrivalTime() {
    return oldestEstimatedArrivalTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : oldestEstimatedArrivalTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. An estimation of the nearest time in the future where a task in the queue
   * is scheduled to be executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getOldestEstimatedArrivalTimeOrBuilder() {
    return oldestEstimatedArrivalTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : oldestEstimatedArrivalTime_;
  }

  public static final int EXECUTED_LAST_MINUTE_COUNT_FIELD_NUMBER = 3;
  private long executedLastMinuteCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. The number of tasks that the queue has dispatched and received a reply for
   * during the last minute. This variable counts both successful and
   * non-successful executions.
   * </pre>
   *
   * <code>int64 executed_last_minute_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The executedLastMinuteCount.
   */
  @java.lang.Override
  public long getExecutedLastMinuteCount() {
    return executedLastMinuteCount_;
  }

  public static final int CONCURRENT_DISPATCHES_COUNT_FIELD_NUMBER = 4;
  private long concurrentDispatchesCount_ = 0L;
  /**
   *
   *
   * <pre>
   * Output only. The number of requests that the queue has dispatched but has not received
   * a reply for yet.
   * </pre>
   *
   * <code>int64 concurrent_dispatches_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The concurrentDispatchesCount.
   */
  @java.lang.Override
  public long getConcurrentDispatchesCount() {
    return concurrentDispatchesCount_;
  }

  public static final int EFFECTIVE_EXECUTION_RATE_FIELD_NUMBER = 5;
  private double effectiveExecutionRate_ = 0D;
  /**
   *
   *
   * <pre>
   * Output only. The current maximum number of tasks per second executed by the queue.
   * The maximum value of this variable is controlled by the RateLimits of the
   * Queue. However, this value could be less to avoid overloading the endpoints
   * tasks in the queue are targeting.
   * </pre>
   *
   * <code>double effective_execution_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The effectiveExecutionRate.
   */
  @java.lang.Override
  public double getEffectiveExecutionRate() {
    return effectiveExecutionRate_;
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
    if (tasksCount_ != 0L) {
      output.writeInt64(1, tasksCount_);
    }
    if (oldestEstimatedArrivalTime_ != null) {
      output.writeMessage(2, getOldestEstimatedArrivalTime());
    }
    if (executedLastMinuteCount_ != 0L) {
      output.writeInt64(3, executedLastMinuteCount_);
    }
    if (concurrentDispatchesCount_ != 0L) {
      output.writeInt64(4, concurrentDispatchesCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(effectiveExecutionRate_) != 0) {
      output.writeDouble(5, effectiveExecutionRate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tasksCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, tasksCount_);
    }
    if (oldestEstimatedArrivalTime_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getOldestEstimatedArrivalTime());
    }
    if (executedLastMinuteCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, executedLastMinuteCount_);
    }
    if (concurrentDispatchesCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, concurrentDispatchesCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(effectiveExecutionRate_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(5, effectiveExecutionRate_);
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.QueueStats)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.QueueStats other =
        (com.google.cloud.tasks.v2beta2.QueueStats) obj;

    if (getTasksCount() != other.getTasksCount()) return false;
    if (hasOldestEstimatedArrivalTime() != other.hasOldestEstimatedArrivalTime()) return false;
    if (hasOldestEstimatedArrivalTime()) {
      if (!getOldestEstimatedArrivalTime().equals(other.getOldestEstimatedArrivalTime()))
        return false;
    }
    if (getExecutedLastMinuteCount() != other.getExecutedLastMinuteCount()) return false;
    if (getConcurrentDispatchesCount() != other.getConcurrentDispatchesCount()) return false;
    if (java.lang.Double.doubleToLongBits(getEffectiveExecutionRate())
        != java.lang.Double.doubleToLongBits(other.getEffectiveExecutionRate())) return false;
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
    hash = (37 * hash) + TASKS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTasksCount());
    if (hasOldestEstimatedArrivalTime()) {
      hash = (37 * hash) + OLDEST_ESTIMATED_ARRIVAL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOldestEstimatedArrivalTime().hashCode();
    }
    hash = (37 * hash) + EXECUTED_LAST_MINUTE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getExecutedLastMinuteCount());
    hash = (37 * hash) + CONCURRENT_DISPATCHES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getConcurrentDispatchesCount());
    hash = (37 * hash) + EFFECTIVE_EXECUTION_RATE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getEffectiveExecutionRate()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.QueueStats prototype) {
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
   * Statistics for a queue.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.QueueStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.QueueStats)
      com.google.cloud.tasks.v2beta2.QueueStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.QueueProto
          .internal_static_google_cloud_tasks_v2beta2_QueueStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.QueueProto
          .internal_static_google_cloud_tasks_v2beta2_QueueStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.QueueStats.class,
              com.google.cloud.tasks.v2beta2.QueueStats.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.QueueStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tasksCount_ = 0L;
      oldestEstimatedArrivalTime_ = null;
      if (oldestEstimatedArrivalTimeBuilder_ != null) {
        oldestEstimatedArrivalTimeBuilder_.dispose();
        oldestEstimatedArrivalTimeBuilder_ = null;
      }
      executedLastMinuteCount_ = 0L;
      concurrentDispatchesCount_ = 0L;
      effectiveExecutionRate_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.QueueProto
          .internal_static_google_cloud_tasks_v2beta2_QueueStats_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.QueueStats getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.QueueStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.QueueStats build() {
      com.google.cloud.tasks.v2beta2.QueueStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.QueueStats buildPartial() {
      com.google.cloud.tasks.v2beta2.QueueStats result =
          new com.google.cloud.tasks.v2beta2.QueueStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tasks.v2beta2.QueueStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tasksCount_ = tasksCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.oldestEstimatedArrivalTime_ =
            oldestEstimatedArrivalTimeBuilder_ == null
                ? oldestEstimatedArrivalTime_
                : oldestEstimatedArrivalTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.executedLastMinuteCount_ = executedLastMinuteCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.concurrentDispatchesCount_ = concurrentDispatchesCount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.effectiveExecutionRate_ = effectiveExecutionRate_;
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
      if (other instanceof com.google.cloud.tasks.v2beta2.QueueStats) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.QueueStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.QueueStats other) {
      if (other == com.google.cloud.tasks.v2beta2.QueueStats.getDefaultInstance()) return this;
      if (other.getTasksCount() != 0L) {
        setTasksCount(other.getTasksCount());
      }
      if (other.hasOldestEstimatedArrivalTime()) {
        mergeOldestEstimatedArrivalTime(other.getOldestEstimatedArrivalTime());
      }
      if (other.getExecutedLastMinuteCount() != 0L) {
        setExecutedLastMinuteCount(other.getExecutedLastMinuteCount());
      }
      if (other.getConcurrentDispatchesCount() != 0L) {
        setConcurrentDispatchesCount(other.getConcurrentDispatchesCount());
      }
      if (other.getEffectiveExecutionRate() != 0D) {
        setEffectiveExecutionRate(other.getEffectiveExecutionRate());
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
            case 8:
              {
                tasksCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getOldestEstimatedArrivalTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                executedLastMinuteCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                concurrentDispatchesCount_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 41:
              {
                effectiveExecutionRate_ = input.readDouble();
                bitField0_ |= 0x00000010;
                break;
              } // case 41
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

    private long tasksCount_;
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the number of tasks in the queue, that is, the tasks in
     * the queue that haven't been executed, the tasks in the queue which the
     * queue has dispatched but has not yet received a reply for, and the failed
     * tasks that the queue is retrying.
     * </pre>
     *
     * <code>int64 tasks_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The tasksCount.
     */
    @java.lang.Override
    public long getTasksCount() {
      return tasksCount_;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the number of tasks in the queue, that is, the tasks in
     * the queue that haven't been executed, the tasks in the queue which the
     * queue has dispatched but has not yet received a reply for, and the failed
     * tasks that the queue is retrying.
     * </pre>
     *
     * <code>int64 tasks_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The tasksCount to set.
     * @return This builder for chaining.
     */
    public Builder setTasksCount(long value) {

      tasksCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the number of tasks in the queue, that is, the tasks in
     * the queue that haven't been executed, the tasks in the queue which the
     * queue has dispatched but has not yet received a reply for, and the failed
     * tasks that the queue is retrying.
     * </pre>
     *
     * <code>int64 tasks_count = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTasksCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tasksCount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp oldestEstimatedArrivalTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        oldestEstimatedArrivalTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the oldestEstimatedArrivalTime field is set.
     */
    public boolean hasOldestEstimatedArrivalTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The oldestEstimatedArrivalTime.
     */
    public com.google.protobuf.Timestamp getOldestEstimatedArrivalTime() {
      if (oldestEstimatedArrivalTimeBuilder_ == null) {
        return oldestEstimatedArrivalTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : oldestEstimatedArrivalTime_;
      } else {
        return oldestEstimatedArrivalTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setOldestEstimatedArrivalTime(com.google.protobuf.Timestamp value) {
      if (oldestEstimatedArrivalTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oldestEstimatedArrivalTime_ = value;
      } else {
        oldestEstimatedArrivalTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setOldestEstimatedArrivalTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (oldestEstimatedArrivalTimeBuilder_ == null) {
        oldestEstimatedArrivalTime_ = builderForValue.build();
      } else {
        oldestEstimatedArrivalTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeOldestEstimatedArrivalTime(com.google.protobuf.Timestamp value) {
      if (oldestEstimatedArrivalTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && oldestEstimatedArrivalTime_ != null
            && oldestEstimatedArrivalTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getOldestEstimatedArrivalTimeBuilder().mergeFrom(value);
        } else {
          oldestEstimatedArrivalTime_ = value;
        }
      } else {
        oldestEstimatedArrivalTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearOldestEstimatedArrivalTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      oldestEstimatedArrivalTime_ = null;
      if (oldestEstimatedArrivalTimeBuilder_ != null) {
        oldestEstimatedArrivalTimeBuilder_.dispose();
        oldestEstimatedArrivalTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getOldestEstimatedArrivalTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOldestEstimatedArrivalTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getOldestEstimatedArrivalTimeOrBuilder() {
      if (oldestEstimatedArrivalTimeBuilder_ != null) {
        return oldestEstimatedArrivalTimeBuilder_.getMessageOrBuilder();
      } else {
        return oldestEstimatedArrivalTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : oldestEstimatedArrivalTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. An estimation of the nearest time in the future where a task in the queue
     * is scheduled to be executed.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp oldest_estimated_arrival_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getOldestEstimatedArrivalTimeFieldBuilder() {
      if (oldestEstimatedArrivalTimeBuilder_ == null) {
        oldestEstimatedArrivalTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getOldestEstimatedArrivalTime(), getParentForChildren(), isClean());
        oldestEstimatedArrivalTime_ = null;
      }
      return oldestEstimatedArrivalTimeBuilder_;
    }

    private long executedLastMinuteCount_;
    /**
     *
     *
     * <pre>
     * Output only. The number of tasks that the queue has dispatched and received a reply for
     * during the last minute. This variable counts both successful and
     * non-successful executions.
     * </pre>
     *
     * <code>int64 executed_last_minute_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The executedLastMinuteCount.
     */
    @java.lang.Override
    public long getExecutedLastMinuteCount() {
      return executedLastMinuteCount_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The number of tasks that the queue has dispatched and received a reply for
     * during the last minute. This variable counts both successful and
     * non-successful executions.
     * </pre>
     *
     * <code>int64 executed_last_minute_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The executedLastMinuteCount to set.
     * @return This builder for chaining.
     */
    public Builder setExecutedLastMinuteCount(long value) {

      executedLastMinuteCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The number of tasks that the queue has dispatched and received a reply for
     * during the last minute. This variable counts both successful and
     * non-successful executions.
     * </pre>
     *
     * <code>int64 executed_last_minute_count = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExecutedLastMinuteCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      executedLastMinuteCount_ = 0L;
      onChanged();
      return this;
    }

    private long concurrentDispatchesCount_;
    /**
     *
     *
     * <pre>
     * Output only. The number of requests that the queue has dispatched but has not received
     * a reply for yet.
     * </pre>
     *
     * <code>int64 concurrent_dispatches_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The concurrentDispatchesCount.
     */
    @java.lang.Override
    public long getConcurrentDispatchesCount() {
      return concurrentDispatchesCount_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The number of requests that the queue has dispatched but has not received
     * a reply for yet.
     * </pre>
     *
     * <code>int64 concurrent_dispatches_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The concurrentDispatchesCount to set.
     * @return This builder for chaining.
     */
    public Builder setConcurrentDispatchesCount(long value) {

      concurrentDispatchesCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The number of requests that the queue has dispatched but has not received
     * a reply for yet.
     * </pre>
     *
     * <code>int64 concurrent_dispatches_count = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConcurrentDispatchesCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      concurrentDispatchesCount_ = 0L;
      onChanged();
      return this;
    }

    private double effectiveExecutionRate_;
    /**
     *
     *
     * <pre>
     * Output only. The current maximum number of tasks per second executed by the queue.
     * The maximum value of this variable is controlled by the RateLimits of the
     * Queue. However, this value could be less to avoid overloading the endpoints
     * tasks in the queue are targeting.
     * </pre>
     *
     * <code>double effective_execution_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The effectiveExecutionRate.
     */
    @java.lang.Override
    public double getEffectiveExecutionRate() {
      return effectiveExecutionRate_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The current maximum number of tasks per second executed by the queue.
     * The maximum value of this variable is controlled by the RateLimits of the
     * Queue. However, this value could be less to avoid overloading the endpoints
     * tasks in the queue are targeting.
     * </pre>
     *
     * <code>double effective_execution_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The effectiveExecutionRate to set.
     * @return This builder for chaining.
     */
    public Builder setEffectiveExecutionRate(double value) {

      effectiveExecutionRate_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The current maximum number of tasks per second executed by the queue.
     * The maximum value of this variable is controlled by the RateLimits of the
     * Queue. However, this value could be less to avoid overloading the endpoints
     * tasks in the queue are targeting.
     * </pre>
     *
     * <code>double effective_execution_rate = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEffectiveExecutionRate() {
      bitField0_ = (bitField0_ & ~0x00000010);
      effectiveExecutionRate_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.QueueStats)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.QueueStats)
  private static final com.google.cloud.tasks.v2beta2.QueueStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.QueueStats();
  }

  public static com.google.cloud.tasks.v2beta2.QueueStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueueStats> PARSER =
      new com.google.protobuf.AbstractParser<QueueStats>() {
        @java.lang.Override
        public QueueStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueueStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueueStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.QueueStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

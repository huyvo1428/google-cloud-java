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
// source: google/cloud/tasks/v2beta2/task.proto

package com.google.cloud.tasks.v2beta2;

public interface TaskStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.TaskStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The number of attempts dispatched.
   * This count includes attempts which have been dispatched but haven't
   * received a response.
   * </pre>
   *
   * <code>int32 attempt_dispatch_count = 1;</code>
   *
   * @return The attemptDispatchCount.
   */
  int getAttemptDispatchCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of attempts which have received a response.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>int32 attempt_response_count = 2;</code>
   *
   * @return The attemptResponseCount.
   */
  int getAttemptResponseCount();

  /**
   *
   *
   * <pre>
   * Output only. The status of the task's first attempt.
   * Only
   * [dispatch_time][google.cloud.tasks.v2beta2.AttemptStatus.dispatch_time]
   * will be set. The other
   * [AttemptStatus][google.cloud.tasks.v2beta2.AttemptStatus] information is
   * not retained by Cloud Tasks.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus first_attempt_status = 3;</code>
   *
   * @return Whether the firstAttemptStatus field is set.
   */
  boolean hasFirstAttemptStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the task's first attempt.
   * Only
   * [dispatch_time][google.cloud.tasks.v2beta2.AttemptStatus.dispatch_time]
   * will be set. The other
   * [AttemptStatus][google.cloud.tasks.v2beta2.AttemptStatus] information is
   * not retained by Cloud Tasks.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus first_attempt_status = 3;</code>
   *
   * @return The firstAttemptStatus.
   */
  com.google.cloud.tasks.v2beta2.AttemptStatus getFirstAttemptStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the task's first attempt.
   * Only
   * [dispatch_time][google.cloud.tasks.v2beta2.AttemptStatus.dispatch_time]
   * will be set. The other
   * [AttemptStatus][google.cloud.tasks.v2beta2.AttemptStatus] information is
   * not retained by Cloud Tasks.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus first_attempt_status = 3;</code>
   */
  com.google.cloud.tasks.v2beta2.AttemptStatusOrBuilder getFirstAttemptStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The status of the task's last attempt.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus last_attempt_status = 4;</code>
   *
   * @return Whether the lastAttemptStatus field is set.
   */
  boolean hasLastAttemptStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the task's last attempt.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus last_attempt_status = 4;</code>
   *
   * @return The lastAttemptStatus.
   */
  com.google.cloud.tasks.v2beta2.AttemptStatus getLastAttemptStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of the task's last attempt.
   * This field is not calculated for [pull
   * tasks][google.cloud.tasks.v2beta2.PullMessage].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AttemptStatus last_attempt_status = 4;</code>
   */
  com.google.cloud.tasks.v2beta2.AttemptStatusOrBuilder getLastAttemptStatusOrBuilder();
}

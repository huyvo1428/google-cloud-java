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
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface ColumnDescriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.ColumnDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Data type of the column
   * Supported types are auto_id, boolean, boolean_list, creator,
   * create_timestamp, date, dropdown, location, integer,
   * integer_list, number, number_list, person, person_list, tags, check_list,
   * text, text_list, update_timestamp, updater, relationship,
   * file_attachment_list.
   * These types directly map to the column types supported on Tables website.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   *
   *
   * <pre>
   * Data type of the column
   * Supported types are auto_id, boolean, boolean_list, creator,
   * create_timestamp, date, dropdown, location, integer,
   * integer_list, number, number_list, person, person_list, tags, check_list,
   * text, text_list, update_timestamp, updater, relationship,
   * file_attachment_list.
   * These types directly map to the column types supported on Tables website.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString getDataTypeBytes();

  /**
   *
   *
   * <pre>
   * Internal id for a column.
   * </pre>
   *
   * <code>string id = 3;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Internal id for a column.
   * </pre>
   *
   * <code>string id = 3;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Range of labeled values for the column.
   * Some columns like tags and drop-downs limit the values to a set of
   * possible values. We return the range of values in such cases to help
   * clients implement better user data validation.
   * </pre>
   *
   * <code>
   * repeated .google.area120.tables.v1alpha1.LabeledItem labels = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.area120.tables.v1alpha1.LabeledItem> getLabelsList();
  /**
   *
   *
   * <pre>
   * Optional. Range of labeled values for the column.
   * Some columns like tags and drop-downs limit the values to a set of
   * possible values. We return the range of values in such cases to help
   * clients implement better user data validation.
   * </pre>
   *
   * <code>
   * repeated .google.area120.tables.v1alpha1.LabeledItem labels = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.area120.tables.v1alpha1.LabeledItem getLabels(int index);
  /**
   *
   *
   * <pre>
   * Optional. Range of labeled values for the column.
   * Some columns like tags and drop-downs limit the values to a set of
   * possible values. We return the range of values in such cases to help
   * clients implement better user data validation.
   * </pre>
   *
   * <code>
   * repeated .google.area120.tables.v1alpha1.LabeledItem labels = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Range of labeled values for the column.
   * Some columns like tags and drop-downs limit the values to a set of
   * possible values. We return the range of values in such cases to help
   * clients implement better user data validation.
   * </pre>
   *
   * <code>
   * repeated .google.area120.tables.v1alpha1.LabeledItem labels = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.area120.tables.v1alpha1.LabeledItemOrBuilder>
      getLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Range of labeled values for the column.
   * Some columns like tags and drop-downs limit the values to a set of
   * possible values. We return the range of values in such cases to help
   * clients implement better user data validation.
   * </pre>
   *
   * <code>
   * repeated .google.area120.tables.v1alpha1.LabeledItem labels = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.area120.tables.v1alpha1.LabeledItemOrBuilder getLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Additional details about a relationship column. Specified when data_type
   * is relationship.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.RelationshipDetails relationship_details = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the relationshipDetails field is set.
   */
  boolean hasRelationshipDetails();
  /**
   *
   *
   * <pre>
   * Optional. Additional details about a relationship column. Specified when data_type
   * is relationship.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.RelationshipDetails relationship_details = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The relationshipDetails.
   */
  com.google.area120.tables.v1alpha1.RelationshipDetails getRelationshipDetails();
  /**
   *
   *
   * <pre>
   * Optional. Additional details about a relationship column. Specified when data_type
   * is relationship.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.RelationshipDetails relationship_details = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.area120.tables.v1alpha1.RelationshipDetailsOrBuilder getRelationshipDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this is a lookup column whose value is derived from the
   * relationship column specified in the details. Lookup columns can not be
   * updated directly. To change the value you must update the associated
   * relationship column.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.LookupDetails lookup_details = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the lookupDetails field is set.
   */
  boolean hasLookupDetails();
  /**
   *
   *
   * <pre>
   * Optional. Indicates that this is a lookup column whose value is derived from the
   * relationship column specified in the details. Lookup columns can not be
   * updated directly. To change the value you must update the associated
   * relationship column.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.LookupDetails lookup_details = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The lookupDetails.
   */
  com.google.area120.tables.v1alpha1.LookupDetails getLookupDetails();
  /**
   *
   *
   * <pre>
   * Optional. Indicates that this is a lookup column whose value is derived from the
   * relationship column specified in the details. Lookup columns can not be
   * updated directly. To change the value you must update the associated
   * relationship column.
   * </pre>
   *
   * <code>
   * .google.area120.tables.v1alpha1.LookupDetails lookup_details = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.area120.tables.v1alpha1.LookupDetailsOrBuilder getLookupDetailsOrBuilder();
}
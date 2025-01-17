// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v3/common.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.common.v3;

public interface ObjectDependencyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v3.ObjectDependency)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();

  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * object relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <pre>
   * object relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subjectType.
   */
  java.lang.String getSubjectType();
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for subjectType.
   */
  com.google.protobuf.ByteString
      getSubjectTypeBytes();

  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subjectId.
   */
  java.lang.String getSubjectId();
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for subjectId.
   */
  com.google.protobuf.ByteString
      getSubjectIdBytes();

  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The subjectRelation.
   */
  java.lang.String getSubjectRelation();
  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for subjectRelation.
   */
  com.google.protobuf.ByteString
      getSubjectRelationBytes();

  /**
   * <pre>
   * dependency depth
   * </pre>
   *
   * <code>int32 depth = 7 [json_name = "depth", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The depth.
   */
  int getDepth();

  /**
   * <pre>
   * dependency cycle
   * </pre>
   *
   * <code>bool is_cycle = 8 [json_name = "isCycle", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The isCycle.
   */
  boolean getIsCycle();

  /**
   * <pre>
   * dependency path
   * </pre>
   *
   * <code>repeated string path = 9 [json_name = "path", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the path.
   */
  java.util.List<java.lang.String>
      getPathList();
  /**
   * <pre>
   * dependency path
   * </pre>
   *
   * <code>repeated string path = 9 [json_name = "path", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of path.
   */
  int getPathCount();
  /**
   * <pre>
   * dependency path
   * </pre>
   *
   * <code>repeated string path = 9 [json_name = "path", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The path at the given index.
   */
  java.lang.String getPath(int index);
  /**
   * <pre>
   * dependency path
   * </pre>
   *
   * <code>repeated string path = 9 [json_name = "path", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the path at the given index.
   */
  com.google.protobuf.ByteString
      getPathBytes(int index);
}

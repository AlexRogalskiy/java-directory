// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v3;

public interface GetObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.GetObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();

  /**
   * <pre>
   * object identifier (cs-string)
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.buf.validate.field) = { ... }</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * object identifier (cs-string)
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * materialize the object relations objects
   * </pre>
   *
   * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The withRelations.
   */
  boolean getWithRelations();

  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The page.
   */
  com.aserto.directory.common.v3.PaginationRequest getPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.aserto.directory.common.v3.PaginationRequestOrBuilder getPageOrBuilder();
}

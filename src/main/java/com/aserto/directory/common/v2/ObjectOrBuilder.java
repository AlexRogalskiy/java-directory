// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

package com.aserto.directory.common.v2;

public interface ObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.Object)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * internal object id (uuid)
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * internal object id (uuid)
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * external object key (cs-string)
   * </pre>
   *
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * external object key (cs-string)
   * </pre>
   *
   * <code>string key = 2 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * object type name
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * object type name
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * display name object
   * </pre>
   *
   * <code>string display_name = 4 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * display name object
   * </pre>
   *
   * <code>string display_name = 4 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * property bag
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 5 [json_name = "properties"];</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <pre>
   * property bag
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 5 [json_name = "properties"];</code>
   * @return The properties.
   */
  com.google.protobuf.Struct getProperties();
  /**
   * <pre>
   * property bag
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 5 [json_name = "properties"];</code>
   */
  com.google.protobuf.StructOrBuilder getPropertiesOrBuilder();

  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * deleted timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 22 [json_name = "deletedAt"];</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <pre>
   * deleted timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 22 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  com.google.protobuf.Timestamp getDeletedAt();
  /**
   * <pre>
   * deleted timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_at = 22 [json_name = "deletedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedAtOrBuilder();

  /**
   * <pre>
   * object instance hash
   * </pre>
   *
   * <code>string hash = 23 [json_name = "hash"];</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * object instance hash
   * </pre>
   *
   * <code>string hash = 23 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();
}
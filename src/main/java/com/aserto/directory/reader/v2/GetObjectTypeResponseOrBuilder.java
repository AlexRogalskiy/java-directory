// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetObjectTypeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectTypeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.ObjectType getResult();
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeOrBuilder getResultOrBuilder();
}
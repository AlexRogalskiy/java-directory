// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.writer.v3;

public interface SetObjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v3.SetObjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v3.Object getResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v3.ObjectOrBuilder getResultOrBuilder();
}

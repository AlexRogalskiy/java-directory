// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.model.v3;

public interface SetManifestRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.model.v3.SetManifestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 1 [json_name = "body"];</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 1 [json_name = "body"];</code>
   * @return The body.
   */
  com.aserto.directory.model.v3.Body getBody();
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 1 [json_name = "body"];</code>
   */
  com.aserto.directory.model.v3.BodyOrBuilder getBodyOrBuilder();

  com.aserto.directory.model.v3.SetManifestRequest.MsgCase getMsgCase();
}
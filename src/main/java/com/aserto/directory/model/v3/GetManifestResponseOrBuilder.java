// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.model.v3;

public interface GetManifestResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.model.v3.GetManifestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  com.aserto.directory.model.v3.Metadata getMetadata();
  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   */
  com.aserto.directory.model.v3.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   * @return The body.
   */
  com.aserto.directory.model.v3.Body getBody();
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   */
  com.aserto.directory.model.v3.BodyOrBuilder getBodyOrBuilder();

  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   * @return The model.
   */
  com.google.protobuf.Struct getModel();
  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   */
  com.google.protobuf.StructOrBuilder getModelOrBuilder();

  com.aserto.directory.model.v3.GetManifestResponse.MsgCase getMsgCase();
}

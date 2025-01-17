// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v3/importer.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.importer.v3;

public interface ImportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.importer.v3.ImportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * operation Opcode enum value
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.Opcode op_code = 1 [json_name = "opCode"];</code>
   * @return The enum numeric value on the wire for opCode.
   */
  int getOpCodeValue();
  /**
   * <pre>
   * operation Opcode enum value
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.Opcode op_code = 1 [json_name = "opCode"];</code>
   * @return The opCode.
   */
  com.aserto.directory.importer.v3.Opcode getOpCode();

  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 5 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 5 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v3.Object getObject();
  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 5 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v3.ObjectOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 6 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 6 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.aserto.directory.common.v3.Relation getRelation();
  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 6 [json_name = "relation"];</code>
   */
  com.aserto.directory.common.v3.RelationOrBuilder getRelationOrBuilder();

  com.aserto.directory.importer.v3.ImportRequest.MsgCase getMsgCase();
}

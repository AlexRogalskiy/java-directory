// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v2/importer.proto

package com.aserto.directory.importer.v2;

public interface ImportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.importer.v2.ImportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * operation Opcode enum value
   * </pre>
   *
   * <code>.aserto.directory.importer.v2.Opcode op_code = 1 [json_name = "opCode"];</code>
   * @return The enum numeric value on the wire for opCode.
   */
  int getOpCodeValue();
  /**
   * <pre>
   * operation Opcode enum value
   * </pre>
   *
   * <code>.aserto.directory.importer.v2.Opcode op_code = 1 [json_name = "opCode"];</code>
   * @return The opCode.
   */
  com.aserto.directory.importer.v2.Opcode getOpCode();

  /**
   * <pre>
   * object_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 2 [json_name = "objectType"];</code>
   * @return Whether the objectType field is set.
   */
  boolean hasObjectType();
  /**
   * <pre>
   * object_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 2 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  com.aserto.directory.common.v2.ObjectType getObjectType();
  /**
   * <pre>
   * object_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 2 [json_name = "objectType"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeOrBuilder getObjectTypeOrBuilder();

  /**
   * <pre>
   * permission import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * permission import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 3 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aserto.directory.common.v2.Permission getPermission();
  /**
   * <pre>
   * permission import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 3 [json_name = "permission"];</code>
   */
  com.aserto.directory.common.v2.PermissionOrBuilder getPermissionOrBuilder();

  /**
   * <pre>
   * relation_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 4 [json_name = "relationType"];</code>
   * @return Whether the relationType field is set.
   */
  boolean hasRelationType();
  /**
   * <pre>
   * relation_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 4 [json_name = "relationType"];</code>
   * @return The relationType.
   */
  com.aserto.directory.common.v2.RelationType getRelationType();
  /**
   * <pre>
   * relation_type import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 4 [json_name = "relationType"];</code>
   */
  com.aserto.directory.common.v2.RelationTypeOrBuilder getRelationTypeOrBuilder();

  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 5 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 5 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v2.Object getObject();
  /**
   * <pre>
   * object import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 5 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v2.ObjectOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 6 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 6 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.aserto.directory.common.v2.Relation getRelation();
  /**
   * <pre>
   * relation import message
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 6 [json_name = "relation"];</code>
   */
  com.aserto.directory.common.v2.RelationOrBuilder getRelationOrBuilder();

  com.aserto.directory.importer.v2.ImportRequest.MsgCase getMsgCase();
}
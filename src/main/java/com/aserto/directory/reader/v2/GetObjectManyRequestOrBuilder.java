// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetObjectManyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectManyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.ObjectIdentifier> 
      getParamList();
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifier getParam(int index);
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  int getParamCount();
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
      getParamOrBuilderList();
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getParamOrBuilder(
      int index);
}
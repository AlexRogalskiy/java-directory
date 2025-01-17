// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v2;

public interface GetObjectTypesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectTypesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * array of object types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectType results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.ObjectType> 
      getResultsList();
  /**
   * <pre>
   * array of object types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectType results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.ObjectType getResults(int index);
  /**
   * <pre>
   * array of object types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectType results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * array of object types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectType results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.ObjectTypeOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * array of object types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectType results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  com.aserto.directory.common.v2.PaginationResponse getPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   */
  com.aserto.directory.common.v2.PaginationResponseOrBuilder getPageOrBuilder();
}

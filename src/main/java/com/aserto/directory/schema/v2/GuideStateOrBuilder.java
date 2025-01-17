// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/tenant.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v2;

public interface GuideStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.schema.v2.GuideState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether or not to display the getting started guide.
   * </pre>
   *
   * <code>bool show = 1 [json_name = "show"];</code>
   * @return The show.
   */
  boolean getShow();

  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return Whether the steps field is set.
   */
  boolean hasSteps();
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return The steps.
   */
  com.google.protobuf.Struct getSteps();
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   */
  com.google.protobuf.StructOrBuilder getStepsOrBuilder();
}

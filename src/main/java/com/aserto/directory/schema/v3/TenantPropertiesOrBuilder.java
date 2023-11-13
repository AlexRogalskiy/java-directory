// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v3/tenant.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v3;

public interface TenantPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.schema.v3.TenantProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The kind of tenant.
   * </pre>
   *
   * <code>.aserto.directory.schema.v3.TenantKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * The kind of tenant.
   * </pre>
   *
   * <code>.aserto.directory.schema.v3.TenantKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  com.aserto.directory.schema.v3.TenantKind getKind();

  /**
   * <pre>
   * Whether or not the v2 directory experience enabled for this tenant.
   * </pre>
   *
   * <code>bool directory_v2 = 2 [json_name = "directoryV2"];</code>
   * @return The directoryV2.
   */
  boolean getDirectoryV2();

  /**
   * <pre>
   * If true, the tenant cannot be reverted to the v1 directory experience.
   * </pre>
   *
   * <code>bool directory_v2_only = 3 [json_name = "directoryV2Only"];</code>
   * @return The directoryV2Only.
   */
  boolean getDirectoryV2Only();

  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.AccountProperties account = 4 [json_name = "account"];</code>
   * @return Whether the account field is set.
   */
  boolean hasAccount();
  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.AccountProperties account = 4 [json_name = "account"];</code>
   * @return The account.
   */
  com.aserto.directory.schema.v3.AccountProperties getAccount();
  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.AccountProperties account = 4 [json_name = "account"];</code>
   */
  com.aserto.directory.schema.v3.AccountPropertiesOrBuilder getAccountOrBuilder();
}

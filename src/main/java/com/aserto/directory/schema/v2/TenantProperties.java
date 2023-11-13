// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/tenant.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v2;

/**
 * <pre>
 * Properties of a tenant object
 * </pre>
 *
 * Protobuf type {@code aserto.directory.schema.v2.TenantProperties}
 */
public final class TenantProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.schema.v2.TenantProperties)
    TenantPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TenantProperties.newBuilder() to construct.
  private TenantProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TenantProperties() {
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TenantProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_TenantProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_TenantProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.schema.v2.TenantProperties.class, com.aserto.directory.schema.v2.TenantProperties.Builder.class);
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <pre>
   * The kind of tenant.
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  @java.lang.Override public int getKindValue() {
    return kind_;
  }
  /**
   * <pre>
   * The kind of tenant.
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  @java.lang.Override public com.aserto.directory.schema.v2.TenantKind getKind() {
    com.aserto.directory.schema.v2.TenantKind result = com.aserto.directory.schema.v2.TenantKind.forNumber(kind_);
    return result == null ? com.aserto.directory.schema.v2.TenantKind.UNRECOGNIZED : result;
  }

  public static final int DIRECTORY_V2_FIELD_NUMBER = 2;
  private boolean directoryV2_ = false;
  /**
   * <pre>
   * Whether or not the v2 directory experience enabled for this tenant.
   * </pre>
   *
   * <code>bool directory_v2 = 2 [json_name = "directoryV2"];</code>
   * @return The directoryV2.
   */
  @java.lang.Override
  public boolean getDirectoryV2() {
    return directoryV2_;
  }

  public static final int DIRECTORY_V2_ONLY_FIELD_NUMBER = 3;
  private boolean directoryV2Only_ = false;
  /**
   * <pre>
   * If true, the tenant cannot be reverted to the v1 directory experience.
   * </pre>
   *
   * <code>bool directory_v2_only = 3 [json_name = "directoryV2Only"];</code>
   * @return The directoryV2Only.
   */
  @java.lang.Override
  public boolean getDirectoryV2Only() {
    return directoryV2Only_;
  }

  public static final int ACCOUNT_FIELD_NUMBER = 4;
  private com.aserto.directory.schema.v2.AccountProperties account_;
  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
   * @return The account.
   */
  @java.lang.Override
  public com.aserto.directory.schema.v2.AccountProperties getAccount() {
    return account_ == null ? com.aserto.directory.schema.v2.AccountProperties.getDefaultInstance() : account_;
  }
  /**
   * <pre>
   * Additional properties that are only set accounts (personal tenant).
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.schema.v2.AccountPropertiesOrBuilder getAccountOrBuilder() {
    return account_ == null ? com.aserto.directory.schema.v2.AccountProperties.getDefaultInstance() : account_;
  }

  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.schema.v2.TenantProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.schema.v2.TenantProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.TenantProperties parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.schema.v2.TenantProperties prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Properties of a tenant object
   * </pre>
   *
   * Protobuf type {@code aserto.directory.schema.v2.TenantProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.schema.v2.TenantProperties)
      com.aserto.directory.schema.v2.TenantPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_TenantProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_TenantProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.schema.v2.TenantProperties.class, com.aserto.directory.schema.v2.TenantProperties.Builder.class);
    }

    // Construct using com.aserto.directory.schema.v2.TenantProperties.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAccountFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kind_ = 0;
      directoryV2_ = false;
      directoryV2Only_ = false;
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_TenantProperties_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.TenantProperties getDefaultInstanceForType() {
      return com.aserto.directory.schema.v2.TenantProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.TenantProperties build() {
      com.aserto.directory.schema.v2.TenantProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.TenantProperties buildPartial() {
      com.aserto.directory.schema.v2.TenantProperties result = new com.aserto.directory.schema.v2.TenantProperties(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.schema.v2.TenantProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.directoryV2_ = directoryV2_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.directoryV2Only_ = directoryV2Only_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.account_ = accountBuilder_ == null
            ? account_
            : accountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private int kind_ = 0;
    /**
     * <pre>
     * The kind of tenant.
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override public int getKindValue() {
      return kind_;
    }
    /**
     * <pre>
     * The kind of tenant.
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
     * @param value The enum numeric value on the wire for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of tenant.
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.aserto.directory.schema.v2.TenantKind getKind() {
      com.aserto.directory.schema.v2.TenantKind result = com.aserto.directory.schema.v2.TenantKind.forNumber(kind_);
      return result == null ? com.aserto.directory.schema.v2.TenantKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The kind of tenant.
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.aserto.directory.schema.v2.TenantKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The kind of tenant.
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.TenantKind kind = 1 [json_name = "kind"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private boolean directoryV2_ ;
    /**
     * <pre>
     * Whether or not the v2 directory experience enabled for this tenant.
     * </pre>
     *
     * <code>bool directory_v2 = 2 [json_name = "directoryV2"];</code>
     * @return The directoryV2.
     */
    @java.lang.Override
    public boolean getDirectoryV2() {
      return directoryV2_;
    }
    /**
     * <pre>
     * Whether or not the v2 directory experience enabled for this tenant.
     * </pre>
     *
     * <code>bool directory_v2 = 2 [json_name = "directoryV2"];</code>
     * @param value The directoryV2 to set.
     * @return This builder for chaining.
     */
    public Builder setDirectoryV2(boolean value) {

      directoryV2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not the v2 directory experience enabled for this tenant.
     * </pre>
     *
     * <code>bool directory_v2 = 2 [json_name = "directoryV2"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDirectoryV2() {
      bitField0_ = (bitField0_ & ~0x00000002);
      directoryV2_ = false;
      onChanged();
      return this;
    }

    private boolean directoryV2Only_ ;
    /**
     * <pre>
     * If true, the tenant cannot be reverted to the v1 directory experience.
     * </pre>
     *
     * <code>bool directory_v2_only = 3 [json_name = "directoryV2Only"];</code>
     * @return The directoryV2Only.
     */
    @java.lang.Override
    public boolean getDirectoryV2Only() {
      return directoryV2Only_;
    }
    /**
     * <pre>
     * If true, the tenant cannot be reverted to the v1 directory experience.
     * </pre>
     *
     * <code>bool directory_v2_only = 3 [json_name = "directoryV2Only"];</code>
     * @param value The directoryV2Only to set.
     * @return This builder for chaining.
     */
    public Builder setDirectoryV2Only(boolean value) {

      directoryV2Only_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the tenant cannot be reverted to the v1 directory experience.
     * </pre>
     *
     * <code>bool directory_v2_only = 3 [json_name = "directoryV2Only"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDirectoryV2Only() {
      bitField0_ = (bitField0_ & ~0x00000004);
      directoryV2Only_ = false;
      onChanged();
      return this;
    }

    private com.aserto.directory.schema.v2.AccountProperties account_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.schema.v2.AccountProperties, com.aserto.directory.schema.v2.AccountProperties.Builder, com.aserto.directory.schema.v2.AccountPropertiesOrBuilder> accountBuilder_;
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     * @return The account.
     */
    public com.aserto.directory.schema.v2.AccountProperties getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.aserto.directory.schema.v2.AccountProperties.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public Builder setAccount(com.aserto.directory.schema.v2.AccountProperties value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
      } else {
        accountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public Builder setAccount(
        com.aserto.directory.schema.v2.AccountProperties.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public Builder mergeAccount(com.aserto.directory.schema.v2.AccountProperties value) {
      if (accountBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          account_ != null &&
          account_ != com.aserto.directory.schema.v2.AccountProperties.getDefaultInstance()) {
          getAccountBuilder().mergeFrom(value);
        } else {
          account_ = value;
        }
      } else {
        accountBuilder_.mergeFrom(value);
      }
      if (account_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public Builder clearAccount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public com.aserto.directory.schema.v2.AccountProperties.Builder getAccountBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    public com.aserto.directory.schema.v2.AccountPropertiesOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.aserto.directory.schema.v2.AccountProperties.getDefaultInstance() : account_;
      }
    }
    /**
     * <pre>
     * Additional properties that are only set accounts (personal tenant).
     * </pre>
     *
     * <code>optional .aserto.directory.schema.v2.AccountProperties account = 4 [json_name = "account"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.schema.v2.AccountProperties, com.aserto.directory.schema.v2.AccountProperties.Builder, com.aserto.directory.schema.v2.AccountPropertiesOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.schema.v2.AccountProperties, com.aserto.directory.schema.v2.AccountProperties.Builder, com.aserto.directory.schema.v2.AccountPropertiesOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aserto.directory.schema.v2.TenantProperties)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.schema.v2.TenantProperties)
  private static final com.aserto.directory.schema.v2.TenantProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.schema.v2.TenantProperties();
  }

  public static com.aserto.directory.schema.v2.TenantProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TenantProperties>
      PARSER = new com.google.protobuf.AbstractParser<TenantProperties>() {
    @java.lang.Override
    public TenantProperties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TenantProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TenantProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.schema.v2.TenantProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


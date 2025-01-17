// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/tenant.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v2;

/**
 * <pre>
 * The state of a user's progress through the console's getting started guide.
 * </pre>
 *
 * Protobuf type {@code aserto.directory.schema.v2.GuideState}
 */
public final class GuideState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.schema.v2.GuideState)
    GuideStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuideState.newBuilder() to construct.
  private GuideState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuideState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuideState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.schema.v2.GuideState.class, com.aserto.directory.schema.v2.GuideState.Builder.class);
  }

  private int bitField0_;
  public static final int SHOW_FIELD_NUMBER = 1;
  private boolean show_ = false;
  /**
   * <pre>
   * Whether or not to display the getting started guide.
   * </pre>
   *
   * <code>bool show = 1 [json_name = "show"];</code>
   * @return The show.
   */
  @java.lang.Override
  public boolean getShow() {
    return show_;
  }

  public static final int STEPS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct steps_;
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return Whether the steps field is set.
   */
  @java.lang.Override
  public boolean hasSteps() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return The steps.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getSteps() {
    return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
  }
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getStepsOrBuilder() {
    return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
  }

  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.schema.v2.GuideState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.schema.v2.GuideState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.schema.v2.GuideState prototype) {
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
   * The state of a user's progress through the console's getting started guide.
   * </pre>
   *
   * Protobuf type {@code aserto.directory.schema.v2.GuideState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.schema.v2.GuideState)
      com.aserto.directory.schema.v2.GuideStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.schema.v2.GuideState.class, com.aserto.directory.schema.v2.GuideState.Builder.class);
    }

    // Construct using com.aserto.directory.schema.v2.GuideState.newBuilder()
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
        getStepsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      show_ = false;
      steps_ = null;
      if (stepsBuilder_ != null) {
        stepsBuilder_.dispose();
        stepsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState getDefaultInstanceForType() {
      return com.aserto.directory.schema.v2.GuideState.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState build() {
      com.aserto.directory.schema.v2.GuideState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState buildPartial() {
      com.aserto.directory.schema.v2.GuideState result = new com.aserto.directory.schema.v2.GuideState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.schema.v2.GuideState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.show_ = show_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.steps_ = stepsBuilder_ == null
            ? steps_
            : stepsBuilder_.build();
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

    private boolean show_ ;
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @return The show.
     */
    @java.lang.Override
    public boolean getShow() {
      return show_;
    }
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @param value The show to set.
     * @return This builder for chaining.
     */
    public Builder setShow(boolean value) {

      show_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      show_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct steps_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> stepsBuilder_;
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     * @return Whether the steps field is set.
     */
    public boolean hasSteps() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     * @return The steps.
     */
    public com.google.protobuf.Struct getSteps() {
      if (stepsBuilder_ == null) {
        return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
      } else {
        return stepsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder setSteps(com.google.protobuf.Struct value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        steps_ = value;
      } else {
        stepsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder setSteps(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        steps_ = builderForValue.build();
      } else {
        stepsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder mergeSteps(com.google.protobuf.Struct value) {
      if (stepsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          steps_ != null &&
          steps_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getStepsBuilder().mergeFrom(value);
        } else {
          steps_ = value;
        }
      } else {
        stepsBuilder_.mergeFrom(value);
      }
      if (steps_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder clearSteps() {
      bitField0_ = (bitField0_ & ~0x00000002);
      steps_ = null;
      if (stepsBuilder_ != null) {
        stepsBuilder_.dispose();
        stepsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public com.google.protobuf.Struct.Builder getStepsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStepsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public com.google.protobuf.StructOrBuilder getStepsOrBuilder() {
      if (stepsBuilder_ != null) {
        return stepsBuilder_.getMessageOrBuilder();
      } else {
        return steps_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : steps_;
      }
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getStepsFieldBuilder() {
      if (stepsBuilder_ == null) {
        stepsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getSteps(),
                getParentForChildren(),
                isClean());
        steps_ = null;
      }
      return stepsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.schema.v2.GuideState)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.schema.v2.GuideState)
  private static final com.aserto.directory.schema.v2.GuideState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.schema.v2.GuideState();
  }

  public static com.aserto.directory.schema.v2.GuideState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuideState>
      PARSER = new com.google.protobuf.AbstractParser<GuideState>() {
    @java.lang.Override
    public GuideState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuideState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuideState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.schema.v2.GuideState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


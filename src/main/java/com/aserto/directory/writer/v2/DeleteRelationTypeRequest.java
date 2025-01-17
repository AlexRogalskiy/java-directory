// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.DeleteRelationTypeRequest}
 */
public final class DeleteRelationTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.DeleteRelationTypeRequest)
    DeleteRelationTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRelationTypeRequest.newBuilder() to construct.
  private DeleteRelationTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRelationTypeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRelationTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.DeleteRelationTypeRequest.class, com.aserto.directory.writer.v2.DeleteRelationTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARAM_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.RelationTypeIdentifier param_;
  /**
   * <pre>
   * relation type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  @java.lang.Override
  public boolean hasParam() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * relation type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifier getParam() {
    return param_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : param_;
  }
  /**
   * <pre>
   * relation type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getParamOrBuilder() {
    return param_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : param_;
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.DeleteRelationTypeRequest prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.DeleteRelationTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.DeleteRelationTypeRequest)
      com.aserto.directory.writer.v2.DeleteRelationTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.DeleteRelationTypeRequest.class, com.aserto.directory.writer.v2.DeleteRelationTypeRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.DeleteRelationTypeRequest.newBuilder()
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
        getParamFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      param_ = null;
      if (paramBuilder_ != null) {
        paramBuilder_.dispose();
        paramBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.DeleteRelationTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeRequest build() {
      com.aserto.directory.writer.v2.DeleteRelationTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeRequest buildPartial() {
      com.aserto.directory.writer.v2.DeleteRelationTypeRequest result = new com.aserto.directory.writer.v2.DeleteRelationTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.DeleteRelationTypeRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.param_ = paramBuilder_ == null
            ? param_
            : paramBuilder_.build();
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

    private com.aserto.directory.common.v2.RelationTypeIdentifier param_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> paramBuilder_;
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     * @return Whether the param field is set.
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     * @return The param.
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier getParam() {
      if (paramBuilder_ == null) {
        return param_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : param_;
      } else {
        return paramBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (paramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        param_ = value;
      } else {
        paramBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(
        com.aserto.directory.common.v2.RelationTypeIdentifier.Builder builderForValue) {
      if (paramBuilder_ == null) {
        param_ = builderForValue.build();
      } else {
        paramBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder mergeParam(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (paramBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          param_ != null &&
          param_ != com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance()) {
          getParamBuilder().mergeFrom(value);
        } else {
          param_ = value;
        }
      } else {
        paramBuilder_.mergeFrom(value);
      }
      if (param_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder clearParam() {
      bitField0_ = (bitField0_ & ~0x00000001);
      param_ = null;
      if (paramBuilder_ != null) {
        paramBuilder_.dispose();
        paramBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier.Builder getParamBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getParamOrBuilder() {
      if (paramBuilder_ != null) {
        return paramBuilder_.getMessageOrBuilder();
      } else {
        return param_ == null ?
            com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : param_;
      }
    }
    /**
     * <pre>
     * relation type identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier param = 1 [json_name = "param"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> 
        getParamFieldBuilder() {
      if (paramBuilder_ == null) {
        paramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder>(
                getParam(),
                getParentForChildren(),
                isClean());
        param_ = null;
      }
      return paramBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.DeleteRelationTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.DeleteRelationTypeRequest)
  private static final com.aserto.directory.writer.v2.DeleteRelationTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.DeleteRelationTypeRequest();
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRelationTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRelationTypeRequest>() {
    @java.lang.Override
    public DeleteRelationTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRelationTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRelationTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.DeleteRelationTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


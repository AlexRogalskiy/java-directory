// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.SetRelationTypeRequest}
 */
public final class SetRelationTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.SetRelationTypeRequest)
    SetRelationTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetRelationTypeRequest.newBuilder() to construct.
  private SetRelationTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetRelationTypeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetRelationTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetRelationTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetRelationTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.SetRelationTypeRequest.class, com.aserto.directory.writer.v2.SetRelationTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RELATION_TYPE_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.RelationType relationType_;
  /**
   * <pre>
   * relation type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
   * @return Whether the relationType field is set.
   */
  @java.lang.Override
  public boolean hasRelationType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * relation type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
   * @return The relationType.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationType getRelationType() {
    return relationType_ == null ? com.aserto.directory.common.v2.RelationType.getDefaultInstance() : relationType_;
  }
  /**
   * <pre>
   * relation type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeOrBuilder getRelationTypeOrBuilder() {
    return relationType_ == null ? com.aserto.directory.common.v2.RelationType.getDefaultInstance() : relationType_;
  }

  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetRelationTypeRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.SetRelationTypeRequest prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.SetRelationTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.SetRelationTypeRequest)
      com.aserto.directory.writer.v2.SetRelationTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetRelationTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetRelationTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.SetRelationTypeRequest.class, com.aserto.directory.writer.v2.SetRelationTypeRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.SetRelationTypeRequest.newBuilder()
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
        getRelationTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      relationType_ = null;
      if (relationTypeBuilder_ != null) {
        relationTypeBuilder_.dispose();
        relationTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetRelationTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetRelationTypeRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.SetRelationTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetRelationTypeRequest build() {
      com.aserto.directory.writer.v2.SetRelationTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetRelationTypeRequest buildPartial() {
      com.aserto.directory.writer.v2.SetRelationTypeRequest result = new com.aserto.directory.writer.v2.SetRelationTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.SetRelationTypeRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.relationType_ = relationTypeBuilder_ == null
            ? relationType_
            : relationTypeBuilder_.build();
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

    private com.aserto.directory.common.v2.RelationType relationType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder> relationTypeBuilder_;
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     * @return Whether the relationType field is set.
     */
    public boolean hasRelationType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     * @return The relationType.
     */
    public com.aserto.directory.common.v2.RelationType getRelationType() {
      if (relationTypeBuilder_ == null) {
        return relationType_ == null ? com.aserto.directory.common.v2.RelationType.getDefaultInstance() : relationType_;
      } else {
        return relationTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public Builder setRelationType(com.aserto.directory.common.v2.RelationType value) {
      if (relationTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relationType_ = value;
      } else {
        relationTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public Builder setRelationType(
        com.aserto.directory.common.v2.RelationType.Builder builderForValue) {
      if (relationTypeBuilder_ == null) {
        relationType_ = builderForValue.build();
      } else {
        relationTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public Builder mergeRelationType(com.aserto.directory.common.v2.RelationType value) {
      if (relationTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          relationType_ != null &&
          relationType_ != com.aserto.directory.common.v2.RelationType.getDefaultInstance()) {
          getRelationTypeBuilder().mergeFrom(value);
        } else {
          relationType_ = value;
        }
      } else {
        relationTypeBuilder_.mergeFrom(value);
      }
      if (relationType_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public Builder clearRelationType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      relationType_ = null;
      if (relationTypeBuilder_ != null) {
        relationTypeBuilder_.dispose();
        relationTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public com.aserto.directory.common.v2.RelationType.Builder getRelationTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRelationTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeOrBuilder getRelationTypeOrBuilder() {
      if (relationTypeBuilder_ != null) {
        return relationTypeBuilder_.getMessageOrBuilder();
      } else {
        return relationType_ == null ?
            com.aserto.directory.common.v2.RelationType.getDefaultInstance() : relationType_;
      }
    }
    /**
     * <pre>
     * relation type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationType relation_type = 1 [json_name = "relationType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder> 
        getRelationTypeFieldBuilder() {
      if (relationTypeBuilder_ == null) {
        relationTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder>(
                getRelationType(),
                getParentForChildren(),
                isClean());
        relationType_ = null;
      }
      return relationTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.SetRelationTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.SetRelationTypeRequest)
  private static final com.aserto.directory.writer.v2.SetRelationTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.SetRelationTypeRequest();
  }

  public static com.aserto.directory.writer.v2.SetRelationTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetRelationTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetRelationTypeRequest>() {
    @java.lang.Override
    public SetRelationTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetRelationTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetRelationTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.SetRelationTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


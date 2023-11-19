// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.model.v3;

/**
 * Protobuf type {@code aserto.directory.model.v3.GetManifestResponse}
 */
public final class GetManifestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.model.v3.GetManifestResponse)
    GetManifestResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetManifestResponse.newBuilder() to construct.
  private GetManifestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetManifestResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetManifestResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_GetManifestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.model.v3.GetManifestResponse.class, com.aserto.directory.model.v3.GetManifestResponse.Builder.class);
  }

  private int msgCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object msg_;
  public enum MsgCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    METADATA(1),
    BODY(2),
    MODEL(3),
    MSG_NOT_SET(0);
    private final int value;
    private MsgCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MsgCase valueOf(int value) {
      return forNumber(value);
    }

    public static MsgCase forNumber(int value) {
      switch (value) {
        case 1: return METADATA;
        case 2: return BODY;
        case 3: return MODEL;
        case 0: return MSG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MsgCase
  getMsgCase() {
    return MsgCase.forNumber(
        msgCase_);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return msgCase_ == 1;
  }
  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.aserto.directory.model.v3.Metadata getMetadata() {
    if (msgCase_ == 1) {
       return (com.aserto.directory.model.v3.Metadata) msg_;
    }
    return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
  }
  /**
   * <pre>
   * Manifest metadata
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.model.v3.MetadataOrBuilder getMetadataOrBuilder() {
    if (msgCase_ == 1) {
       return (com.aserto.directory.model.v3.Metadata) msg_;
    }
    return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
  }

  public static final int BODY_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return msgCase_ == 2;
  }
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   * @return The body.
   */
  @java.lang.Override
  public com.aserto.directory.model.v3.Body getBody() {
    if (msgCase_ == 2) {
       return (com.aserto.directory.model.v3.Body) msg_;
    }
    return com.aserto.directory.model.v3.Body.getDefaultInstance();
  }
  /**
   * <pre>
   * Manifest content
   * </pre>
   *
   * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.model.v3.BodyOrBuilder getBodyOrBuilder() {
    if (msgCase_ == 2) {
       return (com.aserto.directory.model.v3.Body) msg_;
    }
    return com.aserto.directory.model.v3.Body.getDefaultInstance();
  }

  public static final int MODEL_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   * @return Whether the model field is set.
   */
  @java.lang.Override
  public boolean hasModel() {
    return msgCase_ == 3;
  }
  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   * @return The model.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getModel() {
    if (msgCase_ == 3) {
       return (com.google.protobuf.Struct) msg_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   * <pre>
   * Model
   * </pre>
   *
   * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getModelOrBuilder() {
    if (msgCase_ == 3) {
       return (com.google.protobuf.Struct) msg_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }

  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.model.v3.GetManifestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.model.v3.GetManifestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.GetManifestResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.model.v3.GetManifestResponse prototype) {
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
   * Protobuf type {@code aserto.directory.model.v3.GetManifestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.model.v3.GetManifestResponse)
      com.aserto.directory.model.v3.GetManifestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_GetManifestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.model.v3.GetManifestResponse.class, com.aserto.directory.model.v3.GetManifestResponse.Builder.class);
    }

    // Construct using com.aserto.directory.model.v3.GetManifestResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (metadataBuilder_ != null) {
        metadataBuilder_.clear();
      }
      if (bodyBuilder_ != null) {
        bodyBuilder_.clear();
      }
      if (modelBuilder_ != null) {
        modelBuilder_.clear();
      }
      msgCase_ = 0;
      msg_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.GetManifestResponse getDefaultInstanceForType() {
      return com.aserto.directory.model.v3.GetManifestResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.GetManifestResponse build() {
      com.aserto.directory.model.v3.GetManifestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.GetManifestResponse buildPartial() {
      com.aserto.directory.model.v3.GetManifestResponse result = new com.aserto.directory.model.v3.GetManifestResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.model.v3.GetManifestResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aserto.directory.model.v3.GetManifestResponse result) {
      result.msgCase_ = msgCase_;
      result.msg_ = this.msg_;
      if (msgCase_ == 1 &&
          metadataBuilder_ != null) {
        result.msg_ = metadataBuilder_.build();
      }
      if (msgCase_ == 2 &&
          bodyBuilder_ != null) {
        result.msg_ = bodyBuilder_.build();
      }
      if (msgCase_ == 3 &&
          modelBuilder_ != null) {
        result.msg_ = modelBuilder_.build();
      }
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
    private int msgCase_ = 0;
    private java.lang.Object msg_;
    public MsgCase
        getMsgCase() {
      return MsgCase.forNumber(
          msgCase_);
    }

    public Builder clearMsg() {
      msgCase_ = 0;
      msg_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.model.v3.Metadata, com.aserto.directory.model.v3.Metadata.Builder, com.aserto.directory.model.v3.MetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    @java.lang.Override
    public boolean hasMetadata() {
      return msgCase_ == 1;
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    @java.lang.Override
    public com.aserto.directory.model.v3.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        if (msgCase_ == 1) {
          return (com.aserto.directory.model.v3.Metadata) msg_;
        }
        return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
      } else {
        if (msgCase_ == 1) {
          return metadataBuilder_.getMessage();
        }
        return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.aserto.directory.model.v3.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }
      msgCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.aserto.directory.model.v3.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.aserto.directory.model.v3.Metadata value) {
      if (metadataBuilder_ == null) {
        if (msgCase_ == 1 &&
            msg_ != com.aserto.directory.model.v3.Metadata.getDefaultInstance()) {
          msg_ = com.aserto.directory.model.v3.Metadata.newBuilder((com.aserto.directory.model.v3.Metadata) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 1) {
          metadataBuilder_.mergeFrom(value);
        } else {
          metadataBuilder_.setMessage(value);
        }
      }
      msgCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        if (msgCase_ == 1) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 1) {
          msgCase_ = 0;
          msg_ = null;
        }
        metadataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    public com.aserto.directory.model.v3.Metadata.Builder getMetadataBuilder() {
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.model.v3.MetadataOrBuilder getMetadataOrBuilder() {
      if ((msgCase_ == 1) && (metadataBuilder_ != null)) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 1) {
          return (com.aserto.directory.model.v3.Metadata) msg_;
        }
        return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Manifest metadata
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Metadata metadata = 1 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.model.v3.Metadata, com.aserto.directory.model.v3.Metadata.Builder, com.aserto.directory.model.v3.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        if (!(msgCase_ == 1)) {
          msg_ = com.aserto.directory.model.v3.Metadata.getDefaultInstance();
        }
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.model.v3.Metadata, com.aserto.directory.model.v3.Metadata.Builder, com.aserto.directory.model.v3.MetadataOrBuilder>(
                (com.aserto.directory.model.v3.Metadata) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 1;
      onChanged();
      return metadataBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.model.v3.Body, com.aserto.directory.model.v3.Body.Builder, com.aserto.directory.model.v3.BodyOrBuilder> bodyBuilder_;
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     * @return Whether the body field is set.
     */
    @java.lang.Override
    public boolean hasBody() {
      return msgCase_ == 2;
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     * @return The body.
     */
    @java.lang.Override
    public com.aserto.directory.model.v3.Body getBody() {
      if (bodyBuilder_ == null) {
        if (msgCase_ == 2) {
          return (com.aserto.directory.model.v3.Body) msg_;
        }
        return com.aserto.directory.model.v3.Body.getDefaultInstance();
      } else {
        if (msgCase_ == 2) {
          return bodyBuilder_.getMessage();
        }
        return com.aserto.directory.model.v3.Body.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    public Builder setBody(com.aserto.directory.model.v3.Body value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        bodyBuilder_.setMessage(value);
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    public Builder setBody(
        com.aserto.directory.model.v3.Body.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    public Builder mergeBody(com.aserto.directory.model.v3.Body value) {
      if (bodyBuilder_ == null) {
        if (msgCase_ == 2 &&
            msg_ != com.aserto.directory.model.v3.Body.getDefaultInstance()) {
          msg_ = com.aserto.directory.model.v3.Body.newBuilder((com.aserto.directory.model.v3.Body) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 2) {
          bodyBuilder_.mergeFrom(value);
        } else {
          bodyBuilder_.setMessage(value);
        }
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    public Builder clearBody() {
      if (bodyBuilder_ == null) {
        if (msgCase_ == 2) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 2) {
          msgCase_ = 0;
          msg_ = null;
        }
        bodyBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    public com.aserto.directory.model.v3.Body.Builder getBodyBuilder() {
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.model.v3.BodyOrBuilder getBodyOrBuilder() {
      if ((msgCase_ == 2) && (bodyBuilder_ != null)) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 2) {
          return (com.aserto.directory.model.v3.Body) msg_;
        }
        return com.aserto.directory.model.v3.Body.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Manifest content
     * </pre>
     *
     * <code>.aserto.directory.model.v3.Body body = 2 [json_name = "body"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.model.v3.Body, com.aserto.directory.model.v3.Body.Builder, com.aserto.directory.model.v3.BodyOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        if (!(msgCase_ == 2)) {
          msg_ = com.aserto.directory.model.v3.Body.getDefaultInstance();
        }
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.model.v3.Body, com.aserto.directory.model.v3.Body.Builder, com.aserto.directory.model.v3.BodyOrBuilder>(
                (com.aserto.directory.model.v3.Body) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 2;
      onChanged();
      return bodyBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> modelBuilder_;
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     * @return Whether the model field is set.
     */
    @java.lang.Override
    public boolean hasModel() {
      return msgCase_ == 3;
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     * @return The model.
     */
    @java.lang.Override
    public com.google.protobuf.Struct getModel() {
      if (modelBuilder_ == null) {
        if (msgCase_ == 3) {
          return (com.google.protobuf.Struct) msg_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (msgCase_ == 3) {
          return modelBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    public Builder setModel(com.google.protobuf.Struct value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    public Builder setModel(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (modelBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    public Builder mergeModel(com.google.protobuf.Struct value) {
      if (modelBuilder_ == null) {
        if (msgCase_ == 3 &&
            msg_ != com.google.protobuf.Struct.getDefaultInstance()) {
          msg_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 3) {
          modelBuilder_.mergeFrom(value);
        } else {
          modelBuilder_.setMessage(value);
        }
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        if (msgCase_ == 3) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 3) {
          msgCase_ = 0;
          msg_ = null;
        }
        modelBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    public com.google.protobuf.Struct.Builder getModelBuilder() {
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.StructOrBuilder getModelOrBuilder() {
      if ((msgCase_ == 3) && (modelBuilder_ != null)) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 3) {
          return (com.google.protobuf.Struct) msg_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Model
     * </pre>
     *
     * <code>.google.protobuf.Struct model = 3 [json_name = "model"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        if (!(msgCase_ == 3)) {
          msg_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 3;
      onChanged();
      return modelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.model.v3.GetManifestResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.model.v3.GetManifestResponse)
  private static final com.aserto.directory.model.v3.GetManifestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.model.v3.GetManifestResponse();
  }

  public static com.aserto.directory.model.v3.GetManifestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetManifestResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetManifestResponse>() {
    @java.lang.Override
    public GetManifestResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetManifestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetManifestResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.model.v3.GetManifestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

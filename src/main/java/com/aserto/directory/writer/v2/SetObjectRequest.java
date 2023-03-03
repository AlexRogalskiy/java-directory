// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.SetObjectRequest}
 */
public final class SetObjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.SetObjectRequest)
    SetObjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetObjectRequest.newBuilder() to construct.
  private SetObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetObjectRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetObjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.SetObjectRequest.class, com.aserto.directory.writer.v2.SetObjectRequest.Builder.class);
  }

  public static final int OBJECT_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.Object object_;
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return object_ != null;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.Object getObject() {
    return object_ == null ? com.aserto.directory.common.v2.Object.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * 
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.aserto.directory.common.v2.Object.getDefaultInstance() : object_;
  }

  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.SetObjectRequest prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.SetObjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.SetObjectRequest)
      com.aserto.directory.writer.v2.SetObjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.SetObjectRequest.class, com.aserto.directory.writer.v2.SetObjectRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.SetObjectRequest.newBuilder()
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
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.SetObjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectRequest build() {
      com.aserto.directory.writer.v2.SetObjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectRequest buildPartial() {
      com.aserto.directory.writer.v2.SetObjectRequest result = new com.aserto.directory.writer.v2.SetObjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.SetObjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
      }
    }

    private int bitField0_;

    private com.aserto.directory.common.v2.Object object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder, com.aserto.directory.common.v2.ObjectOrBuilder> objectBuilder_;
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     * @return The object.
     */
    public com.aserto.directory.common.v2.Object getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.aserto.directory.common.v2.Object.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(com.aserto.directory.common.v2.Object value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aserto.directory.common.v2.Object.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aserto.directory.common.v2.Object value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          object_ != null &&
          object_ != com.aserto.directory.common.v2.Object.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.Object.Builder getObjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.ObjectOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.aserto.directory.common.v2.Object.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * 
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Object object = 1 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder, com.aserto.directory.common.v2.ObjectOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder, com.aserto.directory.common.v2.ObjectOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.SetObjectRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.SetObjectRequest)
  private static final com.aserto.directory.writer.v2.SetObjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.SetObjectRequest();
  }

  public static com.aserto.directory.writer.v2.SetObjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetObjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetObjectRequest>() {
    @java.lang.Override
    public SetObjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetObjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetObjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.SetObjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

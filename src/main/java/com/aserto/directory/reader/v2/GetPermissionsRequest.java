// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetPermissionsRequest}
 */
public final class GetPermissionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetPermissionsRequest)
    GetPermissionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPermissionsRequest.newBuilder() to construct.
  private GetPermissionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPermissionsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPermissionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetPermissionsRequest.class, com.aserto.directory.reader.v2.GetPermissionsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PAGE_FIELD_NUMBER = 9;
  private com.aserto.directory.common.v2.PaginationRequest page_;
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationRequest getPage() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
  }
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationRequestOrBuilder getPageOrBuilder() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
  }

  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetPermissionsRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetPermissionsRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetPermissionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetPermissionsRequest)
      com.aserto.directory.reader.v2.GetPermissionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetPermissionsRequest.class, com.aserto.directory.reader.v2.GetPermissionsRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetPermissionsRequest.newBuilder()
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
        getPageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionsRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionsRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetPermissionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionsRequest build() {
      com.aserto.directory.reader.v2.GetPermissionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionsRequest buildPartial() {
      com.aserto.directory.reader.v2.GetPermissionsRequest result = new com.aserto.directory.reader.v2.GetPermissionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetPermissionsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
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

    private com.aserto.directory.common.v2.PaginationRequest page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder> pageBuilder_;
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     * @return The page.
     */
    public com.aserto.directory.common.v2.PaginationRequest getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(com.aserto.directory.common.v2.PaginationRequest value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(
        com.aserto.directory.common.v2.PaginationRequest.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder mergePage(com.aserto.directory.common.v2.PaginationRequest value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          page_ != null &&
          page_ != com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      if (page_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationRequest.Builder getPageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationRequestOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
      }
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetPermissionsRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetPermissionsRequest)
  private static final com.aserto.directory.reader.v2.GetPermissionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetPermissionsRequest();
  }

  public static com.aserto.directory.reader.v2.GetPermissionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPermissionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPermissionsRequest>() {
    @java.lang.Override
    public GetPermissionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPermissionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPermissionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetPermissionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


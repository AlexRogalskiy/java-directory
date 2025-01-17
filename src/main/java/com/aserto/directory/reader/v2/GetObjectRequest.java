// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetObjectRequest}
 */
public final class GetObjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetObjectRequest)
    GetObjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectRequest.newBuilder() to construct.
  private GetObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetObjectRequest.class, com.aserto.directory.reader.v2.GetObjectRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARAM_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.ObjectIdentifier param_;
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  @java.lang.Override
  public boolean hasParam() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getParam() {
    return param_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : param_;
  }
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getParamOrBuilder() {
    return param_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : param_;
  }

  public static final int WITH_RELATIONS_FIELD_NUMBER = 2;
  private boolean withRelations_ = false;
  /**
   * <pre>
   * materialize the object relations objects
   * </pre>
   *
   * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
   * @return Whether the withRelations field is set.
   */
  @java.lang.Override
  public boolean hasWithRelations() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * materialize the object relations objects
   * </pre>
   *
   * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
   * @return The withRelations.
   */
  @java.lang.Override
  public boolean getWithRelations() {
    return withRelations_;
  }

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
    return ((bitField0_ & 0x00000004) != 0);
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

  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetObjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetObjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetObjectRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetObjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetObjectRequest)
      com.aserto.directory.reader.v2.GetObjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetObjectRequest.class, com.aserto.directory.reader.v2.GetObjectRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetObjectRequest.newBuilder()
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
        getPageFieldBuilder();
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
      withRelations_ = false;
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
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetObjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectRequest build() {
      com.aserto.directory.reader.v2.GetObjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectRequest buildPartial() {
      com.aserto.directory.reader.v2.GetObjectRequest result = new com.aserto.directory.reader.v2.GetObjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetObjectRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.param_ = paramBuilder_ == null
            ? param_
            : paramBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withRelations_ = withRelations_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
        to_bitField0_ |= 0x00000004;
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

    private com.aserto.directory.common.v2.ObjectIdentifier param_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> paramBuilder_;
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     * @return Whether the param field is set.
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     * @return The param.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getParam() {
      if (paramBuilder_ == null) {
        return param_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : param_;
      } else {
        return paramBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(com.aserto.directory.common.v2.ObjectIdentifier value) {
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
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
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
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder mergeParam(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (paramBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          param_ != null &&
          param_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
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
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
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
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getParamBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getParamOrBuilder() {
      if (paramBuilder_ != null) {
        return paramBuilder_.getMessageOrBuilder();
      } else {
        return param_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : param_;
      }
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getParamFieldBuilder() {
      if (paramBuilder_ == null) {
        paramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                getParam(),
                getParentForChildren(),
                isClean());
        param_ = null;
      }
      return paramBuilder_;
    }

    private boolean withRelations_ ;
    /**
     * <pre>
     * materialize the object relations objects
     * </pre>
     *
     * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
     * @return Whether the withRelations field is set.
     */
    @java.lang.Override
    public boolean hasWithRelations() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * materialize the object relations objects
     * </pre>
     *
     * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
     * @return The withRelations.
     */
    @java.lang.Override
    public boolean getWithRelations() {
      return withRelations_;
    }
    /**
     * <pre>
     * materialize the object relations objects
     * </pre>
     *
     * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
     * @param value The withRelations to set.
     * @return This builder for chaining.
     */
    public Builder setWithRelations(boolean value) {

      withRelations_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * materialize the object relations objects
     * </pre>
     *
     * <code>optional bool with_relations = 2 [json_name = "withRelations"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithRelations() {
      bitField0_ = (bitField0_ & ~0x00000002);
      withRelations_ = false;
      onChanged();
      return this;
    }

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
      return ((bitField0_ & 0x00000004) != 0);
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
      bitField0_ |= 0x00000004;
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
      bitField0_ |= 0x00000004;
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
        if (((bitField0_ & 0x00000004) != 0) &&
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
        bitField0_ |= 0x00000004;
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
      bitField0_ = (bitField0_ & ~0x00000004);
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
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetObjectRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetObjectRequest)
  private static final com.aserto.directory.reader.v2.GetObjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetObjectRequest();
  }

  public static com.aserto.directory.reader.v2.GetObjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectRequest>() {
    @java.lang.Override
    public GetObjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetObjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetObjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


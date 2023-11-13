// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

// Protobuf Java Version: 3.25.0
package com.grpc.gateway.protoc_gen_openapiv2.options;

/**
 * <pre>
 * `Header` is a representation of OpenAPI v2 specification's Header object.
 *
 * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#headerObject
 * </pre>
 *
 * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Header}
 */
public final class Header extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.gateway.protoc_gen_openapiv2.options.Header)
    HeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Header.newBuilder() to construct.
  private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Header() {
    description_ = "";
    type_ = "";
    format_ = "";
    default_ = "";
    pattern_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Header();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Header_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Header_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.gateway.protoc_gen_openapiv2.options.Header.class, com.grpc.gateway.protoc_gen_openapiv2.options.Header.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * `Description` is a short description of the header.
   * </pre>
   *
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `Description` is a short description of the header.
   * </pre>
   *
   * <code>string description = 1 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
   * </pre>
   *
   * <code>string type = 2 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMAT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object format_ = "";
  /**
   * <pre>
   * `Format` The extending format for the previously mentioned type.
   * </pre>
   *
   * <code>string format = 3 [json_name = "format"];</code>
   * @return The format.
   */
  @java.lang.Override
  public java.lang.String getFormat() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      format_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `Format` The extending format for the previously mentioned type.
   * </pre>
   *
   * <code>string format = 3 [json_name = "format"];</code>
   * @return The bytes for format.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFormatBytes() {
    java.lang.Object ref = format_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      format_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object default_ = "";
  /**
   * <pre>
   * `Default` Declares the value of the header that the server will use if none is provided.
   * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
   * Unlike JSON Schema this value MUST conform to the defined type for the header.
   * </pre>
   *
   * <code>string default = 6 [json_name = "default"];</code>
   * @return The default.
   */
  @java.lang.Override
  public java.lang.String getDefault() {
    java.lang.Object ref = default_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      default_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * `Default` Declares the value of the header that the server will use if none is provided.
   * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
   * Unlike JSON Schema this value MUST conform to the defined type for the header.
   * </pre>
   *
   * <code>string default = 6 [json_name = "default"];</code>
   * @return The bytes for default.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultBytes() {
    java.lang.Object ref = default_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      default_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATTERN_FIELD_NUMBER = 13;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pattern_ = "";
  /**
   * <pre>
   * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
   * </pre>
   *
   * <code>string pattern = 13 [json_name = "pattern"];</code>
   * @return The pattern.
   */
  @java.lang.Override
  public java.lang.String getPattern() {
    java.lang.Object ref = pattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pattern_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
   * </pre>
   *
   * <code>string pattern = 13 [json_name = "pattern"];</code>
   * @return The bytes for pattern.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPatternBytes() {
    java.lang.Object ref = pattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pattern_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header parseFrom(
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
  public static Builder newBuilder(com.grpc.gateway.protoc_gen_openapiv2.options.Header prototype) {
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
   * `Header` is a representation of OpenAPI v2 specification's Header object.
   *
   * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#headerObject
   * </pre>
   *
   * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Header}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.gateway.protoc_gen_openapiv2.options.Header)
      com.grpc.gateway.protoc_gen_openapiv2.options.HeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Header_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Header_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.gateway.protoc_gen_openapiv2.options.Header.class, com.grpc.gateway.protoc_gen_openapiv2.options.Header.Builder.class);
    }

    // Construct using com.grpc.gateway.protoc_gen_openapiv2.options.Header.newBuilder()
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
      description_ = "";
      type_ = "";
      format_ = "";
      default_ = "";
      pattern_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Header_descriptor;
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Header getDefaultInstanceForType() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Header.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Header build() {
      com.grpc.gateway.protoc_gen_openapiv2.options.Header result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Header buildPartial() {
      com.grpc.gateway.protoc_gen_openapiv2.options.Header result = new com.grpc.gateway.protoc_gen_openapiv2.options.Header(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.grpc.gateway.protoc_gen_openapiv2.options.Header result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.default_ = default_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.pattern_ = pattern_;
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
    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * `Description` is a short description of the header.
     * </pre>
     *
     * <code>string description = 1 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `Description` is a short description of the header.
     * </pre>
     *
     * <code>string description = 1 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `Description` is a short description of the header.
     * </pre>
     *
     * <code>string description = 1 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Description` is a short description of the header.
     * </pre>
     *
     * <code>string description = 1 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Description` is a short description of the header.
     * </pre>
     *
     * <code>string description = 1 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
     * </pre>
     *
     * <code>string type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
     * </pre>
     *
     * <code>string type = 2 [json_name = "type"];</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
     * </pre>
     *
     * <code>string type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
     * </pre>
     *
     * <code>string type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
     * </pre>
     *
     * <code>string type = 2 [json_name = "type"];</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object format_ = "";
    /**
     * <pre>
     * `Format` The extending format for the previously mentioned type.
     * </pre>
     *
     * <code>string format = 3 [json_name = "format"];</code>
     * @return The format.
     */
    public java.lang.String getFormat() {
      java.lang.Object ref = format_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        format_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `Format` The extending format for the previously mentioned type.
     * </pre>
     *
     * <code>string format = 3 [json_name = "format"];</code>
     * @return The bytes for format.
     */
    public com.google.protobuf.ByteString
        getFormatBytes() {
      java.lang.Object ref = format_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        format_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `Format` The extending format for the previously mentioned type.
     * </pre>
     *
     * <code>string format = 3 [json_name = "format"];</code>
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      format_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Format` The extending format for the previously mentioned type.
     * </pre>
     *
     * <code>string format = 3 [json_name = "format"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      format_ = getDefaultInstance().getFormat();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Format` The extending format for the previously mentioned type.
     * </pre>
     *
     * <code>string format = 3 [json_name = "format"];</code>
     * @param value The bytes for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      format_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object default_ = "";
    /**
     * <pre>
     * `Default` Declares the value of the header that the server will use if none is provided.
     * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
     * Unlike JSON Schema this value MUST conform to the defined type for the header.
     * </pre>
     *
     * <code>string default = 6 [json_name = "default"];</code>
     * @return The default.
     */
    public java.lang.String getDefault() {
      java.lang.Object ref = default_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        default_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * `Default` Declares the value of the header that the server will use if none is provided.
     * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
     * Unlike JSON Schema this value MUST conform to the defined type for the header.
     * </pre>
     *
     * <code>string default = 6 [json_name = "default"];</code>
     * @return The bytes for default.
     */
    public com.google.protobuf.ByteString
        getDefaultBytes() {
      java.lang.Object ref = default_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        default_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * `Default` Declares the value of the header that the server will use if none is provided.
     * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
     * Unlike JSON Schema this value MUST conform to the defined type for the header.
     * </pre>
     *
     * <code>string default = 6 [json_name = "default"];</code>
     * @param value The default to set.
     * @return This builder for chaining.
     */
    public Builder setDefault(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      default_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Default` Declares the value of the header that the server will use if none is provided.
     * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
     * Unlike JSON Schema this value MUST conform to the defined type for the header.
     * </pre>
     *
     * <code>string default = 6 [json_name = "default"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefault() {
      default_ = getDefaultInstance().getDefault();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `Default` Declares the value of the header that the server will use if none is provided.
     * See: https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
     * Unlike JSON Schema this value MUST conform to the defined type for the header.
     * </pre>
     *
     * <code>string default = 6 [json_name = "default"];</code>
     * @param value The bytes for default to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      default_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object pattern_ = "";
    /**
     * <pre>
     * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
     * </pre>
     *
     * <code>string pattern = 13 [json_name = "pattern"];</code>
     * @return The pattern.
     */
    public java.lang.String getPattern() {
      java.lang.Object ref = pattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pattern_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
     * </pre>
     *
     * <code>string pattern = 13 [json_name = "pattern"];</code>
     * @return The bytes for pattern.
     */
    public com.google.protobuf.ByteString
        getPatternBytes() {
      java.lang.Object ref = pattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
     * </pre>
     *
     * <code>string pattern = 13 [json_name = "pattern"];</code>
     * @param value The pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPattern(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pattern_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
     * </pre>
     *
     * <code>string pattern = 13 [json_name = "pattern"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPattern() {
      pattern_ = getDefaultInstance().getPattern();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'Pattern' See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.2.3.
     * </pre>
     *
     * <code>string pattern = 13 [json_name = "pattern"];</code>
     * @param value The bytes for pattern to set.
     * @return This builder for chaining.
     */
    public Builder setPatternBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pattern_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:grpc.gateway.protoc_gen_openapiv2.options.Header)
  }

  // @@protoc_insertion_point(class_scope:grpc.gateway.protoc_gen_openapiv2.options.Header)
  private static final com.grpc.gateway.protoc_gen_openapiv2.options.Header DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.gateway.protoc_gen_openapiv2.options.Header();
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Header getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Header>
      PARSER = new com.google.protobuf.AbstractParser<Header>() {
    @java.lang.Override
    public Header parsePartialFrom(
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

  public static com.google.protobuf.Parser<Header> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Header> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.gateway.protoc_gen_openapiv2.options.Header getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


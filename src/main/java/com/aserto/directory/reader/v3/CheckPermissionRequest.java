// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v3;

/**
 * Protobuf type {@code aserto.directory.reader.v3.CheckPermissionRequest}
 */
public final class CheckPermissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v3.CheckPermissionRequest)
    CheckPermissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckPermissionRequest.newBuilder() to construct.
  private CheckPermissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckPermissionRequest() {
    objectType_ = "";
    objectId_ = "";
    permission_ = "";
    subjectType_ = "";
    subjectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckPermissionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_CheckPermissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_CheckPermissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v3.CheckPermissionRequest.class, com.aserto.directory.reader.v3.CheckPermissionRequest.Builder.class);
  }

  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectType_ = "";
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectType.
   */
  @java.lang.Override
  public java.lang.String getObjectType() {
    java.lang.Object ref = objectType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectTypeBytes() {
    java.lang.Object ref = objectType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectId.
   */
  @java.lang.Override
  public java.lang.String getObjectId() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectIdBytes() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object permission_ = "";
  /**
   * <pre>
   * permission name
   * </pre>
   *
   * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The permission.
   */
  @java.lang.Override
  public java.lang.String getPermission() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      permission_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * permission name
   * </pre>
   *
   * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for permission.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPermissionBytes() {
    java.lang.Object ref = permission_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      permission_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_TYPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectType_ = "";
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectType.
   */
  @java.lang.Override
  public java.lang.String getSubjectType() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectTypeBytes() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectId_ = "";
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectId.
   */
  @java.lang.Override
  public java.lang.String getSubjectId() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectIdBytes() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACE_FIELD_NUMBER = 7;
  private boolean trace_ = false;
  /**
   * <pre>
   * collect trace information
   * </pre>
   *
   * <code>bool trace = 7 [json_name = "trace", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The trace.
   */
  @java.lang.Override
  public boolean getTrace() {
    return trace_;
  }

  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v3.CheckPermissionRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v3.CheckPermissionRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v3.CheckPermissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v3.CheckPermissionRequest)
      com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_CheckPermissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_CheckPermissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v3.CheckPermissionRequest.class, com.aserto.directory.reader.v3.CheckPermissionRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v3.CheckPermissionRequest.newBuilder()
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
      objectType_ = "";
      objectId_ = "";
      permission_ = "";
      subjectType_ = "";
      subjectId_ = "";
      trace_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_CheckPermissionRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckPermissionRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckPermissionRequest build() {
      com.aserto.directory.reader.v3.CheckPermissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckPermissionRequest buildPartial() {
      com.aserto.directory.reader.v3.CheckPermissionRequest result = new com.aserto.directory.reader.v3.CheckPermissionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v3.CheckPermissionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.permission_ = permission_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subjectType_ = subjectType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.subjectId_ = subjectId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.trace_ = trace_;
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

    private java.lang.Object objectType_ = "";
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The objectType.
     */
    public java.lang.String getObjectType() {
      java.lang.Object ref = objectType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for objectType.
     */
    public com.google.protobuf.ByteString
        getObjectTypeBytes() {
      java.lang.Object ref = objectType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      objectType_ = getDefaultInstance().getObjectType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object objectId_ = "";
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The objectId.
     */
    public java.lang.String getObjectId() {
      java.lang.Object ref = objectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for objectId.
     */
    public com.google.protobuf.ByteString
        getObjectIdBytes() {
      java.lang.Object ref = objectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object permission_ = "";
    /**
     * <pre>
     * permission name
     * </pre>
     *
     * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The permission.
     */
    public java.lang.String getPermission() {
      java.lang.Object ref = permission_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        permission_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * permission name
     * </pre>
     *
     * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for permission.
     */
    public com.google.protobuf.ByteString
        getPermissionBytes() {
      java.lang.Object ref = permission_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        permission_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * permission name
     * </pre>
     *
     * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The permission to set.
     * @return This builder for chaining.
     */
    public Builder setPermission(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      permission_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission name
     * </pre>
     *
     * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearPermission() {
      permission_ = getDefaultInstance().getPermission();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission name
     * </pre>
     *
     * <code>string permission = 3 [json_name = "permission", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for permission to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      permission_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object subjectType_ = "";
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The subjectType.
     */
    public java.lang.String getSubjectType() {
      java.lang.Object ref = subjectType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for subjectType.
     */
    public com.google.protobuf.ByteString
        getSubjectTypeBytes() {
      java.lang.Object ref = subjectType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectType() {
      subjectType_ = getDefaultInstance().getSubjectType();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object subjectId_ = "";
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The subjectId.
     */
    public java.lang.String getSubjectId() {
      java.lang.Object ref = subjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for subjectId.
     */
    public com.google.protobuf.ByteString
        getSubjectIdBytes() {
      java.lang.Object ref = subjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectId() {
      subjectId_ = getDefaultInstance().getSubjectId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private boolean trace_ ;
    /**
     * <pre>
     * collect trace information
     * </pre>
     *
     * <code>bool trace = 7 [json_name = "trace", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return The trace.
     */
    @java.lang.Override
    public boolean getTrace() {
      return trace_;
    }
    /**
     * <pre>
     * collect trace information
     * </pre>
     *
     * <code>bool trace = 7 [json_name = "trace", (.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The trace to set.
     * @return This builder for chaining.
     */
    public Builder setTrace(boolean value) {

      trace_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * collect trace information
     * </pre>
     *
     * <code>bool trace = 7 [json_name = "trace", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrace() {
      bitField0_ = (bitField0_ & ~0x00000020);
      trace_ = false;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v3.CheckPermissionRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v3.CheckPermissionRequest)
  private static final com.aserto.directory.reader.v3.CheckPermissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v3.CheckPermissionRequest();
  }

  public static com.aserto.directory.reader.v3.CheckPermissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckPermissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckPermissionRequest>() {
    @java.lang.Override
    public CheckPermissionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckPermissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckPermissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckPermissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


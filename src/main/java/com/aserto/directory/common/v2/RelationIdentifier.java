// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.common.v2;

/**
 * <pre>
 * Relation identifier
 * </pre>
 *
 * Protobuf type {@code aserto.directory.common.v2.RelationIdentifier}
 */
public final class RelationIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.common.v2.RelationIdentifier)
    RelationIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelationIdentifier.newBuilder() to construct.
  private RelationIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationIdentifier() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelationIdentifier();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.common.v2.RelationIdentifier.class, com.aserto.directory.common.v2.RelationIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int SUBJECT_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.ObjectIdentifier subject_;
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  @java.lang.Override
  public boolean hasSubject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return The subject.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getSubject() {
    return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
  }
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder() {
    return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
  }

  public static final int RELATION_FIELD_NUMBER = 2;
  private com.aserto.directory.common.v2.RelationTypeIdentifier relation_;
  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifier getRelation() {
    return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
  }
  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getRelationOrBuilder() {
    return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
  }

  public static final int OBJECT_FIELD_NUMBER = 3;
  private com.aserto.directory.common.v2.ObjectIdentifier object_;
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getObject() {
    return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
  }

  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.common.v2.RelationIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.common.v2.RelationIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.RelationIdentifier parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.common.v2.RelationIdentifier prototype) {
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
   * Relation identifier
   * </pre>
   *
   * Protobuf type {@code aserto.directory.common.v2.RelationIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.common.v2.RelationIdentifier)
      com.aserto.directory.common.v2.RelationIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.common.v2.RelationIdentifier.class, com.aserto.directory.common.v2.RelationIdentifier.Builder.class);
    }

    // Construct using com.aserto.directory.common.v2.RelationIdentifier.newBuilder()
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
        getSubjectFieldBuilder();
        getRelationFieldBuilder();
        getObjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subject_ = null;
      if (subjectBuilder_ != null) {
        subjectBuilder_.dispose();
        subjectBuilder_ = null;
      }
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
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
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationIdentifier getDefaultInstanceForType() {
      return com.aserto.directory.common.v2.RelationIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationIdentifier build() {
      com.aserto.directory.common.v2.RelationIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationIdentifier buildPartial() {
      com.aserto.directory.common.v2.RelationIdentifier result = new com.aserto.directory.common.v2.RelationIdentifier(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.common.v2.RelationIdentifier result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subject_ = subjectBuilder_ == null
            ? subject_
            : subjectBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relation_ = relationBuilder_ == null
            ? relation_
            : relationBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
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

    private com.aserto.directory.common.v2.ObjectIdentifier subject_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> subjectBuilder_;
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     * @return Whether the subject field is set.
     */
    public boolean hasSubject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     * @return The subject.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getSubject() {
      if (subjectBuilder_ == null) {
        return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
      } else {
        return subjectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public Builder setSubject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (subjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subject_ = value;
      } else {
        subjectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public Builder setSubject(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (subjectBuilder_ == null) {
        subject_ = builderForValue.build();
      } else {
        subjectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public Builder mergeSubject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (subjectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          subject_ != null &&
          subject_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
          getSubjectBuilder().mergeFrom(value);
        } else {
          subject_ = value;
        }
      } else {
        subjectBuilder_.mergeFrom(value);
      }
      if (subject_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public Builder clearSubject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subject_ = null;
      if (subjectBuilder_ != null) {
        subjectBuilder_.dispose();
        subjectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getSubjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder() {
      if (subjectBuilder_ != null) {
        return subjectBuilder_.getMessageOrBuilder();
      } else {
        return subject_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getSubjectFieldBuilder() {
      if (subjectBuilder_ == null) {
        subjectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                getSubject(),
                getParentForChildren(),
                isClean());
        subject_ = null;
      }
      return subjectBuilder_;
    }

    private com.aserto.directory.common.v2.RelationTypeIdentifier relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> relationBuilder_;
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
      } else {
        relationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.aserto.directory.common.v2.RelationTypeIdentifier.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (relationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          relation_ != null &&
          relation_ != com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance()) {
          getRelationBuilder().mergeFrom(value);
        } else {
          relation_ = value;
        }
      } else {
        relationBuilder_.mergeFrom(value);
      }
      if (relation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier.Builder getRelationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
      }
    }
    /**
     * <pre>
     * relation identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 2 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    private com.aserto.directory.common.v2.ObjectIdentifier object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> objectBuilder_;
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     * @return The object.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          object_ != null &&
          object_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      if (object_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getObjectBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.common.v2.RelationIdentifier)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.common.v2.RelationIdentifier)
  private static final com.aserto.directory.common.v2.RelationIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.common.v2.RelationIdentifier();
  }

  public static com.aserto.directory.common.v2.RelationIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<RelationIdentifier>() {
    @java.lang.Override
    public RelationIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.common.v2.RelationIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


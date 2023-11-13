// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.model.v3;

public final class ModelProto {
  private ModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_GetManifestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_GetManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_GetManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_SetManifestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_SetManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_SetManifestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_SetManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_DeleteManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_DeleteManifestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_DeleteManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_model_v3_Body_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_model_v3_Body_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%aserto/directory/model/v3/model.proto\022" +
      "\031aserto.directory.model.v3\032\034google/api/a" +
      "nnotations.proto\032\037google/api/field_behav" +
      "ior.proto\032\033google/protobuf/empty.proto\032\034" +
      "google/protobuf/struct.proto\032\037google/pro" +
      "tobuf/timestamp.proto\032.protoc-gen-openap" +
      "iv2/options/annotations.proto\032\033buf/valid" +
      "ate/validate.proto\"B\n\022GetManifestRequest" +
      "\022,\n\005empty\030\001 \001(\0132\026.google.protobuf.EmptyR" +
      "\005empty\"\307\001\n\023GetManifestResponse\022A\n\010metada" +
      "ta\030\001 \001(\0132#.aserto.directory.model.v3.Met" +
      "adataH\000R\010metadata\0225\n\004body\030\002 \001(\0132\037.aserto" +
      ".directory.model.v3.BodyH\000R\004body\022/\n\005mode" +
      "l\030\003 \001(\0132\027.google.protobuf.StructH\000R\005mode" +
      "lB\005\n\003msg\"R\n\022SetManifestRequest\0225\n\004body\030\001" +
      " \001(\0132\037.aserto.directory.model.v3.BodyH\000R" +
      "\004bodyB\005\n\003msg\"E\n\023SetManifestResponse\022.\n\006r" +
      "esult\030\001 \001(\0132\026.google.protobuf.EmptyR\006res" +
      "ult\"E\n\025DeleteManifestRequest\022,\n\005empty\030\001 " +
      "\001(\0132\026.google.protobuf.EmptyR\005empty\"H\n\026De" +
      "leteManifestResponse\022.\n\006result\030\001 \001(\0132\026.g" +
      "oogle.protobuf.EmptyR\006result\"e\n\010Metadata" +
      "\022?\n\nupdated_at\030\025 \001(\0132\032.google.protobuf.T" +
      "imestampB\004\342A\001\003R\tupdatedAt\022\030\n\004etag\030\027 \001(\tB" +
      "\004\342A\001\001R\004etag\"%\n\004Body\022\035\n\004data\030\002 \001(\014B\t\272H\006z\004" +
      "\030\200\200\004R\004data2\210\004\n\005Model\022v\n\013GetManifest\022-.as" +
      "erto.directory.model.v3.GetManifestReque" +
      "st\032..aserto.directory.model.v3.GetManife" +
      "stResponse\"\006\202\323\344\223\002\0000\001\022v\n\013SetManifest\022-.as" +
      "erto.directory.model.v3.SetManifestReque" +
      "st\032..aserto.directory.model.v3.SetManife" +
      "stResponse\"\006\202\323\344\223\002\000(\001\022\216\002\n\016DeleteManifest\022" +
      "0.aserto.directory.model.v3.DeleteManife" +
      "stRequest\0321.aserto.directory.model.v3.De" +
      "leteManifestResponse\"\226\001\222Aq\n\tdirectory\022\017D" +
      "elete manifest\032\020Delete manifest.*\034direct" +
      "ory.v3.manifest.deleteb#\n\023\n\017DirectoryAPI" +
      "Key\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\034*\032/api/v3/direc" +
      "tory/manifestB\375\001\n\035com.aserto.directory.m" +
      "odel.v3B\nModelProtoH\002P\001ZBgithub.com/aser" +
      "to-dev/go-directory/aserto/directory/mod" +
      "el/v3;model\370\001\000\242\002\003ADM\252\002\031Aserto.Directory." +
      "Model.V3\312\002\032Aserto\\Directory_\\Model\\V3\342\002&" +
      "Aserto\\Directory_\\Model\\V3\\GPBMetadata\352\002" +
      "\034Aserto::Directory::Model::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
          com.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_aserto_directory_model_v3_GetManifestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_model_v3_GetManifestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_GetManifestRequest_descriptor,
        new java.lang.String[] { "Empty", });
    internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_model_v3_GetManifestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_GetManifestResponse_descriptor,
        new java.lang.String[] { "Metadata", "Body", "Model", "Msg", });
    internal_static_aserto_directory_model_v3_SetManifestRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_model_v3_SetManifestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_SetManifestRequest_descriptor,
        new java.lang.String[] { "Body", "Msg", });
    internal_static_aserto_directory_model_v3_SetManifestResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aserto_directory_model_v3_SetManifestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_SetManifestResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aserto_directory_model_v3_DeleteManifestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor,
        new java.lang.String[] { "Empty", });
    internal_static_aserto_directory_model_v3_DeleteManifestResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aserto_directory_model_v3_DeleteManifestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_DeleteManifestResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_model_v3_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aserto_directory_model_v3_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_Metadata_descriptor,
        new java.lang.String[] { "UpdatedAt", "Etag", });
    internal_static_aserto_directory_model_v3_Body_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aserto_directory_model_v3_Body_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_model_v3_Body_descriptor,
        new java.lang.String[] { "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.buf.validate.ValidateProto.field);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Operation);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
    com.buf.validate.ValidateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

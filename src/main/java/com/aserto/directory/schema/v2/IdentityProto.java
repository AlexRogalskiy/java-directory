// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/identity.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v2;

public final class IdentityProto {
  private IdentityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_schema_v2_IdentityProperties_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)aserto/directory/schema/v2/identity.pr" +
      "oto\022\032aserto.directory.schema.v2\"\306\001\n\022Iden" +
      "tityProperties\022<\n\004kind\030\001 \001(\0162(.aserto.di" +
      "rectory.schema.v2.IdentityKindR\004kind\022\032\n\010" +
      "provider\030\002 \001(\tR\010provider\022\032\n\010verified\030\003 \001" +
      "(\010R\010verified\022(\n\rconnection_id\030\004 \001(\tH\000R\014c" +
      "onnectionId\210\001\001B\020\n\016_connection_id*\275\001\n\014Ide" +
      "ntityKind\022\031\n\025IDENTITY_KIND_UNKNOWN\020\000\022\025\n\021" +
      "IDENTITY_KIND_PID\020\001\022\027\n\023IDENTITY_KIND_EMA" +
      "IL\020\002\022\032\n\026IDENTITY_KIND_USERNAME\020\003\022\024\n\020IDEN" +
      "TITY_KIND_DN\020\004\022\027\n\023IDENTITY_KIND_PHONE\020\005\022" +
      "\027\n\023IDENTITY_KIND_EMPID\020\006B\207\002\n\036com.aserto." +
      "directory.schema.v2B\rIdentityProtoH\002P\001ZD" +
      "github.com/aserto-dev/go-directory/asert" +
      "o/directory/schema/v2;schema\370\001\000\242\002\003ADS\252\002\032" +
      "Aserto.Directory.Schema.V2\312\002\033Aserto\\Dire" +
      "ctory_\\Schema\\V2\342\002\'Aserto\\Directory_\\Sch" +
      "ema\\V2\\GPBMetadata\352\002\035Aserto::Directory::" +
      "Schema::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_schema_v2_IdentityProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor,
        new java.lang.String[] { "Kind", "Provider", "Verified", "ConnectionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

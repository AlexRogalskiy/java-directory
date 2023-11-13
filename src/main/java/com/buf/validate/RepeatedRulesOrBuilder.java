// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.0
package com.buf.validate;

public interface RepeatedRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.RepeatedRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `min_items` requires that this field must contain at least the specified
   * minimum number of items.
   *
   * Note that `min_items = 1` is equivalent to setting a field as `required`.
   *
   * ```proto
   * message MyRepeated {
   *   // value must contain at least  2 items
   *   repeated string value = 1 [(buf.validate.field).repeated.min_items = 2];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 min_items = 1 [json_name = "minItems", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the minItems field is set.
   */
  boolean hasMinItems();
  /**
   * <pre>
   * `min_items` requires that this field must contain at least the specified
   * minimum number of items.
   *
   * Note that `min_items = 1` is equivalent to setting a field as `required`.
   *
   * ```proto
   * message MyRepeated {
   *   // value must contain at least  2 items
   *   repeated string value = 1 [(buf.validate.field).repeated.min_items = 2];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 min_items = 1 [json_name = "minItems", (.buf.validate.priv.field) = { ... }</code>
   * @return The minItems.
   */
  long getMinItems();

  /**
   * <pre>
   * `max_items` denotes that this field must not exceed a
   * certain number of items as the upper limit. If the field contains more
   * items than specified, an error message will be generated, requiring the
   * field to maintain no more than the specified number of items.
   *
   * ```proto
   * message MyRepeated {
   *   // value must contain no more than 3 item(s)
   *   repeated string value = 1 [(buf.validate.field).repeated.max_items = 3];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 max_items = 2 [json_name = "maxItems", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the maxItems field is set.
   */
  boolean hasMaxItems();
  /**
   * <pre>
   * `max_items` denotes that this field must not exceed a
   * certain number of items as the upper limit. If the field contains more
   * items than specified, an error message will be generated, requiring the
   * field to maintain no more than the specified number of items.
   *
   * ```proto
   * message MyRepeated {
   *   // value must contain no more than 3 item(s)
   *   repeated string value = 1 [(buf.validate.field).repeated.max_items = 3];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 max_items = 2 [json_name = "maxItems", (.buf.validate.priv.field) = { ... }</code>
   * @return The maxItems.
   */
  long getMaxItems();

  /**
   * <pre>
   * `unique` indicates that all elements in this field must
   * be unique. This constraint is strictly applicable to scalar and enum
   * types, with message types not being supported.
   *
   * ```proto
   * message MyRepeated {
   *   // repeated value must contain unique items
   *   repeated string value = 1 [(buf.validate.field).repeated.unique = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool unique = 3 [json_name = "unique", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the unique field is set.
   */
  boolean hasUnique();
  /**
   * <pre>
   * `unique` indicates that all elements in this field must
   * be unique. This constraint is strictly applicable to scalar and enum
   * types, with message types not being supported.
   *
   * ```proto
   * message MyRepeated {
   *   // repeated value must contain unique items
   *   repeated string value = 1 [(buf.validate.field).repeated.unique = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool unique = 3 [json_name = "unique", (.buf.validate.priv.field) = { ... }</code>
   * @return The unique.
   */
  boolean getUnique();

  /**
   * <pre>
   * `items` details the constraints to be applied to each item
   * in the field. Even for repeated message fields, validation is executed
   * against each item unless skip is explicitly specified.
   *
   * ```proto
   * message MyRepeated {
   *   // The items in the field `value` must follow the specified constraints.
   *   repeated string value = 1 [(buf.validate.field).repeated.items = {
   *     string: {
   *       min_len: 3
   *       max_len: 10
   *     }
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>optional .buf.validate.FieldConstraints items = 4 [json_name = "items"];</code>
   * @return Whether the items field is set.
   */
  boolean hasItems();
  /**
   * <pre>
   * `items` details the constraints to be applied to each item
   * in the field. Even for repeated message fields, validation is executed
   * against each item unless skip is explicitly specified.
   *
   * ```proto
   * message MyRepeated {
   *   // The items in the field `value` must follow the specified constraints.
   *   repeated string value = 1 [(buf.validate.field).repeated.items = {
   *     string: {
   *       min_len: 3
   *       max_len: 10
   *     }
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>optional .buf.validate.FieldConstraints items = 4 [json_name = "items"];</code>
   * @return The items.
   */
  com.buf.validate.FieldConstraints getItems();
  /**
   * <pre>
   * `items` details the constraints to be applied to each item
   * in the field. Even for repeated message fields, validation is executed
   * against each item unless skip is explicitly specified.
   *
   * ```proto
   * message MyRepeated {
   *   // The items in the field `value` must follow the specified constraints.
   *   repeated string value = 1 [(buf.validate.field).repeated.items = {
   *     string: {
   *       min_len: 3
   *       max_len: 10
   *     }
   *   }];
   * }
   * ```
   * </pre>
   *
   * <code>optional .buf.validate.FieldConstraints items = 4 [json_name = "items"];</code>
   */
  com.buf.validate.FieldConstraintsOrBuilder getItemsOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface EncryptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.EncryptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] or [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * to use for encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server will use its
   * [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] or [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]
   * to use for encryption.
   * If a [CryptoKey][google.cloud.kms.v1.CryptoKey] is specified, the server will use its
   * [primary version][google.cloud.kms.v1.CryptoKey.primary].
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The data to encrypt. Must be no larger than 64KiB.
   * </pre>
   *
   * <code>bytes plaintext = 2;</code>
   */
  com.google.protobuf.ByteString getPlaintext();

  /**
   * <pre>
   * Optional data that, if specified, must also be provided during decryption
   * through [DecryptRequest.additional_authenticated_data][google.cloud.kms.v1.DecryptRequest.additional_authenticated_data].  Must be no
   * larger than 64KiB.
   * </pre>
   *
   * <code>bytes additional_authenticated_data = 3;</code>
   */
  com.google.protobuf.ByteString getAdditionalAuthenticatedData();
}

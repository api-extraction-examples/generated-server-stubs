package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AppStoreVersionState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum AppStoreVersionState {
  
  DEVELOPER_REMOVED_FROM_SALE("DEVELOPER_REMOVED_FROM_SALE"),
  
  DEVELOPER_REJECTED("DEVELOPER_REJECTED"),
  
  IN_REVIEW("IN_REVIEW"),
  
  INVALID_BINARY("INVALID_BINARY"),
  
  METADATA_REJECTED("METADATA_REJECTED"),
  
  PENDING_APPLE_RELEASE("PENDING_APPLE_RELEASE"),
  
  PENDING_CONTRACT("PENDING_CONTRACT"),
  
  PENDING_DEVELOPER_RELEASE("PENDING_DEVELOPER_RELEASE"),
  
  PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),
  
  PREORDER_READY_FOR_SALE("PREORDER_READY_FOR_SALE"),
  
  PROCESSING_FOR_APP_STORE("PROCESSING_FOR_APP_STORE"),
  
  READY_FOR_SALE("READY_FOR_SALE"),
  
  REJECTED("REJECTED"),
  
  REMOVED_FROM_SALE("REMOVED_FROM_SALE"),
  
  WAITING_FOR_EXPORT_COMPLIANCE("WAITING_FOR_EXPORT_COMPLIANCE"),
  
  WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
  
  REPLACED_WITH_NEW_VERSION("REPLACED_WITH_NEW_VERSION");

  private String value;

  AppStoreVersionState(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppStoreVersionState fromValue(String value) {
    for (AppStoreVersionState b : AppStoreVersionState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


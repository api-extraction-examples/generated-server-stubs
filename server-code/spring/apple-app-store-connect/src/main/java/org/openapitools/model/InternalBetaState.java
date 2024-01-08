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
 * Gets or Sets InternalBetaState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum InternalBetaState {
  
  PROCESSING("PROCESSING"),
  
  PROCESSING_EXCEPTION("PROCESSING_EXCEPTION"),
  
  MISSING_EXPORT_COMPLIANCE("MISSING_EXPORT_COMPLIANCE"),
  
  READY_FOR_BETA_TESTING("READY_FOR_BETA_TESTING"),
  
  IN_BETA_TESTING("IN_BETA_TESTING"),
  
  EXPIRED("EXPIRED"),
  
  IN_EXPORT_COMPLIANCE_REVIEW("IN_EXPORT_COMPLIANCE_REVIEW");

  private String value;

  InternalBetaState(String value) {
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
  public static InternalBetaState fromValue(String value) {
    for (InternalBetaState b : InternalBetaState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


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
 * Trigger rule.  *Changed in version 2.2.0*&#58; 'none_failed_min_one_success' is added as a possible value. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public enum TriggerRule {
  
  ALL_SUCCESS("all_success"),
  
  ALL_FAILED("all_failed"),
  
  ALL_DONE("all_done"),
  
  ONE_SUCCESS("one_success"),
  
  ONE_FAILED("one_failed"),
  
  NONE_FAILED("none_failed"),
  
  NONE_SKIPPED("none_skipped"),
  
  NONE_FAILED_OR_SKIPPED("none_failed_or_skipped"),
  
  NONE_FAILED_MIN_ONE_SUCCESS("none_failed_min_one_success"),
  
  DUMMY("dummy");

  private String value;

  TriggerRule(String value) {
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
  public static TriggerRule fromValue(String value) {
    for (TriggerRule b : TriggerRule.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


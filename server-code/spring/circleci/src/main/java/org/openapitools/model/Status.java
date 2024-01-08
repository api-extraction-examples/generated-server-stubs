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
 * Gets or Sets Status
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public enum Status {
  
  RETRIED("retried"),
  
  CANCELED("canceled"),
  
  INFRASTRUCTURE_FAIL("infrastructure_fail"),
  
  TIMEDOUT("timedout"),
  
  NOT_RUN("not_run"),
  
  RUNNING("running"),
  
  FAILED("failed"),
  
  QUEUED("queued"),
  
  SCHEDULED("scheduled"),
  
  NOT_RUNNING("not_running"),
  
  NO_TESTS("no_tests"),
  
  FIXED("fixed"),
  
  SUCCESS("success");

  private String value;

  Status(String value) {
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
  public static Status fromValue(String value) {
    for (Status b : Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


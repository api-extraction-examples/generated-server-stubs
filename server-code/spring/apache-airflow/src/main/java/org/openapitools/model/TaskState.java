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
 * Task state.  *Changed in version 2.0.2*&#58; 'removed' is added as a possible value.  *Changed in version 2.2.0*&#58; 'deferred' is added as a possible value.  *Changed in version 2.4.0*&#58; 'sensing' state has been removed. *Changed in version 2.4.2*&#58; 'restarting' is added as a possible value 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public enum TaskState {
  
  SUCCESS("success"),
  
  RUNNING("running"),
  
  FAILED("failed"),
  
  UPSTREAM_FAILED("upstream_failed"),
  
  SKIPPED("skipped"),
  
  UP_FOR_RETRY("up_for_retry"),
  
  UP_FOR_RESCHEDULE("up_for_reschedule"),
  
  QUEUED("queued"),
  
  NONE("none"),
  
  SCHEDULED("scheduled"),
  
  DEFERRED("deferred"),
  
  REMOVED("removed"),
  
  RESTARTING("restarting");

  private String value;

  TaskState(String value) {
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
  public static TaskState fromValue(String value) {
    for (TaskState b : TaskState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


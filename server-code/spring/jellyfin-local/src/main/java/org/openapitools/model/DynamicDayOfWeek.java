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
 * An enum that represents a day of the week, weekdays, weekends, or all days.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum DynamicDayOfWeek {
  
  SUNDAY("Sunday"),
  
  MONDAY("Monday"),
  
  TUESDAY("Tuesday"),
  
  WEDNESDAY("Wednesday"),
  
  THURSDAY("Thursday"),
  
  FRIDAY("Friday"),
  
  SATURDAY("Saturday"),
  
  EVERYDAY("Everyday"),
  
  WEEKDAY("Weekday"),
  
  WEEKEND("Weekend");

  private String value;

  DynamicDayOfWeek(String value) {
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
  public static DynamicDayOfWeek fromValue(String value) {
    for (DynamicDayOfWeek b : DynamicDayOfWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


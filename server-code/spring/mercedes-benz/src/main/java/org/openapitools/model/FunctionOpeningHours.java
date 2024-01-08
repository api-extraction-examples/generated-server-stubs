package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Function;
import org.openapitools.model.Weekdays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FunctionOpeningHours
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class FunctionOpeningHours {

  private Function function;

  private Weekdays weekdays;

  public FunctionOpeningHours function(Function function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
  */
  @Valid 
  @Schema(name = "function", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function")
  public Function getFunction() {
    return function;
  }

  public void setFunction(Function function) {
    this.function = function;
  }

  public FunctionOpeningHours weekdays(Weekdays weekdays) {
    this.weekdays = weekdays;
    return this;
  }

  /**
   * Get weekdays
   * @return weekdays
  */
  @Valid 
  @Schema(name = "weekdays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekdays")
  public Weekdays getWeekdays() {
    return weekdays;
  }

  public void setWeekdays(Weekdays weekdays) {
    this.weekdays = weekdays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionOpeningHours functionOpeningHours = (FunctionOpeningHours) o;
    return Objects.equals(this.function, functionOpeningHours.function) &&
        Objects.equals(this.weekdays, functionOpeningHours.weekdays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, weekdays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionOpeningHours {\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


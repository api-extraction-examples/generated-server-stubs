package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Time delta
 */

@Schema(name = "TimeDelta", description = "Time delta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TimeDelta {

  private String type;

  private Integer days;

  private Integer microseconds;

  private Integer seconds;

  public TimeDelta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TimeDelta(String type, Integer days, Integer microseconds, Integer seconds) {
    this.type = type;
    this.days = days;
    this.microseconds = microseconds;
    this.seconds = seconds;
  }

  public TimeDelta type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "__type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("__type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TimeDelta days(Integer days) {
    this.days = days;
    return this;
  }

  /**
   * Get days
   * @return days
  */
  @NotNull 
  @Schema(name = "days", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public TimeDelta microseconds(Integer microseconds) {
    this.microseconds = microseconds;
    return this;
  }

  /**
   * Get microseconds
   * @return microseconds
  */
  @NotNull 
  @Schema(name = "microseconds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("microseconds")
  public Integer getMicroseconds() {
    return microseconds;
  }

  public void setMicroseconds(Integer microseconds) {
    this.microseconds = microseconds;
  }

  public TimeDelta seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Get seconds
   * @return seconds
  */
  @NotNull 
  @Schema(name = "seconds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDelta timeDelta = (TimeDelta) o;
    return Objects.equals(this.type, timeDelta.type) &&
        Objects.equals(this.days, timeDelta.days) &&
        Objects.equals(this.microseconds, timeDelta.microseconds) &&
        Objects.equals(this.seconds, timeDelta.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, days, microseconds, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDelta {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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


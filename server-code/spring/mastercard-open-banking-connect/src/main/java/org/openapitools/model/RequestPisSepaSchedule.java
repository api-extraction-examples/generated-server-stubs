package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RequestPisSepaSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class RequestPisSepaSchedule {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate endDate;

  /**
   * Frequency type
   */
  public enum FrequencyEnum {
    DAIL("DAIL"),
    
    WEEK("WEEK"),
    
    MNTH("MNTH"),
    
    QUTR("QUTR"),
    
    SEMI("SEMI"),
    
    YEAR("YEAR");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FrequencyEnum frequency;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  public RequestPisSepaSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RequestPisSepaSchedule(FrequencyEnum frequency, LocalDate startDate) {
    this.frequency = frequency;
    this.startDate = startDate;
  }

  public RequestPisSepaSchedule endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date for the schedule
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", description = "End date for the schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public RequestPisSepaSchedule frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Frequency type
   * @return frequency
  */
  @NotNull 
  @Schema(name = "frequency", description = "Frequency type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("frequency")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public RequestPisSepaSchedule startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date for the schedule
   * @return startDate
  */
  @NotNull @Valid 
  @Schema(name = "startDate", description = "Start date for the schedule", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPisSepaSchedule requestPisSepaSchedule = (RequestPisSepaSchedule) o;
    return Objects.equals(this.endDate, requestPisSepaSchedule.endDate) &&
        Objects.equals(this.frequency, requestPisSepaSchedule.frequency) &&
        Objects.equals(this.startDate, requestPisSepaSchedule.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, frequency, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPisSepaSchedule {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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


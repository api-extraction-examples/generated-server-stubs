package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Periods;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WeekdayInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class WeekdayInfo {

  @Valid
  private List<@Valid Periods> periods;

  /**
   * status (OPEN or CLOSED)
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public WeekdayInfo periods(List<@Valid Periods> periods) {
    this.periods = periods;
    return this;
  }

  public WeekdayInfo addPeriodsItem(Periods periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * time periods
   * @return periods
  */
  @Valid 
  @Schema(name = "periods", description = "time periods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("periods")
  public List<@Valid Periods> getPeriods() {
    return periods;
  }

  public void setPeriods(List<@Valid Periods> periods) {
    this.periods = periods;
  }

  public WeekdayInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status (OPEN or CLOSED)
   * @return status
  */
  
  @Schema(name = "status", description = "status (OPEN or CLOSED)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeekdayInfo weekdayInfo = (WeekdayInfo) o;
    return Objects.equals(this.periods, weekdayInfo.periods) &&
        Objects.equals(this.status, weekdayInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeekdayInfo {\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


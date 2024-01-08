package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TimePeriodCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TimePeriodCompact {

  private String gid;

  private String resourceType;

  private String displayName;

  private String endOn;

  /**
   * The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.
   */
  public enum PeriodEnum {
    FY("FY"),
    
    H1("H1"),
    
    H2("H2"),
    
    Q1("Q1"),
    
    Q2("Q2"),
    
    Q3("Q3"),
    
    Q4("Q4");

    private String value;

    PeriodEnum(String value) {
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
    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PeriodEnum period;

  private String startOn;

  public TimePeriodCompact gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public TimePeriodCompact resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public TimePeriodCompact displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A string representing the cadence code and the fiscal year.
   * @return displayName
  */
  
  @Schema(name = "display_name", example = "Q1 FY22", description = "A string representing the cadence code and the fiscal year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public TimePeriodCompact endOn(String endOn) {
    this.endOn = endOn;
    return this;
  }

  /**
   * The localized end date of the time period in `YYYY-MM-DD` format.
   * @return endOn
  */
  
  @Schema(name = "end_on", example = "2019-09-14", description = "The localized end date of the time period in `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_on")
  public String getEndOn() {
    return endOn;
  }

  public void setEndOn(String endOn) {
    this.endOn = endOn;
  }

  public TimePeriodCompact period(PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.
   * @return period
  */
  
  @Schema(name = "period", example = "Q1", description = "The cadence and index of the time period. The value is one of: `FY`, `H1`, `H2`, `Q1`, `Q2`, `Q3`, or `Q4`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public TimePeriodCompact startOn(String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * The localized start date of the time period in `YYYY-MM-DD` format.
   * @return startOn
  */
  
  @Schema(name = "start_on", example = "2019-09-13", description = "The localized start date of the time period in `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public String getStartOn() {
    return startOn;
  }

  public void setStartOn(String startOn) {
    this.startOn = startOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodCompact timePeriodCompact = (TimePeriodCompact) o;
    return Objects.equals(this.gid, timePeriodCompact.gid) &&
        Objects.equals(this.resourceType, timePeriodCompact.resourceType) &&
        Objects.equals(this.displayName, timePeriodCompact.displayName) &&
        Objects.equals(this.endOn, timePeriodCompact.endOn) &&
        Objects.equals(this.period, timePeriodCompact.period) &&
        Objects.equals(this.startOn, timePeriodCompact.startOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, displayName, endOn, period, startOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriodCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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


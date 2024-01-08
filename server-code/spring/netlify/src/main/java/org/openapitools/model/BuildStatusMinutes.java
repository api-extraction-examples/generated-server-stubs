package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildStatusMinutes
 */

@JsonTypeName("buildStatus_minutes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class BuildStatusMinutes {

  private Integer current;

  private Integer currentAverageSec;

  private String includedMinutes;

  private String includedMinutesWithPacks;

  private String lastUpdatedAt;

  private String periodEndDate;

  private String periodStartDate;

  private Integer previous;

  public BuildStatusMinutes current(Integer current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
  */
  
  @Schema(name = "current", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public BuildStatusMinutes currentAverageSec(Integer currentAverageSec) {
    this.currentAverageSec = currentAverageSec;
    return this;
  }

  /**
   * Get currentAverageSec
   * @return currentAverageSec
  */
  
  @Schema(name = "current_average_sec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_average_sec")
  public Integer getCurrentAverageSec() {
    return currentAverageSec;
  }

  public void setCurrentAverageSec(Integer currentAverageSec) {
    this.currentAverageSec = currentAverageSec;
  }

  public BuildStatusMinutes includedMinutes(String includedMinutes) {
    this.includedMinutes = includedMinutes;
    return this;
  }

  /**
   * Get includedMinutes
   * @return includedMinutes
  */
  
  @Schema(name = "included_minutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included_minutes")
  public String getIncludedMinutes() {
    return includedMinutes;
  }

  public void setIncludedMinutes(String includedMinutes) {
    this.includedMinutes = includedMinutes;
  }

  public BuildStatusMinutes includedMinutesWithPacks(String includedMinutesWithPacks) {
    this.includedMinutesWithPacks = includedMinutesWithPacks;
    return this;
  }

  /**
   * Get includedMinutesWithPacks
   * @return includedMinutesWithPacks
  */
  
  @Schema(name = "included_minutes_with_packs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included_minutes_with_packs")
  public String getIncludedMinutesWithPacks() {
    return includedMinutesWithPacks;
  }

  public void setIncludedMinutesWithPacks(String includedMinutesWithPacks) {
    this.includedMinutesWithPacks = includedMinutesWithPacks;
  }

  public BuildStatusMinutes lastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  */
  
  @Schema(name = "last_updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_at")
  public String getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public BuildStatusMinutes periodEndDate(String periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * Get periodEndDate
   * @return periodEndDate
  */
  
  @Schema(name = "period_end_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period_end_date")
  public String getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(String periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public BuildStatusMinutes periodStartDate(String periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * Get periodStartDate
   * @return periodStartDate
  */
  
  @Schema(name = "period_start_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period_start_date")
  public String getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(String periodStartDate) {
    this.periodStartDate = periodStartDate;
  }

  public BuildStatusMinutes previous(Integer previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  */
  
  @Schema(name = "previous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous")
  public Integer getPrevious() {
    return previous;
  }

  public void setPrevious(Integer previous) {
    this.previous = previous;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildStatusMinutes buildStatusMinutes = (BuildStatusMinutes) o;
    return Objects.equals(this.current, buildStatusMinutes.current) &&
        Objects.equals(this.currentAverageSec, buildStatusMinutes.currentAverageSec) &&
        Objects.equals(this.includedMinutes, buildStatusMinutes.includedMinutes) &&
        Objects.equals(this.includedMinutesWithPacks, buildStatusMinutes.includedMinutesWithPacks) &&
        Objects.equals(this.lastUpdatedAt, buildStatusMinutes.lastUpdatedAt) &&
        Objects.equals(this.periodEndDate, buildStatusMinutes.periodEndDate) &&
        Objects.equals(this.periodStartDate, buildStatusMinutes.periodStartDate) &&
        Objects.equals(this.previous, buildStatusMinutes.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, currentAverageSec, includedMinutes, includedMinutesWithPacks, lastUpdatedAt, periodEndDate, periodStartDate, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildStatusMinutes {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    currentAverageSec: ").append(toIndentedString(currentAverageSec)).append("\n");
    sb.append("    includedMinutes: ").append(toIndentedString(includedMinutes)).append("\n");
    sb.append("    includedMinutesWithPacks: ").append(toIndentedString(includedMinutesWithPacks)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.PhasedReleaseState;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreVersionPhasedReleaseAttributes
 */

@JsonTypeName("AppStoreVersionPhasedRelease_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreVersionPhasedReleaseAttributes {

  private Integer currentDayNumber;

  private PhasedReleaseState phasedReleaseState;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  private Integer totalPauseDuration;

  public AppStoreVersionPhasedReleaseAttributes currentDayNumber(Integer currentDayNumber) {
    this.currentDayNumber = currentDayNumber;
    return this;
  }

  /**
   * Get currentDayNumber
   * @return currentDayNumber
  */
  
  @Schema(name = "currentDayNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentDayNumber")
  public Integer getCurrentDayNumber() {
    return currentDayNumber;
  }

  public void setCurrentDayNumber(Integer currentDayNumber) {
    this.currentDayNumber = currentDayNumber;
  }

  public AppStoreVersionPhasedReleaseAttributes phasedReleaseState(PhasedReleaseState phasedReleaseState) {
    this.phasedReleaseState = phasedReleaseState;
    return this;
  }

  /**
   * Get phasedReleaseState
   * @return phasedReleaseState
  */
  @Valid 
  @Schema(name = "phasedReleaseState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phasedReleaseState")
  public PhasedReleaseState getPhasedReleaseState() {
    return phasedReleaseState;
  }

  public void setPhasedReleaseState(PhasedReleaseState phasedReleaseState) {
    this.phasedReleaseState = phasedReleaseState;
  }

  public AppStoreVersionPhasedReleaseAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AppStoreVersionPhasedReleaseAttributes totalPauseDuration(Integer totalPauseDuration) {
    this.totalPauseDuration = totalPauseDuration;
    return this;
  }

  /**
   * Get totalPauseDuration
   * @return totalPauseDuration
  */
  
  @Schema(name = "totalPauseDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPauseDuration")
  public Integer getTotalPauseDuration() {
    return totalPauseDuration;
  }

  public void setTotalPauseDuration(Integer totalPauseDuration) {
    this.totalPauseDuration = totalPauseDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionPhasedReleaseAttributes appStoreVersionPhasedReleaseAttributes = (AppStoreVersionPhasedReleaseAttributes) o;
    return Objects.equals(this.currentDayNumber, appStoreVersionPhasedReleaseAttributes.currentDayNumber) &&
        Objects.equals(this.phasedReleaseState, appStoreVersionPhasedReleaseAttributes.phasedReleaseState) &&
        Objects.equals(this.startDate, appStoreVersionPhasedReleaseAttributes.startDate) &&
        Objects.equals(this.totalPauseDuration, appStoreVersionPhasedReleaseAttributes.totalPauseDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentDayNumber, phasedReleaseState, startDate, totalPauseDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionPhasedReleaseAttributes {\n");
    sb.append("    currentDayNumber: ").append(toIndentedString(currentDayNumber)).append("\n");
    sb.append("    phasedReleaseState: ").append(toIndentedString(phasedReleaseState)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    totalPauseDuration: ").append(toIndentedString(totalPauseDuration)).append("\n");
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


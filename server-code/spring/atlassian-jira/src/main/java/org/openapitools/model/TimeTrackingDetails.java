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
 * Time tracking details.
 */

@Schema(name = "TimeTrackingDetails", description = "Time tracking details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class TimeTrackingDetails {

  private String originalEstimate;

  private Long originalEstimateSeconds;

  private String remainingEstimate;

  private Long remainingEstimateSeconds;

  private String timeSpent;

  private Long timeSpentSeconds;

  public TimeTrackingDetails originalEstimate(String originalEstimate) {
    this.originalEstimate = originalEstimate;
    return this;
  }

  /**
   * The original estimate of time needed for this issue in readable format.
   * @return originalEstimate
  */
  
  @Schema(name = "originalEstimate", accessMode = Schema.AccessMode.READ_ONLY, description = "The original estimate of time needed for this issue in readable format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalEstimate")
  public String getOriginalEstimate() {
    return originalEstimate;
  }

  public void setOriginalEstimate(String originalEstimate) {
    this.originalEstimate = originalEstimate;
  }

  public TimeTrackingDetails originalEstimateSeconds(Long originalEstimateSeconds) {
    this.originalEstimateSeconds = originalEstimateSeconds;
    return this;
  }

  /**
   * The original estimate of time needed for this issue in seconds.
   * @return originalEstimateSeconds
  */
  
  @Schema(name = "originalEstimateSeconds", accessMode = Schema.AccessMode.READ_ONLY, description = "The original estimate of time needed for this issue in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalEstimateSeconds")
  public Long getOriginalEstimateSeconds() {
    return originalEstimateSeconds;
  }

  public void setOriginalEstimateSeconds(Long originalEstimateSeconds) {
    this.originalEstimateSeconds = originalEstimateSeconds;
  }

  public TimeTrackingDetails remainingEstimate(String remainingEstimate) {
    this.remainingEstimate = remainingEstimate;
    return this;
  }

  /**
   * The remaining estimate of time needed for this issue in readable format.
   * @return remainingEstimate
  */
  
  @Schema(name = "remainingEstimate", accessMode = Schema.AccessMode.READ_ONLY, description = "The remaining estimate of time needed for this issue in readable format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingEstimate")
  public String getRemainingEstimate() {
    return remainingEstimate;
  }

  public void setRemainingEstimate(String remainingEstimate) {
    this.remainingEstimate = remainingEstimate;
  }

  public TimeTrackingDetails remainingEstimateSeconds(Long remainingEstimateSeconds) {
    this.remainingEstimateSeconds = remainingEstimateSeconds;
    return this;
  }

  /**
   * The remaining estimate of time needed for this issue in seconds.
   * @return remainingEstimateSeconds
  */
  
  @Schema(name = "remainingEstimateSeconds", accessMode = Schema.AccessMode.READ_ONLY, description = "The remaining estimate of time needed for this issue in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingEstimateSeconds")
  public Long getRemainingEstimateSeconds() {
    return remainingEstimateSeconds;
  }

  public void setRemainingEstimateSeconds(Long remainingEstimateSeconds) {
    this.remainingEstimateSeconds = remainingEstimateSeconds;
  }

  public TimeTrackingDetails timeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

  /**
   * Time worked on this issue in readable format.
   * @return timeSpent
  */
  
  @Schema(name = "timeSpent", accessMode = Schema.AccessMode.READ_ONLY, description = "Time worked on this issue in readable format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSpent")
  public String getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(String timeSpent) {
    this.timeSpent = timeSpent;
  }

  public TimeTrackingDetails timeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
    return this;
  }

  /**
   * Time worked on this issue in seconds.
   * @return timeSpentSeconds
  */
  
  @Schema(name = "timeSpentSeconds", accessMode = Schema.AccessMode.READ_ONLY, description = "Time worked on this issue in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeSpentSeconds")
  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }

  public void setTimeSpentSeconds(Long timeSpentSeconds) {
    this.timeSpentSeconds = timeSpentSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingDetails timeTrackingDetails = (TimeTrackingDetails) o;
    return Objects.equals(this.originalEstimate, timeTrackingDetails.originalEstimate) &&
        Objects.equals(this.originalEstimateSeconds, timeTrackingDetails.originalEstimateSeconds) &&
        Objects.equals(this.remainingEstimate, timeTrackingDetails.remainingEstimate) &&
        Objects.equals(this.remainingEstimateSeconds, timeTrackingDetails.remainingEstimateSeconds) &&
        Objects.equals(this.timeSpent, timeTrackingDetails.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, timeTrackingDetails.timeSpentSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalEstimate, originalEstimateSeconds, remainingEstimate, remainingEstimateSeconds, timeSpent, timeSpentSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingDetails {\n");
    sb.append("    originalEstimate: ").append(toIndentedString(originalEstimate)).append("\n");
    sb.append("    originalEstimateSeconds: ").append(toIndentedString(originalEstimateSeconds)).append("\n");
    sb.append("    remainingEstimate: ").append(toIndentedString(remainingEstimate)).append("\n");
    sb.append("    remainingEstimateSeconds: ").append(toIndentedString(remainingEstimateSeconds)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
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


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
 * The time tracking of the linked issue.
 */

@Schema(name = "Fields_timetracking", description = "The time tracking of the linked issue.")
@JsonTypeName("Fields_timetracking")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldsTimetracking {

  private String originalEstimate;

  private Long originalEstimateSeconds;

  private String remainingEstimate;

  private Long remainingEstimateSeconds;

  private String timeSpent;

  private Long timeSpentSeconds;

  public FieldsTimetracking originalEstimate(String originalEstimate) {
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

  public FieldsTimetracking originalEstimateSeconds(Long originalEstimateSeconds) {
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

  public FieldsTimetracking remainingEstimate(String remainingEstimate) {
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

  public FieldsTimetracking remainingEstimateSeconds(Long remainingEstimateSeconds) {
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

  public FieldsTimetracking timeSpent(String timeSpent) {
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

  public FieldsTimetracking timeSpentSeconds(Long timeSpentSeconds) {
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
    FieldsTimetracking fieldsTimetracking = (FieldsTimetracking) o;
    return Objects.equals(this.originalEstimate, fieldsTimetracking.originalEstimate) &&
        Objects.equals(this.originalEstimateSeconds, fieldsTimetracking.originalEstimateSeconds) &&
        Objects.equals(this.remainingEstimate, fieldsTimetracking.remainingEstimate) &&
        Objects.equals(this.remainingEstimateSeconds, fieldsTimetracking.remainingEstimateSeconds) &&
        Objects.equals(this.timeSpent, fieldsTimetracking.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, fieldsTimetracking.timeSpentSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalEstimate, originalEstimateSeconds, remainingEstimate, remainingEstimateSeconds, timeSpent, timeSpentSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsTimetracking {\n");
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


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
 * A dictionary of options to auto-shift dates. &#x60;task_dates&#x60; must be included to use this option. Requires either &#x60;start_on&#x60; or &#x60;due_on&#x60;, but not both.
 */

@Schema(name = "ProjectDuplicateRequest_schedule_dates", description = "A dictionary of options to auto-shift dates. `task_dates` must be included to use this option. Requires either `start_on` or `due_on`, but not both.")
@JsonTypeName("ProjectDuplicateRequest_schedule_dates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectDuplicateRequestScheduleDates {

  private String dueOn;

  private Boolean shouldSkipWeekends;

  private String startOn;

  public ProjectDuplicateRequestScheduleDates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectDuplicateRequestScheduleDates(Boolean shouldSkipWeekends) {
    this.shouldSkipWeekends = shouldSkipWeekends;
  }

  public ProjectDuplicateRequestScheduleDates dueOn(String dueOn) {
    this.dueOn = dueOn;
    return this;
  }

  /**
   * Sets the last due date in the duplicated project to the given date. The rest of the due dates will be offset by the same amount as the due dates in the original project.
   * @return dueOn
  */
  
  @Schema(name = "due_on", example = "2019-05-21", description = "Sets the last due date in the duplicated project to the given date. The rest of the due dates will be offset by the same amount as the due dates in the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public String getDueOn() {
    return dueOn;
  }

  public void setDueOn(String dueOn) {
    this.dueOn = dueOn;
  }

  public ProjectDuplicateRequestScheduleDates shouldSkipWeekends(Boolean shouldSkipWeekends) {
    this.shouldSkipWeekends = shouldSkipWeekends;
    return this;
  }

  /**
   * Determines if the auto-shifted dates should skip weekends.
   * @return shouldSkipWeekends
  */
  @NotNull 
  @Schema(name = "should_skip_weekends", example = "true", description = "Determines if the auto-shifted dates should skip weekends.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("should_skip_weekends")
  public Boolean getShouldSkipWeekends() {
    return shouldSkipWeekends;
  }

  public void setShouldSkipWeekends(Boolean shouldSkipWeekends) {
    this.shouldSkipWeekends = shouldSkipWeekends;
  }

  public ProjectDuplicateRequestScheduleDates startOn(String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * Sets the first start date in the duplicated project to the given date. The rest of the start dates will be offset by the same amount as the start dates in the original project.
   * @return startOn
  */
  
  @Schema(name = "start_on", example = "2019-05-21", description = "Sets the first start date in the duplicated project to the given date. The rest of the start dates will be offset by the same amount as the start dates in the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectDuplicateRequestScheduleDates projectDuplicateRequestScheduleDates = (ProjectDuplicateRequestScheduleDates) o;
    return Objects.equals(this.dueOn, projectDuplicateRequestScheduleDates.dueOn) &&
        Objects.equals(this.shouldSkipWeekends, projectDuplicateRequestScheduleDates.shouldSkipWeekends) &&
        Objects.equals(this.startOn, projectDuplicateRequestScheduleDates.startOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dueOn, shouldSkipWeekends, startOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDuplicateRequestScheduleDates {\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    shouldSkipWeekends: ").append(toIndentedString(shouldSkipWeekends)).append("\n");
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


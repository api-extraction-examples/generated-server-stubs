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
 * A response object returned from the task count endpoint.
 */

@Schema(name = "TaskCountResponse", description = "A response object returned from the task count endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TaskCountResponse {

  private Integer numCompletedMilestones;

  private Integer numCompletedTasks;

  private Integer numIncompleteMilestones;

  private Integer numIncompleteTasks;

  private Integer numMilestones;

  private Integer numTasks;

  public TaskCountResponse numCompletedMilestones(Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
    return this;
  }

  /**
   * The number of completed milestones in a project.
   * @return numCompletedMilestones
  */
  
  @Schema(name = "num_completed_milestones", example = "3", description = "The number of completed milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_completed_milestones")
  public Integer getNumCompletedMilestones() {
    return numCompletedMilestones;
  }

  public void setNumCompletedMilestones(Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
  }

  public TaskCountResponse numCompletedTasks(Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
    return this;
  }

  /**
   * The number of completed tasks in a project.
   * @return numCompletedTasks
  */
  
  @Schema(name = "num_completed_tasks", example = "150", description = "The number of completed tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_completed_tasks")
  public Integer getNumCompletedTasks() {
    return numCompletedTasks;
  }

  public void setNumCompletedTasks(Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
  }

  public TaskCountResponse numIncompleteMilestones(Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
    return this;
  }

  /**
   * The number of incomplete milestones in a project.
   * @return numIncompleteMilestones
  */
  
  @Schema(name = "num_incomplete_milestones", example = "7", description = "The number of incomplete milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_incomplete_milestones")
  public Integer getNumIncompleteMilestones() {
    return numIncompleteMilestones;
  }

  public void setNumIncompleteMilestones(Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
  }

  public TaskCountResponse numIncompleteTasks(Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
    return this;
  }

  /**
   * The number of incomplete tasks in a project.
   * @return numIncompleteTasks
  */
  
  @Schema(name = "num_incomplete_tasks", example = "50", description = "The number of incomplete tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_incomplete_tasks")
  public Integer getNumIncompleteTasks() {
    return numIncompleteTasks;
  }

  public void setNumIncompleteTasks(Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
  }

  public TaskCountResponse numMilestones(Integer numMilestones) {
    this.numMilestones = numMilestones;
    return this;
  }

  /**
   * The number of milestones in a project.
   * @return numMilestones
  */
  
  @Schema(name = "num_milestones", example = "10", description = "The number of milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_milestones")
  public Integer getNumMilestones() {
    return numMilestones;
  }

  public void setNumMilestones(Integer numMilestones) {
    this.numMilestones = numMilestones;
  }

  public TaskCountResponse numTasks(Integer numTasks) {
    this.numTasks = numTasks;
    return this;
  }

  /**
   * The number of tasks in a project.
   * @return numTasks
  */
  
  @Schema(name = "num_tasks", example = "200", description = "The number of tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_tasks")
  public Integer getNumTasks() {
    return numTasks;
  }

  public void setNumTasks(Integer numTasks) {
    this.numTasks = numTasks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCountResponse taskCountResponse = (TaskCountResponse) o;
    return Objects.equals(this.numCompletedMilestones, taskCountResponse.numCompletedMilestones) &&
        Objects.equals(this.numCompletedTasks, taskCountResponse.numCompletedTasks) &&
        Objects.equals(this.numIncompleteMilestones, taskCountResponse.numIncompleteMilestones) &&
        Objects.equals(this.numIncompleteTasks, taskCountResponse.numIncompleteTasks) &&
        Objects.equals(this.numMilestones, taskCountResponse.numMilestones) &&
        Objects.equals(this.numTasks, taskCountResponse.numTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numCompletedMilestones, numCompletedTasks, numIncompleteMilestones, numIncompleteTasks, numMilestones, numTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCountResponse {\n");
    sb.append("    numCompletedMilestones: ").append(toIndentedString(numCompletedMilestones)).append("\n");
    sb.append("    numCompletedTasks: ").append(toIndentedString(numCompletedTasks)).append("\n");
    sb.append("    numIncompleteMilestones: ").append(toIndentedString(numIncompleteMilestones)).append("\n");
    sb.append("    numIncompleteTasks: ").append(toIndentedString(numIncompleteTasks)).append("\n");
    sb.append("    numMilestones: ").append(toIndentedString(numMilestones)).append("\n");
    sb.append("    numTasks: ").append(toIndentedString(numTasks)).append("\n");
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


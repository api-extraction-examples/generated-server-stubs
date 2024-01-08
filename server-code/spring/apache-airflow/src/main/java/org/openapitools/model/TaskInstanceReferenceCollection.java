package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TaskInstanceReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskInstanceReferenceCollection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskInstanceReferenceCollection {

  @Valid
  private List<@Valid TaskInstanceReference> taskInstances;

  public TaskInstanceReferenceCollection taskInstances(List<@Valid TaskInstanceReference> taskInstances) {
    this.taskInstances = taskInstances;
    return this;
  }

  public TaskInstanceReferenceCollection addTaskInstancesItem(TaskInstanceReference taskInstancesItem) {
    if (this.taskInstances == null) {
      this.taskInstances = new ArrayList<>();
    }
    this.taskInstances.add(taskInstancesItem);
    return this;
  }

  /**
   * Get taskInstances
   * @return taskInstances
  */
  @Valid 
  @Schema(name = "task_instances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_instances")
  public List<@Valid TaskInstanceReference> getTaskInstances() {
    return taskInstances;
  }

  public void setTaskInstances(List<@Valid TaskInstanceReference> taskInstances) {
    this.taskInstances = taskInstances;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstanceReferenceCollection taskInstanceReferenceCollection = (TaskInstanceReferenceCollection) o;
    return Objects.equals(this.taskInstances, taskInstanceReferenceCollection.taskInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceReferenceCollection {\n");
    sb.append("    taskInstances: ").append(toIndentedString(taskInstances)).append("\n");
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


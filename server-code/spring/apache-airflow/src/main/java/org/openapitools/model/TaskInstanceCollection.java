package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TaskInstance;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Collection of task instances.  *Changed in version 2.1.0*&amp;#58; &#39;total_entries&#39; field is added. 
 */

@Schema(name = "TaskInstanceCollection", description = "Collection of task instances.  *Changed in version 2.1.0*&#58; 'total_entries' field is added. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskInstanceCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid TaskInstance> taskInstances;

  public TaskInstanceCollection totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  /**
   * Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
   * @return totalEntries
  */
  
  @Schema(name = "total_entries", description = "Count of total objects in the current result set before pagination parameters (limit, offset) are applied. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_entries")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  public TaskInstanceCollection taskInstances(List<@Valid TaskInstance> taskInstances) {
    this.taskInstances = taskInstances;
    return this;
  }

  public TaskInstanceCollection addTaskInstancesItem(TaskInstance taskInstancesItem) {
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
  public List<@Valid TaskInstance> getTaskInstances() {
    return taskInstances;
  }

  public void setTaskInstances(List<@Valid TaskInstance> taskInstances) {
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
    TaskInstanceCollection taskInstanceCollection = (TaskInstanceCollection) o;
    return Objects.equals(this.totalEntries, taskInstanceCollection.totalEntries) &&
        Objects.equals(this.taskInstances, taskInstanceCollection.taskInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, taskInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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


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
 * TaskInstanceReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskInstanceReference {

  private String dagId;

  private String dagRunId;

  private String executionDate;

  private String taskId;

  public TaskInstanceReference dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * The DAG ID.
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public TaskInstanceReference dagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
    return this;
  }

  /**
   * The DAG run ID.
   * @return dagRunId
  */
  
  @Schema(name = "dag_run_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG run ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_id")
  public String getDagRunId() {
    return dagRunId;
  }

  public void setDagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
  }

  public TaskInstanceReference executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Get executionDate
   * @return executionDate
  */
  
  @Schema(name = "execution_date", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public TaskInstanceReference taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The task ID.
   * @return taskId
  */
  
  @Schema(name = "task_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The task ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_id")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstanceReference taskInstanceReference = (TaskInstanceReference) o;
    return Objects.equals(this.dagId, taskInstanceReference.dagId) &&
        Objects.equals(this.dagRunId, taskInstanceReference.dagRunId) &&
        Objects.equals(this.executionDate, taskInstanceReference.executionDate) &&
        Objects.equals(this.taskId, taskInstanceReference.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, dagRunId, executionDate, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstanceReference {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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


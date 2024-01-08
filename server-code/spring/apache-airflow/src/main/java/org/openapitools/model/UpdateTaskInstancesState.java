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
 * UpdateTaskInstancesState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class UpdateTaskInstancesState {

  private String dagRunId;

  private Boolean dryRun = true;

  private String executionDate;

  private Boolean includeDownstream;

  private Boolean includeFuture;

  private Boolean includePast;

  private Boolean includeUpstream;

  /**
   * Expected new state.
   */
  public enum NewStateEnum {
    SUCCESS("success"),
    
    FAILED("failed");

    private String value;

    NewStateEnum(String value) {
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
    public static NewStateEnum fromValue(String value) {
      for (NewStateEnum b : NewStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NewStateEnum newState;

  private String taskId;

  public UpdateTaskInstancesState dagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
    return this;
  }

  /**
   * The task instance's DAG run ID. Either set this or execution_date but not both.  *New in version 2.3.0* 
   * @return dagRunId
  */
  
  @Schema(name = "dag_run_id", description = "The task instance's DAG run ID. Either set this or execution_date but not both.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_id")
  public String getDagRunId() {
    return dagRunId;
  }

  public void setDagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
  }

  public UpdateTaskInstancesState dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * If set, don't actually run this operation. The response will contain a list of task instances planned to be affected, but won't be modified in any way. 
   * @return dryRun
  */
  
  @Schema(name = "dry_run", description = "If set, don't actually run this operation. The response will contain a list of task instances planned to be affected, but won't be modified in any way. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dry_run")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public UpdateTaskInstancesState executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * The execution date. Either set this or dag_run_id but not both.
   * @return executionDate
  */
  
  @Schema(name = "execution_date", description = "The execution date. Either set this or dag_run_id but not both.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public UpdateTaskInstancesState includeDownstream(Boolean includeDownstream) {
    this.includeDownstream = includeDownstream;
    return this;
  }

  /**
   * If set to true, downstream tasks are also affected.
   * @return includeDownstream
  */
  
  @Schema(name = "include_downstream", description = "If set to true, downstream tasks are also affected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_downstream")
  public Boolean getIncludeDownstream() {
    return includeDownstream;
  }

  public void setIncludeDownstream(Boolean includeDownstream) {
    this.includeDownstream = includeDownstream;
  }

  public UpdateTaskInstancesState includeFuture(Boolean includeFuture) {
    this.includeFuture = includeFuture;
    return this;
  }

  /**
   * If set to True, also tasks from future DAG Runs are affected.
   * @return includeFuture
  */
  
  @Schema(name = "include_future", description = "If set to True, also tasks from future DAG Runs are affected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_future")
  public Boolean getIncludeFuture() {
    return includeFuture;
  }

  public void setIncludeFuture(Boolean includeFuture) {
    this.includeFuture = includeFuture;
  }

  public UpdateTaskInstancesState includePast(Boolean includePast) {
    this.includePast = includePast;
    return this;
  }

  /**
   * If set to True, also tasks from past DAG Runs are affected.
   * @return includePast
  */
  
  @Schema(name = "include_past", description = "If set to True, also tasks from past DAG Runs are affected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_past")
  public Boolean getIncludePast() {
    return includePast;
  }

  public void setIncludePast(Boolean includePast) {
    this.includePast = includePast;
  }

  public UpdateTaskInstancesState includeUpstream(Boolean includeUpstream) {
    this.includeUpstream = includeUpstream;
    return this;
  }

  /**
   * If set to true, upstream tasks are also affected.
   * @return includeUpstream
  */
  
  @Schema(name = "include_upstream", description = "If set to true, upstream tasks are also affected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_upstream")
  public Boolean getIncludeUpstream() {
    return includeUpstream;
  }

  public void setIncludeUpstream(Boolean includeUpstream) {
    this.includeUpstream = includeUpstream;
  }

  public UpdateTaskInstancesState newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }

  /**
   * Expected new state.
   * @return newState
  */
  
  @Schema(name = "new_state", description = "Expected new state.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_state")
  public NewStateEnum getNewState() {
    return newState;
  }

  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }

  public UpdateTaskInstancesState taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The task ID.
   * @return taskId
  */
  
  @Schema(name = "task_id", description = "The task ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UpdateTaskInstancesState updateTaskInstancesState = (UpdateTaskInstancesState) o;
    return Objects.equals(this.dagRunId, updateTaskInstancesState.dagRunId) &&
        Objects.equals(this.dryRun, updateTaskInstancesState.dryRun) &&
        Objects.equals(this.executionDate, updateTaskInstancesState.executionDate) &&
        Objects.equals(this.includeDownstream, updateTaskInstancesState.includeDownstream) &&
        Objects.equals(this.includeFuture, updateTaskInstancesState.includeFuture) &&
        Objects.equals(this.includePast, updateTaskInstancesState.includePast) &&
        Objects.equals(this.includeUpstream, updateTaskInstancesState.includeUpstream) &&
        Objects.equals(this.newState, updateTaskInstancesState.newState) &&
        Objects.equals(this.taskId, updateTaskInstancesState.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagRunId, dryRun, executionDate, includeDownstream, includeFuture, includePast, includeUpstream, newState, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTaskInstancesState {\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    includeDownstream: ").append(toIndentedString(includeDownstream)).append("\n");
    sb.append("    includeFuture: ").append(toIndentedString(includeFuture)).append("\n");
    sb.append("    includePast: ").append(toIndentedString(includePast)).append("\n");
    sb.append("    includeUpstream: ").append(toIndentedString(includeUpstream)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
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


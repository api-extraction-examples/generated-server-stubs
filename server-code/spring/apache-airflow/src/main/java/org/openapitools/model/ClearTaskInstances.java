package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClearTaskInstances
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ClearTaskInstances {

  private JsonNullable<String> dagRunId = JsonNullable.<String>undefined();

  private Boolean dryRun = true;

  private String endDate;

  private Boolean includeDownstream = false;

  private Boolean includeFuture = false;

  private Boolean includeParentdag;

  private Boolean includePast = false;

  private Boolean includeSubdags;

  private Boolean includeUpstream = false;

  private Boolean onlyFailed = true;

  private Boolean onlyRunning = false;

  private Boolean resetDagRuns;

  private String startDate;

  @Valid
  private List<String> taskIds;

  public ClearTaskInstances dagRunId(String dagRunId) {
    this.dagRunId = JsonNullable.of(dagRunId);
    return this;
  }

  /**
   * The DagRun ID for this task instance
   * @return dagRunId
  */
  
  @Schema(name = "dag_run_id", description = "The DagRun ID for this task instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_id")
  public JsonNullable<String> getDagRunId() {
    return dagRunId;
  }

  public void setDagRunId(JsonNullable<String> dagRunId) {
    this.dagRunId = dagRunId;
  }

  public ClearTaskInstances dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. 
   * @return dryRun
  */
  
  @Schema(name = "dry_run", description = "If set, don't actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dry_run")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public ClearTaskInstances endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The maximum execution date to clear.
   * @return endDate
  */
  
  @Schema(name = "end_date", description = "The maximum execution date to clear.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ClearTaskInstances includeDownstream(Boolean includeDownstream) {
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

  public ClearTaskInstances includeFuture(Boolean includeFuture) {
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

  public ClearTaskInstances includeParentdag(Boolean includeParentdag) {
    this.includeParentdag = includeParentdag;
    return this;
  }

  /**
   * Clear tasks in the parent dag of the subdag.
   * @return includeParentdag
  */
  
  @Schema(name = "include_parentdag", description = "Clear tasks in the parent dag of the subdag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_parentdag")
  public Boolean getIncludeParentdag() {
    return includeParentdag;
  }

  public void setIncludeParentdag(Boolean includeParentdag) {
    this.includeParentdag = includeParentdag;
  }

  public ClearTaskInstances includePast(Boolean includePast) {
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

  public ClearTaskInstances includeSubdags(Boolean includeSubdags) {
    this.includeSubdags = includeSubdags;
    return this;
  }

  /**
   * Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.
   * @return includeSubdags
  */
  
  @Schema(name = "include_subdags", description = "Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include_subdags")
  public Boolean getIncludeSubdags() {
    return includeSubdags;
  }

  public void setIncludeSubdags(Boolean includeSubdags) {
    this.includeSubdags = includeSubdags;
  }

  public ClearTaskInstances includeUpstream(Boolean includeUpstream) {
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

  public ClearTaskInstances onlyFailed(Boolean onlyFailed) {
    this.onlyFailed = onlyFailed;
    return this;
  }

  /**
   * Only clear failed tasks.
   * @return onlyFailed
  */
  
  @Schema(name = "only_failed", description = "Only clear failed tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("only_failed")
  public Boolean getOnlyFailed() {
    return onlyFailed;
  }

  public void setOnlyFailed(Boolean onlyFailed) {
    this.onlyFailed = onlyFailed;
  }

  public ClearTaskInstances onlyRunning(Boolean onlyRunning) {
    this.onlyRunning = onlyRunning;
    return this;
  }

  /**
   * Only clear running tasks.
   * @return onlyRunning
  */
  
  @Schema(name = "only_running", description = "Only clear running tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("only_running")
  public Boolean getOnlyRunning() {
    return onlyRunning;
  }

  public void setOnlyRunning(Boolean onlyRunning) {
    this.onlyRunning = onlyRunning;
  }

  public ClearTaskInstances resetDagRuns(Boolean resetDagRuns) {
    this.resetDagRuns = resetDagRuns;
    return this;
  }

  /**
   * Set state of DAG runs to RUNNING.
   * @return resetDagRuns
  */
  
  @Schema(name = "reset_dag_runs", description = "Set state of DAG runs to RUNNING.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reset_dag_runs")
  public Boolean getResetDagRuns() {
    return resetDagRuns;
  }

  public void setResetDagRuns(Boolean resetDagRuns) {
    this.resetDagRuns = resetDagRuns;
  }

  public ClearTaskInstances startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The minimum execution date to clear.
   * @return startDate
  */
  
  @Schema(name = "start_date", description = "The minimum execution date to clear.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ClearTaskInstances taskIds(List<String> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public ClearTaskInstances addTaskIdsItem(String taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

  /**
   * A list of task ids to clear.  *New in version 2.1.0* 
   * @return taskIds
  */
  @Size(min = 1) 
  @Schema(name = "task_ids", description = "A list of task ids to clear.  *New in version 2.1.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_ids")
  public List<String> getTaskIds() {
    return taskIds;
  }

  public void setTaskIds(List<String> taskIds) {
    this.taskIds = taskIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearTaskInstances clearTaskInstances = (ClearTaskInstances) o;
    return equalsNullable(this.dagRunId, clearTaskInstances.dagRunId) &&
        Objects.equals(this.dryRun, clearTaskInstances.dryRun) &&
        Objects.equals(this.endDate, clearTaskInstances.endDate) &&
        Objects.equals(this.includeDownstream, clearTaskInstances.includeDownstream) &&
        Objects.equals(this.includeFuture, clearTaskInstances.includeFuture) &&
        Objects.equals(this.includeParentdag, clearTaskInstances.includeParentdag) &&
        Objects.equals(this.includePast, clearTaskInstances.includePast) &&
        Objects.equals(this.includeSubdags, clearTaskInstances.includeSubdags) &&
        Objects.equals(this.includeUpstream, clearTaskInstances.includeUpstream) &&
        Objects.equals(this.onlyFailed, clearTaskInstances.onlyFailed) &&
        Objects.equals(this.onlyRunning, clearTaskInstances.onlyRunning) &&
        Objects.equals(this.resetDagRuns, clearTaskInstances.resetDagRuns) &&
        Objects.equals(this.startDate, clearTaskInstances.startDate) &&
        Objects.equals(this.taskIds, clearTaskInstances.taskIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dagRunId), dryRun, endDate, includeDownstream, includeFuture, includeParentdag, includePast, includeSubdags, includeUpstream, onlyFailed, onlyRunning, resetDagRuns, startDate, taskIds);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearTaskInstances {\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    includeDownstream: ").append(toIndentedString(includeDownstream)).append("\n");
    sb.append("    includeFuture: ").append(toIndentedString(includeFuture)).append("\n");
    sb.append("    includeParentdag: ").append(toIndentedString(includeParentdag)).append("\n");
    sb.append("    includePast: ").append(toIndentedString(includePast)).append("\n");
    sb.append("    includeSubdags: ").append(toIndentedString(includeSubdags)).append("\n");
    sb.append("    includeUpstream: ").append(toIndentedString(includeUpstream)).append("\n");
    sb.append("    onlyFailed: ").append(toIndentedString(onlyFailed)).append("\n");
    sb.append("    onlyRunning: ").append(toIndentedString(onlyRunning)).append("\n");
    sb.append("    resetDagRuns: ").append(toIndentedString(resetDagRuns)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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


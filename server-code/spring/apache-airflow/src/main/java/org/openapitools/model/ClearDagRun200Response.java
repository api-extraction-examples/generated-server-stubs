package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DAGRun;
import org.openapitools.model.DagState;
import org.openapitools.model.TaskInstance;
import org.openapitools.model.TaskInstanceCollection;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClearDagRun200Response
 */

@JsonTypeName("clear_dag_run_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ClearDagRun200Response {

  private Object conf;

  private String dagId;

  private JsonNullable<String> dagRunId = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dataIntervalEnd = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dataIntervalStart = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  @Deprecated
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> executionDate = JsonNullable.<OffsetDateTime>undefined();

  private Boolean externalTrigger = true;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastSchedulingDecision = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> logicalDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> note = JsonNullable.<String>undefined();

  /**
   * Gets or Sets runType
   */
  public enum RunTypeEnum {
    BACKFILL("backfill"),
    
    MANUAL("manual"),
    
    SCHEDULED("scheduled"),
    
    DATASET_TRIGGERED("dataset_triggered");

    private String value;

    RunTypeEnum(String value) {
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
    public static RunTypeEnum fromValue(String value) {
      for (RunTypeEnum b : RunTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RunTypeEnum runType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  private DagState state;

  @Valid
  private List<@Valid TaskInstance> taskInstances;

  private Integer totalEntries;

  public ClearDagRun200Response conf(Object conf) {
    this.conf = conf;
    return this;
  }

  /**
   * JSON object describing additional configuration parameters.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. 
   * @return conf
  */
  
  @Schema(name = "conf", description = "JSON object describing additional configuration parameters.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conf")
  public Object getConf() {
    return conf;
  }

  public void setConf(Object conf) {
    this.conf = conf;
  }

  public ClearDagRun200Response dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * Get dagId
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public ClearDagRun200Response dagRunId(String dagRunId) {
    this.dagRunId = JsonNullable.of(dagRunId);
    return this;
  }

  /**
   * Run ID.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  If not provided, a value will be generated based on execution_date.  If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error.  This together with DAG_ID are a unique key. 
   * @return dagRunId
  */
  
  @Schema(name = "dag_run_id", description = "Run ID.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  If not provided, a value will be generated based on execution_date.  If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error.  This together with DAG_ID are a unique key. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_id")
  public JsonNullable<String> getDagRunId() {
    return dagRunId;
  }

  public void setDagRunId(JsonNullable<String> dagRunId) {
    this.dagRunId = dagRunId;
  }

  public ClearDagRun200Response dataIntervalEnd(OffsetDateTime dataIntervalEnd) {
    this.dataIntervalEnd = JsonNullable.of(dataIntervalEnd);
    return this;
  }

  /**
   * Get dataIntervalEnd
   * @return dataIntervalEnd
  */
  @Valid 
  @Schema(name = "data_interval_end", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_interval_end")
  public JsonNullable<OffsetDateTime> getDataIntervalEnd() {
    return dataIntervalEnd;
  }

  public void setDataIntervalEnd(JsonNullable<OffsetDateTime> dataIntervalEnd) {
    this.dataIntervalEnd = dataIntervalEnd;
  }

  public ClearDagRun200Response dataIntervalStart(OffsetDateTime dataIntervalStart) {
    this.dataIntervalStart = JsonNullable.of(dataIntervalStart);
    return this;
  }

  /**
   * Get dataIntervalStart
   * @return dataIntervalStart
  */
  @Valid 
  @Schema(name = "data_interval_start", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_interval_start")
  public JsonNullable<OffsetDateTime> getDataIntervalStart() {
    return dataIntervalStart;
  }

  public void setDataIntervalStart(JsonNullable<OffsetDateTime> dataIntervalStart) {
    this.dataIntervalStart = dataIntervalStart;
  }

  public ClearDagRun200Response endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "end_date", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public ClearDagRun200Response executionDate(OffsetDateTime executionDate) {
    this.executionDate = JsonNullable.of(executionDate);
    return this;
  }

  /**
   * The execution date. This is the same as logical_date, kept for backwards compatibility. If both this field and logical_date are provided but with different values, the request will fail with an BAD_REQUEST error.  *Changed in version 2.2.0*&#58; Field becomes nullable.  *Deprecated since version 2.2.0*&#58; Use 'logical_date' instead. 
   * @return executionDate
   * @deprecated
  */
  @Valid 
  @Schema(name = "execution_date", description = "The execution date. This is the same as logical_date, kept for backwards compatibility. If both this field and logical_date are provided but with different values, the request will fail with an BAD_REQUEST error.  *Changed in version 2.2.0*&#58; Field becomes nullable.  *Deprecated since version 2.2.0*&#58; Use 'logical_date' instead. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date")
  @Deprecated
  public JsonNullable<OffsetDateTime> getExecutionDate() {
    return executionDate;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setExecutionDate(JsonNullable<OffsetDateTime> executionDate) {
    this.executionDate = executionDate;
  }

  public ClearDagRun200Response externalTrigger(Boolean externalTrigger) {
    this.externalTrigger = externalTrigger;
    return this;
  }

  /**
   * Get externalTrigger
   * @return externalTrigger
  */
  
  @Schema(name = "external_trigger", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_trigger")
  public Boolean getExternalTrigger() {
    return externalTrigger;
  }

  public void setExternalTrigger(Boolean externalTrigger) {
    this.externalTrigger = externalTrigger;
  }

  public ClearDagRun200Response lastSchedulingDecision(OffsetDateTime lastSchedulingDecision) {
    this.lastSchedulingDecision = JsonNullable.of(lastSchedulingDecision);
    return this;
  }

  /**
   * Get lastSchedulingDecision
   * @return lastSchedulingDecision
  */
  @Valid 
  @Schema(name = "last_scheduling_decision", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_scheduling_decision")
  public JsonNullable<OffsetDateTime> getLastSchedulingDecision() {
    return lastSchedulingDecision;
  }

  public void setLastSchedulingDecision(JsonNullable<OffsetDateTime> lastSchedulingDecision) {
    this.lastSchedulingDecision = lastSchedulingDecision;
  }

  public ClearDagRun200Response logicalDate(OffsetDateTime logicalDate) {
    this.logicalDate = JsonNullable.of(logicalDate);
    return this;
  }

  /**
   * The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* 
   * @return logicalDate
  */
  @Valid 
  @Schema(name = "logical_date", description = "The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logical_date")
  public JsonNullable<OffsetDateTime> getLogicalDate() {
    return logicalDate;
  }

  public void setLogicalDate(JsonNullable<OffsetDateTime> logicalDate) {
    this.logicalDate = logicalDate;
  }

  public ClearDagRun200Response note(String note) {
    this.note = JsonNullable.of(note);
    return this;
  }

  /**
   * Contains manually entered notes by the user about the DagRun.  *New in version 2.5.0* 
   * @return note
  */
  
  @Schema(name = "note", description = "Contains manually entered notes by the user about the DagRun.  *New in version 2.5.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public JsonNullable<String> getNote() {
    return note;
  }

  public void setNote(JsonNullable<String> note) {
    this.note = note;
  }

  public ClearDagRun200Response runType(RunTypeEnum runType) {
    this.runType = runType;
    return this;
  }

  /**
   * Get runType
   * @return runType
  */
  
  @Schema(name = "run_type", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("run_type")
  public RunTypeEnum getRunType() {
    return runType;
  }

  public void setRunType(RunTypeEnum runType) {
    this.runType = runType;
  }

  public ClearDagRun200Response startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&#58; Field becomes nullable. 
   * @return startDate
  */
  @Valid 
  @Schema(name = "start_date", accessMode = Schema.AccessMode.READ_ONLY, description = "The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&#58; Field becomes nullable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public ClearDagRun200Response state(DagState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public DagState getState() {
    return state;
  }

  public void setState(DagState state) {
    this.state = state;
  }

  public ClearDagRun200Response taskInstances(List<@Valid TaskInstance> taskInstances) {
    this.taskInstances = taskInstances;
    return this;
  }

  public ClearDagRun200Response addTaskInstancesItem(TaskInstance taskInstancesItem) {
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

  public ClearDagRun200Response totalEntries(Integer totalEntries) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearDagRun200Response clearDagRun200Response = (ClearDagRun200Response) o;
    return Objects.equals(this.conf, clearDagRun200Response.conf) &&
        Objects.equals(this.dagId, clearDagRun200Response.dagId) &&
        equalsNullable(this.dagRunId, clearDagRun200Response.dagRunId) &&
        equalsNullable(this.dataIntervalEnd, clearDagRun200Response.dataIntervalEnd) &&
        equalsNullable(this.dataIntervalStart, clearDagRun200Response.dataIntervalStart) &&
        equalsNullable(this.endDate, clearDagRun200Response.endDate) &&
        equalsNullable(this.executionDate, clearDagRun200Response.executionDate) &&
        Objects.equals(this.externalTrigger, clearDagRun200Response.externalTrigger) &&
        equalsNullable(this.lastSchedulingDecision, clearDagRun200Response.lastSchedulingDecision) &&
        equalsNullable(this.logicalDate, clearDagRun200Response.logicalDate) &&
        equalsNullable(this.note, clearDagRun200Response.note) &&
        Objects.equals(this.runType, clearDagRun200Response.runType) &&
        equalsNullable(this.startDate, clearDagRun200Response.startDate) &&
        Objects.equals(this.state, clearDagRun200Response.state) &&
        Objects.equals(this.taskInstances, clearDagRun200Response.taskInstances) &&
        Objects.equals(this.totalEntries, clearDagRun200Response.totalEntries);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(conf, dagId, hashCodeNullable(dagRunId), hashCodeNullable(dataIntervalEnd), hashCodeNullable(dataIntervalStart), hashCodeNullable(endDate), hashCodeNullable(executionDate), externalTrigger, hashCodeNullable(lastSchedulingDecision), hashCodeNullable(logicalDate), hashCodeNullable(note), runType, hashCodeNullable(startDate), state, taskInstances, totalEntries);
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
    sb.append("class ClearDagRun200Response {\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    dataIntervalEnd: ").append(toIndentedString(dataIntervalEnd)).append("\n");
    sb.append("    dataIntervalStart: ").append(toIndentedString(dataIntervalStart)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    externalTrigger: ").append(toIndentedString(externalTrigger)).append("\n");
    sb.append("    lastSchedulingDecision: ").append(toIndentedString(lastSchedulingDecision)).append("\n");
    sb.append("    logicalDate: ").append(toIndentedString(logicalDate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskInstances: ").append(toIndentedString(taskInstances)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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


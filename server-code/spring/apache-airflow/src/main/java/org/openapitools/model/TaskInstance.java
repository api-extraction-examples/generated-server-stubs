package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Job;
import org.openapitools.model.SLAMiss;
import org.openapitools.model.TaskState;
import org.openapitools.model.Trigger;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskInstance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskInstance {

  private String dagId;

  private String dagRunId;

  private JsonNullable<BigDecimal> duration = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<String> endDate = JsonNullable.<String>undefined();

  private String executionDate;

  private String executorConfig;

  private String hostname;

  private Integer mapIndex;

  private Integer maxTries;

  private JsonNullable<String> note = JsonNullable.<String>undefined();

  private JsonNullable<String> operator = JsonNullable.<String>undefined();

  private JsonNullable<Integer> pid = JsonNullable.<Integer>undefined();

  private String pool;

  private Integer poolSlots;

  private JsonNullable<Integer> priorityWeight = JsonNullable.<Integer>undefined();

  private JsonNullable<String> queue = JsonNullable.<String>undefined();

  private JsonNullable<String> queuedWhen = JsonNullable.<String>undefined();

  private Object renderedFields;

  private JsonNullable<SLAMiss> slaMiss = JsonNullable.<SLAMiss>undefined();

  private JsonNullable<String> startDate = JsonNullable.<String>undefined();

  private TaskState state;

  private String taskId;

  private Trigger trigger;

  private Job triggererJob;

  private Integer tryNumber;

  private String unixname;

  public TaskInstance dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * Get dagId
   * @return dagId
  */
  
  @Schema(name = "dag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public TaskInstance dagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
    return this;
  }

  /**
   * The DagRun ID for this task instance  *New in version 2.3.0* 
   * @return dagRunId
  */
  
  @Schema(name = "dag_run_id", description = "The DagRun ID for this task instance  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_id")
  public String getDagRunId() {
    return dagRunId;
  }

  public void setDagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
  }

  public TaskInstance duration(BigDecimal duration) {
    this.duration = JsonNullable.of(duration);
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  @Valid 
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public JsonNullable<BigDecimal> getDuration() {
    return duration;
  }

  public void setDuration(JsonNullable<BigDecimal> duration) {
    this.duration = duration;
  }

  public TaskInstance endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "end_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public TaskInstance executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Get executionDate
   * @return executionDate
  */
  
  @Schema(name = "execution_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public TaskInstance executorConfig(String executorConfig) {
    this.executorConfig = executorConfig;
    return this;
  }

  /**
   * Get executorConfig
   * @return executorConfig
  */
  
  @Schema(name = "executor_config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executor_config")
  public String getExecutorConfig() {
    return executorConfig;
  }

  public void setExecutorConfig(String executorConfig) {
    this.executorConfig = executorConfig;
  }

  public TaskInstance hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  
  @Schema(name = "hostname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public TaskInstance mapIndex(Integer mapIndex) {
    this.mapIndex = mapIndex;
    return this;
  }

  /**
   * Get mapIndex
   * @return mapIndex
  */
  
  @Schema(name = "map_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("map_index")
  public Integer getMapIndex() {
    return mapIndex;
  }

  public void setMapIndex(Integer mapIndex) {
    this.mapIndex = mapIndex;
  }

  public TaskInstance maxTries(Integer maxTries) {
    this.maxTries = maxTries;
    return this;
  }

  /**
   * Get maxTries
   * @return maxTries
  */
  
  @Schema(name = "max_tries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_tries")
  public Integer getMaxTries() {
    return maxTries;
  }

  public void setMaxTries(Integer maxTries) {
    this.maxTries = maxTries;
  }

  public TaskInstance note(String note) {
    this.note = JsonNullable.of(note);
    return this;
  }

  /**
   * Contains manually entered notes by the user about the TaskInstance.  *New in version 2.5.0* 
   * @return note
  */
  
  @Schema(name = "note", description = "Contains manually entered notes by the user about the TaskInstance.  *New in version 2.5.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public JsonNullable<String> getNote() {
    return note;
  }

  public void setNote(JsonNullable<String> note) {
    this.note = note;
  }

  public TaskInstance operator(String operator) {
    this.operator = JsonNullable.of(operator);
    return this;
  }

  /**
   * *Changed in version 2.1.1*&#58; Field becomes nullable. 
   * @return operator
  */
  
  @Schema(name = "operator", description = "*Changed in version 2.1.1*&#58; Field becomes nullable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public JsonNullable<String> getOperator() {
    return operator;
  }

  public void setOperator(JsonNullable<String> operator) {
    this.operator = operator;
  }

  public TaskInstance pid(Integer pid) {
    this.pid = JsonNullable.of(pid);
    return this;
  }

  /**
   * Get pid
   * @return pid
  */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public JsonNullable<Integer> getPid() {
    return pid;
  }

  public void setPid(JsonNullable<Integer> pid) {
    this.pid = pid;
  }

  public TaskInstance pool(String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * Get pool
   * @return pool
  */
  
  @Schema(name = "pool", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public TaskInstance poolSlots(Integer poolSlots) {
    this.poolSlots = poolSlots;
    return this;
  }

  /**
   * Get poolSlots
   * @return poolSlots
  */
  
  @Schema(name = "pool_slots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool_slots")
  public Integer getPoolSlots() {
    return poolSlots;
  }

  public void setPoolSlots(Integer poolSlots) {
    this.poolSlots = poolSlots;
  }

  public TaskInstance priorityWeight(Integer priorityWeight) {
    this.priorityWeight = JsonNullable.of(priorityWeight);
    return this;
  }

  /**
   * Get priorityWeight
   * @return priorityWeight
  */
  
  @Schema(name = "priority_weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority_weight")
  public JsonNullable<Integer> getPriorityWeight() {
    return priorityWeight;
  }

  public void setPriorityWeight(JsonNullable<Integer> priorityWeight) {
    this.priorityWeight = priorityWeight;
  }

  public TaskInstance queue(String queue) {
    this.queue = JsonNullable.of(queue);
    return this;
  }

  /**
   * Get queue
   * @return queue
  */
  
  @Schema(name = "queue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue")
  public JsonNullable<String> getQueue() {
    return queue;
  }

  public void setQueue(JsonNullable<String> queue) {
    this.queue = queue;
  }

  public TaskInstance queuedWhen(String queuedWhen) {
    this.queuedWhen = JsonNullable.of(queuedWhen);
    return this;
  }

  /**
   * Get queuedWhen
   * @return queuedWhen
  */
  
  @Schema(name = "queued_when", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queued_when")
  public JsonNullable<String> getQueuedWhen() {
    return queuedWhen;
  }

  public void setQueuedWhen(JsonNullable<String> queuedWhen) {
    this.queuedWhen = queuedWhen;
  }

  public TaskInstance renderedFields(Object renderedFields) {
    this.renderedFields = renderedFields;
    return this;
  }

  /**
   * JSON object describing rendered fields.  *New in version 2.3.0* 
   * @return renderedFields
  */
  
  @Schema(name = "rendered_fields", description = "JSON object describing rendered fields.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rendered_fields")
  public Object getRenderedFields() {
    return renderedFields;
  }

  public void setRenderedFields(Object renderedFields) {
    this.renderedFields = renderedFields;
  }

  public TaskInstance slaMiss(SLAMiss slaMiss) {
    this.slaMiss = JsonNullable.of(slaMiss);
    return this;
  }

  /**
   * Get slaMiss
   * @return slaMiss
  */
  @Valid 
  @Schema(name = "sla_miss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sla_miss")
  public JsonNullable<SLAMiss> getSlaMiss() {
    return slaMiss;
  }

  public void setSlaMiss(JsonNullable<SLAMiss> slaMiss) {
    this.slaMiss = slaMiss;
  }

  public TaskInstance startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "start_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public TaskInstance state(TaskState state) {
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
  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  public TaskInstance taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  */
  
  @Schema(name = "task_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_id")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public TaskInstance trigger(Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Get trigger
   * @return trigger
  */
  @Valid 
  @Schema(name = "trigger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trigger")
  public Trigger getTrigger() {
    return trigger;
  }

  public void setTrigger(Trigger trigger) {
    this.trigger = trigger;
  }

  public TaskInstance triggererJob(Job triggererJob) {
    this.triggererJob = triggererJob;
    return this;
  }

  /**
   * Get triggererJob
   * @return triggererJob
  */
  @Valid 
  @Schema(name = "triggerer_job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggerer_job")
  public Job getTriggererJob() {
    return triggererJob;
  }

  public void setTriggererJob(Job triggererJob) {
    this.triggererJob = triggererJob;
  }

  public TaskInstance tryNumber(Integer tryNumber) {
    this.tryNumber = tryNumber;
    return this;
  }

  /**
   * Get tryNumber
   * @return tryNumber
  */
  
  @Schema(name = "try_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("try_number")
  public Integer getTryNumber() {
    return tryNumber;
  }

  public void setTryNumber(Integer tryNumber) {
    this.tryNumber = tryNumber;
  }

  public TaskInstance unixname(String unixname) {
    this.unixname = unixname;
    return this;
  }

  /**
   * Get unixname
   * @return unixname
  */
  
  @Schema(name = "unixname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unixname")
  public String getUnixname() {
    return unixname;
  }

  public void setUnixname(String unixname) {
    this.unixname = unixname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstance taskInstance = (TaskInstance) o;
    return Objects.equals(this.dagId, taskInstance.dagId) &&
        Objects.equals(this.dagRunId, taskInstance.dagRunId) &&
        equalsNullable(this.duration, taskInstance.duration) &&
        equalsNullable(this.endDate, taskInstance.endDate) &&
        Objects.equals(this.executionDate, taskInstance.executionDate) &&
        Objects.equals(this.executorConfig, taskInstance.executorConfig) &&
        Objects.equals(this.hostname, taskInstance.hostname) &&
        Objects.equals(this.mapIndex, taskInstance.mapIndex) &&
        Objects.equals(this.maxTries, taskInstance.maxTries) &&
        equalsNullable(this.note, taskInstance.note) &&
        equalsNullable(this.operator, taskInstance.operator) &&
        equalsNullable(this.pid, taskInstance.pid) &&
        Objects.equals(this.pool, taskInstance.pool) &&
        Objects.equals(this.poolSlots, taskInstance.poolSlots) &&
        equalsNullable(this.priorityWeight, taskInstance.priorityWeight) &&
        equalsNullable(this.queue, taskInstance.queue) &&
        equalsNullable(this.queuedWhen, taskInstance.queuedWhen) &&
        Objects.equals(this.renderedFields, taskInstance.renderedFields) &&
        equalsNullable(this.slaMiss, taskInstance.slaMiss) &&
        equalsNullable(this.startDate, taskInstance.startDate) &&
        Objects.equals(this.state, taskInstance.state) &&
        Objects.equals(this.taskId, taskInstance.taskId) &&
        Objects.equals(this.trigger, taskInstance.trigger) &&
        Objects.equals(this.triggererJob, taskInstance.triggererJob) &&
        Objects.equals(this.tryNumber, taskInstance.tryNumber) &&
        Objects.equals(this.unixname, taskInstance.unixname);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, dagRunId, hashCodeNullable(duration), hashCodeNullable(endDate), executionDate, executorConfig, hostname, mapIndex, maxTries, hashCodeNullable(note), hashCodeNullable(operator), hashCodeNullable(pid), pool, poolSlots, hashCodeNullable(priorityWeight), hashCodeNullable(queue), hashCodeNullable(queuedWhen), renderedFields, hashCodeNullable(slaMiss), hashCodeNullable(startDate), state, taskId, trigger, triggererJob, tryNumber, unixname);
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
    sb.append("class TaskInstance {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    executorConfig: ").append(toIndentedString(executorConfig)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    mapIndex: ").append(toIndentedString(mapIndex)).append("\n");
    sb.append("    maxTries: ").append(toIndentedString(maxTries)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    poolSlots: ").append(toIndentedString(poolSlots)).append("\n");
    sb.append("    priorityWeight: ").append(toIndentedString(priorityWeight)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    queuedWhen: ").append(toIndentedString(queuedWhen)).append("\n");
    sb.append("    renderedFields: ").append(toIndentedString(renderedFields)).append("\n");
    sb.append("    slaMiss: ").append(toIndentedString(slaMiss)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    triggererJob: ").append(toIndentedString(triggererJob)).append("\n");
    sb.append("    tryNumber: ").append(toIndentedString(tryNumber)).append("\n");
    sb.append("    unixname: ").append(toIndentedString(unixname)).append("\n");
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


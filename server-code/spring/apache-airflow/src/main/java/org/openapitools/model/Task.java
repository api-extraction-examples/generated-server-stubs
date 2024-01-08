package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ClassReference;
import org.openapitools.model.DAG;
import org.openapitools.model.TaskExtraLinksInner;
import org.openapitools.model.TimeDelta;
import org.openapitools.model.TriggerRule;
import org.openapitools.model.WeightRule;
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
 * For details see: [airflow.models.BaseOperator](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.BaseOperator) 
 */

@Schema(name = "Task", description = "For details see: [airflow.models.BaseOperator](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.BaseOperator) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Task {

  private ClassReference classRef;

  private Boolean dependsOnPast;

  @Valid
  private List<String> downstreamTaskIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private TimeDelta executionTimeout;

  @Valid
  private List<@Valid TaskExtraLinksInner> extraLinks;

  private Boolean isMapped;

  private String owner;

  private String pool;

  private BigDecimal poolSlots;

  private BigDecimal priorityWeight;

  private JsonNullable<String> queue = JsonNullable.<String>undefined();

  private BigDecimal retries;

  private TimeDelta retryDelay;

  private Boolean retryExponentialBackoff;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  private DAG subDag;

  private String taskId;

  @Valid
  private List<String> templateFields;

  private TriggerRule triggerRule;

  private String uiColor;

  private String uiFgcolor;

  private Boolean waitForDownstream;

  private WeightRule weightRule;

  public Task classRef(ClassReference classRef) {
    this.classRef = classRef;
    return this;
  }

  /**
   * Get classRef
   * @return classRef
  */
  @Valid 
  @Schema(name = "class_ref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("class_ref")
  public ClassReference getClassRef() {
    return classRef;
  }

  public void setClassRef(ClassReference classRef) {
    this.classRef = classRef;
  }

  public Task dependsOnPast(Boolean dependsOnPast) {
    this.dependsOnPast = dependsOnPast;
    return this;
  }

  /**
   * Get dependsOnPast
   * @return dependsOnPast
  */
  
  @Schema(name = "depends_on_past", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("depends_on_past")
  public Boolean getDependsOnPast() {
    return dependsOnPast;
  }

  public void setDependsOnPast(Boolean dependsOnPast) {
    this.dependsOnPast = dependsOnPast;
  }

  public Task downstreamTaskIds(List<String> downstreamTaskIds) {
    this.downstreamTaskIds = downstreamTaskIds;
    return this;
  }

  public Task addDownstreamTaskIdsItem(String downstreamTaskIdsItem) {
    if (this.downstreamTaskIds == null) {
      this.downstreamTaskIds = new ArrayList<>();
    }
    this.downstreamTaskIds.add(downstreamTaskIdsItem);
    return this;
  }

  /**
   * Get downstreamTaskIds
   * @return downstreamTaskIds
  */
  
  @Schema(name = "downstream_task_ids", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downstream_task_ids")
  public List<String> getDownstreamTaskIds() {
    return downstreamTaskIds;
  }

  public void setDownstreamTaskIds(List<String> downstreamTaskIds) {
    this.downstreamTaskIds = downstreamTaskIds;
  }

  public Task endDate(OffsetDateTime endDate) {
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

  public Task executionTimeout(TimeDelta executionTimeout) {
    this.executionTimeout = executionTimeout;
    return this;
  }

  /**
   * Get executionTimeout
   * @return executionTimeout
  */
  @Valid 
  @Schema(name = "execution_timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_timeout")
  public TimeDelta getExecutionTimeout() {
    return executionTimeout;
  }

  public void setExecutionTimeout(TimeDelta executionTimeout) {
    this.executionTimeout = executionTimeout;
  }

  public Task extraLinks(List<@Valid TaskExtraLinksInner> extraLinks) {
    this.extraLinks = extraLinks;
    return this;
  }

  public Task addExtraLinksItem(TaskExtraLinksInner extraLinksItem) {
    if (this.extraLinks == null) {
      this.extraLinks = new ArrayList<>();
    }
    this.extraLinks.add(extraLinksItem);
    return this;
  }

  /**
   * Get extraLinks
   * @return extraLinks
  */
  @Valid 
  @Schema(name = "extra_links", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra_links")
  public List<@Valid TaskExtraLinksInner> getExtraLinks() {
    return extraLinks;
  }

  public void setExtraLinks(List<@Valid TaskExtraLinksInner> extraLinks) {
    this.extraLinks = extraLinks;
  }

  public Task isMapped(Boolean isMapped) {
    this.isMapped = isMapped;
    return this;
  }

  /**
   * Get isMapped
   * @return isMapped
  */
  
  @Schema(name = "is_mapped", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mapped")
  public Boolean getIsMapped() {
    return isMapped;
  }

  public void setIsMapped(Boolean isMapped) {
    this.isMapped = isMapped;
  }

  public Task owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  
  @Schema(name = "owner", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Task pool(String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * Get pool
   * @return pool
  */
  
  @Schema(name = "pool", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public Task poolSlots(BigDecimal poolSlots) {
    this.poolSlots = poolSlots;
    return this;
  }

  /**
   * Get poolSlots
   * @return poolSlots
  */
  @Valid 
  @Schema(name = "pool_slots", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool_slots")
  public BigDecimal getPoolSlots() {
    return poolSlots;
  }

  public void setPoolSlots(BigDecimal poolSlots) {
    this.poolSlots = poolSlots;
  }

  public Task priorityWeight(BigDecimal priorityWeight) {
    this.priorityWeight = priorityWeight;
    return this;
  }

  /**
   * Get priorityWeight
   * @return priorityWeight
  */
  @Valid 
  @Schema(name = "priority_weight", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority_weight")
  public BigDecimal getPriorityWeight() {
    return priorityWeight;
  }

  public void setPriorityWeight(BigDecimal priorityWeight) {
    this.priorityWeight = priorityWeight;
  }

  public Task queue(String queue) {
    this.queue = JsonNullable.of(queue);
    return this;
  }

  /**
   * Get queue
   * @return queue
  */
  
  @Schema(name = "queue", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue")
  public JsonNullable<String> getQueue() {
    return queue;
  }

  public void setQueue(JsonNullable<String> queue) {
    this.queue = queue;
  }

  public Task retries(BigDecimal retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Get retries
   * @return retries
  */
  @Valid 
  @Schema(name = "retries", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public BigDecimal getRetries() {
    return retries;
  }

  public void setRetries(BigDecimal retries) {
    this.retries = retries;
  }

  public Task retryDelay(TimeDelta retryDelay) {
    this.retryDelay = retryDelay;
    return this;
  }

  /**
   * Get retryDelay
   * @return retryDelay
  */
  @Valid 
  @Schema(name = "retry_delay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry_delay")
  public TimeDelta getRetryDelay() {
    return retryDelay;
  }

  public void setRetryDelay(TimeDelta retryDelay) {
    this.retryDelay = retryDelay;
  }

  public Task retryExponentialBackoff(Boolean retryExponentialBackoff) {
    this.retryExponentialBackoff = retryExponentialBackoff;
    return this;
  }

  /**
   * Get retryExponentialBackoff
   * @return retryExponentialBackoff
  */
  
  @Schema(name = "retry_exponential_backoff", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry_exponential_backoff")
  public Boolean getRetryExponentialBackoff() {
    return retryExponentialBackoff;
  }

  public void setRetryExponentialBackoff(Boolean retryExponentialBackoff) {
    this.retryExponentialBackoff = retryExponentialBackoff;
  }

  public Task startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "start_date", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Task subDag(DAG subDag) {
    this.subDag = subDag;
    return this;
  }

  /**
   * Get subDag
   * @return subDag
  */
  @Valid 
  @Schema(name = "sub_dag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sub_dag")
  public DAG getSubDag() {
    return subDag;
  }

  public void setSubDag(DAG subDag) {
    this.subDag = subDag;
  }

  public Task taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  */
  
  @Schema(name = "task_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_id")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public Task templateFields(List<String> templateFields) {
    this.templateFields = templateFields;
    return this;
  }

  public Task addTemplateFieldsItem(String templateFieldsItem) {
    if (this.templateFields == null) {
      this.templateFields = new ArrayList<>();
    }
    this.templateFields.add(templateFieldsItem);
    return this;
  }

  /**
   * Get templateFields
   * @return templateFields
  */
  
  @Schema(name = "template_fields", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("template_fields")
  public List<String> getTemplateFields() {
    return templateFields;
  }

  public void setTemplateFields(List<String> templateFields) {
    this.templateFields = templateFields;
  }

  public Task triggerRule(TriggerRule triggerRule) {
    this.triggerRule = triggerRule;
    return this;
  }

  /**
   * Get triggerRule
   * @return triggerRule
  */
  @Valid 
  @Schema(name = "trigger_rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trigger_rule")
  public TriggerRule getTriggerRule() {
    return triggerRule;
  }

  public void setTriggerRule(TriggerRule triggerRule) {
    this.triggerRule = triggerRule;
  }

  public Task uiColor(String uiColor) {
    this.uiColor = uiColor;
    return this;
  }

  /**
   * Color in hexadecimal notation.
   * @return uiColor
  */
  @Pattern(regexp = "^#[a-fA-F0-9]{3,6}$") 
  @Schema(name = "ui_color", description = "Color in hexadecimal notation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ui_color")
  public String getUiColor() {
    return uiColor;
  }

  public void setUiColor(String uiColor) {
    this.uiColor = uiColor;
  }

  public Task uiFgcolor(String uiFgcolor) {
    this.uiFgcolor = uiFgcolor;
    return this;
  }

  /**
   * Color in hexadecimal notation.
   * @return uiFgcolor
  */
  @Pattern(regexp = "^#[a-fA-F0-9]{3,6}$") 
  @Schema(name = "ui_fgcolor", description = "Color in hexadecimal notation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ui_fgcolor")
  public String getUiFgcolor() {
    return uiFgcolor;
  }

  public void setUiFgcolor(String uiFgcolor) {
    this.uiFgcolor = uiFgcolor;
  }

  public Task waitForDownstream(Boolean waitForDownstream) {
    this.waitForDownstream = waitForDownstream;
    return this;
  }

  /**
   * Get waitForDownstream
   * @return waitForDownstream
  */
  
  @Schema(name = "wait_for_downstream", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wait_for_downstream")
  public Boolean getWaitForDownstream() {
    return waitForDownstream;
  }

  public void setWaitForDownstream(Boolean waitForDownstream) {
    this.waitForDownstream = waitForDownstream;
  }

  public Task weightRule(WeightRule weightRule) {
    this.weightRule = weightRule;
    return this;
  }

  /**
   * Get weightRule
   * @return weightRule
  */
  @Valid 
  @Schema(name = "weight_rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight_rule")
  public WeightRule getWeightRule() {
    return weightRule;
  }

  public void setWeightRule(WeightRule weightRule) {
    this.weightRule = weightRule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.classRef, task.classRef) &&
        Objects.equals(this.dependsOnPast, task.dependsOnPast) &&
        Objects.equals(this.downstreamTaskIds, task.downstreamTaskIds) &&
        equalsNullable(this.endDate, task.endDate) &&
        Objects.equals(this.executionTimeout, task.executionTimeout) &&
        Objects.equals(this.extraLinks, task.extraLinks) &&
        Objects.equals(this.isMapped, task.isMapped) &&
        Objects.equals(this.owner, task.owner) &&
        Objects.equals(this.pool, task.pool) &&
        Objects.equals(this.poolSlots, task.poolSlots) &&
        Objects.equals(this.priorityWeight, task.priorityWeight) &&
        equalsNullable(this.queue, task.queue) &&
        Objects.equals(this.retries, task.retries) &&
        Objects.equals(this.retryDelay, task.retryDelay) &&
        Objects.equals(this.retryExponentialBackoff, task.retryExponentialBackoff) &&
        Objects.equals(this.startDate, task.startDate) &&
        Objects.equals(this.subDag, task.subDag) &&
        Objects.equals(this.taskId, task.taskId) &&
        Objects.equals(this.templateFields, task.templateFields) &&
        Objects.equals(this.triggerRule, task.triggerRule) &&
        Objects.equals(this.uiColor, task.uiColor) &&
        Objects.equals(this.uiFgcolor, task.uiFgcolor) &&
        Objects.equals(this.waitForDownstream, task.waitForDownstream) &&
        Objects.equals(this.weightRule, task.weightRule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRef, dependsOnPast, downstreamTaskIds, hashCodeNullable(endDate), executionTimeout, extraLinks, isMapped, owner, pool, poolSlots, priorityWeight, hashCodeNullable(queue), retries, retryDelay, retryExponentialBackoff, startDate, subDag, taskId, templateFields, triggerRule, uiColor, uiFgcolor, waitForDownstream, weightRule);
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
    sb.append("class Task {\n");
    sb.append("    classRef: ").append(toIndentedString(classRef)).append("\n");
    sb.append("    dependsOnPast: ").append(toIndentedString(dependsOnPast)).append("\n");
    sb.append("    downstreamTaskIds: ").append(toIndentedString(downstreamTaskIds)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionTimeout: ").append(toIndentedString(executionTimeout)).append("\n");
    sb.append("    extraLinks: ").append(toIndentedString(extraLinks)).append("\n");
    sb.append("    isMapped: ").append(toIndentedString(isMapped)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    poolSlots: ").append(toIndentedString(poolSlots)).append("\n");
    sb.append("    priorityWeight: ").append(toIndentedString(priorityWeight)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
    sb.append("    retryExponentialBackoff: ").append(toIndentedString(retryExponentialBackoff)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    subDag: ").append(toIndentedString(subDag)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    templateFields: ").append(toIndentedString(templateFields)).append("\n");
    sb.append("    triggerRule: ").append(toIndentedString(triggerRule)).append("\n");
    sb.append("    uiColor: ").append(toIndentedString(uiColor)).append("\n");
    sb.append("    uiFgcolor: ").append(toIndentedString(uiFgcolor)).append("\n");
    sb.append("    waitForDownstream: ").append(toIndentedString(waitForDownstream)).append("\n");
    sb.append("    weightRule: ").append(toIndentedString(weightRule)).append("\n");
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


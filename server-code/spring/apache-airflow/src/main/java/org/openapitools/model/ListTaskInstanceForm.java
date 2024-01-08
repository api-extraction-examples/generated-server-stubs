package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TaskState;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListTaskInstanceForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ListTaskInstanceForm {

  @Valid
  private List<String> dagIds;

  private BigDecimal durationGte;

  private BigDecimal durationLte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateLte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executionDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executionDateLte;

  @Valid
  private List<String> pool;

  @Valid
  private List<String> queue;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateGte;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateLte;

  @Valid
  private List<@Valid TaskState> state;

  public ListTaskInstanceForm dagIds(List<String> dagIds) {
    this.dagIds = dagIds;
    return this;
  }

  public ListTaskInstanceForm addDagIdsItem(String dagIdsItem) {
    if (this.dagIds == null) {
      this.dagIds = new ArrayList<>();
    }
    this.dagIds.add(dagIdsItem);
    return this;
  }

  /**
   * Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).
   * @return dagIds
  */
  
  @Schema(name = "dag_ids", description = "Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_ids")
  public List<String> getDagIds() {
    return dagIds;
  }

  public void setDagIds(List<String> dagIds) {
    this.dagIds = dagIds;
  }

  public ListTaskInstanceForm durationGte(BigDecimal durationGte) {
    this.durationGte = durationGte;
    return this;
  }

  /**
   * Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. 
   * @return durationGte
  */
  @Valid 
  @Schema(name = "duration_gte", description = "Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_gte")
  public BigDecimal getDurationGte() {
    return durationGte;
  }

  public void setDurationGte(BigDecimal durationGte) {
    this.durationGte = durationGte;
  }

  public ListTaskInstanceForm durationLte(BigDecimal durationLte) {
    this.durationLte = durationLte;
    return this;
  }

  /**
   * Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. 
   * @return durationLte
  */
  @Valid 
  @Schema(name = "duration_lte", description = "Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_lte")
  public BigDecimal getDurationLte() {
    return durationLte;
  }

  public void setDurationLte(BigDecimal durationLte) {
    this.durationLte = durationLte;
  }

  public ListTaskInstanceForm endDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
   * @return endDateGte
  */
  @Valid 
  @Schema(name = "end_date_gte", description = "Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date_gte")
  public OffsetDateTime getEndDateGte() {
    return endDateGte;
  }

  public void setEndDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
  }

  public ListTaskInstanceForm endDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
    return this;
  }

  /**
   * Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
   * @return endDateLte
  */
  @Valid 
  @Schema(name = "end_date_lte", description = "Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date_lte")
  public OffsetDateTime getEndDateLte() {
    return endDateLte;
  }

  public void setEndDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
  }

  public ListTaskInstanceForm executionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. 
   * @return executionDateGte
  */
  @Valid 
  @Schema(name = "execution_date_gte", description = "Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date_gte")
  public OffsetDateTime getExecutionDateGte() {
    return executionDateGte;
  }

  public void setExecutionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
  }

  public ListTaskInstanceForm executionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
    return this;
  }

  /**
   * Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. 
   * @return executionDateLte
  */
  @Valid 
  @Schema(name = "execution_date_lte", description = "Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date_lte")
  public OffsetDateTime getExecutionDateLte() {
    return executionDateLte;
  }

  public void setExecutionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
  }

  public ListTaskInstanceForm pool(List<String> pool) {
    this.pool = pool;
    return this;
  }

  public ListTaskInstanceForm addPoolItem(String poolItem) {
    if (this.pool == null) {
      this.pool = new ArrayList<>();
    }
    this.pool.add(poolItem);
    return this;
  }

  /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return pool
  */
  
  @Schema(name = "pool", description = "The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pool")
  public List<String> getPool() {
    return pool;
  }

  public void setPool(List<String> pool) {
    this.pool = pool;
  }

  public ListTaskInstanceForm queue(List<String> queue) {
    this.queue = queue;
    return this;
  }

  public ListTaskInstanceForm addQueueItem(String queueItem) {
    if (this.queue == null) {
      this.queue = new ArrayList<>();
    }
    this.queue.add(queueItem);
    return this;
  }

  /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return queue
  */
  
  @Schema(name = "queue", description = "The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue")
  public List<String> getQueue() {
    return queue;
  }

  public void setQueue(List<String> queue) {
    this.queue = queue;
  }

  public ListTaskInstanceForm startDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
    return this;
  }

  /**
   * Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
   * @return startDateGte
  */
  @Valid 
  @Schema(name = "start_date_gte", description = "Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date_gte")
  public OffsetDateTime getStartDateGte() {
    return startDateGte;
  }

  public void setStartDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
  }

  public ListTaskInstanceForm startDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
    return this;
  }

  /**
   * Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
   * @return startDateLte
  */
  @Valid 
  @Schema(name = "start_date_lte", description = "Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date_lte")
  public OffsetDateTime getStartDateLte() {
    return startDateLte;
  }

  public void setStartDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
  }

  public ListTaskInstanceForm state(List<@Valid TaskState> state) {
    this.state = state;
    return this;
  }

  public ListTaskInstanceForm addStateItem(TaskState stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<>();
    }
    this.state.add(stateItem);
    return this;
  }

  /**
   * The value can be repeated to retrieve multiple matching values (OR condition).
   * @return state
  */
  @Valid 
  @Schema(name = "state", description = "The value can be repeated to retrieve multiple matching values (OR condition).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public List<@Valid TaskState> getState() {
    return state;
  }

  public void setState(List<@Valid TaskState> state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTaskInstanceForm listTaskInstanceForm = (ListTaskInstanceForm) o;
    return Objects.equals(this.dagIds, listTaskInstanceForm.dagIds) &&
        Objects.equals(this.durationGte, listTaskInstanceForm.durationGte) &&
        Objects.equals(this.durationLte, listTaskInstanceForm.durationLte) &&
        Objects.equals(this.endDateGte, listTaskInstanceForm.endDateGte) &&
        Objects.equals(this.endDateLte, listTaskInstanceForm.endDateLte) &&
        Objects.equals(this.executionDateGte, listTaskInstanceForm.executionDateGte) &&
        Objects.equals(this.executionDateLte, listTaskInstanceForm.executionDateLte) &&
        Objects.equals(this.pool, listTaskInstanceForm.pool) &&
        Objects.equals(this.queue, listTaskInstanceForm.queue) &&
        Objects.equals(this.startDateGte, listTaskInstanceForm.startDateGte) &&
        Objects.equals(this.startDateLte, listTaskInstanceForm.startDateLte) &&
        Objects.equals(this.state, listTaskInstanceForm.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagIds, durationGte, durationLte, endDateGte, endDateLte, executionDateGte, executionDateLte, pool, queue, startDateGte, startDateLte, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTaskInstanceForm {\n");
    sb.append("    dagIds: ").append(toIndentedString(dagIds)).append("\n");
    sb.append("    durationGte: ").append(toIndentedString(durationGte)).append("\n");
    sb.append("    durationLte: ").append(toIndentedString(durationLte)).append("\n");
    sb.append("    endDateGte: ").append(toIndentedString(endDateGte)).append("\n");
    sb.append("    endDateLte: ").append(toIndentedString(endDateLte)).append("\n");
    sb.append("    executionDateGte: ").append(toIndentedString(executionDateGte)).append("\n");
    sb.append("    executionDateLte: ").append(toIndentedString(executionDateLte)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    startDateGte: ").append(toIndentedString(startDateGte)).append("\n");
    sb.append("    startDateLte: ").append(toIndentedString(startDateLte)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


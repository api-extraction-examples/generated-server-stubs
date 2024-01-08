package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Log of user operations via CLI or Web UI.
 */

@Schema(name = "EventLog", description = "Log of user operations via CLI or Web UI.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class EventLog {

  private JsonNullable<String> dagId = JsonNullable.<String>undefined();

  private String event;

  private Integer eventLogId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> executionDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> extra = JsonNullable.<String>undefined();

  private String owner;

  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime when;

  public EventLog dagId(String dagId) {
    this.dagId = JsonNullable.of(dagId);
    return this;
  }

  /**
   * The DAG ID
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public JsonNullable<String> getDagId() {
    return dagId;
  }

  public void setDagId(JsonNullable<String> dagId) {
    this.dagId = dagId;
  }

  public EventLog event(String event) {
    this.event = event;
    return this;
  }

  /**
   * A key describing the type of event.
   * @return event
  */
  
  @Schema(name = "event", accessMode = Schema.AccessMode.READ_ONLY, description = "A key describing the type of event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public EventLog eventLogId(Integer eventLogId) {
    this.eventLogId = eventLogId;
    return this;
  }

  /**
   * The event log ID
   * @return eventLogId
  */
  
  @Schema(name = "event_log_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The event log ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_log_id")
  public Integer getEventLogId() {
    return eventLogId;
  }

  public void setEventLogId(Integer eventLogId) {
    this.eventLogId = eventLogId;
  }

  public EventLog executionDate(OffsetDateTime executionDate) {
    this.executionDate = JsonNullable.of(executionDate);
    return this;
  }

  /**
   * When the event was dispatched for an object having execution_date, the value of this field. 
   * @return executionDate
  */
  @Valid 
  @Schema(name = "execution_date", accessMode = Schema.AccessMode.READ_ONLY, description = "When the event was dispatched for an object having execution_date, the value of this field. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("execution_date")
  public JsonNullable<OffsetDateTime> getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(JsonNullable<OffsetDateTime> executionDate) {
    this.executionDate = executionDate;
  }

  public EventLog extra(String extra) {
    this.extra = JsonNullable.of(extra);
    return this;
  }

  /**
   * Other information that was not included in the other fields, e.g. the complete CLI command. 
   * @return extra
  */
  
  @Schema(name = "extra", accessMode = Schema.AccessMode.READ_ONLY, description = "Other information that was not included in the other fields, e.g. the complete CLI command. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public JsonNullable<String> getExtra() {
    return extra;
  }

  public void setExtra(JsonNullable<String> extra) {
    this.extra = extra;
  }

  public EventLog owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Name of the user who triggered these events a.
   * @return owner
  */
  
  @Schema(name = "owner", accessMode = Schema.AccessMode.READ_ONLY, description = "Name of the user who triggered these events a.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public EventLog taskId(String taskId) {
    this.taskId = JsonNullable.of(taskId);
    return this;
  }

  /**
   * The DAG ID
   * @return taskId
  */
  
  @Schema(name = "task_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_id")
  public JsonNullable<String> getTaskId() {
    return taskId;
  }

  public void setTaskId(JsonNullable<String> taskId) {
    this.taskId = taskId;
  }

  public EventLog when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

  /**
   * The time when these events happened.
   * @return when
  */
  @Valid 
  @Schema(name = "when", accessMode = Schema.AccessMode.READ_ONLY, description = "The time when these events happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("when")
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventLog eventLog = (EventLog) o;
    return equalsNullable(this.dagId, eventLog.dagId) &&
        Objects.equals(this.event, eventLog.event) &&
        Objects.equals(this.eventLogId, eventLog.eventLogId) &&
        equalsNullable(this.executionDate, eventLog.executionDate) &&
        equalsNullable(this.extra, eventLog.extra) &&
        Objects.equals(this.owner, eventLog.owner) &&
        equalsNullable(this.taskId, eventLog.taskId) &&
        Objects.equals(this.when, eventLog.when);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dagId), event, eventLogId, hashCodeNullable(executionDate), hashCodeNullable(extra), owner, hashCodeNullable(taskId), when);
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
    sb.append("class EventLog {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventLogId: ").append(toIndentedString(eventLogId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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


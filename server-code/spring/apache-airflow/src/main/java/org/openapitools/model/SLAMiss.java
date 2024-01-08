package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
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
 * SLAMiss
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class SLAMiss {

  private String dagId;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private Boolean emailSent;

  private String executionDate;

  private Boolean notificationSent;

  private String taskId;

  private String timestamp;

  public SLAMiss dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * The DAG ID.
   * @return dagId
  */
  
  @Schema(name = "dag_id", description = "The DAG ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public SLAMiss description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public SLAMiss emailSent(Boolean emailSent) {
    this.emailSent = emailSent;
    return this;
  }

  /**
   * Get emailSent
   * @return emailSent
  */
  
  @Schema(name = "email_sent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email_sent")
  public Boolean getEmailSent() {
    return emailSent;
  }

  public void setEmailSent(Boolean emailSent) {
    this.emailSent = emailSent;
  }

  public SLAMiss executionDate(String executionDate) {
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

  public SLAMiss notificationSent(Boolean notificationSent) {
    this.notificationSent = notificationSent;
    return this;
  }

  /**
   * Get notificationSent
   * @return notificationSent
  */
  
  @Schema(name = "notification_sent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification_sent")
  public Boolean getNotificationSent() {
    return notificationSent;
  }

  public void setNotificationSent(Boolean notificationSent) {
    this.notificationSent = notificationSent;
  }

  public SLAMiss taskId(String taskId) {
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

  public SLAMiss timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAMiss slAMiss = (SLAMiss) o;
    return Objects.equals(this.dagId, slAMiss.dagId) &&
        equalsNullable(this.description, slAMiss.description) &&
        Objects.equals(this.emailSent, slAMiss.emailSent) &&
        Objects.equals(this.executionDate, slAMiss.executionDate) &&
        Objects.equals(this.notificationSent, slAMiss.notificationSent) &&
        Objects.equals(this.taskId, slAMiss.taskId) &&
        Objects.equals(this.timestamp, slAMiss.timestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, hashCodeNullable(description), emailSent, executionDate, notificationSent, taskId, timestamp);
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
    sb.append("class SLAMiss {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    emailSent: ").append(toIndentedString(emailSent)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    notificationSent: ").append(toIndentedString(notificationSent)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


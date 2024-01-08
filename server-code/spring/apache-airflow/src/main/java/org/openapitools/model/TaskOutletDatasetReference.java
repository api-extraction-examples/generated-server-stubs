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
 * A datasets reference to an upstream task.  *New in version 2.4.0* 
 */

@Schema(name = "TaskOutletDatasetReference", description = "A datasets reference to an upstream task.  *New in version 2.4.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class TaskOutletDatasetReference {

  private String createdAt;

  private JsonNullable<String> dagId = JsonNullable.<String>undefined();

  private JsonNullable<String> taskId = JsonNullable.<String>undefined();

  private String updatedAt;

  public TaskOutletDatasetReference createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The dataset creation time
   * @return createdAt
  */
  
  @Schema(name = "created_at", description = "The dataset creation time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public TaskOutletDatasetReference dagId(String dagId) {
    this.dagId = JsonNullable.of(dagId);
    return this;
  }

  /**
   * The DAG ID that updates the dataset.
   * @return dagId
  */
  
  @Schema(name = "dag_id", description = "The DAG ID that updates the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public JsonNullable<String> getDagId() {
    return dagId;
  }

  public void setDagId(JsonNullable<String> dagId) {
    this.dagId = dagId;
  }

  public TaskOutletDatasetReference taskId(String taskId) {
    this.taskId = JsonNullable.of(taskId);
    return this;
  }

  /**
   * The task ID that updates the dataset.
   * @return taskId
  */
  
  @Schema(name = "task_id", description = "The task ID that updates the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_id")
  public JsonNullable<String> getTaskId() {
    return taskId;
  }

  public void setTaskId(JsonNullable<String> taskId) {
    this.taskId = taskId;
  }

  public TaskOutletDatasetReference updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The dataset update time
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", description = "The dataset update time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskOutletDatasetReference taskOutletDatasetReference = (TaskOutletDatasetReference) o;
    return Objects.equals(this.createdAt, taskOutletDatasetReference.createdAt) &&
        equalsNullable(this.dagId, taskOutletDatasetReference.dagId) &&
        equalsNullable(this.taskId, taskOutletDatasetReference.taskId) &&
        Objects.equals(this.updatedAt, taskOutletDatasetReference.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, hashCodeNullable(dagId), hashCodeNullable(taskId), updatedAt);
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
    sb.append("class TaskOutletDatasetReference {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


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
 * XCom entry collection item.  The value field is only available when reading a single object due to the size of the value. 
 */

@Schema(name = "XComCollectionItem", description = "XCom entry collection item.  The value field is only available when reading a single object due to the size of the value. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class XComCollectionItem {

  private String dagId;

  private String executionDate;

  private String key;

  private String taskId;

  private String timestamp;

  public XComCollectionItem dagId(String dagId) {
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

  public XComCollectionItem executionDate(String executionDate) {
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

  public XComCollectionItem key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public XComCollectionItem taskId(String taskId) {
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

  public XComCollectionItem timestamp(String timestamp) {
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
    XComCollectionItem xcomCollectionItem = (XComCollectionItem) o;
    return Objects.equals(this.dagId, xcomCollectionItem.dagId) &&
        Objects.equals(this.executionDate, xcomCollectionItem.executionDate) &&
        Objects.equals(this.key, xcomCollectionItem.key) &&
        Objects.equals(this.taskId, xcomCollectionItem.taskId) &&
        Objects.equals(this.timestamp, xcomCollectionItem.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, executionDate, key, taskId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XComCollectionItem {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TaskCompletionStatus;
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
 * Class TaskExecutionInfo.
 */

@Schema(name = "TaskResult", description = "Class TaskExecutionInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TaskResult {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTimeUtc;

  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> key = JsonNullable.<String>undefined();

  private JsonNullable<String> longErrorMessage = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTimeUtc;

  private TaskCompletionStatus status;

  public TaskResult endTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
    return this;
  }

  /**
   * Gets or sets the end time UTC.
   * @return endTimeUtc
  */
  @Valid 
  @Schema(name = "EndTimeUtc", description = "Gets or sets the end time UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndTimeUtc")
  public OffsetDateTime getEndTimeUtc() {
    return endTimeUtc;
  }

  public void setEndTimeUtc(OffsetDateTime endTimeUtc) {
    this.endTimeUtc = endTimeUtc;
  }

  public TaskResult errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.of(errorMessage);
    return this;
  }

  /**
   * Gets or sets the error message.
   * @return errorMessage
  */
  
  @Schema(name = "ErrorMessage", description = "Gets or sets the error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ErrorMessage")
  public JsonNullable<String> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TaskResult id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public TaskResult key(String key) {
    this.key = JsonNullable.of(key);
    return this;
  }

  /**
   * Gets or sets the key.
   * @return key
  */
  
  @Schema(name = "Key", description = "Gets or sets the key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Key")
  public JsonNullable<String> getKey() {
    return key;
  }

  public void setKey(JsonNullable<String> key) {
    this.key = key;
  }

  public TaskResult longErrorMessage(String longErrorMessage) {
    this.longErrorMessage = JsonNullable.of(longErrorMessage);
    return this;
  }

  /**
   * Gets or sets the long error message.
   * @return longErrorMessage
  */
  
  @Schema(name = "LongErrorMessage", description = "Gets or sets the long error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LongErrorMessage")
  public JsonNullable<String> getLongErrorMessage() {
    return longErrorMessage;
  }

  public void setLongErrorMessage(JsonNullable<String> longErrorMessage) {
    this.longErrorMessage = longErrorMessage;
  }

  public TaskResult name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public TaskResult startTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
    return this;
  }

  /**
   * Gets or sets the start time UTC.
   * @return startTimeUtc
  */
  @Valid 
  @Schema(name = "StartTimeUtc", description = "Gets or sets the start time UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartTimeUtc")
  public OffsetDateTime getStartTimeUtc() {
    return startTimeUtc;
  }

  public void setStartTimeUtc(OffsetDateTime startTimeUtc) {
    this.startTimeUtc = startTimeUtc;
  }

  public TaskResult status(TaskCompletionStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public TaskCompletionStatus getStatus() {
    return status;
  }

  public void setStatus(TaskCompletionStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResult taskResult = (TaskResult) o;
    return Objects.equals(this.endTimeUtc, taskResult.endTimeUtc) &&
        equalsNullable(this.errorMessage, taskResult.errorMessage) &&
        equalsNullable(this.id, taskResult.id) &&
        equalsNullable(this.key, taskResult.key) &&
        equalsNullable(this.longErrorMessage, taskResult.longErrorMessage) &&
        equalsNullable(this.name, taskResult.name) &&
        Objects.equals(this.startTimeUtc, taskResult.startTimeUtc) &&
        Objects.equals(this.status, taskResult.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTimeUtc, hashCodeNullable(errorMessage), hashCodeNullable(id), hashCodeNullable(key), hashCodeNullable(longErrorMessage), hashCodeNullable(name), startTimeUtc, status);
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
    sb.append("class TaskResult {\n");
    sb.append("    endTimeUtc: ").append(toIndentedString(endTimeUtc)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    longErrorMessage: ").append(toIndentedString(longErrorMessage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTimeUtc: ").append(toIndentedString(startTimeUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


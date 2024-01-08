package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.model.RemoveOptionFromIssuesResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a task.
 */

@Schema(name = "TaskProgressBeanRemoveOptionFromIssuesResult", description = "Details about a task.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class TaskProgressBeanRemoveOptionFromIssuesResult {

  private String description;

  private Long elapsedRuntime;

  private Long finished;

  private String id;

  private Long lastUpdate;

  private String message;

  private Long progress;

  private RemoveOptionFromIssuesResult result;

  private URI self;

  private Long started;

  /**
   * The status of the task.
   */
  public enum StatusEnum {
    ENQUEUED("ENQUEUED"),
    
    RUNNING("RUNNING"),
    
    COMPLETE("COMPLETE"),
    
    FAILED("FAILED"),
    
    CANCEL_REQUESTED("CANCEL_REQUESTED"),
    
    CANCELLED("CANCELLED"),
    
    DEAD("DEAD");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Long submitted;

  private Long submittedBy;

  public TaskProgressBeanRemoveOptionFromIssuesResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskProgressBeanRemoveOptionFromIssuesResult(Long elapsedRuntime, String id, Long lastUpdate, Long progress, URI self, StatusEnum status, Long submitted, Long submittedBy) {
    this.elapsedRuntime = elapsedRuntime;
    this.id = id;
    this.lastUpdate = lastUpdate;
    this.progress = progress;
    this.self = self;
    this.status = status;
    this.submitted = submitted;
    this.submittedBy = submittedBy;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the task.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult elapsedRuntime(Long elapsedRuntime) {
    this.elapsedRuntime = elapsedRuntime;
    return this;
  }

  /**
   * The execution time of the task, in milliseconds.
   * @return elapsedRuntime
  */
  @NotNull 
  @Schema(name = "elapsedRuntime", description = "The execution time of the task, in milliseconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("elapsedRuntime")
  public Long getElapsedRuntime() {
    return elapsedRuntime;
  }

  public void setElapsedRuntime(Long elapsedRuntime) {
    this.elapsedRuntime = elapsedRuntime;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult finished(Long finished) {
    this.finished = finished;
    return this;
  }

  /**
   * A timestamp recording when the task was finished.
   * @return finished
  */
  
  @Schema(name = "finished", description = "A timestamp recording when the task was finished.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Long getFinished() {
    return finished;
  }

  public void setFinished(Long finished) {
    this.finished = finished;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the task.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult lastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * A timestamp recording when the task progress was last updated.
   * @return lastUpdate
  */
  @NotNull 
  @Schema(name = "lastUpdate", description = "A timestamp recording when the task progress was last updated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastUpdate")
  public Long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Information about the progress of the task.
   * @return message
  */
  
  @Schema(name = "message", description = "Information about the progress of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult progress(Long progress) {
    this.progress = progress;
    return this;
  }

  /**
   * The progress of the task, as a percentage complete.
   * @return progress
  */
  @NotNull 
  @Schema(name = "progress", description = "The progress of the task, as a percentage complete.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("progress")
  public Long getProgress() {
    return progress;
  }

  public void setProgress(Long progress) {
    this.progress = progress;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult result(RemoveOptionFromIssuesResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @Valid 
  @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public RemoveOptionFromIssuesResult getResult() {
    return result;
  }

  public void setResult(RemoveOptionFromIssuesResult result) {
    this.result = result;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the task.
   * @return self
  */
  @NotNull @Valid 
  @Schema(name = "self", description = "The URL of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult started(Long started) {
    this.started = started;
    return this;
  }

  /**
   * A timestamp recording when the task was started.
   * @return started
  */
  
  @Schema(name = "started", description = "A timestamp recording when the task was started.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("started")
  public Long getStarted() {
    return started;
  }

  public void setStarted(Long started) {
    this.started = started;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the task.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "The status of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult submitted(Long submitted) {
    this.submitted = submitted;
    return this;
  }

  /**
   * A timestamp recording when the task was submitted.
   * @return submitted
  */
  @NotNull 
  @Schema(name = "submitted", description = "A timestamp recording when the task was submitted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("submitted")
  public Long getSubmitted() {
    return submitted;
  }

  public void setSubmitted(Long submitted) {
    this.submitted = submitted;
  }

  public TaskProgressBeanRemoveOptionFromIssuesResult submittedBy(Long submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }

  /**
   * The ID of the user who submitted the task.
   * @return submittedBy
  */
  @NotNull 
  @Schema(name = "submittedBy", description = "The ID of the user who submitted the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("submittedBy")
  public Long getSubmittedBy() {
    return submittedBy;
  }

  public void setSubmittedBy(Long submittedBy) {
    this.submittedBy = submittedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskProgressBeanRemoveOptionFromIssuesResult taskProgressBeanRemoveOptionFromIssuesResult = (TaskProgressBeanRemoveOptionFromIssuesResult) o;
    return Objects.equals(this.description, taskProgressBeanRemoveOptionFromIssuesResult.description) &&
        Objects.equals(this.elapsedRuntime, taskProgressBeanRemoveOptionFromIssuesResult.elapsedRuntime) &&
        Objects.equals(this.finished, taskProgressBeanRemoveOptionFromIssuesResult.finished) &&
        Objects.equals(this.id, taskProgressBeanRemoveOptionFromIssuesResult.id) &&
        Objects.equals(this.lastUpdate, taskProgressBeanRemoveOptionFromIssuesResult.lastUpdate) &&
        Objects.equals(this.message, taskProgressBeanRemoveOptionFromIssuesResult.message) &&
        Objects.equals(this.progress, taskProgressBeanRemoveOptionFromIssuesResult.progress) &&
        Objects.equals(this.result, taskProgressBeanRemoveOptionFromIssuesResult.result) &&
        Objects.equals(this.self, taskProgressBeanRemoveOptionFromIssuesResult.self) &&
        Objects.equals(this.started, taskProgressBeanRemoveOptionFromIssuesResult.started) &&
        Objects.equals(this.status, taskProgressBeanRemoveOptionFromIssuesResult.status) &&
        Objects.equals(this.submitted, taskProgressBeanRemoveOptionFromIssuesResult.submitted) &&
        Objects.equals(this.submittedBy, taskProgressBeanRemoveOptionFromIssuesResult.submittedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, elapsedRuntime, finished, id, lastUpdate, message, progress, result, self, started, status, submitted, submittedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskProgressBeanRemoveOptionFromIssuesResult {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elapsedRuntime: ").append(toIndentedString(elapsedRuntime)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
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


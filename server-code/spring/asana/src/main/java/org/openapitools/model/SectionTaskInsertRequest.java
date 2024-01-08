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
 * SectionTaskInsertRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class SectionTaskInsertRequest {

  private String insertAfter;

  private String insertBefore;

  private String task;

  public SectionTaskInsertRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SectionTaskInsertRequest(String task) {
    this.task = task;
  }

  public SectionTaskInsertRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "987654", description = "An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public SectionTaskInsertRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "86420", description = "An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public SectionTaskInsertRequest task(String task) {
    this.task = task;
    return this;
  }

  /**
   * The task to add to this section.
   * @return task
  */
  @NotNull 
  @Schema(name = "task", example = "123456", description = "The task to add to this section.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("task")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionTaskInsertRequest sectionTaskInsertRequest = (SectionTaskInsertRequest) o;
    return Objects.equals(this.insertAfter, sectionTaskInsertRequest.insertAfter) &&
        Objects.equals(this.insertBefore, sectionTaskInsertRequest.insertBefore) &&
        Objects.equals(this.task, sectionTaskInsertRequest.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertAfter, insertBefore, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionTaskInsertRequest {\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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


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
 * TaskSetParentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TaskSetParentRequest {

  private String insertAfter;

  private String insertBefore;

  private String parent;

  public TaskSetParentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskSetParentRequest(String parent) {
    this.parent = parent;
  }

  public TaskSetParentRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * A subtask of the parent to insert the task after, or `null` to insert at the beginning of the list.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", description = "A subtask of the parent to insert the task after, or `null` to insert at the beginning of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public TaskSetParentRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * A subtask of the parent to insert the task before, or `null` to insert at the end of the list.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "124816", description = "A subtask of the parent to insert the task before, or `null` to insert at the end of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public TaskSetParentRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The new parent of the task, or `null` for no parent.
   * @return parent
  */
  @NotNull 
  @Schema(name = "parent", example = "987654", description = "The new parent of the task, or `null` for no parent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSetParentRequest taskSetParentRequest = (TaskSetParentRequest) o;
    return Objects.equals(this.insertAfter, taskSetParentRequest.insertAfter) &&
        Objects.equals(this.insertBefore, taskSetParentRequest.insertBefore) &&
        Objects.equals(this.parent, taskSetParentRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertAfter, insertBefore, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSetParentRequest {\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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


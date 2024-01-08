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
 * Properties that identify a workflow.
 */

@Schema(name = "WorkflowId", description = "Properties that identify a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowId {

  private Boolean draft;

  private String name;

  public WorkflowId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowId(Boolean draft, String name) {
    this.draft = draft;
    this.name = name;
  }

  public WorkflowId draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  /**
   * Whether the workflow is in the draft state.
   * @return draft
  */
  @NotNull 
  @Schema(name = "draft", description = "Whether the workflow is in the draft state.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("draft")
  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public WorkflowId name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowId workflowId = (WorkflowId) o;
    return Objects.equals(this.draft, workflowId.draft) &&
        Objects.equals(this.name, workflowId.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowId {\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


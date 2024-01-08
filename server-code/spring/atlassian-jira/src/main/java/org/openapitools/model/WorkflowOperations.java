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
 * Operations allowed on a workflow
 */

@Schema(name = "WorkflowOperations", description = "Operations allowed on a workflow")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowOperations {

  private Boolean canDelete;

  private Boolean canEdit;

  public WorkflowOperations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowOperations(Boolean canDelete, Boolean canEdit) {
    this.canDelete = canDelete;
    this.canEdit = canEdit;
  }

  public WorkflowOperations canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

  /**
   * Whether the workflow can be deleted.
   * @return canDelete
  */
  @NotNull 
  @Schema(name = "canDelete", description = "Whether the workflow can be deleted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("canDelete")
  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public WorkflowOperations canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Whether the workflow can be updated.
   * @return canEdit
  */
  @NotNull 
  @Schema(name = "canEdit", description = "Whether the workflow can be updated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("canEdit")
  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowOperations workflowOperations = (WorkflowOperations) o;
    return Objects.equals(this.canDelete, workflowOperations.canDelete) &&
        Objects.equals(this.canEdit, workflowOperations.canEdit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canEdit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowOperations {\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
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


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
 * An associated workflow scheme and project.
 */

@Schema(name = "WorkflowSchemeProjectAssociation", description = "An associated workflow scheme and project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowSchemeProjectAssociation {

  private String projectId;

  private String workflowSchemeId;

  public WorkflowSchemeProjectAssociation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowSchemeProjectAssociation(String projectId) {
    this.projectId = projectId;
  }

  public WorkflowSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  @NotNull 
  @Schema(name = "projectId", description = "The ID of the project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public WorkflowSchemeProjectAssociation workflowSchemeId(String workflowSchemeId) {
    this.workflowSchemeId = workflowSchemeId;
    return this;
  }

  /**
   * The ID of the workflow scheme. If the workflow scheme ID is `null`, the operation assigns the default workflow scheme.
   * @return workflowSchemeId
  */
  
  @Schema(name = "workflowSchemeId", description = "The ID of the workflow scheme. If the workflow scheme ID is `null`, the operation assigns the default workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowSchemeId")
  public String getWorkflowSchemeId() {
    return workflowSchemeId;
  }

  public void setWorkflowSchemeId(String workflowSchemeId) {
    this.workflowSchemeId = workflowSchemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation = (WorkflowSchemeProjectAssociation) o;
    return Objects.equals(this.projectId, workflowSchemeProjectAssociation.projectId) &&
        Objects.equals(this.workflowSchemeId, workflowSchemeProjectAssociation.workflowSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, workflowSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeProjectAssociation {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    workflowSchemeId: ").append(toIndentedString(workflowSchemeId)).append("\n");
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


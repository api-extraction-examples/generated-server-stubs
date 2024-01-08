package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow scheme along with a list of projects that use it.
 */

@Schema(name = "WorkflowSchemeAssociations", description = "A workflow scheme along with a list of projects that use it.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowSchemeAssociations {

  @Valid
  private List<String> projectIds = new ArrayList<>();

  private WorkflowScheme workflowScheme;

  public WorkflowSchemeAssociations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowSchemeAssociations(List<String> projectIds, WorkflowScheme workflowScheme) {
    this.projectIds = projectIds;
    this.workflowScheme = workflowScheme;
  }

  public WorkflowSchemeAssociations projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public WorkflowSchemeAssociations addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The list of projects that use the workflow scheme.
   * @return projectIds
  */
  @NotNull 
  @Schema(name = "projectIds", description = "The list of projects that use the workflow scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectIds")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public WorkflowSchemeAssociations workflowScheme(WorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
    return this;
  }

  /**
   * Get workflowScheme
   * @return workflowScheme
  */
  @NotNull @Valid 
  @Schema(name = "workflowScheme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workflowScheme")
  public WorkflowScheme getWorkflowScheme() {
    return workflowScheme;
  }

  public void setWorkflowScheme(WorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeAssociations workflowSchemeAssociations = (WorkflowSchemeAssociations) o;
    return Objects.equals(this.projectIds, workflowSchemeAssociations.projectIds) &&
        Objects.equals(this.workflowScheme, workflowSchemeAssociations.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, workflowScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeAssociations {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the mapping between issue types and a workflow.
 */

@Schema(name = "IssueTypesWorkflowMapping", description = "Details about the mapping between issue types and a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypesWorkflowMapping {

  private Boolean defaultMapping;

  @Valid
  private List<String> issueTypes;

  private Boolean updateDraftIfNeeded;

  private String workflow;

  public IssueTypesWorkflowMapping defaultMapping(Boolean defaultMapping) {
    this.defaultMapping = defaultMapping;
    return this;
  }

  /**
   * Whether the workflow is the default workflow for the workflow scheme.
   * @return defaultMapping
  */
  
  @Schema(name = "defaultMapping", description = "Whether the workflow is the default workflow for the workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultMapping")
  public Boolean getDefaultMapping() {
    return defaultMapping;
  }

  public void setDefaultMapping(Boolean defaultMapping) {
    this.defaultMapping = defaultMapping;
  }

  public IssueTypesWorkflowMapping issueTypes(List<String> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public IssueTypesWorkflowMapping addIssueTypesItem(String issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new ArrayList<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

  /**
   * The list of issue type IDs.
   * @return issueTypes
  */
  
  @Schema(name = "issueTypes", description = "The list of issue type IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypes")
  public List<String> getIssueTypes() {
    return issueTypes;
  }

  public void setIssueTypes(List<String> issueTypes) {
    this.issueTypes = issueTypes;
  }

  public IssueTypesWorkflowMapping updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

  /**
   * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.
   * @return updateDraftIfNeeded
  */
  
  @Schema(name = "updateDraftIfNeeded", description = "Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new workflow-issue types mapping. Defaults to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDraftIfNeeded")
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }

  public IssueTypesWorkflowMapping workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * The name of the workflow. Optional if updating the workflow-issue types mapping.
   * @return workflow
  */
  
  @Schema(name = "workflow", description = "The name of the workflow. Optional if updating the workflow-issue types mapping.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflow")
  public String getWorkflow() {
    return workflow;
  }

  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypesWorkflowMapping issueTypesWorkflowMapping = (IssueTypesWorkflowMapping) o;
    return Objects.equals(this.defaultMapping, issueTypesWorkflowMapping.defaultMapping) &&
        Objects.equals(this.issueTypes, issueTypesWorkflowMapping.issueTypes) &&
        Objects.equals(this.updateDraftIfNeeded, issueTypesWorkflowMapping.updateDraftIfNeeded) &&
        Objects.equals(this.workflow, issueTypesWorkflowMapping.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMapping, issueTypes, updateDraftIfNeeded, workflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypesWorkflowMapping {\n");
    sb.append("    defaultMapping: ").append(toIndentedString(defaultMapping)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
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


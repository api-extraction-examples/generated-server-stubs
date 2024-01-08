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
 * Details about the mapping between an issue type and a workflow.
 */

@Schema(name = "IssueTypeWorkflowMapping", description = "Details about the mapping between an issue type and a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeWorkflowMapping {

  private String issueType;

  private Boolean updateDraftIfNeeded;

  private String workflow;

  public IssueTypeWorkflowMapping issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * The ID of the issue type. Not required if updating the issue type-workflow mapping.
   * @return issueType
  */
  
  @Schema(name = "issueType", description = "The ID of the issue type. Not required if updating the issue type-workflow mapping.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueType")
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }

  public IssueTypeWorkflowMapping updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

  /**
   * Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
   * @return updateDraftIfNeeded
  */
  
  @Schema(name = "updateDraftIfNeeded", description = "Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDraftIfNeeded")
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }

  public IssueTypeWorkflowMapping workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * The name of the workflow.
   * @return workflow
  */
  
  @Schema(name = "workflow", description = "The name of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IssueTypeWorkflowMapping issueTypeWorkflowMapping = (IssueTypeWorkflowMapping) o;
    return Objects.equals(this.issueType, issueTypeWorkflowMapping.issueType) &&
        Objects.equals(this.updateDraftIfNeeded, issueTypeWorkflowMapping.updateDraftIfNeeded) &&
        Objects.equals(this.workflow, issueTypeWorkflowMapping.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueType, updateDraftIfNeeded, workflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeWorkflowMapping {\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
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


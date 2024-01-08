package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.WorkflowId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a workflow configuration update request.
 */

@Schema(name = "WorkflowTransitionRulesDetails", description = "Details about a workflow configuration update request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowTransitionRulesDetails {

  private WorkflowId workflowId;

  @Valid
  private Set<String> workflowRuleIds = new LinkedHashSet<>();

  public WorkflowTransitionRulesDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowTransitionRulesDetails(WorkflowId workflowId, Set<String> workflowRuleIds) {
    this.workflowId = workflowId;
    this.workflowRuleIds = workflowRuleIds;
  }

  public WorkflowTransitionRulesDetails workflowId(WorkflowId workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Get workflowId
   * @return workflowId
  */
  @NotNull @Valid 
  @Schema(name = "workflowId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workflowId")
  public WorkflowId getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(WorkflowId workflowId) {
    this.workflowId = workflowId;
  }

  public WorkflowTransitionRulesDetails workflowRuleIds(Set<String> workflowRuleIds) {
    this.workflowRuleIds = workflowRuleIds;
    return this;
  }

  public WorkflowTransitionRulesDetails addWorkflowRuleIdsItem(String workflowRuleIdsItem) {
    if (this.workflowRuleIds == null) {
      this.workflowRuleIds = new LinkedHashSet<>();
    }
    this.workflowRuleIds.add(workflowRuleIdsItem);
    return this;
  }

  /**
   * The list of connect workflow rule IDs.
   * @return workflowRuleIds
  */
  @NotNull 
  @Schema(name = "workflowRuleIds", description = "The list of connect workflow rule IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workflowRuleIds")
  public Set<String> getWorkflowRuleIds() {
    return workflowRuleIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setWorkflowRuleIds(Set<String> workflowRuleIds) {
    this.workflowRuleIds = workflowRuleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesDetails workflowTransitionRulesDetails = (WorkflowTransitionRulesDetails) o;
    return Objects.equals(this.workflowId, workflowTransitionRulesDetails.workflowId) &&
        Objects.equals(this.workflowRuleIds, workflowTransitionRulesDetails.workflowRuleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, workflowRuleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesDetails {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowRuleIds: ").append(toIndentedString(workflowRuleIds)).append("\n");
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


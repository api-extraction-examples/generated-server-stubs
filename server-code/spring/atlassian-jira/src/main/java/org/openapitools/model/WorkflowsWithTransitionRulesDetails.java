package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowTransitionRulesDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of workflows and their transition rules to delete.
 */

@Schema(name = "WorkflowsWithTransitionRulesDetails", description = "Details of workflows and their transition rules to delete.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowsWithTransitionRulesDetails {

  @Valid
  private List<@Valid WorkflowTransitionRulesDetails> workflows = new ArrayList<>();

  public WorkflowsWithTransitionRulesDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowsWithTransitionRulesDetails(List<@Valid WorkflowTransitionRulesDetails> workflows) {
    this.workflows = workflows;
  }

  public WorkflowsWithTransitionRulesDetails workflows(List<@Valid WorkflowTransitionRulesDetails> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowsWithTransitionRulesDetails addWorkflowsItem(WorkflowTransitionRulesDetails workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

  /**
   * The list of workflows with transition rules to delete.
   * @return workflows
  */
  @NotNull @Valid 
  @Schema(name = "workflows", description = "The list of workflows with transition rules to delete.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workflows")
  public List<@Valid WorkflowTransitionRulesDetails> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<@Valid WorkflowTransitionRulesDetails> workflows) {
    this.workflows = workflows;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowsWithTransitionRulesDetails workflowsWithTransitionRulesDetails = (WorkflowsWithTransitionRulesDetails) o;
    return Objects.equals(this.workflows, workflowsWithTransitionRulesDetails.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowsWithTransitionRulesDetails {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
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
 * Details of any errors encountered while updating workflow transition rules for a workflow.
 */

@Schema(name = "WorkflowTransitionRulesUpdateErrorDetails", description = "Details of any errors encountered while updating workflow transition rules for a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowTransitionRulesUpdateErrorDetails {

  @Valid
  private Map<String, Set<String>> ruleUpdateErrors = new HashMap<>();

  @Valid
  private Set<String> updateErrors = new LinkedHashSet<>();

  private WorkflowId workflowId;

  public WorkflowTransitionRulesUpdateErrorDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowTransitionRulesUpdateErrorDetails(Map<String, Set<String>> ruleUpdateErrors, Set<String> updateErrors, WorkflowId workflowId) {
    this.ruleUpdateErrors = ruleUpdateErrors;
    this.updateErrors = updateErrors;
    this.workflowId = workflowId;
  }

  public WorkflowTransitionRulesUpdateErrorDetails ruleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    this.ruleUpdateErrors = ruleUpdateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails putRuleUpdateErrorsItem(String key, Set<String> ruleUpdateErrorsItem) {
    if (this.ruleUpdateErrors == null) {
      this.ruleUpdateErrors = new HashMap<>();
    }
    this.ruleUpdateErrors.put(key, ruleUpdateErrorsItem);
    return this;
  }

  /**
   * A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.
   * @return ruleUpdateErrors
  */
  @NotNull @Valid 
  @Schema(name = "ruleUpdateErrors", description = "A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ruleUpdateErrors")
  public Map<String, Set<String>> getRuleUpdateErrors() {
    return ruleUpdateErrors;
  }

  public void setRuleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    this.ruleUpdateErrors = ruleUpdateErrors;
  }

  public WorkflowTransitionRulesUpdateErrorDetails updateErrors(Set<String> updateErrors) {
    this.updateErrors = updateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails addUpdateErrorsItem(String updateErrorsItem) {
    if (this.updateErrors == null) {
      this.updateErrors = new LinkedHashSet<>();
    }
    this.updateErrors.add(updateErrorsItem);
    return this;
  }

  /**
   * The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
   * @return updateErrors
  */
  @NotNull 
  @Schema(name = "updateErrors", description = "The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateErrors")
  public Set<String> getUpdateErrors() {
    return updateErrors;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setUpdateErrors(Set<String> updateErrors) {
    this.updateErrors = updateErrors;
  }

  public WorkflowTransitionRulesUpdateErrorDetails workflowId(WorkflowId workflowId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdateErrorDetails workflowTransitionRulesUpdateErrorDetails = (WorkflowTransitionRulesUpdateErrorDetails) o;
    return Objects.equals(this.ruleUpdateErrors, workflowTransitionRulesUpdateErrorDetails.ruleUpdateErrors) &&
        Objects.equals(this.updateErrors, workflowTransitionRulesUpdateErrorDetails.updateErrors) &&
        Objects.equals(this.workflowId, workflowTransitionRulesUpdateErrorDetails.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleUpdateErrors, updateErrors, workflowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdateErrorDetails {\n");
    sb.append("    ruleUpdateErrors: ").append(toIndentedString(ruleUpdateErrors)).append("\n");
    sb.append("    updateErrors: ").append(toIndentedString(updateErrors)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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


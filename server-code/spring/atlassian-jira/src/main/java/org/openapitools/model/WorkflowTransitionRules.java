package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppWorkflowTransitionRule;
import org.openapitools.model.WorkflowId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow with transition rules.
 */

@Schema(name = "WorkflowTransitionRules", description = "A workflow with transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowTransitionRules {

  @Valid
  private List<@Valid AppWorkflowTransitionRule> conditions;

  @Valid
  private List<@Valid AppWorkflowTransitionRule> postFunctions;

  @Valid
  private List<@Valid AppWorkflowTransitionRule> validators;

  private WorkflowId workflowId;

  public WorkflowTransitionRules() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowTransitionRules(WorkflowId workflowId) {
    this.workflowId = workflowId;
  }

  public WorkflowTransitionRules conditions(List<@Valid AppWorkflowTransitionRule> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkflowTransitionRules addConditionsItem(AppWorkflowTransitionRule conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The list of conditions within the workflow.
   * @return conditions
  */
  @Valid 
  @Schema(name = "conditions", description = "The list of conditions within the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditions")
  public List<@Valid AppWorkflowTransitionRule> getConditions() {
    return conditions;
  }

  public void setConditions(List<@Valid AppWorkflowTransitionRule> conditions) {
    this.conditions = conditions;
  }

  public WorkflowTransitionRules postFunctions(List<@Valid AppWorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowTransitionRules addPostFunctionsItem(AppWorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

  /**
   * The list of post functions within the workflow.
   * @return postFunctions
  */
  @Valid 
  @Schema(name = "postFunctions", description = "The list of post functions within the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postFunctions")
  public List<@Valid AppWorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<@Valid AppWorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }

  public WorkflowTransitionRules validators(List<@Valid AppWorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public WorkflowTransitionRules addValidatorsItem(AppWorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * The list of validators within the workflow.
   * @return validators
  */
  @Valid 
  @Schema(name = "validators", description = "The list of validators within the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validators")
  public List<@Valid AppWorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<@Valid AppWorkflowTransitionRule> validators) {
    this.validators = validators;
  }

  public WorkflowTransitionRules workflowId(WorkflowId workflowId) {
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
    WorkflowTransitionRules workflowTransitionRules = (WorkflowTransitionRules) o;
    return Objects.equals(this.conditions, workflowTransitionRules.conditions) &&
        Objects.equals(this.postFunctions, workflowTransitionRules.postFunctions) &&
        Objects.equals(this.validators, workflowTransitionRules.validators) &&
        Objects.equals(this.workflowId, workflowTransitionRules.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, postFunctions, validators, workflowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRules {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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


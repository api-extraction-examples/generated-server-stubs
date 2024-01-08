package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowCondition;
import org.openapitools.model.WorkflowTransitionRule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A collection of transition rules.
 */

@Schema(name = "WorkflowRules", description = "A collection of transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowRules {

  private WorkflowCondition conditionsTree;

  @Valid
  private List<@Valid WorkflowTransitionRule> postFunctions;

  @Valid
  private List<@Valid WorkflowTransitionRule> validators;

  public WorkflowRules conditionsTree(WorkflowCondition conditionsTree) {
    this.conditionsTree = conditionsTree;
    return this;
  }

  /**
   * Get conditionsTree
   * @return conditionsTree
  */
  @Valid 
  @Schema(name = "conditionsTree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditionsTree")
  public WorkflowCondition getConditionsTree() {
    return conditionsTree;
  }

  public void setConditionsTree(WorkflowCondition conditionsTree) {
    this.conditionsTree = conditionsTree;
  }

  public WorkflowRules postFunctions(List<@Valid WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

  /**
   * The workflow post functions.
   * @return postFunctions
  */
  @Valid 
  @Schema(name = "postFunctions", description = "The workflow post functions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postFunctions")
  public List<@Valid WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<@Valid WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }

  public WorkflowRules validators(List<@Valid WorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * The workflow validators.
   * @return validators
  */
  @Valid 
  @Schema(name = "validators", description = "The workflow validators.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validators")
  public List<@Valid WorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<@Valid WorkflowTransitionRule> validators) {
    this.validators = validators;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditionsTree, workflowRules.conditionsTree) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions) &&
        Objects.equals(this.validators, workflowRules.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionsTree, postFunctions, validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    sb.append("    conditionsTree: ").append(toIndentedString(conditionsTree)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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


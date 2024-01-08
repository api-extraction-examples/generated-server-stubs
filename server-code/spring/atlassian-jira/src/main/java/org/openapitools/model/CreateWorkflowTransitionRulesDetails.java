package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateWorkflowCondition;
import org.openapitools.model.CreateWorkflowTransitionRule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of a workflow transition rules.
 */

@Schema(name = "CreateWorkflowTransitionRulesDetails", description = "The details of a workflow transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowTransitionRulesDetails {

  private CreateWorkflowCondition conditions;

  @Valid
  private List<@Valid CreateWorkflowTransitionRule> postFunctions;

  @Valid
  private List<@Valid CreateWorkflowTransitionRule> validators;

  public CreateWorkflowTransitionRulesDetails conditions(CreateWorkflowCondition conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Get conditions
   * @return conditions
  */
  @Valid 
  @Schema(name = "conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditions")
  public CreateWorkflowCondition getConditions() {
    return conditions;
  }

  public void setConditions(CreateWorkflowCondition conditions) {
    this.conditions = conditions;
  }

  public CreateWorkflowTransitionRulesDetails postFunctions(List<@Valid CreateWorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public CreateWorkflowTransitionRulesDetails addPostFunctionsItem(CreateWorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

  /**
   * The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \"postFunctions\": [         {             \"type\": \"IssueCreateFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"1\",                     \"name\": \"issue_created\"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \"postFunctions\": [         {             \"type\": \"UpdateIssueStatusFunction\"         },         {             \"type\": \"CreateCommentFunction\"         },         {             \"type\": \"GenerateChangeHistoryFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"13\",                     \"name\": \"issue_generic\"                 }             }         }     ]
   * @return postFunctions
  */
  @Valid 
  @Schema(name = "postFunctions", description = "The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \"postFunctions\": [         {             \"type\": \"IssueCreateFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"1\",                     \"name\": \"issue_created\"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \"postFunctions\": [         {             \"type\": \"UpdateIssueStatusFunction\"         },         {             \"type\": \"CreateCommentFunction\"         },         {             \"type\": \"GenerateChangeHistoryFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"13\",                     \"name\": \"issue_generic\"                 }             }         }     ]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postFunctions")
  public List<@Valid CreateWorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<@Valid CreateWorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }

  public CreateWorkflowTransitionRulesDetails validators(List<@Valid CreateWorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public CreateWorkflowTransitionRulesDetails addValidatorsItem(CreateWorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \"validators\": [         {             \"type\": \"PermissionValidator\",             \"configuration\": {                 \"permissionKey\": \"CREATE_ISSUES\"             }         }     ]
   * @return validators
  */
  @Valid 
  @Schema(name = "validators", description = "The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \"validators\": [         {             \"type\": \"PermissionValidator\",             \"configuration\": {                 \"permissionKey\": \"CREATE_ISSUES\"             }         }     ]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validators")
  public List<@Valid CreateWorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<@Valid CreateWorkflowTransitionRule> validators) {
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
    CreateWorkflowTransitionRulesDetails createWorkflowTransitionRulesDetails = (CreateWorkflowTransitionRulesDetails) o;
    return Objects.equals(this.conditions, createWorkflowTransitionRulesDetails.conditions) &&
        Objects.equals(this.postFunctions, createWorkflowTransitionRulesDetails.postFunctions) &&
        Objects.equals(this.validators, createWorkflowTransitionRulesDetails.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, postFunctions, validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionRulesDetails {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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


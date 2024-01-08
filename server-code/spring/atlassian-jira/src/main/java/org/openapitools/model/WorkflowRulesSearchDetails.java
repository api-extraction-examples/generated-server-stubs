package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.WorkflowTransitionRules;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of workflow transition rules.
 */

@Schema(name = "WorkflowRulesSearchDetails", description = "Details of workflow transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowRulesSearchDetails {

  @Valid
  private List<UUID> invalidRules;

  @Valid
  private List<@Valid WorkflowTransitionRules> validRules;

  private UUID workflowEntityId;

  public WorkflowRulesSearchDetails invalidRules(List<UUID> invalidRules) {
    this.invalidRules = invalidRules;
    return this;
  }

  public WorkflowRulesSearchDetails addInvalidRulesItem(UUID invalidRulesItem) {
    if (this.invalidRules == null) {
      this.invalidRules = new ArrayList<>();
    }
    this.invalidRules.add(invalidRulesItem);
    return this;
  }

  /**
   * List of workflow rule IDs that do not belong to the workflow or can not be found.
   * @return invalidRules
  */
  @Valid 
  @Schema(name = "invalidRules", description = "List of workflow rule IDs that do not belong to the workflow or can not be found.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invalidRules")
  public List<UUID> getInvalidRules() {
    return invalidRules;
  }

  public void setInvalidRules(List<UUID> invalidRules) {
    this.invalidRules = invalidRules;
  }

  public WorkflowRulesSearchDetails validRules(List<@Valid WorkflowTransitionRules> validRules) {
    this.validRules = validRules;
    return this;
  }

  public WorkflowRulesSearchDetails addValidRulesItem(WorkflowTransitionRules validRulesItem) {
    if (this.validRules == null) {
      this.validRules = new ArrayList<>();
    }
    this.validRules.add(validRulesItem);
    return this;
  }

  /**
   * List of valid workflow transition rules.
   * @return validRules
  */
  @Valid 
  @Schema(name = "validRules", description = "List of valid workflow transition rules.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validRules")
  public List<@Valid WorkflowTransitionRules> getValidRules() {
    return validRules;
  }

  public void setValidRules(List<@Valid WorkflowTransitionRules> validRules) {
    this.validRules = validRules;
  }

  public WorkflowRulesSearchDetails workflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
    return this;
  }

  /**
   * The workflow ID.
   * @return workflowEntityId
  */
  @Valid 
  @Schema(name = "workflowEntityId", example = "a498d711-685d-428d-8c3e-bc03bb450ea7", description = "The workflow ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowEntityId")
  public UUID getWorkflowEntityId() {
    return workflowEntityId;
  }

  public void setWorkflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRulesSearchDetails workflowRulesSearchDetails = (WorkflowRulesSearchDetails) o;
    return Objects.equals(this.invalidRules, workflowRulesSearchDetails.invalidRules) &&
        Objects.equals(this.validRules, workflowRulesSearchDetails.validRules) &&
        Objects.equals(this.workflowEntityId, workflowRulesSearchDetails.workflowEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidRules, validRules, workflowEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRulesSearchDetails {\n");
    sb.append("    invalidRules: ").append(toIndentedString(invalidRules)).append("\n");
    sb.append("    validRules: ").append(toIndentedString(validRules)).append("\n");
    sb.append("    workflowEntityId: ").append(toIndentedString(workflowEntityId)).append("\n");
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


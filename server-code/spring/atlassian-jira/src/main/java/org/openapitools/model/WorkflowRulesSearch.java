package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the workflow and its transition rules.
 */

@Schema(name = "WorkflowRulesSearch", description = "Details of the workflow and its transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowRulesSearch {

  private String expand;

  @Valid
  private List<UUID> ruleIds = new ArrayList<>();

  private UUID workflowEntityId;

  public WorkflowRulesSearch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowRulesSearch(List<UUID> ruleIds, UUID workflowEntityId) {
    this.ruleIds = ruleIds;
    this.workflowEntityId = workflowEntityId;
  }

  public WorkflowRulesSearch expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.
   * @return expand
  */
  
  @Schema(name = "expand", example = "transition", description = "Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public WorkflowRulesSearch ruleIds(List<UUID> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public WorkflowRulesSearch addRuleIdsItem(UUID ruleIdsItem) {
    if (this.ruleIds == null) {
      this.ruleIds = new ArrayList<>();
    }
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * The list of workflow rule IDs.
   * @return ruleIds
  */
  @NotNull @Valid @Size(min = 1, max = 10) 
  @Schema(name = "ruleIds", description = "The list of workflow rule IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ruleIds")
  public List<UUID> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<UUID> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public WorkflowRulesSearch workflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
    return this;
  }

  /**
   * The workflow ID.
   * @return workflowEntityId
  */
  @NotNull @Valid 
  @Schema(name = "workflowEntityId", example = "a498d711-685d-428d-8c3e-bc03bb450ea7", description = "The workflow ID.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WorkflowRulesSearch workflowRulesSearch = (WorkflowRulesSearch) o;
    return Objects.equals(this.expand, workflowRulesSearch.expand) &&
        Objects.equals(this.ruleIds, workflowRulesSearch.ruleIds) &&
        Objects.equals(this.workflowEntityId, workflowRulesSearch.workflowEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, ruleIds, workflowEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRulesSearch {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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


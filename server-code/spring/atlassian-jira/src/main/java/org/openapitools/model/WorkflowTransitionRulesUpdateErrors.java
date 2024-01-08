package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowTransitionRulesUpdateErrorDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of any errors encountered while updating workflow transition rules.
 */

@Schema(name = "WorkflowTransitionRulesUpdateErrors", description = "Details of any errors encountered while updating workflow transition rules.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowTransitionRulesUpdateErrors {

  @Valid
  private List<@Valid WorkflowTransitionRulesUpdateErrorDetails> updateResults = new ArrayList<>();

  public WorkflowTransitionRulesUpdateErrors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowTransitionRulesUpdateErrors(List<@Valid WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
    this.updateResults = updateResults;
  }

  public WorkflowTransitionRulesUpdateErrors updateResults(List<@Valid WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
    this.updateResults = updateResults;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrors addUpdateResultsItem(WorkflowTransitionRulesUpdateErrorDetails updateResultsItem) {
    if (this.updateResults == null) {
      this.updateResults = new ArrayList<>();
    }
    this.updateResults.add(updateResultsItem);
    return this;
  }

  /**
   * A list of workflows.
   * @return updateResults
  */
  @NotNull @Valid 
  @Schema(name = "updateResults", description = "A list of workflows.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updateResults")
  public List<@Valid WorkflowTransitionRulesUpdateErrorDetails> getUpdateResults() {
    return updateResults;
  }

  public void setUpdateResults(List<@Valid WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
    this.updateResults = updateResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdateErrors workflowTransitionRulesUpdateErrors = (WorkflowTransitionRulesUpdateErrors) o;
    return Objects.equals(this.updateResults, workflowTransitionRulesUpdateErrors.updateResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdateErrors {\n");
    sb.append("    updateResults: ").append(toIndentedString(updateResults)).append("\n");
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


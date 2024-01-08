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
 * Details about the default workflow.
 */

@Schema(name = "DefaultWorkflow", description = "Details about the default workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DefaultWorkflow {

  private Boolean updateDraftIfNeeded;

  private String workflow;

  public DefaultWorkflow() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DefaultWorkflow(String workflow) {
    this.workflow = workflow;
  }

  public DefaultWorkflow updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

  /**
   * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.
   * @return updateDraftIfNeeded
  */
  
  @Schema(name = "updateDraftIfNeeded", description = "Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDraftIfNeeded")
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }

  public DefaultWorkflow workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * The name of the workflow to set as the default workflow.
   * @return workflow
  */
  @NotNull 
  @Schema(name = "workflow", description = "The name of the workflow to set as the default workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    DefaultWorkflow defaultWorkflow = (DefaultWorkflow) o;
    return Objects.equals(this.updateDraftIfNeeded, defaultWorkflow.updateDraftIfNeeded) &&
        Objects.equals(this.workflow, defaultWorkflow.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateDraftIfNeeded, workflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultWorkflow {\n");
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


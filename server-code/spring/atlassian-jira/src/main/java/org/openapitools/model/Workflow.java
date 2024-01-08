package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectDetails;
import org.openapitools.model.PublishedWorkflowId;
import org.openapitools.model.Transition;
import org.openapitools.model.WorkflowOperations;
import org.openapitools.model.WorkflowSchemeIdName;
import org.openapitools.model.WorkflowStatus;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a workflow.
 */

@Schema(name = "Workflow", description = "Details about a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Workflow {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String description;

  private Boolean hasDraftWorkflow;

  private PublishedWorkflowId id;

  private Boolean isDefault;

  private WorkflowOperations operations;

  @Valid
  private List<@Valid ProjectDetails> projects;

  @Valid
  private List<@Valid WorkflowSchemeIdName> schemes;

  @Valid
  private List<@Valid WorkflowStatus> statuses;

  @Valid
  private List<@Valid Transition> transitions;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  public Workflow() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Workflow(String description, PublishedWorkflowId id) {
    this.description = description;
    this.id = id;
  }

  public Workflow created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The creation date of the workflow.
   * @return created
  */
  @Valid 
  @Schema(name = "created", description = "The creation date of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Workflow description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description of the workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Workflow hasDraftWorkflow(Boolean hasDraftWorkflow) {
    this.hasDraftWorkflow = hasDraftWorkflow;
    return this;
  }

  /**
   * Whether the workflow has a draft version.
   * @return hasDraftWorkflow
  */
  
  @Schema(name = "hasDraftWorkflow", description = "Whether the workflow has a draft version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasDraftWorkflow")
  public Boolean getHasDraftWorkflow() {
    return hasDraftWorkflow;
  }

  public void setHasDraftWorkflow(Boolean hasDraftWorkflow) {
    this.hasDraftWorkflow = hasDraftWorkflow;
  }

  public Workflow id(PublishedWorkflowId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public PublishedWorkflowId getId() {
    return id;
  }

  public void setId(PublishedWorkflowId id) {
    this.id = id;
  }

  public Workflow isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is the default workflow.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "Whether this is the default workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Workflow operations(WorkflowOperations operations) {
    this.operations = operations;
    return this;
  }

  /**
   * Get operations
   * @return operations
  */
  @Valid 
  @Schema(name = "operations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operations")
  public WorkflowOperations getOperations() {
    return operations;
  }

  public void setOperations(WorkflowOperations operations) {
    this.operations = operations;
  }

  public Workflow projects(List<@Valid ProjectDetails> projects) {
    this.projects = projects;
    return this;
  }

  public Workflow addProjectsItem(ProjectDetails projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * The projects the workflow is assigned to, through workflow schemes.
   * @return projects
  */
  @Valid 
  @Schema(name = "projects", description = "The projects the workflow is assigned to, through workflow schemes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid ProjectDetails> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid ProjectDetails> projects) {
    this.projects = projects;
  }

  public Workflow schemes(List<@Valid WorkflowSchemeIdName> schemes) {
    this.schemes = schemes;
    return this;
  }

  public Workflow addSchemesItem(WorkflowSchemeIdName schemesItem) {
    if (this.schemes == null) {
      this.schemes = new ArrayList<>();
    }
    this.schemes.add(schemesItem);
    return this;
  }

  /**
   * The workflow schemes the workflow is assigned to.
   * @return schemes
  */
  @Valid 
  @Schema(name = "schemes", description = "The workflow schemes the workflow is assigned to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schemes")
  public List<@Valid WorkflowSchemeIdName> getSchemes() {
    return schemes;
  }

  public void setSchemes(List<@Valid WorkflowSchemeIdName> schemes) {
    this.schemes = schemes;
  }

  public Workflow statuses(List<@Valid WorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Workflow addStatusesItem(WorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * The statuses of the workflow.
   * @return statuses
  */
  @Valid 
  @Schema(name = "statuses", description = "The statuses of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid WorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid WorkflowStatus> statuses) {
    this.statuses = statuses;
  }

  public Workflow transitions(List<@Valid Transition> transitions) {
    this.transitions = transitions;
    return this;
  }

  public Workflow addTransitionsItem(Transition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

  /**
   * The transitions of the workflow.
   * @return transitions
  */
  @Valid 
  @Schema(name = "transitions", description = "The transitions of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transitions")
  public List<@Valid Transition> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<@Valid Transition> transitions) {
    this.transitions = transitions;
  }

  public Workflow updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The last edited date of the workflow.
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", description = "The last edited date of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.created, workflow.created) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.hasDraftWorkflow, workflow.hasDraftWorkflow) &&
        Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.isDefault, workflow.isDefault) &&
        Objects.equals(this.operations, workflow.operations) &&
        Objects.equals(this.projects, workflow.projects) &&
        Objects.equals(this.schemes, workflow.schemes) &&
        Objects.equals(this.statuses, workflow.statuses) &&
        Objects.equals(this.transitions, workflow.transitions) &&
        Objects.equals(this.updated, workflow.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, hasDraftWorkflow, id, isDefault, operations, projects, schemes, statuses, transitions, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasDraftWorkflow: ").append(toIndentedString(hasDraftWorkflow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    schemes: ").append(toIndentedString(schemes)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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


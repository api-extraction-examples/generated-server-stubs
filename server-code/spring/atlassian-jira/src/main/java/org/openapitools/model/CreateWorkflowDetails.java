package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.CreateWorkflowStatusDetails;
import org.openapitools.model.CreateWorkflowTransitionDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of a workflow.
 */

@Schema(name = "CreateWorkflowDetails", description = "The details of a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowDetails {

  private String description;

  private String name;

  @Valid
  private Set<@Valid CreateWorkflowStatusDetails> statuses = new LinkedHashSet<>();

  @Valid
  private List<@Valid CreateWorkflowTransitionDetails> transitions = new ArrayList<>();

  public CreateWorkflowDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowDetails(String name, Set<@Valid CreateWorkflowStatusDetails> statuses, List<@Valid CreateWorkflowTransitionDetails> transitions) {
    this.name = name;
    this.statuses = statuses;
    this.transitions = transitions;
  }

  public CreateWorkflowDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow. The maximum length is 1000 characters.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the workflow. The maximum length is 1000 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateWorkflowDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow. The name must be unique. The maximum length is 255 characters. Characters can be separated by a whitespace but the name cannot start or end with a whitespace.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the workflow. The name must be unique. The maximum length is 255 characters. Characters can be separated by a whitespace but the name cannot start or end with a whitespace.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateWorkflowDetails statuses(Set<@Valid CreateWorkflowStatusDetails> statuses) {
    this.statuses = statuses;
    return this;
  }

  public CreateWorkflowDetails addStatusesItem(CreateWorkflowStatusDetails statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * The statuses of the workflow. Any status that does not include a transition is added to the workflow without a transition.
   * @return statuses
  */
  @NotNull @Valid 
  @Schema(name = "statuses", description = "The statuses of the workflow. Any status that does not include a transition is added to the workflow without a transition.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statuses")
  public Set<@Valid CreateWorkflowStatusDetails> getStatuses() {
    return statuses;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setStatuses(Set<@Valid CreateWorkflowStatusDetails> statuses) {
    this.statuses = statuses;
  }

  public CreateWorkflowDetails transitions(List<@Valid CreateWorkflowTransitionDetails> transitions) {
    this.transitions = transitions;
    return this;
  }

  public CreateWorkflowDetails addTransitionsItem(CreateWorkflowTransitionDetails transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

  /**
   * The transitions of the workflow. For the request to be valid, these transitions must:   *  include one *initial* transition.  *  not use the same name for a *global* and *directed* transition.  *  have a unique name for each *global* transition.  *  have a unique 'to' status for each *global* transition.  *  have unique names for each transition from a status.  *  not have a 'from' status on *initial* and *global* transitions.  *  have a 'from' status on *directed* transitions.  All the transition statuses must be included in `statuses`.
   * @return transitions
  */
  @NotNull @Valid 
  @Schema(name = "transitions", description = "The transitions of the workflow. For the request to be valid, these transitions must:   *  include one *initial* transition.  *  not use the same name for a *global* and *directed* transition.  *  have a unique name for each *global* transition.  *  have a unique 'to' status for each *global* transition.  *  have unique names for each transition from a status.  *  not have a 'from' status on *initial* and *global* transitions.  *  have a 'from' status on *directed* transitions.  All the transition statuses must be included in `statuses`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transitions")
  public List<@Valid CreateWorkflowTransitionDetails> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<@Valid CreateWorkflowTransitionDetails> transitions) {
    this.transitions = transitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowDetails createWorkflowDetails = (CreateWorkflowDetails) o;
    return Objects.equals(this.description, createWorkflowDetails.description) &&
        Objects.equals(this.name, createWorkflowDetails.name) &&
        Objects.equals(this.statuses, createWorkflowDetails.statuses) &&
        Objects.equals(this.transitions, createWorkflowDetails.transitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, statuses, transitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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


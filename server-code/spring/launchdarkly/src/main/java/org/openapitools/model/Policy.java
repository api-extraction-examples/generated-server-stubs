package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Policy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Policy {

  @Valid
  private List<String> actions;

  private String effect;

  @Valid
  private List<String> notActions;

  @Valid
  private List<String> notResources;

  @Valid
  private List<String> resources;

  public Policy actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Policy addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
  */
  
  @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actions")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public Policy effect(String effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Effect of the policy - allow or deny.
   * @return effect
  */
  
  @Schema(name = "effect", example = "deny", description = "Effect of the policy - allow or deny.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }

  public Policy notActions(List<String> notActions) {
    this.notActions = notActions;
    return this;
  }

  public Policy addNotActionsItem(String notActionsItem) {
    if (this.notActions == null) {
      this.notActions = new ArrayList<>();
    }
    this.notActions.add(notActionsItem);
    return this;
  }

  /**
   * Targeted actions will be those actions NOT in this list. The \"actions\" field must be empty to use this field.
   * @return notActions
  */
  
  @Schema(name = "notActions", description = "Targeted actions will be those actions NOT in this list. The \"actions\" field must be empty to use this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notActions")
  public List<String> getNotActions() {
    return notActions;
  }

  public void setNotActions(List<String> notActions) {
    this.notActions = notActions;
  }

  public Policy notResources(List<String> notResources) {
    this.notResources = notResources;
    return this;
  }

  public Policy addNotResourcesItem(String notResourcesItem) {
    if (this.notResources == null) {
      this.notResources = new ArrayList<>();
    }
    this.notResources.add(notResourcesItem);
    return this;
  }

  /**
   * Targeted resource will be those resources NOT in this list. The \"resources`\" field must be empty to use this field.
   * @return notResources
  */
  
  @Schema(name = "notResources", description = "Targeted resource will be those resources NOT in this list. The \"resources`\" field must be empty to use this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notResources")
  public List<String> getNotResources() {
    return notResources;
  }

  public void setNotResources(List<String> notResources) {
    this.notResources = notResources;
  }

  public Policy resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public Policy addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  
  @Schema(name = "resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resources")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.actions, policy.actions) &&
        Objects.equals(this.effect, policy.effect) &&
        Objects.equals(this.notActions, policy.notActions) &&
        Objects.equals(this.notResources, policy.notResources) &&
        Objects.equals(this.resources, policy.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, effect, notActions, notResources, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    notActions: ").append(toIndentedString(notActions)).append("\n");
    sb.append("    notResources: ").append(toIndentedString(notResources)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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


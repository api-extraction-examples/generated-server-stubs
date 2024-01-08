package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Statement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Statement {

  @Valid
  private List<String> actions;

  /**
   * Gets or Sets effect
   */
  public enum EffectEnum {
    ALLOW("allow"),
    
    DENY("deny");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EffectEnum fromValue(String value) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EffectEnum effect;

  @Valid
  private List<String> notActions;

  @Valid
  private List<String> notResources;

  @Valid
  private List<String> resources;

  public Statement actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Statement addActionsItem(String actionsItem) {
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

  public Statement effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }

  /**
   * Get effect
   * @return effect
  */
  
  @Schema(name = "effect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effect")
  public EffectEnum getEffect() {
    return effect;
  }

  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }

  public Statement notActions(List<String> notActions) {
    this.notActions = notActions;
    return this;
  }

  public Statement addNotActionsItem(String notActionsItem) {
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

  public Statement notResources(List<String> notResources) {
    this.notResources = notResources;
    return this;
  }

  public Statement addNotResourcesItem(String notResourcesItem) {
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

  public Statement resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public Statement addResourcesItem(String resourcesItem) {
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
    Statement statement = (Statement) o;
    return Objects.equals(this.actions, statement.actions) &&
        Objects.equals(this.effect, statement.effect) &&
        Objects.equals(this.notActions, statement.notActions) &&
        Objects.equals(this.notResources, statement.notResources) &&
        Objects.equals(this.resources, statement.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, effect, notActions, notResources, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
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


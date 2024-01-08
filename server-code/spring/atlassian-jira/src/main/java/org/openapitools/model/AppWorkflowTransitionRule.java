package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.RuleConfiguration;
import org.openapitools.model.WorkflowTransition;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow transition rule.
 */

@Schema(name = "AppWorkflowTransitionRule", description = "A workflow transition rule.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AppWorkflowTransitionRule {

  private RuleConfiguration _configuration;

  private String id;

  private String key;

  private WorkflowTransition transition;

  public AppWorkflowTransitionRule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppWorkflowTransitionRule(RuleConfiguration _configuration, String id, String key) {
    this._configuration = _configuration;
    this.id = id;
    this.key = key;
  }

  public AppWorkflowTransitionRule _configuration(RuleConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  */
  @NotNull @Valid 
  @Schema(name = "configuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configuration")
  public RuleConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(RuleConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public AppWorkflowTransitionRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the transition rule.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the transition rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppWorkflowTransitionRule key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the rule, as defined in the Connect or the Forge app descriptor.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the rule, as defined in the Connect or the Forge app descriptor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AppWorkflowTransitionRule transition(WorkflowTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Get transition
   * @return transition
  */
  @Valid 
  @Schema(name = "transition", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transition")
  public WorkflowTransition getTransition() {
    return transition;
  }

  public void setTransition(WorkflowTransition transition) {
    this.transition = transition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppWorkflowTransitionRule appWorkflowTransitionRule = (AppWorkflowTransitionRule) o;
    return Objects.equals(this._configuration, appWorkflowTransitionRule._configuration) &&
        Objects.equals(this.id, appWorkflowTransitionRule.id) &&
        Objects.equals(this.key, appWorkflowTransitionRule.key) &&
        Objects.equals(this.transition, appWorkflowTransitionRule.transition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, id, key, transition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppWorkflowTransitionRule {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
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


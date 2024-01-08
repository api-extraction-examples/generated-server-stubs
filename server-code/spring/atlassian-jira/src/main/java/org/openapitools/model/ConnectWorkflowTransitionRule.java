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

@Schema(name = "ConnectWorkflowTransitionRule", description = "A workflow transition rule.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ConnectWorkflowTransitionRule {

  private RuleConfiguration _configuration;

  private String id;

  private String key;

  private WorkflowTransition transition;

  public ConnectWorkflowTransitionRule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConnectWorkflowTransitionRule(RuleConfiguration _configuration, String id, String key) {
    this._configuration = _configuration;
    this.id = id;
    this.key = key;
  }

  public ConnectWorkflowTransitionRule _configuration(RuleConfiguration _configuration) {
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

  public ConnectWorkflowTransitionRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the transition rule.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "123", description = "The ID of the transition rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectWorkflowTransitionRule key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the rule, as defined in the Connect app descriptor.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "WorkflowKey", description = "The key of the rule, as defined in the Connect app descriptor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ConnectWorkflowTransitionRule transition(WorkflowTransition transition) {
    this.transition = transition;
    return this;
  }

  /**
   * Get transition
   * @return transition
  */
  @Valid 
  @Schema(name = "transition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ConnectWorkflowTransitionRule connectWorkflowTransitionRule = (ConnectWorkflowTransitionRule) o;
    return Objects.equals(this._configuration, connectWorkflowTransitionRule._configuration) &&
        Objects.equals(this.id, connectWorkflowTransitionRule.id) &&
        Objects.equals(this.key, connectWorkflowTransitionRule.key) &&
        Objects.equals(this.transition, connectWorkflowTransitionRule.transition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, id, key, transition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectWorkflowTransitionRule {\n");
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


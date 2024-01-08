package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
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

@Schema(name = "CreateWorkflowTransitionRule", description = "A workflow transition rule.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowTransitionRule {

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  private String type;

  public CreateWorkflowTransitionRule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowTransitionRule(String type) {
    this.type = type;
  }

  public CreateWorkflowTransitionRule _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowTransitionRule putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "EXPERIMENTAL. The configuration of the transition rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  public CreateWorkflowTransitionRule type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition rule.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the transition rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowTransitionRule createWorkflowTransitionRule = (CreateWorkflowTransitionRule) o;
    return Objects.equals(this._configuration, createWorkflowTransitionRule._configuration) &&
        Objects.equals(this.type, createWorkflowTransitionRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionRule {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow transition condition.
 */

@Schema(name = "CreateWorkflowCondition", description = "A workflow transition condition.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowCondition {

  @Valid
  private List<@Valid CreateWorkflowCondition> conditions;

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  /**
   * The compound condition operator.
   */
  public enum OperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperatorEnum operator;

  private String type;

  public CreateWorkflowCondition conditions(List<@Valid CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CreateWorkflowCondition addConditionsItem(CreateWorkflowCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * The list of workflow conditions.
   * @return conditions
  */
  @Valid 
  @Schema(name = "conditions", description = "The list of workflow conditions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conditions")
  public List<@Valid CreateWorkflowCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<@Valid CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
  }

  public CreateWorkflowCondition _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowCondition putConfigurationItem(String key, Object _configurationItem) {
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

  public CreateWorkflowCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The compound condition operator.
   * @return operator
  */
  
  @Schema(name = "operator", description = "The compound condition operator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public CreateWorkflowCondition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition rule.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the transition rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateWorkflowCondition createWorkflowCondition = (CreateWorkflowCondition) o;
    return Objects.equals(this.conditions, createWorkflowCondition.conditions) &&
        Objects.equals(this._configuration, createWorkflowCondition._configuration) &&
        Objects.equals(this.operator, createWorkflowCondition.operator) &&
        Objects.equals(this.type, createWorkflowCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, _configuration, operator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowCondition {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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


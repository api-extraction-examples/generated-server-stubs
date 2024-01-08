package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WorkflowCondition;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A compound workflow transition rule condition. This object returns &#x60;nodeType&#x60; as &#x60;compound&#x60;.
 */

@Schema(name = "WorkflowCompoundCondition", description = "A compound workflow transition rule condition. This object returns `nodeType` as `compound`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowCompoundCondition implements WorkflowCondition {

  @Valid
  private List<@Valid WorkflowCondition> conditions = new ArrayList<>();

  private String nodeType;

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

  public WorkflowCompoundCondition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowCompoundCondition(List<@Valid WorkflowCondition> conditions, String nodeType, OperatorEnum operator) {
    this.conditions = conditions;
    this.nodeType = nodeType;
    this.operator = operator;
  }

  public WorkflowCompoundCondition conditions(List<@Valid WorkflowCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkflowCompoundCondition addConditionsItem(WorkflowCondition conditionsItem) {
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
  @NotNull @Valid 
  @Schema(name = "conditions", description = "The list of workflow conditions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conditions")
  public List<@Valid WorkflowCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<@Valid WorkflowCondition> conditions) {
    this.conditions = conditions;
  }

  public WorkflowCompoundCondition nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  */
  @NotNull 
  @Schema(name = "nodeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeType")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public WorkflowCompoundCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The compound condition operator.
   * @return operator
  */
  @NotNull 
  @Schema(name = "operator", description = "The compound condition operator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCompoundCondition workflowCompoundCondition = (WorkflowCompoundCondition) o;
    return Objects.equals(this.conditions, workflowCompoundCondition.conditions) &&
        Objects.equals(this.nodeType, workflowCompoundCondition.nodeType) &&
        Objects.equals(this.operator, workflowCompoundCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, nodeType, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCompoundCondition {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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


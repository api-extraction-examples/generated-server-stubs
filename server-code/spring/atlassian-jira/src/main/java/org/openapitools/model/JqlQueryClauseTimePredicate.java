package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.JqlQueryClauseOperand;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A time predicate for a temporal JQL clause.
 */

@Schema(name = "JqlQueryClauseTimePredicate", description = "A time predicate for a temporal JQL clause.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryClauseTimePredicate {

  private JqlQueryClauseOperand operand;

  /**
   * The operator between the field and the operand.
   */
  public enum OperatorEnum {
    BEFORE("before"),
    
    AFTER("after"),
    
    FROM("from"),
    
    TO("to"),
    
    TRUE("true"),
    
    DURING("during"),
    
    BY("by");

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

  public JqlQueryClauseTimePredicate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryClauseTimePredicate(JqlQueryClauseOperand operand, OperatorEnum operator) {
    this.operand = operand;
    this.operator = operator;
  }

  public JqlQueryClauseTimePredicate operand(JqlQueryClauseOperand operand) {
    this.operand = operand;
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @NotNull @Valid 
  @Schema(name = "operand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operand")
  public JqlQueryClauseOperand getOperand() {
    return operand;
  }

  public void setOperand(JqlQueryClauseOperand operand) {
    this.operand = operand;
  }

  public JqlQueryClauseTimePredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The operator between the field and the operand.
   * @return operator
  */
  @NotNull 
  @Schema(name = "operator", description = "The operator between the field and the operand.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    JqlQueryClauseTimePredicate jqlQueryClauseTimePredicate = (JqlQueryClauseTimePredicate) o;
    return Objects.equals(this.operand, jqlQueryClauseTimePredicate.operand) &&
        Objects.equals(this.operator, jqlQueryClauseTimePredicate.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operand, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryClauseTimePredicate {\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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


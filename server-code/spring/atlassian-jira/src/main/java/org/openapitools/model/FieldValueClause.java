package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.JqlQueryClauseOperand;
import org.openapitools.model.JqlQueryField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A clause that asserts the current value of a field. For example, &#x60;summary ~ test&#x60;.
 */

@Schema(name = "FieldValueClause", description = "A clause that asserts the current value of a field. For example, `summary ~ test`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldValueClause {

  private JqlQueryField field;

  private JqlQueryClauseOperand operand;

  /**
   * The operator between the field and operand.
   */
  public enum OperatorEnum {
    EQUAL("="),
    
    NOT_EQUAL("!="),
    
    GREATER_THAN(">"),
    
    LESS_THAN("<"),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    IN("in"),
    
    NOT_IN("not in"),
    
    TILDE("~"),
    
    TILDE_EQUAL("~="),
    
    IS("is"),
    
    IS_NOT("is not");

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

  public FieldValueClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldValueClause(JqlQueryField field, JqlQueryClauseOperand operand, OperatorEnum operator) {
    this.field = field;
    this.operand = operand;
    this.operator = operator;
  }

  public FieldValueClause field(JqlQueryField field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @NotNull @Valid 
  @Schema(name = "field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  public FieldValueClause operand(JqlQueryClauseOperand operand) {
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

  public FieldValueClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The operator between the field and operand.
   * @return operator
  */
  @NotNull 
  @Schema(name = "operator", description = "The operator between the field and operand.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    FieldValueClause fieldValueClause = (FieldValueClause) o;
    return Objects.equals(this.field, fieldValueClause.field) &&
        Objects.equals(this.operand, fieldValueClause.operand) &&
        Objects.equals(this.operator, fieldValueClause.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operand, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValueClause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlQueryClauseOperand;
import org.openapitools.model.JqlQueryClauseTimePredicate;
import org.openapitools.model.JqlQueryField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A clause that asserts a previous value of a field. For example, &#x60;status WAS \&quot;Resolved\&quot; BY currentUser() BEFORE \&quot;2019/02/02\&quot;&#x60;. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.
 */

@Schema(name = "FieldWasClause", description = "A clause that asserts a previous value of a field. For example, `status WAS \"Resolved\" BY currentUser() BEFORE \"2019/02/02\"`. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldWasClause {

  private JqlQueryField field;

  private JqlQueryClauseOperand operand;

  /**
   * The operator between the field and operand.
   */
  public enum OperatorEnum {
    WAS("was"),
    
    WAS_IN("was in"),
    
    WAS_NOT_IN("was not in"),
    
    WAS_NOT("was not");

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

  @Valid
  private List<@Valid JqlQueryClauseTimePredicate> predicates = new ArrayList<>();

  public FieldWasClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldWasClause(JqlQueryField field, JqlQueryClauseOperand operand, OperatorEnum operator, List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.field = field;
    this.operand = operand;
    this.operator = operator;
    this.predicates = predicates;
  }

  public FieldWasClause field(JqlQueryField field) {
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

  public FieldWasClause operand(JqlQueryClauseOperand operand) {
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

  public FieldWasClause operator(OperatorEnum operator) {
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

  public FieldWasClause predicates(List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public FieldWasClause addPredicatesItem(JqlQueryClauseTimePredicate predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

  /**
   * The list of time predicates.
   * @return predicates
  */
  @NotNull @Valid 
  @Schema(name = "predicates", description = "The list of time predicates.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("predicates")
  public List<@Valid JqlQueryClauseTimePredicate> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldWasClause fieldWasClause = (FieldWasClause) o;
    return Objects.equals(this.field, fieldWasClause.field) &&
        Objects.equals(this.operand, fieldWasClause.operand) &&
        Objects.equals(this.operator, fieldWasClause.operator) &&
        Objects.equals(this.predicates, fieldWasClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operand, operator, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldWasClause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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


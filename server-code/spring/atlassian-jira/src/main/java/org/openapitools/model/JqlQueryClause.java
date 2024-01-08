package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompoundClause;
import org.openapitools.model.FieldChangedClause;
import org.openapitools.model.FieldValueClause;
import org.openapitools.model.FieldWasClause;
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
 * A JQL query clause.
 */

@Schema(name = "JqlQueryClause", description = "A JQL query clause.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryClause {

  @Valid
  private List<@Valid JqlQueryClause> clauses = new ArrayList<>();

  /**
   * The operator applied to the field.
   */
  public enum OperatorEnum {
    CHANGED("changed");

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

  private JqlQueryField field;

  private JqlQueryClauseOperand operand;

  @Valid
  private List<@Valid JqlQueryClauseTimePredicate> predicates = new ArrayList<>();

  public JqlQueryClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryClause(List<@Valid JqlQueryClause> clauses, OperatorEnum operator, JqlQueryField field, JqlQueryClauseOperand operand, List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.clauses = clauses;
    this.operator = operator;
    this.field = field;
    this.operand = operand;
    this.predicates = predicates;
  }

  public JqlQueryClause clauses(List<@Valid JqlQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public JqlQueryClause addClausesItem(JqlQueryClause clausesItem) {
    if (this.clauses == null) {
      this.clauses = new ArrayList<>();
    }
    this.clauses.add(clausesItem);
    return this;
  }

  /**
   * The list of nested clauses.
   * @return clauses
  */
  @NotNull @Valid 
  @Schema(name = "clauses", description = "The list of nested clauses.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clauses")
  public List<@Valid JqlQueryClause> getClauses() {
    return clauses;
  }

  public void setClauses(List<@Valid JqlQueryClause> clauses) {
    this.clauses = clauses;
  }

  public JqlQueryClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The operator applied to the field.
   * @return operator
  */
  @NotNull 
  @Schema(name = "operator", description = "The operator applied to the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public JqlQueryClause field(JqlQueryField field) {
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

  public JqlQueryClause operand(JqlQueryClauseOperand operand) {
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

  public JqlQueryClause predicates(List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public JqlQueryClause addPredicatesItem(JqlQueryClauseTimePredicate predicatesItem) {
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
    JqlQueryClause jqlQueryClause = (JqlQueryClause) o;
    return Objects.equals(this.clauses, jqlQueryClause.clauses) &&
        Objects.equals(this.operator, jqlQueryClause.operator) &&
        Objects.equals(this.field, jqlQueryClause.field) &&
        Objects.equals(this.operand, jqlQueryClause.operand) &&
        Objects.equals(this.predicates, jqlQueryClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, operator, field, operand, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryClause {\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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


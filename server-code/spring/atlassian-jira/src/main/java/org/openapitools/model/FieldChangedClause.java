package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * A clause that asserts whether a field was changed. For example, &#x60;status CHANGED AFTER startOfMonth(-1M)&#x60;.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.
 */

@Schema(name = "FieldChangedClause", description = "A clause that asserts whether a field was changed. For example, `status CHANGED AFTER startOfMonth(-1M)`.See [CHANGED](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for more information about the CHANGED operator.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldChangedClause {

  private JqlQueryField field;

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

  @Valid
  private List<@Valid JqlQueryClauseTimePredicate> predicates = new ArrayList<>();

  public FieldChangedClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldChangedClause(JqlQueryField field, OperatorEnum operator, List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.field = field;
    this.operator = operator;
    this.predicates = predicates;
  }

  public FieldChangedClause field(JqlQueryField field) {
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

  public FieldChangedClause operator(OperatorEnum operator) {
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

  public FieldChangedClause predicates(List<@Valid JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public FieldChangedClause addPredicatesItem(JqlQueryClauseTimePredicate predicatesItem) {
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
    FieldChangedClause fieldChangedClause = (FieldChangedClause) o;
    return Objects.equals(this.field, fieldChangedClause.field) &&
        Objects.equals(this.operator, fieldChangedClause.operator) &&
        Objects.equals(this.predicates, fieldChangedClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldChangedClause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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


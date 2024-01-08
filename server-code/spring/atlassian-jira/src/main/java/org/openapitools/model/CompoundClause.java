package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlQueryClause;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A JQL query clause that consists of nested clauses. For example, &#x60;(labels in (urgent, blocker) OR lastCommentedBy &#x3D; currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \&quot;A OR B AND C\&quot; is parsed as \&quot;(A OR B) AND C\&quot;. See Setting the precedence of operators for more information about precedence in JQL queries.&#x60;
 */

@Schema(name = "CompoundClause", description = "A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CompoundClause {

  @Valid
  private List<@Valid JqlQueryClause> clauses = new ArrayList<>();

  /**
   * The operator between the clauses.
   */
  public enum OperatorEnum {
    AND("and"),
    
    OR("or"),
    
    NOT("not");

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

  public CompoundClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CompoundClause(List<@Valid JqlQueryClause> clauses, OperatorEnum operator) {
    this.clauses = clauses;
    this.operator = operator;
  }

  public CompoundClause clauses(List<@Valid JqlQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public CompoundClause addClausesItem(JqlQueryClause clausesItem) {
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

  public CompoundClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The operator between the clauses.
   * @return operator
  */
  @NotNull 
  @Schema(name = "operator", description = "The operator between the clauses.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CompoundClause compoundClause = (CompoundClause) o;
    return Objects.equals(this.clauses, compoundClause.clauses) &&
        Objects.equals(this.operator, compoundClause.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundClause {\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
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


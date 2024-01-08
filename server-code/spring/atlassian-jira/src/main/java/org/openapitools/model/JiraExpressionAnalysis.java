package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JiraExpressionComplexity;
import org.openapitools.model.JiraExpressionValidationError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the analysed Jira expression.
 */

@Schema(name = "JiraExpressionAnalysis", description = "Details about the analysed Jira expression.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionAnalysis {

  private JiraExpressionComplexity complexity;

  @Valid
  private List<@Valid JiraExpressionValidationError> errors;

  private String expression;

  private String type;

  private Boolean valid;

  public JiraExpressionAnalysis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionAnalysis(String expression, Boolean valid) {
    this.expression = expression;
    this.valid = valid;
  }

  public JiraExpressionAnalysis complexity(JiraExpressionComplexity complexity) {
    this.complexity = complexity;
    return this;
  }

  /**
   * Get complexity
   * @return complexity
  */
  @Valid 
  @Schema(name = "complexity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complexity")
  public JiraExpressionComplexity getComplexity() {
    return complexity;
  }

  public void setComplexity(JiraExpressionComplexity complexity) {
    this.complexity = complexity;
  }

  public JiraExpressionAnalysis errors(List<@Valid JiraExpressionValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public JiraExpressionAnalysis addErrorsItem(JiraExpressionValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * A list of validation errors. Not included if the expression is valid.
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "A list of validation errors. Not included if the expression is valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid JiraExpressionValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid JiraExpressionValidationError> errors) {
    this.errors = errors;
  }

  public JiraExpressionAnalysis expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The analysed expression.
   * @return expression
  */
  @NotNull 
  @Schema(name = "expression", description = "The analysed expression.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public JiraExpressionAnalysis type(String type) {
    this.type = type;
    return this;
  }

  /**
   * EXPERIMENTAL. The inferred type of the expression.
   * @return type
  */
  
  @Schema(name = "type", description = "EXPERIMENTAL. The inferred type of the expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JiraExpressionAnalysis valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
   * @return valid
  */
  @NotNull 
  @Schema(name = "valid", description = "Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionAnalysis jiraExpressionAnalysis = (JiraExpressionAnalysis) o;
    return Objects.equals(this.complexity, jiraExpressionAnalysis.complexity) &&
        Objects.equals(this.errors, jiraExpressionAnalysis.errors) &&
        Objects.equals(this.expression, jiraExpressionAnalysis.expression) &&
        Objects.equals(this.type, jiraExpressionAnalysis.type) &&
        Objects.equals(this.valid, jiraExpressionAnalysis.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexity, errors, expression, type, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionAnalysis {\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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


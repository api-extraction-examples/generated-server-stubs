package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  &#x60;line&#x60; and &#x60;column&#x60;  *  &#x60;expression&#x60;
 */

@Schema(name = "JiraExpressionValidationError", description = "Details about syntax and type errors. The error details apply to the entire expression, unless the object includes:   *  `line` and `column`  *  `expression`")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionValidationError {

  private Integer column;

  private String expression;

  private Integer line;

  private String message;

  /**
   * The error type.
   */
  public enum TypeEnum {
    SYNTAX("syntax"),
    
    TYPE("type"),
    
    OTHER("other");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public JiraExpressionValidationError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionValidationError(String message, TypeEnum type) {
    this.message = message;
    this.type = type;
  }

  public JiraExpressionValidationError column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * The text column in which the error occurred.
   * @return column
  */
  
  @Schema(name = "column", description = "The text column in which the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("column")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public JiraExpressionValidationError expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The part of the expression in which the error occurred.
   * @return expression
  */
  
  @Schema(name = "expression", description = "The part of the expression in which the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public JiraExpressionValidationError line(Integer line) {
    this.line = line;
    return this;
  }

  /**
   * The text line in which the error occurred.
   * @return line
  */
  
  @Schema(name = "line", description = "The text line in which the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public JiraExpressionValidationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Details about the error.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "!, -, typeof, (, IDENTIFIER, null, true, false, NUMBER, STRING, TEMPLATE_LITERAL, new, [ or { expected, > encountered.", description = "Details about the error.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public JiraExpressionValidationError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The error type.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The error type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    JiraExpressionValidationError jiraExpressionValidationError = (JiraExpressionValidationError) o;
    return Objects.equals(this.column, jiraExpressionValidationError.column) &&
        Objects.equals(this.expression, jiraExpressionValidationError.expression) &&
        Objects.equals(this.line, jiraExpressionValidationError.line) &&
        Objects.equals(this.message, jiraExpressionValidationError.message) &&
        Objects.equals(this.type, jiraExpressionValidationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, expression, line, message, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionValidationError {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


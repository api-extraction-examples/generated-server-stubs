package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FunctionOperand;
import org.openapitools.model.JqlQueryUnitaryOperand;
import org.openapitools.model.KeywordOperand;
import org.openapitools.model.ListOperand;
import org.openapitools.model.ValueOperand;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an operand in a JQL clause.
 */

@Schema(name = "JqlQueryClauseOperand", description = "Details of an operand in a JQL clause.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryClauseOperand {

  private String encodedOperand;

  @Valid
  private List<@Valid JqlQueryUnitaryOperand> values = new ArrayList<>();

  private String encodedValue;

  private String value;

  @Valid
  private List<String> arguments = new ArrayList<>();

  private String function;

  /**
   * The keyword that is the operand value.
   */
  public enum KeywordEnum {
    EMPTY("empty");

    private String value;

    KeywordEnum(String value) {
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
    public static KeywordEnum fromValue(String value) {
      for (KeywordEnum b : KeywordEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private KeywordEnum keyword;

  public JqlQueryClauseOperand() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryClauseOperand(List<@Valid JqlQueryUnitaryOperand> values, String value, List<String> arguments, String function, KeywordEnum keyword) {
    this.values = values;
    this.value = value;
    this.arguments = arguments;
    this.function = function;
    this.keyword = keyword;
  }

  public JqlQueryClauseOperand encodedOperand(String encodedOperand) {
    this.encodedOperand = encodedOperand;
    return this;
  }

  /**
   * Encoded operand, which can be used directly in a JQL query.
   * @return encodedOperand
  */
  
  @Schema(name = "encodedOperand", description = "Encoded operand, which can be used directly in a JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encodedOperand")
  public String getEncodedOperand() {
    return encodedOperand;
  }

  public void setEncodedOperand(String encodedOperand) {
    this.encodedOperand = encodedOperand;
  }

  public JqlQueryClauseOperand values(List<@Valid JqlQueryUnitaryOperand> values) {
    this.values = values;
    return this;
  }

  public JqlQueryClauseOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The list of operand values.
   * @return values
  */
  @NotNull @Valid 
  @Schema(name = "values", description = "The list of operand values.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Valid JqlQueryUnitaryOperand> getValues() {
    return values;
  }

  public void setValues(List<@Valid JqlQueryUnitaryOperand> values) {
    this.values = values;
  }

  public JqlQueryClauseOperand encodedValue(String encodedValue) {
    this.encodedValue = encodedValue;
    return this;
  }

  /**
   * Encoded value, which can be used directly in a JQL query.
   * @return encodedValue
  */
  
  @Schema(name = "encodedValue", description = "Encoded value, which can be used directly in a JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encodedValue")
  public String getEncodedValue() {
    return encodedValue;
  }

  public void setEncodedValue(String encodedValue) {
    this.encodedValue = encodedValue;
  }

  public JqlQueryClauseOperand value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The operand value.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The operand value.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public JqlQueryClauseOperand arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public JqlQueryClauseOperand addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * The list of function arguments.
   * @return arguments
  */
  @NotNull 
  @Schema(name = "arguments", description = "The list of function arguments.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("arguments")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  public JqlQueryClauseOperand function(String function) {
    this.function = function;
    return this;
  }

  /**
   * The name of the function.
   * @return function
  */
  @NotNull 
  @Schema(name = "function", description = "The name of the function.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("function")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public JqlQueryClauseOperand keyword(KeywordEnum keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * The keyword that is the operand value.
   * @return keyword
  */
  @NotNull 
  @Schema(name = "keyword", description = "The keyword that is the operand value.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("keyword")
  public KeywordEnum getKeyword() {
    return keyword;
  }

  public void setKeyword(KeywordEnum keyword) {
    this.keyword = keyword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryClauseOperand jqlQueryClauseOperand = (JqlQueryClauseOperand) o;
    return Objects.equals(this.encodedOperand, jqlQueryClauseOperand.encodedOperand) &&
        Objects.equals(this.values, jqlQueryClauseOperand.values) &&
        Objects.equals(this.encodedValue, jqlQueryClauseOperand.encodedValue) &&
        Objects.equals(this.value, jqlQueryClauseOperand.value) &&
        Objects.equals(this.arguments, jqlQueryClauseOperand.arguments) &&
        Objects.equals(this.function, jqlQueryClauseOperand.function) &&
        Objects.equals(this.keyword, jqlQueryClauseOperand.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedOperand, values, encodedValue, value, arguments, function, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryClauseOperand {\n");
    sb.append("    encodedOperand: ").append(toIndentedString(encodedOperand)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    encodedValue: ").append(toIndentedString(encodedValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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


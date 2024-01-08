package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An operand that is a function. See [Advanced searching - functions reference](https://confluence.atlassian.com/x/dwiiLQ) for more information about JQL functions.
 */

@Schema(name = "FunctionOperand", description = "An operand that is a function. See [Advanced searching - functions reference](https://confluence.atlassian.com/x/dwiiLQ) for more information about JQL functions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FunctionOperand {

  @Valid
  private List<String> arguments = new ArrayList<>();

  private String encodedOperand;

  private String function;

  public FunctionOperand() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FunctionOperand(List<String> arguments, String function) {
    this.arguments = arguments;
    this.function = function;
  }

  public FunctionOperand arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public FunctionOperand addArgumentsItem(String argumentsItem) {
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

  public FunctionOperand encodedOperand(String encodedOperand) {
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

  public FunctionOperand function(String function) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionOperand functionOperand = (FunctionOperand) o;
    return Objects.equals(this.arguments, functionOperand.arguments) &&
        Objects.equals(this.encodedOperand, functionOperand.encodedOperand) &&
        Objects.equals(this.function, functionOperand.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, encodedOperand, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionOperand {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    encodedOperand: ").append(toIndentedString(encodedOperand)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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


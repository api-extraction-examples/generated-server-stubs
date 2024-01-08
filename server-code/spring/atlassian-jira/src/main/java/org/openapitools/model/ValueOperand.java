package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An operand that is a user-provided value.
 */

@Schema(name = "ValueOperand", description = "An operand that is a user-provided value.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ValueOperand {

  private String encodedValue;

  private String value;

  public ValueOperand() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ValueOperand(String value) {
    this.value = value;
  }

  public ValueOperand encodedValue(String encodedValue) {
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

  public ValueOperand value(String value) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueOperand valueOperand = (ValueOperand) o;
    return Objects.equals(this.encodedValue, valueOperand.encodedValue) &&
        Objects.equals(this.value, valueOperand.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueOperand {\n");
    sb.append("    encodedValue: ").append(toIndentedString(encodedValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


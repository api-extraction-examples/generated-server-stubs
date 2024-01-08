package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlQueryUnitaryOperand;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An operand that is a list of values.
 */

@Schema(name = "ListOperand", description = "An operand that is a list of values.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ListOperand {

  private String encodedOperand;

  @Valid
  private List<@Valid JqlQueryUnitaryOperand> values = new ArrayList<>();

  public ListOperand() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListOperand(List<@Valid JqlQueryUnitaryOperand> values) {
    this.values = values;
  }

  public ListOperand encodedOperand(String encodedOperand) {
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

  public ListOperand values(List<@Valid JqlQueryUnitaryOperand> values) {
    this.values = values;
    return this;
  }

  public ListOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOperand listOperand = (ListOperand) o;
    return Objects.equals(this.encodedOperand, listOperand.encodedOperand) &&
        Objects.equals(this.values, listOperand.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedOperand, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOperand {\n");
    sb.append("    encodedOperand: ").append(toIndentedString(encodedOperand)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


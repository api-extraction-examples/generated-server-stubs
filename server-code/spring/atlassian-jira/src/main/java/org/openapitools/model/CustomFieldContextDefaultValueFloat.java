package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Default value for a float (number) custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueFloat", description = "Default value for a float (number) custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueFloat implements CustomFieldContextDefaultValue {

  private Double number;

  private String type;

  public CustomFieldContextDefaultValueFloat() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueFloat(Double number, String type) {
    this.number = number;
    this.type = type;
  }

  public CustomFieldContextDefaultValueFloat number(Double number) {
    this.number = number;
    return this;
  }

  /**
   * The default floating-point number.
   * @return number
  */
  @NotNull 
  @Schema(name = "number", description = "The default floating-point number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("number")
  public Double getNumber() {
    return number;
  }

  public void setNumber(Double number) {
    this.number = number;
  }

  public CustomFieldContextDefaultValueFloat type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    CustomFieldContextDefaultValueFloat customFieldContextDefaultValueFloat = (CustomFieldContextDefaultValueFloat) o;
    return Objects.equals(this.number, customFieldContextDefaultValueFloat.number) &&
        Objects.equals(this.type, customFieldContextDefaultValueFloat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueFloat {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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


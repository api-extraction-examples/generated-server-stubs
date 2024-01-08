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
 * A complex type that indicates a parameter that caused an error and the value of the parameter which caused the error.
 */

@Schema(name = "ErrorParameter", description = "A complex type that indicates a parameter that caused an error and the value of the parameter which caused the error.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ErrorParameter {

  private String name;

  private String value;

  public ErrorParameter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the parameter that caused the error.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the parameter that caused the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ErrorParameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the parameter that caused the error.
   * @return value
  */
  
  @Schema(name = "value", description = "The value of the parameter that caused the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorParameter errorParameter = (ErrorParameter) o;
    return Objects.equals(this.name, errorParameter.name) &&
        Objects.equals(this.value, errorParameter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorParameter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


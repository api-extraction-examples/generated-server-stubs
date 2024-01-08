package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A JSON object with custom content.
 */

@Schema(name = "JsonContextVariable", description = "A JSON object with custom content.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JsonContextVariable implements CustomContextVariable {

  private String type;

  private Object value;

  public JsonContextVariable() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonContextVariable(String type) {
    this.type = type;
  }

  public JsonContextVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of custom context variable.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "Type of custom context variable.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JsonContextVariable value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * A JSON object containing custom content.
   * @return value
  */
  
  @Schema(name = "value", description = "A JSON object containing custom content.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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
    JsonContextVariable jsonContextVariable = (JsonContextVariable) o;
    return Objects.equals(this.type, jsonContextVariable.type) &&
        Objects.equals(this.value, jsonContextVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonContextVariable {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


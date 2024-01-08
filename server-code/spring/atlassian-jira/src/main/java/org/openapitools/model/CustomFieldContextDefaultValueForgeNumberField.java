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
 * Default value for a Forge number custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeNumberField", description = "Default value for a Forge number custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeNumberField implements CustomFieldContextDefaultValue {

  private String contextId;

  private Double number;

  private String type;

  public CustomFieldContextDefaultValueForgeNumberField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeNumberField(String contextId, Double number, String type) {
    this.contextId = contextId;
    this.number = number;
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeNumberField contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueForgeNumberField number(Double number) {
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

  public CustomFieldContextDefaultValueForgeNumberField type(String type) {
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
    CustomFieldContextDefaultValueForgeNumberField customFieldContextDefaultValueForgeNumberField = (CustomFieldContextDefaultValueForgeNumberField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeNumberField.contextId) &&
        Objects.equals(this.number, customFieldContextDefaultValueForgeNumberField.number) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeNumberField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeNumberField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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


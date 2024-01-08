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
 * The default text for a Forge string custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeStringField", description = "The default text for a Forge string custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeStringField implements CustomFieldContextDefaultValue {

  private String contextId;

  private String text;

  private String type;

  public CustomFieldContextDefaultValueForgeStringField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeStringField(String contextId, String type) {
    this.contextId = contextId;
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeStringField contextId(String contextId) {
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

  public CustomFieldContextDefaultValueForgeStringField text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The default text. The maximum length is 254 characters.
   * @return text
  */
  
  @Schema(name = "text", description = "The default text. The maximum length is 254 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CustomFieldContextDefaultValueForgeStringField type(String type) {
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
    CustomFieldContextDefaultValueForgeStringField customFieldContextDefaultValueForgeStringField = (CustomFieldContextDefaultValueForgeStringField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeStringField.contextId) &&
        Objects.equals(this.text, customFieldContextDefaultValueForgeStringField.text) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeStringField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeStringField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


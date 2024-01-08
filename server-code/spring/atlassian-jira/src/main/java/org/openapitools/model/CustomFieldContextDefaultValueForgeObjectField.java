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
 * The default value for a Forge object custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeObjectField", description = "The default value for a Forge object custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeObjectField implements CustomFieldContextDefaultValue {

  private Object _object;

  private String type;

  public CustomFieldContextDefaultValueForgeObjectField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeObjectField(String type) {
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeObjectField _object(Object _object) {
    this._object = _object;
    return this;
  }

  /**
   * The default JSON object.
   * @return _object
  */
  
  @Schema(name = "object", description = "The default JSON object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public Object getObject() {
    return _object;
  }

  public void setObject(Object _object) {
    this._object = _object;
  }

  public CustomFieldContextDefaultValueForgeObjectField type(String type) {
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
    CustomFieldContextDefaultValueForgeObjectField customFieldContextDefaultValueForgeObjectField = (CustomFieldContextDefaultValueForgeObjectField) o;
    return Objects.equals(this._object, customFieldContextDefaultValueForgeObjectField._object) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeObjectField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeObjectField {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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


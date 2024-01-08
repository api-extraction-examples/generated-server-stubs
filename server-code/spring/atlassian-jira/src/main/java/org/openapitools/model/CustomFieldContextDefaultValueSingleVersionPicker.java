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
 * The default value for a version picker custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueSingleVersionPicker", description = "The default value for a version picker custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueSingleVersionPicker implements CustomFieldContextDefaultValue {

  private String type;

  private String versionId;

  private String versionOrder;

  public CustomFieldContextDefaultValueSingleVersionPicker() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueSingleVersionPicker(String type, String versionId) {
    this.type = type;
    this.versionId = versionId;
  }

  public CustomFieldContextDefaultValueSingleVersionPicker type(String type) {
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

  public CustomFieldContextDefaultValueSingleVersionPicker versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The ID of the default version.
   * @return versionId
  */
  @NotNull 
  @Schema(name = "versionId", description = "The ID of the default version.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public CustomFieldContextDefaultValueSingleVersionPicker versionOrder(String versionOrder) {
    this.versionOrder = versionOrder;
    return this;
  }

  /**
   * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `\"releasedFirst\"` and `\"unreleasedFirst\"`.
   * @return versionOrder
  */
  
  @Schema(name = "versionOrder", description = "The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `\"releasedFirst\"` and `\"unreleasedFirst\"`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionOrder")
  public String getVersionOrder() {
    return versionOrder;
  }

  public void setVersionOrder(String versionOrder) {
    this.versionOrder = versionOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueSingleVersionPicker customFieldContextDefaultValueSingleVersionPicker = (CustomFieldContextDefaultValueSingleVersionPicker) o;
    return Objects.equals(this.type, customFieldContextDefaultValueSingleVersionPicker.type) &&
        Objects.equals(this.versionId, customFieldContextDefaultValueSingleVersionPicker.versionId) &&
        Objects.equals(this.versionOrder, customFieldContextDefaultValueSingleVersionPicker.versionOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, versionId, versionOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueSingleVersionPicker {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionOrder: ").append(toIndentedString(versionOrder)).append("\n");
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


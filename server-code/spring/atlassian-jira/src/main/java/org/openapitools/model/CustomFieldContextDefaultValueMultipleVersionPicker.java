package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * The default value for a multiple version picker custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueMultipleVersionPicker", description = "The default value for a multiple version picker custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueMultipleVersionPicker implements CustomFieldContextDefaultValue {

  private String type;

  @Valid
  private Set<String> versionIds = new LinkedHashSet<>();

  private String versionOrder;

  public CustomFieldContextDefaultValueMultipleVersionPicker() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueMultipleVersionPicker(String type, Set<String> versionIds) {
    this.type = type;
    this.versionIds = versionIds;
  }

  public CustomFieldContextDefaultValueMultipleVersionPicker type(String type) {
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

  public CustomFieldContextDefaultValueMultipleVersionPicker versionIds(Set<String> versionIds) {
    this.versionIds = versionIds;
    return this;
  }

  public CustomFieldContextDefaultValueMultipleVersionPicker addVersionIdsItem(String versionIdsItem) {
    if (this.versionIds == null) {
      this.versionIds = new LinkedHashSet<>();
    }
    this.versionIds.add(versionIdsItem);
    return this;
  }

  /**
   * The IDs of the default versions.
   * @return versionIds
  */
  @NotNull 
  @Schema(name = "versionIds", description = "The IDs of the default versions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("versionIds")
  public Set<String> getVersionIds() {
    return versionIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setVersionIds(Set<String> versionIds) {
    this.versionIds = versionIds;
  }

  public CustomFieldContextDefaultValueMultipleVersionPicker versionOrder(String versionOrder) {
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
    CustomFieldContextDefaultValueMultipleVersionPicker customFieldContextDefaultValueMultipleVersionPicker = (CustomFieldContextDefaultValueMultipleVersionPicker) o;
    return Objects.equals(this.type, customFieldContextDefaultValueMultipleVersionPicker.type) &&
        Objects.equals(this.versionIds, customFieldContextDefaultValueMultipleVersionPicker.versionIds) &&
        Objects.equals(this.versionOrder, customFieldContextDefaultValueMultipleVersionPicker.versionOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, versionIds, versionOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueMultipleVersionPicker {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionIds: ").append(toIndentedString(versionIds)).append("\n");
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


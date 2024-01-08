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
 * EnumOptionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class EnumOptionRequest {

  private String gid;

  private String resourceType;

  private String color;

  private Boolean enabled;

  private String name;

  private String insertAfter;

  private String insertBefore;

  public EnumOptionRequest gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public EnumOptionRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public EnumOptionRequest color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the enum option. Defaults to ‘none’.
   * @return color
  */
  
  @Schema(name = "color", example = "blue", description = "The color of the enum option. Defaults to ‘none’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public EnumOptionRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether or not the enum option is a selectable value for the custom field.
   * @return enabled
  */
  
  @Schema(name = "enabled", example = "true", description = "Whether or not the enum option is a selectable value for the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public EnumOptionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the enum option.
   * @return name
  */
  
  @Schema(name = "name", example = "Low", description = "The name of the enum option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnumOptionRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "12345", description = "An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public EnumOptionRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "12345", description = "An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumOptionRequest enumOptionRequest = (EnumOptionRequest) o;
    return Objects.equals(this.gid, enumOptionRequest.gid) &&
        Objects.equals(this.resourceType, enumOptionRequest.resourceType) &&
        Objects.equals(this.color, enumOptionRequest.color) &&
        Objects.equals(this.enabled, enumOptionRequest.enabled) &&
        Objects.equals(this.name, enumOptionRequest.name) &&
        Objects.equals(this.insertAfter, enumOptionRequest.insertAfter) &&
        Objects.equals(this.insertBefore, enumOptionRequest.insertBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, color, enabled, name, insertAfter, insertBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumOptionRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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


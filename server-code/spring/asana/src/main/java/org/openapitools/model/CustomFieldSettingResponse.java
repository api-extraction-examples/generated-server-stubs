package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CustomFieldSettingResponseAllOfCustomField;
import org.openapitools.model.CustomFieldSettingResponseAllOfParent;
import org.openapitools.model.CustomFieldSettingResponseAllOfProject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomFieldSettingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class CustomFieldSettingResponse {

  private String gid;

  private String resourceType;

  private CustomFieldSettingResponseAllOfCustomField customField;

  private Boolean isImportant;

  private CustomFieldSettingResponseAllOfParent parent;

  private CustomFieldSettingResponseAllOfProject project;

  public CustomFieldSettingResponse gid(String gid) {
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

  public CustomFieldSettingResponse resourceType(String resourceType) {
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

  public CustomFieldSettingResponse customField(CustomFieldSettingResponseAllOfCustomField customField) {
    this.customField = customField;
    return this;
  }

  /**
   * Get customField
   * @return customField
  */
  @Valid 
  @Schema(name = "custom_field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field")
  public CustomFieldSettingResponseAllOfCustomField getCustomField() {
    return customField;
  }

  public void setCustomField(CustomFieldSettingResponseAllOfCustomField customField) {
    this.customField = customField;
  }

  public CustomFieldSettingResponse isImportant(Boolean isImportant) {
    this.isImportant = isImportant;
    return this;
  }

  /**
   * `is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.
   * @return isImportant
  */
  
  @Schema(name = "is_important", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "`is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_important")
  public Boolean getIsImportant() {
    return isImportant;
  }

  public void setIsImportant(Boolean isImportant) {
    this.isImportant = isImportant;
  }

  public CustomFieldSettingResponse parent(CustomFieldSettingResponseAllOfParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public CustomFieldSettingResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(CustomFieldSettingResponseAllOfParent parent) {
    this.parent = parent;
  }

  public CustomFieldSettingResponse project(CustomFieldSettingResponseAllOfProject project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public CustomFieldSettingResponseAllOfProject getProject() {
    return project;
  }

  public void setProject(CustomFieldSettingResponseAllOfProject project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldSettingResponse customFieldSettingResponse = (CustomFieldSettingResponse) o;
    return Objects.equals(this.gid, customFieldSettingResponse.gid) &&
        Objects.equals(this.resourceType, customFieldSettingResponse.resourceType) &&
        Objects.equals(this.customField, customFieldSettingResponse.customField) &&
        Objects.equals(this.isImportant, customFieldSettingResponse.isImportant) &&
        Objects.equals(this.parent, customFieldSettingResponse.parent) &&
        Objects.equals(this.project, customFieldSettingResponse.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, customField, isImportant, parent, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldSettingResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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


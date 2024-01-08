package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FieldConfigurationScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Project list with assigned field configuration schema.
 */

@Schema(name = "FieldConfigurationSchemeProjects", description = "Project list with assigned field configuration schema.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationSchemeProjects {

  private FieldConfigurationScheme fieldConfigurationScheme;

  @Valid
  private List<String> projectIds = new ArrayList<>();

  public FieldConfigurationSchemeProjects() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationSchemeProjects(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public FieldConfigurationSchemeProjects fieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

  /**
   * Get fieldConfigurationScheme
   * @return fieldConfigurationScheme
  */
  @Valid 
  @Schema(name = "fieldConfigurationScheme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldConfigurationScheme")
  public FieldConfigurationScheme getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }

  public void setFieldConfigurationScheme(FieldConfigurationScheme fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }

  public FieldConfigurationSchemeProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public FieldConfigurationSchemeProjects addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The IDs of projects using the field configuration scheme.
   * @return projectIds
  */
  @NotNull 
  @Schema(name = "projectIds", description = "The IDs of projects using the field configuration scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectIds")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationSchemeProjects fieldConfigurationSchemeProjects = (FieldConfigurationSchemeProjects) o;
    return Objects.equals(this.fieldConfigurationScheme, fieldConfigurationSchemeProjects.fieldConfigurationScheme) &&
        Objects.equals(this.projectIds, fieldConfigurationSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjects {\n");
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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


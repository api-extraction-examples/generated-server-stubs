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
 * ProjectSectionInsertRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectSectionInsertRequest {

  private String afterSection;

  private String beforeSection;

  private String project;

  private String section;

  public ProjectSectionInsertRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectSectionInsertRequest(String project, String section) {
    this.project = project;
    this.section = section;
  }

  public ProjectSectionInsertRequest afterSection(String afterSection) {
    this.afterSection = afterSection;
    return this;
  }

  /**
   * Insert the given section immediately after the section specified by this parameter.
   * @return afterSection
  */
  
  @Schema(name = "after_section", example = "987654", description = "Insert the given section immediately after the section specified by this parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after_section")
  public String getAfterSection() {
    return afterSection;
  }

  public void setAfterSection(String afterSection) {
    this.afterSection = afterSection;
  }

  public ProjectSectionInsertRequest beforeSection(String beforeSection) {
    this.beforeSection = beforeSection;
    return this;
  }

  /**
   * Insert the given section immediately before the section specified by this parameter.
   * @return beforeSection
  */
  
  @Schema(name = "before_section", example = "86420", description = "Insert the given section immediately before the section specified by this parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("before_section")
  public String getBeforeSection() {
    return beforeSection;
  }

  public void setBeforeSection(String beforeSection) {
    this.beforeSection = beforeSection;
  }

  public ProjectSectionInsertRequest project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The project in which to reorder the given section.
   * @return project
  */
  @NotNull 
  @Schema(name = "project", example = "123456", description = "The project in which to reorder the given section.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ProjectSectionInsertRequest section(String section) {
    this.section = section;
    return this;
  }

  /**
   * The section to reorder.
   * @return section
  */
  @NotNull 
  @Schema(name = "section", example = "321654", description = "The section to reorder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSectionInsertRequest projectSectionInsertRequest = (ProjectSectionInsertRequest) o;
    return Objects.equals(this.afterSection, projectSectionInsertRequest.afterSection) &&
        Objects.equals(this.beforeSection, projectSectionInsertRequest.beforeSection) &&
        Objects.equals(this.project, projectSectionInsertRequest.project) &&
        Objects.equals(this.section, projectSectionInsertRequest.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterSection, beforeSection, project, section);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSectionInsertRequest {\n");
    sb.append("    afterSection: ").append(toIndentedString(afterSection)).append("\n");
    sb.append("    beforeSection: ").append(toIndentedString(beforeSection)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ProjectCompact;
import org.openapitools.model.SectionCompact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskBaseAllOfMemberships
 */

@JsonTypeName("TaskBase_allOf_memberships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TaskBaseAllOfMemberships {

  private ProjectCompact project;

  private SectionCompact section;

  public TaskBaseAllOfMemberships project(ProjectCompact project) {
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
  public ProjectCompact getProject() {
    return project;
  }

  public void setProject(ProjectCompact project) {
    this.project = project;
  }

  public TaskBaseAllOfMemberships section(SectionCompact section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
  */
  @Valid 
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public SectionCompact getSection() {
    return section;
  }

  public void setSection(SectionCompact section) {
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
    TaskBaseAllOfMemberships taskBaseAllOfMemberships = (TaskBaseAllOfMemberships) o;
    return Objects.equals(this.project, taskBaseAllOfMemberships.project) &&
        Objects.equals(this.section, taskBaseAllOfMemberships.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, section);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBaseAllOfMemberships {\n");
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


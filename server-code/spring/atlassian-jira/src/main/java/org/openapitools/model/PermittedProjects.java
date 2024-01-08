package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectIdentifierBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of projects in which a user is granted permissions.
 */

@Schema(name = "PermittedProjects", description = "A list of projects in which a user is granted permissions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PermittedProjects {

  @Valid
  private List<@Valid ProjectIdentifierBean> projects;

  public PermittedProjects projects(List<@Valid ProjectIdentifierBean> projects) {
    this.projects = projects;
    return this;
  }

  public PermittedProjects addProjectsItem(ProjectIdentifierBean projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * A list of projects.
   * @return projects
  */
  @Valid 
  @Schema(name = "projects", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of projects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid ProjectIdentifierBean> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid ProjectIdentifierBean> projects) {
    this.projects = projects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermittedProjects permittedProjects = (PermittedProjects) o;
    return Objects.equals(this.projects, permittedProjects.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermittedProjects {\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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


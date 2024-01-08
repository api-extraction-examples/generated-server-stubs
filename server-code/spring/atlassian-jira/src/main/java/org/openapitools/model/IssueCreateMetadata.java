package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectIssueCreateMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The wrapper for the issue creation metadata for a list of projects.
 */

@Schema(name = "IssueCreateMetadata", description = "The wrapper for the issue creation metadata for a list of projects.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueCreateMetadata {

  private String expand;

  @Valid
  private List<@Valid ProjectIssueCreateMetadata> projects;

  public IssueCreateMetadata expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional project details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional project details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public IssueCreateMetadata projects(List<@Valid ProjectIssueCreateMetadata> projects) {
    this.projects = projects;
    return this;
  }

  public IssueCreateMetadata addProjectsItem(ProjectIssueCreateMetadata projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * List of projects and their issue creation metadata.
   * @return projects
  */
  @Valid 
  @Schema(name = "projects", accessMode = Schema.AccessMode.READ_ONLY, description = "List of projects and their issue creation metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid ProjectIssueCreateMetadata> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid ProjectIssueCreateMetadata> projects) {
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
    IssueCreateMetadata issueCreateMetadata = (IssueCreateMetadata) o;
    return Objects.equals(this.expand, issueCreateMetadata.expand) &&
        Objects.equals(this.projects, issueCreateMetadata.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCreateMetadata {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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


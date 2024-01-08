package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of project permissions and associated issues and projects to look up.
 */

@Schema(name = "BulkProjectPermissions", description = "Details of project permissions and associated issues and projects to look up.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkProjectPermissions {

  @Valid
  private Set<Long> issues;

  @Valid
  private Set<String> permissions = new LinkedHashSet<>();

  @Valid
  private Set<Long> projects;

  public BulkProjectPermissions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkProjectPermissions(Set<String> permissions) {
    this.permissions = permissions;
  }

  public BulkProjectPermissions issues(Set<Long> issues) {
    this.issues = issues;
    return this;
  }

  public BulkProjectPermissions addIssuesItem(Long issuesItem) {
    if (this.issues == null) {
      this.issues = new LinkedHashSet<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * List of issue IDs.
   * @return issues
  */
  
  @Schema(name = "issues", description = "List of issue IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public Set<Long> getIssues() {
    return issues;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIssues(Set<Long> issues) {
    this.issues = issues;
  }

  public BulkProjectPermissions permissions(Set<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BulkProjectPermissions addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new LinkedHashSet<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * List of project permissions.
   * @return permissions
  */
  @NotNull 
  @Schema(name = "permissions", description = "List of project permissions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public Set<String> getPermissions() {
    return permissions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setPermissions(Set<String> permissions) {
    this.permissions = permissions;
  }

  public BulkProjectPermissions projects(Set<Long> projects) {
    this.projects = projects;
    return this;
  }

  public BulkProjectPermissions addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new LinkedHashSet<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * List of project IDs.
   * @return projects
  */
  
  @Schema(name = "projects", description = "List of project IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public Set<Long> getProjects() {
    return projects;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjects(Set<Long> projects) {
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
    BulkProjectPermissions bulkProjectPermissions = (BulkProjectPermissions) o;
    return Objects.equals(this.issues, bulkProjectPermissions.issues) &&
        Objects.equals(this.permissions, bulkProjectPermissions.permissions) &&
        Objects.equals(this.projects, bulkProjectPermissions.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, permissions, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProjectPermissions {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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


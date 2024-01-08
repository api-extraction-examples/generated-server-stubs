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
 * List of project permissions and the projects and issues those permissions grant access to.
 */

@Schema(name = "BulkProjectPermissionGrants", description = "List of project permissions and the projects and issues those permissions grant access to.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkProjectPermissionGrants {

  @Valid
  private Set<Long> issues = new LinkedHashSet<>();

  private String permission;

  @Valid
  private Set<Long> projects = new LinkedHashSet<>();

  public BulkProjectPermissionGrants() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkProjectPermissionGrants(Set<Long> issues, String permission, Set<Long> projects) {
    this.issues = issues;
    this.permission = permission;
    this.projects = projects;
  }

  public BulkProjectPermissionGrants issues(Set<Long> issues) {
    this.issues = issues;
    return this;
  }

  public BulkProjectPermissionGrants addIssuesItem(Long issuesItem) {
    if (this.issues == null) {
      this.issues = new LinkedHashSet<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * IDs of the issues the user has the permission for.
   * @return issues
  */
  @NotNull 
  @Schema(name = "issues", description = "IDs of the issues the user has the permission for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issues")
  public Set<Long> getIssues() {
    return issues;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIssues(Set<Long> issues) {
    this.issues = issues;
  }

  public BulkProjectPermissionGrants permission(String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * A project permission,
   * @return permission
  */
  @NotNull 
  @Schema(name = "permission", description = "A project permission,", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permission")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public BulkProjectPermissionGrants projects(Set<Long> projects) {
    this.projects = projects;
    return this;
  }

  public BulkProjectPermissionGrants addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new LinkedHashSet<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * IDs of the projects the user has the permission for.
   * @return projects
  */
  @NotNull 
  @Schema(name = "projects", description = "IDs of the projects the user has the permission for.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    BulkProjectPermissionGrants bulkProjectPermissionGrants = (BulkProjectPermissionGrants) o;
    return Objects.equals(this.issues, bulkProjectPermissionGrants.issues) &&
        Objects.equals(this.permission, bulkProjectPermissionGrants.permission) &&
        Objects.equals(this.projects, bulkProjectPermissionGrants.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, permission, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProjectPermissionGrants {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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


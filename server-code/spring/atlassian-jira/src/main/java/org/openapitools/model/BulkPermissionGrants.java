package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.BulkProjectPermissionGrants;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of global and project permissions granted to the user.
 */

@Schema(name = "BulkPermissionGrants", description = "Details of global and project permissions granted to the user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkPermissionGrants {

  @Valid
  private Set<String> globalPermissions = new LinkedHashSet<>();

  @Valid
  private Set<@Valid BulkProjectPermissionGrants> projectPermissions = new LinkedHashSet<>();

  public BulkPermissionGrants() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BulkPermissionGrants(Set<String> globalPermissions, Set<@Valid BulkProjectPermissionGrants> projectPermissions) {
    this.globalPermissions = globalPermissions;
    this.projectPermissions = projectPermissions;
  }

  public BulkPermissionGrants globalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionGrants addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new LinkedHashSet<>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

  /**
   * List of permissions granted to the user.
   * @return globalPermissions
  */
  @NotNull 
  @Schema(name = "globalPermissions", description = "List of permissions granted to the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("globalPermissions")
  public Set<String> getGlobalPermissions() {
    return globalPermissions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGlobalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }

  public BulkPermissionGrants projectPermissions(Set<@Valid BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionGrants addProjectPermissionsItem(BulkProjectPermissionGrants projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new LinkedHashSet<>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

  /**
   * List of project permissions and the projects and issues those permissions provide access to.
   * @return projectPermissions
  */
  @NotNull @Valid 
  @Schema(name = "projectPermissions", description = "List of project permissions and the projects and issues those permissions provide access to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectPermissions")
  public Set<@Valid BulkProjectPermissionGrants> getProjectPermissions() {
    return projectPermissions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjectPermissions(Set<@Valid BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionGrants bulkPermissionGrants = (BulkPermissionGrants) o;
    return Objects.equals(this.globalPermissions, bulkPermissionGrants.globalPermissions) &&
        Objects.equals(this.projectPermissions, bulkPermissionGrants.projectPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalPermissions, projectPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionGrants {\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
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


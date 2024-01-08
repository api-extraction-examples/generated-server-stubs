package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.BulkProjectPermissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of global permissions to look up and project permissions with associated projects and issues to look up.
 */

@Schema(name = "BulkPermissionsRequestBean", description = "Details of global permissions to look up and project permissions with associated projects and issues to look up.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkPermissionsRequestBean {

  private String accountId;

  @Valid
  private Set<String> globalPermissions;

  @Valid
  private Set<@Valid BulkProjectPermissions> projectPermissions;

  public BulkPermissionsRequestBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID of a user.
   * @return accountId
  */
  
  @Schema(name = "accountId", description = "The account ID of a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BulkPermissionsRequestBean globalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new LinkedHashSet<>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

  /**
   * Global permissions to look up.
   * @return globalPermissions
  */
  
  @Schema(name = "globalPermissions", description = "Global permissions to look up.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalPermissions")
  public Set<String> getGlobalPermissions() {
    return globalPermissions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGlobalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }

  public BulkPermissionsRequestBean projectPermissions(Set<@Valid BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addProjectPermissionsItem(BulkProjectPermissions projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new LinkedHashSet<>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

  /**
   * Project permissions with associated projects and issues to look up.
   * @return projectPermissions
  */
  @Valid 
  @Schema(name = "projectPermissions", description = "Project permissions with associated projects and issues to look up.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectPermissions")
  public Set<@Valid BulkProjectPermissions> getProjectPermissions() {
    return projectPermissions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjectPermissions(Set<@Valid BulkProjectPermissions> projectPermissions) {
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
    BulkPermissionsRequestBean bulkPermissionsRequestBean = (BulkPermissionsRequestBean) o;
    return Objects.equals(this.accountId, bulkPermissionsRequestBean.accountId) &&
        Objects.equals(this.globalPermissions, bulkPermissionsRequestBean.globalPermissions) &&
        Objects.equals(this.projectPermissions, bulkPermissionsRequestBean.projectPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, globalPermissions, projectPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionsRequestBean {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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


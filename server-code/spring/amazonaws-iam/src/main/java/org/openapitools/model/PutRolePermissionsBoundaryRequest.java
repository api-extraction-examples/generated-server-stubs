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
 * PutRolePermissionsBoundaryRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PutRolePermissionsBoundaryRequest {

  private String roleName;

  private String permissionsBoundary;

  public PutRolePermissionsBoundaryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PutRolePermissionsBoundaryRequest(String roleName, String permissionsBoundary) {
    this.roleName = roleName;
    this.permissionsBoundary = permissionsBoundary;
  }

  public PutRolePermissionsBoundaryRequest roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
  */
  @NotNull 
  @Schema(name = "RoleName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RoleName")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public PutRolePermissionsBoundaryRequest permissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  @NotNull 
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public String getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutRolePermissionsBoundaryRequest putRolePermissionsBoundaryRequest = (PutRolePermissionsBoundaryRequest) o;
    return Objects.equals(this.roleName, putRolePermissionsBoundaryRequest.roleName) &&
        Objects.equals(this.permissionsBoundary, putRolePermissionsBoundaryRequest.permissionsBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, permissionsBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutRolePermissionsBoundaryRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PermissionsBoundaryAttachmentType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RolePermissionsBoundary
 */

@JsonTypeName("Role_PermissionsBoundary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RolePermissionsBoundary {

  private PermissionsBoundaryAttachmentType permissionsBoundaryType;

  private String permissionsBoundaryArn;

  public RolePermissionsBoundary permissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
    this.permissionsBoundaryType = permissionsBoundaryType;
    return this;
  }

  /**
   * Get permissionsBoundaryType
   * @return permissionsBoundaryType
  */
  @Valid 
  @Schema(name = "PermissionsBoundaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryType")
  public PermissionsBoundaryAttachmentType getPermissionsBoundaryType() {
    return permissionsBoundaryType;
  }

  public void setPermissionsBoundaryType(PermissionsBoundaryAttachmentType permissionsBoundaryType) {
    this.permissionsBoundaryType = permissionsBoundaryType;
  }

  public RolePermissionsBoundary permissionsBoundaryArn(String permissionsBoundaryArn) {
    this.permissionsBoundaryArn = permissionsBoundaryArn;
    return this;
  }

  /**
   * Get permissionsBoundaryArn
   * @return permissionsBoundaryArn
  */
  
  @Schema(name = "PermissionsBoundaryArn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryArn")
  public String getPermissionsBoundaryArn() {
    return permissionsBoundaryArn;
  }

  public void setPermissionsBoundaryArn(String permissionsBoundaryArn) {
    this.permissionsBoundaryArn = permissionsBoundaryArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RolePermissionsBoundary rolePermissionsBoundary = (RolePermissionsBoundary) o;
    return Objects.equals(this.permissionsBoundaryType, rolePermissionsBoundary.permissionsBoundaryType) &&
        Objects.equals(this.permissionsBoundaryArn, rolePermissionsBoundary.permissionsBoundaryArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionsBoundaryType, permissionsBoundaryArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RolePermissionsBoundary {\n");
    sb.append("    permissionsBoundaryType: ").append(toIndentedString(permissionsBoundaryType)).append("\n");
    sb.append("    permissionsBoundaryArn: ").append(toIndentedString(permissionsBoundaryArn)).append("\n");
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


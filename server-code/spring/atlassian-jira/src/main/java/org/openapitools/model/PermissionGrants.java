package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PermissionGrant;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of permission grants.
 */

@Schema(name = "PermissionGrants", description = "List of permission grants.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PermissionGrants {

  private String expand;

  @Valid
  private List<@Valid PermissionGrant> permissions;

  public PermissionGrants expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional permission grant details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional permission grant details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public PermissionGrants permissions(List<@Valid PermissionGrant> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionGrants addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permission grants list.
   * @return permissions
  */
  @Valid 
  @Schema(name = "permissions", accessMode = Schema.AccessMode.READ_ONLY, description = "Permission grants list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid PermissionGrant> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid PermissionGrant> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionGrants permissionGrants = (PermissionGrants) o;
    return Objects.equals(this.expand, permissionGrants.expand) &&
        Objects.equals(this.permissions, permissionGrants.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionGrants {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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


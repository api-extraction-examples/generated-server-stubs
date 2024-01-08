package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PermissionScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of all permission schemes.
 */

@Schema(name = "PermissionSchemes", description = "List of all permission schemes.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PermissionSchemes {

  @Valid
  private List<@Valid PermissionScheme> permissionSchemes;

  public PermissionSchemes permissionSchemes(List<@Valid PermissionScheme> permissionSchemes) {
    this.permissionSchemes = permissionSchemes;
    return this;
  }

  public PermissionSchemes addPermissionSchemesItem(PermissionScheme permissionSchemesItem) {
    if (this.permissionSchemes == null) {
      this.permissionSchemes = new ArrayList<>();
    }
    this.permissionSchemes.add(permissionSchemesItem);
    return this;
  }

  /**
   * Permission schemes list.
   * @return permissionSchemes
  */
  @Valid 
  @Schema(name = "permissionSchemes", accessMode = Schema.AccessMode.READ_ONLY, description = "Permission schemes list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionSchemes")
  public List<@Valid PermissionScheme> getPermissionSchemes() {
    return permissionSchemes;
  }

  public void setPermissionSchemes(List<@Valid PermissionScheme> permissionSchemes) {
    this.permissionSchemes = permissionSchemes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionSchemes permissionSchemes = (PermissionSchemes) o;
    return Objects.equals(this.permissionSchemes, permissionSchemes.permissionSchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionSchemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionSchemes {\n");
    sb.append("    permissionSchemes: ").append(toIndentedString(permissionSchemes)).append("\n");
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


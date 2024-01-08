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
 * RemoveRoleFromInstanceProfileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RemoveRoleFromInstanceProfileRequest {

  private String instanceProfileName;

  private String roleName;

  public RemoveRoleFromInstanceProfileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveRoleFromInstanceProfileRequest(String instanceProfileName, String roleName) {
    this.instanceProfileName = instanceProfileName;
    this.roleName = roleName;
  }

  public RemoveRoleFromInstanceProfileRequest instanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
    return this;
  }

  /**
   * Get instanceProfileName
   * @return instanceProfileName
  */
  @NotNull 
  @Schema(name = "InstanceProfileName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfileName")
  public String getInstanceProfileName() {
    return instanceProfileName;
  }

  public void setInstanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
  }

  public RemoveRoleFromInstanceProfileRequest roleName(String roleName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest = (RemoveRoleFromInstanceProfileRequest) o;
    return Objects.equals(this.instanceProfileName, removeRoleFromInstanceProfileRequest.instanceProfileName) &&
        Objects.equals(this.roleName, removeRoleFromInstanceProfileRequest.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfileName, roleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveRoleFromInstanceProfileRequest {\n");
    sb.append("    instanceProfileName: ").append(toIndentedString(instanceProfileName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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


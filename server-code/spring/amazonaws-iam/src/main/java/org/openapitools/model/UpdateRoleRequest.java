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
 * UpdateRoleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateRoleRequest {

  private String roleName;

  private String description;

  private Integer maxSessionDuration;

  public UpdateRoleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateRoleRequest(String roleName) {
    this.roleName = roleName;
  }

  public UpdateRoleRequest roleName(String roleName) {
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

  public UpdateRoleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateRoleRequest maxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
    return this;
  }

  /**
   * Get maxSessionDuration
   * @return maxSessionDuration
  */
  
  @Schema(name = "MaxSessionDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxSessionDuration")
  public Integer getMaxSessionDuration() {
    return maxSessionDuration;
  }

  public void setMaxSessionDuration(Integer maxSessionDuration) {
    this.maxSessionDuration = maxSessionDuration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoleRequest updateRoleRequest = (UpdateRoleRequest) o;
    return Objects.equals(this.roleName, updateRoleRequest.roleName) &&
        Objects.equals(this.description, updateRoleRequest.description) &&
        Objects.equals(this.maxSessionDuration, updateRoleRequest.maxSessionDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, description, maxSessionDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRoleRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
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


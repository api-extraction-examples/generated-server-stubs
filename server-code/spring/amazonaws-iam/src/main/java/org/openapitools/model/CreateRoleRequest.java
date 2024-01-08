package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateRoleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateRoleRequest {

  private String path;

  private String roleName;

  private String assumeRolePolicyDocument;

  private String description;

  private Integer maxSessionDuration;

  private String permissionsBoundary;

  private List tags;

  public CreateRoleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateRoleRequest(String roleName, String assumeRolePolicyDocument) {
    this.roleName = roleName;
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
  }

  public CreateRoleRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public CreateRoleRequest roleName(String roleName) {
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

  public CreateRoleRequest assumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    return this;
  }

  /**
   * Get assumeRolePolicyDocument
   * @return assumeRolePolicyDocument
  */
  @NotNull 
  @Schema(name = "AssumeRolePolicyDocument", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AssumeRolePolicyDocument")
  public String getAssumeRolePolicyDocument() {
    return assumeRolePolicyDocument;
  }

  public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
  }

  public CreateRoleRequest description(String description) {
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

  public CreateRoleRequest maxSessionDuration(Integer maxSessionDuration) {
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

  public CreateRoleRequest permissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public String getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  public CreateRoleRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoleRequest createRoleRequest = (CreateRoleRequest) o;
    return Objects.equals(this.path, createRoleRequest.path) &&
        Objects.equals(this.roleName, createRoleRequest.roleName) &&
        Objects.equals(this.assumeRolePolicyDocument, createRoleRequest.assumeRolePolicyDocument) &&
        Objects.equals(this.description, createRoleRequest.description) &&
        Objects.equals(this.maxSessionDuration, createRoleRequest.maxSessionDuration) &&
        Objects.equals(this.permissionsBoundary, createRoleRequest.permissionsBoundary) &&
        Objects.equals(this.tags, createRoleRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, roleName, assumeRolePolicyDocument, description, maxSessionDuration, permissionsBoundary, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoleRequest {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    assumeRolePolicyDocument: ").append(toIndentedString(assumeRolePolicyDocument)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


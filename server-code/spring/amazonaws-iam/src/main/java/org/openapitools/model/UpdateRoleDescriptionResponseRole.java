package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.RolePermissionsBoundary;
import org.openapitools.model.RoleRoleLastUsed;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateRoleDescriptionResponseRole
 */

@JsonTypeName("UpdateRoleDescriptionResponse_Role")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateRoleDescriptionResponseRole {

  private String path;

  private String roleName;

  private String roleId;

  private String arn;

  private OffsetDateTime createDate;

  private String assumeRolePolicyDocument;

  private String description;

  private Integer maxSessionDuration;

  private RolePermissionsBoundary permissionsBoundary;

  private List tags;

  private RoleRoleLastUsed roleLastUsed;

  public UpdateRoleDescriptionResponseRole() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateRoleDescriptionResponseRole(String path, String roleName, String roleId, String arn, OffsetDateTime createDate) {
    this.path = path;
    this.roleName = roleName;
    this.roleId = roleId;
    this.arn = arn;
    this.createDate = createDate;
  }

  public UpdateRoleDescriptionResponseRole path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public UpdateRoleDescriptionResponseRole roleName(String roleName) {
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

  public UpdateRoleDescriptionResponseRole roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  @NotNull 
  @Schema(name = "RoleId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RoleId")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public UpdateRoleDescriptionResponseRole arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public UpdateRoleDescriptionResponseRole createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public UpdateRoleDescriptionResponseRole assumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    return this;
  }

  /**
   * Get assumeRolePolicyDocument
   * @return assumeRolePolicyDocument
  */
  
  @Schema(name = "AssumeRolePolicyDocument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AssumeRolePolicyDocument")
  public String getAssumeRolePolicyDocument() {
    return assumeRolePolicyDocument;
  }

  public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
    this.assumeRolePolicyDocument = assumeRolePolicyDocument;
  }

  public UpdateRoleDescriptionResponseRole description(String description) {
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

  public UpdateRoleDescriptionResponseRole maxSessionDuration(Integer maxSessionDuration) {
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

  public UpdateRoleDescriptionResponseRole permissionsBoundary(RolePermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  @Valid 
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public RolePermissionsBoundary getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(RolePermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  public UpdateRoleDescriptionResponseRole tags(List tags) {
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

  public UpdateRoleDescriptionResponseRole roleLastUsed(RoleRoleLastUsed roleLastUsed) {
    this.roleLastUsed = roleLastUsed;
    return this;
  }

  /**
   * Get roleLastUsed
   * @return roleLastUsed
  */
  @Valid 
  @Schema(name = "RoleLastUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoleLastUsed")
  public RoleRoleLastUsed getRoleLastUsed() {
    return roleLastUsed;
  }

  public void setRoleLastUsed(RoleRoleLastUsed roleLastUsed) {
    this.roleLastUsed = roleLastUsed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRoleDescriptionResponseRole updateRoleDescriptionResponseRole = (UpdateRoleDescriptionResponseRole) o;
    return Objects.equals(this.path, updateRoleDescriptionResponseRole.path) &&
        Objects.equals(this.roleName, updateRoleDescriptionResponseRole.roleName) &&
        Objects.equals(this.roleId, updateRoleDescriptionResponseRole.roleId) &&
        Objects.equals(this.arn, updateRoleDescriptionResponseRole.arn) &&
        Objects.equals(this.createDate, updateRoleDescriptionResponseRole.createDate) &&
        Objects.equals(this.assumeRolePolicyDocument, updateRoleDescriptionResponseRole.assumeRolePolicyDocument) &&
        Objects.equals(this.description, updateRoleDescriptionResponseRole.description) &&
        Objects.equals(this.maxSessionDuration, updateRoleDescriptionResponseRole.maxSessionDuration) &&
        Objects.equals(this.permissionsBoundary, updateRoleDescriptionResponseRole.permissionsBoundary) &&
        Objects.equals(this.tags, updateRoleDescriptionResponseRole.tags) &&
        Objects.equals(this.roleLastUsed, updateRoleDescriptionResponseRole.roleLastUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, roleName, roleId, arn, createDate, assumeRolePolicyDocument, description, maxSessionDuration, permissionsBoundary, tags, roleLastUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRoleDescriptionResponseRole {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    assumeRolePolicyDocument: ").append(toIndentedString(assumeRolePolicyDocument)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxSessionDuration: ").append(toIndentedString(maxSessionDuration)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    roleLastUsed: ").append(toIndentedString(roleLastUsed)).append("\n");
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


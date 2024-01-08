package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.RoleDetailRoleLastUsed;
import org.openapitools.model.RolePermissionsBoundary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an IAM role, including all of the role&#39;s policies.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "RoleDetail", description = "<p>Contains information about an IAM role, including all of the role's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class RoleDetail {

  private String path;

  private String roleName;

  private String roleId;

  private String arn;

  private OffsetDateTime createDate;

  private String assumeRolePolicyDocument;

  private List instanceProfileList;

  private List rolePolicyList;

  private List attachedManagedPolicies;

  private RolePermissionsBoundary permissionsBoundary;

  private List tags;

  private RoleDetailRoleLastUsed roleLastUsed;

  public RoleDetail path(String path) {
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

  public RoleDetail roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
  */
  
  @Schema(name = "RoleName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoleName")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleDetail roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  
  @Schema(name = "RoleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoleId")
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public RoleDetail arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>
   * @return arn
  */
  @Size(min = 20, max = 2048) 
  @Schema(name = "Arn", description = "<p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public RoleDetail createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public RoleDetail assumeRolePolicyDocument(String assumeRolePolicyDocument) {
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

  public RoleDetail instanceProfileList(List instanceProfileList) {
    this.instanceProfileList = instanceProfileList;
    return this;
  }

  /**
   * Get instanceProfileList
   * @return instanceProfileList
  */
  @Valid 
  @Schema(name = "InstanceProfileList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InstanceProfileList")
  public List getInstanceProfileList() {
    return instanceProfileList;
  }

  public void setInstanceProfileList(List instanceProfileList) {
    this.instanceProfileList = instanceProfileList;
  }

  public RoleDetail rolePolicyList(List rolePolicyList) {
    this.rolePolicyList = rolePolicyList;
    return this;
  }

  /**
   * Get rolePolicyList
   * @return rolePolicyList
  */
  @Valid 
  @Schema(name = "RolePolicyList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RolePolicyList")
  public List getRolePolicyList() {
    return rolePolicyList;
  }

  public void setRolePolicyList(List rolePolicyList) {
    this.rolePolicyList = rolePolicyList;
  }

  public RoleDetail attachedManagedPolicies(List attachedManagedPolicies) {
    this.attachedManagedPolicies = attachedManagedPolicies;
    return this;
  }

  /**
   * Get attachedManagedPolicies
   * @return attachedManagedPolicies
  */
  @Valid 
  @Schema(name = "AttachedManagedPolicies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachedManagedPolicies")
  public List getAttachedManagedPolicies() {
    return attachedManagedPolicies;
  }

  public void setAttachedManagedPolicies(List attachedManagedPolicies) {
    this.attachedManagedPolicies = attachedManagedPolicies;
  }

  public RoleDetail permissionsBoundary(RolePermissionsBoundary permissionsBoundary) {
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

  public RoleDetail tags(List tags) {
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

  public RoleDetail roleLastUsed(RoleDetailRoleLastUsed roleLastUsed) {
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
  public RoleDetailRoleLastUsed getRoleLastUsed() {
    return roleLastUsed;
  }

  public void setRoleLastUsed(RoleDetailRoleLastUsed roleLastUsed) {
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
    RoleDetail roleDetail = (RoleDetail) o;
    return Objects.equals(this.path, roleDetail.path) &&
        Objects.equals(this.roleName, roleDetail.roleName) &&
        Objects.equals(this.roleId, roleDetail.roleId) &&
        Objects.equals(this.arn, roleDetail.arn) &&
        Objects.equals(this.createDate, roleDetail.createDate) &&
        Objects.equals(this.assumeRolePolicyDocument, roleDetail.assumeRolePolicyDocument) &&
        Objects.equals(this.instanceProfileList, roleDetail.instanceProfileList) &&
        Objects.equals(this.rolePolicyList, roleDetail.rolePolicyList) &&
        Objects.equals(this.attachedManagedPolicies, roleDetail.attachedManagedPolicies) &&
        Objects.equals(this.permissionsBoundary, roleDetail.permissionsBoundary) &&
        Objects.equals(this.tags, roleDetail.tags) &&
        Objects.equals(this.roleLastUsed, roleDetail.roleLastUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, roleName, roleId, arn, createDate, assumeRolePolicyDocument, instanceProfileList, rolePolicyList, attachedManagedPolicies, permissionsBoundary, tags, roleLastUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDetail {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    assumeRolePolicyDocument: ").append(toIndentedString(assumeRolePolicyDocument)).append("\n");
    sb.append("    instanceProfileList: ").append(toIndentedString(instanceProfileList)).append("\n");
    sb.append("    rolePolicyList: ").append(toIndentedString(rolePolicyList)).append("\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
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


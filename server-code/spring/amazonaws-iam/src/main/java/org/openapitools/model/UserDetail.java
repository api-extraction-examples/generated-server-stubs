package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.UserDetailPermissionsBoundary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an IAM user, including all the user&#39;s policies and all the IAM groups the user is in.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "UserDetail", description = "<p>Contains information about an IAM user, including all the user's policies and all the IAM groups the user is in.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UserDetail {

  private String path;

  private String userName;

  private String userId;

  private String arn;

  private OffsetDateTime createDate;

  private List userPolicyList;

  private List groupList;

  private List attachedManagedPolicies;

  private UserDetailPermissionsBoundary permissionsBoundary;

  private List tags;

  public UserDetail path(String path) {
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

  public UserDetail userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserDetail userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "UserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserDetail arn(String arn) {
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

  public UserDetail createDate(OffsetDateTime createDate) {
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

  public UserDetail userPolicyList(List userPolicyList) {
    this.userPolicyList = userPolicyList;
    return this;
  }

  /**
   * Get userPolicyList
   * @return userPolicyList
  */
  @Valid 
  @Schema(name = "UserPolicyList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserPolicyList")
  public List getUserPolicyList() {
    return userPolicyList;
  }

  public void setUserPolicyList(List userPolicyList) {
    this.userPolicyList = userPolicyList;
  }

  public UserDetail groupList(List groupList) {
    this.groupList = groupList;
    return this;
  }

  /**
   * Get groupList
   * @return groupList
  */
  @Valid 
  @Schema(name = "GroupList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupList")
  public List getGroupList() {
    return groupList;
  }

  public void setGroupList(List groupList) {
    this.groupList = groupList;
  }

  public UserDetail attachedManagedPolicies(List attachedManagedPolicies) {
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

  public UserDetail permissionsBoundary(UserDetailPermissionsBoundary permissionsBoundary) {
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
  public UserDetailPermissionsBoundary getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(UserDetailPermissionsBoundary permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  public UserDetail tags(List tags) {
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
    UserDetail userDetail = (UserDetail) o;
    return Objects.equals(this.path, userDetail.path) &&
        Objects.equals(this.userName, userDetail.userName) &&
        Objects.equals(this.userId, userDetail.userId) &&
        Objects.equals(this.arn, userDetail.arn) &&
        Objects.equals(this.createDate, userDetail.createDate) &&
        Objects.equals(this.userPolicyList, userDetail.userPolicyList) &&
        Objects.equals(this.groupList, userDetail.groupList) &&
        Objects.equals(this.attachedManagedPolicies, userDetail.attachedManagedPolicies) &&
        Objects.equals(this.permissionsBoundary, userDetail.permissionsBoundary) &&
        Objects.equals(this.tags, userDetail.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, userName, userId, arn, createDate, userPolicyList, groupList, attachedManagedPolicies, permissionsBoundary, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetail {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    userPolicyList: ").append(toIndentedString(userPolicyList)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
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


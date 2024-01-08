package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about an IAM group, including all of the group&#39;s policies.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "GroupDetail", description = "<p>Contains information about an IAM group, including all of the group's policies.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GroupDetail {

  private String path;

  private String groupName;

  private String groupId;

  private String arn;

  private OffsetDateTime createDate;

  private List groupPolicyList;

  private List attachedManagedPolicies;

  public GroupDetail path(String path) {
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

  public GroupDetail groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  */
  
  @Schema(name = "GroupName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public GroupDetail groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  
  @Schema(name = "GroupId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GroupDetail arn(String arn) {
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

  public GroupDetail createDate(OffsetDateTime createDate) {
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

  public GroupDetail groupPolicyList(List groupPolicyList) {
    this.groupPolicyList = groupPolicyList;
    return this;
  }

  /**
   * Get groupPolicyList
   * @return groupPolicyList
  */
  @Valid 
  @Schema(name = "GroupPolicyList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupPolicyList")
  public List getGroupPolicyList() {
    return groupPolicyList;
  }

  public void setGroupPolicyList(List groupPolicyList) {
    this.groupPolicyList = groupPolicyList;
  }

  public GroupDetail attachedManagedPolicies(List attachedManagedPolicies) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupDetail groupDetail = (GroupDetail) o;
    return Objects.equals(this.path, groupDetail.path) &&
        Objects.equals(this.groupName, groupDetail.groupName) &&
        Objects.equals(this.groupId, groupDetail.groupId) &&
        Objects.equals(this.arn, groupDetail.arn) &&
        Objects.equals(this.createDate, groupDetail.createDate) &&
        Objects.equals(this.groupPolicyList, groupDetail.groupPolicyList) &&
        Objects.equals(this.attachedManagedPolicies, groupDetail.attachedManagedPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, groupName, groupId, arn, createDate, groupPolicyList, attachedManagedPolicies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDetail {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    groupPolicyList: ").append(toIndentedString(groupPolicyList)).append("\n");
    sb.append("    attachedManagedPolicies: ").append(toIndentedString(attachedManagedPolicies)).append("\n");
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


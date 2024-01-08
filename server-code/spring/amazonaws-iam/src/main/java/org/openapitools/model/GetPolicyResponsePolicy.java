package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * GetPolicyResponsePolicy
 */

@JsonTypeName("GetPolicyResponse_Policy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetPolicyResponsePolicy {

  private String policyName;

  private String policyId;

  private String arn;

  private String path;

  private String defaultVersionId;

  private Integer attachmentCount;

  private Integer permissionsBoundaryUsageCount;

  private Boolean isAttachable;

  private String description;

  private OffsetDateTime createDate;

  private OffsetDateTime updateDate;

  private List tags;

  public GetPolicyResponsePolicy policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  
  @Schema(name = "PolicyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public GetPolicyResponsePolicy policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  
  @Schema(name = "PolicyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyId")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public GetPolicyResponsePolicy arn(String arn) {
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

  public GetPolicyResponsePolicy path(String path) {
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

  public GetPolicyResponsePolicy defaultVersionId(String defaultVersionId) {
    this.defaultVersionId = defaultVersionId;
    return this;
  }

  /**
   * Get defaultVersionId
   * @return defaultVersionId
  */
  
  @Schema(name = "DefaultVersionId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultVersionId")
  public String getDefaultVersionId() {
    return defaultVersionId;
  }

  public void setDefaultVersionId(String defaultVersionId) {
    this.defaultVersionId = defaultVersionId;
  }

  public GetPolicyResponsePolicy attachmentCount(Integer attachmentCount) {
    this.attachmentCount = attachmentCount;
    return this;
  }

  /**
   * Get attachmentCount
   * @return attachmentCount
  */
  
  @Schema(name = "AttachmentCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachmentCount")
  public Integer getAttachmentCount() {
    return attachmentCount;
  }

  public void setAttachmentCount(Integer attachmentCount) {
    this.attachmentCount = attachmentCount;
  }

  public GetPolicyResponsePolicy permissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
    this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
    return this;
  }

  /**
   * Get permissionsBoundaryUsageCount
   * @return permissionsBoundaryUsageCount
  */
  
  @Schema(name = "PermissionsBoundaryUsageCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryUsageCount")
  public Integer getPermissionsBoundaryUsageCount() {
    return permissionsBoundaryUsageCount;
  }

  public void setPermissionsBoundaryUsageCount(Integer permissionsBoundaryUsageCount) {
    this.permissionsBoundaryUsageCount = permissionsBoundaryUsageCount;
  }

  public GetPolicyResponsePolicy isAttachable(Boolean isAttachable) {
    this.isAttachable = isAttachable;
    return this;
  }

  /**
   * Get isAttachable
   * @return isAttachable
  */
  
  @Schema(name = "IsAttachable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAttachable")
  public Boolean getIsAttachable() {
    return isAttachable;
  }

  public void setIsAttachable(Boolean isAttachable) {
    this.isAttachable = isAttachable;
  }

  public GetPolicyResponsePolicy description(String description) {
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

  public GetPolicyResponsePolicy createDate(OffsetDateTime createDate) {
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

  public GetPolicyResponsePolicy updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  */
  @Valid 
  @Schema(name = "UpdateDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdateDate")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public GetPolicyResponsePolicy tags(List tags) {
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
    GetPolicyResponsePolicy getPolicyResponsePolicy = (GetPolicyResponsePolicy) o;
    return Objects.equals(this.policyName, getPolicyResponsePolicy.policyName) &&
        Objects.equals(this.policyId, getPolicyResponsePolicy.policyId) &&
        Objects.equals(this.arn, getPolicyResponsePolicy.arn) &&
        Objects.equals(this.path, getPolicyResponsePolicy.path) &&
        Objects.equals(this.defaultVersionId, getPolicyResponsePolicy.defaultVersionId) &&
        Objects.equals(this.attachmentCount, getPolicyResponsePolicy.attachmentCount) &&
        Objects.equals(this.permissionsBoundaryUsageCount, getPolicyResponsePolicy.permissionsBoundaryUsageCount) &&
        Objects.equals(this.isAttachable, getPolicyResponsePolicy.isAttachable) &&
        Objects.equals(this.description, getPolicyResponsePolicy.description) &&
        Objects.equals(this.createDate, getPolicyResponsePolicy.createDate) &&
        Objects.equals(this.updateDate, getPolicyResponsePolicy.updateDate) &&
        Objects.equals(this.tags, getPolicyResponsePolicy.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyId, arn, path, defaultVersionId, attachmentCount, permissionsBoundaryUsageCount, isAttachable, description, createDate, updateDate, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyResponsePolicy {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    defaultVersionId: ").append(toIndentedString(defaultVersionId)).append("\n");
    sb.append("    attachmentCount: ").append(toIndentedString(attachmentCount)).append("\n");
    sb.append("    permissionsBoundaryUsageCount: ").append(toIndentedString(permissionsBoundaryUsageCount)).append("\n");
    sb.append("    isAttachable: ").append(toIndentedString(isAttachable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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


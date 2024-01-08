package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the project.
 */

@Schema(name = "UpdateProjectDetails", description = "Details about the project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UpdateProjectDetails {

  /**
   * The default assignee when creating issues for this project.
   */
  public enum AssigneeTypeEnum {
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AssigneeTypeEnum assigneeType;

  private Long avatarId;

  private Long categoryId;

  private String description;

  private Long issueSecurityScheme;

  private String key;

  private String lead;

  private String leadAccountId;

  private String name;

  private Long notificationScheme;

  private Long permissionScheme;

  private String url;

  public UpdateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  */
  
  @Schema(name = "assigneeType", description = "The default assignee when creating issues for this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeType")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public UpdateProjectDetails avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * An integer value for the project's avatar.
   * @return avatarId
  */
  
  @Schema(name = "avatarId", description = "An integer value for the project's avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarId")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public UpdateProjectDetails categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`
   * @return categoryId
  */
  
  @Schema(name = "categoryId", description = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public UpdateProjectDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A brief description of the project.
   * @return description
  */
  
  @Schema(name = "description", description = "A brief description of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
    return this;
  }

  /**
   * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.
   * @return issueSecurityScheme
  */
  
  @Schema(name = "issueSecurityScheme", description = "The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueSecurityScheme")
  public Long getIssueSecurityScheme() {
    return issueSecurityScheme;
  }

  public void setIssueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
  }

  public UpdateProjectDetails key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
   * @return key
  */
  
  @Schema(name = "key", description = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UpdateProjectDetails lead(String lead) {
    this.lead = lead;
    return this;
  }

  /**
   * This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.
   * @return lead
  */
  
  @Schema(name = "lead", description = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead")
  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public UpdateProjectDetails leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

  /**
   * The account ID of the project lead. Cannot be provided with `lead`.
   * @return leadAccountId
  */
  @Size(max = 128) 
  @Schema(name = "leadAccountId", description = "The account ID of the project lead. Cannot be provided with `lead`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leadAccountId")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public UpdateProjectDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateProjectDetails notificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
    return this;
  }

  /**
   * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.
   * @return notificationScheme
  */
  
  @Schema(name = "notificationScheme", description = "The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationScheme")
  public Long getNotificationScheme() {
    return notificationScheme;
  }

  public void setNotificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
  }

  public UpdateProjectDetails permissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
    return this;
  }

  /**
   * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.
   * @return permissionScheme
  */
  
  @Schema(name = "permissionScheme", description = "The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionScheme")
  public Long getPermissionScheme() {
    return permissionScheme;
  }

  public void setPermissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
  }

  public UpdateProjectDetails url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to information about this project, such as project documentation
   * @return url
  */
  
  @Schema(name = "url", description = "A link to information about this project, such as project documentation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProjectDetails updateProjectDetails = (UpdateProjectDetails) o;
    return Objects.equals(this.assigneeType, updateProjectDetails.assigneeType) &&
        Objects.equals(this.avatarId, updateProjectDetails.avatarId) &&
        Objects.equals(this.categoryId, updateProjectDetails.categoryId) &&
        Objects.equals(this.description, updateProjectDetails.description) &&
        Objects.equals(this.issueSecurityScheme, updateProjectDetails.issueSecurityScheme) &&
        Objects.equals(this.key, updateProjectDetails.key) &&
        Objects.equals(this.lead, updateProjectDetails.lead) &&
        Objects.equals(this.leadAccountId, updateProjectDetails.leadAccountId) &&
        Objects.equals(this.name, updateProjectDetails.name) &&
        Objects.equals(this.notificationScheme, updateProjectDetails.notificationScheme) &&
        Objects.equals(this.permissionScheme, updateProjectDetails.permissionScheme) &&
        Objects.equals(this.url, updateProjectDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeType, avatarId, categoryId, description, issueSecurityScheme, key, lead, leadAccountId, name, notificationScheme, permissionScheme, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProjectDetails {\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


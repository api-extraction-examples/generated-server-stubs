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

@Schema(name = "CreateProjectDetails", description = "Details about the project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateProjectDetails {

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

  private Long fieldConfigurationScheme;

  private Long issueSecurityScheme;

  private Long issueTypeScheme;

  private Long issueTypeScreenScheme;

  private String key;

  private String lead;

  private String leadAccountId;

  private String name;

  private Long notificationScheme;

  private Long permissionScheme;

  /**
   * A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.
   */
  public enum ProjectTemplateKeyEnum {
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC("com.pyxis.greenhopper.jira:gh-simplified-basic"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic"),
    
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_MANAGEMENT("com.atlassian.servicedesk:simplified-it-service-management"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-general-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_IT("com.atlassian.servicedesk:simplified-general-service-desk-it"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK_BUSINESS("com.atlassian.servicedesk:simplified-general-service-desk-business"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-internal-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-external-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK("com.atlassian.servicedesk:simplified-hr-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:simplified-facilities-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-legal-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_MARKETING_SERVICE_DESK("com.atlassian.servicedesk:simplified-marketing-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FINANCE_SERVICE_DESK("com.atlassian.servicedesk:simplified-finance-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_ANALYTICS_SERVICE_DESK("com.atlassian.servicedesk:simplified-analytics-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_DESIGN_SERVICE_DESK("com.atlassian.servicedesk:simplified-design-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_SALES_SERVICE_DESK("com.atlassian.servicedesk:simplified-sales-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HALP_SERVICE_DESK("com.atlassian.servicedesk:simplified-halp-service-desk"),
    
    ATLASSIAN_SERVICEDESK_SIMPLIFIED_CUSTOM_PROJECT_SERVICE_DESK("com.atlassian.servicedesk:simplified-custom-project-service-desk"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment"),
    
    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_("com.atlassian.jira-core-project-templates:jira-core-simplified-task-");

    private String value;

    ProjectTemplateKeyEnum(String value) {
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
    public static ProjectTemplateKeyEnum fromValue(String value) {
      for (ProjectTemplateKeyEnum b : ProjectTemplateKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProjectTemplateKeyEnum projectTemplateKey;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
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
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProjectTypeKeyEnum projectTypeKey;

  private String url;

  private Long workflowScheme;

  public CreateProjectDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateProjectDetails(String key, String name) {
    this.key = key;
    this.name = name;
  }

  public CreateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
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

  public CreateProjectDetails avatarId(Long avatarId) {
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

  public CreateProjectDetails categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.
   * @return categoryId
  */
  
  @Schema(name = "categoryId", description = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CreateProjectDetails description(String description) {
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

  public CreateProjectDetails fieldConfigurationScheme(Long fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
    return this;
  }

  /**
   * The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.
   * @return fieldConfigurationScheme
  */
  
  @Schema(name = "fieldConfigurationScheme", description = "The ID of the field configuration scheme for the project. Use the [Get all field configuration schemes](#api-rest-api-3-fieldconfigurationscheme-get) operation to get a list of field configuration scheme IDs. If you specify the field configuration scheme you cannot specify the project template key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldConfigurationScheme")
  public Long getFieldConfigurationScheme() {
    return fieldConfigurationScheme;
  }

  public void setFieldConfigurationScheme(Long fieldConfigurationScheme) {
    this.fieldConfigurationScheme = fieldConfigurationScheme;
  }

  public CreateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
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

  public CreateProjectDetails issueTypeScheme(Long issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

  /**
   * The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.
   * @return issueTypeScheme
  */
  
  @Schema(name = "issueTypeScheme", description = "The ID of the issue type scheme for the project. Use the [Get all issue type schemes](#api-rest-api-3-issuetypescheme-get) operation to get a list of issue type scheme IDs. If you specify the issue type scheme you cannot specify the project template key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeScheme")
  public Long getIssueTypeScheme() {
    return issueTypeScheme;
  }

  public void setIssueTypeScheme(Long issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }

  public CreateProjectDetails issueTypeScreenScheme(Long issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
    return this;
  }

  /**
   * The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.
   * @return issueTypeScreenScheme
  */
  
  @Schema(name = "issueTypeScreenScheme", description = "The ID of the issue type screen scheme for the project. Use the [Get all issue type screen schemes](#api-rest-api-3-issuetypescreenscheme-get) operation to get a list of issue type screen scheme IDs. If you specify the issue type screen scheme you cannot specify the project template key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeScreenScheme")
  public Long getIssueTypeScreenScheme() {
    return issueTypeScreenScheme;
  }

  public void setIssueTypeScreenScheme(Long issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
  }

  public CreateProjectDetails key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", description = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreateProjectDetails lead(String lead) {
    this.lead = lead;
    return this;
  }

  /**
   * This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `leadAccountId`.
   * @return lead
  */
  
  @Schema(name = "lead", description = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `leadAccountId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead")
  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public CreateProjectDetails leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

  /**
   * The account ID of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `lead`.
   * @return leadAccountId
  */
  @Size(max = 128) 
  @Schema(name = "leadAccountId", description = "The account ID of the project lead. Either `lead` or `leadAccountId` must be set when creating a project. Cannot be provided with `lead`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leadAccountId")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public CreateProjectDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateProjectDetails notificationScheme(Long notificationScheme) {
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

  public CreateProjectDetails permissionScheme(Long permissionScheme) {
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

  public CreateProjectDetails projectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    this.projectTemplateKey = projectTemplateKey;
    return this;
  }

  /**
   * A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.
   * @return projectTemplateKey
  */
  
  @Schema(name = "projectTemplateKey", description = "A predefined configuration for a project. The type of the `projectTemplateKey` must match with the type of the `projectTypeKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectTemplateKey")
  public ProjectTemplateKeyEnum getProjectTemplateKey() {
    return projectTemplateKey;
  }

  public void setProjectTemplateKey(ProjectTemplateKeyEnum projectTemplateKey) {
    this.projectTemplateKey = projectTemplateKey;
  }

  public CreateProjectDetails projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.
   * @return projectTypeKey
  */
  
  @Schema(name = "projectTypeKey", description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes), which defines the application-specific feature set. If you don't specify the project template you have to specify the project type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectTypeKey")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public CreateProjectDetails url(String url) {
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

  public CreateProjectDetails workflowScheme(Long workflowScheme) {
    this.workflowScheme = workflowScheme;
    return this;
  }

  /**
   * The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.
   * @return workflowScheme
  */
  
  @Schema(name = "workflowScheme", description = "The ID of the workflow scheme for the project. Use the [Get all workflow schemes](#api-rest-api-3-workflowscheme-get) operation to get a list of workflow scheme IDs. If you specify the workflow scheme you cannot specify the project template key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflowScheme")
  public Long getWorkflowScheme() {
    return workflowScheme;
  }

  public void setWorkflowScheme(Long workflowScheme) {
    this.workflowScheme = workflowScheme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectDetails createProjectDetails = (CreateProjectDetails) o;
    return Objects.equals(this.assigneeType, createProjectDetails.assigneeType) &&
        Objects.equals(this.avatarId, createProjectDetails.avatarId) &&
        Objects.equals(this.categoryId, createProjectDetails.categoryId) &&
        Objects.equals(this.description, createProjectDetails.description) &&
        Objects.equals(this.fieldConfigurationScheme, createProjectDetails.fieldConfigurationScheme) &&
        Objects.equals(this.issueSecurityScheme, createProjectDetails.issueSecurityScheme) &&
        Objects.equals(this.issueTypeScheme, createProjectDetails.issueTypeScheme) &&
        Objects.equals(this.issueTypeScreenScheme, createProjectDetails.issueTypeScreenScheme) &&
        Objects.equals(this.key, createProjectDetails.key) &&
        Objects.equals(this.lead, createProjectDetails.lead) &&
        Objects.equals(this.leadAccountId, createProjectDetails.leadAccountId) &&
        Objects.equals(this.name, createProjectDetails.name) &&
        Objects.equals(this.notificationScheme, createProjectDetails.notificationScheme) &&
        Objects.equals(this.permissionScheme, createProjectDetails.permissionScheme) &&
        Objects.equals(this.projectTemplateKey, createProjectDetails.projectTemplateKey) &&
        Objects.equals(this.projectTypeKey, createProjectDetails.projectTypeKey) &&
        Objects.equals(this.url, createProjectDetails.url) &&
        Objects.equals(this.workflowScheme, createProjectDetails.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assigneeType, avatarId, categoryId, description, fieldConfigurationScheme, issueSecurityScheme, issueTypeScheme, issueTypeScreenScheme, key, lead, leadAccountId, name, notificationScheme, permissionScheme, projectTemplateKey, projectTypeKey, url, workflowScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectDetails {\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldConfigurationScheme: ").append(toIndentedString(fieldConfigurationScheme)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
    sb.append("    issueTypeScreenScheme: ").append(toIndentedString(issueTypeScreenScheme)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    projectTemplateKey: ").append(toIndentedString(projectTemplateKey)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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


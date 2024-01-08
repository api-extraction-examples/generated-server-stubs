package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.model.IssueTypeDetails;
import org.openapitools.model.ProjectArchivedBy;
import org.openapitools.model.ProjectAvatarUrls;
import org.openapitools.model.ProjectComponent;
import org.openapitools.model.ProjectDeletedBy;
import org.openapitools.model.ProjectInsight;
import org.openapitools.model.ProjectIssueTypeHierarchy;
import org.openapitools.model.ProjectLandingPageInfo;
import org.openapitools.model.ProjectLead;
import org.openapitools.model.ProjectPermissions;
import org.openapitools.model.ProjectProjectCategory;
import org.openapitools.model.Version;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a project.
 */

@Schema(name = "Project", description = "Details about a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Project {

  private Boolean archived;

  private ProjectArchivedBy archivedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime archivedDate;

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

  private ProjectAvatarUrls avatarUrls;

  @Valid
  private List<@Valid ProjectComponent> components;

  private Boolean deleted;

  private ProjectDeletedBy deletedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deletedDate;

  private String description;

  private String email;

  private String expand;

  private Boolean favourite;

  private String id;

  private ProjectInsight insight;

  private Boolean isPrivate;

  private ProjectIssueTypeHierarchy issueTypeHierarchy;

  @Valid
  private List<@Valid IssueTypeDetails> issueTypes;

  private String key;

  private ProjectLandingPageInfo landingPageInfo;

  private ProjectLead lead;

  private String name;

  private ProjectPermissions permissions;

  private ProjectProjectCategory projectCategory;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
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

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime retentionTillDate;

  @Valid
  private Map<String, URI> roles = new HashMap<>();

  private URI self;

  private Boolean simplified;

  /**
   * The type of the project.
   */
  public enum StyleEnum {
    CLASSIC("classic"),
    
    NEXT_GEN("next-gen");

    private String value;

    StyleEnum(String value) {
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
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StyleEnum style;

  private String url;

  private UUID uuid;

  @Valid
  private List<@Valid Version> versions;

  public Project archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Whether the project is archived.
   * @return archived
  */
  
  @Schema(name = "archived", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the project is archived.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Project archivedBy(ProjectArchivedBy archivedBy) {
    this.archivedBy = archivedBy;
    return this;
  }

  /**
   * Get archivedBy
   * @return archivedBy
  */
  @Valid 
  @Schema(name = "archivedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archivedBy")
  public ProjectArchivedBy getArchivedBy() {
    return archivedBy;
  }

  public void setArchivedBy(ProjectArchivedBy archivedBy) {
    this.archivedBy = archivedBy;
  }

  public Project archivedDate(OffsetDateTime archivedDate) {
    this.archivedDate = archivedDate;
    return this;
  }

  /**
   * The date when the project was archived.
   * @return archivedDate
  */
  @Valid 
  @Schema(name = "archivedDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date when the project was archived.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archivedDate")
  public OffsetDateTime getArchivedDate() {
    return archivedDate;
  }

  public void setArchivedDate(OffsetDateTime archivedDate) {
    this.archivedDate = archivedDate;
  }

  public Project assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  */
  
  @Schema(name = "assigneeType", accessMode = Schema.AccessMode.READ_ONLY, description = "The default assignee when creating issues for this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeType")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public Project avatarUrls(ProjectAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

  /**
   * Get avatarUrls
   * @return avatarUrls
  */
  @Valid 
  @Schema(name = "avatarUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrls")
  public ProjectAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(ProjectAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }

  public Project components(List<@Valid ProjectComponent> components) {
    this.components = components;
    return this;
  }

  public Project addComponentsItem(ProjectComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * List of the components contained in the project.
   * @return components
  */
  @Valid 
  @Schema(name = "components", accessMode = Schema.AccessMode.READ_ONLY, description = "List of the components contained in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("components")
  public List<@Valid ProjectComponent> getComponents() {
    return components;
  }

  public void setComponents(List<@Valid ProjectComponent> components) {
    this.components = components;
  }

  public Project deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Whether the project is marked as deleted.
   * @return deleted
  */
  
  @Schema(name = "deleted", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the project is marked as deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Project deletedBy(ProjectDeletedBy deletedBy) {
    this.deletedBy = deletedBy;
    return this;
  }

  /**
   * Get deletedBy
   * @return deletedBy
  */
  @Valid 
  @Schema(name = "deletedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedBy")
  public ProjectDeletedBy getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(ProjectDeletedBy deletedBy) {
    this.deletedBy = deletedBy;
  }

  public Project deletedDate(OffsetDateTime deletedDate) {
    this.deletedDate = deletedDate;
    return this;
  }

  /**
   * The date when the project was marked as deleted.
   * @return deletedDate
  */
  @Valid 
  @Schema(name = "deletedDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date when the project was marked as deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedDate")
  public OffsetDateTime getDeletedDate() {
    return deletedDate;
  }

  public void setDeletedDate(OffsetDateTime deletedDate) {
    this.deletedDate = deletedDate;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A brief description of the project.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "A brief description of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project email(String email) {
    this.email = email;
    return this;
  }

  /**
   * An email address associated with the project.
   * @return email
  */
  
  @Schema(name = "email", description = "An email address associated with the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Project expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional project details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional project details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public Project favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  /**
   * Whether the project is selected as a favorite.
   * @return favourite
  */
  
  @Schema(name = "favourite", description = "Whether the project is selected as a favorite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favourite")
  public Boolean getFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  public Project id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project insight(ProjectInsight insight) {
    this.insight = insight;
    return this;
  }

  /**
   * Get insight
   * @return insight
  */
  @Valid 
  @Schema(name = "insight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insight")
  public ProjectInsight getInsight() {
    return insight;
  }

  public void setInsight(ProjectInsight insight) {
    this.insight = insight;
  }

  public Project isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

  /**
   * Whether the project is private.
   * @return isPrivate
  */
  
  @Schema(name = "isPrivate", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the project is private.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPrivate")
  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public Project issueTypeHierarchy(ProjectIssueTypeHierarchy issueTypeHierarchy) {
    this.issueTypeHierarchy = issueTypeHierarchy;
    return this;
  }

  /**
   * Get issueTypeHierarchy
   * @return issueTypeHierarchy
  */
  @Valid 
  @Schema(name = "issueTypeHierarchy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeHierarchy")
  public ProjectIssueTypeHierarchy getIssueTypeHierarchy() {
    return issueTypeHierarchy;
  }

  public void setIssueTypeHierarchy(ProjectIssueTypeHierarchy issueTypeHierarchy) {
    this.issueTypeHierarchy = issueTypeHierarchy;
  }

  public Project issueTypes(List<@Valid IssueTypeDetails> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public Project addIssueTypesItem(IssueTypeDetails issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new ArrayList<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

  /**
   * List of the issue types available in the project.
   * @return issueTypes
  */
  @Valid 
  @Schema(name = "issueTypes", accessMode = Schema.AccessMode.READ_ONLY, description = "List of the issue types available in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypes")
  public List<@Valid IssueTypeDetails> getIssueTypes() {
    return issueTypes;
  }

  public void setIssueTypes(List<@Valid IssueTypeDetails> issueTypes) {
    this.issueTypes = issueTypes;
  }

  public Project key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the project.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Project landingPageInfo(ProjectLandingPageInfo landingPageInfo) {
    this.landingPageInfo = landingPageInfo;
    return this;
  }

  /**
   * Get landingPageInfo
   * @return landingPageInfo
  */
  @Valid 
  @Schema(name = "landingPageInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("landingPageInfo")
  public ProjectLandingPageInfo getLandingPageInfo() {
    return landingPageInfo;
  }

  public void setLandingPageInfo(ProjectLandingPageInfo landingPageInfo) {
    this.landingPageInfo = landingPageInfo;
  }

  public Project lead(ProjectLead lead) {
    this.lead = lead;
    return this;
  }

  /**
   * Get lead
   * @return lead
  */
  @Valid 
  @Schema(name = "lead", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead")
  public ProjectLead getLead() {
    return lead;
  }

  public void setLead(ProjectLead lead) {
    this.lead = lead;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project permissions(ProjectPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @Valid 
  @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public ProjectPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(ProjectPermissions permissions) {
    this.permissions = permissions;
  }

  public Project projectCategory(ProjectProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
    return this;
  }

  /**
   * Get projectCategory
   * @return projectCategory
  */
  @Valid 
  @Schema(name = "projectCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectCategory")
  public ProjectProjectCategory getProjectCategory() {
    return projectCategory;
  }

  public void setProjectCategory(ProjectProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
  }

  public Project projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  */
  
  @Schema(name = "projectTypeKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectTypeKey")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public Project properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Project putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Map of project properties
   * @return properties
  */
  
  @Schema(name = "properties", accessMode = Schema.AccessMode.READ_ONLY, description = "Map of project properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Project retentionTillDate(OffsetDateTime retentionTillDate) {
    this.retentionTillDate = retentionTillDate;
    return this;
  }

  /**
   * The date when the project is deleted permanently.
   * @return retentionTillDate
  */
  @Valid 
  @Schema(name = "retentionTillDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date when the project is deleted permanently.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionTillDate")
  public OffsetDateTime getRetentionTillDate() {
    return retentionTillDate;
  }

  public void setRetentionTillDate(OffsetDateTime retentionTillDate) {
    this.retentionTillDate = retentionTillDate;
  }

  public Project roles(Map<String, URI> roles) {
    this.roles = roles;
    return this;
  }

  public Project putRolesItem(String key, URI rolesItem) {
    if (this.roles == null) {
      this.roles = new HashMap<>();
    }
    this.roles.put(key, rolesItem);
    return this;
  }

  /**
   * The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
   * @return roles
  */
  @Valid 
  @Schema(name = "roles", accessMode = Schema.AccessMode.READ_ONLY, description = "The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public Map<String, URI> getRoles() {
    return roles;
  }

  public void setRoles(Map<String, URI> roles) {
    this.roles = roles;
  }

  public Project self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the project details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the project details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Project simplified(Boolean simplified) {
    this.simplified = simplified;
    return this;
  }

  /**
   * Whether the project is simplified.
   * @return simplified
  */
  
  @Schema(name = "simplified", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the project is simplified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("simplified")
  public Boolean getSimplified() {
    return simplified;
  }

  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }

  public Project style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * The type of the project.
   * @return style
  */
  
  @Schema(name = "style", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("style")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Project url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to information about this project, such as project documentation.
   * @return url
  */
  
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, description = "A link to information about this project, such as project documentation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Project uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Unique ID for next-gen projects.
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", accessMode = Schema.AccessMode.READ_ONLY, description = "Unique ID for next-gen projects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public Project versions(List<@Valid Version> versions) {
    this.versions = versions;
    return this;
  }

  public Project addVersionsItem(Version versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
   * @return versions
  */
  @Valid 
  @Schema(name = "versions", accessMode = Schema.AccessMode.READ_ONLY, description = "The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
  public List<@Valid Version> getVersions() {
    return versions;
  }

  public void setVersions(List<@Valid Version> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.archived, project.archived) &&
        Objects.equals(this.archivedBy, project.archivedBy) &&
        Objects.equals(this.archivedDate, project.archivedDate) &&
        Objects.equals(this.assigneeType, project.assigneeType) &&
        Objects.equals(this.avatarUrls, project.avatarUrls) &&
        Objects.equals(this.components, project.components) &&
        Objects.equals(this.deleted, project.deleted) &&
        Objects.equals(this.deletedBy, project.deletedBy) &&
        Objects.equals(this.deletedDate, project.deletedDate) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.email, project.email) &&
        Objects.equals(this.expand, project.expand) &&
        Objects.equals(this.favourite, project.favourite) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.insight, project.insight) &&
        Objects.equals(this.isPrivate, project.isPrivate) &&
        Objects.equals(this.issueTypeHierarchy, project.issueTypeHierarchy) &&
        Objects.equals(this.issueTypes, project.issueTypes) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.landingPageInfo, project.landingPageInfo) &&
        Objects.equals(this.lead, project.lead) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.permissions, project.permissions) &&
        Objects.equals(this.projectCategory, project.projectCategory) &&
        Objects.equals(this.projectTypeKey, project.projectTypeKey) &&
        Objects.equals(this.properties, project.properties) &&
        Objects.equals(this.retentionTillDate, project.retentionTillDate) &&
        Objects.equals(this.roles, project.roles) &&
        Objects.equals(this.self, project.self) &&
        Objects.equals(this.simplified, project.simplified) &&
        Objects.equals(this.style, project.style) &&
        Objects.equals(this.url, project.url) &&
        Objects.equals(this.uuid, project.uuid) &&
        Objects.equals(this.versions, project.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, archivedBy, archivedDate, assigneeType, avatarUrls, components, deleted, deletedBy, deletedDate, description, email, expand, favourite, id, insight, isPrivate, issueTypeHierarchy, issueTypes, key, landingPageInfo, lead, name, permissions, projectCategory, projectTypeKey, properties, retentionTillDate, roles, self, simplified, style, url, uuid, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    archivedBy: ").append(toIndentedString(archivedBy)).append("\n");
    sb.append("    archivedDate: ").append(toIndentedString(archivedDate)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedDate: ").append(toIndentedString(deletedDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insight: ").append(toIndentedString(insight)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    issueTypeHierarchy: ").append(toIndentedString(issueTypeHierarchy)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    landingPageInfo: ").append(toIndentedString(landingPageInfo)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    retentionTillDate: ").append(toIndentedString(retentionTillDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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


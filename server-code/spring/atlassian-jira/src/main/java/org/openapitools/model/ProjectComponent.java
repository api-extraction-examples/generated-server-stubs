package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.model.ProjectComponentAssignee;
import org.openapitools.model.ProjectComponentLead;
import org.openapitools.model.ProjectComponentRealAssignee;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a project component.
 */

@Schema(name = "ProjectComponent", description = "Details about a project component.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectComponent {

  private ProjectComponentAssignee assignee;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.
   */
  public enum AssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
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

  private String description;

  private String id;

  private Boolean isAssigneeTypeValid;

  private ProjectComponentLead lead;

  private String leadAccountId;

  private String leadUserName;

  private String name;

  private String project;

  private Long projectId;

  private ProjectComponentRealAssignee realAssignee;

  /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
   */
  public enum RealAssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    RealAssigneeTypeEnum(String value) {
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
    public static RealAssigneeTypeEnum fromValue(String value) {
      for (RealAssigneeTypeEnum b : RealAssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RealAssigneeTypeEnum realAssigneeType;

  private URI self;

  public ProjectComponent assignee(ProjectComponentAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public ProjectComponentAssignee getAssignee() {
    return assignee;
  }

  public void setAssignee(ProjectComponentAssignee assignee) {
    this.assignee = assignee;
  }

  public ProjectComponent assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.
   * @return assigneeType
  */
  
  @Schema(name = "assigneeType", description = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeType")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public ProjectComponent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the component. Optional when creating or updating a component.
   * @return description
  */
  
  @Schema(name = "description", description = "The description for the component. Optional when creating or updating a component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectComponent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the component.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The unique identifier for the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectComponent isAssigneeTypeValid(Boolean isAssigneeTypeValid) {
    this.isAssigneeTypeValid = isAssigneeTypeValid;
    return this;
  }

  /**
   * Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
   * @return isAssigneeTypeValid
  */
  
  @Schema(name = "isAssigneeTypeValid", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAssigneeTypeValid")
  public Boolean getIsAssigneeTypeValid() {
    return isAssigneeTypeValid;
  }

  public void setIsAssigneeTypeValid(Boolean isAssigneeTypeValid) {
    this.isAssigneeTypeValid = isAssigneeTypeValid;
  }

  public ProjectComponent lead(ProjectComponentLead lead) {
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
  public ProjectComponentLead getLead() {
    return lead;
  }

  public void setLead(ProjectComponentLead lead) {
    this.lead = lead;
  }

  public ProjectComponent leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

  /**
   * The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return leadAccountId
  */
  @Size(max = 128) 
  @Schema(name = "leadAccountId", description = "The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leadAccountId")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public ProjectComponent leadUserName(String leadUserName) {
    this.leadUserName = leadUserName;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return leadUserName
  */
  
  @Schema(name = "leadUserName", description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leadUserName")
  public String getLeadUserName() {
    return leadUserName;
  }

  public void setLeadUserName(String leadUserName) {
    this.leadUserName = leadUserName;
  }

  public ProjectComponent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
   * @return name
  */
  
  @Schema(name = "name", description = "The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectComponent project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The key of the project the component is assigned to. Required when creating a component. Can't be updated.
   * @return project
  */
  
  @Schema(name = "project", description = "The key of the project the component is assigned to. Required when creating a component. Can't be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ProjectComponent projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project the component is assigned to.
   * @return projectId
  */
  
  @Schema(name = "projectId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project the component is assigned to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ProjectComponent realAssignee(ProjectComponentRealAssignee realAssignee) {
    this.realAssignee = realAssignee;
    return this;
  }

  /**
   * Get realAssignee
   * @return realAssignee
  */
  @Valid 
  @Schema(name = "realAssignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realAssignee")
  public ProjectComponentRealAssignee getRealAssignee() {
    return realAssignee;
  }

  public void setRealAssignee(ProjectComponentRealAssignee realAssignee) {
    this.realAssignee = realAssignee;
  }

  public ProjectComponent realAssigneeType(RealAssigneeTypeEnum realAssigneeType) {
    this.realAssigneeType = realAssigneeType;
    return this;
  }

  /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.
   * @return realAssigneeType
  */
  
  @Schema(name = "realAssigneeType", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realAssigneeType")
  public RealAssigneeTypeEnum getRealAssigneeType() {
    return realAssigneeType;
  }

  public void setRealAssigneeType(RealAssigneeTypeEnum realAssigneeType) {
    this.realAssigneeType = realAssigneeType;
  }

  public ProjectComponent self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the component.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectComponent projectComponent = (ProjectComponent) o;
    return Objects.equals(this.assignee, projectComponent.assignee) &&
        Objects.equals(this.assigneeType, projectComponent.assigneeType) &&
        Objects.equals(this.description, projectComponent.description) &&
        Objects.equals(this.id, projectComponent.id) &&
        Objects.equals(this.isAssigneeTypeValid, projectComponent.isAssigneeTypeValid) &&
        Objects.equals(this.lead, projectComponent.lead) &&
        Objects.equals(this.leadAccountId, projectComponent.leadAccountId) &&
        Objects.equals(this.leadUserName, projectComponent.leadUserName) &&
        Objects.equals(this.name, projectComponent.name) &&
        Objects.equals(this.project, projectComponent.project) &&
        Objects.equals(this.projectId, projectComponent.projectId) &&
        Objects.equals(this.realAssignee, projectComponent.realAssignee) &&
        Objects.equals(this.realAssigneeType, projectComponent.realAssigneeType) &&
        Objects.equals(this.self, projectComponent.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assigneeType, description, id, isAssigneeTypeValid, lead, leadAccountId, leadUserName, name, project, projectId, realAssignee, realAssigneeType, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectComponent {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    leadUserName: ").append(toIndentedString(leadUserName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    realAssignee: ").append(toIndentedString(realAssignee)).append("\n");
    sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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


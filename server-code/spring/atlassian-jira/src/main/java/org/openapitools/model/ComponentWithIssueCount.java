package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a component with a count of the issues it contains.
 */

@Schema(name = "ComponentWithIssueCount", description = "Details about a component with a count of the issues it contains.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ComponentWithIssueCount {

  private User assignee;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
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

  private Long issueCount;

  private User lead;

  private String name;

  private String project;

  private Long projectId;

  private User realAssignee;

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

  public ComponentWithIssueCount assignee(User assignee) {
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
  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }

  public ComponentWithIssueCount assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
   * @return assigneeType
  */
  
  @Schema(name = "assigneeType", accessMode = Schema.AccessMode.READ_ONLY, description = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigneeType")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public ComponentWithIssueCount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the component.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description for the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComponentWithIssueCount id(String id) {
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

  public ComponentWithIssueCount isAssigneeTypeValid(Boolean isAssigneeTypeValid) {
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

  public ComponentWithIssueCount issueCount(Long issueCount) {
    this.issueCount = issueCount;
    return this;
  }

  /**
   * Count of issues for the component.
   * @return issueCount
  */
  
  @Schema(name = "issueCount", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues for the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueCount")
  public Long getIssueCount() {
    return issueCount;
  }

  public void setIssueCount(Long issueCount) {
    this.issueCount = issueCount;
  }

  public ComponentWithIssueCount lead(User lead) {
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
  public User getLead() {
    return lead;
  }

  public void setLead(User lead) {
    this.lead = lead;
  }

  public ComponentWithIssueCount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for the component.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name for the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentWithIssueCount project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The key of the project to which the component is assigned.
   * @return project
  */
  
  @Schema(name = "project", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project to which the component is assigned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ComponentWithIssueCount projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Not used.
   * @return projectId
  */
  
  @Schema(name = "projectId", accessMode = Schema.AccessMode.READ_ONLY, description = "Not used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ComponentWithIssueCount realAssignee(User realAssignee) {
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
  public User getRealAssignee() {
    return realAssignee;
  }

  public void setRealAssignee(User realAssignee) {
    this.realAssignee = realAssignee;
  }

  public ComponentWithIssueCount realAssigneeType(RealAssigneeTypeEnum realAssigneeType) {
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

  public ComponentWithIssueCount self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL for this count of the issues contained in the component.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL for this count of the issues contained in the component.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ComponentWithIssueCount componentWithIssueCount = (ComponentWithIssueCount) o;
    return Objects.equals(this.assignee, componentWithIssueCount.assignee) &&
        Objects.equals(this.assigneeType, componentWithIssueCount.assigneeType) &&
        Objects.equals(this.description, componentWithIssueCount.description) &&
        Objects.equals(this.id, componentWithIssueCount.id) &&
        Objects.equals(this.isAssigneeTypeValid, componentWithIssueCount.isAssigneeTypeValid) &&
        Objects.equals(this.issueCount, componentWithIssueCount.issueCount) &&
        Objects.equals(this.lead, componentWithIssueCount.lead) &&
        Objects.equals(this.name, componentWithIssueCount.name) &&
        Objects.equals(this.project, componentWithIssueCount.project) &&
        Objects.equals(this.projectId, componentWithIssueCount.projectId) &&
        Objects.equals(this.realAssignee, componentWithIssueCount.realAssignee) &&
        Objects.equals(this.realAssigneeType, componentWithIssueCount.realAssigneeType) &&
        Objects.equals(this.self, componentWithIssueCount.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, assigneeType, description, id, isAssigneeTypeValid, issueCount, lead, name, project, projectId, realAssignee, realAssigneeType, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentWithIssueCount {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
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


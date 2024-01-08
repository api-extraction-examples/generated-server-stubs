package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectCompact;
import org.openapitools.model.ProjectTemplateCompact;
import org.openapitools.model.TaskCompact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JobCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class JobCompact {

  private String gid;

  private String resourceType;

  private ProjectCompact newProject;

  private ProjectTemplateCompact newProjectTemplate;

  private TaskCompact newTask;

  private String resourceSubtype;

  /**
   * The current status of this job. The value is one of: `not_started`, `in_progress`, `succeeded`, or `failed`.
   */
  public enum StatusEnum {
    NOT_STARTED("not_started"),
    
    IN_PROGRESS("in_progress"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  public JobCompact gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public JobCompact resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public JobCompact newProject(ProjectCompact newProject) {
    this.newProject = newProject;
    return this;
  }

  /**
   * Get newProject
   * @return newProject
  */
  @Valid 
  @Schema(name = "new_project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_project")
  public ProjectCompact getNewProject() {
    return newProject;
  }

  public void setNewProject(ProjectCompact newProject) {
    this.newProject = newProject;
  }

  public JobCompact newProjectTemplate(ProjectTemplateCompact newProjectTemplate) {
    this.newProjectTemplate = newProjectTemplate;
    return this;
  }

  /**
   * Get newProjectTemplate
   * @return newProjectTemplate
  */
  @Valid 
  @Schema(name = "new_project_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_project_template")
  public ProjectTemplateCompact getNewProjectTemplate() {
    return newProjectTemplate;
  }

  public void setNewProjectTemplate(ProjectTemplateCompact newProjectTemplate) {
    this.newProjectTemplate = newProjectTemplate;
  }

  public JobCompact newTask(TaskCompact newTask) {
    this.newTask = newTask;
    return this;
  }

  /**
   * Get newTask
   * @return newTask
  */
  @Valid 
  @Schema(name = "new_task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_task")
  public TaskCompact getNewTask() {
    return newTask;
  }

  public void setNewTask(TaskCompact newTask) {
    this.newTask = newTask;
  }

  public JobCompact resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "duplicate_task", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public JobCompact status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of this job. The value is one of: `not_started`, `in_progress`, `succeeded`, or `failed`.
   * @return status
  */
  
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "in_progress", description = "The current status of this job. The value is one of: `not_started`, `in_progress`, `succeeded`, or `failed`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCompact jobCompact = (JobCompact) o;
    return Objects.equals(this.gid, jobCompact.gid) &&
        Objects.equals(this.resourceType, jobCompact.resourceType) &&
        Objects.equals(this.newProject, jobCompact.newProject) &&
        Objects.equals(this.newProjectTemplate, jobCompact.newProjectTemplate) &&
        Objects.equals(this.newTask, jobCompact.newTask) &&
        Objects.equals(this.resourceSubtype, jobCompact.resourceSubtype) &&
        Objects.equals(this.status, jobCompact.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, newProject, newProjectTemplate, newTask, resourceSubtype, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    newProject: ").append(toIndentedString(newProject)).append("\n");
    sb.append("    newProjectTemplate: ").append(toIndentedString(newProjectTemplate)).append("\n");
    sb.append("    newTask: ").append(toIndentedString(newTask)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


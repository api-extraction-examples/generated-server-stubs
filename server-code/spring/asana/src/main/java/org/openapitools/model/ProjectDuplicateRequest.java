package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectDuplicateRequestScheduleDates;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectDuplicateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectDuplicateRequest {

  /**
   * The elements that will be duplicated to the new project. Tasks are always included.
   */
  public enum IncludeEnum {
    MEMBERS("members"),
    
    NOTES("notes"),
    
    FORMS("forms"),
    
    TASK_NOTES("task_notes"),
    
    TASK_ASSIGNEE("task_assignee"),
    
    TASK_SUBTASKS("task_subtasks"),
    
    TASK_ATTACHMENTS("task_attachments"),
    
    TASK_DATES("task_dates"),
    
    TASK_DEPENDENCIES("task_dependencies"),
    
    TASK_FOLLOWERS("task_followers"),
    
    TASK_TAGS("task_tags"),
    
    TASK_PROJECTS("task_projects");

    private String value;

    IncludeEnum(String value) {
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
    public static IncludeEnum fromValue(String value) {
      for (IncludeEnum b : IncludeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IncludeEnum include;

  private String name;

  private ProjectDuplicateRequestScheduleDates scheduleDates;

  private String team;

  public ProjectDuplicateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectDuplicateRequest(String name) {
    this.name = name;
  }

  public ProjectDuplicateRequest include(IncludeEnum include) {
    this.include = include;
    return this;
  }

  /**
   * The elements that will be duplicated to the new project. Tasks are always included.
   * @return include
  */
  
  @Schema(name = "include", example = "[\"members\",\"task_notes\"]", description = "The elements that will be duplicated to the new project. Tasks are always included.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include")
  public IncludeEnum getInclude() {
    return include;
  }

  public void setInclude(IncludeEnum include) {
    this.include = include;
  }

  public ProjectDuplicateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new project.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "New Project Name", description = "The name of the new project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDuplicateRequest scheduleDates(ProjectDuplicateRequestScheduleDates scheduleDates) {
    this.scheduleDates = scheduleDates;
    return this;
  }

  /**
   * Get scheduleDates
   * @return scheduleDates
  */
  @Valid 
  @Schema(name = "schedule_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_dates")
  public ProjectDuplicateRequestScheduleDates getScheduleDates() {
    return scheduleDates;
  }

  public void setScheduleDates(ProjectDuplicateRequestScheduleDates scheduleDates) {
    this.scheduleDates = scheduleDates;
  }

  public ProjectDuplicateRequest team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.
   * @return team
  */
  
  @Schema(name = "team", example = "12345", description = "Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDuplicateRequest projectDuplicateRequest = (ProjectDuplicateRequest) o;
    return Objects.equals(this.include, projectDuplicateRequest.include) &&
        Objects.equals(this.name, projectDuplicateRequest.name) &&
        Objects.equals(this.scheduleDates, projectDuplicateRequest.scheduleDates) &&
        Objects.equals(this.team, projectDuplicateRequest.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, name, scheduleDates, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDuplicateRequest {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleDates: ").append(toIndentedString(scheduleDates)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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


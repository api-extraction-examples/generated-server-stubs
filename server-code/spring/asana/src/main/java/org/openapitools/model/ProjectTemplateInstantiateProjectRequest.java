package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DateVariableRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectTemplateInstantiateProjectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectTemplateInstantiateProjectRequest {

  private Boolean isStrict;

  private String name;

  private Boolean _public;

  @Valid
  private List<@Valid DateVariableRequest> requestedDates;

  private String team;

  private String workspace;

  public ProjectTemplateInstantiateProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectTemplateInstantiateProjectRequest(String name, Boolean _public) {
    this.name = name;
    this._public = _public;
  }

  public ProjectTemplateInstantiateProjectRequest isStrict(Boolean isStrict) {
    this.isStrict = isStrict;
    return this;
  }

  /**
   * *Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).
   * @return isStrict
  */
  
  @Schema(name = "is_strict", example = "true", description = "*Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_strict")
  public Boolean getIsStrict() {
    return isStrict;
  }

  public void setIsStrict(Boolean isStrict) {
    this.isStrict = isStrict;
  }

  public ProjectTemplateInstantiateProjectRequest name(String name) {
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

  public ProjectTemplateInstantiateProjectRequest _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Sets the project to public to its team.
   * @return _public
  */
  @NotNull 
  @Schema(name = "public", example = "true", description = "Sets the project to public to its team.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public ProjectTemplateInstantiateProjectRequest requestedDates(List<@Valid DateVariableRequest> requestedDates) {
    this.requestedDates = requestedDates;
    return this;
  }

  public ProjectTemplateInstantiateProjectRequest addRequestedDatesItem(DateVariableRequest requestedDatesItem) {
    if (this.requestedDates == null) {
      this.requestedDates = new ArrayList<>();
    }
    this.requestedDates.add(requestedDatesItem);
    return this;
  }

  /**
   * Array of mappings of date variables to calendar dates.
   * @return requestedDates
  */
  @Valid 
  @Schema(name = "requested_dates", description = "Array of mappings of date variables to calendar dates.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_dates")
  public List<@Valid DateVariableRequest> getRequestedDates() {
    return requestedDates;
  }

  public void setRequestedDates(List<@Valid DateVariableRequest> requestedDates) {
    this.requestedDates = requestedDates;
  }

  public ProjectTemplateInstantiateProjectRequest team(String team) {
    this.team = team;
    return this;
  }

  /**
   * *Conditional*. Sets the team of the new project. If the project template exists in an _organization_, you must specify a value for `team` and not `workspace`.
   * @return team
  */
  
  @Schema(name = "team", example = "12345", description = "*Conditional*. Sets the team of the new project. If the project template exists in an _organization_, you must specify a value for `team` and not `workspace`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public ProjectTemplateInstantiateProjectRequest workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * *Conditional*. Sets the workspace of the new project. If the project template exists in a _workspace_, you must specify a value for `workspace` and not `team`.
   * @return workspace
  */
  
  @Schema(name = "workspace", example = "12345", description = "*Conditional*. Sets the workspace of the new project. If the project template exists in a _workspace_, you must specify a value for `workspace` and not `team`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTemplateInstantiateProjectRequest projectTemplateInstantiateProjectRequest = (ProjectTemplateInstantiateProjectRequest) o;
    return Objects.equals(this.isStrict, projectTemplateInstantiateProjectRequest.isStrict) &&
        Objects.equals(this.name, projectTemplateInstantiateProjectRequest.name) &&
        Objects.equals(this._public, projectTemplateInstantiateProjectRequest._public) &&
        Objects.equals(this.requestedDates, projectTemplateInstantiateProjectRequest.requestedDates) &&
        Objects.equals(this.team, projectTemplateInstantiateProjectRequest.team) &&
        Objects.equals(this.workspace, projectTemplateInstantiateProjectRequest.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isStrict, name, _public, requestedDates, team, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTemplateInstantiateProjectRequest {\n");
    sb.append("    isStrict: ").append(toIndentedString(isStrict)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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


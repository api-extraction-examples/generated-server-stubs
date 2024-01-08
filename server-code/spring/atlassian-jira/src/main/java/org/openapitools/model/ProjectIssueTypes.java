package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ProjectId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Projects and issue types where the status is used. Only available if the &#x60;usages&#x60; expand is requested.
 */

@Schema(name = "ProjectIssueTypes", description = "Projects and issue types where the status is used. Only available if the `usages` expand is requested.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIssueTypes {

  @Valid
  private Set<String> issueTypes;

  private ProjectId project;

  public ProjectIssueTypes issueTypes(Set<String> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public ProjectIssueTypes addIssueTypesItem(String issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new LinkedHashSet<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

  /**
   * IDs of the issue types
   * @return issueTypes
  */
  
  @Schema(name = "issueTypes", description = "IDs of the issue types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypes")
  public Set<String> getIssueTypes() {
    return issueTypes;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setIssueTypes(Set<String> issueTypes) {
    this.issueTypes = issueTypes;
  }

  public ProjectIssueTypes project(ProjectId project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public ProjectId getProject() {
    return project;
  }

  public void setProject(ProjectId project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypes projectIssueTypes = (ProjectIssueTypes) o;
    return Objects.equals(this.issueTypes, projectIssueTypes.issueTypes) &&
        Objects.equals(this.project, projectIssueTypes.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypes, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypes {\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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


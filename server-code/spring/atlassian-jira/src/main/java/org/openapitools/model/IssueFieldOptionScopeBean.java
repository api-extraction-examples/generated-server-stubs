package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.GlobalScopeBean;
import org.openapitools.model.ProjectScopeBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IssueFieldOptionScopeBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFieldOptionScopeBean {

  private GlobalScopeBean global;

  @Valid
  private Set<Long> projects;

  @Valid
  private Set<@Valid ProjectScopeBean> projects2;

  public IssueFieldOptionScopeBean global(GlobalScopeBean global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
  */
  @Valid 
  @Schema(name = "global", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("global")
  public GlobalScopeBean getGlobal() {
    return global;
  }

  public void setGlobal(GlobalScopeBean global) {
    this.global = global;
  }

  public IssueFieldOptionScopeBean projects(Set<Long> projects) {
    this.projects = projects;
    return this;
  }

  public IssueFieldOptionScopeBean addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new LinkedHashSet<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * DEPRECATED
   * @return projects
  */
  
  @Schema(name = "projects", description = "DEPRECATED", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public Set<Long> getProjects() {
    return projects;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjects(Set<Long> projects) {
    this.projects = projects;
  }

  public IssueFieldOptionScopeBean projects2(Set<@Valid ProjectScopeBean> projects2) {
    this.projects2 = projects2;
    return this;
  }

  public IssueFieldOptionScopeBean addProjects2Item(ProjectScopeBean projects2Item) {
    if (this.projects2 == null) {
      this.projects2 = new LinkedHashSet<>();
    }
    this.projects2.add(projects2Item);
    return this;
  }

  /**
   * Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
   * @return projects2
  */
  @Valid 
  @Schema(name = "projects2", description = "Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects2")
  public Set<@Valid ProjectScopeBean> getProjects2() {
    return projects2;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjects2(Set<@Valid ProjectScopeBean> projects2) {
    this.projects2 = projects2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionScopeBean issueFieldOptionScopeBean = (IssueFieldOptionScopeBean) o;
    return Objects.equals(this.global, issueFieldOptionScopeBean.global) &&
        Objects.equals(this.projects, issueFieldOptionScopeBean.projects) &&
        Objects.equals(this.projects2, issueFieldOptionScopeBean.projects2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, projects, projects2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionScopeBean {\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    projects2: ").append(toIndentedString(projects2)).append("\n");
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


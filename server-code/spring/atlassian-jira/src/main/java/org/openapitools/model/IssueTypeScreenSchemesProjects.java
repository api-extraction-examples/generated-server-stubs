package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTypeScreenScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Issue type screen scheme with a list of the projects that use it.
 */

@Schema(name = "IssueTypeScreenSchemesProjects", description = "Issue type screen scheme with a list of the projects that use it.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemesProjects {

  private IssueTypeScreenScheme issueTypeScreenScheme;

  @Valid
  private List<String> projectIds = new ArrayList<>();

  public IssueTypeScreenSchemesProjects() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeScreenSchemesProjects(IssueTypeScreenScheme issueTypeScreenScheme, List<String> projectIds) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
    this.projectIds = projectIds;
  }

  public IssueTypeScreenSchemesProjects issueTypeScreenScheme(IssueTypeScreenScheme issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
    return this;
  }

  /**
   * Get issueTypeScreenScheme
   * @return issueTypeScreenScheme
  */
  @NotNull @Valid 
  @Schema(name = "issueTypeScreenScheme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeScreenScheme")
  public IssueTypeScreenScheme getIssueTypeScreenScheme() {
    return issueTypeScreenScheme;
  }

  public void setIssueTypeScreenScheme(IssueTypeScreenScheme issueTypeScreenScheme) {
    this.issueTypeScreenScheme = issueTypeScreenScheme;
  }

  public IssueTypeScreenSchemesProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeScreenSchemesProjects addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The IDs of the projects using the issue type screen scheme.
   * @return projectIds
  */
  @NotNull 
  @Schema(name = "projectIds", description = "The IDs of the projects using the issue type screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectIds")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemesProjects issueTypeScreenSchemesProjects = (IssueTypeScreenSchemesProjects) o;
    return Objects.equals(this.issueTypeScreenScheme, issueTypeScreenSchemesProjects.issueTypeScreenScheme) &&
        Objects.equals(this.projectIds, issueTypeScreenSchemesProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemesProjects {\n");
    sb.append("    issueTypeScreenScheme: ").append(toIndentedString(issueTypeScreenScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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


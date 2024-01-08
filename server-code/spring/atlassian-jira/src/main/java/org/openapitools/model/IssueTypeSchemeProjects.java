package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTypeScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Issue type scheme with a list of the projects that use it.
 */

@Schema(name = "IssueTypeSchemeProjects", description = "Issue type scheme with a list of the projects that use it.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeProjects {

  private IssueTypeScheme issueTypeScheme;

  @Valid
  private List<String> projectIds = new ArrayList<>();

  public IssueTypeSchemeProjects() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeSchemeProjects(IssueTypeScheme issueTypeScheme, List<String> projectIds) {
    this.issueTypeScheme = issueTypeScheme;
    this.projectIds = projectIds;
  }

  public IssueTypeSchemeProjects issueTypeScheme(IssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

  /**
   * Get issueTypeScheme
   * @return issueTypeScheme
  */
  @NotNull @Valid 
  @Schema(name = "issueTypeScheme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeScheme")
  public IssueTypeScheme getIssueTypeScheme() {
    return issueTypeScheme;
  }

  public void setIssueTypeScheme(IssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }

  public IssueTypeSchemeProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeSchemeProjects addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The IDs of the projects using the issue type scheme.
   * @return projectIds
  */
  @NotNull 
  @Schema(name = "projectIds", description = "The IDs of the projects using the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    IssueTypeSchemeProjects issueTypeSchemeProjects = (IssueTypeSchemeProjects) o;
    return Objects.equals(this.issueTypeScheme, issueTypeSchemeProjects.issueTypeScheme) &&
        Objects.equals(this.projectIds, issueTypeSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjects {\n");
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
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


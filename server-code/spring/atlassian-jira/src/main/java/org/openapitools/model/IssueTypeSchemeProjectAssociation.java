package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the association between an issue type scheme and project.
 */

@Schema(name = "IssueTypeSchemeProjectAssociation", description = "Details of the association between an issue type scheme and project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeSchemeProjectAssociation {

  private String issueTypeSchemeId;

  private String projectId;

  public IssueTypeSchemeProjectAssociation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeSchemeProjectAssociation(String issueTypeSchemeId, String projectId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
    this.projectId = projectId;
  }

  public IssueTypeSchemeProjectAssociation issueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
    return this;
  }

  /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  */
  @NotNull 
  @Schema(name = "issueTypeSchemeId", description = "The ID of the issue type scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeSchemeId")
  public String getIssueTypeSchemeId() {
    return issueTypeSchemeId;
  }

  public void setIssueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
  }

  public IssueTypeSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  @NotNull 
  @Schema(name = "projectId", description = "The ID of the project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation = (IssueTypeSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeProjectAssociation.issueTypeSchemeId) &&
        Objects.equals(this.projectId, issueTypeSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjectAssociation {\n");
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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


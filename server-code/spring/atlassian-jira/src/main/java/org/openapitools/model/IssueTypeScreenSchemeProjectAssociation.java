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
 * Associated issue type screen scheme and project.
 */

@Schema(name = "IssueTypeScreenSchemeProjectAssociation", description = "Associated issue type screen scheme and project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeScreenSchemeProjectAssociation {

  private String issueTypeScreenSchemeId;

  private String projectId;

  public IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

  /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  */
  
  @Schema(name = "issueTypeScreenSchemeId", description = "The ID of the issue type screen scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeScreenSchemeId")
  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }

  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }

  public IssueTypeScreenSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  
  @Schema(name = "projectId", description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation = (IssueTypeScreenSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeProjectAssociation.issueTypeScreenSchemeId) &&
        Objects.equals(this.projectId, issueTypeScreenSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeProjectAssociation {\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
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


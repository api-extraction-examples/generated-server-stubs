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
 * The project and issue type mapping with a matching custom field context.
 */

@Schema(name = "ContextForProjectAndIssueType", description = "The project and issue type mapping with a matching custom field context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ContextForProjectAndIssueType {

  private String contextId;

  private String issueTypeId;

  private String projectId;

  public ContextForProjectAndIssueType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContextForProjectAndIssueType(String contextId, String issueTypeId, String projectId) {
    this.contextId = contextId;
    this.issueTypeId = issueTypeId;
    this.projectId = projectId;
  }

  public ContextForProjectAndIssueType contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the custom field context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the custom field context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public ContextForProjectAndIssueType issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public ContextForProjectAndIssueType projectId(String projectId) {
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
    ContextForProjectAndIssueType contextForProjectAndIssueType = (ContextForProjectAndIssueType) o;
    return Objects.equals(this.contextId, contextForProjectAndIssueType.contextId) &&
        Objects.equals(this.issueTypeId, contextForProjectAndIssueType.issueTypeId) &&
        Objects.equals(this.projectId, contextForProjectAndIssueType.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, issueTypeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextForProjectAndIssueType {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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


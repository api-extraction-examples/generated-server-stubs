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
 * The details of a UI modification&#39;s context, which define where to activate the UI modification.
 */

@Schema(name = "UiModificationContextDetails", description = "The details of a UI modification's context, which define where to activate the UI modification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UiModificationContextDetails {

  private String id;

  private Boolean isAvailable;

  private String issueTypeId;

  private String projectId;

  private String viewType;

  public UiModificationContextDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UiModificationContextDetails(String issueTypeId, String projectId, String viewType) {
    this.issueTypeId = issueTypeId;
    this.projectId = projectId;
    this.viewType = viewType;
  }

  public UiModificationContextDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the UI modification context.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the UI modification context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UiModificationContextDetails isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Whether a context is available. For example, when a project is deleted the context becomes unavailable.
   * @return isAvailable
  */
  
  @Schema(name = "isAvailable", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether a context is available. For example, when a project is deleted the context becomes unavailable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAvailable")
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public UiModificationContextDetails issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The issue type ID of the context.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The issue type ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public UiModificationContextDetails projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The project ID of the context.
   * @return projectId
  */
  @NotNull 
  @Schema(name = "projectId", description = "The project ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public UiModificationContextDetails viewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

  /**
   * The view type of the context. Only `GIC` (Global Issue Create) is supported.
   * @return viewType
  */
  @NotNull 
  @Schema(name = "viewType", description = "The view type of the context. Only `GIC` (Global Issue Create) is supported.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("viewType")
  public String getViewType() {
    return viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiModificationContextDetails uiModificationContextDetails = (UiModificationContextDetails) o;
    return Objects.equals(this.id, uiModificationContextDetails.id) &&
        Objects.equals(this.isAvailable, uiModificationContextDetails.isAvailable) &&
        Objects.equals(this.issueTypeId, uiModificationContextDetails.issueTypeId) &&
        Objects.equals(this.projectId, uiModificationContextDetails.projectId) &&
        Objects.equals(this.viewType, uiModificationContextDetails.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isAvailable, issueTypeId, projectId, viewType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiModificationContextDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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


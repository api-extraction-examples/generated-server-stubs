package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SimpleLink;
import org.openapitools.model.VersionIssuesStatusForFixVersion;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a project version.
 */

@Schema(name = "Version", description = "Details about a project version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Version {

  private Boolean archived;

  private String description;

  private String expand;

  private String id;

  private VersionIssuesStatusForFixVersion issuesStatusForFixVersion;

  private URI moveUnfixedIssuesTo;

  private String name;

  @Valid
  private List<@Valid SimpleLink> operations;

  private Boolean overdue;

  private String project;

  private Long projectId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate releaseDate;

  private Boolean released;

  private URI self;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate startDate;

  private String userReleaseDate;

  private String userStartDate;

  public Version archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Indicates that the version is archived. Optional when creating or updating a version.
   * @return archived
  */
  
  @Schema(name = "archived", description = "Indicates that the version is archived. Optional when creating or updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Version description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the version. Optional when creating or updating a version.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the version. Optional when creating or updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Version expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.
   * @return expand
  */
  
  @Schema(name = "expand", description = "Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public Version id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the version.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Version issuesStatusForFixVersion(VersionIssuesStatusForFixVersion issuesStatusForFixVersion) {
    this.issuesStatusForFixVersion = issuesStatusForFixVersion;
    return this;
  }

  /**
   * Get issuesStatusForFixVersion
   * @return issuesStatusForFixVersion
  */
  @Valid 
  @Schema(name = "issuesStatusForFixVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuesStatusForFixVersion")
  public VersionIssuesStatusForFixVersion getIssuesStatusForFixVersion() {
    return issuesStatusForFixVersion;
  }

  public void setIssuesStatusForFixVersion(VersionIssuesStatusForFixVersion issuesStatusForFixVersion) {
    this.issuesStatusForFixVersion = issuesStatusForFixVersion;
  }

  public Version moveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
    return this;
  }

  /**
   * The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
   * @return moveUnfixedIssuesTo
  */
  @Valid 
  @Schema(name = "moveUnfixedIssuesTo", description = "The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moveUnfixedIssuesTo")
  public URI getMoveUnfixedIssuesTo() {
    return moveUnfixedIssuesTo;
  }

  public void setMoveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
  }

  public Version name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
   * @return name
  */
  
  @Schema(name = "name", description = "The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Version operations(List<@Valid SimpleLink> operations) {
    this.operations = operations;
    return this;
  }

  public Version addOperationsItem(SimpleLink operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * If the expand option `operations` is used, returns the list of operations available for this version.
   * @return operations
  */
  @Valid 
  @Schema(name = "operations", accessMode = Schema.AccessMode.READ_ONLY, description = "If the expand option `operations` is used, returns the list of operations available for this version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operations")
  public List<@Valid SimpleLink> getOperations() {
    return operations;
  }

  public void setOperations(List<@Valid SimpleLink> operations) {
    this.operations = operations;
  }

  public Version overdue(Boolean overdue) {
    this.overdue = overdue;
    return this;
  }

  /**
   * Indicates that the version is overdue.
   * @return overdue
  */
  
  @Schema(name = "overdue", accessMode = Schema.AccessMode.READ_ONLY, description = "Indicates that the version is overdue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overdue")
  public Boolean getOverdue() {
    return overdue;
  }

  public void setOverdue(Boolean overdue) {
    this.overdue = overdue;
  }

  public Version project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Deprecated. Use `projectId`.
   * @return project
  */
  
  @Schema(name = "project", description = "Deprecated. Use `projectId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Version projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
   * @return projectId
  */
  
  @Schema(name = "projectId", description = "The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Version releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return releaseDate
  */
  @Valid 
  @Schema(name = "releaseDate", description = "The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Version released(Boolean released) {
    this.released = released;
    return this;
  }

  /**
   * Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
   * @return released
  */
  
  @Schema(name = "released", description = "Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("released")
  public Boolean getReleased() {
    return released;
  }

  public void setReleased(Boolean released) {
    this.released = released;
  }

  public Version self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the version.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Version startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", description = "The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Version userReleaseDate(String userReleaseDate) {
    this.userReleaseDate = userReleaseDate;
    return this;
  }

  /**
   * The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.
   * @return userReleaseDate
  */
  
  @Schema(name = "userReleaseDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userReleaseDate")
  public String getUserReleaseDate() {
    return userReleaseDate;
  }

  public void setUserReleaseDate(String userReleaseDate) {
    this.userReleaseDate = userReleaseDate;
  }

  public Version userStartDate(String userStartDate) {
    this.userStartDate = userStartDate;
    return this;
  }

  /**
   * The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.
   * @return userStartDate
  */
  
  @Schema(name = "userStartDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userStartDate")
  public String getUserStartDate() {
    return userStartDate;
  }

  public void setUserStartDate(String userStartDate) {
    this.userStartDate = userStartDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.archived, version.archived) &&
        Objects.equals(this.description, version.description) &&
        Objects.equals(this.expand, version.expand) &&
        Objects.equals(this.id, version.id) &&
        Objects.equals(this.issuesStatusForFixVersion, version.issuesStatusForFixVersion) &&
        Objects.equals(this.moveUnfixedIssuesTo, version.moveUnfixedIssuesTo) &&
        Objects.equals(this.name, version.name) &&
        Objects.equals(this.operations, version.operations) &&
        Objects.equals(this.overdue, version.overdue) &&
        Objects.equals(this.project, version.project) &&
        Objects.equals(this.projectId, version.projectId) &&
        Objects.equals(this.releaseDate, version.releaseDate) &&
        Objects.equals(this.released, version.released) &&
        Objects.equals(this.self, version.self) &&
        Objects.equals(this.startDate, version.startDate) &&
        Objects.equals(this.userReleaseDate, version.userReleaseDate) &&
        Objects.equals(this.userStartDate, version.userStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, description, expand, id, issuesStatusForFixVersion, moveUnfixedIssuesTo, name, operations, overdue, project, projectId, releaseDate, released, self, startDate, userReleaseDate, userStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuesStatusForFixVersion: ").append(toIndentedString(issuesStatusForFixVersion)).append("\n");
    sb.append("    moveUnfixedIssuesTo: ").append(toIndentedString(moveUnfixedIssuesTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    userReleaseDate: ").append(toIndentedString(userReleaseDate)).append("\n");
    sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
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


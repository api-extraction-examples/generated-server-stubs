package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of project IDs.
 */

@Schema(name = "ProjectIds", description = "A list of project IDs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIds {

  @Valid
  private List<String> projectIds = new ArrayList<>();

  public ProjectIds() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public ProjectIds projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public ProjectIds addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The IDs of projects.
   * @return projectIds
  */
  @NotNull 
  @Schema(name = "projectIds", description = "The IDs of projects.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ProjectIds projectIds = (ProjectIds) o;
    return Objects.equals(this.projectIds, projectIds.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIds {\n");
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


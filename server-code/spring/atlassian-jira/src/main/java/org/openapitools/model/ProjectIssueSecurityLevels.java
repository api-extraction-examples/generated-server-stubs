package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecurityLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of issue level security items in a project.
 */

@Schema(name = "ProjectIssueSecurityLevels", description = "List of issue level security items in a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIssueSecurityLevels {

  @Valid
  private List<@Valid SecurityLevel> levels = new ArrayList<>();

  public ProjectIssueSecurityLevels() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectIssueSecurityLevels(List<@Valid SecurityLevel> levels) {
    this.levels = levels;
  }

  public ProjectIssueSecurityLevels levels(List<@Valid SecurityLevel> levels) {
    this.levels = levels;
    return this;
  }

  public ProjectIssueSecurityLevels addLevelsItem(SecurityLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * Issue level security items list.
   * @return levels
  */
  @Valid 
  @Schema(name = "levels", accessMode = Schema.AccessMode.READ_ONLY, description = "Issue level security items list.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("levels")
  public List<@Valid SecurityLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid SecurityLevel> levels) {
    this.levels = levels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueSecurityLevels projectIssueSecurityLevels = (ProjectIssueSecurityLevels) o;
    return Objects.equals(this.levels, projectIssueSecurityLevels.levels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueSecurityLevels {\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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


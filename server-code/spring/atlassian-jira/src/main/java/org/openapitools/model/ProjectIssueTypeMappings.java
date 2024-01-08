package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProjectIssueTypeMapping;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The project and issue type mappings.
 */

@Schema(name = "ProjectIssueTypeMappings", description = "The project and issue type mappings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIssueTypeMappings {

  @Valid
  private List<@Valid ProjectIssueTypeMapping> mappings = new ArrayList<>();

  public ProjectIssueTypeMappings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectIssueTypeMappings(List<@Valid ProjectIssueTypeMapping> mappings) {
    this.mappings = mappings;
  }

  public ProjectIssueTypeMappings mappings(List<@Valid ProjectIssueTypeMapping> mappings) {
    this.mappings = mappings;
    return this;
  }

  public ProjectIssueTypeMappings addMappingsItem(ProjectIssueTypeMapping mappingsItem) {
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

  /**
   * The project and issue type mappings.
   * @return mappings
  */
  @NotNull @Valid 
  @Schema(name = "mappings", description = "The project and issue type mappings.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mappings")
  public List<@Valid ProjectIssueTypeMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<@Valid ProjectIssueTypeMapping> mappings) {
    this.mappings = mappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypeMappings projectIssueTypeMappings = (ProjectIssueTypeMappings) o;
    return Objects.equals(this.mappings, projectIssueTypeMappings.mappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypeMappings {\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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


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
 * Details of how to filter and list search auto complete information.
 */

@Schema(name = "SearchAutoCompleteFilter", description = "Details of how to filter and list search auto complete information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SearchAutoCompleteFilter {

  private Boolean includeCollapsedFields = false;

  @Valid
  private List<Long> projectIds;

  public SearchAutoCompleteFilter includeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
    return this;
  }

  /**
   * Include collapsed fields for fields that have non-unique names.
   * @return includeCollapsedFields
  */
  
  @Schema(name = "includeCollapsedFields", description = "Include collapsed fields for fields that have non-unique names.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeCollapsedFields")
  public Boolean getIncludeCollapsedFields() {
    return includeCollapsedFields;
  }

  public void setIncludeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
  }

  public SearchAutoCompleteFilter projectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public SearchAutoCompleteFilter addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * List of project IDs used to filter the visible field details returned.
   * @return projectIds
  */
  
  @Schema(name = "projectIds", description = "List of project IDs used to filter the visible field details returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectIds")
  public List<Long> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<Long> projectIds) {
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
    SearchAutoCompleteFilter searchAutoCompleteFilter = (SearchAutoCompleteFilter) o;
    return Objects.equals(this.includeCollapsedFields, searchAutoCompleteFilter.includeCollapsedFields) &&
        Objects.equals(this.projectIds, searchAutoCompleteFilter.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeCollapsedFields, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAutoCompleteFilter {\n");
    sb.append("    includeCollapsedFields: ").append(toIndentedString(includeCollapsedFields)).append("\n");
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


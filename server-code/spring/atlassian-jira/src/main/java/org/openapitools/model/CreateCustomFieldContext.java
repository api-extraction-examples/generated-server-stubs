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
 * The details of a created custom field context.
 */

@Schema(name = "CreateCustomFieldContext", description = "The details of a created custom field context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateCustomFieldContext {

  private String description;

  private String id;

  @Valid
  private List<String> issueTypeIds;

  private String name;

  @Valid
  private List<String> projectIds;

  public CreateCustomFieldContext() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateCustomFieldContext(String name) {
    this.name = name;
  }

  public CreateCustomFieldContext description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the context.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCustomFieldContext id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the context.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateCustomFieldContext issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public CreateCustomFieldContext addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
   * @return issueTypeIds
  */
  
  @Schema(name = "issueTypeIds", description = "The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeIds")
  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public CreateCustomFieldContext name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the context.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCustomFieldContext projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public CreateCustomFieldContext addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The list of project IDs associated with the context. If the list is empty, the context is global.
   * @return projectIds
  */
  
  @Schema(name = "projectIds", description = "The list of project IDs associated with the context. If the list is empty, the context is global.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CreateCustomFieldContext createCustomFieldContext = (CreateCustomFieldContext) o;
    return Objects.equals(this.description, createCustomFieldContext.description) &&
        Objects.equals(this.id, createCustomFieldContext.id) &&
        Objects.equals(this.issueTypeIds, createCustomFieldContext.issueTypeIds) &&
        Objects.equals(this.name, createCustomFieldContext.name) &&
        Objects.equals(this.projectIds, createCustomFieldContext.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, issueTypeIds, name, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomFieldContext {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


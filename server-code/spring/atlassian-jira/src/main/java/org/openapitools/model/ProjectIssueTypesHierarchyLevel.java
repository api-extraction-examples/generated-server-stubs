package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.model.IssueTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an issue type hierarchy level.
 */

@Schema(name = "ProjectIssueTypesHierarchyLevel", description = "Details of an issue type hierarchy level.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIssueTypesHierarchyLevel {

  private UUID entityId;

  @Valid
  private List<@Valid IssueTypeInfo> issueTypes;

  private Integer level;

  private String name;

  public ProjectIssueTypesHierarchyLevel entityId(UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return entityId
  */
  @Valid 
  @Schema(name = "entityId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }

  public ProjectIssueTypesHierarchyLevel issueTypes(List<@Valid IssueTypeInfo> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public ProjectIssueTypesHierarchyLevel addIssueTypesItem(IssueTypeInfo issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new ArrayList<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

  /**
   * The list of issue types in the hierarchy level.
   * @return issueTypes
  */
  @Valid 
  @Schema(name = "issueTypes", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of issue types in the hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypes")
  public List<@Valid IssueTypeInfo> getIssueTypes() {
    return issueTypes;
  }

  public void setIssueTypes(List<@Valid IssueTypeInfo> issueTypes) {
    this.issueTypes = issueTypes;
  }

  public ProjectIssueTypesHierarchyLevel level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * The level of the issue type hierarchy level.
   * @return level
  */
  
  @Schema(name = "level", accessMode = Schema.AccessMode.READ_ONLY, description = "The level of the issue type hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public ProjectIssueTypesHierarchyLevel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type hierarchy level.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue type hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypesHierarchyLevel projectIssueTypesHierarchyLevel = (ProjectIssueTypesHierarchyLevel) o;
    return Objects.equals(this.entityId, projectIssueTypesHierarchyLevel.entityId) &&
        Objects.equals(this.issueTypes, projectIssueTypesHierarchyLevel.issueTypes) &&
        Objects.equals(this.level, projectIssueTypesHierarchyLevel.level) &&
        Objects.equals(this.name, projectIssueTypesHierarchyLevel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, issueTypes, level, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypesHierarchyLevel {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


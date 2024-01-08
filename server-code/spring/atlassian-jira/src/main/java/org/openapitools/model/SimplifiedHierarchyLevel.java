package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SimplifiedHierarchyLevel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SimplifiedHierarchyLevel {

  private Long aboveLevelId;

  private Long belowLevelId;

  private UUID externalUuid;

  private Integer hierarchyLevelNumber;

  private Long id;

  @Valid
  private List<Long> issueTypeIds;

  private Integer level;

  private String name;

  private Long projectConfigurationId;

  public SimplifiedHierarchyLevel aboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
    return this;
  }

  /**
   * The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return aboveLevelId
  */
  
  @Schema(name = "aboveLevelId", description = "The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aboveLevelId")
  public Long getAboveLevelId() {
    return aboveLevelId;
  }

  public void setAboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
  }

  public SimplifiedHierarchyLevel belowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
    return this;
  }

  /**
   * The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return belowLevelId
  */
  
  @Schema(name = "belowLevelId", description = "The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("belowLevelId")
  public Long getBelowLevelId() {
    return belowLevelId;
  }

  public void setBelowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
  }

  public SimplifiedHierarchyLevel externalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
    return this;
  }

  /**
   * The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return externalUuid
  */
  @Valid 
  @Schema(name = "externalUuid", description = "The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalUuid")
  public UUID getExternalUuid() {
    return externalUuid;
  }

  public void setExternalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
  }

  public SimplifiedHierarchyLevel hierarchyLevelNumber(Integer hierarchyLevelNumber) {
    this.hierarchyLevelNumber = hierarchyLevelNumber;
    return this;
  }

  /**
   * Get hierarchyLevelNumber
   * @return hierarchyLevelNumber
  */
  
  @Schema(name = "hierarchyLevelNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchyLevelNumber")
  public Integer getHierarchyLevelNumber() {
    return hierarchyLevelNumber;
  }

  public void setHierarchyLevelNumber(Integer hierarchyLevelNumber) {
    this.hierarchyLevelNumber = hierarchyLevelNumber;
  }

  public SimplifiedHierarchyLevel id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SimplifiedHierarchyLevel issueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public SimplifiedHierarchyLevel addIssueTypeIdsItem(Long issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

  /**
   * The issue types available in this hierarchy level.
   * @return issueTypeIds
  */
  
  @Schema(name = "issueTypeIds", description = "The issue types available in this hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeIds")
  public List<Long> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public SimplifiedHierarchyLevel level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * The level of this item in the hierarchy.
   * @return level
  */
  
  @Schema(name = "level", description = "The level of this item in the hierarchy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public SimplifiedHierarchyLevel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this hierarchy level.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of this hierarchy level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SimplifiedHierarchyLevel projectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
    return this;
  }

  /**
   * The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
   * @return projectConfigurationId
  */
  
  @Schema(name = "projectConfigurationId", description = "The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectConfigurationId")
  public Long getProjectConfigurationId() {
    return projectConfigurationId;
  }

  public void setProjectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedHierarchyLevel simplifiedHierarchyLevel = (SimplifiedHierarchyLevel) o;
    return Objects.equals(this.aboveLevelId, simplifiedHierarchyLevel.aboveLevelId) &&
        Objects.equals(this.belowLevelId, simplifiedHierarchyLevel.belowLevelId) &&
        Objects.equals(this.externalUuid, simplifiedHierarchyLevel.externalUuid) &&
        Objects.equals(this.hierarchyLevelNumber, simplifiedHierarchyLevel.hierarchyLevelNumber) &&
        Objects.equals(this.id, simplifiedHierarchyLevel.id) &&
        Objects.equals(this.issueTypeIds, simplifiedHierarchyLevel.issueTypeIds) &&
        Objects.equals(this.level, simplifiedHierarchyLevel.level) &&
        Objects.equals(this.name, simplifiedHierarchyLevel.name) &&
        Objects.equals(this.projectConfigurationId, simplifiedHierarchyLevel.projectConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aboveLevelId, belowLevelId, externalUuid, hierarchyLevelNumber, id, issueTypeIds, level, name, projectConfigurationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedHierarchyLevel {\n");
    sb.append("    aboveLevelId: ").append(toIndentedString(aboveLevelId)).append("\n");
    sb.append("    belowLevelId: ").append(toIndentedString(belowLevelId)).append("\n");
    sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
    sb.append("    hierarchyLevelNumber: ").append(toIndentedString(hierarchyLevelNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectConfigurationId: ").append(toIndentedString(projectConfigurationId)).append("\n");
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


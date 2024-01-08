package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.model.IssueTypeDetailsScope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The type of the linked issue.
 */

@Schema(name = "Fields_issueType", description = "The type of the linked issue.")
@JsonTypeName("Fields_issueType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldsIssueType {

  private Long avatarId;

  private String description;

  private UUID entityId;

  private Integer hierarchyLevel;

  private String iconUrl;

  private String id;

  private String name;

  private IssueTypeDetailsScope scope;

  private String self;

  private Boolean subtask;

  public FieldsIssueType avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

  /**
   * The ID of the issue type's avatar.
   * @return avatarId
  */
  
  @Schema(name = "avatarId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type's avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarId")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public FieldsIssueType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue type.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldsIssueType entityId(UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Unique ID for next-gen projects.
   * @return entityId
  */
  @Valid 
  @Schema(name = "entityId", accessMode = Schema.AccessMode.READ_ONLY, description = "Unique ID for next-gen projects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }

  public FieldsIssueType hierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

  /**
   * Hierarchy level of the issue type.
   * @return hierarchyLevel
  */
  
  @Schema(name = "hierarchyLevel", accessMode = Schema.AccessMode.READ_ONLY, description = "Hierarchy level of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hierarchyLevel")
  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  public FieldsIssueType iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The URL of the issue type's avatar.
   * @return iconUrl
  */
  
  @Schema(name = "iconUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue type's avatar.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconUrl")
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public FieldsIssueType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldsIssueType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue type.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldsIssueType scope(IssueTypeDetailsScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public IssueTypeDetailsScope getScope() {
    return scope;
  }

  public void setScope(IssueTypeDetailsScope scope) {
    this.scope = scope;
  }

  public FieldsIssueType self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these issue type details.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these issue type details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public FieldsIssueType subtask(Boolean subtask) {
    this.subtask = subtask;
    return this;
  }

  /**
   * Whether this issue type is used to create subtasks.
   * @return subtask
  */
  
  @Schema(name = "subtask", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this issue type is used to create subtasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtask")
  public Boolean getSubtask() {
    return subtask;
  }

  public void setSubtask(Boolean subtask) {
    this.subtask = subtask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsIssueType fieldsIssueType = (FieldsIssueType) o;
    return Objects.equals(this.avatarId, fieldsIssueType.avatarId) &&
        Objects.equals(this.description, fieldsIssueType.description) &&
        Objects.equals(this.entityId, fieldsIssueType.entityId) &&
        Objects.equals(this.hierarchyLevel, fieldsIssueType.hierarchyLevel) &&
        Objects.equals(this.iconUrl, fieldsIssueType.iconUrl) &&
        Objects.equals(this.id, fieldsIssueType.id) &&
        Objects.equals(this.name, fieldsIssueType.name) &&
        Objects.equals(this.scope, fieldsIssueType.scope) &&
        Objects.equals(this.self, fieldsIssueType.self) &&
        Objects.equals(this.subtask, fieldsIssueType.subtask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarId, description, entityId, hierarchyLevel, iconUrl, id, name, scope, self, subtask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsIssueType {\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
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


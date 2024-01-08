package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * The default value for a Forge collection of groups custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeMultiGroupField", description = "The default value for a Forge collection of groups custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeMultiGroupField implements CustomFieldContextDefaultValue {

  private String contextId;

  @Valid
  private Set<String> groupIds = new LinkedHashSet<>();

  private String type;

  public CustomFieldContextDefaultValueForgeMultiGroupField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeMultiGroupField(String contextId, Set<String> groupIds, String type) {
    this.contextId = contextId;
    this.groupIds = groupIds;
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeMultiGroupField contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueForgeMultiGroupField groupIds(Set<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public CustomFieldContextDefaultValueForgeMultiGroupField addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new LinkedHashSet<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * The IDs of the default groups.
   * @return groupIds
  */
  @NotNull 
  @Schema(name = "groupIds", description = "The IDs of the default groups.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("groupIds")
  public Set<String> getGroupIds() {
    return groupIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGroupIds(Set<String> groupIds) {
    this.groupIds = groupIds;
  }

  public CustomFieldContextDefaultValueForgeMultiGroupField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeMultiGroupField customFieldContextDefaultValueForgeMultiGroupField = (CustomFieldContextDefaultValueForgeMultiGroupField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeMultiGroupField.contextId) &&
        Objects.equals(this.groupIds, customFieldContextDefaultValueForgeMultiGroupField.groupIds) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeMultiGroupField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, groupIds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeMultiGroupField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


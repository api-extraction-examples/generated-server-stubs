package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the group associated with the role.
 */

@Schema(name = "ProjectRoleGroup", description = "Details of the group associated with the role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectRoleGroup {

  private String displayName;

  private String groupId;

  private String name;

  public ProjectRoleGroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the group.
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "The display name of the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ProjectRoleGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The ID of the group.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The ID of the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ProjectRoleGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectRoleGroup projectRoleGroup = (ProjectRoleGroup) o;
    return Objects.equals(this.displayName, projectRoleGroup.displayName) &&
        Objects.equals(this.groupId, projectRoleGroup.groupId) &&
        Objects.equals(this.name, projectRoleGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, groupId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleGroup {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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


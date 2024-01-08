package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UserTaskListCompactAllOfOwner;
import org.openapitools.model.UserTaskListCompactAllOfWorkspace;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserTaskListCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class UserTaskListCompact {

  private String gid;

  private String resourceType;

  private String name;

  private UserTaskListCompactAllOfOwner owner;

  private UserTaskListCompactAllOfWorkspace workspace;

  public UserTaskListCompact gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public UserTaskListCompact resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public UserTaskListCompact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the user task list.
   * @return name
  */
  
  @Schema(name = "name", example = "My Tasks in My Workspace", description = "The name of the user task list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTaskListCompact owner(UserTaskListCompactAllOfOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public UserTaskListCompactAllOfOwner getOwner() {
    return owner;
  }

  public void setOwner(UserTaskListCompactAllOfOwner owner) {
    this.owner = owner;
  }

  public UserTaskListCompact workspace(UserTaskListCompactAllOfWorkspace workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
  */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public UserTaskListCompactAllOfWorkspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(UserTaskListCompactAllOfWorkspace workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaskListCompact userTaskListCompact = (UserTaskListCompact) o;
    return Objects.equals(this.gid, userTaskListCompact.gid) &&
        Objects.equals(this.resourceType, userTaskListCompact.resourceType) &&
        Objects.equals(this.name, userTaskListCompact.name) &&
        Objects.equals(this.owner, userTaskListCompact.owner) &&
        Objects.equals(this.workspace, userTaskListCompact.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, owner, workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskListCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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


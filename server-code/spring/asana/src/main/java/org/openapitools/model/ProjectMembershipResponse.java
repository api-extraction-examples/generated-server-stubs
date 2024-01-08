package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectCompact;
import org.openapitools.model.UserCompact;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectMembershipResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectMembershipResponse {

  private String gid;

  private String resourceType;

  private UserCompact user;

  private ProjectCompact project;

  /**
   * Whether the user has full access to the project or has comment-only access.
   */
  public enum WriteAccessEnum {
    FULL_WRITE("full_write"),
    
    COMMENT_ONLY("comment_only");

    private String value;

    WriteAccessEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WriteAccessEnum fromValue(String value) {
      for (WriteAccessEnum b : WriteAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private WriteAccessEnum writeAccess;

  public ProjectMembershipResponse gid(String gid) {
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

  public ProjectMembershipResponse resourceType(String resourceType) {
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

  public ProjectMembershipResponse user(UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public UserCompact getUser() {
    return user;
  }

  public void setUser(UserCompact user) {
    this.user = user;
  }

  public ProjectMembershipResponse project(ProjectCompact project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public ProjectCompact getProject() {
    return project;
  }

  public void setProject(ProjectCompact project) {
    this.project = project;
  }

  public ProjectMembershipResponse writeAccess(WriteAccessEnum writeAccess) {
    this.writeAccess = writeAccess;
    return this;
  }

  /**
   * Whether the user has full access to the project or has comment-only access.
   * @return writeAccess
  */
  
  @Schema(name = "write_access", accessMode = Schema.AccessMode.READ_ONLY, example = "full_write", description = "Whether the user has full access to the project or has comment-only access.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("write_access")
  public WriteAccessEnum getWriteAccess() {
    return writeAccess;
  }

  public void setWriteAccess(WriteAccessEnum writeAccess) {
    this.writeAccess = writeAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMembershipResponse projectMembershipResponse = (ProjectMembershipResponse) o;
    return Objects.equals(this.gid, projectMembershipResponse.gid) &&
        Objects.equals(this.resourceType, projectMembershipResponse.resourceType) &&
        Objects.equals(this.user, projectMembershipResponse.user) &&
        Objects.equals(this.project, projectMembershipResponse.project) &&
        Objects.equals(this.writeAccess, projectMembershipResponse.writeAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, user, project, writeAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMembershipResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    writeAccess: ").append(toIndentedString(writeAccess)).append("\n");
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


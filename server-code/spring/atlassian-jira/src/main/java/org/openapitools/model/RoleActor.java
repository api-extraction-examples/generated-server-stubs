package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import org.openapitools.model.ProjectRoleGroup;
import org.openapitools.model.ProjectRoleUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a user assigned to a project role.
 */

@Schema(name = "RoleActor", description = "Details about a user assigned to a project role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RoleActor {

  private ProjectRoleGroup actorGroup;

  private ProjectRoleUser actorUser;

  private URI avatarUrl;

  private String displayName;

  private Long id;

  private String name;

  /**
   * The type of role actor.
   */
  public enum TypeEnum {
    GROUP_ROLE_ACTOR("atlassian-group-role-actor"),
    
    USER_ROLE_ACTOR("atlassian-user-role-actor");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public RoleActor actorGroup(ProjectRoleGroup actorGroup) {
    this.actorGroup = actorGroup;
    return this;
  }

  /**
   * Get actorGroup
   * @return actorGroup
  */
  @Valid 
  @Schema(name = "actorGroup", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actorGroup")
  public ProjectRoleGroup getActorGroup() {
    return actorGroup;
  }

  public void setActorGroup(ProjectRoleGroup actorGroup) {
    this.actorGroup = actorGroup;
  }

  public RoleActor actorUser(ProjectRoleUser actorUser) {
    this.actorUser = actorUser;
    return this;
  }

  /**
   * Get actorUser
   * @return actorUser
  */
  @Valid 
  @Schema(name = "actorUser", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actorUser")
  public ProjectRoleUser getActorUser() {
    return actorUser;
  }

  public void setActorUser(ProjectRoleUser actorUser) {
    this.actorUser = actorUser;
  }

  public RoleActor avatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * The avatar of the role actor.
   * @return avatarUrl
  */
  @Valid 
  @Schema(name = "avatarUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "The avatar of the role actor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrl")
  public URI getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public RoleActor displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.
   * @return displayName
  */
  
  @Schema(name = "displayName", accessMode = Schema.AccessMode.READ_ONLY, description = "The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RoleActor id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the role actor.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the role actor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoleActor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RoleActor type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of role actor.
   * @return type
  */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "The type of role actor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    RoleActor roleActor = (RoleActor) o;
    return Objects.equals(this.actorGroup, roleActor.actorGroup) &&
        Objects.equals(this.actorUser, roleActor.actorUser) &&
        Objects.equals(this.avatarUrl, roleActor.avatarUrl) &&
        Objects.equals(this.displayName, roleActor.displayName) &&
        Objects.equals(this.id, roleActor.id) &&
        Objects.equals(this.name, roleActor.name) &&
        Objects.equals(this.type, roleActor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorGroup, actorUser, avatarUrl, displayName, id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleActor {\n");
    sb.append("    actorGroup: ").append(toIndentedString(actorGroup)).append("\n");
    sb.append("    actorUser: ").append(toIndentedString(actorUser)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


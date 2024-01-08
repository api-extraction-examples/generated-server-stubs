package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.ProjectRoleScope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a project role.
 */

@Schema(name = "ProjectRoleDetails", description = "Details about a project role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectRoleDetails {

  private Boolean admin;

  private Boolean _default;

  private String description;

  private Long id;

  private String name;

  private Boolean roleConfigurable;

  private ProjectRoleScope scope;

  private URI self;

  private String translatedName;

  public ProjectRoleDetails admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Whether this role is the admin role for the project.
   * @return admin
  */
  
  @Schema(name = "admin", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this role is the admin role for the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("admin")
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public ProjectRoleDetails _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Whether this role is the default role for the project.
   * @return _default
  */
  
  @Schema(name = "default", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether this role is the default role for the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ProjectRoleDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the project role.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the project role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectRoleDetails id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project role.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectRoleDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project role.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the project role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectRoleDetails roleConfigurable(Boolean roleConfigurable) {
    this.roleConfigurable = roleConfigurable;
    return this;
  }

  /**
   * Whether the roles are configurable for this project.
   * @return roleConfigurable
  */
  
  @Schema(name = "roleConfigurable", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the roles are configurable for this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleConfigurable")
  public Boolean getRoleConfigurable() {
    return roleConfigurable;
  }

  public void setRoleConfigurable(Boolean roleConfigurable) {
    this.roleConfigurable = roleConfigurable;
  }

  public ProjectRoleDetails scope(ProjectRoleScope scope) {
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
  public ProjectRoleScope getScope() {
    return scope;
  }

  public void setScope(ProjectRoleScope scope) {
    this.scope = scope;
  }

  public ProjectRoleDetails self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL the project role details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL the project role details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public ProjectRoleDetails translatedName(String translatedName) {
    this.translatedName = translatedName;
    return this;
  }

  /**
   * The translated name of the project role.
   * @return translatedName
  */
  
  @Schema(name = "translatedName", description = "The translated name of the project role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("translatedName")
  public String getTranslatedName() {
    return translatedName;
  }

  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoleDetails projectRoleDetails = (ProjectRoleDetails) o;
    return Objects.equals(this.admin, projectRoleDetails.admin) &&
        Objects.equals(this._default, projectRoleDetails._default) &&
        Objects.equals(this.description, projectRoleDetails.description) &&
        Objects.equals(this.id, projectRoleDetails.id) &&
        Objects.equals(this.name, projectRoleDetails.name) &&
        Objects.equals(this.roleConfigurable, projectRoleDetails.roleConfigurable) &&
        Objects.equals(this.scope, projectRoleDetails.scope) &&
        Objects.equals(this.self, projectRoleDetails.self) &&
        Objects.equals(this.translatedName, projectRoleDetails.translatedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, _default, description, id, name, roleConfigurable, scope, self, translatedName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleDetails {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleConfigurable: ").append(toIndentedString(roleConfigurable)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    translatedName: ").append(toIndentedString(translatedName)).append("\n");
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


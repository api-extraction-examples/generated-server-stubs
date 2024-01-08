package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ProjectAvatarUrls;
import org.openapitools.model.ProjectDetailsProjectCategory;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The project the item has scope in.
 */

@Schema(name = "Scope_project", description = "The project the item has scope in.")
@JsonTypeName("Scope_project")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ScopeProject {

  private ProjectAvatarUrls avatarUrls;

  private String id;

  private String key;

  private String name;

  private ProjectDetailsProjectCategory projectCategory;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
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
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProjectTypeKeyEnum projectTypeKey;

  private String self;

  private Boolean simplified;

  public ScopeProject avatarUrls(ProjectAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

  /**
   * Get avatarUrls
   * @return avatarUrls
  */
  @Valid 
  @Schema(name = "avatarUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrls")
  public ProjectAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(ProjectAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }

  public ScopeProject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScopeProject key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the project.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ScopeProject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScopeProject projectCategory(ProjectDetailsProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
    return this;
  }

  /**
   * Get projectCategory
   * @return projectCategory
  */
  @Valid 
  @Schema(name = "projectCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectCategory")
  public ProjectDetailsProjectCategory getProjectCategory() {
    return projectCategory;
  }

  public void setProjectCategory(ProjectDetailsProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
  }

  public ScopeProject projectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
    return this;
  }

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  */
  
  @Schema(name = "projectTypeKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectTypeKey")
  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }

  public void setProjectTypeKey(ProjectTypeKeyEnum projectTypeKey) {
    this.projectTypeKey = projectTypeKey;
  }

  public ScopeProject self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the project details.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the project details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public ScopeProject simplified(Boolean simplified) {
    this.simplified = simplified;
    return this;
  }

  /**
   * Whether or not the project is simplified.
   * @return simplified
  */
  
  @Schema(name = "simplified", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether or not the project is simplified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("simplified")
  public Boolean getSimplified() {
    return simplified;
  }

  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeProject scopeProject = (ScopeProject) o;
    return Objects.equals(this.avatarUrls, scopeProject.avatarUrls) &&
        Objects.equals(this.id, scopeProject.id) &&
        Objects.equals(this.key, scopeProject.key) &&
        Objects.equals(this.name, scopeProject.name) &&
        Objects.equals(this.projectCategory, scopeProject.projectCategory) &&
        Objects.equals(this.projectTypeKey, scopeProject.projectTypeKey) &&
        Objects.equals(this.self, scopeProject.self) &&
        Objects.equals(this.simplified, scopeProject.simplified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, id, key, name, projectCategory, projectTypeKey, self, simplified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeProject {\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
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


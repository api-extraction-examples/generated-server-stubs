package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details about an issue security scheme.
 */

@Schema(name = "SecuritySchemeWithProjects", description = "Details about an issue security scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecuritySchemeWithProjects {

  private Long defaultLevel;

  private String description;

  private Long id;

  private String name;

  @Valid
  private Set<Long> projectIds;

  private String self;

  public SecuritySchemeWithProjects() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SecuritySchemeWithProjects(Long id, String name, String self) {
    this.id = id;
    this.name = name;
    this.self = self;
  }

  public SecuritySchemeWithProjects defaultLevel(Long defaultLevel) {
    this.defaultLevel = defaultLevel;
    return this;
  }

  /**
   * The default level ID of the issue security scheme.
   * @return defaultLevel
  */
  
  @Schema(name = "defaultLevel", accessMode = Schema.AccessMode.READ_ONLY, description = "The default level ID of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultLevel")
  public Long getDefaultLevel() {
    return defaultLevel;
  }

  public void setDefaultLevel(Long defaultLevel) {
    this.defaultLevel = defaultLevel;
  }

  public SecuritySchemeWithProjects description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue security scheme.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecuritySchemeWithProjects id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue security scheme.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue security scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SecuritySchemeWithProjects name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue security scheme.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue security scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecuritySchemeWithProjects projectIds(Set<Long> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public SecuritySchemeWithProjects addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new LinkedHashSet<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

  /**
   * The list of project IDs associated with the issue security scheme.
   * @return projectIds
  */
  
  @Schema(name = "projectIds", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of project IDs associated with the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectIds")
  public Set<Long> getProjectIds() {
    return projectIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setProjectIds(Set<Long> projectIds) {
    this.projectIds = projectIds;
  }

  public SecuritySchemeWithProjects self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue security scheme.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue security scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public SecuritySchemeWithProjects putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemeWithProjects securitySchemeWithProjects = (SecuritySchemeWithProjects) o;
    return Objects.equals(this.defaultLevel, securitySchemeWithProjects.defaultLevel) &&
        Objects.equals(this.description, securitySchemeWithProjects.description) &&
        Objects.equals(this.id, securitySchemeWithProjects.id) &&
        Objects.equals(this.name, securitySchemeWithProjects.name) &&
        Objects.equals(this.projectIds, securitySchemeWithProjects.projectIds) &&
        Objects.equals(this.self, securitySchemeWithProjects.self) &&
    Objects.equals(this.additionalProperties, securitySchemeWithProjects.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLevel, description, id, name, projectIds, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemeWithProjects {\n");
    sb.append("    defaultLevel: ").append(toIndentedString(defaultLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


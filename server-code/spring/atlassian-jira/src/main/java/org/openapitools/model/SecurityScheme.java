package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SecurityLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a security scheme.
 */

@Schema(name = "SecurityScheme", description = "Details about a security scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SecurityScheme {

  private Long defaultSecurityLevelId;

  private String description;

  private Long id;

  @Valid
  private List<@Valid SecurityLevel> levels;

  private String name;

  private String self;

  public SecurityScheme defaultSecurityLevelId(Long defaultSecurityLevelId) {
    this.defaultSecurityLevelId = defaultSecurityLevelId;
    return this;
  }

  /**
   * The ID of the default security level.
   * @return defaultSecurityLevelId
  */
  
  @Schema(name = "defaultSecurityLevelId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the default security level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultSecurityLevelId")
  public Long getDefaultSecurityLevelId() {
    return defaultSecurityLevelId;
  }

  public void setDefaultSecurityLevelId(Long defaultSecurityLevelId) {
    this.defaultSecurityLevelId = defaultSecurityLevelId;
  }

  public SecurityScheme description(String description) {
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

  public SecurityScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue security scheme.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SecurityScheme levels(List<@Valid SecurityLevel> levels) {
    this.levels = levels;
    return this;
  }

  public SecurityScheme addLevelsItem(SecurityLevel levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * Get levels
   * @return levels
  */
  @Valid 
  @Schema(name = "levels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levels")
  public List<@Valid SecurityLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid SecurityLevel> levels) {
    this.levels = levels;
  }

  public SecurityScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue security scheme.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityScheme self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue security scheme.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue security scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScheme securityScheme = (SecurityScheme) o;
    return Objects.equals(this.defaultSecurityLevelId, securityScheme.defaultSecurityLevelId) &&
        Objects.equals(this.description, securityScheme.description) &&
        Objects.equals(this.id, securityScheme.id) &&
        Objects.equals(this.levels, securityScheme.levels) &&
        Objects.equals(this.name, securityScheme.name) &&
        Objects.equals(this.self, securityScheme.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultSecurityLevelId, description, id, levels, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScheme {\n");
    sb.append("    defaultSecurityLevelId: ").append(toIndentedString(defaultSecurityLevelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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


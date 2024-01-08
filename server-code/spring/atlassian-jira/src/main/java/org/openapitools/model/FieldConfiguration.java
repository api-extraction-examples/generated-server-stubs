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
 * Details of a field configuration.
 */

@Schema(name = "FieldConfiguration", description = "Details of a field configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfiguration {

  private String description;

  private Long id;

  private Boolean isDefault;

  private String name;

  public FieldConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfiguration(String description, Long id, String name) {
    this.description = description;
    this.id = id;
    this.name = name;
  }

  public FieldConfiguration description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the field configuration.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description of the field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldConfiguration id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the field configuration.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FieldConfiguration isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the field configuration is the default.
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "Whether the field configuration is the default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public FieldConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field configuration.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    FieldConfiguration fieldConfiguration = (FieldConfiguration) o;
    return Objects.equals(this.description, fieldConfiguration.description) &&
        Objects.equals(this.id, fieldConfiguration.id) &&
        Objects.equals(this.isDefault, fieldConfiguration.isDefault) &&
        Objects.equals(this.name, fieldConfiguration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfiguration {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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


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
 * Details of a field configuration scheme.
 */

@Schema(name = "FieldConfigurationScheme", description = "Details of a field configuration scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationScheme {

  private String description;

  private String id;

  private String name;

  public FieldConfigurationScheme() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationScheme(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public FieldConfigurationScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the field configuration scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the field configuration scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldConfigurationScheme id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the field configuration scheme.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the field configuration scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldConfigurationScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field configuration scheme.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the field configuration scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    FieldConfigurationScheme fieldConfigurationScheme = (FieldConfigurationScheme) o;
    return Objects.equals(this.description, fieldConfigurationScheme.description) &&
        Objects.equals(this.id, fieldConfigurationScheme.id) &&
        Objects.equals(this.name, fieldConfigurationScheme.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationScheme {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


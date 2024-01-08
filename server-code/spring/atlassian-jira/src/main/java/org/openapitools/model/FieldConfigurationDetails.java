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

@Schema(name = "FieldConfigurationDetails", description = "Details of a field configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationDetails {

  private String description;

  private String name;

  public FieldConfigurationDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationDetails(String name) {
    this.name = name;
  }

  public FieldConfigurationDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the field configuration.
   * @return description
  */
  @Size(max = 255) 
  @Schema(name = "description", description = "The description of the field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldConfigurationDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field configuration. Must be unique.
   * @return name
  */
  @NotNull @Size(max = 255) 
  @Schema(name = "name", description = "The name of the field configuration. Must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    FieldConfigurationDetails fieldConfigurationDetails = (FieldConfigurationDetails) o;
    return Objects.equals(this.description, fieldConfigurationDetails.description) &&
        Objects.equals(this.name, fieldConfigurationDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


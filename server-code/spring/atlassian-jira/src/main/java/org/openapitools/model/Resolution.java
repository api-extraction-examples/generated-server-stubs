package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an issue resolution.
 */

@Schema(name = "Resolution", description = "Details of an issue resolution.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Resolution {

  private String description;

  private String id;

  private String name;

  private URI self;

  public Resolution description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the issue resolution.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the issue resolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Resolution id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue resolution.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the issue resolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resolution name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the issue resolution.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the issue resolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resolution self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue resolution.
   * @return self
  */
  @Valid 
  @Schema(name = "self", description = "The URL of the issue resolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
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
    Resolution resolution = (Resolution) o;
    return Objects.equals(this.description, resolution.description) &&
        Objects.equals(this.id, resolution.id) &&
        Objects.equals(this.name, resolution.name) &&
        Objects.equals(this.self, resolution.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resolution {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
 * The details of a transition screen.
 */

@Schema(name = "TransitionScreenDetails", description = "The details of a transition screen.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class TransitionScreenDetails {

  private String id;

  private String name;

  public TransitionScreenDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransitionScreenDetails(String id) {
    this.id = id;
  }

  public TransitionScreenDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the screen.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the screen.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransitionScreenDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the screen.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the screen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TransitionScreenDetails transitionScreenDetails = (TransitionScreenDetails) o;
    return Objects.equals(this.id, transitionScreenDetails.id) &&
        Objects.equals(this.name, transitionScreenDetails.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransitionScreenDetails {\n");
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


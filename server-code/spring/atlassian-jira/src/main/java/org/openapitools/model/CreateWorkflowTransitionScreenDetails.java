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

@Schema(name = "CreateWorkflowTransitionScreenDetails", description = "The details of a transition screen.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowTransitionScreenDetails {

  private String id;

  public CreateWorkflowTransitionScreenDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowTransitionScreenDetails(String id) {
    this.id = id;
  }

  public CreateWorkflowTransitionScreenDetails id(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowTransitionScreenDetails createWorkflowTransitionScreenDetails = (CreateWorkflowTransitionScreenDetails) o;
    return Objects.equals(this.id, createWorkflowTransitionScreenDetails.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionScreenDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


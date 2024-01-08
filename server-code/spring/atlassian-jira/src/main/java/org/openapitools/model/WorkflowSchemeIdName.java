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
 * The ID and the name of the workflow scheme.
 */

@Schema(name = "WorkflowSchemeIdName", description = "The ID and the name of the workflow scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowSchemeIdName {

  private String id;

  private String name;

  public WorkflowSchemeIdName() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowSchemeIdName(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public WorkflowSchemeIdName id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the workflow scheme.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the workflow scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowSchemeIdName name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow scheme.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the workflow scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WorkflowSchemeIdName workflowSchemeIdName = (WorkflowSchemeIdName) o;
    return Objects.equals(this.id, workflowSchemeIdName.id) &&
        Objects.equals(this.name, workflowSchemeIdName.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeIdName {\n");
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


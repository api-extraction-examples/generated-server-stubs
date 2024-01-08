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
 * The classic workflow identifiers.
 */

@Schema(name = "WorkflowIDs", description = "The classic workflow identifiers.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowIDs {

  private String entityId;

  private String name;

  public WorkflowIDs() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowIDs(String name) {
    this.name = name;
  }

  public WorkflowIDs entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The entity ID of the workflow.
   * @return entityId
  */
  
  @Schema(name = "entityId", description = "The entity ID of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public WorkflowIDs name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    WorkflowIDs workflowIDs = (WorkflowIDs) o;
    return Objects.equals(this.entityId, workflowIDs.entityId) &&
        Objects.equals(this.name, workflowIDs.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowIDs {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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


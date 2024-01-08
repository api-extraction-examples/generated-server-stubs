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
 * Properties that identify a published workflow.
 */

@Schema(name = "PublishedWorkflowId", description = "Properties that identify a published workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PublishedWorkflowId {

  private String entityId;

  private String name;

  public PublishedWorkflowId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PublishedWorkflowId(String name) {
    this.name = name;
  }

  public PublishedWorkflowId entityId(String entityId) {
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

  public PublishedWorkflowId name(String name) {
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
    PublishedWorkflowId publishedWorkflowId = (PublishedWorkflowId) o;
    return Objects.equals(this.entityId, publishedWorkflowId.entityId) &&
        Objects.equals(this.name, publishedWorkflowId.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishedWorkflowId {\n");
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


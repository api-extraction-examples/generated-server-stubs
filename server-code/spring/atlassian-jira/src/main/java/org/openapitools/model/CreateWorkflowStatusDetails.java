package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details of a transition status.
 */

@Schema(name = "CreateWorkflowStatusDetails", description = "The details of a transition status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateWorkflowStatusDetails {

  private String id;

  @Valid
  private Map<String, String> properties = new HashMap<>();

  public CreateWorkflowStatusDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowStatusDetails(String id) {
    this.id = id;
  }

  public CreateWorkflowStatusDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the status.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateWorkflowStatusDetails properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public CreateWorkflowStatusDetails putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * The properties of the status.
   * @return properties
  */
  
  @Schema(name = "properties", description = "The properties of the status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowStatusDetails createWorkflowStatusDetails = (CreateWorkflowStatusDetails) o;
    return Objects.equals(this.id, createWorkflowStatusDetails.id) &&
        Objects.equals(this.properties, createWorkflowStatusDetails.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowStatusDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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


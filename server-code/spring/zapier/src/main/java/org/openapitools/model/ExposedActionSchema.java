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
 * ExposedActionSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:55.879556-04:00[America/Lower_Princes]")
public class ExposedActionSchema {

  private String description;

  private String id;

  private String operationId;

  private Object params;

  public ExposedActionSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExposedActionSchema(String description, String id, String operationId, Object params) {
    this.description = description;
    this.id = id;
    this.operationId = operationId;
    this.params = params;
  }

  public ExposedActionSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the action.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Description of the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExposedActionSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the exposed action.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The unique ID of the exposed action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExposedActionSchema operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The operation ID of the exposed action.
   * @return operationId
  */
  @NotNull 
  @Schema(name = "operation_id", description = "The operation ID of the exposed action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_id")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public ExposedActionSchema params(Object params) {
    this.params = params;
    return this;
  }

  /**
   * Available hint fields for the action.
   * @return params
  */
  @NotNull 
  @Schema(name = "params", description = "Available hint fields for the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("params")
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExposedActionSchema exposedActionSchema = (ExposedActionSchema) o;
    return Objects.equals(this.description, exposedActionSchema.description) &&
        Objects.equals(this.id, exposedActionSchema.id) &&
        Objects.equals(this.operationId, exposedActionSchema.operationId) &&
        Objects.equals(this.params, exposedActionSchema.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, operationId, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExposedActionSchema {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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


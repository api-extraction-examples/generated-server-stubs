package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the contextual configuration for a custom field.
 */

@Schema(name = "ContextualConfiguration", description = "Details of the contextual configuration for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ContextualConfiguration {

  private JsonNullable<Object> _configuration = JsonNullable.<Object>undefined();

  private String fieldContextId;

  private String id;

  private JsonNullable<Object> schema = JsonNullable.<Object>undefined();

  public ContextualConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContextualConfiguration(String fieldContextId, String id) {
    this.fieldContextId = fieldContextId;
    this.id = id;
  }

  public ContextualConfiguration _configuration(Object _configuration) {
    this._configuration = JsonNullable.of(_configuration);
    return this;
  }

  /**
   * The field configuration.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "The field configuration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public JsonNullable<Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(JsonNullable<Object> _configuration) {
    this._configuration = _configuration;
  }

  public ContextualConfiguration fieldContextId(String fieldContextId) {
    this.fieldContextId = fieldContextId;
    return this;
  }

  /**
   * The ID of the field context the configuration is associated with.
   * @return fieldContextId
  */
  
  @Schema(name = "fieldContextId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the field context the configuration is associated with.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fieldContextId")
  public String getFieldContextId() {
    return fieldContextId;
  }

  public void setFieldContextId(String fieldContextId) {
    this.fieldContextId = fieldContextId;
  }

  public ContextualConfiguration id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the configuration.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContextualConfiguration schema(Object schema) {
    this.schema = JsonNullable.of(schema);
    return this;
  }

  /**
   * The field value schema.
   * @return schema
  */
  
  @Schema(name = "schema", description = "The field value schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public JsonNullable<Object> getSchema() {
    return schema;
  }

  public void setSchema(JsonNullable<Object> schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextualConfiguration contextualConfiguration = (ContextualConfiguration) o;
    return equalsNullable(this._configuration, contextualConfiguration._configuration) &&
        Objects.equals(this.fieldContextId, contextualConfiguration.fieldContextId) &&
        Objects.equals(this.id, contextualConfiguration.id) &&
        equalsNullable(this.schema, contextualConfiguration.schema);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(_configuration), fieldContextId, id, hashCodeNullable(schema));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextualConfiguration {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    fieldContextId: ").append(toIndentedString(fieldContextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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


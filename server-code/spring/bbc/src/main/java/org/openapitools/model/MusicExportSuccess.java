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
 * MusicExportSuccess
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicExportSuccess {

  private String method;

  private String repliedAt;

  private String schema;

  public MusicExportSuccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicExportSuccess(String method, String repliedAt, String schema) {
    this.method = method;
    this.repliedAt = repliedAt;
    this.schema = schema;
  }

  public MusicExportSuccess method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public MusicExportSuccess repliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
    return this;
  }

  /**
   * Get repliedAt
   * @return repliedAt
  */
  @NotNull 
  @Schema(name = "replied_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("replied_at")
  public String getRepliedAt() {
    return repliedAt;
  }

  public void setRepliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
  }

  public MusicExportSuccess schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @NotNull 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
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
    MusicExportSuccess musicExportSuccess = (MusicExportSuccess) o;
    return Objects.equals(this.method, musicExportSuccess.method) &&
        Objects.equals(this.repliedAt, musicExportSuccess.repliedAt) &&
        Objects.equals(this.schema, musicExportSuccess.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, repliedAt, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicExportSuccess {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    repliedAt: ").append(toIndentedString(repliedAt)).append("\n");
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


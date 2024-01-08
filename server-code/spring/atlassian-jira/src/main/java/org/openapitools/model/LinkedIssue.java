package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.LinkedIssueFields;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The ID or key of a linked issue.
 */

@Schema(name = "LinkedIssue", description = "The ID or key of a linked issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class LinkedIssue {

  private LinkedIssueFields fields;

  private String id;

  private String key;

  private URI self;

  public LinkedIssue fields(LinkedIssueFields fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  @Valid 
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public LinkedIssueFields getFields() {
    return fields;
  }

  public void setFields(LinkedIssueFields fields) {
    this.fields = fields;
  }

  public LinkedIssue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of an issue. Required if `key` isn't provided.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of an issue. Required if `key` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LinkedIssue key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of an issue. Required if `id` isn't provided.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of an issue. Required if `id` isn't provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public LinkedIssue self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the issue.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    LinkedIssue linkedIssue = (LinkedIssue) o;
    return Objects.equals(this.fields, linkedIssue.fields) &&
        Objects.equals(this.id, linkedIssue.id) &&
        Objects.equals(this.key, linkedIssue.key) &&
        Objects.equals(this.self, linkedIssue.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, id, key, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedIssue {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


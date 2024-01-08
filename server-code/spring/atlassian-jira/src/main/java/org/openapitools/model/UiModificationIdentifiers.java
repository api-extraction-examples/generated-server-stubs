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
 * Identifiers for a UI modification.
 */

@Schema(name = "UiModificationIdentifiers", description = "Identifiers for a UI modification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UiModificationIdentifiers {

  private String id;

  private String self;

  public UiModificationIdentifiers() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UiModificationIdentifiers(String id, String self) {
    this.id = id;
    this.self = self;
  }

  public UiModificationIdentifiers id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the UI modification.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the UI modification.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UiModificationIdentifiers self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the UI modification.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the UI modification.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
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
    UiModificationIdentifiers uiModificationIdentifiers = (UiModificationIdentifiers) o;
    return Objects.equals(this.id, uiModificationIdentifiers.id) &&
        Objects.equals(this.self, uiModificationIdentifiers.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiModificationIdentifiers {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


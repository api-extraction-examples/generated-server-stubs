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
 * Details of the identifiers for a created or updated remote issue link.
 */

@Schema(name = "RemoteIssueLinkIdentifies", description = "Details of the identifiers for a created or updated remote issue link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RemoteIssueLinkIdentifies {

  private Long id;

  private String self;

  public RemoteIssueLinkIdentifies id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the remote issue link, such as the ID of the item on the remote system.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the remote issue link, such as the ID of the item on the remote system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RemoteIssueLinkIdentifies self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the remote issue link.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the remote issue link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RemoteIssueLinkIdentifies remoteIssueLinkIdentifies = (RemoteIssueLinkIdentifies) o;
    return Objects.equals(this.id, remoteIssueLinkIdentifies.id) &&
        Objects.equals(this.self, remoteIssueLinkIdentifies.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLinkIdentifies {\n");
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


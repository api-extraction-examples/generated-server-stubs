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
 * The new default issue resolution.
 */

@Schema(name = "SetDefaultResolutionRequest", description = "The new default issue resolution.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SetDefaultResolutionRequest {

  private String id;

  public SetDefaultResolutionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetDefaultResolutionRequest(String id) {
    this.id = id;
  }

  public SetDefaultResolutionRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the new default issue resolution. Must be an existing ID or null. Setting this to null erases the default resolution setting.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the new default issue resolution. Must be an existing ID or null. Setting this to null erases the default resolution setting.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultResolutionRequest setDefaultResolutionRequest = (SetDefaultResolutionRequest) o;
    return Objects.equals(this.id, setDefaultResolutionRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultResolutionRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


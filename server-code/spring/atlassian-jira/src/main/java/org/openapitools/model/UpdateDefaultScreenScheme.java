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
 * The ID of a screen scheme.
 */

@Schema(name = "UpdateDefaultScreenScheme", description = "The ID of a screen scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UpdateDefaultScreenScheme {

  private String screenSchemeId;

  public UpdateDefaultScreenScheme() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateDefaultScreenScheme(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }

  public UpdateDefaultScreenScheme screenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
    return this;
  }

  /**
   * The ID of the screen scheme.
   * @return screenSchemeId
  */
  @NotNull 
  @Schema(name = "screenSchemeId", description = "The ID of the screen scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screenSchemeId")
  public String getScreenSchemeId() {
    return screenSchemeId;
  }

  public void setScreenSchemeId(String screenSchemeId) {
    this.screenSchemeId = screenSchemeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDefaultScreenScheme updateDefaultScreenScheme = (UpdateDefaultScreenScheme) o;
    return Objects.equals(this.screenSchemeId, updateDefaultScreenScheme.screenSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDefaultScreenScheme {\n");
    sb.append("    screenSchemeId: ").append(toIndentedString(screenSchemeId)).append("\n");
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


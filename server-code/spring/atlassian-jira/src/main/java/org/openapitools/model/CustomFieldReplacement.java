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
 * Details about the replacement for a deleted version.
 */

@Schema(name = "CustomFieldReplacement", description = "Details about the replacement for a deleted version.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldReplacement {

  private Long customFieldId;

  private Long moveTo;

  public CustomFieldReplacement customFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
    return this;
  }

  /**
   * The ID of the custom field in which to replace the version number.
   * @return customFieldId
  */
  
  @Schema(name = "customFieldId", description = "The ID of the custom field in which to replace the version number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customFieldId")
  public Long getCustomFieldId() {
    return customFieldId;
  }

  public void setCustomFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
  }

  public CustomFieldReplacement moveTo(Long moveTo) {
    this.moveTo = moveTo;
    return this;
  }

  /**
   * The version number to use as a replacement for the deleted version.
   * @return moveTo
  */
  
  @Schema(name = "moveTo", description = "The version number to use as a replacement for the deleted version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moveTo")
  public Long getMoveTo() {
    return moveTo;
  }

  public void setMoveTo(Long moveTo) {
    this.moveTo = moveTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldReplacement customFieldReplacement = (CustomFieldReplacement) o;
    return Objects.equals(this.customFieldId, customFieldReplacement.customFieldId) &&
        Objects.equals(this.moveTo, customFieldReplacement.moveTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, moveTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldReplacement {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    moveTo: ").append(toIndentedString(moveTo)).append("\n");
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


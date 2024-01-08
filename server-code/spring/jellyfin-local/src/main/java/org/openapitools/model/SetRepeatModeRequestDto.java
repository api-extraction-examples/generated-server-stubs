package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.GroupRepeatMode;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class SetRepeatModeRequestDto.
 */

@Schema(name = "SetRepeatModeRequestDto", description = "Class SetRepeatModeRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SetRepeatModeRequestDto {

  private GroupRepeatMode mode;

  public SetRepeatModeRequestDto mode(GroupRepeatMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @Valid 
  @Schema(name = "Mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public GroupRepeatMode getMode() {
    return mode;
  }

  public void setMode(GroupRepeatMode mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetRepeatModeRequestDto setRepeatModeRequestDto = (SetRepeatModeRequestDto) o;
    return Objects.equals(this.mode, setRepeatModeRequestDto.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetRepeatModeRequestDto {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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


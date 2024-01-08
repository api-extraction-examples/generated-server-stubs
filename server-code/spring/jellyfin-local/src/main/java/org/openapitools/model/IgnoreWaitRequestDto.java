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
 * Class IgnoreWaitRequestDto.
 */

@Schema(name = "IgnoreWaitRequestDto", description = "Class IgnoreWaitRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class IgnoreWaitRequestDto {

  private Boolean ignoreWait;

  public IgnoreWaitRequestDto ignoreWait(Boolean ignoreWait) {
    this.ignoreWait = ignoreWait;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the client should be ignored.
   * @return ignoreWait
  */
  
  @Schema(name = "IgnoreWait", description = "Gets or sets a value indicating whether the client should be ignored.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IgnoreWait")
  public Boolean getIgnoreWait() {
    return ignoreWait;
  }

  public void setIgnoreWait(Boolean ignoreWait) {
    this.ignoreWait = ignoreWait;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnoreWaitRequestDto ignoreWaitRequestDto = (IgnoreWaitRequestDto) o;
    return Objects.equals(this.ignoreWait, ignoreWaitRequestDto.ignoreWait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreWait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnoreWaitRequestDto {\n");
    sb.append("    ignoreWait: ").append(toIndentedString(ignoreWait)).append("\n");
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


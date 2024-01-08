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
 * DestinationSegment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class DestinationSegment {

  private String writeKey;

  public DestinationSegment writeKey(String writeKey) {
    this.writeKey = writeKey;
    return this;
  }

  /**
   * Get writeKey
   * @return writeKey
  */
  
  @Schema(name = "writeKey", example = "segmentWriteKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writeKey")
  public String getWriteKey() {
    return writeKey;
  }

  public void setWriteKey(String writeKey) {
    this.writeKey = writeKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationSegment destinationSegment = (DestinationSegment) o;
    return Objects.equals(this.writeKey, destinationSegment.writeKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writeKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationSegment {\n");
    sb.append("    writeKey: ").append(toIndentedString(writeKey)).append("\n");
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


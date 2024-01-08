package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Media Encoder Path Dto.
 */

@Schema(name = "MediaEncoderPathDto", description = "Media Encoder Path Dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaEncoderPathDto {

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private JsonNullable<String> pathType = JsonNullable.<String>undefined();

  public MediaEncoderPathDto path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets media encoder path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets media encoder path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MediaEncoderPathDto pathType(String pathType) {
    this.pathType = JsonNullable.of(pathType);
    return this;
  }

  /**
   * Gets or sets media encoder path type.
   * @return pathType
  */
  
  @Schema(name = "PathType", description = "Gets or sets media encoder path type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathType")
  public JsonNullable<String> getPathType() {
    return pathType;
  }

  public void setPathType(JsonNullable<String> pathType) {
    this.pathType = pathType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaEncoderPathDto mediaEncoderPathDto = (MediaEncoderPathDto) o;
    return equalsNullable(this.path, mediaEncoderPathDto.path) &&
        equalsNullable(this.pathType, mediaEncoderPathDto.pathType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(path), hashCodeNullable(pathType));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaEncoderPathDto {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
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


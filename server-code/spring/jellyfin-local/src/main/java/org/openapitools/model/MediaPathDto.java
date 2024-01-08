package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MediaPathInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Media Path dto.
 */

@Schema(name = "MediaPathDto", description = "Media Path dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaPathDto {

  private String name;

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private MediaPathInfo pathInfo;

  public MediaPathDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MediaPathDto(String name) {
    this.name = name;
  }

  public MediaPathDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Gets or sets the name of the library.
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", description = "Gets or sets the name of the library.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediaPathDto path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the path to add.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the path to add.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MediaPathDto pathInfo(MediaPathInfo pathInfo) {
    this.pathInfo = pathInfo;
    return this;
  }

  /**
   * Get pathInfo
   * @return pathInfo
  */
  @Valid 
  @Schema(name = "PathInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathInfo")
  public MediaPathInfo getPathInfo() {
    return pathInfo;
  }

  public void setPathInfo(MediaPathInfo pathInfo) {
    this.pathInfo = pathInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaPathDto mediaPathDto = (MediaPathDto) o;
    return Objects.equals(this.name, mediaPathDto.name) &&
        equalsNullable(this.path, mediaPathDto.path) &&
        Objects.equals(this.pathInfo, mediaPathDto.pathInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hashCodeNullable(path), pathInfo);
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
    sb.append("class MediaPathDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathInfo: ").append(toIndentedString(pathInfo)).append("\n");
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


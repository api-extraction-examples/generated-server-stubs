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
 * Media Update Info Dto.
 */

@Schema(name = "MediaUpdateInfoDto", description = "Media Update Info Dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaUpdateInfoDto {

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private JsonNullable<String> updateType = JsonNullable.<String>undefined();

  public MediaUpdateInfoDto path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets media path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets media path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MediaUpdateInfoDto updateType(String updateType) {
    this.updateType = JsonNullable.of(updateType);
    return this;
  }

  /**
   * Gets or sets media update type.  Created, Modified, Deleted.
   * @return updateType
  */
  
  @Schema(name = "UpdateType", description = "Gets or sets media update type.  Created, Modified, Deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdateType")
  public JsonNullable<String> getUpdateType() {
    return updateType;
  }

  public void setUpdateType(JsonNullable<String> updateType) {
    this.updateType = updateType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUpdateInfoDto mediaUpdateInfoDto = (MediaUpdateInfoDto) o;
    return equalsNullable(this.path, mediaUpdateInfoDto.path) &&
        equalsNullable(this.updateType, mediaUpdateInfoDto.updateType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(path), hashCodeNullable(updateType));
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
    sb.append("class MediaUpdateInfoDto {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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


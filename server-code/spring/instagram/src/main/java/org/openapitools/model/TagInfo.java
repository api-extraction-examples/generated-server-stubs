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
 * TagInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class TagInfo {

  private Long mediaCount;

  private String name;

  public TagInfo mediaCount(Long mediaCount) {
    this.mediaCount = mediaCount;
    return this;
  }

  /**
   * Overall number of media entries taged with this name
   * @return mediaCount
  */
  
  @Schema(name = "media_count", description = "Overall number of media entries taged with this name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_count")
  public Long getMediaCount() {
    return mediaCount;
  }

  public void setMediaCount(Long mediaCount) {
    this.mediaCount = mediaCount;
  }

  public TagInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Tag name
   * @return name
  */
  
  @Schema(name = "name", description = "Tag name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagInfo tagInfo = (TagInfo) o;
    return Objects.equals(this.mediaCount, tagInfo.mediaCount) &&
        Objects.equals(this.name, tagInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaCount, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagInfo {\n");
    sb.append("    mediaCount: ").append(toIndentedString(mediaCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


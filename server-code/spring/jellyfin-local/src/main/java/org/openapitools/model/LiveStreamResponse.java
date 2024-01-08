package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MediaSourceInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LiveStreamResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LiveStreamResponse {

  private MediaSourceInfo mediaSource;

  public LiveStreamResponse mediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  /**
   * Get mediaSource
   * @return mediaSource
  */
  @Valid 
  @Schema(name = "MediaSource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSource")
  public MediaSourceInfo getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(MediaSourceInfo mediaSource) {
    this.mediaSource = mediaSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStreamResponse liveStreamResponse = (LiveStreamResponse) o;
    return Objects.equals(this.mediaSource, liveStreamResponse.mediaSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStreamResponse {\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
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


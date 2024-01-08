package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MediaSourceInfo;
import org.openapitools.model.PlaybackErrorCode;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class PlaybackInfoResponse.
 */

@Schema(name = "PlaybackInfoResponse", description = "Class PlaybackInfoResponse.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlaybackInfoResponse {

  private PlaybackErrorCode errorCode;

  @Valid
  private JsonNullable<List<@Valid MediaSourceInfo>> mediaSources = JsonNullable.<List<@Valid MediaSourceInfo>>undefined();

  private JsonNullable<String> playSessionId = JsonNullable.<String>undefined();

  public PlaybackInfoResponse errorCode(PlaybackErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  @Valid 
  @Schema(name = "ErrorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ErrorCode")
  public PlaybackErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(PlaybackErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  public PlaybackInfoResponse mediaSources(List<@Valid MediaSourceInfo> mediaSources) {
    this.mediaSources = JsonNullable.of(mediaSources);
    return this;
  }

  public PlaybackInfoResponse addMediaSourcesItem(MediaSourceInfo mediaSourcesItem) {
    if (this.mediaSources == null || !this.mediaSources.isPresent()) {
      this.mediaSources = JsonNullable.of(new ArrayList<>());
    }
    this.mediaSources.get().add(mediaSourcesItem);
    return this;
  }

  /**
   * Gets or sets the media sources.
   * @return mediaSources
  */
  @Valid 
  @Schema(name = "MediaSources", description = "Gets or sets the media sources.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSources")
  public JsonNullable<List<@Valid MediaSourceInfo>> getMediaSources() {
    return mediaSources;
  }

  public void setMediaSources(JsonNullable<List<@Valid MediaSourceInfo>> mediaSources) {
    this.mediaSources = mediaSources;
  }

  public PlaybackInfoResponse playSessionId(String playSessionId) {
    this.playSessionId = JsonNullable.of(playSessionId);
    return this;
  }

  /**
   * Gets or sets the play session identifier.
   * @return playSessionId
  */
  
  @Schema(name = "PlaySessionId", description = "Gets or sets the play session identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaySessionId")
  public JsonNullable<String> getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(JsonNullable<String> playSessionId) {
    this.playSessionId = playSessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackInfoResponse playbackInfoResponse = (PlaybackInfoResponse) o;
    return Objects.equals(this.errorCode, playbackInfoResponse.errorCode) &&
        equalsNullable(this.mediaSources, playbackInfoResponse.mediaSources) &&
        equalsNullable(this.playSessionId, playbackInfoResponse.playSessionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, hashCodeNullable(mediaSources), hashCodeNullable(playSessionId));
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
    sb.append("class PlaybackInfoResponse {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    mediaSources: ").append(toIndentedString(mediaSources)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
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


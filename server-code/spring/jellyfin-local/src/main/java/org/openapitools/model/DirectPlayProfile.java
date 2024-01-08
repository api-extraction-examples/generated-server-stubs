package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DlnaProfileType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DirectPlayProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class DirectPlayProfile {

  private JsonNullable<String> audioCodec = JsonNullable.<String>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private DlnaProfileType type;

  private JsonNullable<String> videoCodec = JsonNullable.<String>undefined();

  public DirectPlayProfile audioCodec(String audioCodec) {
    this.audioCodec = JsonNullable.of(audioCodec);
    return this;
  }

  /**
   * Get audioCodec
   * @return audioCodec
  */
  
  @Schema(name = "AudioCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioCodec")
  public JsonNullable<String> getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(JsonNullable<String> audioCodec) {
    this.audioCodec = audioCodec;
  }

  public DirectPlayProfile container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public DirectPlayProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }

  public DirectPlayProfile videoCodec(String videoCodec) {
    this.videoCodec = JsonNullable.of(videoCodec);
    return this;
  }

  /**
   * Get videoCodec
   * @return videoCodec
  */
  
  @Schema(name = "VideoCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoCodec")
  public JsonNullable<String> getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(JsonNullable<String> videoCodec) {
    this.videoCodec = videoCodec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectPlayProfile directPlayProfile = (DirectPlayProfile) o;
    return equalsNullable(this.audioCodec, directPlayProfile.audioCodec) &&
        equalsNullable(this.container, directPlayProfile.container) &&
        Objects.equals(this.type, directPlayProfile.type) &&
        equalsNullable(this.videoCodec, directPlayProfile.videoCodec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioCodec), hashCodeNullable(container), type, hashCodeNullable(videoCodec));
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
    sb.append("class DirectPlayProfile {\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
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


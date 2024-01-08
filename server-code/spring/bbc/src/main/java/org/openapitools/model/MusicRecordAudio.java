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
 * MusicRecordAudio
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicRecordAudio {

  private String audioType;

  private Integer duration;

  private String identifier;

  private String resourceType;

  public MusicRecordAudio() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicRecordAudio(String audioType, Integer duration, String identifier, String resourceType) {
    this.audioType = audioType;
    this.duration = duration;
    this.identifier = identifier;
    this.resourceType = resourceType;
  }

  public MusicRecordAudio audioType(String audioType) {
    this.audioType = audioType;
    return this;
  }

  /**
   * Get audioType
   * @return audioType
  */
  @NotNull 
  @Schema(name = "audioType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("audioType")
  public String getAudioType() {
    return audioType;
  }

  public void setAudioType(String audioType) {
    this.audioType = audioType;
  }

  public MusicRecordAudio duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  @NotNull 
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public MusicRecordAudio identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @NotNull 
  @Schema(name = "identifier", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public MusicRecordAudio resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @NotNull 
  @Schema(name = "resourceType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicRecordAudio musicRecordAudio = (MusicRecordAudio) o;
    return Objects.equals(this.audioType, musicRecordAudio.audioType) &&
        Objects.equals(this.duration, musicRecordAudio.duration) &&
        Objects.equals(this.identifier, musicRecordAudio.identifier) &&
        Objects.equals(this.resourceType, musicRecordAudio.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioType, duration, identifier, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicRecordAudio {\n");
    sb.append("    audioType: ").append(toIndentedString(audioType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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


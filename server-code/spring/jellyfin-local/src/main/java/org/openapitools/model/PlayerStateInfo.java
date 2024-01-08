package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlayMethod;
import org.openapitools.model.RepeatMode;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerStateInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlayerStateInfo {

  private JsonNullable<Integer> audioStreamIndex = JsonNullable.<Integer>undefined();

  private Boolean canSeek;

  private Boolean isMuted;

  private Boolean isPaused;

  private JsonNullable<String> mediaSourceId = JsonNullable.<String>undefined();

  private PlayMethod playMethod;

  private JsonNullable<Long> positionTicks = JsonNullable.<Long>undefined();

  private RepeatMode repeatMode;

  private JsonNullable<Integer> subtitleStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> volumeLevel = JsonNullable.<Integer>undefined();

  public PlayerStateInfo audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = JsonNullable.of(audioStreamIndex);
    return this;
  }

  /**
   * Gets or sets the index of the now playing audio stream.
   * @return audioStreamIndex
  */
  
  @Schema(name = "AudioStreamIndex", description = "Gets or sets the index of the now playing audio stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioStreamIndex")
  public JsonNullable<Integer> getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(JsonNullable<Integer> audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlayerStateInfo canSeek(Boolean canSeek) {
    this.canSeek = canSeek;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance can seek.
   * @return canSeek
  */
  
  @Schema(name = "CanSeek", description = "Gets or sets a value indicating whether this instance can seek.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanSeek")
  public Boolean getCanSeek() {
    return canSeek;
  }

  public void setCanSeek(Boolean canSeek) {
    this.canSeek = canSeek;
  }

  public PlayerStateInfo isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is muted.
   * @return isMuted
  */
  
  @Schema(name = "IsMuted", description = "Gets or sets a value indicating whether this instance is muted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsMuted")
  public Boolean getIsMuted() {
    return isMuted;
  }

  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }

  public PlayerStateInfo isPaused(Boolean isPaused) {
    this.isPaused = isPaused;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is paused.
   * @return isPaused
  */
  
  @Schema(name = "IsPaused", description = "Gets or sets a value indicating whether this instance is paused.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPaused")
  public Boolean getIsPaused() {
    return isPaused;
  }

  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }

  public PlayerStateInfo mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = JsonNullable.of(mediaSourceId);
    return this;
  }

  /**
   * Gets or sets the now playing media version identifier.
   * @return mediaSourceId
  */
  
  @Schema(name = "MediaSourceId", description = "Gets or sets the now playing media version identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSourceId")
  public JsonNullable<String> getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(JsonNullable<String> mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlayerStateInfo playMethod(PlayMethod playMethod) {
    this.playMethod = playMethod;
    return this;
  }

  /**
   * Get playMethod
   * @return playMethod
  */
  @Valid 
  @Schema(name = "PlayMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayMethod")
  public PlayMethod getPlayMethod() {
    return playMethod;
  }

  public void setPlayMethod(PlayMethod playMethod) {
    this.playMethod = playMethod;
  }

  public PlayerStateInfo positionTicks(Long positionTicks) {
    this.positionTicks = JsonNullable.of(positionTicks);
    return this;
  }

  /**
   * Gets or sets the now playing position ticks.
   * @return positionTicks
  */
  
  @Schema(name = "PositionTicks", description = "Gets or sets the now playing position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PositionTicks")
  public JsonNullable<Long> getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(JsonNullable<Long> positionTicks) {
    this.positionTicks = positionTicks;
  }

  public PlayerStateInfo repeatMode(RepeatMode repeatMode) {
    this.repeatMode = repeatMode;
    return this;
  }

  /**
   * Get repeatMode
   * @return repeatMode
  */
  @Valid 
  @Schema(name = "RepeatMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepeatMode")
  public RepeatMode getRepeatMode() {
    return repeatMode;
  }

  public void setRepeatMode(RepeatMode repeatMode) {
    this.repeatMode = repeatMode;
  }

  public PlayerStateInfo subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = JsonNullable.of(subtitleStreamIndex);
    return this;
  }

  /**
   * Gets or sets the index of the now playing subtitle stream.
   * @return subtitleStreamIndex
  */
  
  @Schema(name = "SubtitleStreamIndex", description = "Gets or sets the index of the now playing subtitle stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleStreamIndex")
  public JsonNullable<Integer> getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(JsonNullable<Integer> subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlayerStateInfo volumeLevel(Integer volumeLevel) {
    this.volumeLevel = JsonNullable.of(volumeLevel);
    return this;
  }

  /**
   * Gets or sets the volume level.
   * @return volumeLevel
  */
  
  @Schema(name = "VolumeLevel", description = "Gets or sets the volume level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumeLevel")
  public JsonNullable<Integer> getVolumeLevel() {
    return volumeLevel;
  }

  public void setVolumeLevel(JsonNullable<Integer> volumeLevel) {
    this.volumeLevel = volumeLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerStateInfo playerStateInfo = (PlayerStateInfo) o;
    return equalsNullable(this.audioStreamIndex, playerStateInfo.audioStreamIndex) &&
        Objects.equals(this.canSeek, playerStateInfo.canSeek) &&
        Objects.equals(this.isMuted, playerStateInfo.isMuted) &&
        Objects.equals(this.isPaused, playerStateInfo.isPaused) &&
        equalsNullable(this.mediaSourceId, playerStateInfo.mediaSourceId) &&
        Objects.equals(this.playMethod, playerStateInfo.playMethod) &&
        equalsNullable(this.positionTicks, playerStateInfo.positionTicks) &&
        Objects.equals(this.repeatMode, playerStateInfo.repeatMode) &&
        equalsNullable(this.subtitleStreamIndex, playerStateInfo.subtitleStreamIndex) &&
        equalsNullable(this.volumeLevel, playerStateInfo.volumeLevel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioStreamIndex), canSeek, isMuted, isPaused, hashCodeNullable(mediaSourceId), playMethod, hashCodeNullable(positionTicks), repeatMode, hashCodeNullable(subtitleStreamIndex), hashCodeNullable(volumeLevel));
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
    sb.append("class PlayerStateInfo {\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    playMethod: ").append(toIndentedString(playMethod)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
    sb.append("    volumeLevel: ").append(toIndentedString(volumeLevel)).append("\n");
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


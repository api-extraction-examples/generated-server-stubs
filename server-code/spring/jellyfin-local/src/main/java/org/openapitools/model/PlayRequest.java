package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlayCommand;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class PlayRequest.
 */

@Schema(name = "PlayRequest", description = "Class PlayRequest.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlayRequest {

  private JsonNullable<Integer> audioStreamIndex = JsonNullable.<Integer>undefined();

  private UUID controllingUserId;

  @Valid
  private JsonNullable<List<UUID>> itemIds = JsonNullable.<List<UUID>>undefined();

  private JsonNullable<String> mediaSourceId = JsonNullable.<String>undefined();

  private PlayCommand playCommand;

  private JsonNullable<Integer> startIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Long> startPositionTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Integer> subtitleStreamIndex = JsonNullable.<Integer>undefined();

  public PlayRequest audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = JsonNullable.of(audioStreamIndex);
    return this;
  }

  /**
   * Get audioStreamIndex
   * @return audioStreamIndex
  */
  
  @Schema(name = "AudioStreamIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioStreamIndex")
  public JsonNullable<Integer> getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(JsonNullable<Integer> audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlayRequest controllingUserId(UUID controllingUserId) {
    this.controllingUserId = controllingUserId;
    return this;
  }

  /**
   * Gets or sets the controlling user identifier.
   * @return controllingUserId
  */
  @Valid 
  @Schema(name = "ControllingUserId", description = "Gets or sets the controlling user identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ControllingUserId")
  public UUID getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(UUID controllingUserId) {
    this.controllingUserId = controllingUserId;
  }

  public PlayRequest itemIds(List<UUID> itemIds) {
    this.itemIds = JsonNullable.of(itemIds);
    return this;
  }

  public PlayRequest addItemIdsItem(UUID itemIdsItem) {
    if (this.itemIds == null || !this.itemIds.isPresent()) {
      this.itemIds = JsonNullable.of(new ArrayList<>());
    }
    this.itemIds.get().add(itemIdsItem);
    return this;
  }

  /**
   * Gets or sets the item ids.
   * @return itemIds
  */
  @Valid 
  @Schema(name = "ItemIds", description = "Gets or sets the item ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemIds")
  public JsonNullable<List<UUID>> getItemIds() {
    return itemIds;
  }

  public void setItemIds(JsonNullable<List<UUID>> itemIds) {
    this.itemIds = itemIds;
  }

  public PlayRequest mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = JsonNullable.of(mediaSourceId);
    return this;
  }

  /**
   * Get mediaSourceId
   * @return mediaSourceId
  */
  
  @Schema(name = "MediaSourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSourceId")
  public JsonNullable<String> getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(JsonNullable<String> mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlayRequest playCommand(PlayCommand playCommand) {
    this.playCommand = playCommand;
    return this;
  }

  /**
   * Get playCommand
   * @return playCommand
  */
  @Valid 
  @Schema(name = "PlayCommand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayCommand")
  public PlayCommand getPlayCommand() {
    return playCommand;
  }

  public void setPlayCommand(PlayCommand playCommand) {
    this.playCommand = playCommand;
  }

  public PlayRequest startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * Get startIndex
   * @return startIndex
  */
  
  @Schema(name = "StartIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartIndex")
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }

  public PlayRequest startPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = JsonNullable.of(startPositionTicks);
    return this;
  }

  /**
   * Gets or sets the start position ticks that the first item should be played at.
   * @return startPositionTicks
  */
  
  @Schema(name = "StartPositionTicks", description = "Gets or sets the start position ticks that the first item should be played at.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartPositionTicks")
  public JsonNullable<Long> getStartPositionTicks() {
    return startPositionTicks;
  }

  public void setStartPositionTicks(JsonNullable<Long> startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
  }

  public PlayRequest subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = JsonNullable.of(subtitleStreamIndex);
    return this;
  }

  /**
   * Get subtitleStreamIndex
   * @return subtitleStreamIndex
  */
  
  @Schema(name = "SubtitleStreamIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleStreamIndex")
  public JsonNullable<Integer> getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(JsonNullable<Integer> subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayRequest playRequest = (PlayRequest) o;
    return equalsNullable(this.audioStreamIndex, playRequest.audioStreamIndex) &&
        Objects.equals(this.controllingUserId, playRequest.controllingUserId) &&
        equalsNullable(this.itemIds, playRequest.itemIds) &&
        equalsNullable(this.mediaSourceId, playRequest.mediaSourceId) &&
        Objects.equals(this.playCommand, playRequest.playCommand) &&
        equalsNullable(this.startIndex, playRequest.startIndex) &&
        equalsNullable(this.startPositionTicks, playRequest.startPositionTicks) &&
        equalsNullable(this.subtitleStreamIndex, playRequest.subtitleStreamIndex);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioStreamIndex), controllingUserId, hashCodeNullable(itemIds), hashCodeNullable(mediaSourceId), playCommand, hashCodeNullable(startIndex), hashCodeNullable(startPositionTicks), hashCodeNullable(subtitleStreamIndex));
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
    sb.append("class PlayRequest {\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    playCommand: ").append(toIndentedString(playCommand)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    startPositionTicks: ").append(toIndentedString(startPositionTicks)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
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


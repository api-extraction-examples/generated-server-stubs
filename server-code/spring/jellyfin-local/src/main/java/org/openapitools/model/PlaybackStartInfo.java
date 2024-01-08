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
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.PlayMethod;
import org.openapitools.model.QueueItem;
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
 * Class PlaybackStartInfo.
 */

@Schema(name = "PlaybackStartInfo", description = "Class PlaybackStartInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlaybackStartInfo {

  private JsonNullable<String> aspectRatio = JsonNullable.<String>undefined();

  private JsonNullable<Integer> audioStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> brightness = JsonNullable.<Integer>undefined();

  private Boolean canSeek;

  private Boolean isMuted;

  private Boolean isPaused;

  private BaseItemDto item;

  private UUID itemId;

  private JsonNullable<String> liveStreamId = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaSourceId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid QueueItem>> nowPlayingQueue = JsonNullable.<List<@Valid QueueItem>>undefined();

  private PlayMethod playMethod;

  private JsonNullable<String> playSessionId = JsonNullable.<String>undefined();

  private JsonNullable<Long> playbackStartTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<String> playlistItemId = JsonNullable.<String>undefined();

  private JsonNullable<Long> positionTicks = JsonNullable.<Long>undefined();

  private RepeatMode repeatMode;

  private JsonNullable<String> sessionId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> subtitleStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> volumeLevel = JsonNullable.<Integer>undefined();

  public PlaybackStartInfo aspectRatio(String aspectRatio) {
    this.aspectRatio = JsonNullable.of(aspectRatio);
    return this;
  }

  /**
   * Get aspectRatio
   * @return aspectRatio
  */
  
  @Schema(name = "AspectRatio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AspectRatio")
  public JsonNullable<String> getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(JsonNullable<String> aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public PlaybackStartInfo audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = JsonNullable.of(audioStreamIndex);
    return this;
  }

  /**
   * Gets or sets the index of the audio stream.
   * @return audioStreamIndex
  */
  
  @Schema(name = "AudioStreamIndex", description = "Gets or sets the index of the audio stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioStreamIndex")
  public JsonNullable<Integer> getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(JsonNullable<Integer> audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public PlaybackStartInfo brightness(Integer brightness) {
    this.brightness = JsonNullable.of(brightness);
    return this;
  }

  /**
   * Get brightness
   * @return brightness
  */
  
  @Schema(name = "Brightness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Brightness")
  public JsonNullable<Integer> getBrightness() {
    return brightness;
  }

  public void setBrightness(JsonNullable<Integer> brightness) {
    this.brightness = brightness;
  }

  public PlaybackStartInfo canSeek(Boolean canSeek) {
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

  public PlaybackStartInfo isMuted(Boolean isMuted) {
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

  public PlaybackStartInfo isPaused(Boolean isPaused) {
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

  public PlaybackStartInfo item(BaseItemDto item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @Valid 
  @Schema(name = "Item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Item")
  public BaseItemDto getItem() {
    return item;
  }

  public void setItem(BaseItemDto item) {
    this.item = item;
  }

  public PlaybackStartInfo itemId(UUID itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Gets or sets the item identifier.
   * @return itemId
  */
  @Valid 
  @Schema(name = "ItemId", description = "Gets or sets the item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public UUID getItemId() {
    return itemId;
  }

  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  public PlaybackStartInfo liveStreamId(String liveStreamId) {
    this.liveStreamId = JsonNullable.of(liveStreamId);
    return this;
  }

  /**
   * Gets or sets the live stream identifier.
   * @return liveStreamId
  */
  
  @Schema(name = "LiveStreamId", description = "Gets or sets the live stream identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LiveStreamId")
  public JsonNullable<String> getLiveStreamId() {
    return liveStreamId;
  }

  public void setLiveStreamId(JsonNullable<String> liveStreamId) {
    this.liveStreamId = liveStreamId;
  }

  public PlaybackStartInfo mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = JsonNullable.of(mediaSourceId);
    return this;
  }

  /**
   * Gets or sets the media version identifier.
   * @return mediaSourceId
  */
  
  @Schema(name = "MediaSourceId", description = "Gets or sets the media version identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSourceId")
  public JsonNullable<String> getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(JsonNullable<String> mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlaybackStartInfo nowPlayingQueue(List<@Valid QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = JsonNullable.of(nowPlayingQueue);
    return this;
  }

  public PlaybackStartInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
    if (this.nowPlayingQueue == null || !this.nowPlayingQueue.isPresent()) {
      this.nowPlayingQueue = JsonNullable.of(new ArrayList<>());
    }
    this.nowPlayingQueue.get().add(nowPlayingQueueItem);
    return this;
  }

  /**
   * Get nowPlayingQueue
   * @return nowPlayingQueue
  */
  @Valid 
  @Schema(name = "NowPlayingQueue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NowPlayingQueue")
  public JsonNullable<List<@Valid QueueItem>> getNowPlayingQueue() {
    return nowPlayingQueue;
  }

  public void setNowPlayingQueue(JsonNullable<List<@Valid QueueItem>> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
  }

  public PlaybackStartInfo playMethod(PlayMethod playMethod) {
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

  public PlaybackStartInfo playSessionId(String playSessionId) {
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

  public PlaybackStartInfo playbackStartTimeTicks(Long playbackStartTimeTicks) {
    this.playbackStartTimeTicks = JsonNullable.of(playbackStartTimeTicks);
    return this;
  }

  /**
   * Get playbackStartTimeTicks
   * @return playbackStartTimeTicks
  */
  
  @Schema(name = "PlaybackStartTimeTicks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaybackStartTimeTicks")
  public JsonNullable<Long> getPlaybackStartTimeTicks() {
    return playbackStartTimeTicks;
  }

  public void setPlaybackStartTimeTicks(JsonNullable<Long> playbackStartTimeTicks) {
    this.playbackStartTimeTicks = playbackStartTimeTicks;
  }

  public PlaybackStartInfo playlistItemId(String playlistItemId) {
    this.playlistItemId = JsonNullable.of(playlistItemId);
    return this;
  }

  /**
   * Get playlistItemId
   * @return playlistItemId
  */
  
  @Schema(name = "PlaylistItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public JsonNullable<String> getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(JsonNullable<String> playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public PlaybackStartInfo positionTicks(Long positionTicks) {
    this.positionTicks = JsonNullable.of(positionTicks);
    return this;
  }

  /**
   * Gets or sets the position ticks.
   * @return positionTicks
  */
  
  @Schema(name = "PositionTicks", description = "Gets or sets the position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PositionTicks")
  public JsonNullable<Long> getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(JsonNullable<Long> positionTicks) {
    this.positionTicks = positionTicks;
  }

  public PlaybackStartInfo repeatMode(RepeatMode repeatMode) {
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

  public PlaybackStartInfo sessionId(String sessionId) {
    this.sessionId = JsonNullable.of(sessionId);
    return this;
  }

  /**
   * Gets or sets the session id.
   * @return sessionId
  */
  
  @Schema(name = "SessionId", description = "Gets or sets the session id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SessionId")
  public JsonNullable<String> getSessionId() {
    return sessionId;
  }

  public void setSessionId(JsonNullable<String> sessionId) {
    this.sessionId = sessionId;
  }

  public PlaybackStartInfo subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = JsonNullable.of(subtitleStreamIndex);
    return this;
  }

  /**
   * Gets or sets the index of the subtitle stream.
   * @return subtitleStreamIndex
  */
  
  @Schema(name = "SubtitleStreamIndex", description = "Gets or sets the index of the subtitle stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleStreamIndex")
  public JsonNullable<Integer> getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(JsonNullable<Integer> subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public PlaybackStartInfo volumeLevel(Integer volumeLevel) {
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
    PlaybackStartInfo playbackStartInfo = (PlaybackStartInfo) o;
    return equalsNullable(this.aspectRatio, playbackStartInfo.aspectRatio) &&
        equalsNullable(this.audioStreamIndex, playbackStartInfo.audioStreamIndex) &&
        equalsNullable(this.brightness, playbackStartInfo.brightness) &&
        Objects.equals(this.canSeek, playbackStartInfo.canSeek) &&
        Objects.equals(this.isMuted, playbackStartInfo.isMuted) &&
        Objects.equals(this.isPaused, playbackStartInfo.isPaused) &&
        Objects.equals(this.item, playbackStartInfo.item) &&
        Objects.equals(this.itemId, playbackStartInfo.itemId) &&
        equalsNullable(this.liveStreamId, playbackStartInfo.liveStreamId) &&
        equalsNullable(this.mediaSourceId, playbackStartInfo.mediaSourceId) &&
        equalsNullable(this.nowPlayingQueue, playbackStartInfo.nowPlayingQueue) &&
        Objects.equals(this.playMethod, playbackStartInfo.playMethod) &&
        equalsNullable(this.playSessionId, playbackStartInfo.playSessionId) &&
        equalsNullable(this.playbackStartTimeTicks, playbackStartInfo.playbackStartTimeTicks) &&
        equalsNullable(this.playlistItemId, playbackStartInfo.playlistItemId) &&
        equalsNullable(this.positionTicks, playbackStartInfo.positionTicks) &&
        Objects.equals(this.repeatMode, playbackStartInfo.repeatMode) &&
        equalsNullable(this.sessionId, playbackStartInfo.sessionId) &&
        equalsNullable(this.subtitleStreamIndex, playbackStartInfo.subtitleStreamIndex) &&
        equalsNullable(this.volumeLevel, playbackStartInfo.volumeLevel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(aspectRatio), hashCodeNullable(audioStreamIndex), hashCodeNullable(brightness), canSeek, isMuted, isPaused, item, itemId, hashCodeNullable(liveStreamId), hashCodeNullable(mediaSourceId), hashCodeNullable(nowPlayingQueue), playMethod, hashCodeNullable(playSessionId), hashCodeNullable(playbackStartTimeTicks), hashCodeNullable(playlistItemId), hashCodeNullable(positionTicks), repeatMode, hashCodeNullable(sessionId), hashCodeNullable(subtitleStreamIndex), hashCodeNullable(volumeLevel));
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
    sb.append("class PlaybackStartInfo {\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    nowPlayingQueue: ").append(toIndentedString(nowPlayingQueue)).append("\n");
    sb.append("    playMethod: ").append(toIndentedString(playMethod)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    playbackStartTimeTicks: ").append(toIndentedString(playbackStartTimeTicks)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    repeatMode: ").append(toIndentedString(repeatMode)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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


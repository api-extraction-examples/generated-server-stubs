package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.QueueItem;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class PlaybackStopInfo.
 */

@Schema(name = "PlaybackStopInfo", description = "Class PlaybackStopInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlaybackStopInfo {

  private Boolean failed;

  private BaseItemDto item;

  private UUID itemId;

  private JsonNullable<String> liveStreamId = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaSourceId = JsonNullable.<String>undefined();

  private JsonNullable<String> nextMediaType = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid QueueItem>> nowPlayingQueue = JsonNullable.<List<@Valid QueueItem>>undefined();

  private JsonNullable<String> playSessionId = JsonNullable.<String>undefined();

  private JsonNullable<String> playlistItemId = JsonNullable.<String>undefined();

  private JsonNullable<Long> positionTicks = JsonNullable.<Long>undefined();

  private JsonNullable<String> sessionId = JsonNullable.<String>undefined();

  public PlaybackStopInfo failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is failed.
   * @return failed
  */
  
  @Schema(name = "Failed", description = "Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Failed")
  public Boolean getFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  public PlaybackStopInfo item(BaseItemDto item) {
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

  public PlaybackStopInfo itemId(UUID itemId) {
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

  public PlaybackStopInfo liveStreamId(String liveStreamId) {
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

  public PlaybackStopInfo mediaSourceId(String mediaSourceId) {
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

  public PlaybackStopInfo nextMediaType(String nextMediaType) {
    this.nextMediaType = JsonNullable.of(nextMediaType);
    return this;
  }

  /**
   * Get nextMediaType
   * @return nextMediaType
  */
  
  @Schema(name = "NextMediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NextMediaType")
  public JsonNullable<String> getNextMediaType() {
    return nextMediaType;
  }

  public void setNextMediaType(JsonNullable<String> nextMediaType) {
    this.nextMediaType = nextMediaType;
  }

  public PlaybackStopInfo nowPlayingQueue(List<@Valid QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = JsonNullable.of(nowPlayingQueue);
    return this;
  }

  public PlaybackStopInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
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

  public PlaybackStopInfo playSessionId(String playSessionId) {
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

  public PlaybackStopInfo playlistItemId(String playlistItemId) {
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

  public PlaybackStopInfo positionTicks(Long positionTicks) {
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

  public PlaybackStopInfo sessionId(String sessionId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackStopInfo playbackStopInfo = (PlaybackStopInfo) o;
    return Objects.equals(this.failed, playbackStopInfo.failed) &&
        Objects.equals(this.item, playbackStopInfo.item) &&
        Objects.equals(this.itemId, playbackStopInfo.itemId) &&
        equalsNullable(this.liveStreamId, playbackStopInfo.liveStreamId) &&
        equalsNullable(this.mediaSourceId, playbackStopInfo.mediaSourceId) &&
        equalsNullable(this.nextMediaType, playbackStopInfo.nextMediaType) &&
        equalsNullable(this.nowPlayingQueue, playbackStopInfo.nowPlayingQueue) &&
        equalsNullable(this.playSessionId, playbackStopInfo.playSessionId) &&
        equalsNullable(this.playlistItemId, playbackStopInfo.playlistItemId) &&
        equalsNullable(this.positionTicks, playbackStopInfo.positionTicks) &&
        equalsNullable(this.sessionId, playbackStopInfo.sessionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, item, itemId, hashCodeNullable(liveStreamId), hashCodeNullable(mediaSourceId), hashCodeNullable(nextMediaType), hashCodeNullable(nowPlayingQueue), hashCodeNullable(playSessionId), hashCodeNullable(playlistItemId), hashCodeNullable(positionTicks), hashCodeNullable(sessionId));
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
    sb.append("class PlaybackStopInfo {\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
    sb.append("    nextMediaType: ").append(toIndentedString(nextMediaType)).append("\n");
    sb.append("    nowPlayingQueue: ").append(toIndentedString(nowPlayingQueue)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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


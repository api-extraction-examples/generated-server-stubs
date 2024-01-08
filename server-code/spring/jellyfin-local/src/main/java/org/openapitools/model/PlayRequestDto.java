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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class PlayRequestDto.
 */

@Schema(name = "PlayRequestDto", description = "Class PlayRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlayRequestDto {

  private Integer playingItemPosition;

  @Valid
  private JsonNullable<List<UUID>> playingQueue = JsonNullable.<List<UUID>>undefined();

  private Long startPositionTicks;

  public PlayRequestDto playingItemPosition(Integer playingItemPosition) {
    this.playingItemPosition = playingItemPosition;
    return this;
  }

  /**
   * Gets or sets the position of the playing item in the queue.
   * @return playingItemPosition
  */
  
  @Schema(name = "PlayingItemPosition", description = "Gets or sets the position of the playing item in the queue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayingItemPosition")
  public Integer getPlayingItemPosition() {
    return playingItemPosition;
  }

  public void setPlayingItemPosition(Integer playingItemPosition) {
    this.playingItemPosition = playingItemPosition;
  }

  public PlayRequestDto playingQueue(List<UUID> playingQueue) {
    this.playingQueue = JsonNullable.of(playingQueue);
    return this;
  }

  public PlayRequestDto addPlayingQueueItem(UUID playingQueueItem) {
    if (this.playingQueue == null || !this.playingQueue.isPresent()) {
      this.playingQueue = JsonNullable.of(new ArrayList<>());
    }
    this.playingQueue.get().add(playingQueueItem);
    return this;
  }

  /**
   * Gets or sets the playing queue.
   * @return playingQueue
  */
  @Valid 
  @Schema(name = "PlayingQueue", description = "Gets or sets the playing queue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayingQueue")
  public JsonNullable<List<UUID>> getPlayingQueue() {
    return playingQueue;
  }

  public void setPlayingQueue(JsonNullable<List<UUID>> playingQueue) {
    this.playingQueue = playingQueue;
  }

  public PlayRequestDto startPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
    return this;
  }

  /**
   * Gets or sets the start position ticks.
   * @return startPositionTicks
  */
  
  @Schema(name = "StartPositionTicks", description = "Gets or sets the start position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartPositionTicks")
  public Long getStartPositionTicks() {
    return startPositionTicks;
  }

  public void setStartPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayRequestDto playRequestDto = (PlayRequestDto) o;
    return Objects.equals(this.playingItemPosition, playRequestDto.playingItemPosition) &&
        equalsNullable(this.playingQueue, playRequestDto.playingQueue) &&
        Objects.equals(this.startPositionTicks, playRequestDto.startPositionTicks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(playingItemPosition, hashCodeNullable(playingQueue), startPositionTicks);
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
    sb.append("class PlayRequestDto {\n");
    sb.append("    playingItemPosition: ").append(toIndentedString(playingItemPosition)).append("\n");
    sb.append("    playingQueue: ").append(toIndentedString(playingQueue)).append("\n");
    sb.append("    startPositionTicks: ").append(toIndentedString(startPositionTicks)).append("\n");
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


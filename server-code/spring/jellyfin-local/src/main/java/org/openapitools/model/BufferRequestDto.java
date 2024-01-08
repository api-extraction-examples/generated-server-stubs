package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class BufferRequestDto.
 */

@Schema(name = "BufferRequestDto", description = "Class BufferRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BufferRequestDto {

  private Boolean isPlaying;

  private UUID playlistItemId;

  private Long positionTicks;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime when;

  public BufferRequestDto isPlaying(Boolean isPlaying) {
    this.isPlaying = isPlaying;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the client playback is unpaused.
   * @return isPlaying
  */
  
  @Schema(name = "IsPlaying", description = "Gets or sets a value indicating whether the client playback is unpaused.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPlaying")
  public Boolean getIsPlaying() {
    return isPlaying;
  }

  public void setIsPlaying(Boolean isPlaying) {
    this.isPlaying = isPlaying;
  }

  public BufferRequestDto playlistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

  /**
   * Gets or sets the playlist item identifier of the playing item.
   * @return playlistItemId
  */
  @Valid 
  @Schema(name = "PlaylistItemId", description = "Gets or sets the playlist item identifier of the playing item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public UUID getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public BufferRequestDto positionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
    return this;
  }

  /**
   * Gets or sets the position ticks.
   * @return positionTicks
  */
  
  @Schema(name = "PositionTicks", description = "Gets or sets the position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PositionTicks")
  public Long getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(Long positionTicks) {
    this.positionTicks = positionTicks;
  }

  public BufferRequestDto when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

  /**
   * Gets or sets when the request has been made by the client.
   * @return when
  */
  @Valid 
  @Schema(name = "When", description = "Gets or sets when the request has been made by the client.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("When")
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BufferRequestDto bufferRequestDto = (BufferRequestDto) o;
    return Objects.equals(this.isPlaying, bufferRequestDto.isPlaying) &&
        Objects.equals(this.playlistItemId, bufferRequestDto.playlistItemId) &&
        Objects.equals(this.positionTicks, bufferRequestDto.positionTicks) &&
        Objects.equals(this.when, bufferRequestDto.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPlaying, playlistItemId, positionTicks, when);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BufferRequestDto {\n");
    sb.append("    isPlaying: ").append(toIndentedString(isPlaying)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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


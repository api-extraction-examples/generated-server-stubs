package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class NextItemRequestDto.
 */

@Schema(name = "NextItemRequestDto", description = "Class NextItemRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class NextItemRequestDto {

  private UUID playlistItemId;

  public NextItemRequestDto playlistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

  /**
   * Gets or sets the playing item identifier.
   * @return playlistItemId
  */
  @Valid 
  @Schema(name = "PlaylistItemId", description = "Gets or sets the playing item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public UUID getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextItemRequestDto nextItemRequestDto = (NextItemRequestDto) o;
    return Objects.equals(this.playlistItemId, nextItemRequestDto.playlistItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playlistItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextItemRequestDto {\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
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


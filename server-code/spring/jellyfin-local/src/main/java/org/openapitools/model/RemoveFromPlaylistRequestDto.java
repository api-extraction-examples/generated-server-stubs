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
 * Class RemoveFromPlaylistRequestDto.
 */

@Schema(name = "RemoveFromPlaylistRequestDto", description = "Class RemoveFromPlaylistRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RemoveFromPlaylistRequestDto {

  @Valid
  private JsonNullable<List<UUID>> playlistItemIds = JsonNullable.<List<UUID>>undefined();

  public RemoveFromPlaylistRequestDto playlistItemIds(List<UUID> playlistItemIds) {
    this.playlistItemIds = JsonNullable.of(playlistItemIds);
    return this;
  }

  public RemoveFromPlaylistRequestDto addPlaylistItemIdsItem(UUID playlistItemIdsItem) {
    if (this.playlistItemIds == null || !this.playlistItemIds.isPresent()) {
      this.playlistItemIds = JsonNullable.of(new ArrayList<>());
    }
    this.playlistItemIds.get().add(playlistItemIdsItem);
    return this;
  }

  /**
   * Gets or sets the playlist identifiers ot the items.
   * @return playlistItemIds
  */
  @Valid 
  @Schema(name = "PlaylistItemIds", description = "Gets or sets the playlist identifiers ot the items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemIds")
  public JsonNullable<List<UUID>> getPlaylistItemIds() {
    return playlistItemIds;
  }

  public void setPlaylistItemIds(JsonNullable<List<UUID>> playlistItemIds) {
    this.playlistItemIds = playlistItemIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveFromPlaylistRequestDto removeFromPlaylistRequestDto = (RemoveFromPlaylistRequestDto) o;
    return equalsNullable(this.playlistItemIds, removeFromPlaylistRequestDto.playlistItemIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(playlistItemIds));
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
    sb.append("class RemoveFromPlaylistRequestDto {\n");
    sb.append("    playlistItemIds: ").append(toIndentedString(playlistItemIds)).append("\n");
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


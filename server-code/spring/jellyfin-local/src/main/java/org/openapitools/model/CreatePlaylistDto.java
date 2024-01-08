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
 * Create new playlist dto.
 */

@Schema(name = "CreatePlaylistDto", description = "Create new playlist dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class CreatePlaylistDto {

  @Valid
  private JsonNullable<List<UUID>> ids = JsonNullable.<List<UUID>>undefined();

  private JsonNullable<String> mediaType = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public CreatePlaylistDto ids(List<UUID> ids) {
    this.ids = JsonNullable.of(ids);
    return this;
  }

  public CreatePlaylistDto addIdsItem(UUID idsItem) {
    if (this.ids == null || !this.ids.isPresent()) {
      this.ids = JsonNullable.of(new ArrayList<>());
    }
    this.ids.get().add(idsItem);
    return this;
  }

  /**
   * Gets or sets item ids to add to the playlist.
   * @return ids
  */
  @Valid 
  @Schema(name = "Ids", description = "Gets or sets item ids to add to the playlist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ids")
  public JsonNullable<List<UUID>> getIds() {
    return ids;
  }

  public void setIds(JsonNullable<List<UUID>> ids) {
    this.ids = ids;
  }

  public CreatePlaylistDto mediaType(String mediaType) {
    this.mediaType = JsonNullable.of(mediaType);
    return this;
  }

  /**
   * Gets or sets the media type.
   * @return mediaType
  */
  
  @Schema(name = "MediaType", description = "Gets or sets the media type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaType")
  public JsonNullable<String> getMediaType() {
    return mediaType;
  }

  public void setMediaType(JsonNullable<String> mediaType) {
    this.mediaType = mediaType;
  }

  public CreatePlaylistDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name of the new playlist.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name of the new playlist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CreatePlaylistDto userId(UUID userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Gets or sets the user id.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public JsonNullable<UUID> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<UUID> userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlaylistDto createPlaylistDto = (CreatePlaylistDto) o;
    return equalsNullable(this.ids, createPlaylistDto.ids) &&
        equalsNullable(this.mediaType, createPlaylistDto.mediaType) &&
        equalsNullable(this.name, createPlaylistDto.name) &&
        equalsNullable(this.userId, createPlaylistDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ids), hashCodeNullable(mediaType), hashCodeNullable(name), hashCodeNullable(userId));
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
    sb.append("class CreatePlaylistDto {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


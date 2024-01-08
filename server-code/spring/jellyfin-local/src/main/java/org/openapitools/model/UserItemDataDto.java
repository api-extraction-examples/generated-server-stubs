package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class UserItemDataDto.
 */

@Schema(name = "UserItemDataDto", description = "Class UserItemDataDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UserItemDataDto {

  private Boolean isFavorite;

  private JsonNullable<String> itemId = JsonNullable.<String>undefined();

  private JsonNullable<String> key = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastPlayedDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> likes = JsonNullable.<Boolean>undefined();

  private Integer playCount;

  private Long playbackPositionTicks;

  private Boolean played;

  private JsonNullable<Double> playedPercentage = JsonNullable.<Double>undefined();

  private JsonNullable<Double> rating = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> unplayedItemCount = JsonNullable.<Integer>undefined();

  public UserItemDataDto isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is favorite.
   * @return isFavorite
  */
  
  @Schema(name = "IsFavorite", description = "Gets or sets a value indicating whether this instance is favorite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsFavorite")
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public UserItemDataDto itemId(String itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * Gets or sets the item identifier.
   * @return itemId
  */
  
  @Schema(name = "ItemId", description = "Gets or sets the item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public JsonNullable<String> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<String> itemId) {
    this.itemId = itemId;
  }

  public UserItemDataDto key(String key) {
    this.key = JsonNullable.of(key);
    return this;
  }

  /**
   * Gets or sets the key.
   * @return key
  */
  
  @Schema(name = "Key", description = "Gets or sets the key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Key")
  public JsonNullable<String> getKey() {
    return key;
  }

  public void setKey(JsonNullable<String> key) {
    this.key = key;
  }

  public UserItemDataDto lastPlayedDate(OffsetDateTime lastPlayedDate) {
    this.lastPlayedDate = JsonNullable.of(lastPlayedDate);
    return this;
  }

  /**
   * Gets or sets the last played date.
   * @return lastPlayedDate
  */
  @Valid 
  @Schema(name = "LastPlayedDate", description = "Gets or sets the last played date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPlayedDate")
  public JsonNullable<OffsetDateTime> getLastPlayedDate() {
    return lastPlayedDate;
  }

  public void setLastPlayedDate(JsonNullable<OffsetDateTime> lastPlayedDate) {
    this.lastPlayedDate = lastPlayedDate;
  }

  public UserItemDataDto likes(Boolean likes) {
    this.likes = JsonNullable.of(likes);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is likes.
   * @return likes
  */
  
  @Schema(name = "Likes", description = "Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is likes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Likes")
  public JsonNullable<Boolean> getLikes() {
    return likes;
  }

  public void setLikes(JsonNullable<Boolean> likes) {
    this.likes = likes;
  }

  public UserItemDataDto playCount(Integer playCount) {
    this.playCount = playCount;
    return this;
  }

  /**
   * Gets or sets the play count.
   * @return playCount
  */
  
  @Schema(name = "PlayCount", description = "Gets or sets the play count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayCount")
  public Integer getPlayCount() {
    return playCount;
  }

  public void setPlayCount(Integer playCount) {
    this.playCount = playCount;
  }

  public UserItemDataDto playbackPositionTicks(Long playbackPositionTicks) {
    this.playbackPositionTicks = playbackPositionTicks;
    return this;
  }

  /**
   * Gets or sets the playback position ticks.
   * @return playbackPositionTicks
  */
  
  @Schema(name = "PlaybackPositionTicks", description = "Gets or sets the playback position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaybackPositionTicks")
  public Long getPlaybackPositionTicks() {
    return playbackPositionTicks;
  }

  public void setPlaybackPositionTicks(Long playbackPositionTicks) {
    this.playbackPositionTicks = playbackPositionTicks;
  }

  public UserItemDataDto played(Boolean played) {
    this.played = played;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is played.
   * @return played
  */
  
  @Schema(name = "Played", description = "Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is played.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Played")
  public Boolean getPlayed() {
    return played;
  }

  public void setPlayed(Boolean played) {
    this.played = played;
  }

  public UserItemDataDto playedPercentage(Double playedPercentage) {
    this.playedPercentage = JsonNullable.of(playedPercentage);
    return this;
  }

  /**
   * Gets or sets the played percentage.
   * @return playedPercentage
  */
  
  @Schema(name = "PlayedPercentage", description = "Gets or sets the played percentage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayedPercentage")
  public JsonNullable<Double> getPlayedPercentage() {
    return playedPercentage;
  }

  public void setPlayedPercentage(JsonNullable<Double> playedPercentage) {
    this.playedPercentage = playedPercentage;
  }

  public UserItemDataDto rating(Double rating) {
    this.rating = JsonNullable.of(rating);
    return this;
  }

  /**
   * Gets or sets the rating.
   * @return rating
  */
  
  @Schema(name = "Rating", description = "Gets or sets the rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Rating")
  public JsonNullable<Double> getRating() {
    return rating;
  }

  public void setRating(JsonNullable<Double> rating) {
    this.rating = rating;
  }

  public UserItemDataDto unplayedItemCount(Integer unplayedItemCount) {
    this.unplayedItemCount = JsonNullable.of(unplayedItemCount);
    return this;
  }

  /**
   * Gets or sets the unplayed item count.
   * @return unplayedItemCount
  */
  
  @Schema(name = "UnplayedItemCount", description = "Gets or sets the unplayed item count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnplayedItemCount")
  public JsonNullable<Integer> getUnplayedItemCount() {
    return unplayedItemCount;
  }

  public void setUnplayedItemCount(JsonNullable<Integer> unplayedItemCount) {
    this.unplayedItemCount = unplayedItemCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserItemDataDto userItemDataDto = (UserItemDataDto) o;
    return Objects.equals(this.isFavorite, userItemDataDto.isFavorite) &&
        equalsNullable(this.itemId, userItemDataDto.itemId) &&
        equalsNullable(this.key, userItemDataDto.key) &&
        equalsNullable(this.lastPlayedDate, userItemDataDto.lastPlayedDate) &&
        equalsNullable(this.likes, userItemDataDto.likes) &&
        Objects.equals(this.playCount, userItemDataDto.playCount) &&
        Objects.equals(this.playbackPositionTicks, userItemDataDto.playbackPositionTicks) &&
        Objects.equals(this.played, userItemDataDto.played) &&
        equalsNullable(this.playedPercentage, userItemDataDto.playedPercentage) &&
        equalsNullable(this.rating, userItemDataDto.rating) &&
        equalsNullable(this.unplayedItemCount, userItemDataDto.unplayedItemCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFavorite, hashCodeNullable(itemId), hashCodeNullable(key), hashCodeNullable(lastPlayedDate), hashCodeNullable(likes), playCount, playbackPositionTicks, played, hashCodeNullable(playedPercentage), hashCodeNullable(rating), hashCodeNullable(unplayedItemCount));
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
    sb.append("class UserItemDataDto {\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastPlayedDate: ").append(toIndentedString(lastPlayedDate)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    playCount: ").append(toIndentedString(playCount)).append("\n");
    sb.append("    playbackPositionTicks: ").append(toIndentedString(playbackPositionTicks)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    playedPercentage: ").append(toIndentedString(playedPercentage)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    unplayedItemCount: ").append(toIndentedString(unplayedItemCount)).append("\n");
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


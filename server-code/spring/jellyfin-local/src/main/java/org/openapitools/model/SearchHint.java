package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
 * Class SearchHintResult.
 */

@Schema(name = "SearchHint", description = "Class SearchHintResult.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SearchHint {

  private JsonNullable<String> album = JsonNullable.<String>undefined();

  private JsonNullable<String> albumArtist = JsonNullable.<String>undefined();

  private UUID albumId;

  @Valid
  private JsonNullable<List<String>> artists = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> backdropImageItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> backdropImageTag = JsonNullable.<String>undefined();

  private UUID channelId;

  private JsonNullable<String> channelName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> episodeCount = JsonNullable.<Integer>undefined();

  private UUID id;

  private JsonNullable<Integer> indexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> isFolder = JsonNullable.<Boolean>undefined();

  private UUID itemId;

  private JsonNullable<String> matchedTerm = JsonNullable.<String>undefined();

  private JsonNullable<String> mediaType = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<Integer> parentIndexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<Double> primaryImageAspectRatio = JsonNullable.<Double>undefined();

  private JsonNullable<String> primaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<Integer> productionYear = JsonNullable.<Integer>undefined();

  private JsonNullable<Long> runTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<String> series = JsonNullable.<String>undefined();

  private JsonNullable<Integer> songCount = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> status = JsonNullable.<String>undefined();

  private JsonNullable<String> thumbImageItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> thumbImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public SearchHint album(String album) {
    this.album = JsonNullable.of(album);
    return this;
  }

  /**
   * Gets or sets the album.
   * @return album
  */
  
  @Schema(name = "Album", description = "Gets or sets the album.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Album")
  public JsonNullable<String> getAlbum() {
    return album;
  }

  public void setAlbum(JsonNullable<String> album) {
    this.album = album;
  }

  public SearchHint albumArtist(String albumArtist) {
    this.albumArtist = JsonNullable.of(albumArtist);
    return this;
  }

  /**
   * Gets or sets the album artist.
   * @return albumArtist
  */
  
  @Schema(name = "AlbumArtist", description = "Gets or sets the album artist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumArtist")
  public JsonNullable<String> getAlbumArtist() {
    return albumArtist;
  }

  public void setAlbumArtist(JsonNullable<String> albumArtist) {
    this.albumArtist = albumArtist;
  }

  public SearchHint albumId(UUID albumId) {
    this.albumId = albumId;
    return this;
  }

  /**
   * Get albumId
   * @return albumId
  */
  @Valid 
  @Schema(name = "AlbumId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumId")
  public UUID getAlbumId() {
    return albumId;
  }

  public void setAlbumId(UUID albumId) {
    this.albumId = albumId;
  }

  public SearchHint artists(List<String> artists) {
    this.artists = JsonNullable.of(artists);
    return this;
  }

  public SearchHint addArtistsItem(String artistsItem) {
    if (this.artists == null || !this.artists.isPresent()) {
      this.artists = JsonNullable.of(new ArrayList<>());
    }
    this.artists.get().add(artistsItem);
    return this;
  }

  /**
   * Gets or sets the artists.
   * @return artists
  */
  
  @Schema(name = "Artists", description = "Gets or sets the artists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Artists")
  public JsonNullable<List<String>> getArtists() {
    return artists;
  }

  public void setArtists(JsonNullable<List<String>> artists) {
    this.artists = artists;
  }

  public SearchHint backdropImageItemId(String backdropImageItemId) {
    this.backdropImageItemId = JsonNullable.of(backdropImageItemId);
    return this;
  }

  /**
   * Gets or sets the backdrop image item identifier.
   * @return backdropImageItemId
  */
  
  @Schema(name = "BackdropImageItemId", description = "Gets or sets the backdrop image item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BackdropImageItemId")
  public JsonNullable<String> getBackdropImageItemId() {
    return backdropImageItemId;
  }

  public void setBackdropImageItemId(JsonNullable<String> backdropImageItemId) {
    this.backdropImageItemId = backdropImageItemId;
  }

  public SearchHint backdropImageTag(String backdropImageTag) {
    this.backdropImageTag = JsonNullable.of(backdropImageTag);
    return this;
  }

  /**
   * Gets or sets the backdrop image tag.
   * @return backdropImageTag
  */
  
  @Schema(name = "BackdropImageTag", description = "Gets or sets the backdrop image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BackdropImageTag")
  public JsonNullable<String> getBackdropImageTag() {
    return backdropImageTag;
  }

  public void setBackdropImageTag(JsonNullable<String> backdropImageTag) {
    this.backdropImageTag = backdropImageTag;
  }

  public SearchHint channelId(UUID channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Gets or sets the channel identifier.
   * @return channelId
  */
  @Valid 
  @Schema(name = "ChannelId", description = "Gets or sets the channel identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelId")
  public UUID getChannelId() {
    return channelId;
  }

  public void setChannelId(UUID channelId) {
    this.channelId = channelId;
  }

  public SearchHint channelName(String channelName) {
    this.channelName = JsonNullable.of(channelName);
    return this;
  }

  /**
   * Gets or sets the name of the channel.
   * @return channelName
  */
  
  @Schema(name = "ChannelName", description = "Gets or sets the name of the channel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelName")
  public JsonNullable<String> getChannelName() {
    return channelName;
  }

  public void setChannelName(JsonNullable<String> channelName) {
    this.channelName = channelName;
  }

  public SearchHint endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public SearchHint episodeCount(Integer episodeCount) {
    this.episodeCount = JsonNullable.of(episodeCount);
    return this;
  }

  /**
   * Gets or sets the episode count.
   * @return episodeCount
  */
  
  @Schema(name = "EpisodeCount", description = "Gets or sets the episode count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EpisodeCount")
  public JsonNullable<Integer> getEpisodeCount() {
    return episodeCount;
  }

  public void setEpisodeCount(JsonNullable<Integer> episodeCount) {
    this.episodeCount = episodeCount;
  }

  public SearchHint id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public SearchHint indexNumber(Integer indexNumber) {
    this.indexNumber = JsonNullable.of(indexNumber);
    return this;
  }

  /**
   * Gets or sets the index number.
   * @return indexNumber
  */
  
  @Schema(name = "IndexNumber", description = "Gets or sets the index number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumber")
  public JsonNullable<Integer> getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(JsonNullable<Integer> indexNumber) {
    this.indexNumber = indexNumber;
  }

  public SearchHint isFolder(Boolean isFolder) {
    this.isFolder = JsonNullable.of(isFolder);
    return this;
  }

  /**
   * Get isFolder
   * @return isFolder
  */
  
  @Schema(name = "IsFolder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsFolder")
  public JsonNullable<Boolean> getIsFolder() {
    return isFolder;
  }

  public void setIsFolder(JsonNullable<Boolean> isFolder) {
    this.isFolder = isFolder;
  }

  public SearchHint itemId(UUID itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Gets or sets the item id.
   * @return itemId
  */
  @Valid 
  @Schema(name = "ItemId", description = "Gets or sets the item id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public UUID getItemId() {
    return itemId;
  }

  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  public SearchHint matchedTerm(String matchedTerm) {
    this.matchedTerm = JsonNullable.of(matchedTerm);
    return this;
  }

  /**
   * Gets or sets the matched term.
   * @return matchedTerm
  */
  
  @Schema(name = "MatchedTerm", description = "Gets or sets the matched term.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MatchedTerm")
  public JsonNullable<String> getMatchedTerm() {
    return matchedTerm;
  }

  public void setMatchedTerm(JsonNullable<String> matchedTerm) {
    this.matchedTerm = matchedTerm;
  }

  public SearchHint mediaType(String mediaType) {
    this.mediaType = JsonNullable.of(mediaType);
    return this;
  }

  /**
   * Gets or sets the type of the media.
   * @return mediaType
  */
  
  @Schema(name = "MediaType", description = "Gets or sets the type of the media.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaType")
  public JsonNullable<String> getMediaType() {
    return mediaType;
  }

  public void setMediaType(JsonNullable<String> mediaType) {
    this.mediaType = mediaType;
  }

  public SearchHint name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public SearchHint parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = JsonNullable.of(parentIndexNumber);
    return this;
  }

  /**
   * Gets or sets the parent index number.
   * @return parentIndexNumber
  */
  
  @Schema(name = "ParentIndexNumber", description = "Gets or sets the parent index number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentIndexNumber")
  public JsonNullable<Integer> getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(JsonNullable<Integer> parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public SearchHint primaryImageAspectRatio(Double primaryImageAspectRatio) {
    this.primaryImageAspectRatio = JsonNullable.of(primaryImageAspectRatio);
    return this;
  }

  /**
   * Gets or sets the primary image aspect ratio.
   * @return primaryImageAspectRatio
  */
  
  @Schema(name = "PrimaryImageAspectRatio", description = "Gets or sets the primary image aspect ratio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageAspectRatio")
  public JsonNullable<Double> getPrimaryImageAspectRatio() {
    return primaryImageAspectRatio;
  }

  public void setPrimaryImageAspectRatio(JsonNullable<Double> primaryImageAspectRatio) {
    this.primaryImageAspectRatio = primaryImageAspectRatio;
  }

  public SearchHint primaryImageTag(String primaryImageTag) {
    this.primaryImageTag = JsonNullable.of(primaryImageTag);
    return this;
  }

  /**
   * Gets or sets the image tag.
   * @return primaryImageTag
  */
  
  @Schema(name = "PrimaryImageTag", description = "Gets or sets the image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageTag")
  public JsonNullable<String> getPrimaryImageTag() {
    return primaryImageTag;
  }

  public void setPrimaryImageTag(JsonNullable<String> primaryImageTag) {
    this.primaryImageTag = primaryImageTag;
  }

  public SearchHint productionYear(Integer productionYear) {
    this.productionYear = JsonNullable.of(productionYear);
    return this;
  }

  /**
   * Gets or sets the production year.
   * @return productionYear
  */
  
  @Schema(name = "ProductionYear", description = "Gets or sets the production year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductionYear")
  public JsonNullable<Integer> getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(JsonNullable<Integer> productionYear) {
    this.productionYear = productionYear;
  }

  public SearchHint runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = JsonNullable.of(runTimeTicks);
    return this;
  }

  /**
   * Gets or sets the run time ticks.
   * @return runTimeTicks
  */
  
  @Schema(name = "RunTimeTicks", description = "Gets or sets the run time ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RunTimeTicks")
  public JsonNullable<Long> getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(JsonNullable<Long> runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public SearchHint series(String series) {
    this.series = JsonNullable.of(series);
    return this;
  }

  /**
   * Gets or sets the series.
   * @return series
  */
  
  @Schema(name = "Series", description = "Gets or sets the series.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Series")
  public JsonNullable<String> getSeries() {
    return series;
  }

  public void setSeries(JsonNullable<String> series) {
    this.series = series;
  }

  public SearchHint songCount(Integer songCount) {
    this.songCount = JsonNullable.of(songCount);
    return this;
  }

  /**
   * Gets or sets the song count.
   * @return songCount
  */
  
  @Schema(name = "SongCount", description = "Gets or sets the song count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SongCount")
  public JsonNullable<Integer> getSongCount() {
    return songCount;
  }

  public void setSongCount(JsonNullable<Integer> songCount) {
    this.songCount = songCount;
  }

  public SearchHint startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public SearchHint status(String status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public JsonNullable<String> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<String> status) {
    this.status = status;
  }

  public SearchHint thumbImageItemId(String thumbImageItemId) {
    this.thumbImageItemId = JsonNullable.of(thumbImageItemId);
    return this;
  }

  /**
   * Gets or sets the thumb image item identifier.
   * @return thumbImageItemId
  */
  
  @Schema(name = "ThumbImageItemId", description = "Gets or sets the thumb image item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThumbImageItemId")
  public JsonNullable<String> getThumbImageItemId() {
    return thumbImageItemId;
  }

  public void setThumbImageItemId(JsonNullable<String> thumbImageItemId) {
    this.thumbImageItemId = thumbImageItemId;
  }

  public SearchHint thumbImageTag(String thumbImageTag) {
    this.thumbImageTag = JsonNullable.of(thumbImageTag);
    return this;
  }

  /**
   * Gets or sets the thumb image tag.
   * @return thumbImageTag
  */
  
  @Schema(name = "ThumbImageTag", description = "Gets or sets the thumb image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ThumbImageTag")
  public JsonNullable<String> getThumbImageTag() {
    return thumbImageTag;
  }

  public void setThumbImageTag(JsonNullable<String> thumbImageTag) {
    this.thumbImageTag = thumbImageTag;
  }

  public SearchHint type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchHint searchHint = (SearchHint) o;
    return equalsNullable(this.album, searchHint.album) &&
        equalsNullable(this.albumArtist, searchHint.albumArtist) &&
        Objects.equals(this.albumId, searchHint.albumId) &&
        equalsNullable(this.artists, searchHint.artists) &&
        equalsNullable(this.backdropImageItemId, searchHint.backdropImageItemId) &&
        equalsNullable(this.backdropImageTag, searchHint.backdropImageTag) &&
        Objects.equals(this.channelId, searchHint.channelId) &&
        equalsNullable(this.channelName, searchHint.channelName) &&
        equalsNullable(this.endDate, searchHint.endDate) &&
        equalsNullable(this.episodeCount, searchHint.episodeCount) &&
        Objects.equals(this.id, searchHint.id) &&
        equalsNullable(this.indexNumber, searchHint.indexNumber) &&
        equalsNullable(this.isFolder, searchHint.isFolder) &&
        Objects.equals(this.itemId, searchHint.itemId) &&
        equalsNullable(this.matchedTerm, searchHint.matchedTerm) &&
        equalsNullable(this.mediaType, searchHint.mediaType) &&
        equalsNullable(this.name, searchHint.name) &&
        equalsNullable(this.parentIndexNumber, searchHint.parentIndexNumber) &&
        equalsNullable(this.primaryImageAspectRatio, searchHint.primaryImageAspectRatio) &&
        equalsNullable(this.primaryImageTag, searchHint.primaryImageTag) &&
        equalsNullable(this.productionYear, searchHint.productionYear) &&
        equalsNullable(this.runTimeTicks, searchHint.runTimeTicks) &&
        equalsNullable(this.series, searchHint.series) &&
        equalsNullable(this.songCount, searchHint.songCount) &&
        equalsNullable(this.startDate, searchHint.startDate) &&
        equalsNullable(this.status, searchHint.status) &&
        equalsNullable(this.thumbImageItemId, searchHint.thumbImageItemId) &&
        equalsNullable(this.thumbImageTag, searchHint.thumbImageTag) &&
        equalsNullable(this.type, searchHint.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(album), hashCodeNullable(albumArtist), albumId, hashCodeNullable(artists), hashCodeNullable(backdropImageItemId), hashCodeNullable(backdropImageTag), channelId, hashCodeNullable(channelName), hashCodeNullable(endDate), hashCodeNullable(episodeCount), id, hashCodeNullable(indexNumber), hashCodeNullable(isFolder), itemId, hashCodeNullable(matchedTerm), hashCodeNullable(mediaType), hashCodeNullable(name), hashCodeNullable(parentIndexNumber), hashCodeNullable(primaryImageAspectRatio), hashCodeNullable(primaryImageTag), hashCodeNullable(productionYear), hashCodeNullable(runTimeTicks), hashCodeNullable(series), hashCodeNullable(songCount), hashCodeNullable(startDate), hashCodeNullable(status), hashCodeNullable(thumbImageItemId), hashCodeNullable(thumbImageTag), hashCodeNullable(type));
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
    sb.append("class SearchHint {\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
    sb.append("    albumArtist: ").append(toIndentedString(albumArtist)).append("\n");
    sb.append("    albumId: ").append(toIndentedString(albumId)).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    backdropImageItemId: ").append(toIndentedString(backdropImageItemId)).append("\n");
    sb.append("    backdropImageTag: ").append(toIndentedString(backdropImageTag)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    matchedTerm: ").append(toIndentedString(matchedTerm)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    primaryImageAspectRatio: ").append(toIndentedString(primaryImageAspectRatio)).append("\n");
    sb.append("    primaryImageTag: ").append(toIndentedString(primaryImageTag)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    songCount: ").append(toIndentedString(songCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbImageItemId: ").append(toIndentedString(thumbImageItemId)).append("\n");
    sb.append("    thumbImageTag: ").append(toIndentedString(thumbImageTag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


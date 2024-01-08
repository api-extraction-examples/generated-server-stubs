package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class LibrarySummary.
 */

@Schema(name = "ItemCounts", description = "Class LibrarySummary.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ItemCounts {

  private Integer albumCount;

  private Integer artistCount;

  private Integer bookCount;

  private Integer boxSetCount;

  private Integer episodeCount;

  private Integer itemCount;

  private Integer movieCount;

  private Integer musicVideoCount;

  private Integer programCount;

  private Integer seriesCount;

  private Integer songCount;

  private Integer trailerCount;

  public ItemCounts albumCount(Integer albumCount) {
    this.albumCount = albumCount;
    return this;
  }

  /**
   * Gets or sets the album count.
   * @return albumCount
  */
  
  @Schema(name = "AlbumCount", description = "Gets or sets the album count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AlbumCount")
  public Integer getAlbumCount() {
    return albumCount;
  }

  public void setAlbumCount(Integer albumCount) {
    this.albumCount = albumCount;
  }

  public ItemCounts artistCount(Integer artistCount) {
    this.artistCount = artistCount;
    return this;
  }

  /**
   * Gets or sets the artist count.
   * @return artistCount
  */
  
  @Schema(name = "ArtistCount", description = "Gets or sets the artist count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ArtistCount")
  public Integer getArtistCount() {
    return artistCount;
  }

  public void setArtistCount(Integer artistCount) {
    this.artistCount = artistCount;
  }

  public ItemCounts bookCount(Integer bookCount) {
    this.bookCount = bookCount;
    return this;
  }

  /**
   * Gets or sets the book count.
   * @return bookCount
  */
  
  @Schema(name = "BookCount", description = "Gets or sets the book count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BookCount")
  public Integer getBookCount() {
    return bookCount;
  }

  public void setBookCount(Integer bookCount) {
    this.bookCount = bookCount;
  }

  public ItemCounts boxSetCount(Integer boxSetCount) {
    this.boxSetCount = boxSetCount;
    return this;
  }

  /**
   * Gets or sets the box set count.
   * @return boxSetCount
  */
  
  @Schema(name = "BoxSetCount", description = "Gets or sets the box set count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BoxSetCount")
  public Integer getBoxSetCount() {
    return boxSetCount;
  }

  public void setBoxSetCount(Integer boxSetCount) {
    this.boxSetCount = boxSetCount;
  }

  public ItemCounts episodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
    return this;
  }

  /**
   * Gets or sets the episode count.
   * @return episodeCount
  */
  
  @Schema(name = "EpisodeCount", description = "Gets or sets the episode count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EpisodeCount")
  public Integer getEpisodeCount() {
    return episodeCount;
  }

  public void setEpisodeCount(Integer episodeCount) {
    this.episodeCount = episodeCount;
  }

  public ItemCounts itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Gets or sets the item count.
   * @return itemCount
  */
  
  @Schema(name = "ItemCount", description = "Gets or sets the item count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemCount")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  public ItemCounts movieCount(Integer movieCount) {
    this.movieCount = movieCount;
    return this;
  }

  /**
   * Gets or sets the movie count.
   * @return movieCount
  */
  
  @Schema(name = "MovieCount", description = "Gets or sets the movie count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MovieCount")
  public Integer getMovieCount() {
    return movieCount;
  }

  public void setMovieCount(Integer movieCount) {
    this.movieCount = movieCount;
  }

  public ItemCounts musicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
    return this;
  }

  /**
   * Gets or sets the music video count.
   * @return musicVideoCount
  */
  
  @Schema(name = "MusicVideoCount", description = "Gets or sets the music video count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MusicVideoCount")
  public Integer getMusicVideoCount() {
    return musicVideoCount;
  }

  public void setMusicVideoCount(Integer musicVideoCount) {
    this.musicVideoCount = musicVideoCount;
  }

  public ItemCounts programCount(Integer programCount) {
    this.programCount = programCount;
    return this;
  }

  /**
   * Gets or sets the program count.
   * @return programCount
  */
  
  @Schema(name = "ProgramCount", description = "Gets or sets the program count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramCount")
  public Integer getProgramCount() {
    return programCount;
  }

  public void setProgramCount(Integer programCount) {
    this.programCount = programCount;
  }

  public ItemCounts seriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
    return this;
  }

  /**
   * Gets or sets the series count.
   * @return seriesCount
  */
  
  @Schema(name = "SeriesCount", description = "Gets or sets the series count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesCount")
  public Integer getSeriesCount() {
    return seriesCount;
  }

  public void setSeriesCount(Integer seriesCount) {
    this.seriesCount = seriesCount;
  }

  public ItemCounts songCount(Integer songCount) {
    this.songCount = songCount;
    return this;
  }

  /**
   * Gets or sets the song count.
   * @return songCount
  */
  
  @Schema(name = "SongCount", description = "Gets or sets the song count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SongCount")
  public Integer getSongCount() {
    return songCount;
  }

  public void setSongCount(Integer songCount) {
    this.songCount = songCount;
  }

  public ItemCounts trailerCount(Integer trailerCount) {
    this.trailerCount = trailerCount;
    return this;
  }

  /**
   * Gets or sets the trailer count.
   * @return trailerCount
  */
  
  @Schema(name = "TrailerCount", description = "Gets or sets the trailer count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrailerCount")
  public Integer getTrailerCount() {
    return trailerCount;
  }

  public void setTrailerCount(Integer trailerCount) {
    this.trailerCount = trailerCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCounts itemCounts = (ItemCounts) o;
    return Objects.equals(this.albumCount, itemCounts.albumCount) &&
        Objects.equals(this.artistCount, itemCounts.artistCount) &&
        Objects.equals(this.bookCount, itemCounts.bookCount) &&
        Objects.equals(this.boxSetCount, itemCounts.boxSetCount) &&
        Objects.equals(this.episodeCount, itemCounts.episodeCount) &&
        Objects.equals(this.itemCount, itemCounts.itemCount) &&
        Objects.equals(this.movieCount, itemCounts.movieCount) &&
        Objects.equals(this.musicVideoCount, itemCounts.musicVideoCount) &&
        Objects.equals(this.programCount, itemCounts.programCount) &&
        Objects.equals(this.seriesCount, itemCounts.seriesCount) &&
        Objects.equals(this.songCount, itemCounts.songCount) &&
        Objects.equals(this.trailerCount, itemCounts.trailerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(albumCount, artistCount, bookCount, boxSetCount, episodeCount, itemCount, movieCount, musicVideoCount, programCount, seriesCount, songCount, trailerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCounts {\n");
    sb.append("    albumCount: ").append(toIndentedString(albumCount)).append("\n");
    sb.append("    artistCount: ").append(toIndentedString(artistCount)).append("\n");
    sb.append("    bookCount: ").append(toIndentedString(bookCount)).append("\n");
    sb.append("    boxSetCount: ").append(toIndentedString(boxSetCount)).append("\n");
    sb.append("    episodeCount: ").append(toIndentedString(episodeCount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("    movieCount: ").append(toIndentedString(movieCount)).append("\n");
    sb.append("    musicVideoCount: ").append(toIndentedString(musicVideoCount)).append("\n");
    sb.append("    programCount: ").append(toIndentedString(programCount)).append("\n");
    sb.append("    seriesCount: ").append(toIndentedString(seriesCount)).append("\n");
    sb.append("    songCount: ").append(toIndentedString(songCount)).append("\n");
    sb.append("    trailerCount: ").append(toIndentedString(trailerCount)).append("\n");
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


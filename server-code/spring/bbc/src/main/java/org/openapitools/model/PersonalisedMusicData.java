package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PersonalisedMusicArtist;
import org.openapitools.model.PersonalisedMusicClip;
import org.openapitools.model.PersonalisedMusicGenre;
import org.openapitools.model.PersonalisedMusicPlaylist;
import org.openapitools.model.PersonalisedMusicService;
import org.openapitools.model.PersonalisedMusicTrack;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicData {

  private PersonalisedMusicArtist artist;

  private PersonalisedMusicClip clip;

  private PersonalisedMusicGenre genre;

  private PersonalisedMusicPlaylist playlist;

  private PersonalisedMusicService service;

  private PersonalisedMusicTrack track;

  public PersonalisedMusicData artist(PersonalisedMusicArtist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Get artist
   * @return artist
  */
  @Valid 
  @Schema(name = "artist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("artist")
  public PersonalisedMusicArtist getArtist() {
    return artist;
  }

  public void setArtist(PersonalisedMusicArtist artist) {
    this.artist = artist;
  }

  public PersonalisedMusicData clip(PersonalisedMusicClip clip) {
    this.clip = clip;
    return this;
  }

  /**
   * Get clip
   * @return clip
  */
  @Valid 
  @Schema(name = "clip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clip")
  public PersonalisedMusicClip getClip() {
    return clip;
  }

  public void setClip(PersonalisedMusicClip clip) {
    this.clip = clip;
  }

  public PersonalisedMusicData genre(PersonalisedMusicGenre genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
  */
  @Valid 
  @Schema(name = "genre", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genre")
  public PersonalisedMusicGenre getGenre() {
    return genre;
  }

  public void setGenre(PersonalisedMusicGenre genre) {
    this.genre = genre;
  }

  public PersonalisedMusicData playlist(PersonalisedMusicPlaylist playlist) {
    this.playlist = playlist;
    return this;
  }

  /**
   * Get playlist
   * @return playlist
  */
  @Valid 
  @Schema(name = "playlist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playlist")
  public PersonalisedMusicPlaylist getPlaylist() {
    return playlist;
  }

  public void setPlaylist(PersonalisedMusicPlaylist playlist) {
    this.playlist = playlist;
  }

  public PersonalisedMusicData service(PersonalisedMusicService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @Valid 
  @Schema(name = "service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service")
  public PersonalisedMusicService getService() {
    return service;
  }

  public void setService(PersonalisedMusicService service) {
    this.service = service;
  }

  public PersonalisedMusicData track(PersonalisedMusicTrack track) {
    this.track = track;
    return this;
  }

  /**
   * Get track
   * @return track
  */
  @Valid 
  @Schema(name = "track", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("track")
  public PersonalisedMusicTrack getTrack() {
    return track;
  }

  public void setTrack(PersonalisedMusicTrack track) {
    this.track = track;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicData personalisedMusicData = (PersonalisedMusicData) o;
    return Objects.equals(this.artist, personalisedMusicData.artist) &&
        Objects.equals(this.clip, personalisedMusicData.clip) &&
        Objects.equals(this.genre, personalisedMusicData.genre) &&
        Objects.equals(this.playlist, personalisedMusicData.playlist) &&
        Objects.equals(this.service, personalisedMusicData.service) &&
        Objects.equals(this.track, personalisedMusicData.track);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, clip, genre, playlist, service, track);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicData {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    clip: ").append(toIndentedString(clip)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    playlist: ").append(toIndentedString(playlist)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
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


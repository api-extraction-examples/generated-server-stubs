package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicImage;
import org.openapitools.model.PersonalisedMusicPlaylistVersion;
import org.openapitools.model.PersonalisedMusicTrack;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicPlaylist
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicPlaylist {

  private String description;

  @Valid
  private List<@Valid PersonalisedMusicImage> images;

  private String playbackType;

  private String serviceId;

  private String title;

  private PersonalisedMusicTrack tracks;

  private String type;

  private String updatedAt;

  private PersonalisedMusicPlaylistVersion version;

  public PersonalisedMusicPlaylist description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PersonalisedMusicPlaylist images(List<@Valid PersonalisedMusicImage> images) {
    this.images = images;
    return this;
  }

  public PersonalisedMusicPlaylist addImagesItem(PersonalisedMusicImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public List<@Valid PersonalisedMusicImage> getImages() {
    return images;
  }

  public void setImages(List<@Valid PersonalisedMusicImage> images) {
    this.images = images;
  }

  public PersonalisedMusicPlaylist playbackType(String playbackType) {
    this.playbackType = playbackType;
    return this;
  }

  /**
   * Get playbackType
   * @return playbackType
  */
  
  @Schema(name = "playback_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playback_type")
  public String getPlaybackType() {
    return playbackType;
  }

  public void setPlaybackType(String playbackType) {
    this.playbackType = playbackType;
  }

  public PersonalisedMusicPlaylist serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  
  @Schema(name = "service_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_id")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public PersonalisedMusicPlaylist title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PersonalisedMusicPlaylist tracks(PersonalisedMusicTrack tracks) {
    this.tracks = tracks;
    return this;
  }

  /**
   * Get tracks
   * @return tracks
  */
  @Valid 
  @Schema(name = "tracks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracks")
  public PersonalisedMusicTrack getTracks() {
    return tracks;
  }

  public void setTracks(PersonalisedMusicTrack tracks) {
    this.tracks = tracks;
  }

  public PersonalisedMusicPlaylist type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PersonalisedMusicPlaylist updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PersonalisedMusicPlaylist version(PersonalisedMusicPlaylistVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public PersonalisedMusicPlaylistVersion getVersion() {
    return version;
  }

  public void setVersion(PersonalisedMusicPlaylistVersion version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalisedMusicPlaylist personalisedMusicPlaylist = (PersonalisedMusicPlaylist) o;
    return Objects.equals(this.description, personalisedMusicPlaylist.description) &&
        Objects.equals(this.images, personalisedMusicPlaylist.images) &&
        Objects.equals(this.playbackType, personalisedMusicPlaylist.playbackType) &&
        Objects.equals(this.serviceId, personalisedMusicPlaylist.serviceId) &&
        Objects.equals(this.title, personalisedMusicPlaylist.title) &&
        Objects.equals(this.tracks, personalisedMusicPlaylist.tracks) &&
        Objects.equals(this.type, personalisedMusicPlaylist.type) &&
        Objects.equals(this.updatedAt, personalisedMusicPlaylist.updatedAt) &&
        Objects.equals(this.version, personalisedMusicPlaylist.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, images, playbackType, serviceId, title, tracks, type, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicPlaylist {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    playbackType: ").append(toIndentedString(playbackType)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


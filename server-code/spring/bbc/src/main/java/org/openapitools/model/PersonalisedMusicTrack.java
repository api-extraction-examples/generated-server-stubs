package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicTrackContribution;
import org.openapitools.model.PersonalisedMusicTrackImage;
import org.openapitools.model.PersonalisedMusicTrackMedia;
import org.openapitools.model.PersonalisedMusicVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicTrack
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicTrack {

  @Valid
  private List<@Valid PersonalisedMusicTrackContribution> contributions = new ArrayList<>();

  private String id;

  @Valid
  private List<@Valid PersonalisedMusicTrackImage> images = new ArrayList<>();

  @Valid
  private List<@Valid PersonalisedMusicTrackMedia> media = new ArrayList<>();

  private String title;

  private String type;

  private PersonalisedMusicVersion version;

  public PersonalisedMusicTrack() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedMusicTrack(List<@Valid PersonalisedMusicTrackContribution> contributions, String id, List<@Valid PersonalisedMusicTrackImage> images, List<@Valid PersonalisedMusicTrackMedia> media, String title, String type, PersonalisedMusicVersion version) {
    this.contributions = contributions;
    this.id = id;
    this.images = images;
    this.media = media;
    this.title = title;
    this.type = type;
    this.version = version;
  }

  public PersonalisedMusicTrack contributions(List<@Valid PersonalisedMusicTrackContribution> contributions) {
    this.contributions = contributions;
    return this;
  }

  public PersonalisedMusicTrack addContributionsItem(PersonalisedMusicTrackContribution contributionsItem) {
    if (this.contributions == null) {
      this.contributions = new ArrayList<>();
    }
    this.contributions.add(contributionsItem);
    return this;
  }

  /**
   * Get contributions
   * @return contributions
  */
  @NotNull @Valid 
  @Schema(name = "contributions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contributions")
  public List<@Valid PersonalisedMusicTrackContribution> getContributions() {
    return contributions;
  }

  public void setContributions(List<@Valid PersonalisedMusicTrackContribution> contributions) {
    this.contributions = contributions;
  }

  public PersonalisedMusicTrack id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonalisedMusicTrack images(List<@Valid PersonalisedMusicTrackImage> images) {
    this.images = images;
    return this;
  }

  public PersonalisedMusicTrack addImagesItem(PersonalisedMusicTrackImage imagesItem) {
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
  @NotNull @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<@Valid PersonalisedMusicTrackImage> getImages() {
    return images;
  }

  public void setImages(List<@Valid PersonalisedMusicTrackImage> images) {
    this.images = images;
  }

  public PersonalisedMusicTrack media(List<@Valid PersonalisedMusicTrackMedia> media) {
    this.media = media;
    return this;
  }

  public PersonalisedMusicTrack addMediaItem(PersonalisedMusicTrackMedia mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
  */
  @NotNull @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media")
  public List<@Valid PersonalisedMusicTrackMedia> getMedia() {
    return media;
  }

  public void setMedia(List<@Valid PersonalisedMusicTrackMedia> media) {
    this.media = media;
  }

  public PersonalisedMusicTrack title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PersonalisedMusicTrack type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PersonalisedMusicTrack version(PersonalisedMusicVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @NotNull @Valid 
  @Schema(name = "version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version")
  public PersonalisedMusicVersion getVersion() {
    return version;
  }

  public void setVersion(PersonalisedMusicVersion version) {
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
    PersonalisedMusicTrack personalisedMusicTrack = (PersonalisedMusicTrack) o;
    return Objects.equals(this.contributions, personalisedMusicTrack.contributions) &&
        Objects.equals(this.id, personalisedMusicTrack.id) &&
        Objects.equals(this.images, personalisedMusicTrack.images) &&
        Objects.equals(this.media, personalisedMusicTrack.media) &&
        Objects.equals(this.title, personalisedMusicTrack.title) &&
        Objects.equals(this.type, personalisedMusicTrack.type) &&
        Objects.equals(this.version, personalisedMusicTrack.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributions, id, images, media, title, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicTrack {\n");
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


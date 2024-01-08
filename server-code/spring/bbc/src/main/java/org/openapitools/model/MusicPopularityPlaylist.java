package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalPartner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicPopularityPlaylist
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicPopularityPlaylist {

  @Valid
  private List<String> categories = new ArrayList<>();

  private Boolean commentsEnabled;

  private String description;

  @Valid
  private List<@Valid ExternalPartner> externalPartners = new ArrayList<>();

  private String genre;

  private String id;

  private String imagePid;

  private String imageUrl;

  private String kind;

  private String mood;

  private Boolean oneOff;

  private String playlistPlaybackType;

  private Integer score;

  private String serviceId;

  private String title;

  private String updatedAt;

  private String visibility;

  private String wideImagePid;

  private String wideImageUrl;

  public MusicPopularityPlaylist() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicPopularityPlaylist(List<String> categories, Boolean commentsEnabled, String description, List<@Valid ExternalPartner> externalPartners, String genre, String id, String imagePid, String imageUrl, String kind, String mood, Boolean oneOff, String playlistPlaybackType, Integer score, String serviceId, String title, String updatedAt, String visibility, String wideImagePid, String wideImageUrl) {
    this.categories = categories;
    this.commentsEnabled = commentsEnabled;
    this.description = description;
    this.externalPartners = externalPartners;
    this.genre = genre;
    this.id = id;
    this.imagePid = imagePid;
    this.imageUrl = imageUrl;
    this.kind = kind;
    this.mood = mood;
    this.oneOff = oneOff;
    this.playlistPlaybackType = playlistPlaybackType;
    this.score = score;
    this.serviceId = serviceId;
    this.title = title;
    this.updatedAt = updatedAt;
    this.visibility = visibility;
    this.wideImagePid = wideImagePid;
    this.wideImageUrl = wideImageUrl;
  }

  public MusicPopularityPlaylist categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public MusicPopularityPlaylist addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @NotNull 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public MusicPopularityPlaylist commentsEnabled(Boolean commentsEnabled) {
    this.commentsEnabled = commentsEnabled;
    return this;
  }

  /**
   * Get commentsEnabled
   * @return commentsEnabled
  */
  @NotNull 
  @Schema(name = "commentsEnabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("commentsEnabled")
  public Boolean getCommentsEnabled() {
    return commentsEnabled;
  }

  public void setCommentsEnabled(Boolean commentsEnabled) {
    this.commentsEnabled = commentsEnabled;
  }

  public MusicPopularityPlaylist description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MusicPopularityPlaylist externalPartners(List<@Valid ExternalPartner> externalPartners) {
    this.externalPartners = externalPartners;
    return this;
  }

  public MusicPopularityPlaylist addExternalPartnersItem(ExternalPartner externalPartnersItem) {
    if (this.externalPartners == null) {
      this.externalPartners = new ArrayList<>();
    }
    this.externalPartners.add(externalPartnersItem);
    return this;
  }

  /**
   * Get externalPartners
   * @return externalPartners
  */
  @NotNull @Valid 
  @Schema(name = "externalPartners", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("externalPartners")
  public List<@Valid ExternalPartner> getExternalPartners() {
    return externalPartners;
  }

  public void setExternalPartners(List<@Valid ExternalPartner> externalPartners) {
    this.externalPartners = externalPartners;
  }

  public MusicPopularityPlaylist genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
  */
  @NotNull 
  @Schema(name = "genre", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("genre")
  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public MusicPopularityPlaylist id(String id) {
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

  public MusicPopularityPlaylist imagePid(String imagePid) {
    this.imagePid = imagePid;
    return this;
  }

  /**
   * Get imagePid
   * @return imagePid
  */
  @NotNull 
  @Schema(name = "imagePid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imagePid")
  public String getImagePid() {
    return imagePid;
  }

  public void setImagePid(String imagePid) {
    this.imagePid = imagePid;
  }

  public MusicPopularityPlaylist imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MusicPopularityPlaylist kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
  */
  @NotNull 
  @Schema(name = "kind", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public MusicPopularityPlaylist mood(String mood) {
    this.mood = mood;
    return this;
  }

  /**
   * Get mood
   * @return mood
  */
  @NotNull 
  @Schema(name = "mood", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mood")
  public String getMood() {
    return mood;
  }

  public void setMood(String mood) {
    this.mood = mood;
  }

  public MusicPopularityPlaylist oneOff(Boolean oneOff) {
    this.oneOff = oneOff;
    return this;
  }

  /**
   * Get oneOff
   * @return oneOff
  */
  @NotNull 
  @Schema(name = "oneOff", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oneOff")
  public Boolean getOneOff() {
    return oneOff;
  }

  public void setOneOff(Boolean oneOff) {
    this.oneOff = oneOff;
  }

  public MusicPopularityPlaylist playlistPlaybackType(String playlistPlaybackType) {
    this.playlistPlaybackType = playlistPlaybackType;
    return this;
  }

  /**
   * Get playlistPlaybackType
   * @return playlistPlaybackType
  */
  @NotNull 
  @Schema(name = "playlistPlaybackType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("playlistPlaybackType")
  public String getPlaylistPlaybackType() {
    return playlistPlaybackType;
  }

  public void setPlaylistPlaybackType(String playlistPlaybackType) {
    this.playlistPlaybackType = playlistPlaybackType;
  }

  public MusicPopularityPlaylist score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @NotNull 
  @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MusicPopularityPlaylist serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  @NotNull 
  @Schema(name = "serviceId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceId")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public MusicPopularityPlaylist title(String title) {
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

  public MusicPopularityPlaylist updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public MusicPopularityPlaylist visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
  */
  @NotNull 
  @Schema(name = "visibility", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public MusicPopularityPlaylist wideImagePid(String wideImagePid) {
    this.wideImagePid = wideImagePid;
    return this;
  }

  /**
   * Get wideImagePid
   * @return wideImagePid
  */
  @NotNull 
  @Schema(name = "wideImagePid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("wideImagePid")
  public String getWideImagePid() {
    return wideImagePid;
  }

  public void setWideImagePid(String wideImagePid) {
    this.wideImagePid = wideImagePid;
  }

  public MusicPopularityPlaylist wideImageUrl(String wideImageUrl) {
    this.wideImageUrl = wideImageUrl;
    return this;
  }

  /**
   * Get wideImageUrl
   * @return wideImageUrl
  */
  @NotNull 
  @Schema(name = "wideImageUrl", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("wideImageUrl")
  public String getWideImageUrl() {
    return wideImageUrl;
  }

  public void setWideImageUrl(String wideImageUrl) {
    this.wideImageUrl = wideImageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicPopularityPlaylist musicPopularityPlaylist = (MusicPopularityPlaylist) o;
    return Objects.equals(this.categories, musicPopularityPlaylist.categories) &&
        Objects.equals(this.commentsEnabled, musicPopularityPlaylist.commentsEnabled) &&
        Objects.equals(this.description, musicPopularityPlaylist.description) &&
        Objects.equals(this.externalPartners, musicPopularityPlaylist.externalPartners) &&
        Objects.equals(this.genre, musicPopularityPlaylist.genre) &&
        Objects.equals(this.id, musicPopularityPlaylist.id) &&
        Objects.equals(this.imagePid, musicPopularityPlaylist.imagePid) &&
        Objects.equals(this.imageUrl, musicPopularityPlaylist.imageUrl) &&
        Objects.equals(this.kind, musicPopularityPlaylist.kind) &&
        Objects.equals(this.mood, musicPopularityPlaylist.mood) &&
        Objects.equals(this.oneOff, musicPopularityPlaylist.oneOff) &&
        Objects.equals(this.playlistPlaybackType, musicPopularityPlaylist.playlistPlaybackType) &&
        Objects.equals(this.score, musicPopularityPlaylist.score) &&
        Objects.equals(this.serviceId, musicPopularityPlaylist.serviceId) &&
        Objects.equals(this.title, musicPopularityPlaylist.title) &&
        Objects.equals(this.updatedAt, musicPopularityPlaylist.updatedAt) &&
        Objects.equals(this.visibility, musicPopularityPlaylist.visibility) &&
        Objects.equals(this.wideImagePid, musicPopularityPlaylist.wideImagePid) &&
        Objects.equals(this.wideImageUrl, musicPopularityPlaylist.wideImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, commentsEnabled, description, externalPartners, genre, id, imagePid, imageUrl, kind, mood, oneOff, playlistPlaybackType, score, serviceId, title, updatedAt, visibility, wideImagePid, wideImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicPopularityPlaylist {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    commentsEnabled: ").append(toIndentedString(commentsEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalPartners: ").append(toIndentedString(externalPartners)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePid: ").append(toIndentedString(imagePid)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    mood: ").append(toIndentedString(mood)).append("\n");
    sb.append("    oneOff: ").append(toIndentedString(oneOff)).append("\n");
    sb.append("    playlistPlaybackType: ").append(toIndentedString(playlistPlaybackType)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    wideImagePid: ").append(toIndentedString(wideImagePid)).append("\n");
    sb.append("    wideImageUrl: ").append(toIndentedString(wideImageUrl)).append("\n");
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


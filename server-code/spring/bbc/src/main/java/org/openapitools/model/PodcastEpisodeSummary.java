package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailableVersions;
import org.openapitools.model.Image;
import org.openapitools.model.NetworkSummary;
import org.openapitools.model.ProgrammeTitles;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PodcastEpisodeSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastEpisodeSummary {

  private String assetUrl;

  @Valid
  private List<@Valid AvailableVersions> availableVersions = new ArrayList<>();

  @Valid
  private List<@Valid Image> images = new ArrayList<>();

  private String mediaType;

  private NetworkSummary networkSummary;

  private String pid;

  private String releaseDate;

  private String shortSynopsis;

  private ProgrammeTitles titles;

  private String type;

  public PodcastEpisodeSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PodcastEpisodeSummary(String assetUrl, List<@Valid AvailableVersions> availableVersions, List<@Valid Image> images, String mediaType, NetworkSummary networkSummary, String pid, String releaseDate, String shortSynopsis, ProgrammeTitles titles, String type) {
    this.assetUrl = assetUrl;
    this.availableVersions = availableVersions;
    this.images = images;
    this.mediaType = mediaType;
    this.networkSummary = networkSummary;
    this.pid = pid;
    this.releaseDate = releaseDate;
    this.shortSynopsis = shortSynopsis;
    this.titles = titles;
    this.type = type;
  }

  public PodcastEpisodeSummary assetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
    return this;
  }

  /**
   * Get assetUrl
   * @return assetUrl
  */
  @NotNull 
  @Schema(name = "asset_url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_url")
  public String getAssetUrl() {
    return assetUrl;
  }

  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }

  public PodcastEpisodeSummary availableVersions(List<@Valid AvailableVersions> availableVersions) {
    this.availableVersions = availableVersions;
    return this;
  }

  public PodcastEpisodeSummary addAvailableVersionsItem(AvailableVersions availableVersionsItem) {
    if (this.availableVersions == null) {
      this.availableVersions = new ArrayList<>();
    }
    this.availableVersions.add(availableVersionsItem);
    return this;
  }

  /**
   * Get availableVersions
   * @return availableVersions
  */
  @NotNull @Valid 
  @Schema(name = "available_versions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available_versions")
  public List<@Valid AvailableVersions> getAvailableVersions() {
    return availableVersions;
  }

  public void setAvailableVersions(List<@Valid AvailableVersions> availableVersions) {
    this.availableVersions = availableVersions;
  }

  public PodcastEpisodeSummary images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public PodcastEpisodeSummary addImagesItem(Image imagesItem) {
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
  public List<@Valid Image> getImages() {
    return images;
  }

  public void setImages(List<@Valid Image> images) {
    this.images = images;
  }

  public PodcastEpisodeSummary mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  @NotNull 
  @Schema(name = "media_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_type")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public PodcastEpisodeSummary networkSummary(NetworkSummary networkSummary) {
    this.networkSummary = networkSummary;
    return this;
  }

  /**
   * Get networkSummary
   * @return networkSummary
  */
  @NotNull @Valid 
  @Schema(name = "network_summary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("network_summary")
  public NetworkSummary getNetworkSummary() {
    return networkSummary;
  }

  public void setNetworkSummary(NetworkSummary networkSummary) {
    this.networkSummary = networkSummary;
  }

  public PodcastEpisodeSummary pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
  */
  @NotNull 
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public PodcastEpisodeSummary releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @NotNull 
  @Schema(name = "release_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("release_date")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public PodcastEpisodeSummary shortSynopsis(String shortSynopsis) {
    this.shortSynopsis = shortSynopsis;
    return this;
  }

  /**
   * Get shortSynopsis
   * @return shortSynopsis
  */
  @NotNull 
  @Schema(name = "short_synopsis", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("short_synopsis")
  public String getShortSynopsis() {
    return shortSynopsis;
  }

  public void setShortSynopsis(String shortSynopsis) {
    this.shortSynopsis = shortSynopsis;
  }

  public PodcastEpisodeSummary titles(ProgrammeTitles titles) {
    this.titles = titles;
    return this;
  }

  /**
   * Get titles
   * @return titles
  */
  @NotNull @Valid 
  @Schema(name = "titles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("titles")
  public ProgrammeTitles getTitles() {
    return titles;
  }

  public void setTitles(ProgrammeTitles titles) {
    this.titles = titles;
  }

  public PodcastEpisodeSummary type(String type) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodcastEpisodeSummary podcastEpisodeSummary = (PodcastEpisodeSummary) o;
    return Objects.equals(this.assetUrl, podcastEpisodeSummary.assetUrl) &&
        Objects.equals(this.availableVersions, podcastEpisodeSummary.availableVersions) &&
        Objects.equals(this.images, podcastEpisodeSummary.images) &&
        Objects.equals(this.mediaType, podcastEpisodeSummary.mediaType) &&
        Objects.equals(this.networkSummary, podcastEpisodeSummary.networkSummary) &&
        Objects.equals(this.pid, podcastEpisodeSummary.pid) &&
        Objects.equals(this.releaseDate, podcastEpisodeSummary.releaseDate) &&
        Objects.equals(this.shortSynopsis, podcastEpisodeSummary.shortSynopsis) &&
        Objects.equals(this.titles, podcastEpisodeSummary.titles) &&
        Objects.equals(this.type, podcastEpisodeSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, availableVersions, images, mediaType, networkSummary, pid, releaseDate, shortSynopsis, titles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastEpisodeSummary {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    networkSummary: ").append(toIndentedString(networkSummary)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    shortSynopsis: ").append(toIndentedString(shortSynopsis)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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


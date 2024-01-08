package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategorySummary;
import org.openapitools.model.Image;
import org.openapitools.model.NetworkSummary;
import org.openapitools.model.PodcastEpisodeSummary;
import org.openapitools.model.PodcastSynopses;
import org.openapitools.model.ProgrammeTitles;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Podcast
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Podcast {

  @Valid
  private List<@Valid CategorySummary> categorySummaries = new ArrayList<>();

  private Integer daysAvailable;

  private String entityType;

  private String firstPublishedDate;

  private String frequency;

  @Valid
  private List<@Valid Image> images = new ArrayList<>();

  @Valid
  private List<@Valid PodcastEpisodeSummary> latestAvailableEpisodes = new ArrayList<>();

  private NetworkSummary networkSummary;

  private String pid;

  private String rssUrl;

  private PodcastSynopses synopses;

  private String territory;

  private ProgrammeTitles titles;

  private Integer totalAvailableEpisodes;

  private String type;

  private String updatedAt;

  public Podcast() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Podcast(List<@Valid CategorySummary> categorySummaries, Integer daysAvailable, String entityType, String firstPublishedDate, String frequency, List<@Valid Image> images, List<@Valid PodcastEpisodeSummary> latestAvailableEpisodes, NetworkSummary networkSummary, String pid, String rssUrl, PodcastSynopses synopses, String territory, ProgrammeTitles titles, Integer totalAvailableEpisodes, String type, String updatedAt) {
    this.categorySummaries = categorySummaries;
    this.daysAvailable = daysAvailable;
    this.entityType = entityType;
    this.firstPublishedDate = firstPublishedDate;
    this.frequency = frequency;
    this.images = images;
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    this.networkSummary = networkSummary;
    this.pid = pid;
    this.rssUrl = rssUrl;
    this.synopses = synopses;
    this.territory = territory;
    this.titles = titles;
    this.totalAvailableEpisodes = totalAvailableEpisodes;
    this.type = type;
    this.updatedAt = updatedAt;
  }

  public Podcast categorySummaries(List<@Valid CategorySummary> categorySummaries) {
    this.categorySummaries = categorySummaries;
    return this;
  }

  public Podcast addCategorySummariesItem(CategorySummary categorySummariesItem) {
    if (this.categorySummaries == null) {
      this.categorySummaries = new ArrayList<>();
    }
    this.categorySummaries.add(categorySummariesItem);
    return this;
  }

  /**
   * Get categorySummaries
   * @return categorySummaries
  */
  @NotNull @Valid 
  @Schema(name = "category_summaries", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category_summaries")
  public List<@Valid CategorySummary> getCategorySummaries() {
    return categorySummaries;
  }

  public void setCategorySummaries(List<@Valid CategorySummary> categorySummaries) {
    this.categorySummaries = categorySummaries;
  }

  public Podcast daysAvailable(Integer daysAvailable) {
    this.daysAvailable = daysAvailable;
    return this;
  }

  /**
   * Get daysAvailable
   * @return daysAvailable
  */
  @NotNull 
  @Schema(name = "days_available", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("days_available")
  public Integer getDaysAvailable() {
    return daysAvailable;
  }

  public void setDaysAvailable(Integer daysAvailable) {
    this.daysAvailable = daysAvailable;
  }

  public Podcast entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  */
  @NotNull 
  @Schema(name = "entity_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity_type")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public Podcast firstPublishedDate(String firstPublishedDate) {
    this.firstPublishedDate = firstPublishedDate;
    return this;
  }

  /**
   * Get firstPublishedDate
   * @return firstPublishedDate
  */
  @NotNull 
  @Schema(name = "first_published_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_published_date")
  public String getFirstPublishedDate() {
    return firstPublishedDate;
  }

  public void setFirstPublishedDate(String firstPublishedDate) {
    this.firstPublishedDate = firstPublishedDate;
  }

  public Podcast frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  */
  @NotNull 
  @Schema(name = "frequency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("frequency")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public Podcast images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public Podcast addImagesItem(Image imagesItem) {
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

  public Podcast latestAvailableEpisodes(List<@Valid PodcastEpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    return this;
  }

  public Podcast addLatestAvailableEpisodesItem(PodcastEpisodeSummary latestAvailableEpisodesItem) {
    if (this.latestAvailableEpisodes == null) {
      this.latestAvailableEpisodes = new ArrayList<>();
    }
    this.latestAvailableEpisodes.add(latestAvailableEpisodesItem);
    return this;
  }

  /**
   * Get latestAvailableEpisodes
   * @return latestAvailableEpisodes
  */
  @NotNull @Valid 
  @Schema(name = "latest_available_episodes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latest_available_episodes")
  public List<@Valid PodcastEpisodeSummary> getLatestAvailableEpisodes() {
    return latestAvailableEpisodes;
  }

  public void setLatestAvailableEpisodes(List<@Valid PodcastEpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
  }

  public Podcast networkSummary(NetworkSummary networkSummary) {
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

  public Podcast pid(String pid) {
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

  public Podcast rssUrl(String rssUrl) {
    this.rssUrl = rssUrl;
    return this;
  }

  /**
   * Get rssUrl
   * @return rssUrl
  */
  @NotNull 
  @Schema(name = "rss_url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rss_url")
  public String getRssUrl() {
    return rssUrl;
  }

  public void setRssUrl(String rssUrl) {
    this.rssUrl = rssUrl;
  }

  public Podcast synopses(PodcastSynopses synopses) {
    this.synopses = synopses;
    return this;
  }

  /**
   * Get synopses
   * @return synopses
  */
  @NotNull @Valid 
  @Schema(name = "synopses", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("synopses")
  public PodcastSynopses getSynopses() {
    return synopses;
  }

  public void setSynopses(PodcastSynopses synopses) {
    this.synopses = synopses;
  }

  public Podcast territory(String territory) {
    this.territory = territory;
    return this;
  }

  /**
   * Get territory
   * @return territory
  */
  @NotNull 
  @Schema(name = "territory", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("territory")
  public String getTerritory() {
    return territory;
  }

  public void setTerritory(String territory) {
    this.territory = territory;
  }

  public Podcast titles(ProgrammeTitles titles) {
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

  public Podcast totalAvailableEpisodes(Integer totalAvailableEpisodes) {
    this.totalAvailableEpisodes = totalAvailableEpisodes;
    return this;
  }

  /**
   * Get totalAvailableEpisodes
   * @return totalAvailableEpisodes
  */
  @NotNull 
  @Schema(name = "total_available_episodes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_available_episodes")
  public Integer getTotalAvailableEpisodes() {
    return totalAvailableEpisodes;
  }

  public void setTotalAvailableEpisodes(Integer totalAvailableEpisodes) {
    this.totalAvailableEpisodes = totalAvailableEpisodes;
  }

  public Podcast type(String type) {
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

  public Podcast updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Podcast podcast = (Podcast) o;
    return Objects.equals(this.categorySummaries, podcast.categorySummaries) &&
        Objects.equals(this.daysAvailable, podcast.daysAvailable) &&
        Objects.equals(this.entityType, podcast.entityType) &&
        Objects.equals(this.firstPublishedDate, podcast.firstPublishedDate) &&
        Objects.equals(this.frequency, podcast.frequency) &&
        Objects.equals(this.images, podcast.images) &&
        Objects.equals(this.latestAvailableEpisodes, podcast.latestAvailableEpisodes) &&
        Objects.equals(this.networkSummary, podcast.networkSummary) &&
        Objects.equals(this.pid, podcast.pid) &&
        Objects.equals(this.rssUrl, podcast.rssUrl) &&
        Objects.equals(this.synopses, podcast.synopses) &&
        Objects.equals(this.territory, podcast.territory) &&
        Objects.equals(this.titles, podcast.titles) &&
        Objects.equals(this.totalAvailableEpisodes, podcast.totalAvailableEpisodes) &&
        Objects.equals(this.type, podcast.type) &&
        Objects.equals(this.updatedAt, podcast.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorySummaries, daysAvailable, entityType, firstPublishedDate, frequency, images, latestAvailableEpisodes, networkSummary, pid, rssUrl, synopses, territory, titles, totalAvailableEpisodes, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Podcast {\n");
    sb.append("    categorySummaries: ").append(toIndentedString(categorySummaries)).append("\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    firstPublishedDate: ").append(toIndentedString(firstPublishedDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    latestAvailableEpisodes: ").append(toIndentedString(latestAvailableEpisodes)).append("\n");
    sb.append("    networkSummary: ").append(toIndentedString(networkSummary)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    rssUrl: ").append(toIndentedString(rssUrl)).append("\n");
    sb.append("    synopses: ").append(toIndentedString(synopses)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    totalAvailableEpisodes: ").append(toIndentedString(totalAvailableEpisodes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


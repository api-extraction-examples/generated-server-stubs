package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AncestorSummary;
import org.openapitools.model.EpisodeSummary;
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
 * SeriesSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class SeriesSummary {

  @Valid
  private List<@Valid AncestorSummary> ancestors = new ArrayList<>();

  @Valid
  private List<@Valid Image> images = new ArrayList<>();

  @Valid
  private List<@Valid EpisodeSummary> latestAvailableEpisodes = new ArrayList<>();

  private NetworkSummary networkSummary;

  private String pid;

  private String shortSynopsis;

  private ProgrammeTitles titles;

  private Integer totalAvailableEpisodes;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SERIES_SUMMARY("series_summary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public SeriesSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SeriesSummary(List<@Valid AncestorSummary> ancestors, List<@Valid Image> images, List<@Valid EpisodeSummary> latestAvailableEpisodes, NetworkSummary networkSummary, String pid, String shortSynopsis, ProgrammeTitles titles, Integer totalAvailableEpisodes, TypeEnum type) {
    this.ancestors = ancestors;
    this.images = images;
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    this.networkSummary = networkSummary;
    this.pid = pid;
    this.shortSynopsis = shortSynopsis;
    this.titles = titles;
    this.totalAvailableEpisodes = totalAvailableEpisodes;
    this.type = type;
  }

  public SeriesSummary ancestors(List<@Valid AncestorSummary> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public SeriesSummary addAncestorsItem(AncestorSummary ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

  /**
   * Get ancestors
   * @return ancestors
  */
  @NotNull @Valid 
  @Schema(name = "ancestors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ancestors")
  public List<@Valid AncestorSummary> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<@Valid AncestorSummary> ancestors) {
    this.ancestors = ancestors;
  }

  public SeriesSummary images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public SeriesSummary addImagesItem(Image imagesItem) {
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

  public SeriesSummary latestAvailableEpisodes(List<@Valid EpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    return this;
  }

  public SeriesSummary addLatestAvailableEpisodesItem(EpisodeSummary latestAvailableEpisodesItem) {
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
  public List<@Valid EpisodeSummary> getLatestAvailableEpisodes() {
    return latestAvailableEpisodes;
  }

  public void setLatestAvailableEpisodes(List<@Valid EpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
  }

  public SeriesSummary networkSummary(NetworkSummary networkSummary) {
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

  public SeriesSummary pid(String pid) {
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

  public SeriesSummary shortSynopsis(String shortSynopsis) {
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

  public SeriesSummary titles(ProgrammeTitles titles) {
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

  public SeriesSummary totalAvailableEpisodes(Integer totalAvailableEpisodes) {
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

  public SeriesSummary type(TypeEnum type) {
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
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    SeriesSummary seriesSummary = (SeriesSummary) o;
    return Objects.equals(this.ancestors, seriesSummary.ancestors) &&
        Objects.equals(this.images, seriesSummary.images) &&
        Objects.equals(this.latestAvailableEpisodes, seriesSummary.latestAvailableEpisodes) &&
        Objects.equals(this.networkSummary, seriesSummary.networkSummary) &&
        Objects.equals(this.pid, seriesSummary.pid) &&
        Objects.equals(this.shortSynopsis, seriesSummary.shortSynopsis) &&
        Objects.equals(this.titles, seriesSummary.titles) &&
        Objects.equals(this.totalAvailableEpisodes, seriesSummary.totalAvailableEpisodes) &&
        Objects.equals(this.type, seriesSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, images, latestAvailableEpisodes, networkSummary, pid, shortSynopsis, titles, totalAvailableEpisodes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesSummary {\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    latestAvailableEpisodes: ").append(toIndentedString(latestAvailableEpisodes)).append("\n");
    sb.append("    networkSummary: ").append(toIndentedString(networkSummary)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    shortSynopsis: ").append(toIndentedString(shortSynopsis)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    totalAvailableEpisodes: ").append(toIndentedString(totalAvailableEpisodes)).append("\n");
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


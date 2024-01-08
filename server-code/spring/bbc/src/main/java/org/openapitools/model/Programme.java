package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Programme
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class Programme {

  @Valid
  private List<@Valid Image> images = new ArrayList<>();

  @Valid
  private List<@Valid EpisodeSummary> latestAvailableEpisodes;

  private NetworkSummary networkSummary;

  private String pid;

  private String shortSynopsis;

  private ProgrammeTitles titles;

  private Integer totalAvailableEpisodes;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BRAND_SUMMARY("brand_summary"),
    
    SERIES_SUMMARY("series_summary"),
    
    EPISODE_SUMMARY("episode_summary"),
    
    CLIP_SUMMARY("clip_summary");

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

  public Programme() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Programme(List<@Valid Image> images, NetworkSummary networkSummary, String pid, String shortSynopsis, ProgrammeTitles titles, TypeEnum type) {
    this.images = images;
    this.networkSummary = networkSummary;
    this.pid = pid;
    this.shortSynopsis = shortSynopsis;
    this.titles = titles;
    this.type = type;
  }

  public Programme images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public Programme addImagesItem(Image imagesItem) {
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

  public Programme latestAvailableEpisodes(List<@Valid EpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    return this;
  }

  public Programme addLatestAvailableEpisodesItem(EpisodeSummary latestAvailableEpisodesItem) {
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
  @Valid 
  @Schema(name = "latest_available_episodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest_available_episodes")
  public List<@Valid EpisodeSummary> getLatestAvailableEpisodes() {
    return latestAvailableEpisodes;
  }

  public void setLatestAvailableEpisodes(List<@Valid EpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
  }

  public Programme networkSummary(NetworkSummary networkSummary) {
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

  public Programme pid(String pid) {
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

  public Programme shortSynopsis(String shortSynopsis) {
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

  public Programme titles(ProgrammeTitles titles) {
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

  public Programme totalAvailableEpisodes(Integer totalAvailableEpisodes) {
    this.totalAvailableEpisodes = totalAvailableEpisodes;
    return this;
  }

  /**
   * Get totalAvailableEpisodes
   * @return totalAvailableEpisodes
  */
  
  @Schema(name = "total_available_episodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_available_episodes")
  public Integer getTotalAvailableEpisodes() {
    return totalAvailableEpisodes;
  }

  public void setTotalAvailableEpisodes(Integer totalAvailableEpisodes) {
    this.totalAvailableEpisodes = totalAvailableEpisodes;
  }

  public Programme type(TypeEnum type) {
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
    Programme programme = (Programme) o;
    return Objects.equals(this.images, programme.images) &&
        Objects.equals(this.latestAvailableEpisodes, programme.latestAvailableEpisodes) &&
        Objects.equals(this.networkSummary, programme.networkSummary) &&
        Objects.equals(this.pid, programme.pid) &&
        Objects.equals(this.shortSynopsis, programme.shortSynopsis) &&
        Objects.equals(this.titles, programme.titles) &&
        Objects.equals(this.totalAvailableEpisodes, programme.totalAvailableEpisodes) &&
        Objects.equals(this.type, programme.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, latestAvailableEpisodes, networkSummary, pid, shortSynopsis, titles, totalAvailableEpisodes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Programme {\n");
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


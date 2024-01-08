package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AvailableVersions;
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
 * BrandSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class BrandSummary {

  @Valid
  private List<@Valid AvailableVersions> availableVersions;

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
    BRAND_SUMMARY("brand_summary");

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

  public BrandSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BrandSummary(List<@Valid Image> images, List<@Valid EpisodeSummary> latestAvailableEpisodes, NetworkSummary networkSummary, String pid, String shortSynopsis, ProgrammeTitles titles, Integer totalAvailableEpisodes, TypeEnum type) {
    this.images = images;
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    this.networkSummary = networkSummary;
    this.pid = pid;
    this.shortSynopsis = shortSynopsis;
    this.titles = titles;
    this.totalAvailableEpisodes = totalAvailableEpisodes;
    this.type = type;
  }

  public BrandSummary availableVersions(List<@Valid AvailableVersions> availableVersions) {
    this.availableVersions = availableVersions;
    return this;
  }

  public BrandSummary addAvailableVersionsItem(AvailableVersions availableVersionsItem) {
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
  @Valid 
  @Schema(name = "available_versions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("available_versions")
  public List<@Valid AvailableVersions> getAvailableVersions() {
    return availableVersions;
  }

  public void setAvailableVersions(List<@Valid AvailableVersions> availableVersions) {
    this.availableVersions = availableVersions;
  }

  public BrandSummary images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public BrandSummary addImagesItem(Image imagesItem) {
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

  public BrandSummary latestAvailableEpisodes(List<@Valid EpisodeSummary> latestAvailableEpisodes) {
    this.latestAvailableEpisodes = latestAvailableEpisodes;
    return this;
  }

  public BrandSummary addLatestAvailableEpisodesItem(EpisodeSummary latestAvailableEpisodesItem) {
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

  public BrandSummary networkSummary(NetworkSummary networkSummary) {
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

  public BrandSummary pid(String pid) {
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

  public BrandSummary shortSynopsis(String shortSynopsis) {
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

  public BrandSummary titles(ProgrammeTitles titles) {
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

  public BrandSummary totalAvailableEpisodes(Integer totalAvailableEpisodes) {
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

  public BrandSummary type(TypeEnum type) {
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
    BrandSummary brandSummary = (BrandSummary) o;
    return Objects.equals(this.availableVersions, brandSummary.availableVersions) &&
        Objects.equals(this.images, brandSummary.images) &&
        Objects.equals(this.latestAvailableEpisodes, brandSummary.latestAvailableEpisodes) &&
        Objects.equals(this.networkSummary, brandSummary.networkSummary) &&
        Objects.equals(this.pid, brandSummary.pid) &&
        Objects.equals(this.shortSynopsis, brandSummary.shortSynopsis) &&
        Objects.equals(this.titles, brandSummary.titles) &&
        Objects.equals(this.totalAvailableEpisodes, brandSummary.totalAvailableEpisodes) &&
        Objects.equals(this.type, brandSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableVersions, images, latestAvailableEpisodes, networkSummary, pid, shortSynopsis, titles, totalAvailableEpisodes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandSummary {\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
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


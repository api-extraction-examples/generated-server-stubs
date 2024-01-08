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
 * EpisodeSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class EpisodeSummary {

  @Valid
  private List<@Valid AncestorSummary> ancestors = new ArrayList<>();

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    EPISODE_SUMMARY("episode_summary");

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

  public EpisodeSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EpisodeSummary(List<@Valid AncestorSummary> ancestors, List<@Valid AvailableVersions> availableVersions, List<@Valid Image> images, String mediaType, NetworkSummary networkSummary, String pid, String releaseDate, String shortSynopsis, ProgrammeTitles titles, TypeEnum type) {
    this.ancestors = ancestors;
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

  public EpisodeSummary ancestors(List<@Valid AncestorSummary> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public EpisodeSummary addAncestorsItem(AncestorSummary ancestorsItem) {
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

  public EpisodeSummary availableVersions(List<@Valid AvailableVersions> availableVersions) {
    this.availableVersions = availableVersions;
    return this;
  }

  public EpisodeSummary addAvailableVersionsItem(AvailableVersions availableVersionsItem) {
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

  public EpisodeSummary images(List<@Valid Image> images) {
    this.images = images;
    return this;
  }

  public EpisodeSummary addImagesItem(Image imagesItem) {
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

  public EpisodeSummary mediaType(String mediaType) {
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

  public EpisodeSummary networkSummary(NetworkSummary networkSummary) {
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

  public EpisodeSummary pid(String pid) {
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

  public EpisodeSummary releaseDate(String releaseDate) {
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

  public EpisodeSummary shortSynopsis(String shortSynopsis) {
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

  public EpisodeSummary titles(ProgrammeTitles titles) {
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

  public EpisodeSummary type(TypeEnum type) {
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
    EpisodeSummary episodeSummary = (EpisodeSummary) o;
    return Objects.equals(this.ancestors, episodeSummary.ancestors) &&
        Objects.equals(this.availableVersions, episodeSummary.availableVersions) &&
        Objects.equals(this.images, episodeSummary.images) &&
        Objects.equals(this.mediaType, episodeSummary.mediaType) &&
        Objects.equals(this.networkSummary, episodeSummary.networkSummary) &&
        Objects.equals(this.pid, episodeSummary.pid) &&
        Objects.equals(this.releaseDate, episodeSummary.releaseDate) &&
        Objects.equals(this.shortSynopsis, episodeSummary.shortSynopsis) &&
        Objects.equals(this.titles, episodeSummary.titles) &&
        Objects.equals(this.type, episodeSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, availableVersions, images, mediaType, networkSummary, pid, releaseDate, shortSynopsis, titles, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpisodeSummary {\n");
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
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


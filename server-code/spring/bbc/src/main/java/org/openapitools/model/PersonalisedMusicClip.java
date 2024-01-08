package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedMusicClipParentProgramme;
import org.openapitools.model.PersonalisedMusicVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedMusicClip
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedMusicClip {

  @Valid
  private List<String> contributors;

  private String endDate;

  private String entityType;

  private String imageUrl;

  private String masterbrandMid;

  private String mediaType;

  private PersonalisedMusicClipParentProgramme parentProgramme;

  private String pid;

  private String startDate;

  private String synopsis;

  private String title;

  private PersonalisedMusicVersion version;

  public PersonalisedMusicClip contributors(List<String> contributors) {
    this.contributors = contributors;
    return this;
  }

  public PersonalisedMusicClip addContributorsItem(String contributorsItem) {
    if (this.contributors == null) {
      this.contributors = new ArrayList<>();
    }
    this.contributors.add(contributorsItem);
    return this;
  }

  /**
   * Get contributors
   * @return contributors
  */
  
  @Schema(name = "contributors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contributors")
  public List<String> getContributors() {
    return contributors;
  }

  public void setContributors(List<String> contributors) {
    this.contributors = contributors;
  }

  public PersonalisedMusicClip endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public PersonalisedMusicClip entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  */
  
  @Schema(name = "entityType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public PersonalisedMusicClip imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PersonalisedMusicClip masterbrandMid(String masterbrandMid) {
    this.masterbrandMid = masterbrandMid;
    return this;
  }

  /**
   * Get masterbrandMid
   * @return masterbrandMid
  */
  
  @Schema(name = "masterbrandMid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("masterbrandMid")
  public String getMasterbrandMid() {
    return masterbrandMid;
  }

  public void setMasterbrandMid(String masterbrandMid) {
    this.masterbrandMid = masterbrandMid;
  }

  public PersonalisedMusicClip mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public PersonalisedMusicClip parentProgramme(PersonalisedMusicClipParentProgramme parentProgramme) {
    this.parentProgramme = parentProgramme;
    return this;
  }

  /**
   * Get parentProgramme
   * @return parentProgramme
  */
  @Valid 
  @Schema(name = "parentProgramme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentProgramme")
  public PersonalisedMusicClipParentProgramme getParentProgramme() {
    return parentProgramme;
  }

  public void setParentProgramme(PersonalisedMusicClipParentProgramme parentProgramme) {
    this.parentProgramme = parentProgramme;
  }

  public PersonalisedMusicClip pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
  */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public PersonalisedMusicClip startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PersonalisedMusicClip synopsis(String synopsis) {
    this.synopsis = synopsis;
    return this;
  }

  /**
   * Get synopsis
   * @return synopsis
  */
  
  @Schema(name = "synopsis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("synopsis")
  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public PersonalisedMusicClip title(String title) {
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

  public PersonalisedMusicClip version(PersonalisedMusicVersion version) {
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
    PersonalisedMusicClip personalisedMusicClip = (PersonalisedMusicClip) o;
    return Objects.equals(this.contributors, personalisedMusicClip.contributors) &&
        Objects.equals(this.endDate, personalisedMusicClip.endDate) &&
        Objects.equals(this.entityType, personalisedMusicClip.entityType) &&
        Objects.equals(this.imageUrl, personalisedMusicClip.imageUrl) &&
        Objects.equals(this.masterbrandMid, personalisedMusicClip.masterbrandMid) &&
        Objects.equals(this.mediaType, personalisedMusicClip.mediaType) &&
        Objects.equals(this.parentProgramme, personalisedMusicClip.parentProgramme) &&
        Objects.equals(this.pid, personalisedMusicClip.pid) &&
        Objects.equals(this.startDate, personalisedMusicClip.startDate) &&
        Objects.equals(this.synopsis, personalisedMusicClip.synopsis) &&
        Objects.equals(this.title, personalisedMusicClip.title) &&
        Objects.equals(this.version, personalisedMusicClip.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributors, endDate, entityType, imageUrl, masterbrandMid, mediaType, parentProgramme, pid, startDate, synopsis, title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedMusicClip {\n");
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    masterbrandMid: ").append(toIndentedString(masterbrandMid)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    parentProgramme: ").append(toIndentedString(parentProgramme)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    synopsis: ").append(toIndentedString(synopsis)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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


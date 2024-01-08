package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AvailableVersions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class AvailableVersions {

  private String available;

  private String availableFromDate;

  private String availableToDate;

  private String duration;

  private Boolean hasGuidance;

  private String mediaSet;

  private String type;

  private String versionPid;

  private String versionType;

  public AvailableVersions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AvailableVersions(String available, String availableFromDate, String availableToDate, String duration, Boolean hasGuidance, String mediaSet, String type, String versionPid, String versionType) {
    this.available = available;
    this.availableFromDate = availableFromDate;
    this.availableToDate = availableToDate;
    this.duration = duration;
    this.hasGuidance = hasGuidance;
    this.mediaSet = mediaSet;
    this.type = type;
    this.versionPid = versionPid;
    this.versionType = versionType;
  }

  public AvailableVersions available(String available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  */
  @NotNull 
  @Schema(name = "available", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available")
  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }

  public AvailableVersions availableFromDate(String availableFromDate) {
    this.availableFromDate = availableFromDate;
    return this;
  }

  /**
   * Get availableFromDate
   * @return availableFromDate
  */
  @NotNull 
  @Schema(name = "available_from_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available_from_date")
  public String getAvailableFromDate() {
    return availableFromDate;
  }

  public void setAvailableFromDate(String availableFromDate) {
    this.availableFromDate = availableFromDate;
  }

  public AvailableVersions availableToDate(String availableToDate) {
    this.availableToDate = availableToDate;
    return this;
  }

  /**
   * Get availableToDate
   * @return availableToDate
  */
  @NotNull 
  @Schema(name = "available_to_date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("available_to_date")
  public String getAvailableToDate() {
    return availableToDate;
  }

  public void setAvailableToDate(String availableToDate) {
    this.availableToDate = availableToDate;
  }

  public AvailableVersions duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  */
  @NotNull 
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public AvailableVersions hasGuidance(Boolean hasGuidance) {
    this.hasGuidance = hasGuidance;
    return this;
  }

  /**
   * Get hasGuidance
   * @return hasGuidance
  */
  @NotNull 
  @Schema(name = "has_guidance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_guidance")
  public Boolean getHasGuidance() {
    return hasGuidance;
  }

  public void setHasGuidance(Boolean hasGuidance) {
    this.hasGuidance = hasGuidance;
  }

  public AvailableVersions mediaSet(String mediaSet) {
    this.mediaSet = mediaSet;
    return this;
  }

  /**
   * Get mediaSet
   * @return mediaSet
  */
  @NotNull 
  @Schema(name = "media_set", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_set")
  public String getMediaSet() {
    return mediaSet;
  }

  public void setMediaSet(String mediaSet) {
    this.mediaSet = mediaSet;
  }

  public AvailableVersions type(String type) {
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

  public AvailableVersions versionPid(String versionPid) {
    this.versionPid = versionPid;
    return this;
  }

  /**
   * Get versionPid
   * @return versionPid
  */
  @NotNull 
  @Schema(name = "version_pid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_pid")
  public String getVersionPid() {
    return versionPid;
  }

  public void setVersionPid(String versionPid) {
    this.versionPid = versionPid;
  }

  public AvailableVersions versionType(String versionType) {
    this.versionType = versionType;
    return this;
  }

  /**
   * Get versionType
   * @return versionType
  */
  @NotNull 
  @Schema(name = "version_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_type")
  public String getVersionType() {
    return versionType;
  }

  public void setVersionType(String versionType) {
    this.versionType = versionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableVersions availableVersions = (AvailableVersions) o;
    return Objects.equals(this.available, availableVersions.available) &&
        Objects.equals(this.availableFromDate, availableVersions.availableFromDate) &&
        Objects.equals(this.availableToDate, availableVersions.availableToDate) &&
        Objects.equals(this.duration, availableVersions.duration) &&
        Objects.equals(this.hasGuidance, availableVersions.hasGuidance) &&
        Objects.equals(this.mediaSet, availableVersions.mediaSet) &&
        Objects.equals(this.type, availableVersions.type) &&
        Objects.equals(this.versionPid, availableVersions.versionPid) &&
        Objects.equals(this.versionType, availableVersions.versionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, availableFromDate, availableToDate, duration, hasGuidance, mediaSet, type, versionPid, versionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableVersions {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    availableFromDate: ").append(toIndentedString(availableFromDate)).append("\n");
    sb.append("    availableToDate: ").append(toIndentedString(availableToDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    hasGuidance: ").append(toIndentedString(hasGuidance)).append("\n");
    sb.append("    mediaSet: ").append(toIndentedString(mediaSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionPid: ").append(toIndentedString(versionPid)).append("\n");
    sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
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


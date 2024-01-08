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
 * Version
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class Version {

  private Integer build;

  private Integer major;

  private Integer majorRevision;

  private Integer minor;

  private Integer minorRevision;

  private Integer revision;

  public Version build(Integer build) {
    this.build = build;
    return this;
  }

  /**
   * Get build
   * @return build
  */
  
  @Schema(name = "Build", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Build")
  public Integer getBuild() {
    return build;
  }

  public void setBuild(Integer build) {
    this.build = build;
  }

  public Version major(Integer major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * @return major
  */
  
  @Schema(name = "Major", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Major")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public Version majorRevision(Integer majorRevision) {
    this.majorRevision = majorRevision;
    return this;
  }

  /**
   * Get majorRevision
   * @return majorRevision
  */
  
  @Schema(name = "MajorRevision", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MajorRevision")
  public Integer getMajorRevision() {
    return majorRevision;
  }

  public void setMajorRevision(Integer majorRevision) {
    this.majorRevision = majorRevision;
  }

  public Version minor(Integer minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor
   * @return minor
  */
  
  @Schema(name = "Minor", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Minor")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public Version minorRevision(Integer minorRevision) {
    this.minorRevision = minorRevision;
    return this;
  }

  /**
   * Get minorRevision
   * @return minorRevision
  */
  
  @Schema(name = "MinorRevision", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinorRevision")
  public Integer getMinorRevision() {
    return minorRevision;
  }

  public void setMinorRevision(Integer minorRevision) {
    this.minorRevision = minorRevision;
  }

  public Version revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
  */
  
  @Schema(name = "Revision", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Revision")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.build, version.build) &&
        Objects.equals(this.major, version.major) &&
        Objects.equals(this.majorRevision, version.majorRevision) &&
        Objects.equals(this.minor, version.minor) &&
        Objects.equals(this.minorRevision, version.minorRevision) &&
        Objects.equals(this.revision, version.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, major, majorRevision, minor, minorRevision, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    majorRevision: ").append(toIndentedString(majorRevision)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    minorRevision: ").append(toIndentedString(minorRevision)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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


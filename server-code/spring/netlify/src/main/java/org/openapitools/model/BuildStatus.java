package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BuildStatusMinutes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildStatus
 */

@JsonTypeName("buildStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class BuildStatus {

  private Integer active;

  private Integer buildCount;

  private Integer enqueued;

  private BuildStatusMinutes minutes;

  private Integer pendingConcurrency;

  public BuildStatus active(Integer active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public BuildStatus buildCount(Integer buildCount) {
    this.buildCount = buildCount;
    return this;
  }

  /**
   * Get buildCount
   * @return buildCount
  */
  
  @Schema(name = "build_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_count")
  public Integer getBuildCount() {
    return buildCount;
  }

  public void setBuildCount(Integer buildCount) {
    this.buildCount = buildCount;
  }

  public BuildStatus enqueued(Integer enqueued) {
    this.enqueued = enqueued;
    return this;
  }

  /**
   * Get enqueued
   * @return enqueued
  */
  
  @Schema(name = "enqueued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enqueued")
  public Integer getEnqueued() {
    return enqueued;
  }

  public void setEnqueued(Integer enqueued) {
    this.enqueued = enqueued;
  }

  public BuildStatus minutes(BuildStatusMinutes minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @Valid 
  @Schema(name = "minutes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minutes")
  public BuildStatusMinutes getMinutes() {
    return minutes;
  }

  public void setMinutes(BuildStatusMinutes minutes) {
    this.minutes = minutes;
  }

  public BuildStatus pendingConcurrency(Integer pendingConcurrency) {
    this.pendingConcurrency = pendingConcurrency;
    return this;
  }

  /**
   * Get pendingConcurrency
   * @return pendingConcurrency
  */
  
  @Schema(name = "pending_concurrency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pending_concurrency")
  public Integer getPendingConcurrency() {
    return pendingConcurrency;
  }

  public void setPendingConcurrency(Integer pendingConcurrency) {
    this.pendingConcurrency = pendingConcurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildStatus buildStatus = (BuildStatus) o;
    return Objects.equals(this.active, buildStatus.active) &&
        Objects.equals(this.buildCount, buildStatus.buildCount) &&
        Objects.equals(this.enqueued, buildStatus.enqueued) &&
        Objects.equals(this.minutes, buildStatus.minutes) &&
        Objects.equals(this.pendingConcurrency, buildStatus.pendingConcurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, buildCount, enqueued, minutes, pendingConcurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    buildCount: ").append(toIndentedString(buildCount)).append("\n");
    sb.append("    enqueued: ").append(toIndentedString(enqueued)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    pendingConcurrency: ").append(toIndentedString(pendingConcurrency)).append("\n");
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


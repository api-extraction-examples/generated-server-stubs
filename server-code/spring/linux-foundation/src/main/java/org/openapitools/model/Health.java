package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HealthStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Health
 */

@JsonTypeName("health")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class Health {

  private String buildTimeStamp;

  private String githash;

  @Valid
  private List<@Valid HealthStatus> healths;

  private String status;

  private String timeStamp;

  public Health buildTimeStamp(String buildTimeStamp) {
    this.buildTimeStamp = buildTimeStamp;
    return this;
  }

  /**
   * Time the service was built and deployed
   * @return buildTimeStamp
  */
  
  @Schema(name = "BuildTimeStamp", example = "2019-06-06_02:59:49PM", description = "Time the service was built and deployed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildTimeStamp")
  public String getBuildTimeStamp() {
    return buildTimeStamp;
  }

  public void setBuildTimeStamp(String buildTimeStamp) {
    this.buildTimeStamp = buildTimeStamp;
  }

  public Health githash(String githash) {
    this.githash = githash;
    return this;
  }

  /**
   * hash of the latest Git commit of the service at time of building
   * @return githash
  */
  
  @Schema(name = "Githash", example = "62009963c9e1cedaf7a24649208983163f8c439e", description = "hash of the latest Git commit of the service at time of building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Githash")
  public String getGithash() {
    return githash;
  }

  public void setGithash(String githash) {
    this.githash = githash;
  }

  public Health healths(List<@Valid HealthStatus> healths) {
    this.healths = healths;
    return this;
  }

  public Health addHealthsItem(HealthStatus healthsItem) {
    if (this.healths == null) {
      this.healths = new ArrayList<>();
    }
    this.healths.add(healthsItem);
    return this;
  }

  /**
   * Get healths
   * @return healths
  */
  @Valid 
  @Schema(name = "Healths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Healths")
  public List<@Valid HealthStatus> getHealths() {
    return healths;
  }

  public void setHealths(List<@Valid HealthStatus> healths) {
    this.healths = healths;
  }

  public Health status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Confirmation that the service is doing well
   * @return status
  */
  
  @Schema(name = "Status", example = "healthy", description = "Confirmation that the service is doing well", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Health timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Current server time
   * @return timeStamp
  */
  
  @Schema(name = "TimeStamp", example = "2019-06-07 15:37:43.131125775 +0000 UTC m=+0.257970409", description = "Current server time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TimeStamp")
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Health health = (Health) o;
    return Objects.equals(this.buildTimeStamp, health.buildTimeStamp) &&
        Objects.equals(this.githash, health.githash) &&
        Objects.equals(this.healths, health.healths) &&
        Objects.equals(this.status, health.status) &&
        Objects.equals(this.timeStamp, health.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildTimeStamp, githash, healths, status, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    sb.append("    buildTimeStamp: ").append(toIndentedString(buildTimeStamp)).append("\n");
    sb.append("    githash: ").append(toIndentedString(githash)).append("\n");
    sb.append("    healths: ").append(toIndentedString(healths)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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


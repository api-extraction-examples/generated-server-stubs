package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HealthStatus
 */

@JsonTypeName("health-status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class HealthStatus {

  private String duration;

  private String error;

  private Boolean healthy;

  private String name;

  private String timeStamp;

  public HealthStatus duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Service response time
   * @return duration
  */
  
  @Schema(name = "Duration", description = "Service response time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public HealthStatus error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Service Name
   * @return error
  */
  
  @Schema(name = "Error", description = "Service Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public HealthStatus healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

  /**
   * Service is healthy?
   * @return healthy
  */
  
  @Schema(name = "Healthy", description = "Service is healthy?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Healthy")
  public Boolean getHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }

  public HealthStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Service Name
   * @return name
  */
  
  @Schema(name = "Name", description = "Service Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthStatus timeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Service's server time
   * @return timeStamp
  */
  
  @Schema(name = "TimeStamp", example = "2019-06-07 15:37:43.131120884 +0000 UTC m=+0.257965506", description = "Service's server time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    HealthStatus healthStatus = (HealthStatus) o;
    return Objects.equals(this.duration, healthStatus.duration) &&
        Objects.equals(this.error, healthStatus.error) &&
        Objects.equals(this.healthy, healthStatus.healthy) &&
        Objects.equals(this.name, healthStatus.name) &&
        Objects.equals(this.timeStamp, healthStatus.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, error, healthy, name, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthStatus {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


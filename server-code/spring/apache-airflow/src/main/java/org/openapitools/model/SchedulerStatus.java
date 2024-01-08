package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.HealthStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The status and the latest scheduler heartbeat.
 */

@Schema(name = "SchedulerStatus", description = "The status and the latest scheduler heartbeat.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class SchedulerStatus {

  private JsonNullable<String> latestSchedulerHeartbeat = JsonNullable.<String>undefined();

  private HealthStatus status;

  public SchedulerStatus latestSchedulerHeartbeat(String latestSchedulerHeartbeat) {
    this.latestSchedulerHeartbeat = JsonNullable.of(latestSchedulerHeartbeat);
    return this;
  }

  /**
   * The time the scheduler last do a heartbeat.
   * @return latestSchedulerHeartbeat
  */
  
  @Schema(name = "latest_scheduler_heartbeat", accessMode = Schema.AccessMode.READ_ONLY, description = "The time the scheduler last do a heartbeat.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest_scheduler_heartbeat")
  public JsonNullable<String> getLatestSchedulerHeartbeat() {
    return latestSchedulerHeartbeat;
  }

  public void setLatestSchedulerHeartbeat(JsonNullable<String> latestSchedulerHeartbeat) {
    this.latestSchedulerHeartbeat = latestSchedulerHeartbeat;
  }

  public SchedulerStatus status(HealthStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public HealthStatus getStatus() {
    return status;
  }

  public void setStatus(HealthStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulerStatus schedulerStatus = (SchedulerStatus) o;
    return equalsNullable(this.latestSchedulerHeartbeat, schedulerStatus.latestSchedulerHeartbeat) &&
        Objects.equals(this.status, schedulerStatus.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(latestSchedulerHeartbeat), status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulerStatus {\n");
    sb.append("    latestSchedulerHeartbeat: ").append(toIndentedString(latestSchedulerHeartbeat)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


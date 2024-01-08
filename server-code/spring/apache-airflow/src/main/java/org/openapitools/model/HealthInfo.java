package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MetadatabaseStatus;
import org.openapitools.model.SchedulerStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Instance status information.
 */

@Schema(name = "HealthInfo", description = "Instance status information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class HealthInfo {

  private MetadatabaseStatus metadatabase;

  private SchedulerStatus scheduler;

  public HealthInfo metadatabase(MetadatabaseStatus metadatabase) {
    this.metadatabase = metadatabase;
    return this;
  }

  /**
   * Get metadatabase
   * @return metadatabase
  */
  @Valid 
  @Schema(name = "metadatabase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadatabase")
  public MetadatabaseStatus getMetadatabase() {
    return metadatabase;
  }

  public void setMetadatabase(MetadatabaseStatus metadatabase) {
    this.metadatabase = metadatabase;
  }

  public HealthInfo scheduler(SchedulerStatus scheduler) {
    this.scheduler = scheduler;
    return this;
  }

  /**
   * Get scheduler
   * @return scheduler
  */
  @Valid 
  @Schema(name = "scheduler", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler")
  public SchedulerStatus getScheduler() {
    return scheduler;
  }

  public void setScheduler(SchedulerStatus scheduler) {
    this.scheduler = scheduler;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthInfo healthInfo = (HealthInfo) o;
    return Objects.equals(this.metadatabase, healthInfo.metadatabase) &&
        Objects.equals(this.scheduler, healthInfo.scheduler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadatabase, scheduler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthInfo {\n");
    sb.append("    metadatabase: ").append(toIndentedString(metadatabase)).append("\n");
    sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
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


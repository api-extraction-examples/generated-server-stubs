package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1ScheduledStatusesIdPutRequest
 */

@JsonTypeName("_api_v1_scheduled_statuses__id__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1ScheduledStatusesIdPutRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledAt;

  public ApiV1ScheduledStatusesIdPutRequest scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * ISO 8601 Datetime at which the status will be published. Must be at least 5 minutes into the future.
   * @return scheduledAt
  */
  @Valid 
  @Schema(name = "scheduled_at", description = "ISO 8601 Datetime at which the status will be published. Must be at least 5 minutes into the future.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_at")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1ScheduledStatusesIdPutRequest apiV1ScheduledStatusesIdPutRequest = (ApiV1ScheduledStatusesIdPutRequest) o;
    return Objects.equals(this.scheduledAt, apiV1ScheduledStatusesIdPutRequest.scheduledAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1ScheduledStatusesIdPutRequest {\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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


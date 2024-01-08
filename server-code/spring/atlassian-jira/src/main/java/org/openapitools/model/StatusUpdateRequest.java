package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.StatusUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The list of statuses that will be updated.
 */

@Schema(name = "StatusUpdateRequest", description = "The list of statuses that will be updated.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusUpdateRequest {

  @Valid
  private List<@Valid StatusUpdate> statuses;

  public StatusUpdateRequest statuses(List<@Valid StatusUpdate> statuses) {
    this.statuses = statuses;
    return this;
  }

  public StatusUpdateRequest addStatusesItem(StatusUpdate statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * The list of statuses that will be updated.
   * @return statuses
  */
  @Valid 
  @Schema(name = "statuses", description = "The list of statuses that will be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public List<@Valid StatusUpdate> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<@Valid StatusUpdate> statuses) {
    this.statuses = statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateRequest statusUpdateRequest = (StatusUpdateRequest) o;
    return Objects.equals(this.statuses, statusUpdateRequest.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateRequest {\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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


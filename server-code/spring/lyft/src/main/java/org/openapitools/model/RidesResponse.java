package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RideDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RidesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RidesResponse {

  @Valid
  private List<@Valid RideDetail> rideHistory;

  public RidesResponse rideHistory(List<@Valid RideDetail> rideHistory) {
    this.rideHistory = rideHistory;
    return this;
  }

  public RidesResponse addRideHistoryItem(RideDetail rideHistoryItem) {
    if (this.rideHistory == null) {
      this.rideHistory = new ArrayList<>();
    }
    this.rideHistory.add(rideHistoryItem);
    return this;
  }

  /**
   * Get rideHistory
   * @return rideHistory
  */
  @Valid 
  @Schema(name = "ride_history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_history")
  public List<@Valid RideDetail> getRideHistory() {
    return rideHistory;
  }

  public void setRideHistory(List<@Valid RideDetail> rideHistory) {
    this.rideHistory = rideHistory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RidesResponse ridesResponse = (RidesResponse) o;
    return Objects.equals(this.rideHistory, ridesResponse.rideHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rideHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RidesResponse {\n");
    sb.append("    rideHistory: ").append(toIndentedString(rideHistory)).append("\n");
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


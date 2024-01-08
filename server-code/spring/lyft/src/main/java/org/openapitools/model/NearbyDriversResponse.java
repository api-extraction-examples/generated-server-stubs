package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NearbyDriversByRideType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NearbyDriversResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class NearbyDriversResponse {

  @Valid
  private List<@Valid NearbyDriversByRideType> nearbyDrivers;

  public NearbyDriversResponse nearbyDrivers(List<@Valid NearbyDriversByRideType> nearbyDrivers) {
    this.nearbyDrivers = nearbyDrivers;
    return this;
  }

  public NearbyDriversResponse addNearbyDriversItem(NearbyDriversByRideType nearbyDriversItem) {
    if (this.nearbyDrivers == null) {
      this.nearbyDrivers = new ArrayList<>();
    }
    this.nearbyDrivers.add(nearbyDriversItem);
    return this;
  }

  /**
   * Get nearbyDrivers
   * @return nearbyDrivers
  */
  @Valid 
  @Schema(name = "nearby_drivers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nearby_drivers")
  public List<@Valid NearbyDriversByRideType> getNearbyDrivers() {
    return nearbyDrivers;
  }

  public void setNearbyDrivers(List<@Valid NearbyDriversByRideType> nearbyDrivers) {
    this.nearbyDrivers = nearbyDrivers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearbyDriversResponse nearbyDriversResponse = (NearbyDriversResponse) o;
    return Objects.equals(this.nearbyDrivers, nearbyDriversResponse.nearbyDrivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nearbyDrivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearbyDriversResponse {\n");
    sb.append("    nearbyDrivers: ").append(toIndentedString(nearbyDrivers)).append("\n");
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


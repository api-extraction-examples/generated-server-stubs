package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NearbyDriver;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NearbyDriversByRideType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class NearbyDriversByRideType {

  @Valid
  private List<@Valid NearbyDriver> drivers;

  private String rideType;

  public NearbyDriversByRideType drivers(List<@Valid NearbyDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public NearbyDriversByRideType addDriversItem(NearbyDriver driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * list of nearby drivers group by ride type sorted by eta
   * @return drivers
  */
  @Valid 
  @Schema(name = "drivers", description = "list of nearby drivers group by ride type sorted by eta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drivers")
  public List<@Valid NearbyDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid NearbyDriver> drivers) {
    this.drivers = drivers;
  }

  public NearbyDriversByRideType rideType(String rideType) {
    this.rideType = rideType;
    return this;
  }

  /**
   * driver's ride type. if driver is eligable for several ride types, he will be duplicated.
   * @return rideType
  */
  
  @Schema(name = "ride_type", description = "driver's ride type. if driver is eligable for several ride types, he will be duplicated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_type")
  public String getRideType() {
    return rideType;
  }

  public void setRideType(String rideType) {
    this.rideType = rideType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearbyDriversByRideType nearbyDriversByRideType = (NearbyDriversByRideType) o;
    return Objects.equals(this.drivers, nearbyDriversByRideType.drivers) &&
        Objects.equals(this.rideType, nearbyDriversByRideType.rideType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers, rideType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearbyDriversByRideType {\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    rideType: ").append(toIndentedString(rideType)).append("\n");
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


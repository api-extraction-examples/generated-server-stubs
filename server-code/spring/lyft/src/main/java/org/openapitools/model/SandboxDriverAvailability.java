package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SandboxDriverAvailability
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class SandboxDriverAvailability {

  private Boolean driverAvailability;

  private Double lat;

  private Double lng;

  public SandboxDriverAvailability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SandboxDriverAvailability(Boolean driverAvailability, Double lat, Double lng) {
    this.driverAvailability = driverAvailability;
    this.lat = lat;
    this.lng = lng;
  }

  public SandboxDriverAvailability driverAvailability(Boolean driverAvailability) {
    this.driverAvailability = driverAvailability;
    return this;
  }

  /**
   * The availability of driver in a region
   * @return driverAvailability
  */
  @NotNull 
  @Schema(name = "driver_availability", description = "The availability of driver in a region", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("driver_availability")
  public Boolean getDriverAvailability() {
    return driverAvailability;
  }

  public void setDriverAvailability(Boolean driverAvailability) {
    this.driverAvailability = driverAvailability;
  }

  public SandboxDriverAvailability lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * The latitude component of a location
   * @return lat
  */
  @NotNull 
  @Schema(name = "lat", description = "The latitude component of a location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public SandboxDriverAvailability lng(Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * The longitude component of a location
   * @return lng
  */
  @NotNull 
  @Schema(name = "lng", description = "The longitude component of a location", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lng")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxDriverAvailability sandboxDriverAvailability = (SandboxDriverAvailability) o;
    return Objects.equals(this.driverAvailability, sandboxDriverAvailability.driverAvailability) &&
        Objects.equals(this.lat, sandboxDriverAvailability.lat) &&
        Objects.equals(this.lng, sandboxDriverAvailability.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverAvailability, lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxDriverAvailability {\n");
    sb.append("    driverAvailability: ").append(toIndentedString(driverAvailability)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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


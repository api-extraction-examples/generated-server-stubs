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
 * RideLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideLocation {

  private Double lat;

  private Double lng;

  private String address;

  private Integer etaSeconds;

  public RideLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RideLocation(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public RideLocation lat(Double lat) {
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

  public RideLocation lng(Double lng) {
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

  public RideLocation address(String address) {
    this.address = address;
    return this;
  }

  /**
   * A human readable address at/near the given location
   * @return address
  */
  
  @Schema(name = "address", description = "A human readable address at/near the given location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public RideLocation etaSeconds(Integer etaSeconds) {
    this.etaSeconds = etaSeconds;
    return this;
  }

  /**
   * Estimated seconds for a driver to pickup or reach destination based on ride status
   * @return etaSeconds
  */
  
  @Schema(name = "eta_seconds", description = "Estimated seconds for a driver to pickup or reach destination based on ride status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eta_seconds")
  public Integer getEtaSeconds() {
    return etaSeconds;
  }

  public void setEtaSeconds(Integer etaSeconds) {
    this.etaSeconds = etaSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideLocation rideLocation = (RideLocation) o;
    return Objects.equals(this.lat, rideLocation.lat) &&
        Objects.equals(this.lng, rideLocation.lng) &&
        Objects.equals(this.address, rideLocation.address) &&
        Objects.equals(this.etaSeconds, rideLocation.etaSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, address, etaSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideLocation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    etaSeconds: ").append(toIndentedString(etaSeconds)).append("\n");
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


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
 * CurrentRideLocation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class CurrentRideLocation {

  private Double lat;

  private Double lng;

  private Double bearing;

  public CurrentRideLocation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CurrentRideLocation(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public CurrentRideLocation lat(Double lat) {
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

  public CurrentRideLocation lng(Double lng) {
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

  public CurrentRideLocation bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

  /**
   * Bearing of the driver's car in degrees
   * @return bearing
  */
  
  @Schema(name = "bearing", description = "Bearing of the driver's car in degrees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bearing")
  public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentRideLocation currentRideLocation = (CurrentRideLocation) o;
    return Objects.equals(this.lat, currentRideLocation.lat) &&
        Objects.equals(this.lng, currentRideLocation.lng) &&
        Objects.equals(this.bearing, currentRideLocation.bearing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, bearing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentRideLocation {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
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


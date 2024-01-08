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
 * Location
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Location {

  private Double lat;

  private Double lng;

  private String address;

  public Location() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Location(Double lat, Double lng) {
    this.lat = lat;
    this.lng = lng;
  }

  public Location lat(Double lat) {
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

  public Location lng(Double lng) {
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

  public Location address(String address) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.lng, location.lng) &&
        Objects.equals(this.address, location.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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


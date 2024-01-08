package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RideTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SandboxRideType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class SandboxRideType {

  private Double lat;

  private Double lng;

  @Valid
  private List<@Valid RideTypeEnum> rideTypes = new ArrayList<>();

  public SandboxRideType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SandboxRideType(Double lat, Double lng, List<@Valid RideTypeEnum> rideTypes) {
    this.lat = lat;
    this.lng = lng;
    this.rideTypes = rideTypes;
  }

  public SandboxRideType lat(Double lat) {
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

  public SandboxRideType lng(Double lng) {
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

  public SandboxRideType rideTypes(List<@Valid RideTypeEnum> rideTypes) {
    this.rideTypes = rideTypes;
    return this;
  }

  public SandboxRideType addRideTypesItem(RideTypeEnum rideTypesItem) {
    if (this.rideTypes == null) {
      this.rideTypes = new ArrayList<>();
    }
    this.rideTypes.add(rideTypesItem);
    return this;
  }

  /**
   * Get rideTypes
   * @return rideTypes
  */
  @NotNull @Valid 
  @Schema(name = "ride_types", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ride_types")
  public List<@Valid RideTypeEnum> getRideTypes() {
    return rideTypes;
  }

  public void setRideTypes(List<@Valid RideTypeEnum> rideTypes) {
    this.rideTypes = rideTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxRideType sandboxRideType = (SandboxRideType) o;
    return Objects.equals(this.lat, sandboxRideType.lat) &&
        Objects.equals(this.lng, sandboxRideType.lng) &&
        Objects.equals(this.rideTypes, sandboxRideType.rideTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, rideTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxRideType {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    rideTypes: ").append(toIndentedString(rideTypes)).append("\n");
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


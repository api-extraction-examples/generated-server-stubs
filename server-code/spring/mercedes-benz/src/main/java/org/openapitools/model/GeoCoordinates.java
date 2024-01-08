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
 * GeoCoordinates
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class GeoCoordinates {

  private Double latitude;

  private Double longitude;

  public GeoCoordinates() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoCoordinates(Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public GeoCoordinates latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * latitude - in decimal degrees
   * @return latitude
  */
  @NotNull 
  @Schema(name = "latitude", description = "latitude - in decimal degrees", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public GeoCoordinates longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * longitude - in decimal degrees
   * @return longitude
  */
  @NotNull 
  @Schema(name = "longitude", description = "longitude - in decimal degrees", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoCoordinates geoCoordinates = (GeoCoordinates) o;
    return Objects.equals(this.latitude, geoCoordinates.latitude) &&
        Objects.equals(this.longitude, geoCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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


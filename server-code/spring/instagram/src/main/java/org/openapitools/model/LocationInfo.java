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
 * LocationInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class LocationInfo {

  private String id;

  private Double latitude;

  private Double longitude;

  private String name;

  public LocationInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this location (in some responses it has a type of 'integer')
   * @return id
  */
  
  @Schema(name = "id", description = "ID of this location (in some responses it has a type of 'integer')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocationInfo latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Location latitude
   * @return latitude
  */
  
  @Schema(name = "latitude", description = "Location latitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public LocationInfo longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Location longitude
   * @return longitude
  */
  
  @Schema(name = "longitude", description = "Location longitude", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public LocationInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Location name
   * @return name
  */
  
  @Schema(name = "name", description = "Location name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInfo locationInfo = (LocationInfo) o;
    return Objects.equals(this.id, locationInfo.id) &&
        Objects.equals(this.latitude, locationInfo.latitude) &&
        Objects.equals(this.longitude, locationInfo.longitude) &&
        Objects.equals(this.name, locationInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latitude, longitude, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


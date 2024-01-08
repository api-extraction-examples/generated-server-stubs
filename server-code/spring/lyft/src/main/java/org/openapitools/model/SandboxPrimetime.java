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
 * SandboxPrimetime
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class SandboxPrimetime {

  private Double lat;

  private Double lng;

  private String primetimePercentage;

  public SandboxPrimetime() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SandboxPrimetime(Double lat, Double lng, String primetimePercentage) {
    this.lat = lat;
    this.lng = lng;
    this.primetimePercentage = primetimePercentage;
  }

  public SandboxPrimetime lat(Double lat) {
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

  public SandboxPrimetime lng(Double lng) {
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

  public SandboxPrimetime primetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
    return this;
  }

  /**
   * The Prime Time to be applied as a string, e.g., '25%'
   * @return primetimePercentage
  */
  @NotNull 
  @Schema(name = "primetime_percentage", description = "The Prime Time to be applied as a string, e.g., '25%'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primetime_percentage")
  public String getPrimetimePercentage() {
    return primetimePercentage;
  }

  public void setPrimetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPrimetime sandboxPrimetime = (SandboxPrimetime) o;
    return Objects.equals(this.lat, sandboxPrimetime.lat) &&
        Objects.equals(this.lng, sandboxPrimetime.lng) &&
        Objects.equals(this.primetimePercentage, sandboxPrimetime.primetimePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng, primetimePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPrimetime {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    primetimePercentage: ").append(toIndentedString(primetimePercentage)).append("\n");
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


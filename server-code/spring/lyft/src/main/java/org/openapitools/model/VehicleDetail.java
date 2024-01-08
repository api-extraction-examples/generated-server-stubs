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
 * VehicleDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class VehicleDetail {

  private String color;

  private String imageUrl;

  private String licensePlate;

  private String licensePlateState;

  private String make;

  private String model;

  private Integer year;

  public VehicleDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleDetail(String color, String imageUrl, String licensePlate, String licensePlateState, String make, String model, Integer year) {
    this.color = color;
    this.imageUrl = imageUrl;
    this.licensePlate = licensePlate;
    this.licensePlateState = licensePlateState;
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public VehicleDetail color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The vehicle's color
   * @return color
  */
  @NotNull 
  @Schema(name = "color", description = "The vehicle's color", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public VehicleDetail imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The vehicle's image url
   * @return imageUrl
  */
  @NotNull 
  @Schema(name = "image_url", description = "The vehicle's image url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public VehicleDetail licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

  /**
   * The vehicle's license plate
   * @return licensePlate
  */
  @NotNull 
  @Schema(name = "license_plate", description = "The vehicle's license plate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("license_plate")
  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public VehicleDetail licensePlateState(String licensePlateState) {
    this.licensePlateState = licensePlateState;
    return this;
  }

  /**
   * The vehicle's license plate state
   * @return licensePlateState
  */
  @NotNull 
  @Schema(name = "license_plate_state", description = "The vehicle's license plate state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("license_plate_state")
  public String getLicensePlateState() {
    return licensePlateState;
  }

  public void setLicensePlateState(String licensePlateState) {
    this.licensePlateState = licensePlateState;
  }

  public VehicleDetail make(String make) {
    this.make = make;
    return this;
  }

  /**
   * The vehicle's maker
   * @return make
  */
  @NotNull 
  @Schema(name = "make", description = "The vehicle's maker", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleDetail model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The vehicle's model
   * @return model
  */
  @NotNull 
  @Schema(name = "model", description = "The vehicle's model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleDetail year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * The vehicle's model year
   * @return year
  */
  @NotNull 
  @Schema(name = "year", description = "The vehicle's model year", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleDetail vehicleDetail = (VehicleDetail) o;
    return Objects.equals(this.color, vehicleDetail.color) &&
        Objects.equals(this.imageUrl, vehicleDetail.imageUrl) &&
        Objects.equals(this.licensePlate, vehicleDetail.licensePlate) &&
        Objects.equals(this.licensePlateState, vehicleDetail.licensePlateState) &&
        Objects.equals(this.make, vehicleDetail.make) &&
        Objects.equals(this.model, vehicleDetail.model) &&
        Objects.equals(this.year, vehicleDetail.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, imageUrl, licensePlate, licensePlateState, make, model, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleDetail {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    licensePlateState: ").append(toIndentedString(licensePlateState)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


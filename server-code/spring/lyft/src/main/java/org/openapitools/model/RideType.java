package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.PricingDetails;
import org.openapitools.model.RideTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RideType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideType {

  private String displayName;

  private String imageUrl;

  private PricingDetails pricingDetails;

  private RideTypeEnum rideType;

  private PricingDetails scheduledPricingDetails;

  private Integer seats;

  public RideType displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * A human readable description of the ride type
   * @return displayName
  */
  
  @Schema(name = "display_name", description = "A human readable description of the ride type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RideType imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The URL of an image representing this ride type
   * @return imageUrl
  */
  
  @Schema(name = "image_url", description = "The URL of an image representing this ride type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public RideType pricingDetails(PricingDetails pricingDetails) {
    this.pricingDetails = pricingDetails;
    return this;
  }

  /**
   * Get pricingDetails
   * @return pricingDetails
  */
  @Valid 
  @Schema(name = "pricing_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricing_details")
  public PricingDetails getPricingDetails() {
    return pricingDetails;
  }

  public void setPricingDetails(PricingDetails pricingDetails) {
    this.pricingDetails = pricingDetails;
  }

  public RideType rideType(RideTypeEnum rideType) {
    this.rideType = rideType;
    return this;
  }

  /**
   * Get rideType
   * @return rideType
  */
  @Valid 
  @Schema(name = "ride_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_type")
  public RideTypeEnum getRideType() {
    return rideType;
  }

  public void setRideType(RideTypeEnum rideType) {
    this.rideType = rideType;
  }

  public RideType scheduledPricingDetails(PricingDetails scheduledPricingDetails) {
    this.scheduledPricingDetails = scheduledPricingDetails;
    return this;
  }

  /**
   * Get scheduledPricingDetails
   * @return scheduledPricingDetails
  */
  @Valid 
  @Schema(name = "scheduled_pricing_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_pricing_details")
  public PricingDetails getScheduledPricingDetails() {
    return scheduledPricingDetails;
  }

  public void setScheduledPricingDetails(PricingDetails scheduledPricingDetails) {
    this.scheduledPricingDetails = scheduledPricingDetails;
  }

  public RideType seats(Integer seats) {
    this.seats = seats;
    return this;
  }

  /**
   * The maximum number of seats available for rides requested with this ride type
   * @return seats
  */
  
  @Schema(name = "seats", description = "The maximum number of seats available for rides requested with this ride type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seats")
  public Integer getSeats() {
    return seats;
  }

  public void setSeats(Integer seats) {
    this.seats = seats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideType rideType = (RideType) o;
    return Objects.equals(this.displayName, rideType.displayName) &&
        Objects.equals(this.imageUrl, rideType.imageUrl) &&
        Objects.equals(this.pricingDetails, rideType.pricingDetails) &&
        Objects.equals(this.rideType, rideType.rideType) &&
        Objects.equals(this.scheduledPricingDetails, rideType.scheduledPricingDetails) &&
        Objects.equals(this.seats, rideType.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, imageUrl, pricingDetails, rideType, scheduledPricingDetails, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideType {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    pricingDetails: ").append(toIndentedString(pricingDetails)).append("\n");
    sb.append("    rideType: ").append(toIndentedString(rideType)).append("\n");
    sb.append("    scheduledPricingDetails: ").append(toIndentedString(scheduledPricingDetails)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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


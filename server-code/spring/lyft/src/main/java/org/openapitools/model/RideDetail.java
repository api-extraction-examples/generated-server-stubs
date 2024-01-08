package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CancellationCost;
import org.openapitools.model.Cost;
import org.openapitools.model.CurrentRideLocation;
import org.openapitools.model.DriverDetail;
import org.openapitools.model.LineItem;
import org.openapitools.model.PassengerDetail;
import org.openapitools.model.PickupDropoffLocation;
import org.openapitools.model.RideLocation;
import org.openapitools.model.RideProfileEnum;
import org.openapitools.model.RideStatusEnum;
import org.openapitools.model.RideTypeEnumWithOther;
import org.openapitools.model.VehicleDetail;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Detail information about a ride
 */

@Schema(name = "RideDetail", description = "Detail information about a ride")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideDetail {

  private String beaconColor;

  /**
   * The array of actors who may cancel the ride at this point
   */
  public enum CanCancelEnum {
    DRIVER("driver"),
    
    PASSENGER("passenger"),
    
    DISPATCHER("dispatcher");

    private String value;

    CanCancelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CanCancelEnum fromValue(String value) {
      for (CanCancelEnum b : CanCancelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<CanCancelEnum> canCancel;

  private String canceledBy;

  private CancellationCost cancellationPrice;

  private RideLocation destination;

  private Float distanceMiles;

  private DriverDetail driver;

  private PickupDropoffLocation dropoff;

  private Integer durationSeconds;

  private String feedback;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  @Valid
  private List<@Valid LineItem> lineItems;

  private CurrentRideLocation location;

  private RideLocation origin;

  private PassengerDetail passenger;

  private PickupDropoffLocation pickup;

  private Cost price;

  private String pricingDetailsUrl;

  private String primetimePercentage;

  private Integer rating;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedAt;

  private String rideId;

  private RideProfileEnum rideProfile;

  private RideTypeEnumWithOther rideType;

  private String routeUrl;

  private RideStatusEnum status;

  private VehicleDetail vehicle;

  public RideDetail beaconColor(String beaconColor) {
    this.beaconColor = beaconColor;
    return this;
  }

  /**
   * Hex color code of the driver AMP device.
   * @return beaconColor
  */
  
  @Schema(name = "beacon_color", description = "Hex color code of the driver AMP device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beacon_color")
  public String getBeaconColor() {
    return beaconColor;
  }

  public void setBeaconColor(String beaconColor) {
    this.beaconColor = beaconColor;
  }

  public RideDetail canCancel(List<CanCancelEnum> canCancel) {
    this.canCancel = canCancel;
    return this;
  }

  public RideDetail addCanCancelItem(CanCancelEnum canCancelItem) {
    if (this.canCancel == null) {
      this.canCancel = new ArrayList<>();
    }
    this.canCancel.add(canCancelItem);
    return this;
  }

  /**
   * Get canCancel
   * @return canCancel
  */
  
  @Schema(name = "can_cancel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("can_cancel")
  public List<CanCancelEnum> getCanCancel() {
    return canCancel;
  }

  public void setCanCancel(List<CanCancelEnum> canCancel) {
    this.canCancel = canCancel;
  }

  public RideDetail canceledBy(String canceledBy) {
    this.canceledBy = canceledBy;
    return this;
  }

  /**
   * The role of user who canceled the ride (if applicable)
   * @return canceledBy
  */
  
  @Schema(name = "canceled_by", description = "The role of user who canceled the ride (if applicable)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canceled_by")
  public String getCanceledBy() {
    return canceledBy;
  }

  public void setCanceledBy(String canceledBy) {
    this.canceledBy = canceledBy;
  }

  public RideDetail cancellationPrice(CancellationCost cancellationPrice) {
    this.cancellationPrice = cancellationPrice;
    return this;
  }

  /**
   * Get cancellationPrice
   * @return cancellationPrice
  */
  @Valid 
  @Schema(name = "cancellation_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellation_price")
  public CancellationCost getCancellationPrice() {
    return cancellationPrice;
  }

  public void setCancellationPrice(CancellationCost cancellationPrice) {
    this.cancellationPrice = cancellationPrice;
  }

  public RideDetail destination(RideLocation destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @Valid 
  @Schema(name = "destination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination")
  public RideLocation getDestination() {
    return destination;
  }

  public void setDestination(RideLocation destination) {
    this.destination = destination;
  }

  public RideDetail distanceMiles(Float distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

  /**
   * The distance, in miles, that this ride traveled. This field is only present after drop-off
   * @return distanceMiles
  */
  
  @Schema(name = "distance_miles", description = "The distance, in miles, that this ride traveled. This field is only present after drop-off", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance_miles")
  public Float getDistanceMiles() {
    return distanceMiles;
  }

  public void setDistanceMiles(Float distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  public RideDetail driver(DriverDetail driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @Valid 
  @Schema(name = "driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driver")
  public DriverDetail getDriver() {
    return driver;
  }

  public void setDriver(DriverDetail driver) {
    this.driver = driver;
  }

  public RideDetail dropoff(PickupDropoffLocation dropoff) {
    this.dropoff = dropoff;
    return this;
  }

  /**
   * Get dropoff
   * @return dropoff
  */
  @Valid 
  @Schema(name = "dropoff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dropoff")
  public PickupDropoffLocation getDropoff() {
    return dropoff;
  }

  public void setDropoff(PickupDropoffLocation dropoff) {
    this.dropoff = dropoff;
  }

  public RideDetail durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Duration of the ride in seconds from pickup to drop-off. This field is only present after drop-off.
   * @return durationSeconds
  */
  
  @Schema(name = "duration_seconds", description = "Duration of the ride in seconds from pickup to drop-off. This field is only present after drop-off.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration_seconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public RideDetail feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

  /**
   * The written feedback the user left for this ride
   * @return feedback
  */
  
  @Schema(name = "feedback", description = "The written feedback the user left for this ride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedback")
  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public RideDetail generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * The request timestamp in date and time
   * @return generatedAt
  */
  @Valid 
  @Schema(name = "generated_at", description = "The request timestamp in date and time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generated_at")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public RideDetail lineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public RideDetail addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * The break down of cost
   * @return lineItems
  */
  @Valid 
  @Schema(name = "line_items", description = "The break down of cost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_items")
  public List<@Valid LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public RideDetail location(CurrentRideLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public CurrentRideLocation getLocation() {
    return location;
  }

  public void setLocation(CurrentRideLocation location) {
    this.location = location;
  }

  public RideDetail origin(RideLocation origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @Valid 
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("origin")
  public RideLocation getOrigin() {
    return origin;
  }

  public void setOrigin(RideLocation origin) {
    this.origin = origin;
  }

  public RideDetail passenger(PassengerDetail passenger) {
    this.passenger = passenger;
    return this;
  }

  /**
   * Get passenger
   * @return passenger
  */
  @Valid 
  @Schema(name = "passenger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passenger")
  public PassengerDetail getPassenger() {
    return passenger;
  }

  public void setPassenger(PassengerDetail passenger) {
    this.passenger = passenger;
  }

  public RideDetail pickup(PickupDropoffLocation pickup) {
    this.pickup = pickup;
    return this;
  }

  /**
   * Get pickup
   * @return pickup
  */
  @Valid 
  @Schema(name = "pickup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickup")
  public PickupDropoffLocation getPickup() {
    return pickup;
  }

  public void setPickup(PickupDropoffLocation pickup) {
    this.pickup = pickup;
  }

  public RideDetail price(Cost price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Cost getPrice() {
    return price;
  }

  public void setPrice(Cost price) {
    this.price = price;
  }

  public RideDetail pricingDetailsUrl(String pricingDetailsUrl) {
    this.pricingDetailsUrl = pricingDetailsUrl;
    return this;
  }

  /**
   * The web view showing the pricing structure for the geographic area where the ride was taken 
   * @return pricingDetailsUrl
  */
  
  @Schema(name = "pricing_details_url", description = "The web view showing the pricing structure for the geographic area where the ride was taken ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pricing_details_url")
  public String getPricingDetailsUrl() {
    return pricingDetailsUrl;
  }

  public void setPricingDetailsUrl(String pricingDetailsUrl) {
    this.pricingDetailsUrl = pricingDetailsUrl;
  }

  public RideDetail primetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
    return this;
  }

  /**
   * The Prime Time percentage applied to the base price
   * @return primetimePercentage
  */
  
  @Schema(name = "primetime_percentage", description = "The Prime Time percentage applied to the base price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_percentage")
  public String getPrimetimePercentage() {
    return primetimePercentage;
  }

  public void setPrimetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
  }

  public RideDetail rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * The rating the user left for this ride, from 1 to 5
   * @return rating
  */
  
  @Schema(name = "rating", description = "The rating the user left for this ride, from 1 to 5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public RideDetail requestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * The ride requested timestamp in date and time
   * @return requestedAt
  */
  @Valid 
  @Schema(name = "requested_at", description = "The ride requested timestamp in date and time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_at")
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  public RideDetail rideId(String rideId) {
    this.rideId = rideId;
    return this;
  }

  /**
   * The unique ID of this ride
   * @return rideId
  */
  
  @Schema(name = "ride_id", description = "The unique ID of this ride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_id")
  public String getRideId() {
    return rideId;
  }

  public void setRideId(String rideId) {
    this.rideId = rideId;
  }

  public RideDetail rideProfile(RideProfileEnum rideProfile) {
    this.rideProfile = rideProfile;
    return this;
  }

  /**
   * Get rideProfile
   * @return rideProfile
  */
  @Valid 
  @Schema(name = "ride_profile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_profile")
  public RideProfileEnum getRideProfile() {
    return rideProfile;
  }

  public void setRideProfile(RideProfileEnum rideProfile) {
    this.rideProfile = rideProfile;
  }

  public RideDetail rideType(RideTypeEnumWithOther rideType) {
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
  public RideTypeEnumWithOther getRideType() {
    return rideType;
  }

  public void setRideType(RideTypeEnumWithOther rideType) {
    this.rideType = rideType;
  }

  public RideDetail routeUrl(String routeUrl) {
    this.routeUrl = routeUrl;
    return this;
  }

  /**
   * The web view showing the passenger, driver, and route for this ride. This field will only be present for rides created through this API, or that have been shared through the \"Share my Route\" feature 
   * @return routeUrl
  */
  
  @Schema(name = "route_url", description = "The web view showing the passenger, driver, and route for this ride. This field will only be present for rides created through this API, or that have been shared through the \"Share my Route\" feature ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("route_url")
  public String getRouteUrl() {
    return routeUrl;
  }

  public void setRouteUrl(String routeUrl) {
    this.routeUrl = routeUrl;
  }

  public RideDetail status(RideStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public RideStatusEnum getStatus() {
    return status;
  }

  public void setStatus(RideStatusEnum status) {
    this.status = status;
  }

  public RideDetail vehicle(VehicleDetail vehicle) {
    this.vehicle = vehicle;
    return this;
  }

  /**
   * Get vehicle
   * @return vehicle
  */
  @Valid 
  @Schema(name = "vehicle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicle")
  public VehicleDetail getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleDetail vehicle) {
    this.vehicle = vehicle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideDetail rideDetail = (RideDetail) o;
    return Objects.equals(this.beaconColor, rideDetail.beaconColor) &&
        Objects.equals(this.canCancel, rideDetail.canCancel) &&
        Objects.equals(this.canceledBy, rideDetail.canceledBy) &&
        Objects.equals(this.cancellationPrice, rideDetail.cancellationPrice) &&
        Objects.equals(this.destination, rideDetail.destination) &&
        Objects.equals(this.distanceMiles, rideDetail.distanceMiles) &&
        Objects.equals(this.driver, rideDetail.driver) &&
        Objects.equals(this.dropoff, rideDetail.dropoff) &&
        Objects.equals(this.durationSeconds, rideDetail.durationSeconds) &&
        Objects.equals(this.feedback, rideDetail.feedback) &&
        Objects.equals(this.generatedAt, rideDetail.generatedAt) &&
        Objects.equals(this.lineItems, rideDetail.lineItems) &&
        Objects.equals(this.location, rideDetail.location) &&
        Objects.equals(this.origin, rideDetail.origin) &&
        Objects.equals(this.passenger, rideDetail.passenger) &&
        Objects.equals(this.pickup, rideDetail.pickup) &&
        Objects.equals(this.price, rideDetail.price) &&
        Objects.equals(this.pricingDetailsUrl, rideDetail.pricingDetailsUrl) &&
        Objects.equals(this.primetimePercentage, rideDetail.primetimePercentage) &&
        Objects.equals(this.rating, rideDetail.rating) &&
        Objects.equals(this.requestedAt, rideDetail.requestedAt) &&
        Objects.equals(this.rideId, rideDetail.rideId) &&
        Objects.equals(this.rideProfile, rideDetail.rideProfile) &&
        Objects.equals(this.rideType, rideDetail.rideType) &&
        Objects.equals(this.routeUrl, rideDetail.routeUrl) &&
        Objects.equals(this.status, rideDetail.status) &&
        Objects.equals(this.vehicle, rideDetail.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beaconColor, canCancel, canceledBy, cancellationPrice, destination, distanceMiles, driver, dropoff, durationSeconds, feedback, generatedAt, lineItems, location, origin, passenger, pickup, price, pricingDetailsUrl, primetimePercentage, rating, requestedAt, rideId, rideProfile, rideType, routeUrl, status, vehicle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideDetail {\n");
    sb.append("    beaconColor: ").append(toIndentedString(beaconColor)).append("\n");
    sb.append("    canCancel: ").append(toIndentedString(canCancel)).append("\n");
    sb.append("    canceledBy: ").append(toIndentedString(canceledBy)).append("\n");
    sb.append("    cancellationPrice: ").append(toIndentedString(cancellationPrice)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    dropoff: ").append(toIndentedString(dropoff)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingDetailsUrl: ").append(toIndentedString(pricingDetailsUrl)).append("\n");
    sb.append("    primetimePercentage: ").append(toIndentedString(primetimePercentage)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    rideId: ").append(toIndentedString(rideId)).append("\n");
    sb.append("    rideProfile: ").append(toIndentedString(rideProfile)).append("\n");
    sb.append("    rideType: ").append(toIndentedString(rideType)).append("\n");
    sb.append("    routeUrl: ").append(toIndentedString(routeUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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


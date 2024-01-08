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
import org.openapitools.model.Charge;
import org.openapitools.model.Cost;
import org.openapitools.model.LineItem;
import org.openapitools.model.RideProfileEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Receipt information of a processed ride.
 */

@Schema(name = "RideReceipt", description = "Receipt information of a processed ride.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideReceipt {

  @Valid
  private List<@Valid Charge> charges;

  @Valid
  private List<@Valid LineItem> lineItems;

  private Cost price;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedAt;

  private String rideId;

  private RideProfileEnum rideProfile;

  public RideReceipt charges(List<@Valid Charge> charges) {
    this.charges = charges;
    return this;
  }

  public RideReceipt addChargesItem(Charge chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * The break down of charge method
   * @return charges
  */
  @Valid 
  @Schema(name = "charges", description = "The break down of charge method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("charges")
  public List<@Valid Charge> getCharges() {
    return charges;
  }

  public void setCharges(List<@Valid Charge> charges) {
    this.charges = charges;
  }

  public RideReceipt lineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public RideReceipt addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * The break down of line items
   * @return lineItems
  */
  @Valid 
  @Schema(name = "line_items", description = "The break down of line items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_items")
  public List<@Valid LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<@Valid LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public RideReceipt price(Cost price) {
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

  public RideReceipt requestedAt(OffsetDateTime requestedAt) {
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

  public RideReceipt rideId(String rideId) {
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

  public RideReceipt rideProfile(RideProfileEnum rideProfile) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideReceipt rideReceipt = (RideReceipt) o;
    return Objects.equals(this.charges, rideReceipt.charges) &&
        Objects.equals(this.lineItems, rideReceipt.lineItems) &&
        Objects.equals(this.price, rideReceipt.price) &&
        Objects.equals(this.requestedAt, rideReceipt.requestedAt) &&
        Objects.equals(this.rideId, rideReceipt.rideId) &&
        Objects.equals(this.rideProfile, rideReceipt.rideProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charges, lineItems, price, requestedAt, rideId, rideProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideReceipt {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    rideId: ").append(toIndentedString(rideId)).append("\n");
    sb.append("    rideProfile: ").append(toIndentedString(rideProfile)).append("\n");
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


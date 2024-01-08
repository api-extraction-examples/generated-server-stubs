package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Location;
import org.openapitools.model.RideTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a requested, ongoing, or finished Lyft ride
 */

@Schema(name = "Ride", description = "Represents a requested, ongoing, or finished Lyft ride")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Ride {

  private String costToken;

  private Location destination;

  private Location origin;

  private String primetimeConfirmationToken;

  private RideTypeEnum rideType;

  public Ride() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Ride(Location origin, RideTypeEnum rideType) {
    this.origin = origin;
    this.rideType = rideType;
  }

  public Ride costToken(String costToken) {
    this.costToken = costToken;
    return this;
  }

  /**
   * A token that confirms the user has accepted current Prime Time and/or fixed price charges
   * @return costToken
  */
  
  @Schema(name = "cost_token", description = "A token that confirms the user has accepted current Prime Time and/or fixed price charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_token")
  public String getCostToken() {
    return costToken;
  }

  public void setCostToken(String costToken) {
    this.costToken = costToken;
  }

  public Ride destination(Location destination) {
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
  public Location getDestination() {
    return destination;
  }

  public void setDestination(Location destination) {
    this.destination = destination;
  }

  public Ride origin(Location origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Get origin
   * @return origin
  */
  @NotNull @Valid 
  @Schema(name = "origin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("origin")
  public Location getOrigin() {
    return origin;
  }

  public void setOrigin(Location origin) {
    this.origin = origin;
  }

  public Ride primetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
    return this;
  }

  /**
   * A token that confirms the user has accepted current primetime charges (Deprecated)
   * @return primetimeConfirmationToken
  */
  
  @Schema(name = "primetime_confirmation_token", description = "A token that confirms the user has accepted current primetime charges (Deprecated)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_confirmation_token")
  public String getPrimetimeConfirmationToken() {
    return primetimeConfirmationToken;
  }

  public void setPrimetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
  }

  public Ride rideType(RideTypeEnum rideType) {
    this.rideType = rideType;
    return this;
  }

  /**
   * Get rideType
   * @return rideType
  */
  @NotNull @Valid 
  @Schema(name = "ride_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ride_type")
  public RideTypeEnum getRideType() {
    return rideType;
  }

  public void setRideType(RideTypeEnum rideType) {
    this.rideType = rideType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ride ride = (Ride) o;
    return Objects.equals(this.costToken, ride.costToken) &&
        Objects.equals(this.destination, ride.destination) &&
        Objects.equals(this.origin, ride.origin) &&
        Objects.equals(this.primetimeConfirmationToken, ride.primetimeConfirmationToken) &&
        Objects.equals(this.rideType, ride.rideType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costToken, destination, origin, primetimeConfirmationToken, rideType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ride {\n");
    sb.append("    costToken: ").append(toIndentedString(costToken)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    primetimeConfirmationToken: ").append(toIndentedString(primetimeConfirmationToken)).append("\n");
    sb.append("    rideType: ").append(toIndentedString(rideType)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Location;
import org.openapitools.model.PassengerDetail;
import org.openapitools.model.RideStatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Minimal set of ride details
 */

@Schema(name = "RideRequest", description = "Minimal set of ride details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideRequest {

  private Location destination;

  private Location origin;

  private PassengerDetail passenger;

  private String rideId;

  private RideStatusEnum status;

  public RideRequest destination(Location destination) {
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

  public RideRequest origin(Location origin) {
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
  public Location getOrigin() {
    return origin;
  }

  public void setOrigin(Location origin) {
    this.origin = origin;
  }

  public RideRequest passenger(PassengerDetail passenger) {
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

  public RideRequest rideId(String rideId) {
    this.rideId = rideId;
    return this;
  }

  /**
   * The ID of the requested ride
   * @return rideId
  */
  
  @Schema(name = "ride_id", description = "The ID of the requested ride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_id")
  public String getRideId() {
    return rideId;
  }

  public void setRideId(String rideId) {
    this.rideId = rideId;
  }

  public RideRequest status(RideStatusEnum status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideRequest rideRequest = (RideRequest) o;
    return Objects.equals(this.destination, rideRequest.destination) &&
        Objects.equals(this.origin, rideRequest.origin) &&
        Objects.equals(this.passenger, rideRequest.passenger) &&
        Objects.equals(this.rideId, rideRequest.rideId) &&
        Objects.equals(this.status, rideRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, origin, passenger, rideId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideRequest {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    rideId: ").append(toIndentedString(rideId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RideStatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response when a sandbox ride is propagated through ride status
 */

@Schema(name = "SandboxRideUpdate", description = "Response when a sandbox ride is propagated through ride status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class SandboxRideUpdate {

  private String rideId;

  private RideStatusEnum status;

  public SandboxRideUpdate rideId(String rideId) {
    this.rideId = rideId;
    return this;
  }

  /**
   * The ID of the ride
   * @return rideId
  */
  
  @Schema(name = "ride_id", description = "The ID of the ride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_id")
  public String getRideId() {
    return rideId;
  }

  public void setRideId(String rideId) {
    this.rideId = rideId;
  }

  public SandboxRideUpdate status(RideStatusEnum status) {
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
    SandboxRideUpdate sandboxRideUpdate = (SandboxRideUpdate) o;
    return Objects.equals(this.rideId, sandboxRideUpdate.rideId) &&
        Objects.equals(this.status, sandboxRideUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rideId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxRideUpdate {\n");
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


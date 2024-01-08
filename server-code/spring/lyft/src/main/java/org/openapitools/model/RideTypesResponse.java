package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RideType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RideTypesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class RideTypesResponse {

  @Valid
  private List<@Valid RideType> rideTypes;

  public RideTypesResponse rideTypes(List<@Valid RideType> rideTypes) {
    this.rideTypes = rideTypes;
    return this;
  }

  public RideTypesResponse addRideTypesItem(RideType rideTypesItem) {
    if (this.rideTypes == null) {
      this.rideTypes = new ArrayList<>();
    }
    this.rideTypes.add(rideTypesItem);
    return this;
  }

  /**
   * Get rideTypes
   * @return rideTypes
  */
  @Valid 
  @Schema(name = "ride_types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ride_types")
  public List<@Valid RideType> getRideTypes() {
    return rideTypes;
  }

  public void setRideTypes(List<@Valid RideType> rideTypes) {
    this.rideTypes = rideTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RideTypesResponse rideTypesResponse = (RideTypesResponse) o;
    return Objects.equals(this.rideTypes, rideTypesResponse.rideTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rideTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RideTypesResponse {\n");
    sb.append("    rideTypes: ").append(toIndentedString(rideTypes)).append("\n");
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


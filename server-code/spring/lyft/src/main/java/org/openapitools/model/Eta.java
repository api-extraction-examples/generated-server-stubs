package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RideTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Estimated Time of Arrival
 */

@Schema(name = "Eta", description = "Estimated Time of Arrival")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Eta {

  private String displayName;

  private Integer etaSeconds;

  private Integer etaSecondsMax;

  private Boolean isValidEstimate;

  private RideTypeEnum rideType;

  public Eta displayName(String displayName) {
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

  public Eta etaSeconds(Integer etaSeconds) {
    this.etaSeconds = etaSeconds;
    return this;
  }

  /**
   * Estimated seconds for a driver to arrive
   * @return etaSeconds
  */
  
  @Schema(name = "eta_seconds", description = "Estimated seconds for a driver to arrive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eta_seconds")
  public Integer getEtaSeconds() {
    return etaSeconds;
  }

  public void setEtaSeconds(Integer etaSeconds) {
    this.etaSeconds = etaSeconds;
  }

  public Eta etaSecondsMax(Integer etaSecondsMax) {
    this.etaSecondsMax = etaSecondsMax;
    return this;
  }

  /**
   * Estimated upper bound of seconds for a driver to arrive
   * @return etaSecondsMax
  */
  
  @Schema(name = "eta_seconds_max", description = "Estimated upper bound of seconds for a driver to arrive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eta_seconds_max")
  public Integer getEtaSecondsMax() {
    return etaSecondsMax;
  }

  public void setEtaSecondsMax(Integer etaSecondsMax) {
    this.etaSecondsMax = etaSecondsMax;
  }

  public Eta isValidEstimate(Boolean isValidEstimate) {
    this.isValidEstimate = isValidEstimate;
    return this;
  }

  /**
   * The validity of the ETA estimate returned
   * @return isValidEstimate
  */
  
  @Schema(name = "is_valid_estimate", description = "The validity of the ETA estimate returned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_valid_estimate")
  public Boolean getIsValidEstimate() {
    return isValidEstimate;
  }

  public void setIsValidEstimate(Boolean isValidEstimate) {
    this.isValidEstimate = isValidEstimate;
  }

  public Eta rideType(RideTypeEnum rideType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eta eta = (Eta) o;
    return Objects.equals(this.displayName, eta.displayName) &&
        Objects.equals(this.etaSeconds, eta.etaSeconds) &&
        Objects.equals(this.etaSecondsMax, eta.etaSecondsMax) &&
        Objects.equals(this.isValidEstimate, eta.isValidEstimate) &&
        Objects.equals(this.rideType, eta.rideType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, etaSeconds, etaSecondsMax, isValidEstimate, rideType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eta {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    etaSeconds: ").append(toIndentedString(etaSeconds)).append("\n");
    sb.append("    etaSecondsMax: ").append(toIndentedString(etaSecondsMax)).append("\n");
    sb.append("    isValidEstimate: ").append(toIndentedString(isValidEstimate)).append("\n");
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


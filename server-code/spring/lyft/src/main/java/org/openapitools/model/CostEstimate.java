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
 * A non-guaranteed estimate of price
 */

@Schema(name = "CostEstimate", description = "A non-guaranteed estimate of price")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class CostEstimate {

  private String costToken;

  private String currency;

  private String displayName;

  private Integer estimatedCostCentsMax;

  private Integer estimatedCostCentsMin;

  private Double estimatedDistanceMiles;

  private Integer estimatedDurationSeconds;

  private Boolean isValidEstimate;

  private String primetimeConfirmationToken;

  private String primetimePercentage;

  private RideTypeEnum rideType;

  public CostEstimate costToken(String costToken) {
    this.costToken = costToken;
    return this;
  }

  /**
   * A token that confirms the user has accepted current Prime Time and/or fixed price charges. See 'Request a Lyft' for more details
   * @return costToken
  */
  
  @Schema(name = "cost_token", description = "A token that confirms the user has accepted current Prime Time and/or fixed price charges. See 'Request a Lyft' for more details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_token")
  public String getCostToken() {
    return costToken;
  }

  public void setCostToken(String costToken) {
    this.costToken = costToken;
  }

  public CostEstimate currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The ISO 4217 currency code for the amount (e.g. 'USD')
   * @return currency
  */
  
  @Schema(name = "currency", description = "The ISO 4217 currency code for the amount (e.g. 'USD')", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CostEstimate displayName(String displayName) {
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

  public CostEstimate estimatedCostCentsMax(Integer estimatedCostCentsMax) {
    this.estimatedCostCentsMax = estimatedCostCentsMax;
    return this;
  }

  /**
   * Estimated upper bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. 
   * @return estimatedCostCentsMax
  */
  
  @Schema(name = "estimated_cost_cents_max", description = "Estimated upper bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_cost_cents_max")
  public Integer getEstimatedCostCentsMax() {
    return estimatedCostCentsMax;
  }

  public void setEstimatedCostCentsMax(Integer estimatedCostCentsMax) {
    this.estimatedCostCentsMax = estimatedCostCentsMax;
  }

  public CostEstimate estimatedCostCentsMin(Integer estimatedCostCentsMin) {
    this.estimatedCostCentsMin = estimatedCostCentsMin;
    return this;
  }

  /**
   * Estimated lower bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. 
   * @return estimatedCostCentsMin
  */
  
  @Schema(name = "estimated_cost_cents_min", description = "Estimated lower bound for trip cost, in minor units (cents). Estimates are not guaranteed, and only provide a reasonable range based on current conditions. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_cost_cents_min")
  public Integer getEstimatedCostCentsMin() {
    return estimatedCostCentsMin;
  }

  public void setEstimatedCostCentsMin(Integer estimatedCostCentsMin) {
    this.estimatedCostCentsMin = estimatedCostCentsMin;
  }

  public CostEstimate estimatedDistanceMiles(Double estimatedDistanceMiles) {
    this.estimatedDistanceMiles = estimatedDistanceMiles;
    return this;
  }

  /**
   * Estimated distance for this trip 
   * @return estimatedDistanceMiles
  */
  
  @Schema(name = "estimated_distance_miles", description = "Estimated distance for this trip ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_distance_miles")
  public Double getEstimatedDistanceMiles() {
    return estimatedDistanceMiles;
  }

  public void setEstimatedDistanceMiles(Double estimatedDistanceMiles) {
    this.estimatedDistanceMiles = estimatedDistanceMiles;
  }

  public CostEstimate estimatedDurationSeconds(Integer estimatedDurationSeconds) {
    this.estimatedDurationSeconds = estimatedDurationSeconds;
    return this;
  }

  /**
   * Estimated time to get from the start location to the end. 
   * @return estimatedDurationSeconds
  */
  
  @Schema(name = "estimated_duration_seconds", description = "Estimated time to get from the start location to the end. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimated_duration_seconds")
  public Integer getEstimatedDurationSeconds() {
    return estimatedDurationSeconds;
  }

  public void setEstimatedDurationSeconds(Integer estimatedDurationSeconds) {
    this.estimatedDurationSeconds = estimatedDurationSeconds;
  }

  public CostEstimate isValidEstimate(Boolean isValidEstimate) {
    this.isValidEstimate = isValidEstimate;
    return this;
  }

  /**
   * The validity of the cost estimate returned
   * @return isValidEstimate
  */
  
  @Schema(name = "is_valid_estimate", description = "The validity of the cost estimate returned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_valid_estimate")
  public Boolean getIsValidEstimate() {
    return isValidEstimate;
  }

  public void setIsValidEstimate(Boolean isValidEstimate) {
    this.isValidEstimate = isValidEstimate;
  }

  public CostEstimate primetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
    return this;
  }

  /**
   * This token is needed when requesting rides. (Deprecated)
   * @return primetimeConfirmationToken
  */
  
  @Schema(name = "primetime_confirmation_token", description = "This token is needed when requesting rides. (Deprecated)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_confirmation_token")
  public String getPrimetimeConfirmationToken() {
    return primetimeConfirmationToken;
  }

  public void setPrimetimeConfirmationToken(String primetimeConfirmationToken) {
    this.primetimeConfirmationToken = primetimeConfirmationToken;
  }

  public CostEstimate primetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
    return this;
  }

  /**
   * Current Prime Time Percentage. Prime Time adds a percentage to ride costs, prior to other applicable fees. When ride requests greatly outnumber available drivers, our system will automatically turn on Prime Time. If Prime Time is inactive, the value returned will be '0%'. Note: The returned estimate already has Prime Time factored in. The value is returned here for reference and to allow users to confirm/accept Prime Time prior to initiating a ride. 
   * @return primetimePercentage
  */
  
  @Schema(name = "primetime_percentage", description = "Current Prime Time Percentage. Prime Time adds a percentage to ride costs, prior to other applicable fees. When ride requests greatly outnumber available drivers, our system will automatically turn on Prime Time. If Prime Time is inactive, the value returned will be '0%'. Note: The returned estimate already has Prime Time factored in. The value is returned here for reference and to allow users to confirm/accept Prime Time prior to initiating a ride. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primetime_percentage")
  public String getPrimetimePercentage() {
    return primetimePercentage;
  }

  public void setPrimetimePercentage(String primetimePercentage) {
    this.primetimePercentage = primetimePercentage;
  }

  public CostEstimate rideType(RideTypeEnum rideType) {
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
    CostEstimate costEstimate = (CostEstimate) o;
    return Objects.equals(this.costToken, costEstimate.costToken) &&
        Objects.equals(this.currency, costEstimate.currency) &&
        Objects.equals(this.displayName, costEstimate.displayName) &&
        Objects.equals(this.estimatedCostCentsMax, costEstimate.estimatedCostCentsMax) &&
        Objects.equals(this.estimatedCostCentsMin, costEstimate.estimatedCostCentsMin) &&
        Objects.equals(this.estimatedDistanceMiles, costEstimate.estimatedDistanceMiles) &&
        Objects.equals(this.estimatedDurationSeconds, costEstimate.estimatedDurationSeconds) &&
        Objects.equals(this.isValidEstimate, costEstimate.isValidEstimate) &&
        Objects.equals(this.primetimeConfirmationToken, costEstimate.primetimeConfirmationToken) &&
        Objects.equals(this.primetimePercentage, costEstimate.primetimePercentage) &&
        Objects.equals(this.rideType, costEstimate.rideType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costToken, currency, displayName, estimatedCostCentsMax, estimatedCostCentsMin, estimatedDistanceMiles, estimatedDurationSeconds, isValidEstimate, primetimeConfirmationToken, primetimePercentage, rideType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimate {\n");
    sb.append("    costToken: ").append(toIndentedString(costToken)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    estimatedCostCentsMax: ").append(toIndentedString(estimatedCostCentsMax)).append("\n");
    sb.append("    estimatedCostCentsMin: ").append(toIndentedString(estimatedCostCentsMin)).append("\n");
    sb.append("    estimatedDistanceMiles: ").append(toIndentedString(estimatedDistanceMiles)).append("\n");
    sb.append("    estimatedDurationSeconds: ").append(toIndentedString(estimatedDurationSeconds)).append("\n");
    sb.append("    isValidEstimate: ").append(toIndentedString(isValidEstimate)).append("\n");
    sb.append("    primetimeConfirmationToken: ").append(toIndentedString(primetimeConfirmationToken)).append("\n");
    sb.append("    primetimePercentage: ").append(toIndentedString(primetimePercentage)).append("\n");
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


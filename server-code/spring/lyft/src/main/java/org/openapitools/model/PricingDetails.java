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
 * PricingDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class PricingDetails {

  private Integer baseCharge;

  private Integer cancelPenaltyAmount;

  private Integer costMinimum;

  private Integer costPerMile;

  private Integer costPerMinute;

  private String currency;

  private Integer trustAndService;

  public PricingDetails baseCharge(Integer baseCharge) {
    this.baseCharge = baseCharge;
    return this;
  }

  /**
   * The base charge of the trip
   * @return baseCharge
  */
  
  @Schema(name = "base_charge", description = "The base charge of the trip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_charge")
  public Integer getBaseCharge() {
    return baseCharge;
  }

  public void setBaseCharge(Integer baseCharge) {
    this.baseCharge = baseCharge;
  }

  public PricingDetails cancelPenaltyAmount(Integer cancelPenaltyAmount) {
    this.cancelPenaltyAmount = cancelPenaltyAmount;
    return this;
  }

  /**
   * The charge amount if cancel penalty is involved
   * @return cancelPenaltyAmount
  */
  
  @Schema(name = "cancel_penalty_amount", description = "The charge amount if cancel penalty is involved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancel_penalty_amount")
  public Integer getCancelPenaltyAmount() {
    return cancelPenaltyAmount;
  }

  public void setCancelPenaltyAmount(Integer cancelPenaltyAmount) {
    this.cancelPenaltyAmount = cancelPenaltyAmount;
  }

  public PricingDetails costMinimum(Integer costMinimum) {
    this.costMinimum = costMinimum;
    return this;
  }

  /**
   * The minimum charge for the trip
   * @return costMinimum
  */
  
  @Schema(name = "cost_minimum", description = "The minimum charge for the trip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_minimum")
  public Integer getCostMinimum() {
    return costMinimum;
  }

  public void setCostMinimum(Integer costMinimum) {
    this.costMinimum = costMinimum;
  }

  public PricingDetails costPerMile(Integer costPerMile) {
    this.costPerMile = costPerMile;
    return this;
  }

  /**
   * The cost per mile
   * @return costPerMile
  */
  
  @Schema(name = "cost_per_mile", description = "The cost per mile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_per_mile")
  public Integer getCostPerMile() {
    return costPerMile;
  }

  public void setCostPerMile(Integer costPerMile) {
    this.costPerMile = costPerMile;
  }

  public PricingDetails costPerMinute(Integer costPerMinute) {
    this.costPerMinute = costPerMinute;
    return this;
  }

  /**
   * The cost per minute
   * @return costPerMinute
  */
  
  @Schema(name = "cost_per_minute", description = "The cost per minute", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cost_per_minute")
  public Integer getCostPerMinute() {
    return costPerMinute;
  }

  public void setCostPerMinute(Integer costPerMinute) {
    this.costPerMinute = costPerMinute;
  }

  public PricingDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The ISO 4217 currency code for the amount (e.g. USD)
   * @return currency
  */
  
  @Schema(name = "currency", description = "The ISO 4217 currency code for the amount (e.g. USD)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PricingDetails trustAndService(Integer trustAndService) {
    this.trustAndService = trustAndService;
    return this;
  }

  /**
   * Service fee
   * @return trustAndService
  */
  
  @Schema(name = "trust_and_service", description = "Service fee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trust_and_service")
  public Integer getTrustAndService() {
    return trustAndService;
  }

  public void setTrustAndService(Integer trustAndService) {
    this.trustAndService = trustAndService;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingDetails pricingDetails = (PricingDetails) o;
    return Objects.equals(this.baseCharge, pricingDetails.baseCharge) &&
        Objects.equals(this.cancelPenaltyAmount, pricingDetails.cancelPenaltyAmount) &&
        Objects.equals(this.costMinimum, pricingDetails.costMinimum) &&
        Objects.equals(this.costPerMile, pricingDetails.costPerMile) &&
        Objects.equals(this.costPerMinute, pricingDetails.costPerMinute) &&
        Objects.equals(this.currency, pricingDetails.currency) &&
        Objects.equals(this.trustAndService, pricingDetails.trustAndService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCharge, cancelPenaltyAmount, costMinimum, costPerMile, costPerMinute, currency, trustAndService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingDetails {\n");
    sb.append("    baseCharge: ").append(toIndentedString(baseCharge)).append("\n");
    sb.append("    cancelPenaltyAmount: ").append(toIndentedString(cancelPenaltyAmount)).append("\n");
    sb.append("    costMinimum: ").append(toIndentedString(costMinimum)).append("\n");
    sb.append("    costPerMile: ").append(toIndentedString(costPerMile)).append("\n");
    sb.append("    costPerMinute: ").append(toIndentedString(costPerMinute)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    trustAndService: ").append(toIndentedString(trustAndService)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AppUpdateRequestDataRelationshipsAvailableTerritories;
import org.openapitools.model.AppUpdateRequestDataRelationshipsPrices;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppUpdateRequestDataRelationships
 */

@JsonTypeName("AppUpdateRequest_data_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppUpdateRequestDataRelationships {

  private AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories;

  private AppUpdateRequestDataRelationshipsPrices prices;

  public AppUpdateRequestDataRelationships availableTerritories(AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
    return this;
  }

  /**
   * Get availableTerritories
   * @return availableTerritories
  */
  @Valid 
  @Schema(name = "availableTerritories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableTerritories")
  public AppUpdateRequestDataRelationshipsAvailableTerritories getAvailableTerritories() {
    return availableTerritories;
  }

  public void setAvailableTerritories(AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
  }

  public AppUpdateRequestDataRelationships prices(AppUpdateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  @Schema(name = "prices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prices")
  public AppUpdateRequestDataRelationshipsPrices getPrices() {
    return prices;
  }

  public void setPrices(AppUpdateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUpdateRequestDataRelationships appUpdateRequestDataRelationships = (AppUpdateRequestDataRelationships) o;
    return Objects.equals(this.availableTerritories, appUpdateRequestDataRelationships.availableTerritories) &&
        Objects.equals(this.prices, appUpdateRequestDataRelationships.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableTerritories, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUpdateRequestDataRelationships {\n");
    sb.append("    availableTerritories: ").append(toIndentedString(availableTerritories)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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


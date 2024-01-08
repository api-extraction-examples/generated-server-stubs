package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryType;
import org.openapitools.model.Error;
import org.openapitools.model.RegionSet;
import org.openapitools.model.ShippingOption;
import org.openapitools.model.TimeDuration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Complex type that that gets populated with a response containing a fulfillment policy.
 */

@Schema(name = "SetFulfillmentPolicyResponse", description = "Complex type that that gets populated with a response containing a fulfillment policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SetFulfillmentPolicyResponse {

  @Valid
  private List<@Valid CategoryType> categoryTypes;

  private String description;

  private Boolean freightShipping;

  private String fulfillmentPolicyId;

  private Boolean globalShipping;

  private TimeDuration handlingTime;

  private Boolean localPickup;

  private String marketplaceId;

  private String name;

  private Boolean pickupDropOff;

  private RegionSet shipToLocations;

  @Valid
  private List<@Valid ShippingOption> shippingOptions;

  @Valid
  private List<@Valid Error> warnings;

  public SetFulfillmentPolicyResponse categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public SetFulfillmentPolicyResponse addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container indicates whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container indicates whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public SetFulfillmentPolicyResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SetFulfillmentPolicyResponse freightShipping(Boolean freightShipping) {
    this.freightShipping = freightShipping;
    return this;
  }

  /**
   * If returned as <code>true</code>, the seller offers freight shipping. Freight shipping can be used for large items over 150 lbs.
   * @return freightShipping
  */
  
  @Schema(name = "freightShipping", description = "If returned as <code>true</code>, the seller offers freight shipping. Freight shipping can be used for large items over 150 lbs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freightShipping")
  public Boolean getFreightShipping() {
    return freightShipping;
  }

  public void setFreightShipping(Boolean freightShipping) {
    this.freightShipping = freightShipping;
  }

  public SetFulfillmentPolicyResponse fulfillmentPolicyId(String fulfillmentPolicyId) {
    this.fulfillmentPolicyId = fulfillmentPolicyId;
    return this;
  }

  /**
   * A unique eBay-assigned ID for a fulfillment business policy. This ID is generated when the policy is created.
   * @return fulfillmentPolicyId
  */
  
  @Schema(name = "fulfillmentPolicyId", description = "A unique eBay-assigned ID for a fulfillment business policy. This ID is generated when the policy is created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulfillmentPolicyId")
  public String getFulfillmentPolicyId() {
    return fulfillmentPolicyId;
  }

  public void setFulfillmentPolicyId(String fulfillmentPolicyId) {
    this.fulfillmentPolicyId = fulfillmentPolicyId;
  }

  public SetFulfillmentPolicyResponse globalShipping(Boolean globalShipping) {
    this.globalShipping = globalShipping;
    return this;
  }

  /**
   * If returned as <code>true</code>, the eBay Global Shipping Program will be used by the seller to ship items to international locations.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span>
   * @return globalShipping
  */
  
  @Schema(name = "globalShipping", description = "If returned as <code>true</code>, the eBay Global Shipping Program will be used by the seller to ship items to international locations.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalShipping")
  public Boolean getGlobalShipping() {
    return globalShipping;
  }

  public void setGlobalShipping(Boolean globalShipping) {
    this.globalShipping = globalShipping;
  }

  public SetFulfillmentPolicyResponse handlingTime(TimeDuration handlingTime) {
    this.handlingTime = handlingTime;
    return this;
  }

  /**
   * Get handlingTime
   * @return handlingTime
  */
  @Valid 
  @Schema(name = "handlingTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handlingTime")
  public TimeDuration getHandlingTime() {
    return handlingTime;
  }

  public void setHandlingTime(TimeDuration handlingTime) {
    this.handlingTime = handlingTime;
  }

  public SetFulfillmentPolicyResponse localPickup(Boolean localPickup) {
    this.localPickup = localPickup;
    return this;
  }

  /**
   * If returned as <code>true</code>, local pickup is available for this policy.
   * @return localPickup
  */
  
  @Schema(name = "localPickup", description = "If returned as <code>true</code>, local pickup is available for this policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localPickup")
  public Boolean getLocalPickup() {
    return localPickup;
  }

  public void setLocalPickup(Boolean localPickup) {
    this.localPickup = localPickup;
  }

  public SetFulfillmentPolicyResponse marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which this fulfillment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which this fulfillment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public SetFulfillmentPolicyResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A seller-defined name for this fulfillment business policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64
   * @return name
  */
  
  @Schema(name = "name", description = "A seller-defined name for this fulfillment business policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SetFulfillmentPolicyResponse pickupDropOff(Boolean pickupDropOff) {
    this.pickupDropOff = pickupDropOff;
    return this;
  }

  /**
   * If returned as <code>true</code>, the seller offers the \"Click and Collect\" option. <br/><br/>Currently, \"Click and Collect\" is available only to large retail merchants the eBay AU and UK marketplaces.
   * @return pickupDropOff
  */
  
  @Schema(name = "pickupDropOff", description = "If returned as <code>true</code>, the seller offers the \"Click and Collect\" option. <br/><br/>Currently, \"Click and Collect\" is available only to large retail merchants the eBay AU and UK marketplaces.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupDropOff")
  public Boolean getPickupDropOff() {
    return pickupDropOff;
  }

  public void setPickupDropOff(Boolean pickupDropOff) {
    this.pickupDropOff = pickupDropOff;
  }

  public SetFulfillmentPolicyResponse shipToLocations(RegionSet shipToLocations) {
    this.shipToLocations = shipToLocations;
    return this;
  }

  /**
   * Get shipToLocations
   * @return shipToLocations
  */
  @Valid 
  @Schema(name = "shipToLocations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipToLocations")
  public RegionSet getShipToLocations() {
    return shipToLocations;
  }

  public void setShipToLocations(RegionSet shipToLocations) {
    this.shipToLocations = shipToLocations;
  }

  public SetFulfillmentPolicyResponse shippingOptions(List<@Valid ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public SetFulfillmentPolicyResponse addShippingOptionsItem(ShippingOption shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

  /**
   * This array is used to provide detailed information on the domestic and international shipping options available for the policy. A separate <b>ShippingOption</b> object covers domestic shipping service options and international shipping service options (if the seller ships to international locations). <br /><br />The <b>optionType</b> field indicates whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field indicates whether flat-rate shipping or calculated shipping will be used. <p>A separate <b>ShippingServices</b> object is used to specify cost and other details for every available domestic and international shipping service option. </p>
   * @return shippingOptions
  */
  @Valid 
  @Schema(name = "shippingOptions", description = "This array is used to provide detailed information on the domestic and international shipping options available for the policy. A separate <b>ShippingOption</b> object covers domestic shipping service options and international shipping service options (if the seller ships to international locations). <br /><br />The <b>optionType</b> field indicates whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field indicates whether flat-rate shipping or calculated shipping will be used. <p>A separate <b>ShippingServices</b> object is used to specify cost and other details for every available domestic and international shipping service option. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingOptions")
  public List<@Valid ShippingOption> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<@Valid ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  public SetFulfillmentPolicyResponse warnings(List<@Valid Error> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SetFulfillmentPolicyResponse addWarningsItem(Error warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.
   * @return warnings
  */
  @Valid 
  @Schema(name = "warnings", description = "An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<@Valid Error> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid Error> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetFulfillmentPolicyResponse setFulfillmentPolicyResponse = (SetFulfillmentPolicyResponse) o;
    return Objects.equals(this.categoryTypes, setFulfillmentPolicyResponse.categoryTypes) &&
        Objects.equals(this.description, setFulfillmentPolicyResponse.description) &&
        Objects.equals(this.freightShipping, setFulfillmentPolicyResponse.freightShipping) &&
        Objects.equals(this.fulfillmentPolicyId, setFulfillmentPolicyResponse.fulfillmentPolicyId) &&
        Objects.equals(this.globalShipping, setFulfillmentPolicyResponse.globalShipping) &&
        Objects.equals(this.handlingTime, setFulfillmentPolicyResponse.handlingTime) &&
        Objects.equals(this.localPickup, setFulfillmentPolicyResponse.localPickup) &&
        Objects.equals(this.marketplaceId, setFulfillmentPolicyResponse.marketplaceId) &&
        Objects.equals(this.name, setFulfillmentPolicyResponse.name) &&
        Objects.equals(this.pickupDropOff, setFulfillmentPolicyResponse.pickupDropOff) &&
        Objects.equals(this.shipToLocations, setFulfillmentPolicyResponse.shipToLocations) &&
        Objects.equals(this.shippingOptions, setFulfillmentPolicyResponse.shippingOptions) &&
        Objects.equals(this.warnings, setFulfillmentPolicyResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, description, freightShipping, fulfillmentPolicyId, globalShipping, handlingTime, localPickup, marketplaceId, name, pickupDropOff, shipToLocations, shippingOptions, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFulfillmentPolicyResponse {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    freightShipping: ").append(toIndentedString(freightShipping)).append("\n");
    sb.append("    fulfillmentPolicyId: ").append(toIndentedString(fulfillmentPolicyId)).append("\n");
    sb.append("    globalShipping: ").append(toIndentedString(globalShipping)).append("\n");
    sb.append("    handlingTime: ").append(toIndentedString(handlingTime)).append("\n");
    sb.append("    localPickup: ").append(toIndentedString(localPickup)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pickupDropOff: ").append(toIndentedString(pickupDropOff)).append("\n");
    sb.append("    shipToLocations: ").append(toIndentedString(shipToLocations)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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


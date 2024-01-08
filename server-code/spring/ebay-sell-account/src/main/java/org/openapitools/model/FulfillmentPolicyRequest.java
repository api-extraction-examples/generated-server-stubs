package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryType;
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
 * This root container defines a seller&#39;s fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.
 */

@Schema(name = "FulfillmentPolicyRequest", description = "This root container defines a seller's fulfillment policy for a specific marketplace and category group. This type is used when creating or updating a fulfillment business policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class FulfillmentPolicyRequest {

  @Valid
  private List<@Valid CategoryType> categoryTypes;

  private String description;

  private Boolean freightShipping;

  private Boolean globalShipping;

  private TimeDuration handlingTime;

  private Boolean localPickup;

  private String marketplaceId;

  private String name;

  private Boolean pickupDropOff;

  private RegionSet shipToLocations;

  @Valid
  private List<@Valid ShippingOption> shippingOptions;

  public FulfillmentPolicyRequest categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public FulfillmentPolicyRequest addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container is used to specify whether the fulfillment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public FulfillmentPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the fulfillment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FulfillmentPolicyRequest freightShipping(Boolean freightShipping) {
    this.freightShipping = freightShipping;
    return this;
  }

  /**
   * This field is included and set to <code>true</code> if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.<br/><br/><b>Default</b>: false
   * @return freightShipping
  */
  
  @Schema(name = "freightShipping", description = "This field is included and set to <code>true</code> if freight shipping is available for the item. Freight shipping can be used for large items over 150 lbs.<br/><br/><b>Default</b>: false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freightShipping")
  public Boolean getFreightShipping() {
    return freightShipping;
  }

  public void setFreightShipping(Boolean freightShipping) {
    this.freightShipping = freightShipping;
  }

  public FulfillmentPolicyRequest globalShipping(Boolean globalShipping) {
    this.globalShipping = globalShipping;
    return this;
  }

  /**
   * This field is included and set to <code>true</code> if the seller wants to use the Global Shipping Program for international shipments. See the <a href=\"https://pages.ebay.com/help/sell/shipping-globally.html \">Global Shipping Program</a> help topic for more details and requirements on the Global Shipping Program.<br/><br/>It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. <br/><br/>If this value is set to <code>false</code> or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in <a href=\"https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \">Setting up worldwide shipping</a>. <br/><br/>Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span><p><b>Default</b>: false</p>
   * @return globalShipping
  */
  
  @Schema(name = "globalShipping", description = "This field is included and set to <code>true</code> if the seller wants to use the Global Shipping Program for international shipments. See the <a href=\"https://pages.ebay.com/help/sell/shipping-globally.html \">Global Shipping Program</a> help topic for more details and requirements on the Global Shipping Program.<br/><br/>It is possible for a seller to use a combination of the Global Shipping Program and other international shipping services. <br/><br/>If this value is set to <code>false</code> or if the field is omitted, the seller is responsible for manually specifying individual international shipping services (if the seller ships internationally)., as described in <a href=\"https://developer.ebay.com/api-docs/sell/static/seller-accounts/ht_shipping-worldwide.html \">Setting up worldwide shipping</a>. <br/><br/>Sellers can opt in or out of the Global Shipping Program through the Shipping preferences in My eBay.<br /><br /><span class=\"tablenote\"><b>Note</b>: On the US marketplace, the <em><b>Global Shipping Program</b></em> is scheduled to be replaced by a new intermediated international shipping program called <em><b>eBay International Shipping</b></em>. US sellers who are opted in to the Global Shipping Program will be automatically opted in to eBay International Shipping when it becomes available to them. All US sellers will be migrated by March 31, 2023. <br /><br />eBay International Shipping is an account level setting, and no field needs to be set in a Fulfillment business policy to enable it. As long as the US seller's account is opted in to eBay International Shipping, this shipping option will be enabled automatically for all listings where international shipping is available. <br /><br />A US seller who is opted in to eBay International Shipping can also specify individual international shipping service options for a Fulfillment business policy.</span><p><b>Default</b>: false</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("globalShipping")
  public Boolean getGlobalShipping() {
    return globalShipping;
  }

  public void setGlobalShipping(Boolean globalShipping) {
    this.globalShipping = globalShipping;
  }

  public FulfillmentPolicyRequest handlingTime(TimeDuration handlingTime) {
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

  public FulfillmentPolicyRequest localPickup(Boolean localPickup) {
    this.localPickup = localPickup;
    return this;
  }

  /**
   * This field should be included and set to <code>true</code> if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.<br/><br/>With local pickup, the buyer and seller make arrangements for pickup time and location.<br/><br/><b>Default</b>: <code>false</code>
   * @return localPickup
  */
  
  @Schema(name = "localPickup", description = "This field should be included and set to <code>true</code> if local pickup is one of the fulfillment options available to the buyer. It is possible for the seller to make local pickup and some shipping service options available to the buyer.<br/><br/>With local pickup, the buyer and seller make arrangements for pickup time and location.<br/><br/><b>Default</b>: <code>false</code>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localPickup")
  public Boolean getLocalPickup() {
    return localPickup;
  }

  public void setLocalPickup(Boolean localPickup) {
    this.localPickup = localPickup;
  }

  public FulfillmentPolicyRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which this fulfillment policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FulfillmentPolicyRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64
   * @return name
  */
  
  @Schema(name = "name", description = "A seller-defined name for this fulfillment policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FulfillmentPolicyRequest pickupDropOff(Boolean pickupDropOff) {
    this.pickupDropOff = pickupDropOff;
    return this;
  }

  /**
   * This field should be included and set to <code>true</code> if the seller offers the \"Click and Collect\" feature for an item. <p>To enable \"Click and Collect\" on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.</p>  <p>In addition to setting this field to <code>true</code>, the merchant must also do the following to enable the \"Click and Collect\" option on a listing: <ul><li>Have inventory for the product at one or more physical stores tied to the merchant's account. <p>Sellers can use the <b>createInventoryLocaion</b> method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.</p></li><li>Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: <ul><li>Set the <b>immediatePay</b> flag in the payment policy to 'true'.</li><li>Have a valid store location with a complete street address.</li></ul></li></ul><p>When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant's stores (that has stock available) will see the \"Available for Click and Collect\" option on the listing, along with information on the closest store that has the item.</p><b>Default</b>: false
   * @return pickupDropOff
  */
  
  @Schema(name = "pickupDropOff", description = "This field should be included and set to <code>true</code> if the seller offers the \"Click and Collect\" feature for an item. <p>To enable \"Click and Collect\" on a listing, a seller must be eligible for Click and Collect. Currently, Click and Collect is available to only large retail merchants selling in the eBay AU and UK marketplaces.</p>  <p>In addition to setting this field to <code>true</code>, the merchant must also do the following to enable the \"Click and Collect\" option on a listing: <ul><li>Have inventory for the product at one or more physical stores tied to the merchant's account. <p>Sellers can use the <b>createInventoryLocaion</b> method in the Inventory API to associate physical stores to their account and they can then can add inventory to specific store locations.</p></li><li>Set an immediate payment requirement on the item. The immediate payment feature requires the seller to: <ul><li>Set the <b>immediatePay</b> flag in the payment policy to 'true'.</li><li>Have a valid store location with a complete street address.</li></ul></li></ul><p>When a merchant successfully lists an item with Click and Collect, prospective buyers within a reasonable distance from one of the merchant's stores (that has stock available) will see the \"Available for Click and Collect\" option on the listing, along with information on the closest store that has the item.</p><b>Default</b>: false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupDropOff")
  public Boolean getPickupDropOff() {
    return pickupDropOff;
  }

  public void setPickupDropOff(Boolean pickupDropOff) {
    this.pickupDropOff = pickupDropOff;
  }

  public FulfillmentPolicyRequest shipToLocations(RegionSet shipToLocations) {
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

  public FulfillmentPolicyRequest shippingOptions(List<@Valid ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public FulfillmentPolicyRequest addShippingOptionsItem(ShippingOption shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
  }

  /**
   * This array is used to provide detailed information on the domestic and international shipping options available for the policy. <br /><br />A separate <b>ShippingOption</b> object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). <ul><li>The <b>optionType</b> field is used to indicate whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field is used to indicate whether flat-rate shipping or calculated shipping will be used.</li> <li>The <b>rateTableId</b> field can be used to associate a defined shipping rate table to the policy, and the <b>packageHandlingCost</b> container can be used to set a handling charge for the policy.</li></ul> <p>A separate <b>ShippingServices</b> object will be used to specify cost and other details for every available domestic and international shipping service option. </p>
   * @return shippingOptions
  */
  @Valid 
  @Schema(name = "shippingOptions", description = "This array is used to provide detailed information on the domestic and international shipping options available for the policy. <br /><br />A separate <b>ShippingOption</b> object is required for domestic shipping service options and for international shipping service options (if the seller ships to international locations). <ul><li>The <b>optionType</b> field is used to indicate whether the <b>ShippingOption</b> object applies to domestic or international shipping, and the <b>costType</b> field is used to indicate whether flat-rate shipping or calculated shipping will be used.</li> <li>The <b>rateTableId</b> field can be used to associate a defined shipping rate table to the policy, and the <b>packageHandlingCost</b> container can be used to set a handling charge for the policy.</li></ul> <p>A separate <b>ShippingServices</b> object will be used to specify cost and other details for every available domestic and international shipping service option. </p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingOptions")
  public List<@Valid ShippingOption> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(List<@Valid ShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentPolicyRequest fulfillmentPolicyRequest = (FulfillmentPolicyRequest) o;
    return Objects.equals(this.categoryTypes, fulfillmentPolicyRequest.categoryTypes) &&
        Objects.equals(this.description, fulfillmentPolicyRequest.description) &&
        Objects.equals(this.freightShipping, fulfillmentPolicyRequest.freightShipping) &&
        Objects.equals(this.globalShipping, fulfillmentPolicyRequest.globalShipping) &&
        Objects.equals(this.handlingTime, fulfillmentPolicyRequest.handlingTime) &&
        Objects.equals(this.localPickup, fulfillmentPolicyRequest.localPickup) &&
        Objects.equals(this.marketplaceId, fulfillmentPolicyRequest.marketplaceId) &&
        Objects.equals(this.name, fulfillmentPolicyRequest.name) &&
        Objects.equals(this.pickupDropOff, fulfillmentPolicyRequest.pickupDropOff) &&
        Objects.equals(this.shipToLocations, fulfillmentPolicyRequest.shipToLocations) &&
        Objects.equals(this.shippingOptions, fulfillmentPolicyRequest.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, description, freightShipping, globalShipping, handlingTime, localPickup, marketplaceId, name, pickupDropOff, shipToLocations, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentPolicyRequest {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    freightShipping: ").append(toIndentedString(freightShipping)).append("\n");
    sb.append("    globalShipping: ").append(toIndentedString(globalShipping)).append("\n");
    sb.append("    handlingTime: ").append(toIndentedString(handlingTime)).append("\n");
    sb.append("    localPickup: ").append(toIndentedString(localPickup)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pickupDropOff: ").append(toIndentedString(pickupDropOff)).append("\n");
    sb.append("    shipToLocations: ").append(toIndentedString(shipToLocations)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Amount;
import org.openapitools.model.ShippingService;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the &lt;b&gt;shippingOptions&lt;/b&gt; array, which is used to provide detailed information on the domestic and international shipping options available for the policy. A separate &lt;b&gt;ShippingOption&lt;/b&gt; object covers domestic shipping service options and international shipping service options (if the seller ships to international locations).
 */

@Schema(name = "ShippingOption", description = "This type is used by the <b>shippingOptions</b> array, which is used to provide detailed information on the domestic and international shipping options available for the policy. A separate <b>ShippingOption</b> object covers domestic shipping service options and international shipping service options (if the seller ships to international locations).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ShippingOption {

  private String costType;

  private Amount insuranceFee;

  private Boolean insuranceOffered;

  private String optionType;

  private Amount packageHandlingCost;

  private String rateTableId;

  private String shippingDiscountProfileId;

  private Boolean shippingPromotionOffered;

  @Valid
  private List<@Valid ShippingService> shippingServices;

  public ShippingOption costType(String costType) {
    this.costType = costType;
    return this;
  }

  /**
   * This field defines whether the shipping cost model is <code>FLAT_RATE</code> (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or <code>CALCULATED</code> (the shipping rate varies by the ship-to location and size and weight of the package). <br/><br/>This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum'>eBay API documentation</a>
   * @return costType
  */
  
  @Schema(name = "costType", description = "This field defines whether the shipping cost model is <code>FLAT_RATE</code> (the same rate for all buyers, or buyers within a region if shipping rate tables are used) or <code>CALCULATED</code> (the shipping rate varies by the ship-to location and size and weight of the package). <br/><br/>This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingCostTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costType")
  public String getCostType() {
    return costType;
  }

  public void setCostType(String costType) {
    this.costType = costType;
  }

  public ShippingOption insuranceFee(Amount insuranceFee) {
    this.insuranceFee = insuranceFee;
    return this;
  }

  /**
   * Get insuranceFee
   * @return insuranceFee
  */
  @Valid 
  @Schema(name = "insuranceFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insuranceFee")
  public Amount getInsuranceFee() {
    return insuranceFee;
  }

  public void setInsuranceFee(Amount insuranceFee) {
    this.insuranceFee = insuranceFee;
  }

  public ShippingOption insuranceOffered(Boolean insuranceOffered) {
    this.insuranceOffered = insuranceOffered;
    return this;
  }

  /**
   * This field has been deprecated. <br/><br/>Shipping insurance is offered only via a shipping carrier's shipping services and is no longer available via eBay shipping policies.
   * @return insuranceOffered
  */
  
  @Schema(name = "insuranceOffered", description = "This field has been deprecated. <br/><br/>Shipping insurance is offered only via a shipping carrier's shipping services and is no longer available via eBay shipping policies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insuranceOffered")
  public Boolean getInsuranceOffered() {
    return insuranceOffered;
  }

  public void setInsuranceOffered(Boolean insuranceOffered) {
    this.insuranceOffered = insuranceOffered;
  }

  public ShippingOption optionType(String optionType) {
    this.optionType = optionType;
    return this;
  }

  /**
   * This field is used to indicate if the corresponding shipping service options (under <b>shippingServices</b> array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>
   * @return optionType
  */
  
  @Schema(name = "optionType", description = "This field is used to indicate if the corresponding shipping service options (under <b>shippingServices</b> array) are domestic or international shipping service options. This field is conditionally required if any shipping service options are specified (domestic and/or international). For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionType")
  public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }

  public ShippingOption packageHandlingCost(Amount packageHandlingCost) {
    this.packageHandlingCost = packageHandlingCost;
    return this;
  }

  /**
   * Get packageHandlingCost
   * @return packageHandlingCost
  */
  @Valid 
  @Schema(name = "packageHandlingCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageHandlingCost")
  public Amount getPackageHandlingCost() {
    return packageHandlingCost;
  }

  public void setPackageHandlingCost(Amount packageHandlingCost) {
    this.packageHandlingCost = packageHandlingCost;
  }

  public ShippingOption rateTableId(String rateTableId) {
    this.rateTableId = rateTableId;
    return this;
  }

  /**
   * This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The <a href=\"/api-docs/sell/account/resources/rate_table/methods/getRateTables\">getRateTables</a> method can be used to retrieve shipping rate table IDs.<br/><br/>With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to additional per-weight and handling charges.<br/><br/>Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. <br /><br />For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the <b>shippingServices</b> array.<br/><br/>This field is returned if set.
   * @return rateTableId
  */
  
  @Schema(name = "rateTableId", description = "This field is used if the seller wants to associate a domestic or international shipping rate table to the fulfillment business policy. The <a href=\"/api-docs/sell/account/resources/rate_table/methods/getRateTables\">getRateTables</a> method can be used to retrieve shipping rate table IDs.<br/><br/>With domestic and international shipping rate tables, the seller can set different shipping costs based on shipping regions and shipping speed/level of service (one-day, expedited, standard, economy). There are also options to additional per-weight and handling charges.<br/><br/>Sellers need to be careful that shipping rate tables match the corresponding shipping service options. In other words, a domestic shipping rate table must not be specified in the same container where international shipping service options are being specified, and vice versa, and the shipping speed/level of service of the provided shipping service options should match the shipping speed/level of service options that are defined in the shipping rate tables. <br /><br />For example, if the corresponding shipping rate table defines costs for one-day shipping services, there should be at least one one-day shipping service option specified under the <b>shippingServices</b> array.<br/><br/>This field is returned if set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTableId")
  public String getRateTableId() {
    return rateTableId;
  }

  public void setRateTableId(String rateTableId) {
    this.rateTableId = rateTableId;
  }

  public ShippingOption shippingDiscountProfileId(String shippingDiscountProfileId) {
    this.shippingDiscountProfileId = shippingDiscountProfileId;
    return this;
  }

  /**
   * This field is the unique identifier of a seller's domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. <br /><br />The seller can create and manage shipping discount profiles using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>
   * @return shippingDiscountProfileId
  */
  
  @Schema(name = "shippingDiscountProfileId", description = "This field is the unique identifier of a seller's domestic or international shipping discount profile. If a buyer satisfies the requirements of the discount rule, this buyer will receive a shipping discount for the order. <br /><br />The seller can create and manage shipping discount profiles using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingDiscountProfileId")
  public String getShippingDiscountProfileId() {
    return shippingDiscountProfileId;
  }

  public void setShippingDiscountProfileId(String shippingDiscountProfileId) {
    this.shippingDiscountProfileId = shippingDiscountProfileId;
  }

  public ShippingOption shippingPromotionOffered(Boolean shippingPromotionOffered) {
    this.shippingPromotionOffered = shippingPromotionOffered;
    return this;
  }

  /**
   * This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. <br/><br/>The seller can create and manage shipping promotional discounts using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>
   * @return shippingPromotionOffered
  */
  
  @Schema(name = "shippingPromotionOffered", description = "This boolean indicates whether or not the seller has set up a promotional shipping discount that will be available to buyers who satisfy the requirements of the shipping discount rule. <br/><br/>The seller can create and manage shipping promotional discounts using (Get/Set) <b>ShippingDiscountProfiles</b> calls in the <b>Trading API</b> or through the <b>Shipping Preferences</b> in <b>My eBay</b>. <br/><br/><span class=\"tablenote\"><b>Note: </b>Initially, shipping discount profiles in the <b>Account API</b> will <i>not</i> be available to all sellers.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingPromotionOffered")
  public Boolean getShippingPromotionOffered() {
    return shippingPromotionOffered;
  }

  public void setShippingPromotionOffered(Boolean shippingPromotionOffered) {
    this.shippingPromotionOffered = shippingPromotionOffered;
  }

  public ShippingOption shippingServices(List<@Valid ShippingService> shippingServices) {
    this.shippingServices = shippingServices;
    return this;
  }

  public ShippingOption addShippingServicesItem(ShippingService shippingServicesItem) {
    if (this.shippingServices == null) {
      this.shippingServices = new ArrayList<>();
    }
    this.shippingServices.add(shippingServicesItem);
    return this;
  }

  /**
   * This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding <b>shippingOptions.optionType</b> field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) <br/><br/>Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate <b>shippingService</b> containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. <br/><br/> See <a href=\"/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html\" target=\"_blank\">How to set up shipping carrier and shipping service values</a>. <br /><br />To use the eBay standard envelope service (eSE), see <a href=\"/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\" target=\"_blank\">Using eBay standard envelope (eSE) service</a>.<br /><br />This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.
   * @return shippingServices
  */
  @Valid 
  @Schema(name = "shippingServices", description = "This array consists of the domestic or international shipping services options that are defined for the policy. The shipping service options defined under this array should match what is set in the corresponding <b>shippingOptions.optionType</b> field (which controls whether domestic or international shipping service options are being defined). If a shipping rate table is being used, the specified shipping service options should also match the shipping rate table settings (domestic or international, shipping speed/level of service, etc.) <br/><br/>Sellers can specify up to four domestic shipping services and up to five international shipping service options by using separate <b>shippingService</b> containers for each. If the seller is using the Global Shipping Program as an international option, only a total of four international shipping service options (including GSP) can be offered. <br/><br/> See <a href=\"/api-docs/sell/static/seller-accounts/ht_shipping-setting-shipping-carrier-and-service-values.html\" target=\"_blank\">How to set up shipping carrier and shipping service values</a>. <br /><br />To use the eBay standard envelope service (eSE), see <a href=\"/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\" target=\"_blank\">Using eBay standard envelope (eSE) service</a>.<br /><br />This array is conditionally required if the seller is offering one or more domestic and/or international shipping service options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingServices")
  public List<@Valid ShippingService> getShippingServices() {
    return shippingServices;
  }

  public void setShippingServices(List<@Valid ShippingService> shippingServices) {
    this.shippingServices = shippingServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOption shippingOption = (ShippingOption) o;
    return Objects.equals(this.costType, shippingOption.costType) &&
        Objects.equals(this.insuranceFee, shippingOption.insuranceFee) &&
        Objects.equals(this.insuranceOffered, shippingOption.insuranceOffered) &&
        Objects.equals(this.optionType, shippingOption.optionType) &&
        Objects.equals(this.packageHandlingCost, shippingOption.packageHandlingCost) &&
        Objects.equals(this.rateTableId, shippingOption.rateTableId) &&
        Objects.equals(this.shippingDiscountProfileId, shippingOption.shippingDiscountProfileId) &&
        Objects.equals(this.shippingPromotionOffered, shippingOption.shippingPromotionOffered) &&
        Objects.equals(this.shippingServices, shippingOption.shippingServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costType, insuranceFee, insuranceOffered, optionType, packageHandlingCost, rateTableId, shippingDiscountProfileId, shippingPromotionOffered, shippingServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOption {\n");
    sb.append("    costType: ").append(toIndentedString(costType)).append("\n");
    sb.append("    insuranceFee: ").append(toIndentedString(insuranceFee)).append("\n");
    sb.append("    insuranceOffered: ").append(toIndentedString(insuranceOffered)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    packageHandlingCost: ").append(toIndentedString(packageHandlingCost)).append("\n");
    sb.append("    rateTableId: ").append(toIndentedString(rateTableId)).append("\n");
    sb.append("    shippingDiscountProfileId: ").append(toIndentedString(shippingDiscountProfileId)).append("\n");
    sb.append("    shippingPromotionOffered: ").append(toIndentedString(shippingPromotionOffered)).append("\n");
    sb.append("    shippingServices: ").append(toIndentedString(shippingServices)).append("\n");
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


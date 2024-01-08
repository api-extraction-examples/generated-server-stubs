package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Amount;
import org.openapitools.model.RegionSet;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the &lt;b&gt;shippingServices&lt;/b&gt; array, an array that provides details about every domestic and international shipping service option that is defined for the policy.
 */

@Schema(name = "ShippingService", description = "This type is used by the <b>shippingServices</b> array, an array that provides details about every domestic and international shipping service option that is defined for the policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ShippingService {

  private Amount additionalShippingCost;

  private Boolean buyerResponsibleForPickup;

  private Boolean buyerResponsibleForShipping;

  private Amount cashOnDeliveryFee;

  private Boolean freeShipping;

  private RegionSet shipToLocations;

  private String shippingCarrierCode;

  private Amount shippingCost;

  private String shippingServiceCode;

  private Integer sortOrder;

  private Amount surcharge;

  public ShippingService additionalShippingCost(Amount additionalShippingCost) {
    this.additionalShippingCost = additionalShippingCost;
    return this;
  }

  /**
   * Get additionalShippingCost
   * @return additionalShippingCost
  */
  @Valid 
  @Schema(name = "additionalShippingCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalShippingCost")
  public Amount getAdditionalShippingCost() {
    return additionalShippingCost;
  }

  public void setAdditionalShippingCost(Amount additionalShippingCost) {
    this.additionalShippingCost = additionalShippingCost;
  }

  public ShippingService buyerResponsibleForPickup(Boolean buyerResponsibleForPickup) {
    this.buyerResponsibleForPickup = buyerResponsibleForPickup;
    return this;
  }

  /**
   * This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false
   * @return buyerResponsibleForPickup
  */
  
  @Schema(name = "buyerResponsibleForPickup", description = "This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to pick up the purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerResponsibleForPickup")
  public Boolean getBuyerResponsibleForPickup() {
    return buyerResponsibleForPickup;
  }

  public void setBuyerResponsibleForPickup(Boolean buyerResponsibleForPickup) {
    this.buyerResponsibleForPickup = buyerResponsibleForPickup;
  }

  public ShippingService buyerResponsibleForShipping(Boolean buyerResponsibleForShipping) {
    this.buyerResponsibleForShipping = buyerResponsibleForShipping;
    return this;
  }

  /**
   * This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false
   * @return buyerResponsibleForShipping
  */
  
  @Schema(name = "buyerResponsibleForShipping", description = "This field should be included and set to <code>true</code> for a motor vehicle listing if it will be the buyer's responsibility to arrange for shipment of a purchased motor vehicle after full payment is made. <br /><br />This field is only applicable to motor vehicle listings. In the majority of motor vehicle listings, the seller does make the buyer responsible for pickup or shipment of the vehicle. <br/><br/>This field is returned if set.<br/><br/><b>Default</b>: false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buyerResponsibleForShipping")
  public Boolean getBuyerResponsibleForShipping() {
    return buyerResponsibleForShipping;
  }

  public void setBuyerResponsibleForShipping(Boolean buyerResponsibleForShipping) {
    this.buyerResponsibleForShipping = buyerResponsibleForShipping;
  }

  public ShippingService cashOnDeliveryFee(Amount cashOnDeliveryFee) {
    this.cashOnDeliveryFee = cashOnDeliveryFee;
    return this;
  }

  /**
   * Get cashOnDeliveryFee
   * @return cashOnDeliveryFee
  */
  @Valid 
  @Schema(name = "cashOnDeliveryFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cashOnDeliveryFee")
  public Amount getCashOnDeliveryFee() {
    return cashOnDeliveryFee;
  }

  public void setCashOnDeliveryFee(Amount cashOnDeliveryFee) {
    this.cashOnDeliveryFee = cashOnDeliveryFee;
  }

  public ShippingService freeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
    return this;
  }

  /**
   * This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set.
   * @return freeShipping
  */
  
  @Schema(name = "freeShipping", description = "This field is included and set to <code>true</code> if the seller offers a free shipping option to the buyer. <br /><br />This field can only be included and set to <code>true</code> for the first domestic shipping service option specified in the <b>shippingServices</b> container (it is ignored if set for subsequent shipping services or for any international shipping service option). <br /><br />The first specified shipping service option has a <b>sortOrder</b> value of <code>1</code> or if the <b>sortOrderId</b> field is not used, it is the shipping service option that's specified first in the <b>shippingServices</b> container.<br/><br/>This container is returned if set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freeShipping")
  public Boolean getFreeShipping() {
    return freeShipping;
  }

  public void setFreeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
  }

  public ShippingService shipToLocations(RegionSet shipToLocations) {
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

  public ShippingService shippingCarrierCode(String shippingCarrierCode) {
    this.shippingCarrierCode = shippingCarrierCode;
    return this;
  }

  /**
   * This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set.
   * @return shippingCarrierCode
  */
  
  @Schema(name = "shippingCarrierCode", description = "This field sets/indicates the shipping carrier, such as <code>USPS</code>, <code>FedEx</code>, or <code>UPS</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping carrier enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingCarrierDetails</code>. The enum values for each shipping carriers can be found in each <b>ShippingCarrierDetails.ShippingCarrier</b> field in the response payload.<br/><br/> This field is actually optional, as the shipping carrier is also tied into the <b>shippingServiceCode</b> enum value, and that field is required for every specified shipping service option.<br/><br/>This field is returned if set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingCarrierCode")
  public String getShippingCarrierCode() {
    return shippingCarrierCode;
  }

  public void setShippingCarrierCode(String shippingCarrierCode) {
    this.shippingCarrierCode = shippingCarrierCode;
  }

  public ShippingService shippingCost(Amount shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Get shippingCost
   * @return shippingCost
  */
  @Valid 
  @Schema(name = "shippingCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingCost")
  public Amount getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(Amount shippingCost) {
    this.shippingCost = shippingCost;
  }

  public ShippingService shippingServiceCode(String shippingServiceCode) {
    this.shippingServiceCode = shippingServiceCode;
    return this;
  }

  /**
   * This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set.
   * @return shippingServiceCode
  */
  
  @Schema(name = "shippingServiceCode", description = "This field sets/indicates the domestic or international shipping service option, such as <code>USPSPriority</code>, <code>FedEx2Day</code>, or <code>UPS3rdDay</code>. Although this field uses the <b>string</b> type, the seller must pass in a pre-defined enumeration value here. <br /><br />For a full list of shipping service option enum values for a specified eBay marketplace, the <b>GeteBayDetails</b> call of the <b>Trading API</b> can be used, and the <b>DetailName</b> field's value should be set to <code>ShippingServiceDetails</code>. <br /><br />The enum values for each shipping service option can be found in each <b>ShippingServiceDetails.ShippingService</b> field in the response payload. The seller must make sure that the shipping service option is still valid, which is indicated by a <code>true</code> value in the corresponding <b>ValidForSellingFlow</b> boolean field. International shipping service options are typically returned at the top of the response payload, and are indicated by an <b>InternationalService</b> boolean field that reads <code>true</code>. <br /><br />The <b>InternationalService</b> boolean field is not returned at all for domestic shipping service options. <br/><br/> This field is required for every specified shipping service option.<br/><br/>This field is returned if set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingServiceCode")
  public String getShippingServiceCode() {
    return shippingServiceCode;
  }

  public void setShippingServiceCode(String shippingServiceCode) {
    this.shippingServiceCode = shippingServiceCode;
  }

  public ShippingService sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service).
   * @return sortOrder
  */
  
  @Schema(name = "sortOrder", description = "The integer value set in this field controls the order of the corresponding domestic or international shipping service option in the View Item and Checkout pages. <br/><br/>Sellers can specify up to four domestic shipping services (in four separate <b>shippingService</b> containers), so valid values are 1, 2, 3, and 4. A shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the top of View Item and Checkout pages. Conversely, a shipping service option with a <b>sortOrder</b> value of <code>1</code> appears at the bottom of the list. <br/><br/>Sellers can specify up to five international shipping services (in five separate <b>shippingService</b> containers), so valid values for international shipping services are 1, 2, 3, 4, and 5. Similarly to domestic shipping service options, the <b>sortOrder</b> value of a international shipping service option controls the placement of that shipping service option in the View Item and Checkout pages. <br/><br/>If the <b>sortOrder</b> field is not supplied, the order of domestic and international shipping service options is determined by the order in which they are listed in the API call. <br/><br/><b>Min</b>: 1. <b>Max</b>: 4 (for domestic shipping service) or 5 (for international shipping service).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortOrder")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public ShippingService surcharge(Amount surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Get surcharge
   * @return surcharge
  */
  @Valid 
  @Schema(name = "surcharge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("surcharge")
  public Amount getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Amount surcharge) {
    this.surcharge = surcharge;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingService shippingService = (ShippingService) o;
    return Objects.equals(this.additionalShippingCost, shippingService.additionalShippingCost) &&
        Objects.equals(this.buyerResponsibleForPickup, shippingService.buyerResponsibleForPickup) &&
        Objects.equals(this.buyerResponsibleForShipping, shippingService.buyerResponsibleForShipping) &&
        Objects.equals(this.cashOnDeliveryFee, shippingService.cashOnDeliveryFee) &&
        Objects.equals(this.freeShipping, shippingService.freeShipping) &&
        Objects.equals(this.shipToLocations, shippingService.shipToLocations) &&
        Objects.equals(this.shippingCarrierCode, shippingService.shippingCarrierCode) &&
        Objects.equals(this.shippingCost, shippingService.shippingCost) &&
        Objects.equals(this.shippingServiceCode, shippingService.shippingServiceCode) &&
        Objects.equals(this.sortOrder, shippingService.sortOrder) &&
        Objects.equals(this.surcharge, shippingService.surcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalShippingCost, buyerResponsibleForPickup, buyerResponsibleForShipping, cashOnDeliveryFee, freeShipping, shipToLocations, shippingCarrierCode, shippingCost, shippingServiceCode, sortOrder, surcharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingService {\n");
    sb.append("    additionalShippingCost: ").append(toIndentedString(additionalShippingCost)).append("\n");
    sb.append("    buyerResponsibleForPickup: ").append(toIndentedString(buyerResponsibleForPickup)).append("\n");
    sb.append("    buyerResponsibleForShipping: ").append(toIndentedString(buyerResponsibleForShipping)).append("\n");
    sb.append("    cashOnDeliveryFee: ").append(toIndentedString(cashOnDeliveryFee)).append("\n");
    sb.append("    freeShipping: ").append(toIndentedString(freeShipping)).append("\n");
    sb.append("    shipToLocations: ").append(toIndentedString(shipToLocations)).append("\n");
    sb.append("    shippingCarrierCode: ").append(toIndentedString(shippingCarrierCode)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingServiceCode: ").append(toIndentedString(shippingServiceCode)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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


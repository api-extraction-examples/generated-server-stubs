package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryType;
import org.openapitools.model.InternationalReturnOverrideType;
import org.openapitools.model.TimeDuration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This root container defines a seller&#39;s return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.
 */

@Schema(name = "ReturnPolicyRequest", description = "This root container defines a seller's return business policy for a specific marketplace and category group. This type is used when creating or updating a return business policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ReturnPolicyRequest {

  @Valid
  private List<@Valid CategoryType> categoryTypes;

  private String description;

  private Boolean extendedHolidayReturnsOffered;

  private InternationalReturnOverrideType internationalOverride;

  private String marketplaceId;

  private String name;

  private String refundMethod;

  private String restockingFeePercentage;

  private String returnInstructions;

  private String returnMethod;

  private TimeDuration returnPeriod;

  private String returnShippingCostPayer;

  private Boolean returnsAccepted;

  public ReturnPolicyRequest categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public ReturnPolicyRequest addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value must be set to <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value must be set to <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public ReturnPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReturnPolicyRequest extendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
    this.extendedHolidayReturnsOffered = extendedHolidayReturnsOffered;
    return this;
  }

  /**
   * <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.</p> 
   * @return extendedHolidayReturnsOffered
  */
  
  @Schema(name = "extendedHolidayReturnsOffered", description = "<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. Any value supplied in this field is neither read nor returned.</p> ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedHolidayReturnsOffered")
  public Boolean getExtendedHolidayReturnsOffered() {
    return extendedHolidayReturnsOffered;
  }

  public void setExtendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
    this.extendedHolidayReturnsOffered = extendedHolidayReturnsOffered;
  }

  public ReturnPolicyRequest internationalOverride(InternationalReturnOverrideType internationalOverride) {
    this.internationalOverride = internationalOverride;
    return this;
  }

  /**
   * Get internationalOverride
   * @return internationalOverride
  */
  @Valid 
  @Schema(name = "internationalOverride", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internationalOverride")
  public InternationalReturnOverrideType getInternationalOverride() {
    return internationalOverride;
  }

  public void setInternationalOverride(InternationalReturnOverrideType internationalOverride) {
    this.internationalOverride = internationalOverride;
  }

  public ReturnPolicyRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which this return business policy applies.  For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which this return business policy applies.  For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ReturnPolicyRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64
   * @return name
  */
  
  @Schema(name = "name", description = "A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace. <br/><br/><b>Max length</b>: 64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReturnPolicyRequest refundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * This value indicates the refund method that will be used by the seller for buyer returns.<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> If this field is not included in a return business policy, it will default to MONEY_BACK.</p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>
   * @return refundMethod
  */
  
  @Schema(name = "refundMethod", description = "This value indicates the refund method that will be used by the seller for buyer returns.<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> If this field is not included in a return business policy, it will default to MONEY_BACK.</p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundMethod")
  public String getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public ReturnPolicyRequest restockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
    return this;
  }

  /**
   * <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored.</p>
   * @return restockingFeePercentage
  */
  
  @Schema(name = "restockingFeePercentage", description = "<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restockingFeePercentage")
  public String getRestockingFeePercentage() {
    return restockingFeePercentage;
  }

  public void setRestockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
  }

  public ReturnPolicyRequest returnInstructions(String returnInstructions) {
    this.returnInstructions = returnInstructions;
    return this;
  }

  /**
   * This text-based field provides more details on seller-specified return instructions. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)
   * @return returnInstructions
  */
  
  @Schema(name = "returnInstructions", description = "This text-based field provides more details on seller-specified return instructions. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnInstructions")
  public String getReturnInstructions() {
    return returnInstructions;
  }

  public void setReturnInstructions(String returnInstructions) {
    this.returnInstructions = returnInstructions;
  }

  public ReturnPolicyRequest returnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
    return this;
  }

  /**
   * This field can be used if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
   * @return returnMethod
  */
  
  @Schema(name = "returnMethod", description = "This field can be used if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnMethod")
  public String getReturnMethod() {
    return returnMethod;
  }

  public void setReturnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
  }

  public ReturnPolicyRequest returnPeriod(TimeDuration returnPeriod) {
    this.returnPeriod = returnPeriod;
    return this;
  }

  /**
   * Get returnPeriod
   * @return returnPeriod
  */
  @Valid 
  @Schema(name = "returnPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnPeriod")
  public TimeDuration getReturnPeriod() {
    return returnPeriod;
  }

  public void setReturnPeriod(TimeDuration returnPeriod) {
    this.returnPeriod = returnPeriod;
  }

  public ReturnPolicyRequest returnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
    return this;
  }

  /**
   * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This field is conditionally required if <b>returnsAccepted</b> is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
   * @return returnShippingCostPayer
  */
  
  @Schema(name = "returnShippingCostPayer", description = "This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This field is conditionally required if <b>returnsAccepted</b> is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnShippingCostPayer")
  public String getReturnShippingCostPayer() {
    return returnShippingCostPayer;
  }

  public void setReturnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
  }

  public ReturnPolicyRequest returnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
    return this;
  }

  /**
   * If set to <code>true</code>, the seller accepts returns. <p><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"http://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span></p>
   * @return returnsAccepted
  */
  
  @Schema(name = "returnsAccepted", description = "If set to <code>true</code>, the seller accepts returns. <p><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"http://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span></p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnsAccepted")
  public Boolean getReturnsAccepted() {
    return returnsAccepted;
  }

  public void setReturnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnPolicyRequest returnPolicyRequest = (ReturnPolicyRequest) o;
    return Objects.equals(this.categoryTypes, returnPolicyRequest.categoryTypes) &&
        Objects.equals(this.description, returnPolicyRequest.description) &&
        Objects.equals(this.extendedHolidayReturnsOffered, returnPolicyRequest.extendedHolidayReturnsOffered) &&
        Objects.equals(this.internationalOverride, returnPolicyRequest.internationalOverride) &&
        Objects.equals(this.marketplaceId, returnPolicyRequest.marketplaceId) &&
        Objects.equals(this.name, returnPolicyRequest.name) &&
        Objects.equals(this.refundMethod, returnPolicyRequest.refundMethod) &&
        Objects.equals(this.restockingFeePercentage, returnPolicyRequest.restockingFeePercentage) &&
        Objects.equals(this.returnInstructions, returnPolicyRequest.returnInstructions) &&
        Objects.equals(this.returnMethod, returnPolicyRequest.returnMethod) &&
        Objects.equals(this.returnPeriod, returnPolicyRequest.returnPeriod) &&
        Objects.equals(this.returnShippingCostPayer, returnPolicyRequest.returnShippingCostPayer) &&
        Objects.equals(this.returnsAccepted, returnPolicyRequest.returnsAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, description, extendedHolidayReturnsOffered, internationalOverride, marketplaceId, name, refundMethod, restockingFeePercentage, returnInstructions, returnMethod, returnPeriod, returnShippingCostPayer, returnsAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyRequest {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedHolidayReturnsOffered: ").append(toIndentedString(extendedHolidayReturnsOffered)).append("\n");
    sb.append("    internationalOverride: ").append(toIndentedString(internationalOverride)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    refundMethod: ").append(toIndentedString(refundMethod)).append("\n");
    sb.append("    restockingFeePercentage: ").append(toIndentedString(restockingFeePercentage)).append("\n");
    sb.append("    returnInstructions: ").append(toIndentedString(returnInstructions)).append("\n");
    sb.append("    returnMethod: ").append(toIndentedString(returnMethod)).append("\n");
    sb.append("    returnPeriod: ").append(toIndentedString(returnPeriod)).append("\n");
    sb.append("    returnShippingCostPayer: ").append(toIndentedString(returnShippingCostPayer)).append("\n");
    sb.append("    returnsAccepted: ").append(toIndentedString(returnsAccepted)).append("\n");
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


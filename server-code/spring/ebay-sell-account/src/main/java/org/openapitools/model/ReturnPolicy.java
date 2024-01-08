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
 * This type is used by the &lt;b&gt;returnPolicy&lt;/b&gt; response container, a container which defines a seller&#39;s return business policy for a specific marketplace.
 */

@Schema(name = "ReturnPolicy", description = "This type is used by the <b>returnPolicy</b> response container, a container which defines a seller's return business policy for a specific marketplace.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class ReturnPolicy {

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

  private String returnPolicyId;

  private String returnShippingCostPayer;

  private Boolean returnsAccepted;

  public ReturnPolicy categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public ReturnPolicy addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value will always be <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container indicates which category group that the return policy applies to.<br/><br/><span class=\"tablenote\"><b>Note</b>: Return business policies are not applicable to motor vehicle listings, so the <b>categoryTypes.name</b> value will always be <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public ReturnPolicy description(String description) {
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

  public ReturnPolicy extendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
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

  public ReturnPolicy internationalOverride(InternationalReturnOverrideType internationalOverride) {
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

  public ReturnPolicy marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which this return business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ReturnPolicy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
   * @return name
  */
  
  @Schema(name = "name", description = "A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReturnPolicy refundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * If a seller indicates that they will accept buyer returns, this value will be set to <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>
   * @return refundMethod
  */
  
  @Schema(name = "refundMethod", description = "If a seller indicates that they will accept buyer returns, this value will be set to <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundMethod")
  public String getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public ReturnPolicy restockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
    return this;
  }

  /**
   * <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.</p>
   * @return restockingFeePercentage
  */
  
  @Schema(name = "restockingFeePercentage", description = "<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns. If this field is included, it is ignored and it is no longer returned.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restockingFeePercentage")
  public String getRestockingFeePercentage() {
    return restockingFeePercentage;
  }

  public void setRestockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
  }

  public ReturnPolicy returnInstructions(String returnInstructions) {
    this.returnInstructions = returnInstructions;
    return this;
  }

  /**
   * This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)
   * @return returnInstructions
  */
  
  @Schema(name = "returnInstructions", description = "This text-based field provides more details on seller-specified return instructions. This field is only returned if set for the return business policy. <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is no longer supported on many eBay marketplaces. To see if a marketplace and eBay category does support this field, call <a href=\"/api-docs/sell/metadata/resources/marketplace/methods/getReturnPolicies\">getReturnPolicies</a> method of the <b>Metadata API</b>. Then you will look for the <b>policyDescriptionEnabled</b> field with a value of <code>true</code> for the eBay category.</span></p><br/><b>Max length</b>: 5000 (8000 for DE)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnInstructions")
  public String getReturnInstructions() {
    return returnInstructions;
  }

  public void setReturnInstructions(String returnInstructions) {
    this.returnInstructions = returnInstructions;
  }

  public ReturnPolicy returnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
    return this;
  }

  /**
   * This field is only returned if the seller is willing to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
   * @return returnMethod
  */
  
  @Schema(name = "returnMethod", description = "This field is only returned if the seller is willing to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnMethod")
  public String getReturnMethod() {
    return returnMethod;
  }

  public void setReturnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
  }

  public ReturnPolicy returnPeriod(TimeDuration returnPeriod) {
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

  public ReturnPolicy returnPolicyId(String returnPolicyId) {
    this.returnPolicyId = returnPolicyId;
    return this;
  }

  /**
   * A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.
   * @return returnPolicyId
  */
  
  @Schema(name = "returnPolicyId", description = "A unique eBay-assigned ID for a return business policy. This ID is generated when the policy is created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnPolicyId")
  public String getReturnPolicyId() {
    return returnPolicyId;
  }

  public void setReturnPolicyId(String returnPolicyId) {
    this.returnPolicyId = returnPolicyId;
  }

  public ReturnPolicy returnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
    return this;
  }

  /**
   * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
   * @return returnShippingCostPayer
  */
  
  @Schema(name = "returnShippingCostPayer", description = "This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for SNAD-related issues. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnShippingCostPayer")
  public String getReturnShippingCostPayer() {
    return returnShippingCostPayer;
  }

  public void setReturnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
  }

  public ReturnPolicy returnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
    return this;
  }

  /**
   * If this field is returned as <code>true</code>, the seller accepts returns. <br/><br/><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"https://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span>
   * @return returnsAccepted
  */
  
  @Schema(name = "returnsAccepted", description = "If this field is returned as <code>true</code>, the seller accepts returns. <br/><br/><span class=\"tablenote\"><strong>Note:</strong>Top-Rated sellers must accept item returns and the <b>handlingTime</b> should be set to zero days or one day for a listing to receive a Top-Rated Plus badge on the View Item or search result pages. For more information on eBay's Top-Rated seller program, see <a href=\"https://pages.ebay.com/help/sell/top-rated.html \">Becoming a Top Rated Seller and qualifying for Top Rated Plus benefits</a>.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ReturnPolicy returnPolicy = (ReturnPolicy) o;
    return Objects.equals(this.categoryTypes, returnPolicy.categoryTypes) &&
        Objects.equals(this.description, returnPolicy.description) &&
        Objects.equals(this.extendedHolidayReturnsOffered, returnPolicy.extendedHolidayReturnsOffered) &&
        Objects.equals(this.internationalOverride, returnPolicy.internationalOverride) &&
        Objects.equals(this.marketplaceId, returnPolicy.marketplaceId) &&
        Objects.equals(this.name, returnPolicy.name) &&
        Objects.equals(this.refundMethod, returnPolicy.refundMethod) &&
        Objects.equals(this.restockingFeePercentage, returnPolicy.restockingFeePercentage) &&
        Objects.equals(this.returnInstructions, returnPolicy.returnInstructions) &&
        Objects.equals(this.returnMethod, returnPolicy.returnMethod) &&
        Objects.equals(this.returnPeriod, returnPolicy.returnPeriod) &&
        Objects.equals(this.returnPolicyId, returnPolicy.returnPolicyId) &&
        Objects.equals(this.returnShippingCostPayer, returnPolicy.returnShippingCostPayer) &&
        Objects.equals(this.returnsAccepted, returnPolicy.returnsAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, description, extendedHolidayReturnsOffered, internationalOverride, marketplaceId, name, refundMethod, restockingFeePercentage, returnInstructions, returnMethod, returnPeriod, returnPolicyId, returnShippingCostPayer, returnsAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicy {\n");
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
    sb.append("    returnPolicyId: ").append(toIndentedString(returnPolicyId)).append("\n");
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


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
 * A complex type that is populated with a response containing a return policies.
 */

@Schema(name = "SetReturnPolicyResponse", description = "A complex type that is populated with a response containing a return policies.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SetReturnPolicyResponse {

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

  @Valid
  private List<@Valid Error> warnings;

  public SetReturnPolicyResponse categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public SetReturnPolicyResponse addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This field always returns <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies, since return business policies are not applicable to motor vehicle listings.
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This field always returns <code>ALL_EXCLUDING_MOTORS_VEHICLES</code> for return business policies, since return business policies are not applicable to motor vehicle listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public SetReturnPolicyResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the return business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SetReturnPolicyResponse extendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
    this.extendedHolidayReturnsOffered = extendedHolidayReturnsOffered;
    return this;
  }

  /**
   * <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. This field should no longer be returned.</p> 
   * @return extendedHolidayReturnsOffered
  */
  
  @Schema(name = "extendedHolidayReturnsOffered", description = "<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer supports extended holiday returns. This field should no longer be returned.</p> ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extendedHolidayReturnsOffered")
  public Boolean getExtendedHolidayReturnsOffered() {
    return extendedHolidayReturnsOffered;
  }

  public void setExtendedHolidayReturnsOffered(Boolean extendedHolidayReturnsOffered) {
    this.extendedHolidayReturnsOffered = extendedHolidayReturnsOffered;
  }

  public SetReturnPolicyResponse internationalOverride(InternationalReturnOverrideType internationalOverride) {
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

  public SetReturnPolicyResponse marketplaceId(String marketplaceId) {
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

  public SetReturnPolicyResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64
   * @return name
  */
  
  @Schema(name = "name", description = "A seller-defined name for this return business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SetReturnPolicyResponse refundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * If a seller indicates that they will accept buyer returns, this value will be <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>
   * @return refundMethod
  */
  
  @Schema(name = "refundMethod", description = "If a seller indicates that they will accept buyer returns, this value will be <code>MONEY_BACK</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:RefundMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundMethod")
  public String getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public SetReturnPolicyResponse restockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
    return this;
  }

  /**
   * <p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns.</p>
   * @return restockingFeePercentage
  */
  
  @Schema(name = "restockingFeePercentage", description = "<p class=\"tablenote\"><span  style=\"color: #dd1e31;\"><b>Important!</b></span> This field is deprecated, since eBay no longer allows sellers to charge a restocking fee for buyer remorse returns.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("restockingFeePercentage")
  public String getRestockingFeePercentage() {
    return restockingFeePercentage;
  }

  public void setRestockingFeePercentage(String restockingFeePercentage) {
    this.restockingFeePercentage = restockingFeePercentage;
  }

  public SetReturnPolicyResponse returnInstructions(String returnInstructions) {
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

  public SetReturnPolicyResponse returnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
    return this;
  }

  /**
   * This field will be returned if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
   * @return returnMethod
  */
  
  @Schema(name = "returnMethod", description = "This field will be returned if the seller is willing and able to offer a replacement item as an alternative to 'Money Back'. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnMethod")
  public String getReturnMethod() {
    return returnMethod;
  }

  public void setReturnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
  }

  public SetReturnPolicyResponse returnPeriod(TimeDuration returnPeriod) {
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

  public SetReturnPolicyResponse returnPolicyId(String returnPolicyId) {
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

  public SetReturnPolicyResponse returnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
    return this;
  }

  /**
   * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This container will be returned unless the business policy states that the seller does not accept returns. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
   * @return returnShippingCostPayer
  */
  
  @Schema(name = "returnShippingCostPayer", description = "This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Note that the seller is always responsible for return shipping costs for SNAD-related issues.  <br/><br/>This container will be returned unless the business policy states that the seller does not accept returns. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnShippingCostPayer")
  public String getReturnShippingCostPayer() {
    return returnShippingCostPayer;
  }

  public void setReturnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
  }

  public SetReturnPolicyResponse returnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
    return this;
  }

  /**
   * If set to <code>true</code>, the seller accepts returns. If set to <code>false</code>, this field indicates that the seller does not accept returns.
   * @return returnsAccepted
  */
  
  @Schema(name = "returnsAccepted", description = "If set to <code>true</code>, the seller accepts returns. If set to <code>false</code>, this field indicates that the seller does not accept returns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnsAccepted")
  public Boolean getReturnsAccepted() {
    return returnsAccepted;
  }

  public void setReturnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
  }

  public SetReturnPolicyResponse warnings(List<@Valid Error> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SetReturnPolicyResponse addWarningsItem(Error warningsItem) {
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
    SetReturnPolicyResponse setReturnPolicyResponse = (SetReturnPolicyResponse) o;
    return Objects.equals(this.categoryTypes, setReturnPolicyResponse.categoryTypes) &&
        Objects.equals(this.description, setReturnPolicyResponse.description) &&
        Objects.equals(this.extendedHolidayReturnsOffered, setReturnPolicyResponse.extendedHolidayReturnsOffered) &&
        Objects.equals(this.internationalOverride, setReturnPolicyResponse.internationalOverride) &&
        Objects.equals(this.marketplaceId, setReturnPolicyResponse.marketplaceId) &&
        Objects.equals(this.name, setReturnPolicyResponse.name) &&
        Objects.equals(this.refundMethod, setReturnPolicyResponse.refundMethod) &&
        Objects.equals(this.restockingFeePercentage, setReturnPolicyResponse.restockingFeePercentage) &&
        Objects.equals(this.returnInstructions, setReturnPolicyResponse.returnInstructions) &&
        Objects.equals(this.returnMethod, setReturnPolicyResponse.returnMethod) &&
        Objects.equals(this.returnPeriod, setReturnPolicyResponse.returnPeriod) &&
        Objects.equals(this.returnPolicyId, setReturnPolicyResponse.returnPolicyId) &&
        Objects.equals(this.returnShippingCostPayer, setReturnPolicyResponse.returnShippingCostPayer) &&
        Objects.equals(this.returnsAccepted, setReturnPolicyResponse.returnsAccepted) &&
        Objects.equals(this.warnings, setReturnPolicyResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, description, extendedHolidayReturnsOffered, internationalOverride, marketplaceId, name, refundMethod, restockingFeePercentage, returnInstructions, returnMethod, returnPeriod, returnPolicyId, returnShippingCostPayer, returnsAccepted, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetReturnPolicyResponse {\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CategoryType;
import org.openapitools.model.Deposit;
import org.openapitools.model.PaymentMethod;
import org.openapitools.model.TimeDuration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This root container defines a seller&#39;s payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.
 */

@Schema(name = "PaymentPolicyRequest", description = "This root container defines a seller's payment business policy for a specific marketplace and category group. This type is used when creating or updating a payment business policy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentPolicyRequest {

  @Valid
  private List<@Valid CategoryType> categoryTypes;

  private Deposit deposit;

  private String description;

  private TimeDuration fullPaymentDueIn;

  private Boolean immediatePay;

  private String marketplaceId;

  private String name;

  private String paymentInstructions;

  @Valid
  private List<@Valid PaymentMethod> paymentMethods;

  public PaymentPolicyRequest categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public PaymentPolicyRequest addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container is used to specify whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public PaymentPolicyRequest deposit(Deposit deposit) {
    this.deposit = deposit;
    return this;
  }

  /**
   * Get deposit
   * @return deposit
  */
  @Valid 
  @Schema(name = "deposit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deposit")
  public Deposit getDeposit() {
    return deposit;
  }

  public void setDeposit(Deposit deposit) {
    this.deposit = deposit;
  }

  public PaymentPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentPolicyRequest fullPaymentDueIn(TimeDuration fullPaymentDueIn) {
    this.fullPaymentDueIn = fullPaymentDueIn;
    return this;
  }

  /**
   * Get fullPaymentDueIn
   * @return fullPaymentDueIn
  */
  @Valid 
  @Schema(name = "fullPaymentDueIn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullPaymentDueIn")
  public TimeDuration getFullPaymentDueIn() {
    return fullPaymentDueIn;
  }

  public void setFullPaymentDueIn(TimeDuration fullPaymentDueIn) {
    this.fullPaymentDueIn = fullPaymentDueIn;
  }

  public PaymentPolicyRequest immediatePay(Boolean immediatePay) {
    this.immediatePay = immediatePay;
    return this;
  }

  /**
   * This field should be included and set to <code>true</code> if the seller wants to require immediate payment from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br /><b>Default:</b> False
   * @return immediatePay
  */
  
  @Schema(name = "immediatePay", description = "This field should be included and set to <code>true</code> if the seller wants to require immediate payment from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br /><b>Default:</b> False", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("immediatePay")
  public Boolean getImmediatePay() {
    return immediatePay;
  }

  public void setImmediatePay(Boolean immediatePay) {
    this.immediatePay = immediatePay;
  }

  public PaymentPolicyRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public PaymentPolicyRequest name(String name) {
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

  public PaymentPolicyRequest paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * <p class=\"tablenote\"><b>Note:</b> DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.
   * @return paymentInstructions
  */
  
  @Schema(name = "paymentInstructions", description = "<p class=\"tablenote\"><b>Note:</b> DO NOT USE THIS FIELD. Payment instructions are no longer supported by payment business policies.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstructions")
  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public PaymentPolicyRequest paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentPolicyRequest addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * <p class=\"tablenote\"><b>Note:</b> This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.</p>This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay's platform.
   * @return paymentMethods
  */
  @Valid 
  @Schema(name = "paymentMethods", description = "<p class=\"tablenote\"><b>Note:</b> This field applies only when the seller needs to specify one or more offline payment methods. eBay now manages the electronic payment options available to buyers to pay for the item.</p>This array is used to specify one or more offline payment methods that will be accepted for payment that occurs off of eBay's platform.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethods")
  public List<@Valid PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPolicyRequest paymentPolicyRequest = (PaymentPolicyRequest) o;
    return Objects.equals(this.categoryTypes, paymentPolicyRequest.categoryTypes) &&
        Objects.equals(this.deposit, paymentPolicyRequest.deposit) &&
        Objects.equals(this.description, paymentPolicyRequest.description) &&
        Objects.equals(this.fullPaymentDueIn, paymentPolicyRequest.fullPaymentDueIn) &&
        Objects.equals(this.immediatePay, paymentPolicyRequest.immediatePay) &&
        Objects.equals(this.marketplaceId, paymentPolicyRequest.marketplaceId) &&
        Objects.equals(this.name, paymentPolicyRequest.name) &&
        Objects.equals(this.paymentInstructions, paymentPolicyRequest.paymentInstructions) &&
        Objects.equals(this.paymentMethods, paymentPolicyRequest.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, deposit, description, fullPaymentDueIn, immediatePay, marketplaceId, name, paymentInstructions, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPolicyRequest {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullPaymentDueIn: ").append(toIndentedString(fullPaymentDueIn)).append("\n");
    sb.append("    immediatePay: ").append(toIndentedString(immediatePay)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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


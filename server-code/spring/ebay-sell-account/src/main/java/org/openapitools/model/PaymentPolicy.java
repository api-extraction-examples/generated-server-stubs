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
 * This type is used by the &lt;b&gt;paymentPolicy&lt;/b&gt; response container, a container which defines a seller&#39;s payment business policy for a specific marketplace.
 */

@Schema(name = "PaymentPolicy", description = "This type is used by the <b>paymentPolicy</b> response container, a container which defines a seller's payment business policy for a specific marketplace.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentPolicy {

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

  private String paymentPolicyId;

  public PaymentPolicy categoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
    return this;
  }

  public PaymentPolicy addCategoryTypesItem(CategoryType categoryTypesItem) {
    if (this.categoryTypes == null) {
      this.categoryTypes = new ArrayList<>();
    }
    this.categoryTypes.add(categoryTypesItem);
    return this;
  }

  /**
   * This container indicates whether the fulfillment policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.
   * @return categoryTypes
  */
  @Valid 
  @Schema(name = "categoryTypes", description = "This container indicates whether the fulfillment policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryTypes")
  public List<@Valid CategoryType> getCategoryTypes() {
    return categoryTypes;
  }

  public void setCategoryTypes(List<@Valid CategoryType> categoryTypes) {
    this.categoryTypes = categoryTypes;
  }

  public PaymentPolicy deposit(Deposit deposit) {
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

  public PaymentPolicy description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A seller-defined description of the payment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250
   * @return description
  */
  
  @Schema(name = "description", description = "A seller-defined description of the payment policy. This description is only for the seller's use, and is not exposed on any eBay pages.  <br/><br/><b>Max length</b>: 250", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentPolicy fullPaymentDueIn(TimeDuration fullPaymentDueIn) {
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

  public PaymentPolicy immediatePay(Boolean immediatePay) {
    this.immediatePay = immediatePay;
    return this;
  }

  /**
   * If this field is returned as <code>true</code>, immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer uses the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.
   * @return immediatePay
  */
  
  @Schema(name = "immediatePay", description = "If this field is returned as <code>true</code>, immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer uses the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("immediatePay")
  public Boolean getImmediatePay() {
    return immediatePay;
  }

  public void setImmediatePay(Boolean immediatePay) {
    this.immediatePay = immediatePay;
  }

  public PaymentPolicy marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which the payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which the payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public PaymentPolicy name(String name) {
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

  public PaymentPolicy paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy. <br/><br/><b>Max length</b>: 1000
   * @return paymentInstructions
  */
  
  @Schema(name = "paymentInstructions", description = "Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy. <br/><br/><b>Max length</b>: 1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentInstructions")
  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public PaymentPolicy paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentPolicy addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * This container is returned to show the payment methods that are accepted for the payment business policy.  <br><br>Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported. 
   * @return paymentMethods
  */
  @Valid 
  @Schema(name = "paymentMethods", description = "This container is returned to show the payment methods that are accepted for the payment business policy.  <br><br>Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethods")
  public List<@Valid PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentPolicy paymentPolicyId(String paymentPolicyId) {
    this.paymentPolicyId = paymentPolicyId;
    return this;
  }

  /**
   * A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.
   * @return paymentPolicyId
  */
  
  @Schema(name = "paymentPolicyId", description = "A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentPolicyId")
  public String getPaymentPolicyId() {
    return paymentPolicyId;
  }

  public void setPaymentPolicyId(String paymentPolicyId) {
    this.paymentPolicyId = paymentPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPolicy paymentPolicy = (PaymentPolicy) o;
    return Objects.equals(this.categoryTypes, paymentPolicy.categoryTypes) &&
        Objects.equals(this.deposit, paymentPolicy.deposit) &&
        Objects.equals(this.description, paymentPolicy.description) &&
        Objects.equals(this.fullPaymentDueIn, paymentPolicy.fullPaymentDueIn) &&
        Objects.equals(this.immediatePay, paymentPolicy.immediatePay) &&
        Objects.equals(this.marketplaceId, paymentPolicy.marketplaceId) &&
        Objects.equals(this.name, paymentPolicy.name) &&
        Objects.equals(this.paymentInstructions, paymentPolicy.paymentInstructions) &&
        Objects.equals(this.paymentMethods, paymentPolicy.paymentMethods) &&
        Objects.equals(this.paymentPolicyId, paymentPolicy.paymentPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryTypes, deposit, description, fullPaymentDueIn, immediatePay, marketplaceId, name, paymentInstructions, paymentMethods, paymentPolicyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPolicy {\n");
    sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fullPaymentDueIn: ").append(toIndentedString(fullPaymentDueIn)).append("\n");
    sb.append("    immediatePay: ").append(toIndentedString(immediatePay)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    paymentPolicyId: ").append(toIndentedString(paymentPolicyId)).append("\n");
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


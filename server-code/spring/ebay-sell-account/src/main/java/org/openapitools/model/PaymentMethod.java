package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RecipientAccountReference;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the &lt;b&gt;paymentMethods&lt;/b&gt; container, which is used by the seller to specify one or more offline payment methods. &lt;br /&gt;&lt;br /&gt; &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note&lt;/b&gt;: eBay now controls all electronic payment methods available for a marketplace, so a seller will no longer use this type to specify any electronic payment methods.&lt;/span&gt;
 */

@Schema(name = "PaymentMethod", description = "This type is used by the <b>paymentMethods</b> container, which is used by the seller to specify one or more offline payment methods. <br /><br /> <span class=\"tablenote\"><b>Note</b>: eBay now controls all electronic payment methods available for a marketplace, so a seller will no longer use this type to specify any electronic payment methods.</span>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentMethod {

  @Valid
  private List<String> brands;

  private String paymentMethodType;

  private RecipientAccountReference recipientAccountReference;

  public PaymentMethod brands(List<String> brands) {
    this.brands = brands;
    return this;
  }

  public PaymentMethod addBrandsItem(String brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

  /**
   * <span class=\"tablenote\"><b>Note</b>: This array is no longer applicable and should not be used. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods, including any credit card brands accepted. </span>
   * @return brands
  */
  
  @Schema(name = "brands", description = "<span class=\"tablenote\"><b>Note</b>: This array is no longer applicable and should not be used. eBay now controls all electronic payment methods available for a marketplace, and a seller never has to specify any electronic payment methods, including any credit card brands accepted. </span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brands")
  public List<String> getBrands() {
    return brands;
  }

  public void setBrands(List<String> brands) {
    this.brands = brands;
  }

  public PaymentMethod paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * eBay now controls all electronic payment methods available for a marketplace, so only offline payment method enum values may be used in this field, and offline payment methods will only be applicable to listings that require or support offline payments. See the <b>PaymentMethodTypeEnum</b> type for supported offline payment method enum values. </p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentMethodTypeEnum'>eBay API documentation</a>
   * @return paymentMethodType
  */
  
  @Schema(name = "paymentMethodType", description = "eBay now controls all electronic payment methods available for a marketplace, so only offline payment method enum values may be used in this field, and offline payment methods will only be applicable to listings that require or support offline payments. See the <b>PaymentMethodTypeEnum</b> type for supported offline payment method enum values. </p> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentMethodTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethodType")
  public String getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public PaymentMethod recipientAccountReference(RecipientAccountReference recipientAccountReference) {
    this.recipientAccountReference = recipientAccountReference;
    return this;
  }

  /**
   * Get recipientAccountReference
   * @return recipientAccountReference
  */
  @Valid 
  @Schema(name = "recipientAccountReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recipientAccountReference")
  public RecipientAccountReference getRecipientAccountReference() {
    return recipientAccountReference;
  }

  public void setRecipientAccountReference(RecipientAccountReference recipientAccountReference) {
    this.recipientAccountReference = recipientAccountReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.brands, paymentMethod.brands) &&
        Objects.equals(this.paymentMethodType, paymentMethod.paymentMethodType) &&
        Objects.equals(this.recipientAccountReference, paymentMethod.recipientAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, paymentMethodType, recipientAccountReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    recipientAccountReference: ").append(toIndentedString(recipientAccountReference)).append("\n");
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


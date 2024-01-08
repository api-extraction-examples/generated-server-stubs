package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the base request of the &lt;b&gt;createOrReplaceSalesTax&lt;/b&gt;. 
 */

@Schema(name = "SalesTaxBase", description = "This type is used by the base request of the <b>createOrReplaceSalesTax</b>. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SalesTaxBase {

  private String salesTaxPercentage;

  private Boolean shippingAndHandlingTaxed;

  public SalesTaxBase salesTaxPercentage(String salesTaxPercentage) {
    this.salesTaxPercentage = salesTaxPercentage;
    return this;
  }

  /**
   * This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is set here, such as <code>7.75</code>.
   * @return salesTaxPercentage
  */
  
  @Schema(name = "salesTaxPercentage", description = "This field is used to set the sales tax rate for the tax jurisdiction set in the call URI. When applicable to an order, this sales tax rate will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is set here, such as <code>7.75</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesTaxPercentage")
  public String getSalesTaxPercentage() {
    return salesTaxPercentage;
  }

  public void setSalesTaxPercentage(String salesTaxPercentage) {
    this.salesTaxPercentage = salesTaxPercentage;
  }

  public SalesTaxBase shippingAndHandlingTaxed(Boolean shippingAndHandlingTaxed) {
    this.shippingAndHandlingTaxed = shippingAndHandlingTaxed;
    return this;
  }

  /**
   * This field is set to <code>true</code> if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field's value should be set to <code>false</code>.
   * @return shippingAndHandlingTaxed
  */
  
  @Schema(name = "shippingAndHandlingTaxed", description = "This field is set to <code>true</code> if the seller wishes to apply sales tax to shipping and handling charges, and not just the total sales price of the order. Otherwise, this field's value should be set to <code>false</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingAndHandlingTaxed")
  public Boolean getShippingAndHandlingTaxed() {
    return shippingAndHandlingTaxed;
  }

  public void setShippingAndHandlingTaxed(Boolean shippingAndHandlingTaxed) {
    this.shippingAndHandlingTaxed = shippingAndHandlingTaxed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTaxBase salesTaxBase = (SalesTaxBase) o;
    return Objects.equals(this.salesTaxPercentage, salesTaxBase.salesTaxPercentage) &&
        Objects.equals(this.shippingAndHandlingTaxed, salesTaxBase.shippingAndHandlingTaxed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesTaxPercentage, shippingAndHandlingTaxed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxBase {\n");
    sb.append("    salesTaxPercentage: ").append(toIndentedString(salesTaxPercentage)).append("\n");
    sb.append("    shippingAndHandlingTaxed: ").append(toIndentedString(shippingAndHandlingTaxed)).append("\n");
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


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
 * This type is used to provide sales tax settings for a specific tax jurisdiction.
 */

@Schema(name = "SalesTax", description = "This type is used to provide sales tax settings for a specific tax jurisdiction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SalesTax {

  private String countryCode;

  private String salesTaxJurisdictionId;

  private String salesTaxPercentage;

  private Boolean shippingAndHandlingTaxed;

  public SalesTax countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The country code enumeration value identifies the country to which this sales tax rate applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum'>eBay API documentation</a>
   * @return countryCode
  */
  
  @Schema(name = "countryCode", description = "The country code enumeration value identifies the country to which this sales tax rate applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SalesTax salesTaxJurisdictionId(String salesTaxJurisdictionId) {
    this.salesTaxJurisdictionId = salesTaxJurisdictionId;
    return this;
  }

  /**
   * A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies (for example, a state within the United States).
   * @return salesTaxJurisdictionId
  */
  
  @Schema(name = "salesTaxJurisdictionId", description = "A unique ID that identifies the sales tax jurisdiction to which the sales tax rate applies (for example, a state within the United States).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesTaxJurisdictionId")
  public String getSalesTaxJurisdictionId() {
    return salesTaxJurisdictionId;
  }

  public void setSalesTaxJurisdictionId(String salesTaxJurisdictionId) {
    this.salesTaxJurisdictionId = salesTaxJurisdictionId;
  }

  public SalesTax salesTaxPercentage(String salesTaxPercentage) {
    this.salesTaxPercentage = salesTaxPercentage;
    return this;
  }

  /**
   * The sales tax rate that will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is returned here, such as <code>7.75</code>
   * @return salesTaxPercentage
  */
  
  @Schema(name = "salesTaxPercentage", description = "The sales tax rate that will be applied to sales price. The <b>shippingAndHandlingTaxed</b> value will indicate whether or not sales tax is also applied to shipping and handling charges<br><br>Although it is a string, a percentage value is returned here, such as <code>7.75</code>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesTaxPercentage")
  public String getSalesTaxPercentage() {
    return salesTaxPercentage;
  }

  public void setSalesTaxPercentage(String salesTaxPercentage) {
    this.salesTaxPercentage = salesTaxPercentage;
  }

  public SalesTax shippingAndHandlingTaxed(Boolean shippingAndHandlingTaxed) {
    this.shippingAndHandlingTaxed = shippingAndHandlingTaxed;
    return this;
  }

  /**
   * If returned as <code>true</code>, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.
   * @return shippingAndHandlingTaxed
  */
  
  @Schema(name = "shippingAndHandlingTaxed", description = "If returned as <code>true</code>, sales tax is also applied to shipping and handling charges, and not just the total sales price of the order.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SalesTax salesTax = (SalesTax) o;
    return Objects.equals(this.countryCode, salesTax.countryCode) &&
        Objects.equals(this.salesTaxJurisdictionId, salesTax.salesTaxJurisdictionId) &&
        Objects.equals(this.salesTaxPercentage, salesTax.salesTaxPercentage) &&
        Objects.equals(this.shippingAndHandlingTaxed, salesTax.shippingAndHandlingTaxed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, salesTaxJurisdictionId, salesTaxPercentage, shippingAndHandlingTaxed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTax {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    salesTaxJurisdictionId: ").append(toIndentedString(salesTaxJurisdictionId)).append("\n");
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


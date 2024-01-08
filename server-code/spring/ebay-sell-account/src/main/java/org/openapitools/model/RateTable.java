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
 * This type is used to provide details about each shipping rate table that is returned in the &lt;b&gt;getRateTables&lt;/b&gt; response.
 */

@Schema(name = "RateTable", description = "This type is used to provide details about each shipping rate table that is returned in the <b>getRateTables</b> response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class RateTable {

  private String countryCode;

  private String locality;

  private String name;

  private String rateTableId;

  public RateTable countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * A two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> country code representing the eBay marketplace where the shipping rate table is defined. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum'>eBay API documentation</a>
   * @return countryCode
  */
  
  @Schema(name = "countryCode", description = "A two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> country code representing the eBay marketplace where the shipping rate table is defined. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public RateTable locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * This enumeration value returned here indicates whether the shipping rate table is a domestic or international shipping rate table. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>
   * @return locality
  */
  
  @Schema(name = "locality", description = "This enumeration value returned here indicates whether the shipping rate table is a domestic or international shipping rate table. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ShippingOptionTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public RateTable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The seller-defined name for the shipping rate table.
   * @return name
  */
  
  @Schema(name = "name", description = "The seller-defined name for the shipping rate table.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RateTable rateTableId(String rateTableId) {
    this.rateTableId = rateTableId;
    return this;
  }

  /**
   * A unique eBay-assigned ID for a seller's shipping rate table. These <b>rateTableId</b> values are used to associate shipping rate tables to fulfillment business policies or directly to listings through an add/revise/relist call in the Trading API.
   * @return rateTableId
  */
  
  @Schema(name = "rateTableId", description = "A unique eBay-assigned ID for a seller's shipping rate table. These <b>rateTableId</b> values are used to associate shipping rate tables to fulfillment business policies or directly to listings through an add/revise/relist call in the Trading API.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rateTableId")
  public String getRateTableId() {
    return rateTableId;
  }

  public void setRateTableId(String rateTableId) {
    this.rateTableId = rateTableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTable rateTable = (RateTable) o;
    return Objects.equals(this.countryCode, rateTable.countryCode) &&
        Objects.equals(this.locality, rateTable.locality) &&
        Objects.equals(this.name, rateTable.name) &&
        Objects.equals(this.rateTableId, rateTable.rateTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, locality, name, rateTableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTable {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateTableId: ").append(toIndentedString(rateTableId)).append("\n");
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


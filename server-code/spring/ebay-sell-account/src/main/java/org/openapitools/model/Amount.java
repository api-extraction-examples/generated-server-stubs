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
 * A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both &lt;b&gt;currency&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt; fields are required, and both fields are also always returned for an amount in a response field.
 */

@Schema(name = "Amount", description = "A complex type that describes the value of a monetary amount as represented by a global currency. When passing in an amount in a request payload, both <b>currency</b> and <b>value</b> fields are required, and both fields are also always returned for an amount in a response field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Amount {

  private String currency;

  private String value;

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The base currency applied to the <b>value</b> field to establish a monetary amount.  <br/><br/>The currency is represented as a 3-letter <a href=\"https://www.iso.org/iso-4217-currency-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 4217</a> currency code. For example, the code for the Canadian Dollar is <code>CAD</code>.<br/><br/><b>Default:</b> The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CurrencyCodeEnum'>eBay API documentation</a>
   * @return currency
  */
  
  @Schema(name = "currency", description = "The base currency applied to the <b>value</b> field to establish a monetary amount.  <br/><br/>The currency is represented as a 3-letter <a href=\"https://www.iso.org/iso-4217-currency-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 4217</a> currency code. For example, the code for the Canadian Dollar is <code>CAD</code>.<br/><br/><b>Default:</b> The default currency of the eBay marketplace that hosts the listing. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:CurrencyCodeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Amount value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The monetary amount in the specified <b>currency</b>.
   * @return value
  */
  
  @Schema(name = "value", description = "The monetary amount in the specified <b>currency</b>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.value, amount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


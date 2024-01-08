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
 * Charge
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Charge {

  private Integer amount;

  private String currency;

  private String paymentMethod;

  public Charge() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Charge(Integer amount, String currency, String paymentMethod) {
    this.amount = amount;
    this.currency = currency;
    this.paymentMethod = paymentMethod;
  }

  public Charge amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The line item amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "The line item amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Charge currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the amount
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "The currency for the amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Charge paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method display name.
   * @return paymentMethod
  */
  @NotNull 
  @Schema(name = "payment_method", description = "The payment method display name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payment_method")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.currency, charge.currency) &&
        Objects.equals(this.paymentMethod, charge.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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


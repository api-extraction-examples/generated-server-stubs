package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount {

  private Double amount;

  private String currency;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount(Double amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount value
   * minimum: 0
   * @return amount
  */
  @NotNull @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "amount", example = "100.23", description = "amount value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code
   * @return currency
  */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "currency", example = "GBP", description = "Currency code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount) o;
    return Objects.equals(this.amount, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.amount) &&
        Objects.equals(this.currency, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


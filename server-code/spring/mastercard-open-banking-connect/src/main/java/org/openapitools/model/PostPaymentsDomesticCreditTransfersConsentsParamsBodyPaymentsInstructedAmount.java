package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount {

  private Double amount;

  /**
   * Currency code
   */
  public enum CurrencyEnum {
    GBP("GBP"),
    
    PLN("PLN");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CurrencyEnum currency;

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount(Double amount, CurrencyEnum currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount amount(Double amount) {
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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", example = "GBP", description = "Currency code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
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
    PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount = (PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount) o;
    return Objects.equals(this.amount, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.amount) &&
        Objects.equals(this.currency, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsInstructedAmount {\n");
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


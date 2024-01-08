package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Amount;
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
 * This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.
 */

@Schema(name = "Deposit", description = "This type is used to specify/indicate that an initial deposit is required for a motor vehicle listing.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class Deposit {

  private Amount amount;

  private TimeDuration dueIn;

  @Valid
  private List<@Valid PaymentMethod> paymentMethods;

  public Deposit amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Deposit dueIn(TimeDuration dueIn) {
    this.dueIn = dueIn;
    return this;
  }

  /**
   * Get dueIn
   * @return dueIn
  */
  @Valid 
  @Schema(name = "dueIn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueIn")
  public TimeDuration getDueIn() {
    return dueIn;
  }

  public void setDueIn(TimeDuration dueIn) {
    this.dueIn = dueIn;
  }

  public Deposit paymentMethods(List<@Valid PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public Deposit addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.
   * @return paymentMethods
  */
  @Valid 
  @Schema(name = "paymentMethods", description = "This array is no longer applicable and should not be used since eBay now manages the electronic payment options available to buyers to pay the deposit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Deposit deposit = (Deposit) o;
    return Objects.equals(this.amount, deposit.amount) &&
        Objects.equals(this.dueIn, deposit.dueIn) &&
        Objects.equals(this.paymentMethods, deposit.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, dueIn, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deposit {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueIn: ").append(toIndentedString(dueIn)).append("\n");
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


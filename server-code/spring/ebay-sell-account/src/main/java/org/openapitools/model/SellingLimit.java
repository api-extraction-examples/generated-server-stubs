package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Amount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Type used by the &lt;b&gt;sellingLimit&lt;/b&gt; container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller&#39;s account.
 */

@Schema(name = "SellingLimit", description = "Type used by the <b>sellingLimit</b> container, a container that lists the monthly cap for the quantity of items sold and total sales amount allowed for the seller's account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SellingLimit {

  private Amount amount;

  private Integer quantity;

  public SellingLimit amount(Amount amount) {
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

  public SellingLimit quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * This field shows the monthly cap for total quantity sold allowed for the seller's account. This container may not be returned if a seller does not have a monthly cap for total quantity sold.
   * @return quantity
  */
  
  @Schema(name = "quantity", description = "This field shows the monthly cap for total quantity sold allowed for the seller's account. This container may not be returned if a seller does not have a monthly cap for total quantity sold.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellingLimit sellingLimit = (SellingLimit) o;
    return Objects.equals(this.amount, sellingLimit.amount) &&
        Objects.equals(this.quantity, sellingLimit.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellingLimit {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


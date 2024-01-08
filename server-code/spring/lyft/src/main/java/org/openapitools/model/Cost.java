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
 * Cost
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class Cost {

  private Integer amount;

  private String currency;

  private String description;

  public Cost() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Cost(Integer amount, String currency, String description) {
    this.amount = amount;
    this.currency = currency;
    this.description = description;
  }

  public Cost amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Total price of the ride
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "Total price of the ride", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Cost currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The ISO 4217 currency code for the amount (e.g. USD)
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", description = "The ISO 4217 currency code for the amount (e.g. USD)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Cost description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description for the cost
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "The description for the cost", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cost cost = (Cost) o;
    return Objects.equals(this.amount, cost.amount) &&
        Objects.equals(this.currency, cost.currency) &&
        Objects.equals(this.description, cost.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cost {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


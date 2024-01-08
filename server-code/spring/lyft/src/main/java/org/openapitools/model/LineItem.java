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
 * LineItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class LineItem {

  private Integer amount;

  private String currency;

  private String type;

  public LineItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LineItem(Integer amount, String currency, String type) {
    this.amount = amount;
    this.currency = currency;
    this.type = type;
  }

  public LineItem amount(Integer amount) {
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

  public LineItem currency(String currency) {
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

  public LineItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The line item display name for a charge item
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The line item display name for a charge item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.amount, lineItem.amount) &&
        Objects.equals(this.currency, lineItem.currency) &&
        Objects.equals(this.type, lineItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


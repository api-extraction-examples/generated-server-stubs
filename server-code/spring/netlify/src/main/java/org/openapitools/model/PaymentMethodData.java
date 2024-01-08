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
 * PaymentMethodData
 */

@JsonTypeName("paymentMethod_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class PaymentMethodData {

  private String cardType;

  private String email;

  private String last4;

  public PaymentMethodData cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  */
  
  @Schema(name = "card_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card_type")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public PaymentMethodData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PaymentMethodData last4(String last4) {
    this.last4 = last4;
    return this;
  }

  /**
   * Get last4
   * @return last4
  */
  
  @Schema(name = "last4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last4")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodData paymentMethodData = (PaymentMethodData) o;
    return Objects.equals(this.cardType, paymentMethodData.cardType) &&
        Objects.equals(this.email, paymentMethodData.email) &&
        Objects.equals(this.last4, paymentMethodData.last4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardType, email, last4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodData {\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
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


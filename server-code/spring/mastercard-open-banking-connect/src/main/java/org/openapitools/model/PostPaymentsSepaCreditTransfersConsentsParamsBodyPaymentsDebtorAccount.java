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
 * PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
 */

@JsonTypeName("postPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount {

  private String iban;

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount(String iban) {
    this.iban = iban;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Account IBAN
   * @return iban
  */
  @NotNull @Pattern(regexp = "^[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}$") 
  @Schema(name = "iban", example = "PL45222222222222222222222222", description = "Account IBAN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount postPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount = (PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount) o;
    return Objects.equals(this.iban, postPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsDebtorAccount {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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


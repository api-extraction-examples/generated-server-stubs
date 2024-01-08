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
 * PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsParamsBodyPayments_debtorAgent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent {

  private String identification;

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent(String identification) {
    this.identification = identification;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Debtor agent identification, If localInstrument = 'UK.FasterPayments' and debtorAccount was specified then this needs to be a UK Sort code (6 digits)
   * @return identification
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "identification", example = "", description = "Debtor agent identification, If localInstrument = 'UK.FasterPayments' and debtorAccount was specified then this needs to be a UK Sort code (6 digits)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent = (PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent) o;
    return Objects.equals(this.identification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsDebtorAgent {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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


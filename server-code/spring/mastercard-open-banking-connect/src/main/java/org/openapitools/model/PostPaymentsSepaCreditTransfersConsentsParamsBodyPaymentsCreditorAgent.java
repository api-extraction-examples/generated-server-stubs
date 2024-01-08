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
 * PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
 */

@JsonTypeName("postPaymentsSepaCreditTransfersConsentsParamsBodyPayments_creditorAgent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {

  private String bicfi;

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent(String bicfi) {
    this.bicfi = bicfi;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent bicfi(String bicfi) {
    this.bicfi = bicfi;
    return this;
  }

  /**
   * Creditor FI
   * @return bicfi
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "bicfi", example = "BARCGB22XXX", description = "Creditor FI", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("bicfi")
  public String getBicfi() {
    return bicfi;
  }

  public void setBicfi(String bicfi) {
    this.bicfi = bicfi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent postPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent = (PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) o;
    return Objects.equals(this.bicfi, postPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.bicfi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bicfi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {\n");
    sb.append("    bicfi: ").append(toIndentedString(bicfi)).append("\n");
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


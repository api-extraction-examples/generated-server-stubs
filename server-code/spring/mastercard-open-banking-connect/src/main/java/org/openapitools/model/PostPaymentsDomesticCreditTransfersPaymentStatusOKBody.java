package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsDomesticCreditTransfersPaymentStatusOKBody
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersPaymentStatusOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersPaymentStatusOKBody {

  private PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo;

  private PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments payments;

  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBody(PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBody originalRequestInfo(PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
    return this;
  }

  /**
   * Get originalRequestInfo
   * @return originalRequestInfo
  */
  @NotNull @Valid 
  @Schema(name = "originalRequestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("originalRequestInfo")
  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBody payments(PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @Valid 
  @Schema(name = "payments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payments")
  public PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments getPayments() {
    return payments;
  }

  public void setPayments(PostPaymentsDomesticCreditTransfersPaymentStatusOKBodyPayments payments) {
    this.payments = payments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersPaymentStatusOKBody postPaymentsDomesticCreditTransfersPaymentStatusOKBody = (PostPaymentsDomesticCreditTransfersPaymentStatusOKBody) o;
    return Objects.equals(this.originalRequestInfo, postPaymentsDomesticCreditTransfersPaymentStatusOKBody.originalRequestInfo) &&
        Objects.equals(this.payments, postPaymentsDomesticCreditTransfersPaymentStatusOKBody.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalRequestInfo, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersPaymentStatusOKBody {\n");
    sb.append("    originalRequestInfo: ").append(toIndentedString(originalRequestInfo)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo;
import org.openapitools.model.PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersPaymentStatusOKBody
 */

@JsonTypeName("postPaymentsSepaCreditTransfersPaymentStatusOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersPaymentStatusOKBody {

  private PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo;

  private PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments payments;

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersPaymentStatusOKBody(PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBody originalRequestInfo(PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
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
  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsSepaCreditTransfersPaymentStatusOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBody payments(PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments payments) {
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
  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments getPayments() {
    return payments;
  }

  public void setPayments(PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments payments) {
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
    PostPaymentsSepaCreditTransfersPaymentStatusOKBody postPaymentsSepaCreditTransfersPaymentStatusOKBody = (PostPaymentsSepaCreditTransfersPaymentStatusOKBody) o;
    return Objects.equals(this.originalRequestInfo, postPaymentsSepaCreditTransfersPaymentStatusOKBody.originalRequestInfo) &&
        Objects.equals(this.payments, postPaymentsSepaCreditTransfersPaymentStatusOKBody.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalRequestInfo, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersPaymentStatusOKBody {\n");
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


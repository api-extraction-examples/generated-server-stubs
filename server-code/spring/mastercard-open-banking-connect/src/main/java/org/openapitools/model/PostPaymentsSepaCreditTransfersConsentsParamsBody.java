package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments;
import org.openapitools.model.PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersConsentsParamsBody
 */

@JsonTypeName("postPaymentsSepaCreditTransfersConsentsParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersConsentsParamsBody {

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments payments;

  private PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo requestInfo;

  public PostPaymentsSepaCreditTransfersConsentsParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersConsentsParamsBody(PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments payments, PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
    this.payments = payments;
    this.requestInfo = requestInfo;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBody payments(PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @NotNull @Valid 
  @Schema(name = "payments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payments")
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments getPayments() {
    return payments;
  }

  public void setPayments(PostPaymentsSepaCreditTransfersConsentsParamsBodyPayments payments) {
    this.payments = payments;
  }

  public PostPaymentsSepaCreditTransfersConsentsParamsBody requestInfo(PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  /**
   * Get requestInfo
   * @return requestInfo
  */
  @NotNull @Valid 
  @Schema(name = "requestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestInfo")
  public PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsSepaCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsSepaCreditTransfersConsentsParamsBody postPaymentsSepaCreditTransfersConsentsParamsBody = (PostPaymentsSepaCreditTransfersConsentsParamsBody) o;
    return Objects.equals(this.payments, postPaymentsSepaCreditTransfersConsentsParamsBody.payments) &&
        Objects.equals(this.requestInfo, postPaymentsSepaCreditTransfersConsentsParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersConsentsParamsBody {\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

